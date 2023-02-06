package if_;
import java.util.Scanner;
public class If01 {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 System.out.print("숫자입력 : ");
		 int a = sc.nextInt();
		 	 
		 if(a >= 50) System.out.println(a + "는 50보다 크거나 같다");
		 System.out.println(a + "는 50보다 작다");
		 System.out.println();
		 
		 if(false)
			 if(true) System.out.println("A");
			 else System.out.println("B");
		 System.out.println("C");
		 System.out.println();
	
		 
		 if(true)
			 if(true) System.out.println("A");
			 else System.out.println("B");
		 System.out.println("C");
		 System.out.println();
		 
		 if(true)
			 if(false) System.out.println("A");
			 else System.out.println("B");
		 System.out.println("C");
		 System.out.println();
		 
		 if(a>='A' && a <='Z')
			 System.out.println((char)a + "는 대문자");
		 else if(a >='a' && a<='z')
			 System.out.println((char)a + "는 소문자");
		 else
			 System.out.println((char)a + "는 숫자이거나 특수문자");
	}
}
