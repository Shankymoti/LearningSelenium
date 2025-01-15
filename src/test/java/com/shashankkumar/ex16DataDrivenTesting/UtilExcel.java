package com.shashankkumar.ex16DataDrivenTesting;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.annotations.DataProvider;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class UtilExcel {

// Apache POI
    // Read the File
    //  Workbook Create
    // Sheet
    // Row and Cell
    // 2D Object  - getData()


    static Workbook book;
    static Sheet sheet;

    public static String SHEET_PATH = System.getProperty("user.dir")+"/src/test/resources/TestData.xlsx";

    public Object[][] getTestDataFromExcel(String sheetName){
        FileInputStream file = null;

        try {
            file = new FileInputStream(SHEET_PATH);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        try {
            book = WorkbookFactory.create(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        sheet = book.getSheet(sheetName);

        int totalRow = sheet.getLastRowNum();
        System.out.println(totalRow);

        int totalcol = sheet.getRow(0).getLastCellNum();
        System.out.println(totalcol);

        Object[][] data = new Object[totalRow][totalcol];
        for(int r=0; r<totalRow; r++){
            for (int c =0; c<totalcol; c++){
                data[r][c] = sheet.getRow(r+1).getCell(c).toString();
            }
        }

        return data;


    }


    @DataProvider
    public Object[][] getData(){
        return getTestDataFromExcel("Sheet1");
    }
}
