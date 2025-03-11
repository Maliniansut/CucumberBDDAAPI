Feature: Verify email and password

  Scenario Outline: Verify Rest API Post Call
    Given create a user with "<url>" with "<user>" and "<pass>"
    Then Response code should be "<responseCode>"

    Examples:
      | url                                        | user          | pass     | responseCode |
      | https://reqres.in/api/register/preprod     | abc@gmail.com | Test@123 | 201          |
