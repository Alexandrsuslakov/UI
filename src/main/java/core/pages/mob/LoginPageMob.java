package core.pages.mob;

import com.codeborne.selenide.SelenideElement;
import core.base.MobileHeaderPage;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;

public class LoginPageMob extends MobileHeaderPage {
    private SelenideElement loginField = $("[name='fr.login']");
    private SelenideElement passwordField = $("#field_password");
    private SelenideElement loginButton = $("input[name='button_login']");
    private SelenideElement passwordForgotButton = $x("//a[text()='Не получается войти?']");

    public SelenideElement getLoginErrorText() {
        return loginErrorText;
    }

    public SelenideElement getPasswordErrorText() {
        return passwordErrorText;
    }

    private SelenideElement loginErrorText = $x("//label[text()='Укажите логин']");
    private SelenideElement passwordErrorText = $x("//label[text()='Укажите пароль']");
    private SelenideElement registrationButton = $x("//div[text()='Регистрация']");
    private SelenideElement credentialsAllert =$("div[id='ferr']");

    private void verifyPageElements() {
        loginField.shouldBe(visible);
        passwordField.shouldBe(visible);
        loginButton.shouldBe(visible);
        registrationButton.shouldBe(visible);
        passwordForgotButton.shouldBe(visible);
    }

    {
        verifyPageElements();
    }

    public void loginButtonClick() {
        loginButton.shouldBe(visible).click();
    }

    public void loginFieldInput(String login) {
        loginField.shouldBe(visible).click();
        loginField.shouldBe(visible).setValue(login);
        loginButtonClick();
    }

    public void passwordFielddInput(String password) {
        passwordField.shouldBe(visible).click();
        passwordField.shouldBe(visible).setValue(password);
        loginButtonClick();
    }

    public boolean errorLoginTextIsVisible() {
        return loginErrorText.isDisplayed();
    }

    public boolean errorPasswordTextIsVisible() {
        return passwordErrorText.isDisplayed();
    }

    public void passForgotButtonClick() {
        passwordForgotButton.shouldBe(visible).click();
    }
    public void registrationButtonClick() {
        registrationButton.shouldBe(visible).click();
    }
    public boolean credentialsAllertIsVisible() {
        return credentialsAllert.isDisplayed();
    }
}

