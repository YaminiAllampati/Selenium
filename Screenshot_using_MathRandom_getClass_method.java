package take_Screenshots;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_using_MathRandom_getClass_method {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.in/");
		driver.manage().window().maximize();
		//TakesScreenshot is an interface
		TakesScreenshot ts = driver;
		//getScreenshotAs() - its abstract method of TakesScreenshot Interface
		File Source = ts.getScreenshotAs(OutputType.FILE);
        //   new  ScreenShot_using_getClass_Method().getClass(); - to get the class name
		//or    
		//ScreenShot_using_getClass_Method s = new ScreenShot_using_getClass_Method();
		//s.getClass();
		File destination = new File("C:\\Users\\yamin\\OneDrive\\Desktop\\Selenium_SS\\Yamini" + Math.random()+new  ScreenShot_using_getClass_Method().getClass() +".jpg");
		//fileHandler class is used to copy the file from soruce to destination
		FileHandler.copy(Source, destination);
	}

}
