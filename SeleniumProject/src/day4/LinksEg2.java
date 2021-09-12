package day4;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinksEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://primusbank.qedgetech.com/sitemap.html");
		
		
//		driver.findElement(By.xpath("//a[@href='home.aspx']")).click();
		
//		WebElement ele = driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td"));
//		
//		List<WebElement> links = ele.findElements(By.tagName("a"));
//		
//		System.out.println(links.size());
//		
//		for (int i = 0; i < links.size(); i++) {
//			String lname = links.get(i).getText();
//			System.out.println(lname);
//			
//			if (lname.equalsIgnoreCase("Home")) {
//				
//				links.get(i).click();
//				break;
//			}
//		}
		
		driver.findElement(By.xpath("//table[@id='Table_011']/tbody/tr[2]/td")).findElement(By.linkText("Home")).click();
	}

}
