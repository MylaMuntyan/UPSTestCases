package pages;

import libs.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElements;

public class HomePage extends ParentPage {




    public HomePage(WebDriver webDriver) {
        super(webDriver);
    }

    private HeaderElements headerElements = new HeaderElements(webDriver);

    public HeaderElements getHeaderElements() {
        return headerElements;
    }

    ;
    @FindBy(xpath = ".//button[text()= 'Search']")
    private WebElement buttonSearch;
    @FindBy(xpath = ".//input[@id = 'ups-mainNav-search']")
    private WebElement inputSearch;
    @FindBy(xpath = ".//a[@class='nav-link active']")
    private WebElement linkTrack;
    @FindBy(xpath = ".//a[@class='nav-link ups-analytics ' and @href = 'https://wwwapps.ups.com/calTimeCost?loc=en_CA']")
    private WebElement linkQuote;
    @FindBy(xpath = ".//a[@class='nav-link ups-analytics ' and @href = 'https://www.ups.com/ship?loc=en_CA']")
    private WebElement linkShip;
    @FindBy(xpath = ".//a[@class='nav-link ups-analytics ' and @href = '/ca/en/business-solutions/ups-billing.page']")
    private WebElement linkBilling;
    @FindBy(xpath = ".//input[@id = 'ups-track--qs']")
    private WebElement inputTrackingNumber;
    @FindBy(xpath = ".//button[@id = 'stApp_widgetTrkNumBtn']")
    private WebElement buttonTrack;
    @FindBy(xpath = ".//span[@id = 'stApp_widgetHelpLbl']")
    private WebElement buttonHelp;
    @FindBy(xpath = ".//button[@id= 'ups-search-toggle' ]")
    private WebElement magnifyingGlassIcon;
    @FindBy(xpath = ".//*[@aria-label='Signup']")
    private WebElement linkLogIn;
    @FindBy(xpath = ".//a[@class = 'widget-footer-link ups-link']")
    private WebElement linkGetHelp;
    @FindBy(xpath = ".//*[@id='dropdownMenuButton']")
    private WebElement buttonMyProfile;
    @FindBy(xpath = ".//*[text() = 'Access Denied']")
    private WebElement messageAccessDenied;
    @FindBy(xpath = ".//*[text() = 'Canada - English']")
    private WebElement locSelection;


    public HomePage openHomePage() {

        try {
            webDriver.get("https://www.ups.com/");
            clickOnElement(locSelection);
            logger.info("Home Page was opened");
        } catch (Exception e) {
            logger.error("Can not open Home Page " + e);
            Assert.fail("Can not open Home Page " + e);
        }
        return this;
    }

    public HomePage isLinkGetHelpDisaplyed() {
        Assert.assertTrue(getElementName(linkGetHelp) + " is not disaplyed ", isElementDisplayed(linkGetHelp));
        return this;
    }

    public HomePage isSpanLoginSignupDisaplyed() {
        Assert.assertTrue(getElementName(linkLogIn) + " is not disaplyed ", isElementDisplayed(linkLogIn));
        return this;
    }

    public HomePage isLinkTrackDisaplyed() {
        Assert.assertTrue(getElementName(linkTrack) + " is not disaplyed ", isElementDisplayed(linkTrack));
        return this;
    }

    public HomePage isLinkQuoteDisaplyed() {
        Assert.assertTrue(getElementName(linkQuote) + " is not disaplyed ", isElementDisplayed(linkQuote));
        return this;
    }

    public HomePage isLinkShipDisaplyed() {
        Assert.assertTrue(getElementName(linkShip) + " is not disaplyed ", isElementDisplayed(linkShip));
        return this;
    }

    public HomePage isLinkBillingDisaplyed() {
        Assert.assertTrue(getElementName(linkBilling) + " is not disaplyed ", isElementDisplayed(linkBilling));
        return this;
    }

    public HomePage isInputTrackingNumberDisaplyed() {
        Assert.assertTrue(getElementName(inputTrackingNumber) + " is not disaplyed ", isElementDisplayed(inputTrackingNumber));
        return this;
    }

    public HomePage isButtonTrackDisaplyed() {
        Assert.assertTrue(getElementName(buttonTrack) + " is not disaplyed ", isElementDisplayed(buttonTrack));
        return this;
    }

    public HomePage isButtonHelp() {
        Assert.assertTrue(getElementName(buttonHelp) + " is not disaplyed ", isElementDisplayed(buttonHelp));
        return this;
    }

    public HomePage isButtonSearch() {
        Assert.assertTrue(getElementName(magnifyingGlassIcon) + " is not disaplyed ", isElementDisplayed(magnifyingGlassIcon));
        return this;
    }

    public LocationPage clickOnLocation() {
        clickOnElement(getHeaderElements().linkLocation);
        return new LocationPage(webDriver);
    }

    public HomePage isMenuItemsDisaplyed (){
        getHeaderElements().areHeaderElelementsDisaplyed();
        return this;
    }


    public LogInPage clickOnLogIn(){
        clickOnElement(linkLogIn);
        return new LogInPage(webDriver);
    }


    public HomePage isMyProfileButtonAvalable() {
        Assert.assertTrue(getElementName(buttonMyProfile) + " is not disaplyed ", isElementDisplayed(buttonMyProfile));
        return this;
    }

    public HomePage clickOnMagnifyingGlassImage() {
        clickOnElement(magnifyingGlassIcon);
            return this;
    }

    public HomePage enterIntoSearchInput() {
        enterTextInToElement(inputSearch, TestData.SEARCH_WORD);
        return this;
    }

    public SearchPage clickOnSearchButton() {
        clickOnElement(buttonSearch);
        return new SearchPage(webDriver);
    }

    public LogInPage isAccessDeniedMessageDisaplyed() {
        Assert.assertTrue(getElementName(messageAccessDenied) + " is not disaplyed ", isElementDisplayed(messageAccessDenied));;
        return new LogInPage(webDriver);
    }

    public GetHelpPage clickOnGetHelpLink() {
        clickOnElement(linkGetHelp);
        return new GetHelpPage(webDriver);
    }
}