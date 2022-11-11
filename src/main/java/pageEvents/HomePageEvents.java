package pageEvents;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.HomePageElements;
import utils.BaseTest;
import utils.ElementFetch;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;

public class HomePageEvents {

    public void clickOnSignInButton(){
        ElementFetch elementFetch = new ElementFetch();
        WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(),Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath(HomePageElements.signInButton))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                elementFetch.getWebElement("XPATH", HomePageElements.signInButton))).click();

    }

    public void clickOnSignUpButton(){
        ElementFetch elementFetch = new ElementFetch();
        WebDriverWait wait = new WebDriverWait(BaseTest.getDriver(),Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(
//                By.xpath(HomePageElements.signInButton))).click();

        wait.until(ExpectedConditions.elementToBeClickable(
                elementFetch.getWebElement("XPATH", HomePageElements.signUpButton))).click();

    }
}
