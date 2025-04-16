package tests;
import core.base.BaseTest;
import core.base.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginWithLoginWrongCredentials extends BaseTest {
    private static LoginPage loginPage;

    @BeforeEach
    public void prepare(){
        open(baseUrl);
        loginPage = new LoginPage();
    }

    @Test
    public void loginTest(){
        loginPage.login("incorrectUser","incorrectPassword");

        assertTrue(loginPage.isErrorMessageVisible(),"Сообщение об ошибке входа не отображается");
        assertEquals(loginPage.getErrorMessageVisible(),"Неправильно указан логин и/или пароль","Сообщение об ошибке не соответствует ожидаемому");
    }
}
