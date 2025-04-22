// @ts-check
const { test, expect } = require('@playwright/test');

const bankURL='https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login'

// This will run all tests from this file in parallel.
test.describe.configure({mode: 'parallel'});


// Helper function for customer login
async function customerLogin(page, customerName) {
    // Navigate to the demo Banking site
    await page.goto(bankURL);
  
    // Click on Customer Login
    await page.getByRole('button', { name: 'Customer Login' }).click();
  
    // Select user from Your Name dropdown and click Login
    await page.locator('#userSelect').selectOption(customerName);
    await page.getByRole('button', { name: 'Login' }).click();
    await page.waitForTimeout(3000); // Waits for 3 seconds

  }

  // Helper function for reset Transaction
async function resetTransaction(page) {
    // Click on Transaction and reset if there are any existing transactions
    await page.waitForSelector('button', { name: 'Transations ', state: 'visible'});
    await page.getByRole('button', { name: 'Transactions ' }).click();
    
    await page.waitForTimeout(2000); // Waits for 3 seconds
    //await page.waitForSelector('button', { name: 'Reset', state: 'visible'});
    if (await page.getByRole('button', { name: 'Reset' }).isVisible()) {
        console.log('Clicked Reset button');
      await page.getByRole('button', { name: 'Reset' }).click();
    }
    await page.waitForTimeout(2000);
    //await page.waitForSelector('button', { name: 'Back', state: 'visible'});
    await page.getByRole('button', { name: 'Back' }).click();
  }


// Scenario 1: Perform withdraw with zero balance
test('Withdraw with zero balance', async ({ page }) => {
    
    await customerLogin(page, 'Hermoine Granger');

    await resetTransaction(page);

    // Navigate to Withdraw page
    await page.getByRole('button', { name: 'Withdrawl' }).click();

    // Enter amount to be Withdrawn and click Withdraw button
    await page.getByPlaceholder('amount').fill('100');
    await page.getByRole('button', { name: 'Withdraw', exact: true }).click();

    // Verify the error message is displayed
    const errorMessage = await page.getByText('Transaction Failed. You can not withdraw amount more than the balance').textContent();
    // @ts-ignore
    expect(errorMessage.trim()).toBe('Transaction Failed. You can not withdraw amount more than the balance.');
    
  });

  // Scenario 2: Add deposit to the account
  test('Add deposit to the account', async ({ page }) => {
    
    await customerLogin(page, 'Harry Potter');

    // Click on Deposit
    await page.getByRole('button', { name: 'Deposit' }).click();

    // Enter amount to be Deposited and click Deposit
    await page.getByPlaceholder('amount').fill('1000');
    await page.getByRole('form').getByRole('button', { name: 'Deposit' }).click();

    // Verify the amount added in the Balance section
    const balance = await page.locator('.center > strong:nth-child(2)').textContent();
    // @ts-ignore
    expect(balance.trim()).toBe('1000');
  });