package if_;

import java.util.Scanner;

public class If03 {

	public static void main(String[] args) {
		 while (true) {
	            Scanner scanner = new Scanner(System.in);

	            System.out.print("\n 숫자 3개를 입력: ");
	            int a = scanner.nextInt();
	            int b = scanner.nextInt();
	            int c = scanner.nextInt();        
	            if (a < b && a < c) {
	                if (b < c) {
	                    System.out.printf("%d %d %d", a, b, c);
	                } else {
	                    System.out.printf("%d %d %d", a, c, b);
	                }
	            }
	        }
	    }
}



/*
[문제] 3개의 숫자(a,b,c)를 입력받아서 순서대로 출력하시오 (if문 사용하시오)

[실행결과]
a의 값 : 98
b의 값 : 90
c의 값 : 85

85 90 98
---------------------
a의 값 : 75
b의 값 : 25
c의 값 : 36

25 36 75

*/