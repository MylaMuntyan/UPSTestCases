package TestCases;

import baseTest.BaseTest;
import org.junit.Test;

public class TC3_LogIn extends BaseTest {

    @Test
    public void validLogin() {

        homePage
                .openHomePage()
                .clickOnLogIn()
                .enterUserName()
                .enterPassword()
                .clickOnLogInButton()
                .isAccessDeniedMessageDisaplyed()


                ;

    }
}
