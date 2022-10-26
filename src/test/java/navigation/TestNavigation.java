package navigation;

import base.BasePage;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagelibrary.HomePage;
import pagelibrary.SignInPage;

public class TestNavigation extends BasePage {


    @Test
    public void testNavigationToSignInPage(){
        HomePage homePage = new HomePage();
        SignInPage signInPage = homePage.clickSignInButton();
        Assert.assertTrue(isElementVisible(signInPage.createAccountButton));
    }

}
