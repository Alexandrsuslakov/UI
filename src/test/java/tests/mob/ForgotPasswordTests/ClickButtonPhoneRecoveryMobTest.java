package tests.mob.ForgotPasswordTests;

import core.base.MobileBaseTest;
import core.pages.mob.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClickButtonPhoneRecoveryMobTest extends MobileBaseTest {
    private static StartPageMob startPageMob;
    private static LoginPageMob loginPageMob;
    private static ForgotPasswordPageMob forgotPasswordPageMob;
    private static RecoveryPhonePageMob recoveryPhoneMob;

    @BeforeEach
    public void prepare() {
        open(baseUrl);
        startPageMob = new StartPageMob();

        startPageMob.allowAllButtonClick();
        startPageMob.loginClick();
    }

    @Test
    public void goToPhoneRecoveryPage() {
        loginPageMob = new LoginPageMob();
        sleep(1000);
        loginPageMob.passForgotButtonClick();

        forgotPasswordPageMob = new ForgotPasswordPageMob();
        forgotPasswordPageMob.phoneButtonClick();
        recoveryPhoneMob = new RecoveryPhonePageMob();
        recoveryPhoneMob.selectCountByName("Ботсвана");

        String prefix = recoveryPhoneMob.getPhonePrefix().getText();
        assertEquals("+267",prefix,"Код не соответствует");

        recoveryPhoneMob.getCodeButtonClick();
        sleep(500);

        String errorText = recoveryPhoneMob.getErrorText().getText();
        assertEquals("Введен неверный номер телефона",errorText,"Текст ошибки не соответсвует ожидаемому. Фактический результат: " + errorText);


    }
}
