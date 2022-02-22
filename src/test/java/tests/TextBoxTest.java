package tests;

import models.TextBox;
import models.TextBoxFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TextBoxPage;

public class TextBoxTest extends BaseTest {

    @Test
    public void textBoxTestPositive() {
        TextBoxPage textBoxPage = new TextBoxPage();
        TextBox textBox = TextBoxFactory.get();
        textBoxPage.open();
        textBoxPage.fillForm(textBox);
        Assert.assertEquals(textBoxPage.getCreatedName(), textBox.getName());
        Assert.assertEquals(textBoxPage.getCreatedMail(), textBox.getMail());
        Assert.assertEquals(textBoxPage.getCreatedCurAddress(), textBox.getCurAddress());
        Assert.assertEquals(textBoxPage.getCreatedPermAddress(), textBox.getPermAddress());
    }
}
