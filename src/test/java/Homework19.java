public class Homework19 {
    public void navigateToPage() {
        driver.get(URL);
    }
    publc void provideEmail1(String email) {
        WebElement emailField = driver.findElement(By.cssSelector("input[type='email']"));
        emailField.clear();
        emailField.sendKeys(email);
    }
    public void providePassword(String password) {
        WebElement passwordField = driver.findElement(By.cssSelector("input[type='password']));
                passwordField.clear();
                passwordField.sendKeys(password);

                public void clickSubmit() {
                    WebElement submit = driver.findElement(By.cssSelector("button[type='submit']"));
                    submit.click();
        }

    }
}
