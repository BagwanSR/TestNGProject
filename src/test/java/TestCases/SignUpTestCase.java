package TestCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import PageObjectModel.LoginPageObjectModle;
import PageObjectModel.SignUpPageObjectModle;
import Resources.BaseClass;
import Resources.CommonMethods;
import Resources.Constants;

public class SignUpTestCase extends BaseClass {

	@Test
	public void verifysignup() throws IOException, InterruptedException {

		
		
		LoginPageObjectModle LPO = new LoginPageObjectModle(driver);

		LPO.ClickOntryForFree().click();
		
		SignUpPageObjectModle SPO= new SignUpPageObjectModle(driver);
		
		Thread.sleep(5000);
		
		SPO.EnterFirstname().sendKeys(Constants.firstname);
		SPO.EnterLastname().sendKeys(Constants.lastname);
		SPO.EnterJobtilte().sendKeys(Constants.Jobtilte);
		SPO.EnterEmail().sendKeys(Constants.Email);
		SPO.EnterPhone().sendKeys(Constants.Phone);
		
		
		CommonMethods.SelectDropdownn(SPO.SelectEmploye(), 2);
		
		CommonMethods.SelectDropdownn(SPO.EnterCountry(), 1);
		
		
	}

}
