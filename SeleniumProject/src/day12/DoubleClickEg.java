package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://testautomationpractice.blogspot.com/");
		
		WebElement copyButton = driver.findElement(By.xpath("//button[@ondblclick='myFunction1()']"));
		
		Actions act = new Actions(driver);
		
		act.doubleClick(copyButton).build().perform();

	}

}
