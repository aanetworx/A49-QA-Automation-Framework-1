import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {

    @Test
    public void deletePlaylist()  throws InterruptedException {
        String expectedPlaylistDeletedMessage = "Deleted playlist \"TestPro Playlist.\"";

        provideEmail("demo@class.com");
        providePassword("tes$tStudent");
        clickSubmit();
        openPlaylist();
        clickDeletePlaylistBtn();
        Assert.assertEquals(getDeletedPlaylistMsg(), expectedPlaylistDeletedMessage);
//

//    }
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        String url = "https://qa.koel.app/";
        driver.get(url);
        Assert.assertEquals(driver.getCurrentUrl(), url);
        driver.quit();
}