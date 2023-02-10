package class__;

import java.util.Scanner;

public class StringBufferMain {
		private int dan;
	
		public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.print("원하는 단을 입력 : ");
		dan = sc.nextInt();
		}

		public void output() {
			StringBuffer buffer = new StringBuffer(); //append()
			
            for (int i=1;i<10;i++) {
                //System.out.println(dan + "*" + i + "=" + dan*i);
            	
            	buffer.append(dan);
            	buffer.append("*");
            	buffer.append(i);
            	buffer.append("=");
            	buffer.append(dan * i);
            	
            	System.out.println(buffer.toString());
            	buffer.delete(0, buffer.length()); // 몇번부터 몇번 이전
            }    //for
		}
		
            public static void main(String[] args) {
            	StringBufferMain sbm = new StringBufferMain();
            	sbm.input();
            	sbm.output();
		}

}


/*
[문제] 구구단

원하는 단을 입력 : 5		input()
-------------------------------------
5*1=5				output()
5*2=10
5*3=15
5*4=20
5*5=36
5*6=40
5*7=46
5*8=40
5*9=45

*/
