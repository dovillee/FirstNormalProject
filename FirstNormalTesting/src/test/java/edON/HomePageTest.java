package edON;

import org.example.HomePage;
import org.example.ProductCard;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static org.example.utils.WaitUtils.waitUntilVisible;

public class HomePageTest extends BaseTest{
    HomePage homePage;

    @BeforeEach
    public void setUp() {
        homePage = new HomePage(driver);
    }
    @Test
    public void changeCurrencyToEur() {
        homePage.clickCurrencyButton();
        homePage.clickEurCurrency();
        homePage.checkCurrency(1);
        Assertions.assertTrue(homePage.checkCurrency(1).contains("€"), "The currency is not Euro");
    }
    @Test
    public void checkIfCartIsEmpty() {
        homePage.clickCartButton();
        Assertions.assertTrue(homePage.getCartButtonInsideText().contains("Your shopping cart is empty!"), "The text is not the same!");
        Assertions.assertTrue(homePage.getCartTotalPrice().contains("$0.00"), "The price is not the same!");
    }
}
