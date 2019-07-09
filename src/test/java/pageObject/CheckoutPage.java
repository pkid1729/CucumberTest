package pageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

	@FindBy(xpath="//input[@value='Proceed to Pay']")
	public WebElement ptp;
	
	@FindBy(xpath="//label[contains(text(),'Andhra Bank')]")
	public WebElement b;
	
	@FindBy(xpath="//a[@id='btn']")
	public WebElement btn;
	
	@FindBy(xpath="//input[@name ='username']")
	public WebElement uname;
	
	@FindBy(xpath="//input[@name ='password']")
	public WebElement pwd;
	
	@FindBy(xpath="//input[@value='LOGIN']")
	public WebElement lgnbtn;
	
	@FindBy(xpath="//input[@value='PASSWORD']")
	public WebElement pwds;
	
	@FindBy(xpath="//input[@type='submit']")
	public WebElement sbmtbtn;
}
