package com.cydeo.test;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelRead {



@Test
    public void read_from_excel_file() throws IOException {

    String path = "SampleData.xlsx";

    //to read from excel we need to load it to FileInput Stream
    FileInputStream fileInputStream = new FileInputStream(path);

    // workbook>sheet>row>cell
    //<1> Create a workbook
    XSSFWorkbook workbook = new XSSFWorkbook(fileInputStream);

    //<2> we need to  get specific sheet from currently opened workbook

    XSSFSheet sheet = workbook.getSheet("Employees");

    //<3>Select row and cell
    // Print out mary's cell
    //Remember : Indexes starts from 0
    System.out.println(sheet.getRow(1).getCell(0));// this is the way to get specific cell from row
    // cell is A which is 0 and row is 1 for mary


    // print out developer as jobID

    System.out.println(sheet.getRow(3).getCell(2));


// Return the count of used cells only
    // starts  counting from 1
    // it does not count empty rows
    int usedRows = sheet.getPhysicalNumberOfRows();
    System.out.println(usedRows);


    // Return the number from top cell to bottom cell
// it does not  care if cell is empty or not
// it starts counting from 0
    int lastusedRow = sheet.getLastRowNum();
    System.out.println(lastusedRow);


    // TODO: Create a logic to print Vinod's name from our excel data

    for(int rowNum=0; rowNum<usedRows; rowNum++){// it will loop through row in cell 0
        if(sheet.getRow(rowNum).getCell(0).toString().equals("Vinod")){
            System.out.println(sheet.getRow(rowNum).getCell(0));
        }
    }
    // for finding vinod name we start from row 0 and it will go until the usedrows and we will verify using if cond if rownum is equal to vindo orint it out


    //TODO: Create a logic  to print out Linda's Job ID
    // check if name is Linda ---> print out JobID of linda


    for(int rowNum=0;rowNum>usedRows;rowNum++){
        if(sheet.getRow(rowNum).getCell(0).toString().equals("Linda")){
            System.out.println("Linda's JobID is  "+sheet.getRow(rowNum).getCell(2));
        }
    }
    // as we know cell number for jobID is 2 aas index starts from 0

}


}
