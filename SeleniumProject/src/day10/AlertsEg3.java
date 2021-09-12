package day10;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AlertsEg3 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://demo.automationtesting.in/Alerts.html");
		
		driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		
		driver.findElement(By.linkText("Alert with Textbox")).click();
		driver.findElement(By.xpath("//button[@onclick='promptbox()']")).click();
		Thread.sleep(5000);
		
		Alert alt = driver.switchTo().alert();
		
		alt.sendKeys("Selenium Training");
		Thread.sleep(5000);
		alt.accept();
	}

}
