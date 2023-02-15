package collection;

public class PersonDTO {
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
	
}

//생성자 (이름, 나이)