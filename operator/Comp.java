package operator;
import java.util.Scanner;
public class Comp {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("문자");
		
		char word = sc.next().charAt(0);
		
		if(word < 97) {
			word +=32;
			System.out.println(word);
		}
		else {
			word -=32;
			System.out.println(word);
			
		char ch = 'e';
		// char ch = 'B';
		int result = ch >='A' && ch<='Z' ? ch+32 : ch-32;
		System.out.println(ch + "→" + (char)result);
		}
	}
}

/*
 * [문제] 변수의 값이 대문자이면 소문자로 변환해서 출력, 소문자이면 대문자로 변환해서 출력하시오
 * 
 * [실행결과] B → b e → E
 */

