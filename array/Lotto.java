package array;

public class Lotto {

	public static void main(String[] args) {
		int [] lotto = new int[6];
		//난수 발생, 중복 x			
		for (int i=0; i<lotto.length; i++) {
			lotto[i]=(int)(Math.random() * 45+1);
			System.out.print(String.format("%4d", lotto[i]));
		}System.out.println();
		
		// 중복제거
		for(int i=0; i<lotto.length; i++) {
			for(int j=0; j<i; j++) {
				if(lotto[i]==lotto[j])
				lotto[i] = (int)(Math.random() * 45+1);
			}
		}				
		//오름차순
		int temp;
		for(int i=0; i<lotto.length-1; i++) { // > 오름차순 <내림차순
			for(int j=i+1; j<lotto.length; j++) {
				if(lotto[i] > lotto[j]) {
					temp = lotto[i];
					lotto[i] = lotto[j];
					lotto[j] = temp;
			}
		}System.out.println();
		//출력
		
		}
		for (int value : lotto) {
			System.out.printf("%5d",value);
	}
}
}

// i= 0, 	1, 	2, 		3, 		4,			5
// j=		0	0,1		0,1,2	0,1,2,3		0,1,2,3,4

/*
 * [문제] 로또 - 자동완성
 * 크기가 6개인 배열 생성 
 * 1 ~ 45사이의 난수 발생
 * 숫자는 오름차순하여 출력 (Selection sort)
 * 출력시 자리수는 5자리로 지정
 * 중복 숫자가 나오면 안된다.
 * 
 * 
 * [실행결과]
 * 2 4 19 39 43 44
 * 
 */
