package operator;

import java.util.Scanner;

public class Operator01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("점수 입력 : ");
		int score = scan.nextInt();
		
		String result = score >=80 && score<=100 ? "합격" : "불합격";
		System.out.println(result);
		
	}
}
