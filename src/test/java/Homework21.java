import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Homework21 {
    public void doubleClickPlaylist() {
        WebElement playlistElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".playlist:nth-child(3)")));
        actions.doubleClick(playlistElement).perform();
    }
    public void enterNewPlaylistName() {
        WebElement playlistInputField = wait.until(ExpectedConditions.visibilityOfAllElementsLocated(By.cssSelector("[name='name']")));
        playlistInputField.sendKeys)Keys.chord(vaule:Keys.CONTROL, "A", Keys.BACK_SPACE));
playlistInputField.sendKeys(newPlaylistName);
playlistInputField.sendKeys(Keys.ENTER);

    }
    public String getRenamePlaylistSuccessMsg() {
    WebElement notification = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.success.show")));
    return notification.getText();
    }
}
