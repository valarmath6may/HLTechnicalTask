package utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Properties;

public class BrowserFactory {

    public static Properties prop;
    static WebDriver driver;

    public static WebDriver getDriver() {
        if(driver == null){
            return createDriverInstance();
        }
        return driver;
    }

    private static WebDriver createDriverInstance() {

        prop = Utilities.loadProperties();
        String BROWSER = prop.getProperty("browser");

        if (BROWSER == null) {
            BROWSER = "CHROME";
        }

        if (BROWSER.equalsIgnoreCase("CHROME")) {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (BROWSER.equalsIgnoreCase("FIREFOX")) {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
        return driver;
    }

    public static void close() {
      driver.quit();
      driver = null;
    }
}
