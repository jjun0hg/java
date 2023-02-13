package abstract_;

import java.util.Scanner;

public class CalendarEx {

	Scanner sc = new Scanner(System.in);
	private int Y,M,sum;
	private int[] months = {31, 0, 31, 30 ,31, 30, 31, 31, 30, 31, 30, 31};
	private String[] week = {"일", "월", "화", "수", "목", "금", "토"};
	private int day;
	private int[] days;
	
	void calc(){
		do{
			System.out.print("년도 입력 : ");
			Y = sc.nextInt();
		}while (Y<1);
		
		do{	
			System.out.print("월 입력 : ");
			M = sc.nextInt();
		}while (M<1 || M>12);
	}
	
	void date(){
		if ((Y%4==0 && Y%100!=0) || Y%400==0)	// 윤년
			months[1] = 29;
		else									// 평년
			months[1] = 28;
		
	sum = (Y-1)*365 + (Y-1)/4 - (Y-1)/100 + (Y-1)/400;	//날수 모두 더함
	
	for (int i=0; i<(M-1); i++)
		sum += months[i];	
	
	day = months[M-1];
	days = new int[day];
	
	for (int i=0; i<days.length; i++)
		days[i] = i+1;
	
	day = sum%7+1;
	}
	
	public void display() {
		System.out.println("  일   월   화   수   목   금   토");
		for (int i=0; i<day; i++)
			System.out.print("    ");
		
		for (int i=0; i<days.length; i++){
			System.out.printf("%4d", days[i]);
			
		if ((day+i+1)%7==0 && i!=days.length-1)
			System.out.println();
		}
	}
}

