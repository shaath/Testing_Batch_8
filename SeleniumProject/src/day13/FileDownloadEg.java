package day13;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FileDownloadEg {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.selenium.dev/downloads/");
		
		driver.findElement(By.linkText("3.141.59")).click();
		Thread.sleep(5000);

		Runtime.getRuntime().exec("C:\\Users\\SharatChandra\\Desktop\\FileDownload.exe");
	}

}
