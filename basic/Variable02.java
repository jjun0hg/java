package basic;

class Test{
	int a = 10;
	static int b = 20;
}

public class Variable02 {
	int a = 0; //필드, 초기화
	double b; // 필드
	static int c;
	
	public static void main(String[] args) {
		int a=0;	//지역변수(local variable), garbage 
		System.out.println("지역변수 a = " + a);
		
		Variable02 v = new Variable02(); //메모리 생성
		System.out.println("객체 = " + v);
		System.out.println("필드 a = " + v.a);
		System.out.println("필드 a = " + v.b);
		
		Test t = new Test();
		System.out.println(t.b);
	
	}
}
