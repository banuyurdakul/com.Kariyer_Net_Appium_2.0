package tests;

import org.testng.annotations.Test;
import utils.Driver;
import utils.ReusableMethods;

import java.net.MalformedURLException;

public class US008_Employer extends TestMain{

    public US008_Employer() {
    }

    @Test
    public void tc01()  {

        ReusableMethods.scrollDown();
        loginPage.getEmployerLink().click();
        Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(Driver.getDriver().getCurrentUrl(),employerUrl);
        softAssert.assertAll();
    }



}
