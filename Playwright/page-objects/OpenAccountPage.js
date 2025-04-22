class OpenAccountPage {
    constructor(page) {
      this.page = page;
      this.openAccountButton = this.page.getByRole('button', { name: 'Open Account' });
      this.customerSelect = this.page.locator('#userSelect');
      this.currencySelect = this.page.locator('#currency');
      this.submitButton = this.page.getByRole('button', { name: 'Process' });
    }
  
    async openAccount(customerName, currency) {
      await this.openAccountButton.click();
      await this.customerSelect.click();
      await this.page.waitForTimeout(500);
      await this.customerSelect.selectOption(customerName);
      await this.currencySelect.click();
      await this.page.waitForTimeout(500);
      await this.currencySelect.selectOption(currency);
      await this.submitButton.click();

      console.log('Customer added successfully') 
    }
  }
  
  module.exports = OpenAccountPage;