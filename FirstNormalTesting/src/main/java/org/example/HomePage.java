package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {
    @FindBy(xpath = "//a[@title='My Account']")
    private WebElement linkMyAccount;

    @FindBy(css = "a[href$=\"/login\"]")
    private WebElement linkLogin;
    @FindBy(css = "a[href$=\"/register\"]")
    private WebElement linkRegister;

    @FindBy(linkText = "Forgotten Password")
    private WebElement forgotPassword;

    @FindBy(className = "btn-group")
    private WebElement currencyButton;
    @FindBy(name = "EUR")
    public WebElement eurCurrency;
    @FindBy(css = ".product-layout")
    public List<WebElement> productLayout;
    @FindBy(id = "cart")
    private WebElement cartButton;
    @FindBy(className = "text-center")
    private WebElement cartButtonInsideText;
    @FindBy(id = "cart-total")
    private WebElement cartTotalPrice;

    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void clickLinkMyAccount() {
        linkMyAccount.click();
    }
    public void clickLinkLogin() {
        linkLogin.click();
    }
    public void clickLinkRegister() {
        linkRegister.click();
    }
    public boolean isForgotPasswordDisplayed() {
        return forgotPassword.isDisplayed();
    }
    public void clickCurrencyButton() {
        currencyButton.click();
    }
    public void clickEurCurrency() {
        eurCurrency.click();
    }

    public String checkCurrency(int productNoo) {
        return productLayout.get(productNoo - 1)
                .findElement(By.cssSelector(".price"))
                .getText();
    }
    public void clickCartButton() {
        cartButton.click();
    }
    public String getCartButtonInsideText() {
        return cartButtonInsideText.getText();
    }
    public String getCartTotalPrice() {
        return cartTotalPrice.getText();
    }
}
