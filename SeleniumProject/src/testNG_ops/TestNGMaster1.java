package testNG_ops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class TestNGMaster1 
{
	public static WebDriver driver = null;
	public static String expval,actval;
	public static String path="D:\\Jagbir_Sarbjith\\Workspace\\SeleniumProject\\src\\properties\\OrgHRM.properties";
	public static FileInputStream fi=null;
	public static Properties pr=null;
	public static String URL = "http://orangehrm.qedgetech.com";
	public static String u = "Admin", p = "Qedge123!@#";
	public static String f = "Nidish2", l = "G2", eid = "NGS54165";
	public static String ename = f+" "+l, uname = "A"+f+l+"123456", pwd = "Sample@0987654321@"; 
	
	@BeforeSuite
	public void orgLaunch() throws IOException
	{
		expval="LOGIN";
		System.setProperty("webdriver.gecko.driver", "D:\\Jagbir_Sarbjith/Jars/geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		fi=new FileInputStream(path);		
		pr=new Properties();
		pr.load(fi);
		
		actval=driver.findElement(By.id(pr.getProperty("login"))).getAttribute("Value");
		
		Assert.assertEquals(actval, expval, "Launch Failed");
	}
	
	@BeforeTest
	public void orgLogin()
	{
		expval="welcome";
		driver.findElement(By.id(pr.getProperty("username"))).sendKeys(u);
		driver.findElement(By.id(pr.getProperty("password"))).sendKeys(p);
		driver.findElement(By.id(pr.getProperty("login"))).click();
		
		actval=driver.findElement(By.partialLinkText("Welcome")).getAttribute("id");
		
		Assert.assertEquals(actval, expval, "Login Failed");
	}
	
	@AfterTest
	public void orgLogout() throws InterruptedException
	{
		expval="LOGIN";
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Welcome")).click();
		driver.findElement(By.linkText("Logout")).click();
		actval=driver.findElement(By.id("btnLogin")).getAttribute("Value");
		
		Assert.assertEquals(actval, expval, "Logout Failed");
	}
	
	@AfterSuite
	public void orgClose()
	{
		driver.close();
	}
}
