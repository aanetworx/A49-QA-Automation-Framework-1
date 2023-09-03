import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTests extends BaseTest {
    String newPlayListName = "Sample Edited Playlist";
    @Test
    public void renamePlaylist() {
        String updatedPlaylistMsg = "Updated playlist \"Sample Edited Playlist.\"";

//      provideEmail("democ@lass.com");
        providePassword("teStStudent");
        clickSubmit();
        doubleClickPlaylist();
        enterNewPlaylistName();
        Assert.assertEquals(getRenamePlaylistSuccessMsg(), updatedPlaylistNeme);
    }
}