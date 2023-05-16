package TestCases;

import baseTest.BaseTest;
import org.junit.Test;

public class TC2_LocationPage extends BaseTest {

    @Test

    public void locationPage (){
        homePage
                .openHomePage()
                .clickOnLocation()
                .isTrackDisaplyed()
                .enterLocationIntoSearch()
                .clickOnFind()
                .clickOnFirstResultOption()
                .areStoresLocationsDisaplyed()
        ;

    }

}
