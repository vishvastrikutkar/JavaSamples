// @ts-check
const { test, expect } = require('@playwright/test');

// This will run all tests from this file in parallel.
test.describe.configure({mode: 'parallel'});

test('has title', async ({ page }) => {
  await page.goto('https://playwright.dev/');

  // Expect a title "to contain" a substring.
  await expect(page).toHaveTitle(/Playwright/);
});

test('get started link', async ({ page }) => {
  await page.goto('https://playwright.dev/');

  // Click the get started link.
  await page.getByRole('link', { name: 'Get started' }).click();

  // Expects page to have a heading with the name of Installation.
  await expect(page.getByRole('heading', { name: 'Installation' })).toBeVisible();
});

test('Open Playwright Official Website', async ({ page }) => {
  await page.goto('https://www.google.com/');

  // Expect a title "to contain" a substring.
    await expect(page).toHaveTitle(/Google/);

    // Fill the search input with 'Playwright'
    await page.fill('textarea[name="q"]', 'Playwright');

    // Press the Enter key
    await page.press('textarea[name="q"]', 'Enter');

    // Use a CSS selector to click the official Playwright link
    await page.click('a[href="https://playwright.dev/"]');

    // Click the get started link.
      await expect(page.getByRole('link', { name: 'Get started' })).toBeVisible();
      
});
