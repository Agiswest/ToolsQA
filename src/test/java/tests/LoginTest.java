package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginTest extends BaseTest {

    @Test
    public void loginTestPositive() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.login("test",  "testPass1112$");
        Assert.assertTrue(new ProfilePage().isPageOpened());
    }
}
