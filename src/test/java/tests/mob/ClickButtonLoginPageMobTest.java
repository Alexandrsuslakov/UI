package tests.mob;

import core.base.MobileBaseTest;
import core.pages.mob.LoginPageMob;
import core.pages.mob.StartPageMob;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;

public class ClickButtonLoginPageMobTest  extends MobileBaseTest {

    private static StartPageMob startPageMob;
    private static LoginPageMob loginPageMob;

    @BeforeEach
    public void prepare() {
        open(baseUrl);

    }

    @Test
    public void clickButtonLoginPageMobTest() {
        StartPageMob startPageMob = new StartPageMob();
        startPageMob.loginClick();

        LoginPageMob loginPageMob = new LoginPageMob();
    }
}

