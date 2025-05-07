package core.base;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;


public class MobileHeaderPage {
    //Общие элементы, которые могут использоваться на разных страницах
    protected SelenideElement sideBar = $("#sidebar-opener");
    protected SelenideElement searchField = $x("//a[@data-log-click= '{\"target\":\"search\"}']");
    protected SelenideElement imgLogoOk = $x("//img[@class= 'ticLgo tics portal-logo_img']");

    {
        verifyPageElements();
    }

    @Step("Проверяем видимость элементов на странице")
    private void verifyPageElements() {
        sideBar.shouldBe(visible);
        imgLogoOk.shouldBe(visible);
        searchField.shouldBe(visible);

    }
    // Метод для поиска по сайту
    public void search(String query){
        searchField.shouldBe(visible).setValue(query).pressEnter();
    }


    public void sideBarClick(){
        sideBar.shouldBe(visible).click();
    }
}
