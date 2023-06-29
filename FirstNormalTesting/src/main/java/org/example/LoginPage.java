package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {
    @FindBy(css = "#input-email")
    private WebElement inputEmail;

    @FindBy(css = "#input-password")
    private WebElement inputPassword;

    @FindBy(css = "input[value='Login']")
    private WebElement buttonLogin;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void writeInputEmail(String email) {
        inputEmail.sendKeys(email);
    }
    public void writeInputPassword(String password) {
        inputPassword.sendKeys(password);
    }
    public void clickButtonLogin() {
        buttonLogin.click();
    }
}
