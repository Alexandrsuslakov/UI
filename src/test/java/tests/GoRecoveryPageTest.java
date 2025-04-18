package tests;
import core.base.BaseTest;
import core.base.pages.MainRecoveryPage;
import core.base.pages.LoginPage;
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