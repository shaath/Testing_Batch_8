package driverScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import methods.OrgMaster;

public class Keyword {

	public static void main(String[] args) throws IOException, InterruptedException
	{
		Date d = new Date();
		SimpleDateFormat st = new SimpleDateFormat("ddMMyyyyhhmmss");
		String date = st.format(d);
		
		String res = null;
		String xl_path = "D:\\Testing_Batch\\Automation\\Workspace\\SeleniumProject\\src\\testData\\Keyword.xlsx";
		String xl_out_path = "D:\\Testing_Batch\\Automation\\Workspace\\SeleniumProject\\src\\results\\keyres"+date+".xlsx";
		OrgMaster om = new OrgMaster();
		FileInputStream fi = new FileInputStream(xl_path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet TC_Sht = wb.getSheet("Testcase");
		XSSFSheet TS_Sht = wb.getSheet("Teststeps");
		XSSFSheet TD_Sht = wb.getSheet("TestData");
		
		int TC_RC = TC_Sht.getLastRowNum();
		int TS_RC = TS_Sht.getLastRowNum();
		
		
		for (int i = 1; i <= TC_RC; i++) 
		{
			TC_Sht.getRow(i).createCell(3);
			String exe = TC_Sht.getRow(i).getCell(2).getStringCellValue();
			if (exe.equalsIgnoreCase("Y"))
			{
				String TC_tc_id = TC_Sht.getRow(i).getCell(0).getStringCellValue();
				
				for (int j = 1; j <= TS_RC; j++)
				{
					String TS_tc_id = TS_Sht.getRow(j).getCell(0).getStringCellValue();
					if (TC_tc_id.equalsIgnoreCase(TS_tc_id))
					{
						String key = TS_Sht.getRow(j).getCell(3).getStringCellValue();
//						System.out.println(key);
						switch (key) 
						{
						case "Launch":
							String url = TD_Sht.getRow(1).getCell(0).getStringCellValue();
							res = om.orgLaunch(url);							
							break;
						case "login":
							String u = TD_Sht.getRow(1).getCell(1).getStringCellValue();
							String p = TD_Sht.getRow(1).getCell(2).getStringCellValue();
							res = om.orgLogin(u, p);
							break;
						case "logout":	
							res = om.orgLogout();
							om.orgClose();
							break;
						case "Empreg":
							String f = TD_Sht.getRow(1).getCell(3).getStringCellValue();
							String l = TD_Sht.getRow(1).getCell(4).getStringCellValue();
							String eid = TD_Sht.getRow(1).getCell(5).getStringCellValue();
							res = om.orgEmpReg(f, l, eid);
							break;
						case "Usereg":
							String ename = TD_Sht.getRow(1).getCell(6).getStringCellValue();
							String uname = TD_Sht.getRow(1).getCell(7).getStringCellValue();
							String pwd = TD_Sht.getRow(1).getCell(8).getStringCellValue();
							res = om.orgUserReg(ename, uname, pwd);
							break;
						case "Ulogin":
							String un = TD_Sht.getRow(1).getCell(7).getStringCellValue();
							String pd = TD_Sht.getRow(1).getCell(8).getStringCellValue(); 
							res = om.orgLogin(un, pd);
							break;
						default:
							System.out.println("Select a proper keyword");
							break;
						}
						// writing the results in testeps sheet
						TS_Sht.getRow(j).createCell(4).setCellValue(res);
						// writing the results in test case sheet						
						if(!TC_Sht.getRow(i).getCell(3).getStringCellValue().equalsIgnoreCase("Fail"))
						{
							TC_Sht.getRow(i).getCell(3).setCellValue(res);
						}
						
					}
				}
			}
			else
			{
				TC_Sht.getRow(i).getCell(3).setCellValue("BLOCKED");
			}
		}
		
		FileOutputStream fo = new FileOutputStream(xl_out_path);
		
		wb.write(fo);
		wb.close();
	}

}
