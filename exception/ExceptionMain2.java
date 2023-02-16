package exception;

import java.util.Scanner;

public class ExceptionMain2 {
	private int x, y, output = 1;

	public void input() {
		Scanner sc = new Scanner(System.in);
		int output = 1;
		System.out.print("x 입력 : ");
		x = sc.nextInt();
		System.out.print("y 입력 : ");
		y = sc.nextInt();
		for (int i = 0; i < y; i++) {
			output *= x;
		}
	}

	public void output() {
		if (y >= 0) {
			for (int i = 0; i < y; i++) {
				output *= x;
			}
			System.out.printf("%d" + "의 " + "%d" + "승은  " + "%d", x, y, output);
		} else {
			// System.out.println("y는 0보다 크거나 같아야 한다.");
			// 개발작 강제로 Exception 발생
			try {
				throw new Exception("y는 0보다 크거나 같아야 한다.");
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {

		ExceptionMain2 exceptionMain2 = new ExceptionMain2();
		exceptionMain2.input();
		exceptionMain2.output();

	}
}

/*
 * [문제] 제곱 연산
 * 
 * - x의 y승을 처리 한다.
 * 
 * [실행결과]
 * 
 * x 입력 : 2 y 입력 : 10 input() ------------------------- 2의 10승은 xxx output()
 * 
 */