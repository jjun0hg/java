package dbtest.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class InsertMain {
	private Connection conn;
	private PreparedStatement pstmt;

	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@localhost:1521:xe";
	private String username = "c##java";
	private String password = "1234";

	public InsertMain() {

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
		System.out.print("이름 입력 : ");
		String name = scanner.next();
		System.out.print("나이 입력 : ");
		int age = scanner.nextInt();
		System.out.print("키 입력 : ");
		double height = scanner.nextDouble();

		this.getConnection(); // 접속
		String sql = "INSERT INTO DBTEST VALUES(?, ?, ?, SYSDATE)";
		try {
			pstmt = conn.prepareStatement(sql); // 생성
			// ?에 데이터 대입
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setDouble(3, height);

			int su = pstmt.executeUpdate(); // 실행 - 개수 리턴
			System.out.println(su + " 행 이(가) 삽입되었습니다.");
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

	public static void main(String[] args) {
		InsertMain im = new InsertMain();
		im.insertArticle();
	}

}
