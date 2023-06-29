package edON;

import org.example.*;
import org.example.utils.DataUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RegistrationPageTest extends BaseTest {
    HomePage homePage;
    RegistrationPage registrationPage;
    RegistrationConfirmationPage registrationConfirmationPage;

    @Test
    public void userRegistration() {
        homePage = new HomePage(driver);
        registrationPage = new RegistrationPage(driver);
        registrationConfirmationPage = new RegistrationConfirmationPage(driver);

        homePage.clickLinkMyAccount();
        homePage.clickLinkRegister();

        String generatedPass = DataUtils.generateRandomIntegers();
        registrationPage.writeInputFirstName("Test");
        registrationPage.writeInputLastName("Testest");
        registrationPage.writeInputEmail(DataUtils.generateEmail());
        registrationPage.writeInputTelephone("123654780009");
        registrationPage.writeInputPassword(generatedPass);
        registrationPage.writeInputConfirmPassword(generatedPass);
        registrationPage.clickRadioButtonNewsletter();
        registrationPage.clickAgreeWithConditions();
        registrationPage.clickContinueButton();

        Assertions.assertTrue(registrationConfirmationPage.isConfirmationContentTextDisplayed(), "Registration confirmation content is not displayed");
//        Assertions.assertEquals("Your Account Has Been Created!", registrationConfirmationPage.isPageTitleTheSame(), "The title is not the same");
        Assertions.assertEquals("Your Account Has Been Created!", driver.getTitle(), "The title is not the same");
    }
}
