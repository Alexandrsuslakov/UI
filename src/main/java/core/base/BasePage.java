package core.base;

import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;




public class BasePage {
    //Общие элементы, которые могут использоваться на разных страницах
    protected SelenideElement headerLogo = $("[class= 'toolbar_logo_img']");
    protected SelenideElement searchField = $("[class= 'input__prt1l __size-m__prt1l input__mofy2 input-field__on39s __right-icon__on39s __redesigned__on39s']");
    protected SelenideElement vkServices = $("[data-l= 't,vk_ecosystem']");
    protected SelenideElement acceptAll = $("[class= 'button-pro __solid-white cb_accept js-cb_accept']");

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
