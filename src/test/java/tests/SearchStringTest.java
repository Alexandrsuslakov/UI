package tests;
import core.base.BaseTest;
import core.base.pages.GroupPage;
import core.base.pages.LoginPage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SearchStringTest extends BaseTest {
    private  LoginPage loginPage;
    private  GroupPage groupPage;

    @BeforeEach
    public void prepare(){
        open(baseUrl);
        loginPage = new LoginPage();
    }

    @Test
    public void foundQA(){
        loginPage.accepAllClick();
        sleep(2000);
        loginPage.foundQATraining("Тестировщик");
        groupPage = new GroupPage();

    }
}
