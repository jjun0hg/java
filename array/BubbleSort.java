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
			int j=0;
			for(int k = j+1; k<ar.length; k++) {
				if(ar[i] < ar[k]) {
					temp = ar[i];
					ar[i] = ar[k];
					ar[k] = temp;
			}
		}System.out.println();
	}// sort 후
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));
		}
		System.out.println();
	}
}



