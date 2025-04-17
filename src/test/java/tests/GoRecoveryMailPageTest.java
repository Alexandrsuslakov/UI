package tests;

import core.base.BaseTest;
import core.base.pages.LoginPage;
import core.base.pages.MainRecoveryPage;
import core.base.pages.RecoveryMailPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class GoRecoveryMailPageTest extends BaseTest {
    private static LoginPage loginPage;
    private static MainRecoveryPage mainRecoveryPage;
    private static RecoveryMailPage recoveryMailPage;

    @BeforeEach
    public void prepare() {
        open(baseUrl);
        loginPage = new LoginPage();
        loginPage.goToRecoveryPage();
        mainRecoveryPage = new MainRecoveryPage(); //Правильно ли я сделал, что все действия до клика кнопки вынес за тест???
    }                                              // т.к. они напрямую не относятся к проверке

    @Test
    public void goRecoveryMailPageTest() {
        mainRecoveryPage.goToRecoveryMailPage();

        recoveryMailPage = new RecoveryMailPage();
    }
}