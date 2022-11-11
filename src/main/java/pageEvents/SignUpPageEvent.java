package pageEvents;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import pageObjects.HomePageElements;
import pageObjects.LoginPageElements;
import pageObjects.SignUpPageElements;
import utils.BaseTest;
import utils.ElementFetch;

import java.time.Duration;

public class SignUpPageEvent {
    public void verifySignUpPageIsOpened(){
        ElementFetch elementFetch = new ElementFetch();
        BaseTest.logger.info("Verifying that the SignUp page is loaded or not..!");
        Assert.assertTrue(elementFetch.getWebElementsList("XPATH",
                        SignUpPageElements.userNameTextBox).size() > 0,
                "SignUp Page did not open!");
    }
    public void enterUserName(String userName){
        BaseTest.logger.info("Entering the User Name ID..!");
        new ElementFetch().getWebElement("XPATH", SignUpPageElements.userNameTextBox).sendKeys(userName);
    }
    public void enterEmailId(String email){
        BaseTest.logger.info("Entering the Email ID..!");
        new ElementFetch().getWebElement("XPATH", SignUpPageElements.emailTextBox).sendKeys(email);
    }
    public void enterPassword(String password){
        BaseTest.logger.info("Entering the Password..!");
        new ElementFetch().getWebElement("XPATH", SignUpPageElements.passwordTextBox).sendKeys(password);
    }
    public void enterPasswordAgain(String password){
        BaseTest.logger.info("Entering the Password..!");
        new ElementFetch().getWebElement("XPATH", SignUpPageElements.re_passwordTextBox).sendKeys(password);
    }
    public void clickContinueButton(){
        ElementFetch elementFetch = new ElementFetch();
        WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(), Duration.ofSeconds(15));
        wait.until(ExpectedConditions.elementToBeClickable(
                elementFetch.getWebElement("XPATH", SignUpPageElements.continue_button))).click();
    }


}
