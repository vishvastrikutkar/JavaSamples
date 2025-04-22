const { test,expect } = require('@playwright/test');
const AddCustomerPage = require('../page-objects/AddCustomerPage');
const OpenAccountPage = require('../page-objects/OpenAccountPage');
const CustomersPage = require('../page-objects/CustomersPage');

const bankURL='https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login';

// Extend base test with custom fixtures
const managerTest  = test.extend({
  addCustomerPage: async ({ page }, use) => {
    const addCustomerPage = new AddCustomerPage(page);
    await page.goto(bankURL);
    await page.getByRole('button', { name: 'Bank Manager Login' }).click();
    await use(addCustomerPage);
  },

  openAccountPage: async ({ page }, use) => {
    const openAccountPage = new OpenAccountPage(page);
    await page.goto(bankURL);
    await page.getByRole('button', { name: 'Bank Manager Login' }).click();
    await use(openAccountPage);
  },

  customersPage: async ({ page }, use) => {
    const customersPage = new CustomersPage(page);
    await page.goto(bankURL);
    await page.getByRole('button', { name: 'Bank Manager Login' }).click();
    await use(customersPage);
  },
});

module.exports = managerTest ;