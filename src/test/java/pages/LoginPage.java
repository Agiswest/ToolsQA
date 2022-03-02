package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    public void open() {
        Selenide.open("login");
    }

    public boolean isPageOpened() {
        return $("#userName").shouldBe(Condition.visible).isDisplayed();
    }

    public void login(String userName, String pass) {
        $("#userName").sendKeys(userName);
        $("#password").sendKeys(pass);
        $("#login").click();
    }

    public void createAccount() {
        $("#newUser").click();
    }
}
