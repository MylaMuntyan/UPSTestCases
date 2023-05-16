package pages.elements;

import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.CommonActionsWithElements;
import pages.HomePage;

public class HeaderElements extends CommonActionsWithElements {
    Logger logger = Logger.getLogger(getClass());

    public HeaderElements(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//a[@id='mainNavDropdown1']")
    public WebElement linkShipping;
    @FindBy(xpath = ".//a[@id='mainNavDropdown2']")
    public WebElement linkTracking;
    @FindBy (xpath = ".//a[@id='mainNavDropdown3']")
    public WebElement linkBusinessSolutions;
    @FindBy (xpath = ".//a[@id='mainNavDropdown4']")
    public WebElement linkSupport;
    @FindBy (xpath = ".//a[@class= 'OneLinkKeepLinks ups-link']")
    public WebElement linkAboutUPS;
    @FindBy (xpath = ".//a[@class= 'ups-link' and @href = 'https://www.ups.com/dropoff?loc=en_CA']")
    public WebElement linkLocation;
    @FindBy (xpath = ".//a[@class= 'ups-link dropdown-toggle' ]")
    public WebElement linkLanuages;



    public WebDriver  isLinkShippinDisaplyed (){
      Assert.assertTrue( getElementName(linkShipping) + " is not disaplyed ", isElementDisplayed(linkShipping));
       return webDriver;
    }

    public WebDriver  isLinkTrackingDisaplyed (){
        Assert.assertTrue( getElementName(linkTracking) + " is not disaplyed ", isElementDisplayed(linkTracking));
        return webDriver;
    }

    public WebDriver  isLinkBusinessSolutionsDisaplyed (){
        Assert.assertTrue( getElementName(linkBusinessSolutions) + " is not disaplyed ", isElementDisplayed(linkBusinessSolutions));
        return webDriver;
    }

    public WebDriver  isLinkSupportDisaplyed (){
        Assert.assertTrue( getElementName(linkSupport) + " is not disaplyed ", isElementDisplayed(linkSupport));
        return webDriver;
    }

    public WebDriver  isLinkAboutUPSDisaplyed (){
        Assert.assertTrue( getElementName(linkAboutUPS) + " is not disaplyed ", isElementDisplayed(linkAboutUPS));
        return webDriver;
    }

    public WebDriver  isLinkLocationDisaplyed (){
        Assert.assertTrue( getElementName(linkLocation) + " is not disaplyed ", isElementDisplayed(linkLocation));
        return webDriver;
    }

    public WebDriver  isLinkLanuagesDisaplyed (){
        Assert.assertTrue( getElementName(linkLanuages) + " is not disaplyed ", isElementDisplayed(linkLanuages));
        return webDriver;
    }



    public WebDriver areHeaderElelementsDisaplyed (){
        isLinkShippinDisaplyed();
        isLinkTrackingDisaplyed();
        isLinkBusinessSolutionsDisaplyed();
        isLinkSupportDisaplyed();
        isLinkLanuagesDisaplyed();
        isLinkAboutUPSDisaplyed();
        isLinkLocationDisaplyed();
        logger.info("All Header Elements are displayed");
        return webDriver;
    }
}
