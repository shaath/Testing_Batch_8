package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.guru99.com/test/newtours/register.php");
		
		WebElement cDrop = driver.findElement(By.name("country"));
		
		Select s = new Select(cDrop);
		
		List<WebElement> cities = s.getOptions();
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++) {
			String city = cities.get(i).getText();
			System.out.println(city);
			
			s.selectByVisibleText(city);
		}

	}

}
