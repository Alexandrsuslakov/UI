package core.base.pages;

import com.codeborne.selenide.SelenideElement;
import core.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class MainRecoveryPage extends BasePage {
    private SelenideElement supportButton = $("[class='support-link_item-text']");
    private SelenideElement mailButton = $("[data-l='t,email']");
    private SelenideElement phoneButton = $("[data-l='t,phone']");

    {
        verifyPageElements();
    }

    private void verifyPageElements() {     //Правильно ли, что я в каждом классе создаю идентичную приватную функцию
        supportButton.shouldBe(visible);    // с одинаковым названием (может можно сделать одну универсальную функцию и вызывать ее в каждом классе???)
        phoneButton.shouldBe(visible);
        mailButton.shouldBe(visible);

    }
    public void goToRecoveryMailPage(){
        mailButton.shouldBe(visible).click();
    }
    public void goToRecoveryPhonePage(){
        phoneButton.shouldBe(visible).click();
    }
}
