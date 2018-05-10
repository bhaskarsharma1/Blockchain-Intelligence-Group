import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class identifyFramesInPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// invoke the Chrome driver first.
		System.setProperty("webdriver.chrome.driver", "/Users/mukka/Downloads/chromedriver");
		//Create a driver object and import the WebDriver method.
		WebDriver driver= new ChromeDriver();
		// Load the web page
		driver.get("https://arielkiell.wixsite.com/interview");
		int nubmer=findFrameNumber(driver.findElement(By.cssSelector("iframe[class='style-j5ggqnmkiframe']")));
		driver.switchTo().frame(nubmer);
		driver.close();
	}
	
	private static int findFrameNumber(WebElement findElement) {
		// TODO Auto-generated method stub
		return 0;
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
