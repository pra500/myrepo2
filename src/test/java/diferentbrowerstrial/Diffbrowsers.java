package diferentbrowerstrial;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Diffbrowsers {

	public static void main(String[] args) {
		
		WebDriver driver;
		// TODO Auto-generated method stub
		
		
		/*
		 * System.setProperty("webdriver.gecko.driver",
		 * "C:\\Users\\Admin\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		 * driver=new FirefoxDriver(); driver.manage().timeouts().implicitlyWait(12,
		 * TimeUnit.SECONDS);
		 * 
		 * driver.manage().window().maximize();
		 * 
		 * driver.get("https://www.yatra.com/");
		 */
		
		 
		 System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\geckodriver-v0.26.0-win64 (2)\\geckodriver.exe");
			driver=new FirefoxDriver();
			 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
				
			 driver.manage().window().maximize();
			 
			 
			 driver.get("https://www.yatra.com/");
				
			
			 
		
		
		
	}

}
