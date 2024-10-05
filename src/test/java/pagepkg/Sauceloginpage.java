package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Sauceloginpage {
	
	WebDriver driver;
	
	@FindBy(id="user-name")
	WebElement susrnme;
	@FindBy(id="password")
	WebElement spswrd;
	@FindBy(id="login-button")
	WebElement slogin;
	
	public Sauceloginpage(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void setValue (String username,String password)
	{
	    susrnme.clear();
	    spswrd.clear();
		susrnme.sendKeys(username);
		spswrd.sendKeys(password);
	}
	public void loginclick()
	{
		slogin.click();
		
	}
	  public void refreshPage() {
	     driver.navigate().refresh();
	    }
	
}
