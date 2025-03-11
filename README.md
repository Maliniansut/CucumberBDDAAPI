# CucumberBDDAAPI

Role of Reusable API Helper
The API Helper class (APIHelper.java) is designed to abstract and simplify API requests. Instead of writing API request code inside every step definition, we create reusable methods in the helper class. This keeps our test scripts clean, modular, and maintainable.

Benefits of Using APIHelper
✅ Code Reusability – Avoid duplicate API call logic across multiple tests.
✅ Easy Maintenance – If API headers or authentication changes, we update only the helper.
✅ Readability – Step definitions remain concise and focused on behavior.
✅ Scalability – We can add more methods (GET, PUT, DELETE) as needed.

Role of ConfigReader.java (Configuration Reader)
A ConfigReader.java file is used in Cucumber BDD with Rest Assured to store and retrieve configuration settings like:
✅ Base URL (so we don’t hardcode it in tests)
✅ API Endpoints (to make them dynamic)
✅ Authentication Tokens (to avoid exposing them in test scripts)
✅ Environment Selection (e.g., DEV, QA, PROD)

Why Do We Need a Config Reader?
🔸 Avoid Hardcoding – Instead of writing API URLs directly in tests, store them in config.properties.
🔸 Easier Maintenance – If the API base URL changes, update only config.properties.
🔸 Environment Handling – Switch between DEV, QA, or PROD by changing one variable.
🔸 Security – Sensitive data (e.g., API keys) stays in a separate, controlled location.
