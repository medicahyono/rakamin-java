Feature: login biometrik R2

  Scenario: DEFAULT R2
    Given Halaman login biometrik R2
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time R2
    And klik jam manual
    And isi tgl sekarang
    And isi jam sekarang
    And klik OK
    And close browser

  Scenario: PAGI R2
    Given Halaman login biometrik R2
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time R2
    And klik jam manual
    And isi tgl sekarang
    And isi jam pagimin1
    And klik OK
    And close browser

  Scenario: SIANG R2
    Given Halaman login biometrik R2
    When masukan username
    And masukan password
    And klik login button
    Then User di halaman utama
    And klik date time R2
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