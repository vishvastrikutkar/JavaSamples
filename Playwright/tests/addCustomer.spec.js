import { expect } from '../fixtures/managerFixture';
import managerTest from '../fixtures/managerFixture';
import customerDetails from '../fixtures/customerDetails.json';

managerTest.describe.serial("Module 5", async (page) => {

managerTest('Add a new customer using Manager fixture', async ({ addCustomerPage,openAccountPage,customersPage }) => {
    const { firstName, lastName, postcode } = customerDetails;
    await addCustomerPage.addCustomer(firstName, lastName, postcode);

    const customerName = `${firstName} ${lastName}`;
    console.log(customerName);
    await openAccountPage.openAccount(customerName, 'Dollar');

    const isCustomerVisible = await customersPage.searchCustomer(firstName, lastName);
    expect(isCustomerVisible).toBeTruthy();
    console.log('Customer Searched successfully')
  
});
});