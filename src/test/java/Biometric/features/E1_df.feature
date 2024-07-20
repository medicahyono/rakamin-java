Feature: login biometrik E1

  Scenario: DEFAULT E1
    Given Halaman login biometrik E1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time E1
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    Then User di halaman utama
    Then close browser

  Scenario: PAGI E1
    Given Halaman login biometrik E1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time E1
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG E1
    Given Halaman login biometrik E1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time E1
    And klik jam manual
    And isi tgl sekarang
    And isi jam siangplus1
    And klik OK
    And close browser


