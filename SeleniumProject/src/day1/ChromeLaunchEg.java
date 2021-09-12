package day1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeLaunchEg {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Batch\\Automation\\Jars\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://facebook.com");

	}

}
