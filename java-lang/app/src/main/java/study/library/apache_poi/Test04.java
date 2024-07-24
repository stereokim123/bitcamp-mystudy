// Apache POI 라이브러리 사용법 - 엑셀 Workbook, Sheet, 만들기
package study.library.apache_poi;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test04 {
  public static void main(String[] args) throws Exception {

    XSSFWorkbook workbook = new XSSFWorkbook();
    XSSFSheet sheet = workbook.createSheet("users");

    List<Object[]> data = new ArrayList<>();
    data.add(new Object[] {"no", "name", "email", "password", "tel"});
    data.add(new Object[] {"1", "user1", "user1test@gmail.com", "1111", "010-1111-1111"});
    data.add(new Object[] {"2", "user2", "user2test@gmail.com", "2222", "010-2222-2222"});
    data.add(new Object[] {"3", "user3", "user3test@gmail.com", "3333", "010-3333-3333"});
    data.add(new Object[] {"4", "user4", "user4test@gmail.com", "4444", "010-4444-4444"});
    data.add(new Object[] {"5", "user5", "user5test@gmail.com", "5555", "010-5555-5555"});

    for (int i = 0; i < data.size(); i++) {
      Object[] values = data.get(i);
      Row row = sheet.createRow(i);

      row.createCell(0).setCellValue((String) values[0]);
      row.createCell(0).setCellValue((String) values[1]);
      row.createCell(0).setCellValue((String) values[2]);
      row.createCell(0).setCellValue((String) values[3]);
      row.createCell(0).setCellValue((String) values[4]);
    }


    try (FileOutputStream out = new FileOutputStream("temp/test.xlsx")) {
      workbook.write(out);
    }
    System.out.println("파일 생성 완료");

  }

}
