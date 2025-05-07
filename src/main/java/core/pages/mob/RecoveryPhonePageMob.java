package core.pages.mob;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import core.base.MobileHeaderPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RecoveryPhonePageMob {
    private SelenideElement phoneText = $x("//div[text()='Телефон']");
    private SelenideElement recoveryTitleText = $x("//h2[text()='Восстановление']");
    private SelenideElement getCodeButton = $("#getCode");

    public SelenideElement getErrorText() {
        return errorText;
    }

    private SelenideElement errorText = $x("//label[text()='Введен неверный номер телефона']");

    public SelenideElement getPhonePrefix() {
        return phonePrefix;
    }
    private SelenideElement phonePrefix = $ ("#field_phone_prefix");
    private SelenideElement phoneField = $("#field_phone");
    private SelenideElement countryDropdown = $("#countryFlag");

    private void verifyPageElements() {
        phoneText.shouldBe(visible);
        getCodeButton.shouldBe(visible);
        phoneField.shouldBe(visible);
        recoveryTitleText.shouldBe(visible);
    }

    {
        verifyPageElements();
    }

    public String selectCountByName(String countryName) {
        countryDropdown.click();
        SelenideElement countryItem = $x(String.format("//a[@data-view='countryCodeItem' and .//div[@class='reg_choose_country' and text()='%s']]", countryName));
        scrollToElementCenter(countryItem);
        countryItem.click();
        String countryCode = phoneField.getValue();
        return countryCode;


    }
    public void scrollToElementCenter(SelenideElement element) {
        Selenide.executeJavaScript(
                "arguments[0].scrollIntoView({block: 'center', inline: 'center', behavior: 'smooth'});", element);
    }

    public void getCodeButtonClick() {
        getCodeButton.shouldBe(visible).click();
    }

}
