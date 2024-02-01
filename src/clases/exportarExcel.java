package Clases;

/*
*REQUIERE JAR  - POI3.9
*
*REQUIERE JAR  - POI3.9
*REQUIERE JAR  - POI3.9
*
*REQUIERE JAR  - POI3.9
*REQUIERE JAR  - POI3.9
 */

import rojerusan.RSTableMetro;
import java.awt.Desktop;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.util.CellUtil;
import rojerusan.RSNotifyFade;


/**
 *
 * @author soporte
 * 
 * REQUIERE JAR  - POI3.9
 */
public class exportarExcel {

    public void exportarExcel(JTable t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Mi hoja de trabajo 1");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
                JOptionPane.showMessageDialog(null, "Exportado Correctamente");
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }

    public void Exportar(JTable t, String titulo) throws IOException {
        
        String fecha = new SimpleDateFormat("dd-MM-yyyy HH.mm.ss").format(new Date());
          
             String ruta = "C:\\SGDS\\exportado\\"+titulo+"\\Reporte"+ fecha+".xls";             
            
            try {
                File archivoXLS = new File(ruta);
                archivoXLS.mkdirs();
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
               
                HSSFWorkbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet(titulo);
                CellStyle style = libro.createCellStyle();
                style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                
                
                CellStyle style2 = libro.createCellStyle();
                style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                hoja.setDisplayGridlines(false);
                
                
                
                style.setWrapText(true);
                
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                            celda.setCellStyle(style);
                            CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        }
                    }
                    
                }
                
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    
                    
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) { 
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                        CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        celda.setCellStyle(style2);
                    }
                }

                for (int i = 0; i < libro.getSheetAt(0).getRow(0)
                        .getLastCellNum(); i++) {
                    libro.getSheetAt(0).autoSizeColumn((short) i);
                }
                hoja.autoSizeColumn(6);
                
                
                
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
                new rojerusan.RSNotifyFade("¡¡SUCCESS!!", "Archivo Excel generado Correctamente!", 4, RSNotifyFade.PositionNotify.BottomRight, RSNotifyFade.TypeNotify.SUCCESS).setVisible(true);
        
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        
    }

    
    
        public void exportarExcel(RSTableMetro t) throws IOException {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos de excel", "xls");
        chooser.setFileFilter(filter);
        chooser.setDialogTitle("Guardar archivo");
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showSaveDialog(null) == JFileChooser.APPROVE_OPTION) {
            String ruta = chooser.getSelectedFile().toString().concat(".xls");
            try {
                File archivoXLS = new File(ruta);
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet("Resultados  Reporte");
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                        }
                    }
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                    }
                }
                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
                JOptionPane.showMessageDialog(null, "Exportado Correctamente");
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    }

    public void exportarExcel(RSTableMetro t, String titulo) throws IOException {
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        String ruta="";
        if(System.getProperty("user.name").toLowerCase().contains("windows")){
            String x =System.getProperty("user.name") ;
            ruta = "C:\\Users\\"+x+"\\Documents\\datos Exportados\\"+titulo+" "+ fecha+".xls"; 
        }else{
            ruta = new File(".").getAbsolutePath()+titulo+" "+ fecha+".xls";
        }
        //new File(".").getAbsolutePath()
               
            try {
                File archivoXLS = new File(ruta);
                archivoXLS.mkdirs();
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
               
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet(titulo);
                CellStyle style = libro.createCellStyle();
                style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                
                
                CellStyle style2 = libro.createCellStyle();
                style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                            celda.setCellStyle(style);
                            CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        }
                    }
                    
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                        CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        celda.setCellStyle(style2);
                    }
                }

                for (int i = 0; i < libro.getSheetAt(0).getRow(0)
                        .getLastCellNum(); i++) {
                    libro.getSheetAt(0).autoSizeColumn((short) i);
                }

                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
    public void exportarExcel(JTable t, String titulo) throws IOException {
        String fecha = new SimpleDateFormat("dd-MM-yyyy").format(new Date());
        
        String ruta="";
        if(System.getProperty("user.name").toLowerCase().contains("windows")){
            String x =System.getProperty("user.name") ;
            ruta = "C:\\Users\\"+x+"\\Documents\\datos Exportados\\"+titulo+" "+ fecha+".xls"; 
        }else{
            ruta = new File(".").getAbsolutePath()+titulo+" "+ fecha+".xls";
        }
        //new File(".").getAbsolutePath()
               
            try {
                File archivoXLS = new File(ruta);
                archivoXLS.mkdirs();
                if (archivoXLS.exists()) {
                    archivoXLS.delete();
                }
                archivoXLS.createNewFile();
               
                Workbook libro = new HSSFWorkbook();
                FileOutputStream archivo = new FileOutputStream(archivoXLS);
                Sheet hoja = libro.createSheet(titulo);
                CellStyle style = libro.createCellStyle();
                style.setFillForegroundColor(IndexedColors.AQUA.getIndex());
                style.setFillPattern(HSSFCellStyle.SOLID_FOREGROUND);
                style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                
                
                CellStyle style2 = libro.createCellStyle();
                style2.setBorderBottom(HSSFCellStyle.BORDER_THIN);
                style2.setBorderTop(HSSFCellStyle.BORDER_THIN);
                style2.setBorderRight(HSSFCellStyle.BORDER_THIN);
                style2.setBorderLeft(HSSFCellStyle.BORDER_THIN);
                hoja.setDisplayGridlines(false);
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(f);
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (f == 0) {
                            celda.setCellValue(t.getColumnName(c));
                            celda.setCellStyle(style);
                            CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        }
                    }
                    
                }
                int filaInicio = 1;
                for (int f = 0; f < t.getRowCount(); f++) {
                    Row fila = hoja.createRow(filaInicio);
                    filaInicio++;
                    for (int c = 0; c < t.getColumnCount(); c++) {
                        Cell celda = fila.createCell(c);
                        if (t.getValueAt(f, c) instanceof Double) {
                            celda.setCellValue(Double.parseDouble(t.getValueAt(f, c).toString()));
                        } else if (t.getValueAt(f, c) instanceof Float) {
                            celda.setCellValue(Float.parseFloat((String) t.getValueAt(f, c)));
                        } else {
                            celda.setCellValue(String.valueOf(t.getValueAt(f, c)));
                        }
                        CellUtil.setAlignment(celda, libro, CellStyle.ALIGN_CENTER);
                        celda.setCellStyle(style2);
                    }
                }

                for (int i = 0; i < libro.getSheetAt(0).getRow(0)
                        .getLastCellNum(); i++) {
                    libro.getSheetAt(0).autoSizeColumn((short) i);
                }

                libro.write(archivo);
                archivo.close();
                Desktop.getDesktop().open(archivoXLS);
            } catch (IOException | NumberFormatException e) {
                throw e;
            }
        }
}
