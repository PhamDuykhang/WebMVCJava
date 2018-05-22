package com.cnttctu.mywebmvc.DAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.cnttctu.mywebmvc.ConnectionDB.ConectionDB;
import com.cnttctu.mywebmvc.Entity.employee;
import com.mysql.cj.jdbc.PreparedStatement;

public class employeeDAO {
	public static ArrayList<employee> getAllEmployee() {
		Connection conn = ConectionDB.GetConection();
		String sql = "SELECT * FROM employee";
		ArrayList<employee> kq = new ArrayList<>();

		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				employee Emp = new employee();
				Emp.setId(rs.getInt("id"));
				Emp.setName(rs.getString("name"));
				Emp.setBirth(rs.getString("birth"));
				Emp.setJob(rs.getString("job"));
				kq.add(Emp);
			}
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return kq;
	}

	public static employee getEmployeeByID(int id) {
		Connection conn = ConectionDB.GetConection();
		employee ee = new employee();
		String sql = "SELECT * FROM employee WHERE id=?";
		try {
			PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
			ps.setInt(1, id);
			ResultSet rss = ps.executeQuery();
			rss.next();
			ee.setId(rss.getInt("id"));
			ee.setName(rss.getString("name"));
			ee.setBirth(rss.getString("birth"));
			ee.setJob(rss.getString("job"));
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ee;
	}

	public static boolean editEmployee(employee e) throws SQLException {
		Connection conn = ConectionDB.GetConection();

		String sql = "UPDATE employee SET name = ?,birth = ?, Job = ? WHERE id = ?";

		PreparedStatement ps = (PreparedStatement) conn.prepareStatement(sql);
		ps.setString(1, e.getName());
		ps.setString(2, e.getBirth());
		ps.setString(3, e.getJob());
		ps.setInt(4, e.getId());
		if (ps.executeUpdate() == 1) {
			conn.close();
			return true;
		} else {
			return false;
		}

	}

	public static boolean addEmployee(employee emp) throws SQLException {
		Connection conn = ConectionDB.GetConection();
		String sql = "INSERT INTO employee (name,birth,Job) VALUES (?,?,?)";
		PreparedStatement psinsert = (PreparedStatement) conn.prepareStatement(sql);
		psinsert.setString(1, emp.getName());
		psinsert.setString(2, emp.getBirth());
		psinsert.setString(3, emp.getJob());
		if (psinsert.executeUpdate() == 1) {
			conn.close();
			return true;
		} else {
			return false;
		}
	}
	public static boolean deleteEmployeeById(int id) throws SQLException {
		Connection conn = ConectionDB.GetConection();
		String sqldel = "DELETE FROM employee WHERE id=?";
		PreparedStatement psdel = (PreparedStatement) conn.prepareStatement(sqldel);
		psdel.setInt(1,id);
		if (psdel.executeUpdate() == 1) {
			conn.close();
			return true;
		} else {
			return false;
		}
	}

}
