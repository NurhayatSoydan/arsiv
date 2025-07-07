Feature: Indeks islemleri

  Scenario: Kullanici gecerli verilerle yeni indeks ekler
    Given Kullanici yetkilidir ve ekran aciktir
    When Indeks Adi olarak BelgeNo girilir
    And Tur olarak Sayisal secilir
    And Zorunlu Alan isaretlenir
    And Kaydet tiklanir
    Then Listeye yeni satir eklenmeli, turu Sayisal, zorunlu Evet olmali

  Scenario: Bos indeks adi ile kayit yapilamamali
    Given Sayfa aciktir
    When Indeks Adi bos birakilir
    And Tur secilir
    And Kaydet tiklanir
    Then Indeks Adi zorunludur uyarisi gosterilmelidir

  Scenario: Tum indeks turleri listede gorunmelidir
    Given Sayfa aciktir
    When indeks Turu acilir listesini ac
    Then Su degerler listelenmeli Sayisal, Ondalik Sayi, Karakter, Tarih ve Saat, Evet / Hayir

  Scenario: Zorunlu alan isaretlenmeden indeks kaydi yapilabilir
    Given Sayfa aciktir
    When Indeks Adi girilir
    And Tur secilir
    And Zorunlu Alan bos birakilir
    And Kaydet tiklanir
    Then Zorunlu Alan sutununda Zorunlu Degil yazmali

  Scenario: Indeks formunda vazgec islemi
    Given Alanlar doldurulmustur
    When Vazgec butonuna tiklanir
    Then Form sifirlanmali ve listeye kayit eklenmemelidir