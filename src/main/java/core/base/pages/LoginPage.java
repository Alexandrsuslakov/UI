package core.base.pages;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import core.base.BaseTest;
import io.qameta.allure.Step;


public class LoginPage extends BaseTest {

    private SelenideElement loginInput = $("[name='st.email']");
    private SelenideElement passInput = $("[name='st.password']");
    private SelenideElement loginButton = $("[data-l='t,sign_in']");
    private SelenideElement forgotPasswordLink  = $("[data-l='t,restore']");
    private SelenideElement registrationButton  = $("[tsid='login-block21_input_9ad800']");


    // Кнопки соц.сетей
    private SelenideElement vkButton = $("[data-module='registration/vkconnect']");
    private SelenideElement mailButton = $("[class='i ic social-icon __s __mailru']");
    private SelenideElement yandexButton = $("[class='i ic social-icon __s __yandex']");
    private SelenideElement errorMessage = $("[class='input-e login_error'");

    {
        verifyPageElements();
    }

    @Step("Проверяем видимость элементов на странице")
    public void verifyPageElements() {
        loginInput.shouldBe(visible);
        passInput.shouldBe(visible);
        loginButton.shouldBe(visible);
        forgotPasswordLink.shouldBe(visible);
        registrationButton.shouldBe(visible);
        vkButton.shouldBe(visible);
        mailButton.shouldBe(visible);
        yandexButton.shouldBe(visible);

    }

    @Step("Проверяет видимость сообщения об ошибке входа")
    public boolean isErrorMessageVisible(){
        return errorMessage.shouldBe(visible).exists();
    }

    @Step("Получает текст сообщения об ошибке входа")
    public String getErrorMessageVisible(){
        return errorMessage.shouldBe(visible).getText();
    }

    @Step("Вход на сайт с логином {username} и паролем {password}")
    public void login(String username, String password) {
        loginInput.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue(username);
        passInput.shouldBe(visible).click();
        passInput.shouldBe(visible).setValue(password);
        loginButton.shouldBe(visible).click();
    }

    @Step("Попытка входа на сайт только с логином")
    public void loginOnlyLogin(String username) {
        loginInput.shouldBe(visible).click();
        loginInput.shouldBe(visible).setValue(username);
        loginButton.shouldBe(visible).click();
    }

    @Step("Попытка входа на сайт только с паролем")
    public void loginOnlyPass(String password) {
        passInput.shouldBe(visible).click();
        passInput.shouldBe(visible).setValue(password);
        loginButton.shouldBe(visible).click();
    }
    @Step("Переход на страницу регистрации")
    public void openRegistrationPage(){
        registrationButton.shouldBe(visible).click();
    }

    @Step("Переход на страницу VK")
    public void openVkPage() {
        vkButton.shouldBe(visible).click();
    }

    @Step("Переход на страницу Yandex")
    public void openYandexPage() {
        yandexButton.shouldBe(visible).click();
    }

    @Step("Переход на страницу Mail")
    public void openMailPage() {
        mailButton.shouldBe(visible).click();
    }
}
