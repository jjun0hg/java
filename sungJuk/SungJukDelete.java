package sungJuk;

import java.util.ArrayList;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {
	Scanner sc = new Scanner(System.in);
	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println("삭제할 이름을 입력해주세요.");
		String name = sc.next();
		
		for(int i=0; i<arrayList.size(); i++) {
			if(arrayList.get(i).getName().equals(name)) {
				System.out.println("삭제가 완료되었습니다.");
			}
			else if(!(arrayList.get(i).getName().equals(name))) {
				System.out.println("회원의 정보가 없습니다.");
			}
		}
	}

}