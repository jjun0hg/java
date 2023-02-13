package abstract_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Today {

	public static void main(String[] args) throws ParseException {
		Date date = new Date();//
		System.out.println("오늘 날짜 : " + date);
		
		SimpleDateFormat sdf = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
		System.out.println("오늘 날짜 : " + sdf.format(date));
		System.out.println();
		
		SimpleDateFormat input = new SimpleDateFormat("yyyyMMddHHmmss");
		Date birth = input.parse("19910716091415"); //String -> Date형 반환
		
		System.out.println("내 생일 = " + birth);
		System.out.println("내 생일 = " + sdf.format(birth));
		System.out.println();
		
		//Calendar cal = new Calendar(); -error
		
		Calendar cal = new GregorianCalendar(); //sub class
		Calendar cal2 = Calendar.getInstance(); //메소드
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH) + 1;
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(cal.DAY_OF_WEEK);
		
		String dayOfweek = null;
		switch(week) {
		case 1 : dayOfweek = "일"; break;
		case 2 : dayOfweek = "월"; break;
		case 3 : dayOfweek = "화"; break;
		case 4 : dayOfweek = "수"; break;
		case 5 : dayOfweek = "목"; break;
		case 6 : dayOfweek = "금"; break;
		case 7 : dayOfweek = "토";
		}
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int minute = cal.get(Calendar.MINUTE);
		int second = cal.get(Calendar.SECOND);
		
		
		System.out.println(year + "년 " + month + "월 " + day + "일" +" "+ dayOfweek + "요일" + hour+"시"+minute +"분"+ second + "초");
		
		
	}
}
