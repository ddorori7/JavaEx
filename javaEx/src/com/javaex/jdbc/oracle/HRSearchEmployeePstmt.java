package com.javaex.jdbc.oracle;

import java.sql.*;

import java.util.Scanner;


public class HRSearchEmployeePstmt {

	public static void main(String[] args) {
		// 접속 스트링
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		// 커넥션 개체
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("검색어:");
		String keyword = scanner.next();
		
		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "c##hr","hr");
			// 실행계획
			String sql = "select first_name || ' ' || last_name as name, " +
					"email, phone_number, hire_date" +
					" from employees " +
					" where lower(first_name) like ? or " +
					" lower(last_name) like ?";
			// 준비
			pstmt = conn.prepareStatement(sql);
			// 파라미터 세팅
			pstmt.setString(1, "%" + keyword.toLowerCase() + "%"); // 얘를 첫번째 ? 안에 넣음
			pstmt.setString(2, "%" + keyword.toLowerCase() + "%");
			
			// 실행
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				String name = rs.getString(1);
				String email = rs.getString(2);
				String phone_number = rs.getString(3);
				String hire_date = rs.getString(4);
				
				System.out.printf("Name: %s, email: %s, phone_number: %s, hire_date: %s%n", 
						name, email, phone_number, hire_date);
			}
		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { 
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		scanner.close();
	}

}
