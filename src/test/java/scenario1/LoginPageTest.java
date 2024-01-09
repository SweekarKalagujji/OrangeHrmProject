package scenario1;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class LoginPageTest 
{
  public WebDriver driver;
  @Test(priority=1,dataProvider="ExcelData",dataProviderClass=CustomData.class)
 
  public void loginTest(String un,String psw) throws InterruptedException 
  {
	 
	   driver = new ChromeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   
	   //username
	   driver.findElement(By.name("username")).sendKeys(un);
	   //password
	   driver.findElement(By.name("password")).sendKeys(psw);
	   Thread.sleep(5000);
	   Utility.getScreenshot(driver);
	    //button
	   driver.findElement(By.className("orangehrm-login-button")).click();
	   Thread.sleep(5000);
	   Utility.getScreenshot(driver);
	   //validation
	   Assert.assertTrue(un.contains("Admin"),"Username isn't valid");
	   System.out.println("Username is valid");
	   Assert.assertTrue(psw.contains("admin123"),"Password isn't valid");
	   System.out.println("Password is valid");
	  
  }
  
  @Test(priority=2, dependsOnMethods="loginTest")
  public void logoutTest() throws InterruptedException
  {
	  driver.findElement(By.className("oxd-userdropdown-icon")).click();
	  Thread.sleep(5000);
	  driver.findElement(By.linkText("Logout")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("login"),"Logout isn't valid");
	   System.out.println("Logout is valid");
   } 
}
