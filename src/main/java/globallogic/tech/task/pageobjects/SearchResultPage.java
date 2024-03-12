package globallogic.tech.task.pageobjects;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class SearchResultPage extends BasePage {
    private final SelenideElement exactMatchesButton = $x("//div[@class='ipc-title__actions']/a/span[@class='ipc-btn__text']");
    private final ElementsCollection foundTitlesList = $$x("//div[@class='ipc-metadata-list-summary-item__tc']");

    public SearchResultPage clickExactMatchesButton() {
        exactMatchesButton.shouldBe(visible)
                .click();

        return this;
    }

    public void clickOnMovieByCriteria(String movieName, String movieYear) {
        foundTitlesList.filterBy(text(movieName))
                .filterBy(text(movieYear))
                .first()
                .click();
    }
}
