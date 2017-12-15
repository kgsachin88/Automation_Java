package generics;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class excel 
{
	public static String getcellvalue(String xlpath,String sheet,int row, int cell) {
		
		String v = "";
		try {
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			v = wb.getSheet(sheet).getRow(row).getCell(cell).toString();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		return v;
	}
	public static int getRowcount(String xlpath,String Sheet) {
		int rc=0;
		try {
			FileInputStream fis = new FileInputStream(xlpath);
			Workbook wb = WorkbookFactory.create(fis);
			rc= wb.getSheet(Sheet).getLastRowNum();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return rc;
	}
}