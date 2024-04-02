package tests;

import org.testng.annotations.Test;
import utils.ConfigReader;
import utils.ReusableMethods;

public class US002_PositiveLogin extends TestMain{

    @Test
    public void tc01(){
        loginPage.getUsernameTextBox().sendKeys(ConfigReader.getProperty("validUsername"));
        loginPage.getPasswordTextBox().sendKeys(ConfigReader.getProperty("validPassword"));
        loginPage.getLoginButton().click();
        ReusableMethods.wait(2);
        loginPage.getAdClose().click();
        ReusableMethods.wait(2);
        softAssert.assertTrue(homePage.getProfileButton().isDisplayed());
        softAssert.assertAll();
    }
}
