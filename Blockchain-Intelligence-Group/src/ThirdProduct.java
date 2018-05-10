import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import resources.base;

public class ThirdProduct extends base{
	
public ThirdProduct(WebDriver driver) {
		// TODO Auto-generated constructor stub
	this.driver=driver;
	}

public void thirdProductSelection() throws InterruptedException
{
	DoShopping ds= new DoShopping(driver);
	//Clicking the shop button
	driver.findElement(ds.shopButton).click();
	Thread.sleep(1000);
	//switch to the current frame to access the elements in the frame.
	driver.switchTo().frame(driver.findElement(ds.firstFrame));
	//Creating mouse action
	JavascriptExecutor scr = (JavascriptExecutor) driver;
	Actions a = new Actions(driver);
	//Move the mouse cursor on the product
	a.moveToElement(driver.findElement(ds.clickProduct3)).build().perform();
	//Click on theproduct.
	driver.findElement(ds.clickProduct3).click();
	// come out of the frame.
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	WebElement frame=driver.findElement(ds.secondFrame);
	//Check this above frame is enable or disabled.
	System.out.println("frame is enabled:"+frame.isEnabled());
	// wait and switch to the frame method
	WebDriverWait wait=new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ds.secondFrame));
	Thread.sleep(10000);
	//Move the mouse cursor on the radio button and select the color.
	Actions radiobutton=new Actions(driver);
	radiobutton.moveToElement(driver.findElement(ds.radioButton));
	driver.findElement(ds.radioButton).click();
	Thread.sleep(10000);
	//Move the mouse cursor on the quantity.
	Actions a1=new Actions(driver);
	a1.moveToElement(driver.findElement(ds.quantityInput)).build().perform();
	driver.findElement(ds.quantityInput).sendKeys(Keys.ARROW_UP);
	driver.findElement(ds.quantityInput).sendKeys(Keys.ARROW_DOWN);
	driver.findElement(ds.quantityInput).sendKeys(Keys.ENTER);
	// Switch to default window.
	driver.switchTo().defaultContent();
	Thread.sleep(5000);
	// Switch to second frame.
	WebElement frame2=driver.findElement(ds.cartFrame);
	//Check this above frame is enable or disabled.
	System.out.println("frame is enabled:"+frame2.isEnabled());
	//wait method2
	WebDriverWait wait1=new WebDriverWait(driver,20);
	wait1.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(ds.cartFrame));
	//Move the mouse cursor on the product
	Actions a2=new Actions(driver);
	a2.moveToElement(driver.findElement(ds.viewCartButton)).build().perform();
	// click on the button.
	driver.findElement(ds.viewCartButton).click();
	Thread.sleep(5000);
}

}
