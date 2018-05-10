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

public class testCase {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "/Users/mukka/Desktop/Selenium Projects/chromedriver");
		//Create a driver object and import the WebDriver method.
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		// Load the web page
		driver.get("https://arielkiell.wixsite.com/interview");
		//Maximize the window.
		driver.manage().window().maximize();
		//Click on Shop button.
		driver.findElement(By.id("comp-iy4cwgmq1label")).click();
//		System.out.println(driver.findElements(By.tagName("iframe")).size());
//		List<WebElement> list = driver.findElements(By.tagName("iframe"));
//		for(WebElement ele:list){
//		   String className = ele.getAttribute("class");
//		   System.out.println("Class name = "+className);
//		}
		//switch to the current frame to access the elements in the frame.
		driver.switchTo().frame(driver.findElement(By.cssSelector("iframe[class='style-j5ggqnmkiframe']")));
		//Creating mouse action
		JavascriptExecutor scr = (JavascriptExecutor) driver;
		Actions a = new Actions(driver);
		//Move the mouse cursor on the product 3
		a.moveToElement(driver.findElement(By.xpath("//a[@class='product-item' and @focus-on='product-item-5']")));
		Thread.sleep(5000);
		//Click on the 3 product.
		driver.findElement(By.xpath("//a[@class='product-item' and @focus-on='product-item-5']")).click();
		// come out of the frame.
		driver.switchTo().defaultContent();
		Thread.sleep(5000);
		//print if any frame are available in this page.
//		System.out.println("i'm a product:"+driver.findElements(By.tagName("iframe")).size());
//		List<WebElement> list1 = driver.findElements(By.tagName("iframe"));
//		for(WebElement ele:list1){
//		String className = ele.getAttribute("class");
//		System.out.println("Class name1 = "+className);
//		}
		WebElement frame=driver.findElement(By.cssSelector("iframe[class='style-j5ant54siframe']"));
		System.out.println("frame is enabled:"+frame.isEnabled());
		// wait method2
		WebDriverWait wait=new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[class='style-j5ant54siframe']")));
		Thread.sleep(10000);
		//Move the mouse cursor on the radio button and select the color.
		Actions radiobutton=new Actions(driver);
		radiobutton.moveToElement(driver.findElement(By.xpath("//li//div[@class='color-label' and @aria-label='White']")));
		driver.findElement(By.xpath("//li//div[@class='color-label' and @aria-label='White']")).click();
		Thread.sleep(10000);
		//Move the mouse cursor on the quantity.
		Actions quantity=new Actions(driver);
		quantity.moveToElement(driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']"))).build().perform();
		driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']")).clear();
		driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']")).sendKeys("1");
		driver.findElement(By.xpath("//input[@id='quantity-input' and @type='number']")).sendKeys(Keys.ENTER);
		// Switch to default window.
		driver.switchTo().defaultContent();
		//Wait Method
		Thread.sleep(5000);
		// Switch to second frame.
		WebElement frame2=driver.findElement(By.cssSelector("iframe[class='s_yOSHETPAPopupSkiniframe']"));
		System.out.println("frame is enabled:"+frame2.isEnabled());
		//wait method2
		WebDriverWait wait1=new WebDriverWait(driver,20);
		wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.cssSelector("iframe[class='s_yOSHETPAPopupSkiniframe']")));
		//Wait Method
		Thread.sleep(10000);
		//Move the mouse cursor on the product
		Actions a3=new Actions(driver);
		a3.moveToElement(driver.findElement(By.xpath("//a[@class='button-primary is-button-wide' and @data-hook='widget-view-cart-button']"))).build().perform();
		// click on the button.
		driver.findElement(By.xpath("//a[@class='button-primary is-button-wide' and @data-hook='widget-view-cart-button']")).click();
		Thread.sleep(500);
		driver.switchTo().defaultContent();
		//Checkout frame
		WebElement fram=driver.findElement(By.cssSelector("iframe[class='style-j4o2ugryiframe']"));
		System.out.println("fram is enabled:"+fram.isEnabled());
		driver.switchTo().frame(fram);
		Thread.sleep(500);
		String total = driver.findElement(By.id("total-sum")).getText();
		System.out.println(total);
		String amount = "C$75.00";
		System.out.println(amount);
		if(total.equals(amount))
		{
			System.out.println("test passes");
			//Move the mouse cursor on the product
			Actions a4=new Actions(driver);
			a4.moveToElement(driver.findElement(By.xpath("//button[@data-hook='checkout-button-button']"))).build().perform();
			driver.findElement(By.xpath("//button[@data-hook='checkout-button-button']")).click();	
		}
		else
		{
			System.out.println("test failed");
		}
		

		
	}
	
}
