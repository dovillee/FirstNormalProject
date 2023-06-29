package edON;

import dev.failsafe.internal.util.Assert;
import org.example.HomePage;
import org.example.LoginPage;
import org.example.MyAccountPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoginPageTest extends BaseTest {
    HomePage homePage;
    LoginPage loginPage;
    MyAccountPage myAccountPage;

    @Test
    public void UserCanLogin() {
        homePage = new HomePage(driver);
        homePage.clickLinkMyAccount();
        homePage.clickLinkLogin();

        loginPage = new LoginPage(driver);
        loginPage.writeInputEmail("teeessst@mail.com");
        loginPage.writeInputPassword("pasword123");
        loginPage.clickButtonLogin();

        myAccountPage = new MyAccountPage(driver);
        Assertions.assertTrue(myAccountPage.isEditAccountInfoDisplayed(), "Edit your account information button is not displayed");
    }

    @Test
    public void UserCanNotLogin() {
        homePage = new HomePage(driver);
        homePage.clickLinkMyAccount();
        homePage.clickLinkLogin();

        loginPage = new LoginPage(driver);
        loginPage.writeInputEmail("tet@mail.com");
        loginPage.writeInputPassword("pasddword123");
        loginPage.clickButtonLogin();

        Assertions.assertTrue(homePage.isForgotPasswordDisplayed(), "Password reminder button is not displayed");
    }
}
