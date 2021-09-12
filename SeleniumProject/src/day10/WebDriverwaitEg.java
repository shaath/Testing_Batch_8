package day10;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverwaitEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
//		driver.manage().timeouts().implicitlyWait(360, TimeUnit.SECONDS);
		WebDriverWait wait =new WebDriverWait(driver, 360);

//		driver.findElement(By.xpath("(//img[@alt='Mobiles'])[1]")).click();
//		WebElement ele = driver.findElement(By.xpath("(//img[@alt='Luggage'])[1]"));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//img[@alt='Acc Fest'])[1]")));
			
		
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", driver.findElement(By.xpath("(//img[@alt='Acc Fest'])[1]")));

	}

}
