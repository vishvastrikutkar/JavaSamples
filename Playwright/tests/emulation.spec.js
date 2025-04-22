import { test, expect, devices } from '@playwright/test';

test.use({
    ...devices['iPhone 14 Plus'],
  });

test('Emulation Test', async ({ page }) => {

    await page.goto('https://www.saucedemo.com/');
    
    // Login with valid credentials
    await page.locator('[data-test="username"]').click();
    await page.locator('[data-test="username"]').fill('standard_user');
    await page.locator('[data-test="password"]').click();
    await page.locator('[data-test="password"]').fill('secret_sauce');
    await page.locator('[data-test="login-button"]').click();

    // Add Items to cart
    await page.locator('[data-test="add-to-cart-sauce-labs-backpack"]').click();
    await page.locator('[data-test="add-to-cart-sauce-labs-bike-light"]').click();
    await page.locator('[data-test="add-to-cart-sauce-labs-bolt-t-shirt"]').click();
    
    // Go to Card
    await page.locator('[data-test="shopping-cart-link"]').click();
    
    // Checkout
    await page.locator('[data-test="checkout"]').click();
  
    // Fill out contact details
    await page.locator('[data-test="firstName"]').click();
    await page.locator('[data-test="firstName"]').fill('vishvas');
    await page.locator('[data-test="firstName"]').press('Tab');
    await page.locator('[data-test="lastName"]').fill('trikutkar');
    await page.locator('[data-test="postalCode"]').click();
    await page.locator('[data-test="postalCode"]').fill('411055');
    await page.locator('[data-test="continue"]').click();
    await page.locator('[data-test="finish"]').click();

    // Place order
    await page.locator('[data-test="complete-header"]').click();

    // Verify success message
    const successMessage = await page.locator('.complete-header').textContent();
    expect(successMessage).toBe('Thank you for your order!');

    // Logout
    await page.getByRole('button', { name: 'Open Menu' }).click();
    await page.locator('[data-test="logout-sidebar-link"]').click();
});