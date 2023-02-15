package collection;

public class PersonDTO implements Comparable<PersonDTO>{
	private String name;
	private int age;
	
	public PersonDTO(String name, int age) {
		this.name = name;
		this.age = age;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	@Override
	public String toString() { //object꺼 (위에서 extends Object생략됨)
		return name + "\t" + age;
	}

	@Override
	public int compareTo(PersonDTO dto) {
		//age로 오름차순
		if(this.age < dto.age) return -1; // 오른쪽이 더 크면 -1 같으면 0 오른쪽이 더 작으면 1
		else if(this.age > dto.age) return 1; // 오른쪽이 더 크면 -1 같으면 0 오른쪽이 더 작으면 1
		else return 0;
	}
	
}

//생성자 (이름, 나이)