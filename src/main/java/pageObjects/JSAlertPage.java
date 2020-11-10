package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

public class JSAlertPage extends BasePage
{
    public @FindBy(xpath = "//button[contains(text(),'Click for JS Confirm')]")
    WebElement clickforjsconfirm;

    public @FindBy(id="result")
    WebElement renderText;

    public void clickJSConfirmbtn()
    {
        clickforjsconfirm.click();
    }

    public void clickOnAlert(String actiontext)
    {
        if (actiontext.equalsIgnoreCase("OK"))
        {
            driver.switchTo().alert().accept();
        } else
            {
            driver.switchTo().alert().dismiss();
        }
    }

    public String getRenderText()
    {
        return renderText.getText();
    }


}