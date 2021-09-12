package day2;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class IELaunch {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver", "D:\\Testing_Batch\\Automation\\Jars\\IEDriverServer.exe");
		InternetExplorerDriver driver = new InternetExplorerDriver();
		
		driver.get("https://facebook.com");

	}

}
