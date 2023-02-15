package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class PersonSort {

	public static void main(String[] args) {
		String[] ar = { "orange", "apple", "banana", "pear", "peach", "applemango" };

		System.out.print("정렬 전 = ");
		for (String data : ar) {
			System.out.print(data + " ");
		}
		System.out.println();

		Arrays.sort(ar);

		System.out.print("정렬 후 = ");
		for (String data : ar) {
			System.out.print(data + " ");
		}
		System.out.println("\n");

		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("라이언", 35);

		ArrayList<PersonDTO> arrayList = new ArrayList<PersonDTO>();
		arrayList.add(aa);
		arrayList.add(bb);
		arrayList.add(cc);

		System.out.println("정렬 전 ");
		for (PersonDTO personDTO : arrayList) {
			System.out.println(personDTO);
		}
		System.out.println();

		Collections.sort(arrayList);

		System.out.println("나이로 오름차순");
		System.out.println("정렬 후");
		for (PersonDTO personDTO : arrayList) {
			System.out.println(personDTO);
		}
		System.out.println();

		System.out.println("이름으로 내림차순");
		Comparator<PersonDTO> com = new Comparator<PersonDTO>() {

			@Override
			public int compare(PersonDTO dto1, PersonDTO dto2) {
//				return dto1.getName().compareTo(dto2.getName());	// - 오름차순
//				return dto1.getName().compareTo(dto2.getName()) * -1;	// - 내림차순
				return dto2.getName().compareTo(dto1.getName());	// - 내림차순
			}
		};
		
		Collections.sort(arrayList, com);
		for(PersonDTO personDTO : arrayList) {
			System.out.println(personDTO);
		}
		System.out.println();
	}
}
