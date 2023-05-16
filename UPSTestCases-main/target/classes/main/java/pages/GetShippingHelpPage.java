package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GetShippingHelpPage extends ParentPage{

    @FindBy(xpath = ".//*[@title = \'Visit Tracking Solutions\']")
    private WebElement linkVisitTrackingSolutions;

    public GetShippingHelpPage(WebDriver webDriver) {
        super(webDriver);
    }


    public GetShippingHelpPage isVisitTrackingSolutionsDisaplyed() {
        Assert.assertTrue(getElementName(linkVisitTrackingSolutions) + " is not disaplyed ", isElementDisplayed(linkVisitTrackingSolutions));
        return this;
    }
}
