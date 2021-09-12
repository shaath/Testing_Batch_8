package day6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButtonsEg2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://echoecho.com/htmlforms10.htm");
		
		List<WebElement> radios = driver.findElements(By.name("group1"));
		System.out.println(radios.size());
		
		for (int i = 0; i < radios.size(); i++) {
			String name = radios.get(i).getAttribute("value");
			System.out.println(name);
			
			if (name.equalsIgnoreCase("Cheese")) {
				radios.get(i).click();
				break;
			}
		}
	}

}
