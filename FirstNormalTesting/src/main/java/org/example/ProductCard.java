package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ProductCard extends BasePage {

    @FindBy(css = "button")
    private WebElement addToCart;
    @FindBy(css = ".alert-success")
    public WebElement alert;
    @FindBy(css = ".product-layout")
    public List<WebElement> productLayout;
    @FindBy(xpath = "//*[@data-original-title=\"Add to Wish List\"]")
    private WebElement addToWishListButton;

    public ProductCard(WebDriver driver) {
        super(driver);
    }
    public void clickNthProductAddToCartButton (int productNoo) {
        productLayout.get(productNoo - 1)
                .findElement(By.cssSelector("button"))
                .click();
    }
    public void clickNthProductAddToWishlistButton (int productNo) {
        productLayout.get(productNo - 1)
                .findElement(By.xpath("//*[@data-original-title=\"Add to Wish List\"]"))
                .click();
    }
    public String getAlertText() {
        return alert.getText();
    }
}
