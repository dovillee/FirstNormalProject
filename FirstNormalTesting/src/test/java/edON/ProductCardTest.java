package edON;

import org.example.BasePage;
import org.example.HomePage;
import org.example.ProductCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import static org.example.utils.WaitUtils.waitUntilVisible;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ProductCardTest extends BaseTest {
    ProductCard productCard;

    @BeforeEach
    public void setUp() {
    productCard = new ProductCard(driver);
}
    @Test
    public void addToCartFunctionalityTest() {
        productCard.clickNthProductAddToCartButton(1);
        waitUntilVisible(driver, productCard.alert);
        Assertions.assertTrue(productCard.alert.isDisplayed(), "Alert is not displayed");
    }
    @Test
    public void addToWishListFunctionality() {
        productCard.clickNthProductAddToWishlistButton(1);
        waitUntilVisible(driver, productCard.alert);
        assertTrue(productCard.getAlertText().contains("You must login"), "Alert message does not contain info about login");
    }
}
