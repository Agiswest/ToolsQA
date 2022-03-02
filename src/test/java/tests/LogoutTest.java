package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProfilePage;

public class LogoutTest extends BaseTest {

    @Test
    public void logoutTestPositive() {
        LoginPage loginPage = new LoginPage();
        loginPage.open();
        loginPage.login("test",  "testPass1112$");
        ProfilePage profilePage = new ProfilePage();
        profilePage.isPageOpened();
        profilePage.logout();
        Assert.assertTrue(loginPage.isPageOpened());
    }
}
