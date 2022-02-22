package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test
    public void textBoxTestPositive() {
        TextBoxPage textBoxPage = new TextBoxPage();
        textBoxPage.open();
        textBoxPage.fillForm("fgdf", "fdg@mail.ru", "fgdg", "dfsdf");
        Assert.assertEquals(textBoxPage.getCreatedName(), "fgdf");
        Assert.assertEquals(textBoxPage.getCreatedMail(), "fdg@mail.ru");
        Assert.assertEquals(textBoxPage.getCreatedCurAddress(), "fgdg");
        Assert.assertEquals(textBoxPage.getCreatedPermAddress(), "dfsdf");
    }
}
