package pageObjects;

import utils.Constants;
import utils.ElementFetch;

public interface LoginPageElements {
    String userNameTextBox = "//*[@id='ap_email']";
    String emailAddress = Constants.EMAIL; // "nomeshd@gmail.com";
    String continue_button = "//*[@id=\"continue\"]";
}
