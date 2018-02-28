import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class InitialTest {
    WebDriver driver;

    @BeforeMethod
    public void configureBrowser() {
        driver = new FirefoxDriver();
        driver.get("http://www.google.com");
    }

    @Test
    public void pageTitle() {
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.titleIs("Google"));
    }

    @AfterMethod
    public void closeBrowser() {
        driver.close();
    }
}
