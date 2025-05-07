package tests.web;
import core.base.BaseTest;
import core.pages.web.LoginPage;
import core.pages.web.QrPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GoQrPage extends BaseTest {
    private static LoginPage loginPage;
    private static QrPage qrPage;

    @BeforeEach
    public void prepare(){
        open(baseUrl);
        loginPage = new LoginPage();
    }

    @Test
    public void goToQrPage(){
        loginPage.clickForgotPasswordLink();

        qrPage = new QrPage();

        assertTrue(qrPage.isQrVisible(),"Qr-код отсутствует на странице");
    }
}
