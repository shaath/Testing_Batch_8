package day13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileUploadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();

		driver.get("http://orangehrm.qedgetech.com");

		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		driver.findElement(By.name("txtPassword")).sendKeys("Qedge123!@#");
		driver.findElement(By.id("btnLogin")).click();

		Thread.sleep(5000);
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		Thread.sleep(3000);

		driver.findElement(By.id("photofile")).sendKeys("C:\\Users\\SharatChandra\\Desktop\\JenkinsLandingScreen.png");
		
//		JavascriptExecutor executor = (JavascriptExecutor)driver;
//		executor.executeScript("arguments[0].click();", driver.findElement(By.id("photofile")));
		
//		Thread.sleep(3000);
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUploadEg.exe");
		
//		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileUploadEg2.exe");
		
	}

}
