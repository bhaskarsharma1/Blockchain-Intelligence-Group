import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class brokenLinks {

	public static void main(String[] args) throws InterruptedException, MalformedURLException, IOException {
		// TODO Auto-generated method stub
		// invoke the Chrome driver first.
				System.setProperty("webdriver.chrome.driver", "/Users/mukka/Downloads/chromedriver");
				//Create a driver object and import the WebDriver method.
				WebDriver driver=new ChromeDriver();
				// Load the web page
				//driver.get("https://arielkiell.wixsite.com/interview");
				driver.get("https://arielkiell.wixsite.com/interview/product-page/i-m-a-product-5");
				Thread.sleep(3000);
				// Click on the Shop.
//				driver.findElement(By.xpath("//p[text()='Shop']")).click();
//				Thread.sleep(3000);
				//driver.findElement(By.linkText("https://arielkiell.wixsite.com/interview/product-page/i-m-a-product-4"));
				
				//1. get the list of all the links and images.
				List<WebElement> linksList = driver.findElements(By.tagName("iframe"));
				
				for(WebElement ele:linksList)
					System.out.println(ele.getAttribute("class"));
				
			

//				linksList.addAll(driver.findElements(By.tagName("img")));
//				List<WebElement> activeLinks = new ArrayList<WebElement>();
//				System.out.println("size of full links and image -->"+ linksList.size());
//				//2. iterate linksList: exclude all the links/images - doesn't have any href attribute
//				for(int i=0; i<linksList.size(); i++) {
//					System.out.println(linksList.get(i).getAttribute("href"));
//					if(linksList.get(i).getAttribute("href") != null && (! linksList.get(i).getAttribute("href").contains("mailto"))) {
//						activeLinks.add(linksList.get(i));
//					}
//				}
//				// get the size of active link list:
//				System.out.println("size of active links and image --> "+ activeLinks.size());
//				
//				//3. check the href url, with http connection api:
//				//200 -- Ok
//				//404 -- not found
//				//500 -- internal error
//				//400 -- bad request
//				for(int j=0; j<activeLinks.size(); j++) {
//					HttpURLConnection connection = (HttpURLConnection)new URL(activeLinks.get(j).getAttribute("href")).openConnection();
//					connection.connect();
//					String response = connection.getResponseMessage(); //OK
//					connection.disconnect();
//					System.out.println(activeLinks.get(j).getAttribute("href")+"--->"+response);
//				}

	}

}




//2
//Class name = style-j5ggqnmkiframe
//Class name = style-j4cl4sbeiframe
//5
//Class name = style-j4i70x3liframe		
//Class name = 
//Class name = style-j5ggqnmkiframe
//Class name = style-j4cl4sbeiframe