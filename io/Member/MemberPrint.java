package Member;

import java.util.ArrayList;

public class MemberPrint implements Member {

	@Override
	public void execute(ArrayList<MemberDTO> arrayList) {
		for (MemberDTO memberDTO : arrayList) {
			System.out.println(memberDTO.toString());
		}

	}
}
