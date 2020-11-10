package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class DynamicLoadPage extends BasePage
{
   public @FindBy(linkText = "Example 2: Element rendered after the fact")
   WebElement elementrenderafterfact;

   public @FindBy(xpath = "//button[contains(text(),'Start')]")
   WebElement startelement;

   public @FindBy(id="finish")
   WebElement finishelement;

    public void clickElement(String text) throws Exception
    {
       utils.clickOnText(driver,text);
    }

    public void clickElementrenderafterfact()
    {
        elementrenderafterfact.click();
    }

    public void clickStartElement()
    {
       startelement.click();
    }
    public boolean isElementPresent()
    {
       return utils.isElementDisplayed(startelement);
    }
    public String renderMessage()
    {
        utils.waitForElementPresence(driver, By.id("finish"));
        return finishelement.getText();
    }

}
