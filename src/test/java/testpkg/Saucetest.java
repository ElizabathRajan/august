
package testpkg;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

import basepkg.Saucebase;
import pagepkg.SauceCheckout;
import pagepkg.SauceTddCart;
import pagepkg.Sauceloginpage;
import utilitypkg.Sauceutility;

@Test
public class Saucetest extends Saucebase {

public void test() throws InterruptedException {
  
    Sauceloginpage ob = new Sauceloginpage(driver);
    String x2 = "F:\\LUMINAR\\Sauceproject.xlsx";  
    String sheet = "Sheet1";  
   
    int rowCount = Sauceutility.getRowCount(x2, sheet);
    for (int i = 1; i <= rowCount; i++) {

        String username = Sauceutility.getCellValue(x2, sheet, i, 0);
        String password = Sauceutility.getCellValue(x2, sheet, i, 1);
        
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
        ob.setValue(username, password);
        
        ob.loginclick();
        ob.refreshPage(); 
        Thread.sleep(3000);  
    }
        
        JavascriptExecutor js=(JavascriptExecutor) driver;
        SauceTddCart ob1=new SauceTddCart(driver);
        ob1.addcart1();
        js.executeScript("window.scrollBy(0,1000)", "");
        ob1.addcart2();
        js.executeScript("window.scrollBy(0,1000)", "");
        Thread.sleep(2000);
        ob1.cartbutton();
        ob1.checkoutbutton();
        
        SauceCheckout ob2=new SauceCheckout(driver);
        ob2.setValue2("Bush", "Doc", "678876");
        ob2.contibuttonss();
        ob2.homepage();
       
        
    }
}

