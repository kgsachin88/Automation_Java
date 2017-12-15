package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel2 {
	public static void main(String[] args) throws EncryptedDocumentException, InvalidFormatException, IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("D:\\books.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//Sheet s =wb.getSheet("sheet1");
		//Row r =s.getRow(0);
		for(int i=0;i<=2;i++){
			for(int j=0;j<=2;j++){
				Cell c =wb.getSheet("sheet1").getRow(i).getCell(j);
				System.out.print(c+" ");
			}
			System.out.println();
		}
		
		
		//System.out.println(c.toString());
		
	}
}

