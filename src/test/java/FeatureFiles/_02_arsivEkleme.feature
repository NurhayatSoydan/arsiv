Feature: Arsiv yeri islemleri

  Scenario: Kullanici gecerli verilerle arsiv yeri ekler
    Given Giris yapilmis ve ekran aciktir
    When "Arsiv Yeri Adi" alanina "MusteriTipi" yazilir
    And "Arsiv Yeri Turu" listesinden "Karakter" secilir
    And "Zorunlu Alan" kutusu isaretlenir
    And "Kaydet" butonuna tiklanir
    Then Yeni arsiv yeri tabloya eklenmelidir

  Scenario: Zorunlu alan isaretlenmeden kayit yapilmamali
    Given Giris yapilmis olmali
    When "Arsiv Yeri Adi" girilir
    And Tur olarak "Evet / Hayir" secilir
    And "Zorunlu Alan" bos birakilir
    And "Kaydet" butonuna tiklanir
    Then "Arsiv Yeri Adi zorunludur" uyarisi goruntulenmelidir

  Scenario: Eksik bilgi ile kayit yapilmamali
    Given Kayit sayfasi aciktir
    When "Arsiv Yeri Adi" bos birakilir
    And Tur secilir
    And "Kaydet" tiklanir
    Then "Arsiv Yeri Adi zorunludur" uyarisi gorulmelidir

  Scenario: Tip listesinde tum degerler gorunmelidir
    Given Sayfa aciktir
    When "Arsiv Yeri Turu" kutusuna tiklanir
    Then Su degerler gorunmelidir: Sayisal, Ondalik Sayi, Karakter, Tarih ve Saat, Evet / Hayir

  Scenario: Kullanici vazgec butonu ile islemi iptal eder
    Given Form doldurulmustur
    When "Vazgec" butonuna tiklanir
    Then Form temizlenmeli ve tabloya veri eklenmemelidir