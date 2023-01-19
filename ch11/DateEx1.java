package ch11;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateEx1 {

	public static void main(String[] args) {
		Date d = new Date();
		System.out.println(d);
		//1970년 1월1일부터 초 단위를  1/1000 계산
		System.out.println(System.currentTimeMillis());
		SimpleDateFormat sdf = 
	new SimpleDateFormat("yyy년 MM월 dd일 hh시 mm분 ss초");
		String str = sdf.format(d);
		System.out.println(str);
		

	}

}
