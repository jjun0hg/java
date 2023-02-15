package collection;

import java.util.ArrayList;

public class PersonMain {

	public ArrayList<PersonDTO> init() { // 구현부
		PersonDTO aa = new PersonDTO("홍길동", 25);
		PersonDTO bb = new PersonDTO("프로도", 40);
		PersonDTO cc = new PersonDTO("라이언", 35);

		ArrayList<PersonDTO> arrayList = new ArrayList<PersonDTO>();
		arrayList.add(aa);
		arrayList.add(bb);
		arrayList.add(cc);

		return arrayList; // 주소값가져옴

	}

	public static void main(String[] args) {
		PersonMain personMain = new PersonMain();
		ArrayList<PersonDTO> list = personMain.init();

		for (PersonDTO personDTO : list) {
			System.out.println(personDTO.getName() + "\t" + personDTO.getAge());
		} // for

		for (PersonDTO personDTO : list) {
			System.out.println(personDTO.getName() + "\t" + personDTO.getAge());
		} // for

	}
}
