package class__;

public class StringMain2 {

	public static void main(String[] args) {
		
		String a = "aababb"; if(a.length() > 0){ int l = 0, i = 0;
		do{ l = a.indexOf("a", l + 1); System.out.println(i + "번 째 위치 : " + l); }
		while(l+1 < a.length() && l != -1); }
		
		
		
	}
}
