package Pages;

import Utilities.GWD;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DialogContent extends Parent{
    public DialogContent() {
        PageFactory.initElements(GWD.getDriver(), this);
    }
    @FindBy(css = "input[formcontrolname='username']")
    public WebElement username;
    @FindBy(css = "input[formcontrolname='password']")
    public WebElement password;
    @FindBy(css = "[formcontrolname='remember']")
    public WebElement rememberclick;
    @FindBy(css = "button[type='submit']")
    public WebElement girisBtn;
    @FindBy(xpath = "(//*[@id='navbtn'])[4]")
    public WebElement giris;
    @FindBy(css = "")
    public WebElement usernae;
    @FindBy(css = "")
    public WebElement userne;

    public void Click(WebElement element){
        WebDriverWait wait=new WebDriverWait(GWD.getDriver(), Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
