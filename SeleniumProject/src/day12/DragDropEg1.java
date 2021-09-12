package day12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragDropEg1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		
		WebElement frame = driver.findElement(By.className("demo-frame"));
		
		driver.switchTo().frame(frame);
				
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		Actions act = new Actions(driver);
		
		act.dragAndDrop(drag, drop).build().perform();
		
		driver.switchTo().defaultContent();
				
		driver.findElement(By.linkText("Draggable")).click();

	}

}
