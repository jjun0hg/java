package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukUpdate implements SungJuk {

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("수정할 번호를 입력해주세요");
		int num = sc.nextInt();
		
//		int sw;
//		for (SungJukDTO sungJukDTO : arrayList) {
//			if(sungJukDTO.getNo() == num) {
//				sw = 1;
//				break;
//			}
 		
		
		
		
		for(int i =0; i<arrayList.size(); i++) {
			if(arrayList.get(i).getNo() == num) {
			System.out.println("수정할 이름을 입력해주세요");
			arrayList.get(i).setName(sc.next());
			System.out.println("수정할 국어점수를 입력해주세요");
			int kor = sc.nextInt();
			arrayList.get(i).setKor(kor);
			System.out.println("수정할 영어점수를 입력해주세요");
			arrayList.get(i).setEng(sc.nextInt());
			System.out.println("수정할 수학점수를 입력해주세요");
			arrayList.get(i).setMath(sc.nextInt());
			System.out.println();
		}
		else {
			System.out.println("잘못된 번호입니다. 다시 입력해주세요."); continue;
		}
	}
}
}



