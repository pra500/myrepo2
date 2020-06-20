package simplypractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practicestaicmethodcalling {
	private static WebDriver driver;
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Pragti\\Desktop\\chromedriver.exe");
		driver= new ChromeDriver();					
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();		
		//driver.get("https://www.irctc.co.in/nget/train-search");
		driver.get("http://www.naukri.com/");
		add();
		
		

	}
	
	public static void add() {
		System.out.println(driver.getTitle());
		
		
	}

}
