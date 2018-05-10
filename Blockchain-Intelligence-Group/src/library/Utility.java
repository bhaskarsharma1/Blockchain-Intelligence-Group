package library;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Utility {
	
	public static void takeScreenShot(WebDriver driver, String screenshotName)
	{
		
		try {
			TakesScreenshot tss= (TakesScreenshot)driver;
			File source = tss.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Exception while taking the screenshot "+ e.getMessage());
		}
		
		
//		try {
//			Screenshot screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(driver); 
//			ImageIO.write(screenshot.getImage(), "PNG", new File("./Screenshots/"+screenshotName+".png"));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}

}
