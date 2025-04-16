package core.base;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$x;




public class BasePage {
    //Общие элементы, которые могут использоваться на разных страницах
    protected SelenideElement headerLogo = $("div.logo");
    protected SelenideElement searchField = $x("[@name= 'st.query']");
    protected SelenideElement vkServices = $("div.notifications");

    // Метод для поиска по сайту
    public void search(String query){
        searchField.shouldBe(visible).setValue(query).pressEnter();
    }

    public void openvkServices() {
        vkServices.shouldBe(visible).click();
    }

    //Клик на логотип ОК
    public void clickLogo(){
        headerLogo.shouldBe(visible).click();
    }

}
