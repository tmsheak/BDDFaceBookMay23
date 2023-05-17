package cucumber.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.utilities.ReadProperties;

public class BaseTest {
	protected WebDriver driver;
	private ReadProperties properties;

	public void setUp() {
		properties = new ReadProperties();
		String browser = properties.getBrowser();
		String url = properties.getUrl();

		switch (browser) {
		case "chrome":
			driver = new ChromeDriver();			
			break;
		case "firefox":

			driver = new FirefoxDriver();
			break;
		case "edge":

			driver = new EdgeDriver();
			break;
		default:
			System.out.println("Invalid browser specified in properties file.");
		}

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.get(url);
	}
	public void closeApp() {
		if (driver !=null) {
		driver.quit();	
		} 
	}
}
