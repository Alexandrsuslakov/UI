package core.base.pages;

import com.codeborne.selenide.SelenideElement;
import core.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class QrPage extends BasePage {
    private SelenideElement qrImg = $("[class='qr_code_image']");
    private SelenideElement supportLink = $("[data-l='t,support']");

    public SelenideElement getSupportChat() {
        return supportChat;
    }

    private SelenideElement supportChat = $("[class='support-chat__kmsu6']");
    private SelenideElement closeChatButton = $("[class='button__tndfc button-icon__tndfc']");
    private SelenideElement yesCloseChatButton = $("[class='button-core__0ej09 __size-m__0ej09 __wide__0ej09']");




    private void verifyPageElements() {
        qrImg.shouldBe(visible);
        supportLink.shouldBe(visible);
    }
    {
        verifyPageElements();
    }

    public boolean isQrVisible() {
        return qrImg.isDisplayed();
    }
        public void supportLinkClick() {
            supportLink.shouldBe(visible).click();
        }
    public boolean supportChatIsVisible() {
        return supportChat.isDisplayed();
    }
    public void closeChatClick() {
        closeChatButton.shouldBe(visible).click();
    }
    public void yesCloseChatClick() {
        yesCloseChatButton.shouldBe(visible).click();
    }

}
