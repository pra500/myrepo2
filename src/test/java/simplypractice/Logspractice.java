package simplypractice;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Logspractice {
	
	public static void main(String[] args) throws InterruptedException
	{
		Logger logger=Logger.getLogger("Logspractice");
		PropertyConfigurator.configure("Log4j.properties");
		
		
		 WebDriver driver=null;
		 
		 
		 logger.info("browser launched");
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver= new ChromeDriver();	
			
			 logger.info("browser maximized");
			driver.manage().window().maximize();	
			
			logger.info("app launch");
			driver.get("https://login.yahoo.com/account/create?src=noSrc&specId=yidReg");	
			
			logger.info("implicitly wait stmt");
			driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
			Thread.sleep(10);
			
			driver.findElement(By.name("firstName")).sendKeys("pargti");			
			Thread.sleep(3000);
			
			logger.info("userlastname in app");
			driver.findElement(By.id("usernamereg-lastName")).clear();
			driver.findElement(By.id("usernamereg-lastName")).sendKeys("gup");
			Thread.sleep(3000);
			
			driver.findElement(By.id("usernamereg-password")).clear();
			driver.findElement(By.id("usernamereg-password")).sendKeys("pra18@123");
			Thread.sleep(3000);
			
			driver.close();
			
		
	}

}
