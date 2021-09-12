package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoFillersEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.redbus.in/");
		
		driver.findElement(By.id("src")).sendKeys("H");
		Thread.sleep(5000);

		List<WebElement> cities_list = driver.findElements(By.xpath("//ul[@class='autoFill']/li"));
		
		System.out.println(cities_list.size());
		
		for (int i = 0; i < cities_list.size(); i++) {
			String city = cities_list.get(i).getText();
			System.out.println(city);
			
			if (city.equalsIgnoreCase("Haridwar")) {
				cities_list.get(i).click();
				break;
			}
		}
		
	}

}
