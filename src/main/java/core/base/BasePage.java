package core.base;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;


public class BasePage {
    //Общие элементы, которые могут использоваться на разных страницах
    protected SelenideElement headerLogo = $("[data-l= 't,logo']");
    protected SelenideElement searchField = $("[data-tsid= 'toolbar-search-input']");
    protected SelenideElement vkServices = $("[data-l= 't,vk_ecosystem']");
    protected SelenideElement acceptAll = $("[tsid= 'cookie-banner_button_2e0c18']");

    {
        verifyPageElements();
    }

    @Step("Проверяем видимость элементов на странице")
    private void verifyPageElements() {
        searchField.shouldBe(visible);
        headerLogo.shouldBe(visible);
        vkServices.shouldBe(visible);
        acceptAll.shouldBe(visible);
    }
    // Метод для поиска по сайту
    public void search(String query){
        searchField.shouldBe(visible).setValue(query).pressEnter();
    }

    public void openvkServices() {
        vkServices.shouldBe(visible).click();
    }

    //Клик на логотип ОК
    public void clickLogo(){
        headerLogo.shouldBe(visible).click();
    }
    public void accepAllClick(){
        acceptAll.shouldBe(visible).click();
    }
}
