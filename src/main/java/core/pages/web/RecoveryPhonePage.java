package core.pages.web;

import com.codeborne.selenide.SelenideElement;
import core.base.BasePage;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RecoveryPhonePage extends BasePage {
    private SelenideElement phoneInput = $("[name='st.r.phone']");
    private SelenideElement getCodeButton = $("[data-l='t,submit']");
    private SelenideElement countryDropdown= $("[data-popular-locale='Популярные']");
    private  SelenideElement errorMessage = $("[class='input-e js-ph-vl-hint']");


    {
        verifyPageElements();
    }

    private void verifyPageElements() {
        phoneInput.shouldBe(visible);
        getCodeButton.shouldBe(visible);
        countryDropdown.shouldBe(visible);
    }

    public String selectCountByName(String countryName) {
        countryDropdown.click();
        SelenideElement countryItem = $(String.format("[data-name='%s']",countryName));
        countryItem.scrollTo();
        countryItem.click();
        String countryCode = phoneInput.getValue();
        return countryCode;

    }
    @Step("Нажимает кнопку 'Получить код'")
    public void clickButton(){
        getCodeButton.shouldBe(visible).click();
    }
    @Step("Проверяет видимость сообщения об ошибке входа")
    public boolean isErrorMessageVisible() {
        return errorMessage.shouldBe(visible).exists();
    }

    @Step("Получает текст сообщения об ошибке входа")
    public String getErrorMessageVisible() {
        return errorMessage.shouldBe(visible).getText();
    }

}

