package Resources;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass { // purpose is to launch the browser

	  
   public WebDriver driver;
   
   
	public void BrowserInitialization() throws IOException {

		// to read the file
		FileInputStream fis = new FileInputStream(
				System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		// to access the the properties
		Properties prop = new Properties();

		prop.load(fis);

		String BrowserName = prop.getProperty("browser");

		if (BrowserName.equalsIgnoreCase("chrome")) {
                  driver = new ChromeDriver();

		} else if (BrowserName.equalsIgnoreCase("firefox")) {

			WebDriver driver1 = new FirefoxDriver();

		}

		else {

			System.out.println("Please Enter Valid Browsername");

		}
	}

	@BeforeMethod
    public void launch() throws IOException {
    	
		BrowserInitialization();
 	   
 	   driver.get("https://login.perf1h.pc-rnd.salesforce.com/");
    }




}
