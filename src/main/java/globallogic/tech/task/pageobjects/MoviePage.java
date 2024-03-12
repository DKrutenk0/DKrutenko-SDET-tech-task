package globallogic.tech.task.pageobjects;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class MoviePage extends BasePage {
    private final SelenideElement movieTitleTextField = $x("//h1[@data-testid='hero__pageTitle']");
    private final ElementsCollection movieInfoTitleList = $$x("//h1[@data-testid='hero__pageTitle']/following-sibling::ul");
    private final SelenideElement movieDescriptionTextField = $x("//span[@data-testid='plot-xl']");

    public String retrieveMovieTitle() {
        return movieTitleTextField.text();
    }

    public String retrieveMovieDataByYear(String expectedYear) {
        var movieDataList = movieInfoTitleList.filterBy(Condition.text(expectedYear)).texts().stream().toList();
        String movieYear = null;
        for (String movieData : movieDataList) {
            if (movieData.contains(expectedYear)) {
                movieYear = movieData;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }
        return movieYear;
    }

    public String retrieveMovieDescription() {
        return movieDescriptionTextField.text();
    }
}
