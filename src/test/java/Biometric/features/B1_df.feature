Feature: login biometrik B1

  Scenario: DEFAULT B1
    Given Halaman login biometrik B1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time B1
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    And close browser

  Scenario: PAGI B1
    Given Halaman login biometrik B1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time B1
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG B1
    Given Halaman login biometrik B1
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time B1
    And klik jam manual
    And isi tgl sekarang
    And isi jam siangplus1
    And klik OK
    And close browser

