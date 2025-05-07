package tests.mob.ForgotPasswordTests;

import core.base.MobileBaseTest;
import core.pages.mob.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;

public class ClickButtonEmailRecoveryMobTest extends MobileBaseTest {
    private static StartPageMob startPageMob;
    private static LoginPageMob loginPageMob;
    private static ForgotPasswordPageMob forgotPasswordPageMob;
    private static RecoveryMailPageMob recoveryMailPageMob;

    @BeforeEach
    public void prepare() {
        open(baseUrl);
        startPageMob = new StartPageMob();
        startPageMob.loginClick();
    }

    @Test
    public void goToMailRecoveryPage() {
        loginPageMob = new LoginPageMob();
        sleep(1000);
        loginPageMob.passForgotButtonClick();

        forgotPasswordPageMob = new ForgotPasswordPageMob();
        forgotPasswordPageMob.emailButtonClick();
        recoveryMailPageMob= new RecoveryMailPageMob();
        sleep(1000);
    }
}
