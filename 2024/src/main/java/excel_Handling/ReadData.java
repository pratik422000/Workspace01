package excel_Handling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadData {

	public static void main(String[] args) throws IOException  {
		
//		File file = new File("C:\\Users\\pratik.b.dhake\\Desktop\\Data.xlsx");
//		
//		FileInputStream fis = new FileInputStream(file);
//	
//		XSSFWorkbook workbook = new XSSFWorkbook(fis);
//		
//		XSSFSheet sheet = workbook .getSheet("Sheet1");
//		
//		XSSFRow row =sheet.getRow(1);
//		
//		XSSFCell cell = row.getCell(0);
//		
//		String data = cell.getStringCellValue();
//		
//		System.out.println(data);
		
		File file = new File("C:\\\\Users\\\\pratik.b.dhake\\\\Desktop\\\\Data.xlsx");

		FileInputStream fis = new FileInputStream(file);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sheet = wb.getSheet("Stock Transfer Outside DP");
		
		XSSFRow row = sheet.getRow(1);
		
		XSSFCell cell = row.getCell(0);
		
		String data = cell.getStringCellValue();
		
		System.out.println(data);
		
	}

}
