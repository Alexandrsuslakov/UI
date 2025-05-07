package tests.web;

import core.base.BaseTest;
import core.pages.web.LoginPage;
import core.pages.web.QrPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenAndCloseSupportChatTest extends BaseTest {
    private static LoginPage loginPage;
    private static QrPage qrPage;

    @BeforeEach
    public void prepare(){
        open(baseUrl);
        loginPage = new LoginPage();
    }

    @Test
    public void openAndCloseSupportChatTest(){
        loginPage.clickForgotPasswordLink();

        qrPage = new QrPage();
        qrPage.supportLinkClick();
        assertTrue(qrPage.isQrVisible(),"Qr-код отсутствует на странице");
        assertTrue(qrPage.supportChatIsVisible(),"Чат службы поддержки отсутствует на странице");

        qrPage.closeChatClick();
        qrPage.yesCloseChatClick();
        qrPage.getSupportChat().shouldNotBe(visible);
        assertFalse(qrPage.supportChatIsVisible(),"Чат службы поддержки открыт");
    }
}
