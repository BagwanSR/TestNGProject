package Resources;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.SoftAssert;

public class CommonMethods {

	
	
	public static  void SelectDropdownn(WebElement dropdown , int index) {
		
		
		Select s= new Select(dropdown);
		
		s.selectByIndex(index);
		
			}
	
	  public static void AssertionMethod(String actualstring, String ExpectedString ) {
		  
		  SoftAssert assertion= new SoftAssert();
          
          
          String Actual =actualstring;
			String Expected = ExpectedString;

			assertion.assertEquals(Actual, Expected);

			assertion.assertAll();
	
		  
		  
	  }
	
	
	
	
}
