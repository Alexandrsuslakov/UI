package tests.mob.LoginPageTests;
import core.base.MobileBaseTest;
import core.pages.mob.LoginPageMob;
import core.pages.mob.StartPageMob;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginOnlyUsernameMobTest extends MobileBaseTest {
    private static LoginPageMob loginPageMob;

    private static StartPageMob startPageMob;

    @BeforeEach
    public void prepare(){
        open(baseUrl);
    }

    @Test
    public void loginOnlyUserNameTest(){
        StartPageMob startPageMob = new StartPageMob();
        startPageMob.loginClick();

        loginPageMob = new LoginPageMob();
        loginPageMob.loginFieldInput("1");
        sleep(2000);

        assertTrue(loginPageMob.errorPasswordTextIsVisible(),"Сообщение под полем Password не отображается");
        assertEquals("Укажите пароль",loginPageMob.getPasswordErrorText().getText(),"Сообщение под полем пароль некорректное");
    }
}
