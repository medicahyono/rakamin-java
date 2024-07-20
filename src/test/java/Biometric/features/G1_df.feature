Feature: login biometrik G1

  Scenario: DEFAULT G1
    Given Halaman login biometrik G1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time G1
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    And close browser

  Scenario: PAGI G1
    Given Halaman login biometrik G1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time G1
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG G1
    Given Halaman login biometrik G1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time G1
    And klik jam manual
    And isi tgl sekarang
    And isi jam siangplus1
    And klik OK
    And close browser


