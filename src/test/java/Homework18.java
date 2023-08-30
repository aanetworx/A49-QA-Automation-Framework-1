import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework18 extends BaseTest {
    @Test
    public void playSong() {
        provideEmail("demo@class.com");
        providePassword("te$t$tudent");
        clickSubmit();
        clickPlay();
        Assert.assertTrue(isSongPlaying());
    }
    public void clickPlay(){
        playButton.click();
    }
    public boolean isSongPlaying() {
        WebElement soundBar = driver.findElement(By.xpath(xpathExpression;
        "//div[@data-testid='sound-bar-play']"));
        return soundBar.isDisplayed();
}
}
