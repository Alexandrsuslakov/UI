package core.pages.mob;

import com.codeborne.selenide.SelenideElement;
import core.base.MobileHeaderPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RegistrationPageMob extends MobileHeaderPage {
    private SelenideElement phoneField = $("input[id='field_phone']");
    private SelenideElement getCode = $x("//div[text()='Получить код']");
    private SelenideElement registrationButton = $x("//class[text()='Регистрация']");
    private SelenideElement supportChatButton = $x("//a data-log-click[text()='Служба поддержки']");
    private SelenideElement backStartPageButton = $x("//a data-log-click[text()='Вернуться на главную страницу']");

    private void verifyPageElements() {
        phoneField.shouldBe(visible);
        getCode.shouldBe(visible);
        supportChatButton.shouldBe(visible);
        backStartPageButton.shouldBe(visible);
    }

    {
        verifyPageElements();
    }

    public void setPhoneFieldInput(String phone) {
        phoneField.shouldBe(visible).setValue(phone);
    }
    public void GetCodeClick() {
        getCode.shouldBe(visible).click();
    }
    public void registrationButtonClick() {
        registrationButton.shouldBe(visible).click();
    }
    public void supportChatButtonClick() {
        supportChatButton.shouldBe(visible).click();
    }
    public void backStartPageButtonClick() {
        backStartPageButton.shouldBe(visible).click();
    }
}
//shouldHave(attribute("disabled")) — элемент имеет атрибут disabled.