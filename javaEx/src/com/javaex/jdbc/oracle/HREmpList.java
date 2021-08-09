package com.javaex.jdbc.oracle;

import java.sql.*;

public class HREmpList {

	public static void main(String[] args) {
		String dburl = "jdbc:oracle:thin:@localhost:1521:xe";
		Connection conn = null; //접속객체
		Statement stmt = null; //질의객체
		ResultSet rs = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conn = DriverManager.getConnection(dburl, "C##hr","hr");
			String sql = 
					"select emp.first_name || ' ' || emp.last_name as name, " +
					"mgr.first_name || ' ' || mgr.last_name mgr_name " +
					"FROM employees emp, employees mgr " +
					"where emp.manager_id = mgr.employee_id "+
					"order by name desc";
			stmt = conn.createStatement();
			//질의 수행
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				String name = rs.getString("name");
				String mgr_name = rs.getString("mgr_name");
				
				System.out.printf("Name: %s, Manager: %s%n", name, mgr_name);
			}
					
		} catch (ClassNotFoundException e) {
			System.err.println("드라이버 로드 실패");
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
