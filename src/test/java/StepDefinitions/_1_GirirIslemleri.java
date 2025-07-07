package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class _1_GirirIslemleri {
    DialogContent dc = new DialogContent();

    @Given("Giris sayfasi aciktir")
    public void girisSayfasiAciktir() {
        GWD.getDriver().get("https://earsiv.odakgis.com.tr/");
        dc.myClick(dc.giris);

    }

    @When("Gecerli kullanici adi ve sifre girilir")
    public void gecerliKullaniciAdiVeSifreGirilir() {
        dc.mySendKeys(dc.username, "ferihapalaz");
        dc.mySendKeys(dc.password, "Xo2vetWlNCPCtCt.");

    }

    @And("Beni Hatirla secenegi isaretlenir")
    public void beniHatirlaSecenegiIsaretlenir() {
        dc.myClick(dc.rememberclick);
        dc.myClick(dc.girisBtn);
    }

    @Then("Giris basarili olur")
    public void girisBasariliOlur() {
        System.out.println("Giriş işlemi başarılı");
    }

    @When("Gecersiz kullanici adi ve sifre girilir")
    public void gecersizKullaniciAdiVeSifreGirilir() {
        dc.mySendKeys(dc.username, "nur55555");
        dc.mySendKeys(dc.password, "4622452vnvg.");

    }

    @Then("Uyari mesaji goruntulenmelidir")
    public void uyariMesajiGoruntulenmelidir() {
    }
}
