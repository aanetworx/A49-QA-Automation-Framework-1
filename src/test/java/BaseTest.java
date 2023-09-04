import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeSuite;

public class BaseTest {
WebDriver driver;
WebDriver wait;
Actions actions;

public Base Page( WebDriver givenDriver) {
    driver = givenDriver;
    wait = new WebDriverWait(driver, Duration,ofSeconds(5));
    actions = new Actions(driver);

    public WebElement findElement(By locator) {
        retrun wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
    }
    public void doubleClick (By locator) {
        action.doubleClick(findElement(locator)).perform();
    }


    }
}
    }