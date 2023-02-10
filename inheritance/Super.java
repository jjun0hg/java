package inheritance;

public class Super extends Object {
	protected double weight, height;
	
	Super(){
		System.out.println("Super 기본 생산자");
	}
	Super(double weight, double height){ //생성자 void 절대 x
		this.weight = weight;
		this.height = height;
	}
	public void disp() {
		System.out.println("몸무게 = " + weight);
		System.out.println("키 = " + height);
		
		
	}
}
