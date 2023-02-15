package collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetMain {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("호랑이");
		set.add("사자");
		set.add("호랑이"); // 중복 허용 x , 순서 x
		set.add("기린");
		set.add("코끼리");
		set.add("fdsfdsf");
		
		Iterator it = set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}//while
	}
}
