package simplypractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class Logsprac2Test {
	
	private static WebDriver driver;
	
	
 
  @BeforeMethod
  public void beforeMethod() {
	  
	    Logger log1=Logger.getLogger("Logsprac2Test");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver= new ChromeDriver();
	  log1.info("brow laun");
	  
	
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		
		log1.info("impicitly");
		
		driver.manage().window().maximize();	
		
		log1.info("app");
			driver.get("https://www.seleniumeasy.com/test/javascript-alert-box-demo.html");
	  
	  
  }
  
  @Test
  public void f() throws InterruptedException {
	  
	  
	  
	  String act="Do you really want to delete this Customer?";
  	  
	  driver.findElement(By.xpath("//input[@value='Submit']")).click();
	  Alert alt=driver.switchTo().alert();
	  String exp=alt.getText();
	  Thread.sleep(3000);
	  if(act.equals(exp))
	  {
		  System.out.println("message same");
	  }
	  
	  else
	  {
		  System.out.println("message not same");
		  		  
	  }
	  
	  //alt.dismiss();
		/*
		 * Thread.sleep(2000); driver.findElement(By.name("cusid")).sendKeys("123456");
		 * 
		 * driver.findElement(By.xpath("//input[@value='Submit']")).click();
		 */
	   
	  alt.accept();
	  Thread.sleep(5000);
	  
	  
	  
  }
  
  

  @AfterMethod
  public void afterMethod() {
	  
	  driver.quit();
  }

}
