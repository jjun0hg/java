package nested;

public class AbstractMain { // extends AbstractTEST //Override

	public static void main(String[] args) {
		AbstractTest at = new AbstractTest() { // 익명 inner 클래스

			public void setName(String name) { // 구현
				this.name = name;
			}
		};
//		AbstractTest at = new AbstractTest(); // error - 추상클래스는 자체적인 생성이 불가능하다
//		상속- 자식클래스 이용하여 생성, 메소드

		InterA in = new InterA() { // interface가 new 된것이 아니라 {} 가 new
			public void aa() {
			}

			public void bb() {
			}
			
		AbstractExam ae = new AbstractExam() {
			//원하는 메소드를 Override 한다..
		};
		};
	}
}
