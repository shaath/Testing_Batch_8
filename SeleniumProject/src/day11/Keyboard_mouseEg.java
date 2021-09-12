package day11;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_mouseEg {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://google.com");
		Thread.sleep(5000);
		WebElement gmail = driver.findElement(By.linkText("Gmail"));
		
		Actions act = new Actions(driver);
		
		act.moveToElement(gmail).build().perform();
		Thread.sleep(5000);
		act.contextClick().build().perform();
		Thread.sleep(5000);
		
		act.sendKeys(Keys.chord("T")).build().perform();
	}

}
