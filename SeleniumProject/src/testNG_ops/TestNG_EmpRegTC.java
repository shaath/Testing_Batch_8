package testNG_ops;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNG_EmpRegTC extends TestNGMaster1
{
	@Test(dataProvider = "emp_reg_data")
	public void orgEmpReg(String f, String l, String eid)
	{
		System.out.println(f+"---"+l+ "---"+eid);
		expval=f+" "+l;
		driver.findElement(By.linkText("PIM")).click();
		driver.findElement(By.linkText("Add Employee")).click();
		
		driver.findElement(By.id("firstName")).sendKeys(f);
		driver.findElement(By.id("lastName")).sendKeys(l);
		driver.findElement(By.id("employeeId")).clear();
		driver.findElement(By.id("employeeId")).sendKeys(eid);
		driver.findElement(By.id("btnSave")).click();
		
		actval=driver.findElement(By.xpath("//div[@id='profile-pic']/h1")).getText();
		
		Assert.assertEquals(actval, expval, "Employe registration failed");
		
	}
	
	@DataProvider
	public Object[][] emp_reg_data()
	{
		Object[][] x = new Object[3][3];
		
		x[0][0] = "Sample1";
		x[0][1] = "TestAuto1";
		x[0][2] = "STA87654";
		
		x[1][0] = "Sample2";
		x[1][1] = "TestAuto2";
		x[1][2] = "STA87655";
		
		x[2][0] = "Sample3";
		x[2][1] = "TestAuto3";
		x[2][2] = "STA87656";
		
		return x;
	}

}
