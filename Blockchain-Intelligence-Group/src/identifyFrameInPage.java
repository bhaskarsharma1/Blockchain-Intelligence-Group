import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class identifyFrameInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke the Chrome driver first.
		System.setProperty("webdriver.chrome.driver", "/Users/mukka/Downloads/chromedriver");
		//Create a driver object and import the WebDriver method.
		WebDriver driver= new ChromeDriver();
		//Wait method to wait for 5 seconds.
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.get("https://arielkiell.wixsite.com/interview/product-page/i-m-a-product-5");
		//Maximize the window.
		driver.manage().window().maximize();
		//Click on Shop button.
		//driver.findElement(By.id("comp-iy4cwgmq1label")).click();
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='style-j5ant54siframe']")));
		JavascriptExecutor js=(JavascriptExecutor) driver;
		List<WebElement> list1 = driver.findElements(By.xpath("//button[@class='button-primary is-button-wide button-add-to-cart' and @focus-on='add-to-cart']"));
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    js.executeScript("arguments[0].scrollIntoView(true)",list1);

	}
	
	public static int findFrameNumber(WebDriver driver, By by) {
		int i;
		int frameCount=driver.findElements(by).size();
		for(i=0; i<frameCount; i++) {
			driver.switchTo().frame(i);
			int count=driver.findElements(by).size();
			if(count>0) {
				break;
			}
			else {
				System.out.println("continue looping");
			}
		}
		return i;
	}
	
	
}
