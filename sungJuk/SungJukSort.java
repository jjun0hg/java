package sungJuk;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class SungJukSort implements SungJuk {
	Scanner sc = new Scanner(System.in);

	@Override
	public void execute(ArrayList<SungJukDTO> arrayList) {
		System.out.println("***********************");
		System.out.println("메뉴 입력 : " + "\n" + "1. 총점으로 내림차순\r\n" + "2. 이름으로 오름차순\r\n" + "3. 이전 메뉴");
		System.out.println("***********************");
		int menu = sc.nextInt();

		if (menu == 1) {
			System.out.println("총점으로 오름차순");
			Collections.sort(arrayList);
		} else if (menu == 2) {
			System.out.println("이름으로 오름차순");

			Comparator<SungJukDTO> com = new Comparator<SungJukDTO>() {
				@Override
				public int compare(SungJukDTO dto1, SungJukDTO dto2) {
					return dto1.getName().compareTo(dto2.getName()); // - 오름차순
				}
			};
			Collections.sort(arrayList, com);
			for (SungJukDTO sungJukDTO : arrayList) {
				System.out.println(sungJukDTO);
			}
			System.out.println();
		} else if (menu == 3) {
			SungJukService sungjukService = new SungJukService();
			sungjukService.menu();
			System.out.println("이전 메뉴로 돌아갑니다.");
		}
	}
}
