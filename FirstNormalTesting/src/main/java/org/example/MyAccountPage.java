package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MyAccountPage extends BasePage {

    @FindBy(linkText = "Edit your account information")
    private WebElement editAccountInformation;

    public MyAccountPage(WebDriver driver) {
        super(driver);
    }
    public boolean isEditAccountInfoDisplayed() {
        return editAccountInformation.isDisplayed();
    }
}
