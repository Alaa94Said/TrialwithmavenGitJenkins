package Driver.Selenium1;

import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

	public static void main(String[] args) {
		// lilly
		

		System.setProperty("webdriver.gecko.driver","/Users/lillys/Desktop/Lilly/setup/geckodriver 2" );
		FirefoxDriver driver = new FirefoxDriver(); 
		driver.navigate().to("http://www.amazon.de");
		driver.quit();

	}

}
