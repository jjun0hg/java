package sungJuk;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SungJukDelete implements SungJuk {
	Scanner sc = new Scanner(System.in);

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println();
		System.out.println("삭제할 이름을 입력해주세요.");
		String name = sc.next();

		int count = 0;
//		for (int i = 0; i < arrayList.size(); i++) {
//			if (arrayList.get(i).getName().equals(name)) {
//				arrayList.remove(i);
//				count++;
//				System.out.println("삭제가 완료되었습니다.");
//			}
////error java.util.ConcurrentModificationException 			
//			for (SungJukDTO sungJukDTO : arrayList) {
//				if (sungJukDTO.getName().equals(name)) {
//					arrayList.remove(sungJukDTO);
//					count++;
//				}
//			} // for

		Iterator<SungJukDTO> it = arrayList.iterator();
		while (it.hasNext()) {
			SungJukDTO sungJukDTO = it.next(); //next가 없으면 remove 안된다.

			if (sungJukDTO.getName().equals(name)) {
				it.remove(); // it.next()가 반환하는 항목을 지운다.
				count++;
			}
		} // while

		if (count == 0)
			System.out.println("회원의 정보가 없습니다");
		else
			System.out.println(count + "건을 삭제하였습니다.");
	}
}
