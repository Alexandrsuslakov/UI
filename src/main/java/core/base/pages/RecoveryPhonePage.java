package core.base.pages;

import com.codeborne.selenide.SelenideElement;
import core.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RecoveryPhonePage extends BasePage {
    private SelenideElement phoneInput = $("[name='st.r.phone']");
    private SelenideElement getCodeButton = $("[data-l='t,submit']");

    {
        verifyPageElements();
    }

    private void verifyPageElements() {
        phoneInput.shouldBe(visible);
        getCodeButton.shouldBe(visible);
    }
}

