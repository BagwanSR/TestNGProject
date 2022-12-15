package TestCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import PageObjectModel.LoginPageObjectModle;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class LoginTestCase extends BaseClass {

	@Test
      public void Method1() throws IOException {	
    	   
    	  LoginPageObjectModle LPO= new LoginPageObjectModle(driver);
            
            LPO.EnterUsername().sendKeys(Constants.username);
            LPO.EnterPassword().sendKeys(Constants.password);
            LPO.ClickOnLogin().click(); 
    	 
            
            CommonMethods.AssertionMethod(LPO.ClickOnError().getText(), Constants.Error);
    
	
	}

	
}
