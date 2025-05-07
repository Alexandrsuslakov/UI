package core.pages.mob;

import com.codeborne.selenide.SelenideElement;
import core.base.MobileHeaderPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class RecoveryMailPageMob {
    private SelenideElement fieldEmailText = $x("//label[text()='Адрес почты, указанный в вашем профиле']");
    private SelenideElement recoveryTitleText = $x("//h2[text()='Почта']");
    private SelenideElement getCodeButton = $("#reg_email_button");;
    private SelenideElement phoneField = $("#field_email");

    private void verifyPageElements() {
        fieldEmailText.shouldBe(visible);
        getCodeButton.shouldBe(visible);
        phoneField.shouldBe(visible);
        recoveryTitleText.shouldBe(visible);
    }

    {
        verifyPageElements();
    }
}
