//번호 입력 : 
//이름 입력 : 
//국어 입력 : 
//영어 입력 : 
//수학 입력 : 
package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukInsert implements SungJuk {
	
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("번호 입력 : ");
		int no = sc.nextInt();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("국어 입력 : ");
		int kor = sc.nextInt();
		System.out.println("영어 입력 : ");
		int eng = sc.nextInt();
		System.out.println("수학 입력 : ");
		int math = sc.nextInt();
		
		SungJukDTO sungJukDTO = new SungJukDTO(no, name, kor, eng, math);
		sungJukDTO.calc();
		
		arrayList.add(sungJukDTO);
		
		System.out.println("입력되었습니다.");
	}
}


