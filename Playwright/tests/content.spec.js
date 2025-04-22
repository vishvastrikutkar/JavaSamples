// @ts-check
const { test, expect } = require('@playwright/test');

test('contact us ultimate QA', async ({ page }) => {
    
    // Navigate to Ultimate QA Webpage
    await page.goto('https://ultimateqa.com/');
  
    // Expect a title "ultimate QA" a substring.
    await expect(page).toHaveTitle(/Ultimate QA/);

    // Click the get started link.
    await page.hover('text=About')
    await page.click('a:has-text("Contact Us")');

    // Fill contact details 
    await page.fill('input[name="et_pb_contact_name_0"]', 'Jon Doe');
    await page.fill('input[name="et_pb_contact_email_0"]', 'johndoe1@gmail.com');
    await page.fill('textarea[name="et_pb_contact_message_0"]', 'This is a test message.');

    // Click on "Send Message"
    await page.click('button.et_pb_contact_submit');

    // 4. Verify Thank you message
    await page.waitForSelector('.et-pb-contact-message p', { state: 'visible' });

    const thankYouMessage = await page.innerText('.et-pb-contact-message p');

    expect(thankYouMessage).toContain('Thanks for contacting us');
    //expect(thankYouMessage).toContain('You must be a human to submit this form.');
    
  });