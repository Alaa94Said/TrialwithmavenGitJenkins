package Driver.Selenium1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;




public class Lilly {

		public static WebDriver driver;
		

		@BeforeSuite
		
		public void startDriver() {
			System.setProperty("webdriver.chrome.driver","/opt/homebrew/bin/chromedriver");
			 driver = new ChromeDriver() ; 

			driver.manage().window().maximize();
			driver.navigate().to("https://demo.nopcommerce.com/");
			// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		}
		
		
		@Test
		public void userRegSuccessfully() {
			
			
			System.out.println("successs");
			driver.quit();
			}
		
		
		@AfterSuite
		public void stopDriver() {
			// driver.quit();
			driver.manage().window().minimize();
		}
}


