package class__;

import java.util.Scanner;

public class StringMain2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열 입력 : ");
		String original = sc.next();
		
		System.out.print("현재 문자열 입력 : ");
		String current = sc.next();
		
		System.out.print("바꿀 문자열 입력 : ");
		String after = sc.next();
		
		if(original.length() < current.length()) {
			System.out.println("입력한 문자열의 크기가 작습니다.");
			System.out.println("치환 할 수 없습니다.");
//			return; // 함수를 벗어나라
			System.exit(0); //프로그램 강제 종료
		}
		// original.indexOf("aa", 위치) 0 	맨처음에 만난 "aa" 위치를 알려준다.
		original = original.toLowerCase();
		current = current.toLowerCase();
		
		int index = 0;
		int count = 0;
		
		while((index = original.indexOf(current, index)) != -1) {
			count ++;
			index = index + current.length();
		}// while
		
		System.out.println(original.replace(current, after));
		System.out.println(count + "번 치환");
	}
}

