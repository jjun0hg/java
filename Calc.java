package basic;

public class Calc {
		int a,b;
		
	public static void main(String[] args) {
		int a;
		a = 320;
		
		int b;
		b = 258;
		
		System.out.println("320 + 258 = " + (a + b));
		System.out.println("320 - 258 = " + (a - b));
		System.out.println("320 * 258 = " + (a * b));
		System.out.println("320 / 258 = " + String.format("%.2f", (float)(a / b)));
	}
}

//1줄 주석
/*

[문제] 320(a), 258(b)을 변수에 저장하여 합(sum), 차(sub), 곱(mul), 몫(div)을 구하시오
단, 소수이하 둘째자리까지 출력하시오.

[실행결과]
320 + 258 = xxx
320 - 258 = xxx
320 * 258 = xxx
320 / 258 = x.xx
 */

