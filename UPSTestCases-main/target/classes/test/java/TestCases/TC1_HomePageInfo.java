package TestCases;

import baseTest.BaseTest;
import org.junit.Test;


public class TC1_HomePageInfo extends BaseTest {

    @Test
        public void homePageInfo (){
       homePage
               .openHomePage()
               .isMenuItemsDisaplyed()
               .isButtonHelp()
               .isButtonSearch()
               .isLinkGetHelpDisaplyed()
               .isInputTrackingNumberDisaplyed()
               .isLinkBillingDisaplyed()
               .isButtonTrackDisaplyed()
               .isLinkBillingDisaplyed()
               .isLinkShipDisaplyed()
               .isLinkQuoteDisaplyed()
               .isLinkTrackDisaplyed()
               .isSpanLoginSignupDisaplyed()
               ;




}




}


