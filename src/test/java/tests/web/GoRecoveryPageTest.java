package tests.web;
import core.base.BaseTest;
import core.pages.web.MainRecoveryPage;
import core.pages.web.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;


public class GoRecoveryPageTest extends BaseTest {
    private static LoginPage loginPage;
    private static MainRecoveryPage mainRecoveryPage;

    @BeforeEach
    public void prepare() {
        open(baseUrl);
        loginPage = new LoginPage();
    }

    @Test
    public void goToRecoveryPageTest() {
        loginPage.goToRecoveryPage();
        mainRecoveryPage = new MainRecoveryPage();
    }
}