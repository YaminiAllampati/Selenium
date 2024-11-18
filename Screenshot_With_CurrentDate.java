package take_Screenshots;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot_With_CurrentDate {

	public static void main(String[] args) throws IOException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		Date d = new Date();
		System.out.println(d.getTime());
		Date d1 = new Date(d.getTime());
		System.out.println(d1);
		String s = d1.toString();
		System.out.println("String format : " + s);
		System.out.println("length : " + s.length());
		//date
		String date = s.substring(8, 10);
		System.out.println("Date : "+ date);
		//Month
		String Month = s.substring(4, 7);
		System.out.println("Month : "+ Month);
		//year
		String year = s.substring(s.length()-4, s.length());
		System.out.println("Year : "+ year);
		//current Date
		String Current_date = date+"-"+Month+"-"+year;
		System.out.println("Current_date : " + Current_date);
		//current time
		String current_time = s.substring(11, 19).replace(":", "-");
		System.out.println("Current_Time : " + current_time);
		/* we have convert the : to - becoz - file name will not accept :
		String Output = current_time.replace(":", "-");
		System.out.println("Output : " + Output); */
	    TakesScreenshot t = driver;
		File sr = t.getScreenshotAs(OutputType.FILE);
		File des = new File("C:\\Users\\yamin\\OneDrive\\Desktop\\Selenium_SS\\Yam_" + Current_date +".png");
		FileHandler.copy(sr, des);
	}

}
