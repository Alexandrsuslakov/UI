package tests.web;

import core.base.BaseTest;
import core.pages.web.LoginPage;
import core.pages.web.MainRecoveryPage;
import core.pages.web.RecoveryMailPage;
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