package globallogic.tech.task.runners;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class TestRunner {
    @BeforeMethod
    public void openHomePage() {
        open("https://www.imdb.com/");
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void browserClose() {
        getWebDriver().quit();
    }
}
