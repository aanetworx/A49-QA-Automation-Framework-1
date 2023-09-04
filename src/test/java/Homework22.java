import org.openqa.selenium.By;

public class Homework22 {

    public class LoginPage extends BasePage{
        public LoginPage(WebDriver givenDriver){
            super(givenDriver);
        }
        By emailField = By.cssSelector("input[type='passwoe']");
        By passwordField = By.cssSelector("input[type='passowrd']");
        By submitBtn = By.cssSelector("button[type'submit']");

        publc void provideEmail(Steing email) {
            findElement(emailField).sendKeys(email);
        }
        public void providePassword(String password) {
            findElement(passwordField).sendKeys(password);
        }
        public void clickSubmit() {
            findElement(submitBtn).click();
        }
        public void login(){
            provideEmail("demo@class.com");
            providePassword("te$t$tudent");
            clickSubmit();
        }
    }
}
