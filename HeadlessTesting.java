package selenium_Learning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {

		ChromeOptions op = new ChromeOptions();
		op.addArguments("--headless");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
	}

}
