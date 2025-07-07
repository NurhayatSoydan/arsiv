package StepDefinitions;

import Utilities.GWD;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void before()
    {
        System.out.println("Senaryo başladı");
    }
    @After
    public void after()
    {
        System.out.println("Senaryo bitti");
        GWD.quitDriver();
    }
  /*  @After// Cucumber ın Annotation ı
    // her senaryodan sonra otomatik çalışır
    public void after(Scenario senaryo) {
        ExcelUtility.writeToExcel(
                "src/test/java/ApachePOI/Resource/SenaryoSonuc.xlsx",
                senaryo.getName(),
                senaryo.isFailed() ? "Failed" : "Passed"
        );

        if (senaryo.isFailed()) {
            TakesScreenshot ts = ((TakesScreenshot) GWD.getDriver());
            byte[] hafizadakiHali = ts.getScreenshotAs(OutputType.BYTES);
            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
        }
        GWD.quitDriver();

    }*/
}
