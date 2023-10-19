Feature: Login Page Aplikasi Kasir Aja

  Scenario: Success Login
    Given Halaman login kasir aja
    When Input username
    And Input password
    And Click login button
    Then User in on dashboard page

  Scenario: Failed Logins
    Given Halaman login kasir aja
    When Input username
    And Input Invalid password
    And Click login button
    Then User get error message

