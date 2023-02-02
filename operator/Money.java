package operator;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Money {
	
	public static void main(String[] args) {
				
		int money = 5378;
		//	int a = money/1000;
		//	int b = money%100;
		//	int c = money%10;
		//	int d = b/10;
		//	int e = money%1000;
		//	int f = e/100;
		
		Scanner scan = new Scanner(System.in); //키보드로부터 입력받는 Scanner 클래스 생성
		System.out.print("돈 입력 : ");
		money = scan.nextInt();
		
		int a = money/1000;
		int b = money%100;
		int c = money%10;
		int d = b/10;
		int e = money%1000;
		int f = e/100;
		
		DecimalFormat df = new DecimalFormat();
		
		System.out.println("현금 : " + df.format(money) +"원"); // 3자리마다 , 찍기 // 문자열
		System.out.println("천원 : " + a +"장");
		System.out.println("천원 : " + f +"장");		
		System.out.println("십원 : " + d + "개");
		System.out.println("일원 : " + c + "개");
	}
}

/*
 * [문제] 현금 5378원이 있습니다.
 * 
 * [실행결과]
 * 	현금 : 5378원
	천원 : 5장
	백원 : 3개
	십원 : 7개
	일원 : 8개
 * 
 */