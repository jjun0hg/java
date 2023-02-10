package inheritance;


class AA {
	public int a =3;
	public void disp() {
		a +=5;
		System.out.println("AA : " + a + " ");
	}
}
// ------------------
// disp ==Overriding
class BB extends AA {
	public int a = 8;
	public void disp() {
		this.a +=5;
		System.out.println("BB : " + a + " ");
	}
}
//------------------
public class OverrideMain {

	public static void main(String[] args) {
		AA bb = new BB(); //부모 = 자식
		bb.disp();	// BB : 13
		System.out.println("aa : " + bb.a); //13
		
		
		
		
	}
}



