package com.javaex.jdbc.oracle;

import java.sql.*;

import java.util.Scanner;

public class HRSearchEmployee {

	
	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner sc = new Scanner(System.in);
		String keyword = sc.next().toUpperCase();
		System.out.println(keyword);
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "C##hr", "hr");
			String sql = "select first_name || ' ' || last_name as name, "
					+ "email, phone_number, to_char(hire_date, 'yyyy-mm-dd') hire" 
					+ " FROM employees";
			stmt = conn.createStatement();
			// 질의 수행
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("name");
				String email = rs.getString("email");
				String phone_number = rs.getString("phone_number");
				String hire_date = rs.getString("hire");

				if (name.toUpperCase().contains(keyword)) {
					System.out.printf("Name: %s, email: %s, phone_number: %s, hire_date: %s%n", 
							name, email, phone_number, hire_date);
				}
			}

		} catch (ClassNotFoundException e) {
			System.err.println("드라이브 로드 실패!");
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try { 
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
}
	//  쌤풀이 방법
	//package com.javaex.jdbc.oracle; 
	//
	//import java.util.Scanner;
	//import java.sql.*;
	//
	//public class HRSearchEmployee {
	//	private static String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
	//
	//	public static void main(String[] args) {
	//		Scanner scanner = new Scanner(System.in);
	//
	//		Connection conn = null;
	//		Statement stmt = null;
	//		ResultSet rs = null;
	//
	//		System.out.print("검색어:");
	//		String keyword = scanner.next();
	//
	//		try {
	//			Class.forName("oracle.jdbc.driver.OracleDriver");
	//			conn = DriverManager.getConnection(dburl, "HR", "hr");
	//			String sql = "SELECT first_name || ' ' || last_name as name, " +
	//					" email, phone_number, hire_date FROM employees " +
	//					" WHERE lower(first_name) LIKE '%" + keyword.toLowerCase() + "%' OR " +
	//					" lower(last_name) LIKE '%" + keyword.toLowerCase() + "%'";
	//			stmt = conn.createStatement();
	//			rs = stmt.executeQuery(sql);
	//
	//			while (rs.next()) {
	//				String name = rs.getString("name");
	//				String email = rs.getString("email");
	//				String phoneNumber = rs.getString("phone_number");
	//				String hireDate = rs.getString("hire_date");
	//
	//				System.out.printf("%s: %s, %s, %s%n",
	//						name, email, phoneNumber, hireDate);
	//			}
	//		} catch (ClassNotFoundException e) {
	//			System.err.println("드라이버 로드 실패!");
	//		} catch (SQLException e) {
	//			System.err.println("SQLError!");
	//			e.printStackTrace();
	//		} finally {
	//			try {
	//				rs.close();
	//				stmt.close();
	//				conn.close();
	//			} catch (Exception e) {
	//				e.printStackTrace();
	//			}
	//		}
	//	}
	//
	//}
