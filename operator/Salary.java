package operator;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 입력 : ");
		String name = sc.nextLine();
		System.out.print("직급 입력 : ");
		String rank = sc.nextLine();
		System.out.print("기본급 입력 : ");
		int money = sc.nextInt();
		System.out.print("수당 입력 : ");
		int plus = sc.nextInt();
		
		int sum = money+plus;
		double ratio = (sum >=5000000) ? (0.03) : (sum >= 3000000) ?  (0.02):(0.01);
		double fee = sum*ratio;
		double month = sum - fee;
		
		System.out.println("***" + name +" " + rank +" "+ "월급" + "***");
		DecimalFormat df = new DecimalFormat("###,###");
		System.out.println("기본급 : " + df.format(money) + "원"  );
		System.out.println("수당 : " + df.format(plus));
		System.out.println("합계 : " + df.format(sum));
		System.out.println("세금 : " + df.format(fee));
		System.out.println("월급 : " + df.format(month));

	}
	
}

/*
 * [문제] 월급 계산 프로그램 - 조건 연산자 이름, 직급, 기본급, 수당을 입력하여 합계, 세금, 월급을 출력하시오 
 * 단 합계가 5,000,000원 이상이면 3% 3,000,000원 이상이면 2% 아니면 1%
 * 
 * 합계 = 기본급 + 수당 //합계(sum) 기본급(money) 수당(plus)
 * 세금 = 합계 * 세율  //세금(fee) 합계(sum) 세율(ratio)
 * 월급 = 합계 - 세금 // 월급(month) 합계(sum) 세금(fee)
 * 
 * [실행결과] 
 * 이름 입력 : 홍길동 
 * 직급 입력 : 부장 
 * 기본급 입력 : 4900000 
 * 수당 입력 : 200000
 * 
 * 홍길동 부장 월급 *** 
 * 기본급 : 4,900,000원 
 * 수당 : 200,000원 
 * 합계 : 5,100,000원 
 * 세금 : 153,000원 
 * 월급 : 4,947,000원
 * 
 */




