package org.example;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ReadXlsx {

  String filePath = "C:\\Users\\LenseL\\IdeaProjects\\24.7.homeworkk\\src\\resources\\universityInfo.xlsx";

  private ReadXlsx() throws IOException {

  }


  public static List<Student> readStudents() throws IOException {

    try (XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(filePath))) {
      wb.getSheet("Студенты");



    } catch (IOException e) {
      e.printStackTrace();
    }


  }

  public void readUniversities() throws IOException {
    try (XSSFWorkbook wb = new XSSFWorkbook(new FileInputStream(filePath))) {
      wb.getSheet("Университеты");



    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
