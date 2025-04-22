class AddCustomerPage {
    constructor(page){
        this.page=page;
        this.addCustomerButton = this.page.getByRole('button', { name: 'Add Customer' });
        this.firstNameInput = this.page.getByPlaceholder('First Name');
        this.lastNameInput = this.page.getByPlaceholder('Last Name');
        this.postcodeInput = this.page.getByPlaceholder('Post Code');
        this.submitButton = this.page.getByRole('form').getByRole('button', { name: 'Add Customer' });
        
    }
    async addCustomer(firstName, lastName, postcode) {
        await this.addCustomerButton.click();
        
        await this.firstNameInput.fill(firstName);
        
        await this.lastNameInput.fill(lastName);
        
        await this.postcodeInput.fill(postcode);
        

        await this.submitButton.click();
        // Adding wait for the alerts
        await this.page.waitForTimeout(1000);
        console.log('Customer added successfully') 
        
      }
}
module.exports=AddCustomerPage;