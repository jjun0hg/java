package inheritance;

class Test extends Object {
	
	
	
}

//---------------
class Sample {

	@Override
	public String toString() {
		return getClass() + "@개바부"; // class명 꺼내옴
	}
}

//---------------
class Exam{
	private String name = "홍길동";
	private int age = 25;
	@Override
	public String toString() {
		return name + "\t" + age;
	}
}
//---------------
public class ObjectMain {
	public static void main(String[] args) {
		Test t = new Test();
		System.out.println("객체 t = " + t); //클래스명@16진수
		System.out.println("객체 t = " + t.toString());
		System.out.println("객체 t = " + t.hashCode()); //10진수
		System.out.println();
		
		Sample s = new Sample();
		System.out.println("객체 s = " + s.toString());
		System.out.println();
		
		Exam e = new Exam();
		System.out.println("객체 e = " + e.toString());
		System.out.println();
		
		String aa = "apple";
		System.out.println("객체 aa = " + aa); //문자열  / 문자열은 무한대로 표기가 되므로 10진수 표기x
		System.out.println("객체 aa = " + aa.toString());
		System.out.println("객체 aa = " + aa.hashCode()); //10진수
		System.out.println();

		String bb = new String("apple");
		String cc = new String("apple");
		System.out.println("bb==cc : " + (bb == cc)); //주소 - false
		System.out.println("bb.equals(cc) : " + bb.equals(cc)); //문자열 - true
		System.out.println();
		
		//Object 클래스는 둘다 주소 비교 ( 문자열 비교 x)
		// String 일때만 문자열 비교
		
		Object dd = new Object();
		Object ee = new Object();
		System.out.println("dd==ee : " + (dd == ee)); //주소 - false
		System.out.println("dd.equals(ee) : " + dd.equals(ee)); //주소 - false
		System.out.println();
		
		Object ff = new String("apple");
		Object gg = new String("apple");
		System.out.println("ff==gg : " + (ff == gg)); //주소 - false
		System.out.println("ff.equals(gg) : " + ff.equals(gg)); // 문자열 - true
		System.out.println();
		
	}
	
}



