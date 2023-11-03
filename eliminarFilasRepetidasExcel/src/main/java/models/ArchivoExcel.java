package models;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.*;

public class ArchivoExcel {

    public static void leerExcel(String nombre) {
        try {
            InputStream archivo = new FileInputStream(new File(nombre));
            HSSFWorkbook wb = new HSSFWorkbook(archivo);
            HSSFSheet sheet = wb.getSheetAt(0); // Obtengo la hoja 1
            HSSFCell cell;
            HSSFRow row;
            System.out.println("Apunto de entrar a loops");

            System.out.println("" + sheet.getLastRowNum());

            for (int i = 0; i < sheet.getLastRowNum() + 1; i++) {
                row = sheet.getRow(i);
                for (int j = 0; j < row.getLastCellNum(); j++) {
                    cell = row.getCell(j);
                    System.out.println("Valor: " + cell.toString());
                }
            }
            System.out.println("Finalizado");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
