package selenium_123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class chrome_browser {
	@Test
	public void run()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	}
	

}
