//회원의 정보는 이름, 나이, 핸드폰, 주소로 한다.
package Member;

import java.util.ArrayList;

public class MemberDTO {
	private String name;
	private int age, phone;
	private String add;

	public MemberDTO(String name, int age, int phone, String add) {
		this.name = name;
		this.age = age;
		this.phone = phone;
		this.add = add;
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

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getAdd() {
		return add;
	}

	public void setAdd(String add) {
		this.add = add;
	}

	@Override
	public String toString() {
		return "[이름 : " + name + ", 나이 : " + age + ", 핸드폰번호 : " + phone + ", 주소 : " + add + "]";
	}
}
