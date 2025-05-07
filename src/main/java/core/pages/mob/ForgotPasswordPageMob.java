package core.pages.mob;

import com.codeborne.selenide.SelenideElement;
import core.base.MobileHeaderPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class ForgotPasswordPageMob extends MobileHeaderPage {
    private SelenideElement phoneButton = $x("//div[text()='Телефон']/ancestor::*[2]");
    private SelenideElement emailButton = $x("//div[text()='Электронная почта']/ancestor::*[2]");
    private SelenideElement supportChatButton = $x("//a[text()='Служба поддержки']");

    private void verifyPageElements() {
        phoneButton.shouldBe(visible);
        emailButton.shouldBe(visible);
        supportChatButton.shouldBe(visible);

    }

    {
        verifyPageElements();
    }

    public void phoneButtonClick() {
        phoneButton.shouldBe(visible).click();
    }
    public void emailButtonClick() {
        emailButton.shouldBe(visible).click();
    }
    public void supportChatButtonClick() {
        supportChatButton.shouldBe(visible).click();
    }

}
