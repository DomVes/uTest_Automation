package com.utest.automation.utils;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


//This Class help to invoke the Excel Files for Read Cells
public class Excel {
    private XSSFWorkbook book;
    private FileInputStream file;

    public String leerDatoExcel(String hoja, String ruta, int rowValue, int cellValue) throws IOException {

        String valor;
        file = new FileInputStream(new File(ruta));
        book = new XSSFWorkbook(file);
        Sheet sheet = book.getSheet(hoja);
        Row row = sheet.getRow(rowValue);
        Cell cell = row.getCell(cellValue);
        valor = cell.getStringCellValue();
        book.close();
        file.close();
        return valor;
    }

}
