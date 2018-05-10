import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DoShopping {

	public WebDriver driver;
	
	By shopButton = By.id("comp-iy4cwgmq1label");
	By firstFrame = By.cssSelector("iframe[class='style-j5ggqnmkiframe']");
	By clickProduct1 = By.xpath("//a[@class='product-item' and @focus-on='product-item-4']");
	By clickProduct2 = By.xpath("//a[@class='product-item' and @focus-on='product-item-8']");
	By clickProduct3 = By.xpath("//a[@class='product-item' and @focus-on='product-item-3']");
	By secondFrame = By.cssSelector("iframe[class='style-j5ant54siframe']");
	By quantityInput = By.xpath("//input[@id='quantity-input' and @type='number']");
	By cartFrame= By.cssSelector("iframe[class='s_yOSHETPAPopupSkiniframe']");
	By viewCartButton= By.xpath("//a[@class='button-primary is-button-wide' and @data-hook='widget-view-cart-button']");
	By radioButton = By.xpath("//li//div[@class='color-label' and @aria-label='Black']");
	By checkOut = By.xpath("//button[@data-hook='checkout-button-button']");
	By thirdFrame = By.cssSelector("iframe[class='style-j4o2ugryiframe']");
	
	public DoShopping(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement clickShopButton()
	{
		return driver.findElement(shopButton);
	}

}
