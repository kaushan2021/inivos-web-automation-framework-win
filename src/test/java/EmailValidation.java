import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;
import pageEvents.HomePageEvents;
import pageEvents.SignUpPageEvent;
import utils.BaseTest;
import java.util.List;
import java.util.concurrent.TimeUnit;

import java.util.concurrent.TimeUnit;

public class EmailValidation extends BaseTest {

    @Test
    public void checkValidEmail(){
        HomePageEvents homePageEvents = new HomePageEvents();
        homePageEvents.clickOnSignUpButton();

        SignUpPageEvent signUpPageEvent = new SignUpPageEvent();
        signUpPageEvent.verifySignUpPageIsOpened();
        signUpPageEvent.enterUserName("pasindu2022");
        signUpPageEvent.enterEmailId("pasindukaushan98@gmail.com");
        signUpPageEvent.enterPassword("Pasindu1998");
        signUpPageEvent.enterPasswordAgain("Pasindu1998");

    }
}
