package xlOps;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.SeleniumProject.JavaProgrammes.MethodsEg;

import methods.OrgMaster;

public class EmpReg_TC_XL {

	public static void main(String[] args) throws IOException, InterruptedException 
	{
		String path = "D:\\Testing_Batch\\Automation\\Workspace\\SeleniumProject\\src\\testData\\TestData.xlsx";
		String out_path = "D:\\Testing_Batch\\Automation\\Workspace\\SeleniumProject\\src\\results\\EmpRes.xlsx";
		String res = null;
		OrgMaster m = new OrgMaster();
				
		FileInputStream fi = new FileInputStream(path);
		
		XSSFWorkbook wb = new XSSFWorkbook(fi);
		XSSFSheet ws = wb.getSheet("EmpReg");
//		XSSFRow r = ws.getRow(4);
//		XSSFCell c = r.getCell(0);
		
//		System.out.println(c.getStringCellValue());
		
		int lastRow = ws.getLastRowNum();
		System.out.println(lastRow);
		
		m.orgLaunch(m.url);
		m.orgLogin(m.u, m.p);
		
		for (int i = 1; i <= lastRow ; i++) 
		{
			XSSFRow r = ws.getRow(i);
			XSSFCell c1 = r.getCell(0);
			XSSFCell c2 = r.getCell(1);
			XSSFCell c3 = r.getCell(2);
			XSSFCell c4 = r.createCell(3);
			
			String f = c1.getStringCellValue();
			String l = c2.getStringCellValue();
			String eid = c3.getStringCellValue();
			
			System.out.println(f+"--"+l+"--"+eid);
			
			res = m.orgEmpReg(f, l, eid);
			
			c4.setCellValue(res);
			
		}
		FileOutputStream fo = new FileOutputStream(out_path);
		wb.write(fo);
		wb.close();
		
		m.orgLogout();
		m.orgClose();
	}

}
