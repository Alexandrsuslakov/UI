package core.base.pages;

import com.codeborne.selenide.SelenideElement;
import core.base.BasePage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class QrPage extends BasePage {
    private SelenideElement qrImg = $("[class='qr_code_image']");


    private void verifyPageElements() {     //Правильно ли, что я в каждом классе создаю идентичную приватную функцию
        qrImg.shouldBe(visible);    // с одинаковым названием (может можно сделать одну универсальную функцию и вызывать ее в каждом классе???)
    }

    {
        verifyPageElements();
    }

    public boolean isQrVisible() {
        return qrImg.isDisplayed();
    }

}
