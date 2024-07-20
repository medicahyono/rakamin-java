Feature: login biometrik F1

  Scenario: DEFAULT F1
    Given Halaman login biometrik F1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time F1
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    And close browser

  Scenario: PAGI F1
    Given Halaman login biometrik F1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time F1
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG F1
    Given Halaman login biometrik F1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time F1
    And klik jam manual
    And isi tgl sekarang
    And isi jam siangplus1
    And klik OK
    And close browser



