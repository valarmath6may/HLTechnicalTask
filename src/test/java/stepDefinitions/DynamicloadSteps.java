package stepDefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class DynamicloadSteps extends BaseStepDefs
{

    @When("^user select on \"([^\"]*)\"$")
    public void userSelectOn(String text) throws Throwable {
        dynamicload.clickElement(text);
    }

   @Then("^user click on element rendered after the fact$")
    public void user_click_on_element_rendered_after_the_fact() throws Throwable
    {
        dynamicload.clickElementrenderafterfact();

    }

    @And("^user should see start button$")
    public void user_should_see_start_button() throws Throwable
    {
        Assert.assertTrue(dynamicload.isElementPresent());

    }

    @When("^user click on start$")
    public void user_click_on_start() throws Throwable
    {
        dynamicload.clickStartElement();

    }

    @Then("^user should view the \"([^\"]*)\" message on the page$")
    public void userShouldViewTheMessageOnThePage(String expected) throws Throwable
    {

        Assert.assertEquals(dynamicload.renderMessage(),expected);
    }


}
