package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.ThreadLocalRandom;

public class RegistrationPage extends BasePage {
    @FindBy(id = "input-firstname")
    private WebElement inputFirstName;
    @FindBy(id = "input-lastname")
    private WebElement inputLastName;

    @FindBy(id = "input-email")
    private WebElement inputEmail;

    @FindBy(id = "input-telephone")
    private WebElement inputTelephone;

    @FindBy(name = "password")
    private WebElement inputPassword;

    @FindBy(name = "confirm")
    private WebElement confirmPassword;

    @FindBy(name = "newsletter")
    private WebElement newsletter;
    @FindBy(name = "agree")
    private WebElement agreeWithContidions;
    @FindBy(css = "input[value='Continue']")
    private WebElement continueButton;

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }

    public void writeInputFirstName(String firstName) {
        inputFirstName.sendKeys(firstName);
    }
    public void writeInputLastName(String lastName) {
        inputLastName.sendKeys(lastName);
    }
    public void writeInputEmail(String email) {
        inputEmail.sendKeys(email);
    }
    public void writeInputTelephone(String telephone) {
        inputTelephone.sendKeys(telephone);
    }
    public void writeInputPassword(String password) {
        inputPassword.sendKeys(password);
    }
    public void writeInputConfirmPassword(String confirmedPassword) {
        confirmPassword.sendKeys(confirmedPassword);
    }
        public void clickRadioButtonNewsletter() {
        newsletter.click();
    }
    public void clickAgreeWithConditions() {
        agreeWithContidions.click();
    }
    public void clickContinueButton() {
        continueButton.click();
    }

}