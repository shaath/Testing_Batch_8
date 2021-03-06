package testNG_ops;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class TestNG_UserRegTC extends TestNGMaster1
{
	@Test
	public void orguserReg() throws InterruptedException
	{
		expval = uname;
		boolean flag = false;
		driver.findElement(By.linkText("Admin")).click();
		driver.findElement(By.linkText("User Management")).click();
		driver.findElement(By.linkText("Users")).click();
		
		driver.findElement(By.id("btnAdd")).click();
		
		driver.findElement(By.id("systemUser_employeeName_empName")).clear();
		driver.findElement(By.id("systemUser_employeeName_empName")).click();
		driver.findElement(By.id("systemUser_employeeName_empName")).sendKeys(ename);
		driver.findElement(By.id("systemUser_userName")).sendKeys(uname);
		driver.findElement(By.id("systemUser_password")).sendKeys(pwd);
		driver.findElement(By.id("systemUser_confirmPassword")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.id("btnSave")).click();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) 
		{
			List<WebElement> cols = rows.get(i).findElements(By.tagName("td"));
			actval = cols.get(1).getText();
			if (expval.equalsIgnoreCase(actval))
			{
				flag = true;
				break;
			}			
		}
	}

}
