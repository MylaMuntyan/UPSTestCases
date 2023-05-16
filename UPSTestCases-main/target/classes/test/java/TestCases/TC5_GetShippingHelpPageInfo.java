package TestCases;

import baseTest.BaseTest;
import org.junit.Test;

public class TC5_GetShippingHelpPageInfo extends BaseTest {

    @Test
    public void ShippingHelpPage() {
    homePage
            .openHomePage()
            .clickOnGetHelpLink()
            .isLogInToChangeButtonDisaplyed()
            .isGetShippingHelpButtonAvailable()
            .clickOnGetShippingHelpButton()
            .isVisitTrackingSolutionsDisaplyed()
        ;

    }

}
