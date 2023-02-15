package collection;

class GenericTest<T> {
	private T a;

	public void setA(T a) {
		this.a = a;
	}
	
	public T getA() {
		return a;
	}	
}

//--------------------
public class GenericMain {

	public static void main(String[] args) {
		GenericTest<String> aa = new GenericTest<String>();
		aa.setA("홍길동");
		System.out.println("이름 = " + aa.getA());
		
		GenericTest<Integer> bb = new GenericTest<Integer>(); // Wrapper class 와야함
		bb.setA(25);
		System.out.println("이름 = " + bb.getA());
		
	
	}
}
