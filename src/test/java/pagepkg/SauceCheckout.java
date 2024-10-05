package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceCheckout {
WebDriver driver;
	
	@FindBy(name="firstName")
	WebElement sfirstnme;
	@FindBy(name="lastName")
	WebElement slastnme;
	@FindBy(name="postalCode")
	WebElement szipcode;
	@FindBy(id="continue")
	WebElement scontinuebutton;
	@FindBy(id="finish")
	WebElement sfinishbutton;
	@FindBy(id="back-to-products")
	WebElement sbackhomebutton;
	@FindBy(xpath="//*[@id=\"react-burger-menu-btn\"]")
	WebElement shamburgermenu ;
	@FindBy(xpath="/html/body/div/div/div/div[1]/div[1]/div[1]/div/div[2]/div[1]/nav/a[3]")
	WebElement slogoutbutton ;
	
	
	
	
	public SauceCheckout(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	public void setValue2(String firstname,String lastname,String zipcode)
	{
		sfirstnme.sendKeys(firstname);
		slastnme.sendKeys(lastname);
		szipcode.sendKeys(zipcode);
	}
	public void contibuttonss()
	{
		scontinuebutton.click();
		sfinishbutton.click();
		sbackhomebutton.click();
	}
	public void homepage()
	{
	
		shamburgermenu.click();
		slogoutbutton.click();
	}

		
		
	

}
