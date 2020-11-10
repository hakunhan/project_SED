package ExcelTable;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.awt.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class ReadEmployeeExcelFile {
    private String filePath;
    private String month;
    private int employeeWorkDay;
    private GetTime gt = new GetTime();

    public ReadEmployeeExcelFile(){
        chooseFile();
        getMonthOfExcelFile();
    }

    public void chooseFile() {
        FileDialog dialog = new FileDialog((Frame) null, "Select File to Open",FileDialog.LOAD);
        dialog.setVisible(true);
        String file = dialog.getDirectory() + dialog.getFile();
        System.out.println(file + " chosen.");
        this.filePath = file;
    }

    public void getMonthOfExcelFile(){
        String[] temp = filePath.split("\\\\");
        String[] tempTwo = temp[temp.length-1].split("-");
        String result = gt.getMonthNum(tempTwo[0]);
        System.out.println(result);
        this.month = result;
    }

    public Object[] getDateInExcelFile(){
        ArrayList<String> date = new ArrayList<>();
        try {
            FileInputStream file = new FileInputStream(new File(filePath));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                if (cellIterator.hasNext()){
                    if (!cellIterator.next().getStringCellValue().equals("TEAM")){
                        continue;
                    }
                }

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    date.add(cell.getStringCellValue());
                }
                System.out.println("");
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return date.toArray();
    }

    public Object[] getWorkTimeOfEmployee(String employeeName) throws IOException {
        ArrayList<String> workTime = new ArrayList<>();

        try {
            FileInputStream file = new FileInputStream(new File(filePath));

            //Create Workbook instance holding reference to .xlsx file
            XSSFWorkbook workbook = new XSSFWorkbook(file);

            //Get first/desired sheet from the workbook
            XSSFSheet sheet = workbook.getSheetAt(0);

            //Iterate through each rows one by one
            Iterator<Row> rowIterator = sheet.iterator();
            while (rowIterator.hasNext()) {
                Row row = rowIterator.next();
                //For each row, iterate through all the columns
                Iterator<Cell> cellIterator = row.cellIterator();
                if (cellIterator.hasNext()){
                    if (!cellIterator.next().getStringCellValue().equals(employeeName)){
                        continue;
                    }
                }

                while (cellIterator.hasNext()) {
                    Cell cell = cellIterator.next();
                    //Check the cell type and format accordingly
                    workTime.add(cell.getStringCellValue());
                }
                System.out.println("");
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return workTime.toArray();
    }

    public Object[][] employeeWorkInMonth(String employeeName) throws IOException {
        Object[] date = getDateInExcelFile();
        Object[] workTime = getWorkTimeOfEmployee(employeeName);
        Object[][] temp = new Object[date.length][2];
        int count = 0;

        for (Object e: workTime){
            if (!date[count].toString().contains(month)){
                count++;
                continue;
            }

            if(e.toString().equals(" ")){
                count++;
                continue;
            }
            temp[count][0] = date[count];
            temp[count][1] = workTime[count];
            count++;
        }

        count = 0;
        int resultCount = 0;
        Object[][] result = new Object[temp.length][2];

        for (Object[] a: temp){
            if (a[0] == null || a[1] == null){
                count++;
                continue;
            }

            result[resultCount][0] = a[0];
            result[resultCount][1] = a[1];
            resultCount++;
        }

        this.employeeWorkDay = resultCount;
        return result;
    }

    public int getEmployeeWorkDay(){
        return employeeWorkDay;
    }

    public static void main(String[] args) throws IOException {
        ReadEmployeeExcelFile reader = new ReadEmployeeExcelFile();
        Object[][] employeeWorkInMonth = reader.employeeWorkInMonth("HÀ");

        for (Object[] a: employeeWorkInMonth){
            for (Object b: a){
                System.out.println(b);
            }
        }
    }
}