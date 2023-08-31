import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Homework20 {
    public void navigateToPage() {
        driver.get(url);

    }
    public void provideEmail(String email) {
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys(email);

    }
    public void providePassword(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']"));
        passwordField.clear();
        passwordField.sendKeys(password);

    }
    public void clickSubmit() {
        WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
                submit.click();
    }
    public void openPlaylist() {
        WebElement emptyPlaylis = drive.findElement(By.cssSelector(".playlist:nth-child(3)"));
        empltyPlaylis.click();

        public void clickDeletePlaylistBtn() throws InterruptedException {
            WebElement deletePlaylist = driver.findElement(By.cssSelector(".btn-delete-playlist"));
            deletePlaylist.click();
            Thread.sleep(2000);
        }
        public String getDeletedPlaylistMsg() {
            WebElement notificationMsg = driver.findElement(By.cssSelector("div.success.show"));
            return notificationMsg.getText();
        }

    }

}
