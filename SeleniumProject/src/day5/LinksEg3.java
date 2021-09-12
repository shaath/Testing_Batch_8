package day5;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg3 {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		
		WebElement ele = driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
		
		List<WebElement> links = ele.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		for (int i = 0; i < links.size(); i++) {
			String lname = links.get(i).getText();
			System.out.println(lname);
			
			links.get(i).click();
			Thread.sleep(5000);
			
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(src, new File("D:\\Testing_Batch\\Automation\\Workspace\\SeleniumProject\\src\\screenshots\\"+lname+".png"));
			
			System.out.println(driver.getTitle() +"-----"+ driver.getCurrentUrl());
			
			driver.navigate().back();
			
			ele = driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
			links = ele.findElements(By.tagName("a"));
		}
		
	}

}
