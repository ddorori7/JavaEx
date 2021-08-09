package com.javaex.jdbc.oracle;

import java.sql.*;

import java.util.Scanner;

public class HRSalary {

	public static void main(String[] args) {

		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		// 커넥션 개체
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("최소급여:");
		int keywordMin = scanner.nextInt();

		System.out.print("최고급여:");
		int keywordMax = scanner.nextInt();

		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "c##hr", "hr");
			// 실행계획
			String sql = "select first_name || ' ' || last_name as name," 
					+ "salary" 
					+ " from employees" 
					+ " where salary >= " + keywordMin + "and salary <=" + keywordMax
					+ " order by salary asc";
			
			stmt = conn.createStatement();
			// 실행
			rs = stmt.executeQuery(sql);

			while (rs.next()) {
				String name = rs.getString("name");
				int salary = rs.getInt("salary");

				System.out.printf("%s\t\t%d%n", name, salary);
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

		scanner.close();

	}

}
