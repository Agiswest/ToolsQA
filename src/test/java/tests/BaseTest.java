package tests;

import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeMethod;

import java.lang.reflect.Method;

public class BaseTest {

    @BeforeMethod
    public void setup(Method method) {
        Configuration.timeout = 6000;
        Configuration.browser = "chrome";
        Configuration.baseUrl = "https://demoqa.com/";
        Configuration.startMaximized = true;
        Configuration.headless = false;
    }
}
