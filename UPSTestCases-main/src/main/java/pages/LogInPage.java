package pages;

import libs.TestData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class LogInPage extends ParentPage{
    public LogInPage(WebDriver webDriver) {
        super(webDriver);
    }

    @FindBy(xpath = ".//input[@name ='userID']")
    private WebElement inputUserName;
    @FindBy(xpath = ".//input[@name ='password']")
    private WebElement inputPassword;
    @FindBy(xpath = ".//button[@id='submitBtn']")
    private WebElement buttonLogIn;



    public LogInPage enterUserName() {
        enterTextInToElement(inputUserName, TestData.USER_NAME);
        return this;
    }

    public LogInPage enterPassword() {
        enterTextInToElement(inputPassword, TestData.PASSWORD);
        return this;
    }

    public HomePage clickOnLogInButton() {
        clickOnElement(buttonLogIn);
        return new HomePage(webDriver);
    }
}
