Feature: login biometrik Gz

  Scenario: DEFAULT GZ
    Given Halaman login biometrik Gz
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time Gz
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    And close browser

  Scenario: PAGI GZ
    Given Halaman login biometrik Gz
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time Gz
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG GZ
    Given Halaman login biometrik Gz
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time Gz
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