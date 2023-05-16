package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetHelpPage extends ParentPage{

    @FindBy(xpath = ".//a[@href= 'https://www.ups.com/upsmychoice?loc=en_CA' and @class = 'ups-cta ups-cta-primary ups-analytics']")
    private WebElement logInToChangeButton;
    @FindBy(xpath = ".//*[@title = 'Get Shipping Help']")
    private WebElement getShippingHelpButton;

    public GetHelpPage(WebDriver webDriver) {
        super(webDriver);
    }

    public GetHelpPage isLogInToChangeButtonDisaplyed() {
        Assert.assertTrue(getElementName(logInToChangeButton) + " is not disaplyed ", isElementDisplayed(logInToChangeButton));
        return new GetHelpPage(webDriver);
    }

    public GetHelpPage isGetShippingHelpButtonAvailable() {
        Assert.assertTrue(getElementName(getShippingHelpButton)+ " is not disaplyed ", isElementDisplayed(getShippingHelpButton));
        return this;
    }

    public GetShippingHelpPage clickOnGetShippingHelpButton (){
        clickOnElement(getShippingHelpButton);
        return new GetShippingHelpPage(webDriver);
    }


}
