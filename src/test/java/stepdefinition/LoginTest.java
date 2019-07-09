package stepdefinition;

//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

import pageObject.CheckoutPage;
import pageObject.LoginPageObject;
import pageObject.ProductListPage;

@SuppressWarnings("deprecation")
public class LoginTest {
	WebDriver driver;
	LoginPageObject lp;
	ProductListPage pl;
	CheckoutPage cp;
	
	@Given("^User is on home page$")
	public void user_is_on_home_page()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\training_d4.05.02\\Desktop\\New folder\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://10.232.237.143:443/TestMeApp");
		lp=new LoginPageObject(driver);
	}

	@When("^User enters username and password and click on Login button$")
	public void user_enters_username_and_password_and_click_on_Login_button() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@href='login.htm']")).click();
		Thread.sleep(3000);
		lp.un.sendKeys("Linda97");
		lp.pwd.sendKeys("linda123"); 
		lp.logBtn.click(); 
		
	}

	@Then("^User should be logged in and verified$")
	public void user_should_be_logged_in_and_verified() 
	{
		Assert.assertEquals(driver.getTitle(), "Home");
		
	}
	
	
	
}
