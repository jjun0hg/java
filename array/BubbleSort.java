package array;

public class BubbleSort {

	public static void main(String[] args) {
		int[] ar = {32, 40, 25, 78, 56};
		
		//sort 전
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));
		}
		System.out.println();
		
		//정렬
		//오름차순(ASCENDING)
		//내림차순(DESCENDING)
		int temp;
		for(int i=0; i<ar.length; i++) {
			for(int j=0; j<ar.length-1-i; j++) {
				if(ar[j] < ar[j+1]) {
					temp = ar[j];
					ar[j] = ar[j+1];
					ar[j+1] = temp;
			}
		}System.out.println();
	}// sort 후
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));
		}
		System.out.println();
	}
}



