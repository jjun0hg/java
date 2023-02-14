package interface_;

public class ComputeMain {
	
	public static void main(String[] args) {
		ComputeService computeService = new ComputeService(); // 객체 클래스
		computeService.menu();
		System.out.println("프로그램을 종료합니다");
		
	}
}

