package day8;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalanderEg {

	public static void main(String[] args) throws InterruptedException {
		
		String date = "03/May/2022";
		String[] split = date.split("/");
		String exp_mon_year = split[1]+" "+split[2];
		String exp_day = split[0];
		System.out.println(exp_day + "----"+exp_mon_year);
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.cleartrip.com/");
		
		driver.findElement(By.className("closeit")).click();
		
		driver.findElement(By.xpath("//*[name()='svg' and @class='t-all ml-2']")).click();
		Thread.sleep(3000);
		String month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Month']/div[1]/div)[1]")).getText();
		System.out.println(month_year);
		
		while(!month_year.equalsIgnoreCase(exp_mon_year)){
			driver.findElement(By.xpath("//*[name()='svg' and @data-testid='rightArrow']")).click();
			month_year = driver.findElement(By.xpath("(//div[@class='DayPicker-Month']/div[1]/div)[1]")).getText();
		}
		
		List<WebElement> cells = driver.findElements(By.xpath("(//div[@class='DayPicker-Body'])[1]/div/div[@aria-disabled='false']"));
		for (int i = 0; i < cells.size(); i++) {
			String d = cells.get(i).getAttribute("aria-label");
			System.out.println(d);
			
			if (d.contains(" "+exp_day+" ")) {
				cells.get(i).click();
				break;
			}
		}
		
	}

}
