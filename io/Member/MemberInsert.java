package Member;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberInsert implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("이름 입력 : ");
		String name = sc.next();
		System.out.println("나이 입력 : ");
		int age = sc.nextInt();
		System.out.println("핸드폰번호 입력 : ");
		int phone = sc.nextInt();
		System.out.println("주소 입력 : ");
		String add = sc.next();
		MemberDTO memberDTO = new MemberDTO(name, age, phone, add);
		
		arrayList.add(memberDTO);
		
		System.out.println("입력되었습니다.");
	}
}


