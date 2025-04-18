package tests;

import core.base.BaseTest;
import core.base.pages.LoginPage;
import core.base.pages.MainRecoveryPage;
import core.base.pages.RecoveryPhonePage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoRecoveryPhonePageTest extends BaseTest {
    private static LoginPage loginPage;
    private static MainRecoveryPage mainRecoveryPage;
    private static RecoveryPhonePage recoveryPhonePage;

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

    }
}