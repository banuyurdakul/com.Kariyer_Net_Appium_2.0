package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

    @FindBy(id = "com.kariyer.androidproject:id/navigation_profile")
    private WebElement profileButton;


    public WebElement getProfileButton() {
        return profileButton;
    }

    @FindBy(id = "com.kariyer.androidproject:id/largeLabel")
    private WebElement searchForAJobFooterLink;

    public WebElement getSearchForAJobFooterLink() {
        return searchForAJobFooterLink;
    }

    @FindBy(id = "com.kariyer.androidproject:id/btn_login")
    private WebElement logInButton;

    public WebElement getLogInButton() {
        return logInButton;
    }


}
