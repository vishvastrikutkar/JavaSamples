import { test, expect } from '@playwright/test';

test.describe.serial("Playwright API Tests ", ()=>{

  // Global Varibles 
  let userId;
  
  // Define the user request data
  const requestBody = {
    name: 'TestingUser',
    gender: 'male',
    status: 'active',
    email: `TestingUser${Math.random().toString(20).substring(2, 15)}@example.com`,
  };

  // Define the base URL and authorization token
  const baseURL = 'https://gorest.co.in/public/v2';
  const authToken = 'Bearer 261f81de55c567c500a4fba73192f46978081fcf96d64cca539616ed5449c730';


test('Create a new user', async ({ request }) => {
  
  // Send a POST request to create a new user
  const response = await request.post(`${baseURL}/users`, {
    headers: {
      Authorization: authToken,
      'Content-Type': 'application/json', // Ensure the content type is set
    },
    data: requestBody,
  });

  const responseBody = await response.json();
  
  // Print POST Response and status code
  console.log('Response:', responseBody);
  console.log('Response status code:', response.status());

  // Verify POST response status and message
  expect(response.status()).toBe(201);
  expect(responseBody).toMatchObject(requestBody);
 
  // Store the user ID for GET Request
  userId = responseBody.id;
 });

test('API Demo for GET method', async ({ request }) => { 
  
  console.log('User ID: ',userId);
  console.log(`${baseURL}/users/${userId}`)

  // Perform a GET request using the user ID
  const getResponse = await request.get(`${baseURL}/users/${userId}`);
 
  // Print GET response status and message
  const getResponseBody = await getResponse.json();
  console.log('GET Response:', getResponseBody);
  console.log('Response:', getResponse.status());
  
  // Verify GET response status and message
  expect(getResponse.status()).toBe(200);
  expect(getResponseBody).toMatchObject(requestBody);
  
}); 


});