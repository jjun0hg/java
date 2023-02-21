package student.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Student {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";

	public Student() {

		// driver loading

		try {
			Class.forName(driver); // Class타입으로 생성
			System.out.println("driver loading 성공");
		} catch (ClassNotFoundException e) {

			e.printStackTrace();
		}
		// 접속은 한번만 하는것이 아니기 때문에 생성자에서 하면 안됨.
	}

	public void getConnection() {
		try {
			conn = DriverManager.getConnection(url, username, password);/* 오라클 드라이버 */
			System.out.println("connection 성공");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void insertArticle() {

		this.getConnection();
		System.out.println("****************\r\n" + "   1. 학생\r\n" + "   2. 교수\r\n" + "   3. 관리자\r\n" + "   4. 이전메뉴\r\n"
				+ "****************");
		Scanner scanner = new Scanner(System.in);
		System.out.print("번호선택 : ");
		int num = scanner.nextInt();
		if (num == 1) {
			System.out.println("이름입력 : ");
			String name = scanner.next();
			System.out.println("학번입력 : ");
			int stcode = scanner.nextInt();
			String sql = "INSERT INTO STUDENT(name,value,code) VALUES(?, ?, 1)";

			try {
				pstmt = conn.prepareStatement(sql); // 생성
				// ?에 데이터 대입
				pstmt.setString(1, name);
				pstmt.setInt(2, stcode);
				int su = pstmt.executeUpdate(); // 실행 - 개수 리턴
				System.out.println(su + " 행 이(가) 삽입되었습니다.");

			} catch (SQLException e) {
				e.printStackTrace();
			} // if
		}
		if (num == 2) {
			System.out.println("이름입력 : ");
			String name2 = scanner.next();
			System.out.println("과목입력 : ");
			String sub = scanner.next();
			String sql2 = "INSERT INTO STUDENT(name,value,code) VALUES(?, ?, 2)";

			try {
				pstmt = conn.prepareStatement(sql2); // 생성
				// ?에 데이터 대입
				pstmt.setString(1, name2);
				pstmt.setString(2, sub);
				int su = pstmt.executeUpdate(); // 실행 - 개수 리턴
				System.out.println(su + " 행 이(가) 삽입되었습니다.");

			} catch (SQLException e) {
				e.printStackTrace();
			} // if
		}
		if (num == 3) {

			System.out.println("이름입력 : ");
			String name3 = scanner.next();
			System.out.println("부서입력 : ");
			String bu = scanner.next();
			String sql3 = "INSERT INTO STUDENT(name,value,code) VALUES(?, ?, 3)";
			try {
				pstmt = conn.prepareStatement(sql3); // 생성
				// ?에 데이터 대입
				pstmt.setString(1, name3);
				pstmt.setString(2, bu);

				int su = pstmt.executeUpdate(); // 실행 - 개수 리턴
				System.out.println(su + " 행 이(가) 삽입되었습니다.");

			} catch (SQLException e) {
				e.printStackTrace();
			} // if

			finally {
				try {
					if (pstmt != null)
						pstmt.close();
					if (conn != null)
						conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	public void menu() {

		while (true) {
			System.out.println();
			System.out.println("*******************");
			System.out.println();
			System.out.println("관리");
			System.out.println();
			System.out.println("*******************");
			System.out.println(" 1. 입력");
			System.out.println(" 2. 검색");
			System.out.println(" 3. 삭제");
			System.out.println(" 4. 종료");
			System.out.println("*******************");
			Scanner sc = new Scanner(System.in);
			System.out.print("번호 선택 : ");
			int num = sc.nextInt();
			if (num == 1) {
				Student student = new Student();
				student.insertArticle();
			}
			if (num == 4)
				break;
		}
		System.out.println("프로그램 종료합니다.");
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.menu();

	}
}
