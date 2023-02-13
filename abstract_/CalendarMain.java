package abstract_;

import java.io.IOException;

public class CalendarMain {

	public static void main(String[] args) throws IOException {

		{
			CalendarEx calc = new CalendarEx();
			calc.calc();
			calc.date();
			calc.display();
		}	
	}
}

/*

[문제] 만년달력
- 년도, 월을 입력하여 달력을 작성하시오
연도가 4의 배수이면서 100의 배수가 아니거나,  400의 배수이면 2월은 29일(윤년), 나머지 2월은 28일(평년)
클래스명 : CalendarEx
필드 : 
메소드 - 기본 생성자 	 : 월, 일을입력
       calc()    : 매달 1일의 요일이 무엇인지? (Calendar에 메소드 준비)
                   매달 마지막이 28, 29, 30, 31 무엇인지? (Calendar에 메소드 준비)
       display() : 출력

클래스명 : CalendarMain

[실행결과]
년도 입력 : 2002
월 입력 : 10   

  일   월   화   수   목   금   토
           1   2   3   4   5
   6   7   8   9  10  11  12
  13  14  15  16  17  18  19
  20  21  22  23  24  25  26
  27  28  29  30  31

*/