package FirstDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.MicrosoftWebDriver.driver", "C:/Users/Kostia/Documents/selenium dependencies/drivers/MicrosoftWebDriver.exe");
		WebDriver driver=new EdgeDriver();
		driver.get("https://www.youtube.com/watch?v=8UVNT4wvIGY");
	}
	
	
}