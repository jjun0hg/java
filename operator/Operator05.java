package operator;

public class Operator05 {

	public static void main(String[] args) {
		
		boolean	a = 25 > 36;
		System.out.println("a = " + a); //a = false
		System.out.println("!a = " + !a); //!a = true
		System.out.println();
		
		String b = "apple"; // literal 생성
		String c = new String ("apple");
		
		String result = b==c ? "같다":"다르다";
		System.out.println("b==c : " + result);
		System.out.println("b != c : " + (b !=c ? "참":"거짓"));
		System.out.println();
		
		
		String result2 = b.equals(c) ? "같다":"다르다";
		System.out.println("b.equals(c) : " + result);
		System.out.println("!b.equals(c) : " + (b !=c ? "참":"거짓"));
		System.out.println();
	}
}


