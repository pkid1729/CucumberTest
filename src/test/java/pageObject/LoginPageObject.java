package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObject {

	WebDriver driver;
	public LoginPageObject(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
		
	}
	
	@FindBy(id="userName")
	public WebElement un;
	
	@FindBy(id="password")
	public WebElement pwd;
	
	@FindBy(name="Login")
	public WebElement logBtn;
	
	
}
