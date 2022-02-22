package pages;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.$;

public class TextBoxPage {

    public void open() {
        Selenide.open("text-box");
    }

    public void fillForm(String name, String mail, String curAddress, String permAddress) {
        $("#userName").sendKeys(name);
        $("#userEmail").sendKeys(mail);
        $("#currentAddress").sendKeys(curAddress);
        $("#permanentAddress").sendKeys(permAddress, Keys.PAGE_DOWN);
        $("#submit").click();
    }

    public String getCreatedName() {
        String[] createdName = $("p#name").getText().split(":");
        return createdName[1];
    }

    public String getCreatedMail() {
        String[] createdMail = $("p#email").getText().split(":");
        return createdMail[1];
    }

    public String getCreatedCurAddress() {
        String[] createdCurAddress = $("p#currentAddress").getText().split(":");
        return createdCurAddress[1];
    }

    public String getCreatedPermAddress() {
        String[] createdPermAddress = $("p#permanentAddress").getText().split(":");
        return createdPermAddress[1];
    }
}
