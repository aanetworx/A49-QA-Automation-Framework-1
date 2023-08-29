import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Homework17 extends BaseTest {
//    @Test ( description = "Homework 17 - addSongToPlaylist;
    public void addSongToPlayList() {
        loginWithCorrectCreds();
        enterSongIntoSearchCreds();
        clickViewAllBtn();
        clickOnSongTitle();
        clickOnAddToBtn();
        enterNewUniquePlaylistName();
    }
    private void clickOnAddToBtn(){
        WebElement addToBtn = driver.findElement(ByCssSelector (".btn-add-to"));
        addToBtn.click();
    }
    private void clickOnSongTitle() {
        WebElement songTitle = driver.findElement(ByCssSelector (".search-results .son-item .title"));
        songTitle.click();
    }
    private void enterSongIntoSearchInput(){
        enterText(ByCssSelector("[type='search']"), "Reactor");
    }

    private void clickViewAllBtn() {
        WebElement viewAllBtn = driver.findElement(ByCssSelector("[data-test='view-a;;-songs-btn']"));
        viewAllBtn.click();
    }

//    private void clickOnAddToBtn() {
//        enterText(By.cssSelector("[type='search']"), "Reactor");
    }
//    private void clickOnSongTitle = driver.findElement(ByCssSelector(".search-results .song-item .title"));
//    songTitle.click();
//enterText(By.cssSelector("#songResultsWrapper [data-test='new-playlist-name']"), getRandomString());
//        songTitle.click();



            private void clickViewAllBtn() {
            WebElement addToBtn=driver.findElement(ByCssSelector (".btn-add-to"));
            addToBtn.click();
        }

//

}
