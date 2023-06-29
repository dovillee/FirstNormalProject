package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegistrationConfirmationPage extends BasePage {

    @FindBy(id = "common-success")
    private WebElement confirmationContent;

    public RegistrationConfirmationPage(WebDriver driver) {
        super(driver);
    }

    public boolean isConfirmationContentTextDisplayed() {
        return confirmationContent.isDisplayed();
    }
    public String isPageTitleTheSame() {
        return driver.getTitle();
    }
}
