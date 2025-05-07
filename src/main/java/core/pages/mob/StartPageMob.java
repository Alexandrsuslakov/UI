package core.pages.mob;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class StartPageMob {
  private SelenideElement loginButton = $("[name= 'loginButton']");
  private SelenideElement registerButton = $("[name='registerButton']");
  private SelenideElement allowAllButton = $("input[name='button_allow_all']");


  private void verifyPageElements() {
        loginButton.shouldBe(visible);
        registerButton.shouldBe(visible);
    }

    {
        verifyPageElements();
    }

    public void loginClick() {
      loginButton.shouldBe(visible).click();
    }

    public void registerClick() {
      registerButton.shouldBe(visible).click();
    }

  public void registrationButtonClick() {
    
  }
  public void allowAllButtonClick() {
    allowAllButton.shouldBe(visible).click();
  }
}
