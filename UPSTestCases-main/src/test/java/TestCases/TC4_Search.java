package TestCases;

import baseTest.BaseTest;
import org.junit.Test;


public class TC4_Search extends BaseTest {


    @Test
    public void searchTest() {
        homePage
                .openHomePage()
                .clickOnMagnifyingGlassImage()
                .enterIntoSearchInput()
                .clickOnSearchButton()
                .isLinkFile_a_ClaimDisplayed()
                .isLinkQuoteDisaplyed()
        ;
    }
}
