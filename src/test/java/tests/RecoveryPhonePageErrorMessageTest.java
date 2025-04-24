package tests;

import com.codeborne.selenide.SelenideElement;
import core.base.BaseTest;
import core.base.pages.LoginPage;
import core.base.pages.MainRecoveryPage;
import core.base.pages.RecoveryPhonePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RecoveryPhonePageErrorMessageTest extends BaseTest {
    private static LoginPage loginPage;
    private static MainRecoveryPage mainRecoveryPage;
    private static RecoveryPhonePage recoveryPhonePage;
    private static RecoveryPhonePage newRecoveryPhonePage;


    @BeforeEach
    public void prepare() {
        open(baseUrl);
        loginPage = new LoginPage();
        loginPage.goToRecoveryPage();
        mainRecoveryPage = new MainRecoveryPage();
    }

    @Test
    public void goRecoveryPhonePageTest() {
        mainRecoveryPage.goToRecoveryPhonePage();
        recoveryPhonePage = new RecoveryPhonePage();

       String countryCode = recoveryPhonePage.selectCountByName("Беларусь");
        recoveryPhonePage.clickButton();

        newRecoveryPhonePage = new RecoveryPhonePage();
        assertTrue(newRecoveryPhonePage.isErrorMessageVisible(),"Сообщение об ошибке отсутствует");

        String errorMessage =   newRecoveryPhonePage.getErrorMessageVisible();
        assertEquals("Неправильный номер телефона.",errorMessage,"Неверный текст об ошибке");

    }
}