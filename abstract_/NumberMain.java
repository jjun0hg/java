package abstract_;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class NumberMain {

	public static void main(String[] args) {
		//NumberFormat nf = new NumberFormat(); -error 추상클래스여서
		NumberFormat nf2 = new DecimalFormat("#,###.##원"); //Sub Class 이용하여 생성
		System.out.println(nf2.format(123456789.456789));
		System.out.println(nf2.format(12345678));
		System.out.println();
		
		NumberFormat nf3 = new DecimalFormat("#,###.00원"); //Sub Class 이용하여 생성
		System.out.println(nf3.format(123456789.456789));
		System.out.println(nf3.format(12345678));
		System.out.println();
		
		//메소드 이용하여 생성
		NumberFormat nf4 = NumberFormat.getInstance(); //메소드 이용하여 생성
		nf4.setMaximumFractionDigits(2);//소수이하 2째자리
		nf4.setMinimumFractionDigits(2);
		System.out.println(nf4.format(123456789.456789));
		System.out.println(nf4.format(12345678));
		System.out.println();
		
		NumberFormat nf5 = NumberFormat.getCurrencyInstance(Locale.US); //메소드 이용하여 생성
		nf5.setMaximumFractionDigits(2);//소수이하 2째자리
		nf5.setMinimumFractionDigits(2);
		System.out.println(nf5.format(123456789.456789));
		System.out.println(nf5.format(12345678));
		System.out.println();
	}
}
