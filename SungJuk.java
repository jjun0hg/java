package basic;

public class SungJuk {

	public static void main(String[] args) {
		char name;
		name = 'L';
		
		int kor;
		kor = 85;
		
		int eng;
		eng = 78;
		
		int math;
		math = 100;
		
		int tot;
		tot = kor + eng + math;
		
		Double avg;
		avg = tot / 3.00;
		
		System.out.println( "***" + name + " 성적표***");
		System.out.println( "국어\t영어\t수학\t평점\t[평균]");
		System.out.println( kor +"\t"+ eng +"\t" + math + "\t" + tot + "\t" + String.format("%.2f", avg));

	}

}

/*

[문제] 성적계산
이름(name)이 L 이고 국어점수(kor) 85, 영어점수(eng) 78, 수학점수(math) 100일때 총점(tot)과 평균(avg)을 구하시오
단, 평균은 소수이하 둘째자리까지 출력하시오.
총점 = 국어점수 + 영어점수 + 수학점수
평균 = 총점 / 과목수


[실행결과]
 *** L 성적표 ***
국어		영어		수학		평점		[평균]
85		78		100		XXX		XX.XX
 *
 *
 */
