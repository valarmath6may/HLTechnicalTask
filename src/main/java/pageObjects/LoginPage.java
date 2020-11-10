package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.io.IOException;

public class LoginPage extends BasePage
{

    public @FindBy(id="username")
    WebElement username;

    public @FindBy(id="password")
    WebElement password;

    public @FindBy(xpath = "//button[@type='submit']")
    WebElement loginbutton;

    public @FindBy(id="flash")
    WebElement confirmmessage;

    public void passUsername(String user)
    {
        username.sendKeys(user);
    }

    public void passPassword(String pass)
    {
        password.sendKeys(pass);
    }
    public void submitLogin()
    {
        loginbutton.click();
    }

    public String responsemessage()
    {
        return confirmmessage.getText();

    }

    public void NavigateToUrl() throws IOException
    {

        driver.navigate().to(prop.getProperty("url"));
    }



}
