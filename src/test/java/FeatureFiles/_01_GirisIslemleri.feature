Feature: Gecerli bilgilerle kullanici girisi

  @SmokeTest
  Scenario: Kullanici gecerli kullanici adi ve sifre ile giris yapar
    Given Giris sayfasi aciktir
    When Gecerli kullanici adi ve sifre girilir
    And Beni Hatirla secenegi isaretlenir
    Then Giris basarili olur

  Scenario: Gecersiz kullanici ile giris yapilamamali
    Given Giris sayfasi aciktir
    When Gecersiz kullanici adi ve sifre girilir
    Then Uyari mesaji goruntulenmelidir