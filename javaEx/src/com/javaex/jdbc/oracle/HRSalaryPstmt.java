package com.javaex.jdbc.oracle;

import java.sql.*;

import java.util.Scanner;

public class HRSalaryPstmt {

	public static void main(String[] args) {
		// 접속 스트링
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		// 커넥션 개체
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		Scanner scanner = new Scanner(System.in);

		System.out.print("최소급여:");
		int minSalary = scanner.nextInt();

		System.out.print("최고급여:");
		int maxSalary = scanner.nextInt();

		// 추가
		if (minSalary > maxSalary) {
			// 값을 바꾼다
			int temp = minSalary;
			minSalary = maxSalary;
			maxSalary = temp;
		}

		try {
			// 드라이버 로드
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "c##hr", "hr");
			// 실행계획
			String sql = "select first_name || ' ' || last_name as name," + "salary" + " from employees"
					+ " where salary >= ? and " + "salary <= ? " + " order by salary asc";
			// 준비
			pstmt = conn.prepareStatement(sql);
			// 파라미터 세팅
			pstmt.setInt(1, minSalary); // 얘를 첫번째 ? 안에 넣음
			pstmt.setInt(2, maxSalary);

			// 실행
			rs = pstmt.executeQuery();

			while (rs.next()) {
				String name = rs.getString("name");
				int salary = rs.getInt("salary");

				System.out.printf("%s		 %d%n", name, salary);
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
