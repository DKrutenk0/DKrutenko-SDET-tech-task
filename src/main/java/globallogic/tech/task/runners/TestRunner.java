package globallogic.tech.task.runners;

import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static com.codeborne.selenide.Configuration.*;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public abstract class TestRunner {
    public void setCapabilities() {
        ChromeOptions options = new ChromeOptions()
                .addArguments("--lang=en_US");
        browserCapabilities = options;
    }

    @BeforeMethod
    public void openHomePage() {
        setCapabilities();
        open("https://www.imdb.com/");
        getWebDriver().manage().window().maximize();
    }

    @AfterMethod
    public void browserClose() {
        getWebDriver().quit();
    }
}
