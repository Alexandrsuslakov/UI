package tests.web;
import core.base.BaseTest;
import core.pages.web.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginOnlyUsernameTest extends BaseTest {
    private static LoginPage loginPage;

    @BeforeEach
    public void prepare(){
        open(baseUrl);
        loginPage = new LoginPage();
    }

    @Test
    public void loginOnlyUsernameTest(){
        loginPage.loginOnlyLogin("incorrectUser");

        assertTrue(loginPage.isErrorMessageVisible(),"Сообщение об ошибке входа не отображается");
        assertEquals(loginPage.getErrorMessageVisible(),"Введите пароль","Сообщение об ошибке не соответствует ожидаемому");
    }
}
