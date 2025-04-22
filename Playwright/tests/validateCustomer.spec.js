const managerTest = require('../fixtures/managerFixture');
const customerDetails = require('../fixtures/customerDetails.json');

managerTest('Validate that the customer is added successfully', async ({ customersPage }) => {
  const { firstName, lastName } = customerDetails;
  const isCustomerVisible = await customersPage.searchCustomer(firstName, lastName);
  expect(isCustomerVisible).toBeTruthy();
});
