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
	String value = null;
	int num;

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
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("****************");
			System.out.println("   1. 학생");
			System.out.println("   2. 교수");
			System.out.println("   3. 관리자");
			System.out.println("   4. 이전메뉴");
			System.out.println("****************");
			System.out.print("   번호 입력 : ");
			num = scanner.nextInt();
			if (num == 4)
				break;

			System.out.println("이름입력 : ");
			String name = scanner.next();
			if (num == 1) {
				System.out.println("학번입력 : ");
				value = scanner.next();
			} // if
			if (num == 2) {
				System.out.println("과목입력 : ");
				value = scanner.next();
			} // if
			if (num == 3) {
				System.out.println("부서입력 : ");
				value = scanner.next();
			} // if

			this.getConnection();
			String sql = "INSERT INTO STUDENT VALUES(?,?,?)";
			try {
				pstmt = conn.prepareStatement(sql); // 생성
				pstmt.setString(1, name);
				pstmt.setString(2, value);
				pstmt.setInt(3, num);

				int su = pstmt.executeUpdate();
				System.out.println(su + "행이 삽입 되었습니다.");

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
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

	public void SelectArticle() {
		Scanner scanner = new Scanner(System.in);
		while (true) {
			System.out.println();
			System.out.println("****************");
			System.out.println("   1. 이름 검색");
			System.out.println("   2. 전체 검색");
			System.out.println("   3. 이전메뉴");
			System.out.println("****************");
			System.out.print("   번호 선택 : ");
			num = scanner.nextInt();
			if (num == 3)
				break;
			String name = null;
			getConnection(); // 접속
			if (num == 1) {
				System.out.println("검색할 이름 입력 : ");
				name = scanner.next();
			}
			getConnection();

			String sql = null;
			if (num == 1)
				sql = "SELECT *FROM STUDENT WHERE NAME LIKE ?";
			else
				sql = "SELECT * FROM STUDENT";

			try {
				pstmt = conn.prepareStatement(sql); // 생성
				if (num == 1)
					pstmt.setString(1, "%" + name + "%");

				rs = pstmt.executeQuery(); // 실행 - ResultSet 리턴

				while (rs.next()) {
					System.out.println("이름 = " + rs.getString("name") + "\t");

					if (rs.getInt("code") == 1)
						System.out.print("학번 = " + rs.getString("value") + "\t");
					else if (rs.getInt("code") == 2)
						System.out.print("과목 = " + rs.getString("value") + "\t");
					else if (rs.getInt("code") == 3)
						System.out.print("부서 = " + rs.getString("value") + "\t");
				} // while

			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				try {
					if (rs != null)
						rs.close();

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

	public void DeleteArticle() {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 이름 입력");
		String name = sc.next();

		getConnection();
		String sql = "DELETE STUDENT WHERE NAME = ?";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			int su = pstmt.executeUpdate();
			System.out.println(su + "개의 행이 삭제 되었습니다.");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();

				if (pstmt != null)
					pstmt.close();
				if (conn != null)
					conn.close();
			} catch (SQLException e) {
				e.printStackTrace();
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
			if (num == 2) {
				Student student = new Student();
				student.SelectArticle();
			}
			if (num == 3) {
				Student student = new Student();
				student.DeleteArticle();
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
