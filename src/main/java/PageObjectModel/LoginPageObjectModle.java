package PageObjectModel;

import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

         

public class LoginPageObjectModle {
	  public WebDriver driver; 
     // this driver has no scope 
	private By username = By.xpath("//input[@id='username']");

	private By password = By.xpath("//input[@id='password']");

	private By login = By.xpath("//input[@id='Login']");
	
	private By TryForFree = By.xpath("//a[@id='signup_link']");
	
	private By Error=By.xpath("//div[@id='error']");
	
	
	

	public LoginPageObjectModle(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver=driver2;
	}

	public WebElement EnterUsername() {
		
         return  driver.findElement(username);
		
	}
	
	public WebElement EnterPassword() {
		
		return driver.findElement(password);
		
	}
	
	
	public WebElement ClickOnLogin() {
		
		return driver.findElement(login);
		
	}
	
	public WebElement ClickOntryForFree() {
		
		return driver.findElement(TryForFree);
	}
	
	
	public WebElement ClickOnError() {
		return driver.findElement(Error);
		
	}
	
	
	
	
}
