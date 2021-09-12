package day2;

import org.openqa.selenium.edge.EdgeDriver;

public class EdgeLaunchEg {

	public static void main(String[] args) {
		System.setProperty("webdriver.edge.driver", "D:\\Testing_Batch\\Automation\\Jars\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://selenium.dev");
		
		driver.manage().window().maximize();
	}

}
