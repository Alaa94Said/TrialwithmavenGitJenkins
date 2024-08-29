package Driver.Selenium1;


import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Chrome {

	
	@ Test
	public static void browserOpen() {
		
	
		System.setProperty("webdriver.chrome.driver","//Users//lillys//Desktop//Lilly//setup//chromedriver");
		ChromeDriver driver = new ChromeDriver() ; 
		driver.navigate().to("http://www.google.com");
		String title = driver.getTitle();
		System.out.println("title is same");
		driver.quit();

	}

}
