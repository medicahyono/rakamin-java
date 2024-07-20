Feature: login biometrik D1

  Scenario: DEFAULT D1
    Given Halaman login biometrik D1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time D1
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    And close browser

  Scenario: PAGI D1
    Given Halaman login biometrik D1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time D1
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG D1
    Given Halaman login biometrik D1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time D1
    And klik jam manual
    And isi tgl sekarang
    And isi jam siangplus1
    And klik OK
    And close browser



