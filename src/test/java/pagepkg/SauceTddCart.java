package pagepkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SauceTddCart {
WebDriver driver;
	
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-backpack\"]")
	WebElement sbackpack;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bike-light\"]")
	WebElement sbikelight;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-bolt-t-shirt\"]")
	WebElement stshirt;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-fleece-jacket\"]")
	WebElement sjacket;
	@FindBy(xpath="//*[@id=\"add-to-cart-sauce-labs-onesie\"]")
	WebElement sonesie;
	@FindBy(xpath="//*[@id=\"add-to-cart-test.allthethings()-t-shirt-(red)\"]")
	WebElement stshirtred;
	@FindBy(xpath="//*[@id=\"shopping_cart_container\"]/a")
	WebElement scartbutton;
	@FindBy(id="checkout")
	WebElement scheckoutbutton;
	
	public SauceTddCart(WebDriver driver) 
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public void addcart1()
	{
		sbackpack.click();
		sbikelight.click();
	}
	public void addcart2()
	{
		stshirt.click();
		sjacket.click();
		sonesie.click();
		stshirtred.click();
	}
	public void cartbutton()
	{
		scartbutton.click();
	}
	public void checkoutbutton()
	{
		scheckoutbutton.click();
	}
	


}
