package globallogic.tech.task.pageobjects;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$x;

public class BasePage {
    private final SelenideElement searchField = $x("//input[@id='suggestion-search']");
    private final SelenideElement searchButton = $x("//button[@id='suggestion-search-button']");

    public BasePage fillSearchField(String textInput) {
        searchField.shouldBe(visible)
                .setValue(textInput);

        return this;
    }

    public SearchResultPage clickSearchButton() {
        searchButton.shouldBe(visible)
                .click();

        return new SearchResultPage();
    }
}
