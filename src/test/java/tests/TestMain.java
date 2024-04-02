package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.ForgotPasswordPage;
import pages.HomePage;
import pages.LoginPage;
import utils.Driver;
import utils.ReusableMethods;



public class TestMain {

    LoginPage loginPage = new LoginPage();
    static HomePage homePage = new HomePage();
    SoftAssert softAssert = new SoftAssert();
    ForgotPasswordPage fpPage = new ForgotPasswordPage();
    String expErrMsg = "Kullanıcı adı veya şifre hatalı!";
    String expVisText = "Göster";
    String expInvisText = "Gizle";
    String employerUrl = "kariyer.net/isveren/sizi-arayalim/?utm_source=kariyer.net&utm_medium=app&utm_campaign=isveren";
    String expForgotPasswordPageHeaderText = "Şifremi Unuttum";

    @BeforeMethod
    public static void goToLogin() {
        homePage.getLogInButton().click();
        ReusableMethods.wait(2);
    }

    @AfterMethod
    public static void tearDown(){
        Driver.quitDriver();
    }









}
