package day9;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MultipleWindowsEg2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://gmail.com");
		
		String gmail = driver.getWindowHandle();
//		System.out.println(gmail);
		driver.findElement(By.linkText("Privacy")).click();
		
		Set<String> wids = driver.getWindowHandles();
		
		Iterator<String> it = wids.iterator();
		
		while(it.hasNext()){
			String wid = it.next();
//			System.out.println(wid);
			
			driver.switchTo().window(wid);
			Thread.sleep(3000);
			String title = driver.getTitle();
			System.out.println(title);
			if (title.contains("Privacy Policy")) {
				driver.findElement(By.linkText("Terms of Service")).click();
				Thread.sleep(3000);
				System.out.println(driver.getTitle() + "-----" + driver.getCurrentUrl());
				break;
			}
			
		}

	}

}
