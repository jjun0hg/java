package array;

import java.util.Scanner;

public class Array03 {

	public static void main(String[] args) {
		int[] ar;
		int sum=0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("배열 크기 입력: ");
		int size = sc.nextInt();
		
		ar= new int[size];
		System.out.println("배열에 들어갈 숫자를 입력하시오");
		for (int i=0; i <size; i++) {
			System.out.println("ar[" + i + "] 입력 = ");
			ar[i] = sc.nextInt();
			
			sum += ar[i];
		}
//		int max = 배열의 첫번째 데이터를 초기값으로 받는다.
		int max = ar[0];
		for (int i=1; i<ar.length; i++) {
			if (ar[i] > max) max = ar[i];
				
				}
		
		
		for(int data : ar) {
			System.out.println(data);
		}
			System.out.println("합 = " + sum);
			System.out.println("최대값 : " + max);
	}

//		for(int i=0; ar.length; i++)
//			System.out.println("ar[" + i + "]");
		
	}



/*
[문제] 배열의 크기를 입력받아서 배열을 생성한다.


[실행결과]
배열 크기(size) 입력 : 3

ar[0] 입력 : 25
ar[1] 입력 : 13 
ar[2] 입력 : 57
ar[3] 입력 :
ar[4] 입력 :

25 13 57 
합 = xxx

*/
