class CustomersPage {
    constructor(page) {
      this.page = page;
      this.customersButton = this.page.getByRole('button', { name: 'Customers' });
      this.customerTable = this.page.locator('.table tbody');
      this.searchCust = page.locator('//*[@Placeholder = "Search Customer"]');
    }
  
    async searchCustomer(firstName, lastName) {
        await this.customersButton.click();
        await this.searchCust.click();
        await this.searchCust.fill(firstName);

      const customerRow = this.customerTable.locator('tr', { hasText: `${firstName} ${lastName}` });
      
      return customerRow.isVisible();

    }
  }
  
  module.exports = CustomersPage;