package Driver.Selenium1;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTestNG {
	ChromeDriver driver = new ChromeDriver() ; 
  @Test
  public void f() {
		
		driver.navigate().to("http://www.google.com");
		String title = driver.getTitle();
		Assert.assertEquals(title, "Google");
		System.out.println("title is same");
		
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver","//Users//lillys//Desktop//Lilly//setup//chromedriver");
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.quit();
  }

}
