package core.pages.web;

import com.codeborne.selenide.SelenideElement;
import core.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class RecoveryMailPage extends BasePage {
    private SelenideElement mailInput = $("[name='email']");
    private SelenideElement getCodeButton = $("[data-l='t,submit']");

    {
        verifyPageElements();
    }

    private void verifyPageElements() {
        mailInput.shouldBe(visible);
        getCodeButton.shouldBe(visible);
    }
}
                            