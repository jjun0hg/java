package inheritance;

public class SubMain extends Super{
	private String name;
	private int age;
	
	SubMain(){
		System.out.println("SubMain 기본 생성자");
	}
	SubMain(String name, int age, double weight , double height){
		this.name = name;	//this == 자신의 참조값을 가지고 있는 클래스
		this.age = age;
		super.weight= weight; //this.weight = weight;
		this.height= height;
	}
	
	public void output() {
		System.out.println("이름 = " + name);
		System.out.println("나이 = " + age);
		this.disp();
	}
	
	public static void main(String[] args) {
		SubMain aa = new SubMain("홍길동", 25, 73.5, 182.6);
		aa.disp(); // 부모 메소드 호출
		System.out.println("--------------------");
		aa.output();
		System.out.println("=====================");
		
		Super bb = new SubMain("코난", 13, 53.5, 156.6);
		bb.disp();
	}
}
//자식클래스 메모리 생성할 때
//부모 클래스 생성
//자식 클래스 생성