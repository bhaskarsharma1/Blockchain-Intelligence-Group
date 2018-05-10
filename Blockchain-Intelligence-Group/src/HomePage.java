import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import resources.base;
//inheritance the base class into homepage class using extends.
public class HomePage  extends base{
	
	@Test
	public void selectProductandCheckout() throws IOException, InterruptedException
	{
		driver=initializeDriver();
		driver.get(prop.getProperty("url"));;
//		ThirdProduct tps = new ThirdProduct(driver);
//		tps.thirdProductSelection();
		FirstProduct fps = new FirstProduct(driver);
		fps.firstProductSelection();
//		SecondProduct sps = new SecondProduct(driver);
//		sps.secondProductSelection();
		
	}

}

