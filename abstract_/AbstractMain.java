package abstract_;

public class AbstractMain extends AbstractTest {

	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
//		AbstractTest at = new AbstractTest(); 추상클래스는 new가 불가능, 자신의 클래스로 메모리 생성을 할 수 없다.
		AbstractTest at = new AbstractMain();
		at.setName("홍길동");
		System.out.println(at.getName());
				
	}
}


