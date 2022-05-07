package com.trabalho.prolog.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public interface ArquivoUtil {

    default void lerArquivo(String arquivoXlsx, String arquivoPl) {
        try {
            FileInputStream arquivo = new FileInputStream(arquivoXlsx);
            XSSFWorkbook wb = new XSSFWorkbook(arquivo);
            XSSFSheet planilha = wb.getSheetAt(0);
            Iterator<Row> rowIterator = planilha.rowIterator();
            while(rowIterator.hasNext()) {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                String base = "gasto(";
                while(cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    if(cell.getCellType().equals(CellType.STRING)) {
                        base = base.concat("'" + cell.getStringCellValue() + "',");
                    } else if(cell.getCellType().equals(CellType.NUMERIC)) {
                        base = base.concat(cell.getNumericCellValue() + ",");
                    }
                }
                base = base.concat(").").replace(",)", ")");
                escreverArquivo(arquivoPl, base);
            }
            arquivo.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    default void escreverArquivo(String nomeArquivo, String str) {
        try {
            BufferedWriter escrever = new BufferedWriter(new FileWriter(nomeArquivo, true));
            escrever.append("\n");
            escrever.append(str);
            escrever.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
