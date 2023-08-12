@tag
Feature: Title of your feature
  I want to use this template for my feature file

  @SL.01-001
  Scenario: Login dengan mengosongkan username dan password
    Given I go to Login Page
    When I set credential
    Then Failed login

  @SL.01-002
  Scenario: Login dengan mengkosongkan username
    When I empty username, and fill "secret_sauce" as password

  @SL.01-003
  Scenario: Login dengan mengosongkan password
    When I input "standard_user" as username, and empty password

  @SL.01-004
  Scenario: Login dengan mengisi password yang tidak terdaftar
    When I input invalid "standard_usr" as username, invalid "secret_saue" as password

  @SL.01-006
  Scenario: Positive login
    When I input "standard_user" as username, "secret_sauce" as password
    Then Login Success
