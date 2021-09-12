package day7;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/");
		
		WebElement drop = driver.findElement(By.id("drlist"));
		
		Select s = new Select(drop);
		
//		s.selectByIndex(10);
//		Thread.sleep(5000);
//		s.selectByValue("Hyderabad");
//		Thread.sleep(5000);
//		s.selectByVisibleText("boston");
		
		List<WebElement> items = s.getOptions();
		System.out.println(items.size());
		
		for (int i = 0; i < items.size(); i++) {
			s.selectByIndex(i);
			String cName = items.get(i).getText();
			System.out.println(cName);
		}
	}

}
