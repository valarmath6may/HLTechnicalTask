package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

public class Utilities
{
    public static Properties loadProperties() {
        Properties prop = new Properties();
        try {
            FileInputStream fs = new FileInputStream("./src/main/java/config/data.properties");
            prop.load(fs);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return prop;
    }

    public Boolean isElementDisplayed(WebElement element)
    {
        return element.isDisplayed();
    }


    public void waitForElementPresence(WebDriver driver, By element) {
        WebDriverWait wait = new WebDriverWait(driver, 20);
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(element));
        } catch (Exception e) {

            e.printStackTrace();

            Assert.assertFalse(false, "Failed the test - " + e.getMessage());
        }
    }

    public void clickOnText(WebDriver driver, String text) throws Exception {
        getElementFromText(driver, text).click();
    }

    public WebElement getElementFromText(WebDriver driver, String text) throws Exception {
        return getElement(driver, By.linkText(text));

    }

    public WebElement getElement(WebDriver driver, By by) throws Exception {
        List<WebElement> elements = driver.findElements(by);
        if (elements.size() == 0) {
            throw new Exception("Given element not present");
        } else {
            return elements.get(0);
        }

    }
}
