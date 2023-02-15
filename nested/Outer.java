package nested;

public class Outer {
	private String name;

	public void output() {
		Inner in = new Inner();
		System.out.println("이름 = " + this.name + "\t나이 = " + in.age); // 바깥에서는 안에있는거 접근 X
	}

	class Inner {
		private int age;
		
		public void disp() {
			System.out.println("이름 = " + Outer.this.name + "\t나이= " + this.age);
		}
	}

	public static void main(String[] args) {
		Outer ou = new Outer();
		ou.name = "홍길동";
		System.out.println("이름 = " + ou.name);
		System.out.println();
		
		Outer.Inner in2 = ou.new Inner();
		in2.age = 25;
		in2.disp();
		System.out.println();
		
		Outer.Inner in3 = ou.new Inner();
		in2.age = 30;
		in2.disp();
		System.out.println();
		
		Outer.Inner in4 = new Outer().new Inner();
		in4.age = 35;
//		in4.name = ???; - error class안에서만 가능 , static에서 바깥으로 X
		in4.disp();
		System.out.println();
		
		
		
		
	}
}
