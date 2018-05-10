package resources;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

public class base {
	//define driver/prop publicly to use in all the classes
	public WebDriver driver;
	public Properties prop;
	public WebDriver initializeDriver() throws IOException
	{
		prop=new Properties();
		FileInputStream fis=new FileInputStream("//Users//mukka//eclipse-workspace//Blockchain-Intelligence-Group//src//resources//data.properties");
		prop.load(fis);
		String browserName = prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			// invoke the Chrome driver first.
			System.setProperty("webdriver.chrome.driver", "/Users/mukka/Desktop/Selenium Projects/chromedriver");
			//Create a driver object and import the WebDriver method.
			driver =new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equals("firefox"))
		{
			//invoke the firefox driver.
			System.setProperty("webdriver.gecko.driver", "/Users/mukka/Desktop/Selenium Projects/geckodriver");
			//Create a driver object and import the WebDriver method.
			 driver = new FirefoxDriver();
			 driver.manage().window().maximize();
		}
		else if(browserName.equals("safari"))
		{
			System.setProperty("webdriver.safari.driver","/Users/mukka/Desktop/Selenium Projects/SafariDriver");
			driver = new SafariDriver();
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
}