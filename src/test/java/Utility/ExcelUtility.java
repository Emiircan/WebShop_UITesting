package Utility;

import org.apache.poi.ss.usermodel.*;
import java.io.*;

public class ExcelUtility {
    public static String getData(String text) {

        String path = "src/test/java/Pages/LoginInfo.xlsx";
        String data = "";

        Sheet sheet = null;
        try {
            FileInputStream inputStream = new FileInputStream(path);
            Workbook workbook = WorkbookFactory.create(inputStream);
            sheet = workbook.getSheetAt(0);
        } catch (Exception e) {
            System.out.println("e.getMessage() = " + e.getMessage());
        }

        for (int i = 0; i < sheet.getPhysicalNumberOfRows(); i++) {

            if (sheet.getRow(i).getCell(0).toString().equalsIgnoreCase(text)) {
                for (int j = 1; j < sheet.getRow(i).getPhysicalNumberOfCells(); j++) {
                    data += sheet.getRow(i).getCell(j);

                }
            }
        }
        return data;
    }
}