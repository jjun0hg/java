package array;

public class SelectionSort {

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
		for(int i=0; i<ar.length-1; i++) { // > 오름차순 <내림차순
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] < ar[j]) {
					temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
			}
		}System.out.println();
	}// sort 후
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));
		}
		System.out.println();
}

}