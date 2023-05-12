package quiz21;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {

	public static void main(String[] args) {

		// 지역명, 규모구분, 연도, 월, 분양가격 -> 1행 x 4800개

		/*
		 * 1. 버퍼리더 이용해서 한줄씩 읽는다. 2. split(",",5)를 사용해서 Data객체에 한줄 단위로 저장을 하고 3.
		 * List<Data> 에 하나씩 추가를 한다. 4. 람다식을 이용해서 지역:서울, 9~12월, 분양가격:2000이상인 객체만 뽑아서 새로운
		 * 리스트로 반환.
		 */

		List<Data> list = new ArrayList<>();

		String path = "C:\\Users\\sssoc\\Desktop\\course\\work\\file\\주택도시보증공사_전국 평균 분양가격.csv";

		try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(path), "EUC-KR"))) {

			br.readLine(); // (제목행) 한 번 넘어감

			String line = null;
			while ((line = br.readLine()) != null) {

				String[] arr = line.split(",", 5);

//				data.setRegion(arr[0]);
//				data.setSize(arr[1]);
//				data.setYear(arr[2]);
//				data.setMonth(arr[3]);
//				data.setPrice(arr[4]);

				String region = arr[0];
				String size = arr[1];
				String year = arr[2];
				String month = arr[3];
				String price = arr[4].replace(" ", "").replace("\"", "").replace(",", "").replace("-", "");

				price = price.equals("") ? "0" : price;

				Data data = new Data(region, size, year, month, price);
				list.add(data);

				list.stream().filter(a -> Integer.parseInt(a.getPrice()) >= 2000 && a.getRegion().equals("서울")
						&& Integer.parseInt(a.getMonth()) >= 9).collect(Collectors.toList());
			}

			System.out.println(list.toString());

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
