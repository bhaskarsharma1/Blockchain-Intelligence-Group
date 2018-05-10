
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testCase1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		// invoke the Chrome driver first.
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
		//Create a driver object and import the WebDriver method.
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Load the web page
		driver.get("https://arielkiell.wixsite.com/interview");
		//Maximize the window.
		driver.manage().window().maximize();
		//Click on Shop button.
		driver.findElement(By.id("comp-iy4cwgmq1label")).click();
		System.out.println(driver.findElements(By.tagName("iframe")).size());
		List<WebElement> list = driver.findElements(By.tagName("iframe"));
		for(WebElement ele:list){
		   String className = ele.getAttribute("class");
		   System.out.println("Class name = "+className);
		}
		//switch to the current frame to access the elements in the frame.
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='style-j5ggqnmkiframe']")));
		//Creating mouse action
		JavascriptExecutor scr = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);
        //Move the mouse cursor on the product 3
		a.moveToElement(driver.findElement(By.xpath("//a[@class='product-item' and @focus-on='product-item-2']"))).build().perform();
		//Click on the 3 product.
		driver.findElement(By.xpath("//a[@class='product-item' and @focus-on='product-item-2']")).click();
		// come out of the frame.
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//print if any frame are available in this page.
		System.out.println("i'm a product:"+driver.findElements(By.tagName("iframe")).size());
		List<WebElement> list1 = driver.findElements(By.tagName("iframe"));
		for(WebElement ele:list1){
		   String className = ele.getAttribute("class");
		   System.out.println("Class name1 = "+className);
		}
		WebElement frame=driver.findElement(By.cssSelector("iframe[class='style-j5ant54siframe']"));
		System.out.println("frame is enabled:"+frame.isEnabled());
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[class='style-j5ant54siframe']")));
		Thread.sleep(10000);
		Actions a1=new Actions(driver);
		a1.moveToElement(driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']"))).build().perform();
		driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']")).clear();
		driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']")).sendKeys("3");
		driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']")).sendKeys(Keys.ENTER);
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		WebElement frame2=driver.findElement(By.cssSelector("iframe[class='s_yOSHETPAPopupSkiniframe']"));
		System.out.println("frame is enabled:"+frame2.isEnabled());
		WebDriverWait wait1=new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[class='s_yOSHETPAPopupSkiniframe']")));
		Thread.sleep(10000);
		Actions a2=new Actions(driver);
		a2.moveToElement(driver.findElement(By.xpath("//a[@class='button-primary is-button-wide' and @data-hook='widget-view-cart-button']"))).build().perform();
		driver.findElement(By.xpath("//a[@class='button-primary is-button-wide' and @data-hook='widget-view-cart-button']")).click();
	}
	
}