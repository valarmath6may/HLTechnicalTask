package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.testng.Assert;

public class AlertSteps extends BaseStepDefs
{
    @And("^click for JSConfirm$")
    public void click_for_JSConfirm() throws Throwable
    {
    jsalerts.clickJSConfirmbtn();
    }

    @And("^click on alert \"([^\"]*)\" option$")
    public void click_on_alert_option(String actiontext) throws Throwable
    {
    jsalerts.clickOnAlert(actiontext);

    }

    @Then("^user should see revelant message \"([^\"]*)\"$")
    public void user_should_see_revelant_message(String expected) throws Throwable
    {
        Assert.assertEquals(jsalerts.getRenderText(),expected);

    }

    @Then("^user should not see irrevelant message \"([^\"]*)\"$")
    public void userShouldNotSeeIrrevelantMessage(String expected) throws Throwable {

        Assert.assertNotEquals(jsalerts.getRenderText(),expected);
    }
}
