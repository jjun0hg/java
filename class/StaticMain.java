package class__;

class StaticTest{
	private int a;// 필드, 인스턴스 변수
	private static int b;// 필드, 클래스 변수
	
	static {
		System.out.println("초기화 영역");
		StaticTest.b = 5; //this.b -error 
	}
	
	public StaticTest() {
		System.out.println("기본 생성자");
		this.a =5;
	}
	
	public void calc() {
		a++;
		b++;
	}
	public void disp() {
		System.out.println("a = " + this.a + " b = " + StaticTest.b);
	}
	
	public static void output() {
		System.out.println("static method...");
		//error => static 메소드안에서 static 변수만 사용 가능
		//System.out.println("a = " + a + " b = " + b);
	}
}

//---------------------
public class StaticMain {
	
	public static void main(String[] args) {
		StaticTest aa = new StaticTest();
		aa.calc();
		aa.disp();
		System.out.println();
		StaticTest bb = new StaticTest();
		bb.calc();
		bb.disp();
		System.out.println();
		StaticTest cc = new StaticTest();
		cc.calc();
		cc.disp();
		System.out.println();
	
		StaticTest.output();// 클래스명.메소드
		aa.output();//객체.메소드()
		
	}
}


