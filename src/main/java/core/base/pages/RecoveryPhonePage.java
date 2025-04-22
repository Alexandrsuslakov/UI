package core.base.pages;

import com.codeborne.selenide.SelenideElement;
import core.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RecoveryPhonePage extends BasePage {
    private SelenideElement phoneInput = $("[name='st.r.phone']");
    private SelenideElement getCodeButton = $("[data-l='t,submit']");
    private SelenideElement countryDropdown= $("[data-popular-locale='Популярные']");

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
}

