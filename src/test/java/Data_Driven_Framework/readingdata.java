package Data_Driven_Framework;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readingdata {

	public static void main(String[] args) throws Exception {
		FileInputStream fis=new FileInputStream("C:\\Users\\dell\\Desktop\\Usercredentails.xlsx");
		
		XSSFWorkbook wb =new XSSFWorkbook(fis);
		XSSFSheet sheet =wb.getSheet("Sheet1");
		int totalrow=sheet.getLastRowNum();
		int toalcell=sheet.getRow(1).getLastCellNum();
		System.out.println("Number of rows:"+totalrow);
		System.out.println("Number of cells:"+toalcell);
		
		for (int r = 0; r <= totalrow; r++) {
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0; c<toalcell;c++) {
				String value=currentrow.getCell(c).toString();
				System.out.println(value);
				
			}
			
			
		}
		
		
	}

}
