import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseTest {
    @BeforeSuite
//    static void setupClass() {
//        WebDriverManager.chromedriver().setup();

    @BeforeMethod@Parameters({"BaseURL"})
    public void launchBrowser(String BaseURL) {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manager().timeouts().implicitlyWait(Duration.ofSeconds(10));
        url = BaseURL;
        navigateToPage();

//
    }
}