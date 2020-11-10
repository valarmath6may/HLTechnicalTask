package stepDefinitions;

import pageObjects.DynamicLoadPage;
import pageObjects.JSAlertPage;
import pageObjects.LoginPage;

public class BaseStepDefs
{
    public LoginPage loginpage;
    public DynamicLoadPage dynamicload;
    public JSAlertPage jsalerts;
 public  BaseStepDefs()
 {

     loginpage = new LoginPage();
     dynamicload = new DynamicLoadPage();
     jsalerts = new JSAlertPage();
 }

}
