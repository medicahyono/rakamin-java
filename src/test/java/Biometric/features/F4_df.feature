Feature: login biometrik F4

  Scenario: DEFAULT F4
    Given Halaman login biometrik F4
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time F4
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    And close browser

  Scenario: PAGI F4
    Given Halaman login biometrik F4
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time F4
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG F4
    Given Halaman login biometrik F4
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time F4
    And klik jam manual
    And isi tgl sekarang
    And isi jam siangplus1
    And klik OK
    And close browser




    #And klik OK-popup

    #And Halaman login biometrik
    #And masukan username
    #And masukan password
    #And klik login button
    #And klik reboot