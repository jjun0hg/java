package class__;

import static java.lang.Math.random;
import static java.lang.Math.pow;
import static java.lang.String.format;
import static java.lang.System.out;;

public class ImportStatic {
	public static void main(String[] args) {
		out.println(Math.random());
		out.println(pow(2, 5)); //2의 5승
		out.println(format("%.2f", 45.5678));
	}
	
}
