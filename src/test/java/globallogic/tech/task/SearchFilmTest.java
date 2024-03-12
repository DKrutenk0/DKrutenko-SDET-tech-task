package globallogic.tech.task;

import globallogic.tech.task.pageobjects.HomePage;
import globallogic.tech.task.pageobjects.MoviePage;
import org.testng.annotations.Test;
import globallogic.tech.task.runners.TestRunner;

import static org.testng.AssertJUnit.*;

public class SearchFilmTest extends TestRunner {
    @Test
    public void verifyMovieSearch() {
        HomePage homePage = new HomePage();
        MoviePage moviePage = new MoviePage();
        var expectedMovieTitle = "Back to the future";
        var expectedMovieYear = "1985";
        var expectedMovieDescription = "Marty McFly, a 17-year-old high school student, is accidentally sent 30" +
                " years into the past in a time-traveling DeLorean invented by his close friend," +
                " the maverick scientist Doc Brown.";

        homePage.fillSearchField(expectedMovieTitle)
                .clickSearchButton()
                .clickExactMatchesButton()
                .clickOnMovieByCriteria(expectedMovieTitle, expectedMovieYear);

        var actualMovieTitle = moviePage.retrieveMovieTitle();
        var movieData = moviePage.retrieveMovieDataByYear(expectedMovieYear);
        var actualMovieDescription = moviePage.retrieveMovieDescription();

        assertEquals("Verify movie title", expectedMovieTitle, actualMovieTitle);
        assertTrue("Verify movie year", movieData.contains(expectedMovieYear));
        assertEquals("Verify movie description", expectedMovieDescription, actualMovieDescription);
    }
}
