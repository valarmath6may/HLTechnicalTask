package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class loginSteps extends BaseStepDefs
{
    @Given("^launch browser$")
    public void launch_browser() throws Throwable
    {
        loginpage.NavigateToUrl();
    }

    @And("^user enters username \"([^\"]*)\"$")
    public void userEnterWithValidUsername(String username) throws Throwable
    {
    loginpage.passUsername(username);
    }

    @And("^user enters password \"([^\"]*)\"$")
    public void userEnterWithValidPassword(String password) throws Throwable
    {
    loginpage.passPassword(password);
    }

    @And("^click on login button$")
    public void clickOnLoginButton()
    {
    loginpage.submitLogin();
    }

    @Then("^user should see respective response in the page \"([^\"]*)\"$")
    public void userAbleToViewThePage(String expecText)
    {
         Assert.assertEquals(loginpage.responsemessage(),expecText);

    }
}
