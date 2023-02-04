package re;
import java.util.Scanner;
public class If03 {

	public static void main(String[] args) {
		 while (true) {
	            Scanner scanner = new Scanner(System.in);

	            System.out.print("\n 숫자 3개를 입력: ");
	            int a = scanner.nextInt();
	            int b = scanner.nextInt();
	            int c = scanner.nextInt();        
	            if (a < b && a < c) {
	                if (b < c) {
	                    System.out.printf("%d %d %d", a, b, c);
	                } else {
	                    System.out.printf("%d %d %d", a, c, b);
	                }
	            }
	        }
	    }
		
}

