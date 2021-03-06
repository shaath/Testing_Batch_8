package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class LoginTC_POM {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "D:\\Testing_Batch/Automation/Jars\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
		
		lp.orgLogin(lp.u, lp.p);
		
		AdminHomePage ap = PageFactory.initElements(driver, AdminHomePage.class);
		ap.welcomeclick();
		ap.logoutclick();
		
		driver.close();
	}

}
