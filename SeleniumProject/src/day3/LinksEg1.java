package day3;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println("The number of links in google page is : "+links.size());
		
		for (int i = 0; i < links.size(); i++) {
			
			String ltext = links.get(i).getText();
			System.out.println(ltext);
		}
	}

}
