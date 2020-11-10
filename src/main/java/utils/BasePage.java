package utils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import java.util.Properties;

public class BasePage {

    public Utilities utils = new Utilities();

   //initialize webdriver
    public static WebDriver driver;

    public static Properties prop;

    public BasePage()
    {
        driver = BrowserFactory.getDriver();
        PageFactory.initElements(driver, this);
        prop = Utilities.loadProperties();
        try {
            System.out.println(prop.getProperty("url"));
            driver.manage().window().maximize();

        } catch (Exception exception) {

        }
    }

}
