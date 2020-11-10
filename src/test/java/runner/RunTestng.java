package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utils.BrowserFactory;
import utils.Utilities;

import java.util.Properties;

@CucumberOptions(

      features = {"src/test/java/features"},
        glue = {"stepDefinitions"},
      tags = {"@valardynamic,@valarlogin,@valarjsalerts"},
      plugin = {"pretty","html:target/site/task.html"}
)
public class RunTestng extends AbstractTestNGCucumberTests
{
static Properties prop;

    @BeforeClass
    public static void setup()
    {
        prop= Utilities.loadProperties();
        System.out.println(prop.getProperty("browser"));
        BrowserFactory.getDriver();
    }

    @AfterClass
    public static void afterClass()
    {
        BrowserFactory.close();


    }





}
