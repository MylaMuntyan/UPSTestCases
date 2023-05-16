package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage extends ParentPage{
    public SearchPage(WebDriver webDriver) {
        super(webDriver);
    }
    @FindBy(xpath = ".//a[@class = 'ups-link ups-analytics ups-results_individual' and @data-utg-link-name = 'search:File a Claim | UPS - Canada']")
    private WebElement linkFile_a_Claim;
    @FindBy(xpath = ".//a[@class='nav-link ups-analytics ' and @href = 'https://wwwapps.ups.com/calTimeCost?loc=en_CA']")
    private WebElement linkQuote;

    public SearchPage isLinkFile_a_ClaimDisplayed (){
        isElementDisplayed(linkFile_a_Claim);
        return this;
    }


    public SearchPage isLinkQuoteDisaplyed() {
        Assert.assertFalse(getElementName(linkQuote) + " is disaplyed ", isElementDisplayed(linkQuote));
        return this;
    }
}
