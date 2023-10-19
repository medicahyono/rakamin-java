Feature: Pelanggan memesan makan malam di restoran
  Scenario : Success
Given Pelanggan sedang duduk di meja restoran
When Pelanggan melihat menu dan memesan makanan dan minuman
And Pelayan mengambil pesanan dan memberikannya ke dapur
And Dapur memasak makanan dan minuman yang dipesan
Then Makanan dan minuman disajikan ke pelanggan
And Pelanggan menikmati makanannya
And Pelanggan membayar tagihannya sebelum pergi