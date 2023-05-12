package quiz22;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class RegexQuiz03 {

	public static void main(String[] args) {

		/*
		 * 1. 버퍼리더를 사용해서 건담.txt 를 읽어들입니다. 2. 정규표현식을 이용해서 날짜, 지점, 등급, 내용, 가격을 정규표현식으로
		 * 패턴분석 Product객체에 저장하고, 리스트에 저장 3. 외부라이브러라(POI) - 자바에서 엑셀파일 xlsx 형태로 파일을 쓸 수
		 * 있도록 하는 기능
		 * 
		 */

		List<Product> list = new ArrayList<>();

		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\Quiz\\src\\quiz22\\건담.txt";

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String result;
			while ((result = br.readLine()) != null) {

				String p1 = "\\d{8}-\\d{2}-\\d{12,13}";
				String p2 = "[가-힣\\s]+";
				String p3 = "\\[[A-Z가-힣]+\\]";
				String p4 = result.substring(result.indexOf("]")+2, result.lastIndexOf(" "));
				String p5 = "\\d+,*\\d+원";
				
				Matcher m1 = Pattern.compile(p1).matcher(result);
				Matcher m2 = Pattern.compile(p2).matcher(result);
				Matcher m3 = Pattern.compile(p3).matcher(result);

				Matcher m5 = Pattern.compile(p5).matcher(result);
								
				if(m1.find() && m2.find() && m3.find() && m5.find() ) {
					String day = m1.group();
					String store = m2.group();
					String grade = m3.group();
					String detail = p4;
					String price = m5.group();
					
					Product product = new Product(day, store, grade, detail, price);
					
					list.add(product);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		String savePath = "C:\\Users\\sssoc\\Desktop\\course\\work\\Quiz\\src\\quiz22\\건담.xlsx";
		
		try (FileOutputStream fos = new FileOutputStream(savePath)){
			
			XSSFWorkbook workbook = new XSSFWorkbook();
			
			XSSFSheet sheet = workbook.createSheet("RobotList");
			
			XSSFRow curRow;
			
			for(int i = 0; i < list.size(); i++) {
				curRow = sheet.createRow(i);
				curRow.createCell(0).setCellValue(list.get(i).getDay());
				curRow.createCell(1).setCellValue(list.get(i).getStore());
				curRow.createCell(2).setCellValue(list.get(i).getGrade());
				curRow.createCell(3).setCellValue(list.get(i).getDetail());
				curRow.createCell(4).setCellValue(list.get(i).getPrice());
			}
			
			workbook.write(fos);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
	}
}
