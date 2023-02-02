package basic;

public class Variable01 {

	public static void main(String[] args) {
		System.out.println(Integer.MIN_VALUE + "," + Integer.MAX_VALUE); //-2147483648,2147483647
		System.out.println(Long.MIN_VALUE + "," + Long.MAX_VALUE); //-9223372036854775808,9223372036854775807
		System.out.println();
		
		boolean a;
		a = 25 > 36;
		System.out.println("a = " + a);
		
		char b;
		b ='A'; // 65, 0100 0001
		System.out.println("b = " + b);
		
		char c;
		c = 65;
		System.out.println("c = " + c);
		
		byte d=0; // 1byte, 8bit, -128 ~ +127
		//d = 128; -error
		System.out.println("d = " + d);
		
		int e;
		e = 65; // 0100 0001
		System.out.println("e = " + e);
		
		int f;
		f = 'A';
		System.out.println("f = " + f);
		
		long g;
		g = 25; //251은 long형 상수

		float h;
		//h = 43.8; //43.8은 double형 상수
		//h = (float)34.8; //강제형변환
		h = (float)43.8F; //43.8은 float형 상수
	}
}


