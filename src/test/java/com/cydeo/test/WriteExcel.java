package com.cydeo.test;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcel {
    String filepath = "C:\\Users\\USER\\IdeaProjects\\JavaProgramming\\JavaProgrammingSDET\\Cydeo_cucumber_junit\\SampleData.xlsx";

    XSSFWorkbook workbook;
    XSSFSheet sheet;



    @Test
    public void excel_write() throws IOException {
        FileInputStream fileInputStream = new FileInputStream(filepath);
    workbook = new XSSFWorkbook(fileInputStream);
    sheet = workbook.getSheet("Employees");


        XSSFCell salaryCell = sheet.getRow(0).createCell(3);
        salaryCell.setCellValue("Salary");


        XSSFCell salary1 = sheet.getRow(1).createCell(3);
        salary1.setCellValue(20000);

        XSSFCell salary2 = sheet.getRow(2).createCell(3);
        salary2.setCellValue(10000);

        XSSFCell salary3 = sheet.getRow(3).createCell(3);
        salary3.setCellValue(40000);

        XSSFCell salary4 = sheet.getRow(4).createCell(3);
        salary4.setCellValue(25000);


        // save changes
        // open to write to the file : using file input stream for reading
        // but if u want to write it and want to save it use file output stream
        FileOutputStream outputStream = new FileOutputStream(filepath);


        // save or write cha ges to the workbook

        workbook.write(outputStream);

        // we have to close outpuut stream and workbook and fileinput


        outputStream.close();
        workbook.close();
        fileInputStream.close();
    }


}
