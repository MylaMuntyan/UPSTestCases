package pages;

import libs.TestData;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.elements.HeaderElements;

public class LocationPage extends ParentPage{

    @FindBy(xpath = ".//input[@id ='txtQuery']")
    private WebElement inputSearch;
    @FindBy(xpath = ".//input[@type='submit']")
    private WebElement inputFind;
    @FindBy(xpath = ".//*[text() = 'Moncton, Westmorland, NB']")
    private WebElement inputFindResultOptions;
    @FindBy(xpath = ".//*[@class = 'mappedResultList']")
    private WebElement inputFindResultStores;
    @FindBy(xpath = ".//button[@id = 'stApp_widgetTrkNumBtn']")
    private WebElement buttonTrack;

    public LocationPage(WebDriver webDriver) {
        super(webDriver);
    }
    private HeaderElements headerElements = new HeaderElements(webDriver);
    public HeaderElements getHeaderElements() {
        return headerElements;
    }



    public LocationPage enterLocationIntoSearch  () {
        enterTextInToElement(inputSearch, TestData.LOCATION);
        return this;
    }

    public LocationPage clickOnFind (){
        clickOnElement(inputFind);
        return this;
    }

    public LocationPage isTrackDisaplyed (){
        Assert.assertFalse(getElementName(buttonTrack) + " is  disaplyed ", isElementDisplayed(buttonTrack));
        return this;
    }


    public LocationPage clickOnFirstResultOption() {
        clickOnElement(inputFindResultOptions);
        return this;
    }


    public LocationPage areStoresLocationsDisaplyed() {
        isElementDisplayed(inputFindResultStores);
        return this;
    }
}
