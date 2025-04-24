package tests;
import core.base.BaseTest;
import core.base.pages.LoginPage;
import core.base.pages.QrPage;
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
        loginPage.openQrPage();

        qrPage = new QrPage();

        assertTrue(qrPage.isQrVisible(),"Qr-код отсутствует на странице");
    }
}
