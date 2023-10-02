@E2E
Feature: Factory Method

  @UI @positive
  Scenario: Login as admin
    Given the user logs into APP with ADMIN capabilities

  @UI @negative
  Scenario: Login with invalid credentials
    Given the user tries to login into APP with INVALID capabilities