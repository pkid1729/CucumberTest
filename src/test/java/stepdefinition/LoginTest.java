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
//import junit.framework.Assert;
import pageObject.CheckoutPage;
import pageObject.LoginPageObject;
import pageObject.ProductListPage;

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
	
	
	
	@Given("^Navigate to All categories - electronic and Head phone$")
	public void navigate_to_All_categories_electronic_and_Head_phone() throws InterruptedException 
	{
		
		WebElement search = driver.findElement(By.id("myInput"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(search, Keys.SHIFT).perform();
		
		act.sendKeys("h").pause(3000).sendKeys("e").pause(3000).sendKeys("a").pause(3000).sendKeys("d").pause(3000).build().perform();
		
		driver.findElement(By.xpath("//input[@value='FIND DETAILS']")).click();
		
		//WebElement headphoneElement = driver.findElement(By.xpath("//div[contains(test(),'Headphone')]"));
		
		//act.moveToElement(headphoneElement).click().build().perform();
		
		Thread.sleep(3000);
		
		/*driver.get("http://10.232.237.143:443/TestMeApp");
		
		pl=new ProductListPageObject(driver);
		
		Actions actions = new Actions(driver);
		actions.moveToElement(pl.all).moveToElement(pl.e).click().moveToElement(pl.h).click().build().perform();*/
	}

	@Given("^Add product into shopping cart$")
	public void add_product_into_shopping_cart() 
	{
		driver.findElement(By.partialLinkText("Add to cart")).click();
		driver.findElement(By.partialLinkText("Cart")).click();
		
	}

	@When("^proceed to checkout$")
	public void proceed_to_checkout() 
	{
		driver.findElement(By.partialLinkText("Checkout")).click();
	}

	@When("^select bank and add credentials$")
	public void select_bank_and_add_credentials() throws InterruptedException 
	{
		driver.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath("//label[contains(text(),'Andhra Bank')]")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Continue')]")).click();
		
		cp.uname.sendKeys("123456");			
		cp.pwd.sendKeys("Pass@456"); 
		
		driver.findElement(By.xpath("//input[@value='LOGIN']")).click();
		cp.pwds.sendKeys("Trans@456");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
	}

	@Then("^redirected to the thank you page$")
	public void redirected_to_the_thank_you_page()
	{
	 
	}
}
