package tests.mob.LoginPageTests;

import core.base.MobileBaseTest;
import core.pages.mob.LoginPageMob;
import core.pages.mob.RegistrationPageMob;
import core.pages.mob.StartPageMob;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

public class ClickButtonRegistrationMobTest extends MobileBaseTest {
    private static StartPageMob startPageMob;
    private static LoginPageMob loginPageMob;
    private static RegistrationPageMob registrationPageMob;

    @BeforeEach
    public void prepare() {
        open(baseUrl);
        startPageMob = new StartPageMob();
        startPageMob.loginClick();
    }

    @Test
    public void clickButtonRegistrationPageMobTest() {
        loginPageMob = new LoginPageMob ();
        loginPageMob.registrationButtonClick();
        registrationPageMob = new RegistrationPageMob();

    }
}
