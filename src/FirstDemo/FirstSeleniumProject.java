package FirstDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSeleniumProject {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.MicrosoftWebDriver.driver", "C:/Users/Kostia/Documents/selenium dependencies/drivers/MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/watch?v=8UVNT4wvIGY");
	}
	
	

}
