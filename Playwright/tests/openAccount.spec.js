const managerTest = require('../fixtures/managerFixture');
const customerDetails = require('../fixtures/customerDetails.json');

managerTest('Open a new account for the customer using Manager fixture', async ({ openAccountPage }) => {
  const { firstName, lastName } = customerDetails;
  const customerName = `${firstName} ${lastName}`;
  await openAccountPage.openAccount(customerName, 'Dollar');

  // Verify alert message
  //const alertMessage = await openAccountPage.page.evaluate(() => window.alert.arguments[0]);
  //expect(alertMessage).toContain('Account created successfully');
});
