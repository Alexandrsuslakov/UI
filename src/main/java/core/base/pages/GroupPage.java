package core.base.pages;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class GroupPage{
    private SelenideElement groupTab = $("[data-l='t,userAltGroup']");


    private void verifyPageElements() {
        groupTab.shouldBe(visible);
    }

    {
        verifyPageElements();
    }

}
