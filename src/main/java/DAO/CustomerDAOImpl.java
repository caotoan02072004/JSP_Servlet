package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.Database;
import entity.Customer;

public class CustomerDAOImpl implements CustomerDAO{
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs= null;
	
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> list = new ArrayList<Customer>();
		try {
			String sql = "SELECT * FROM Customer";
			con = new Database().openConnection();
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			while(rs.next()) {
				list.add(new Customer(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

	@Override
	public void addCustomer(String name, String gender, String birthday, String address, String phone, String email) {
		try {
			String sql = "INSERT INTO Customer (name, gender, birthday, address, phone, email) values(?,?,?,?,?,?)";
			con = new Database().openConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, birthday);
			ps.setString(4, address);
			ps.setString(5, phone);
			ps.setString(6, email);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void deleteCustomer(String id) {
		try {
			String sql = "DELETE FROM Customer WHERE ID = ?";
			con = new Database().openConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public Customer getCustomerById(String id) {
		try {
			String sql = "SELECT * FROM Customer WHERE ID = ?";
			con = new Database().openConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, id);
			rs = ps.executeQuery();
			while (rs.next()) {
				return new Customer(rs.getInt(1), rs.getString(2), rs.getBoolean(3), rs.getDate(4), rs.getString(5), rs.getString(6), rs.getString(7));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public void updateCustomer(String name, String gender, String birthday, String address, String phone, String email,
			String id) {
		try {
			String sql = "UPDATE Customer SET name = ?, gender = ?, birthday = ?, address = ?, phone = ?, email = ? WHERE ID = ?";
			con = new Database().openConnection();
			ps = con.prepareStatement(sql);
			ps.setString(1, name);
			ps.setString(2, gender);
			ps.setString(3, birthday);
			ps.setString(4, address);
			ps.setString(5, phone);
			ps.setString(6, email);
			ps.setString(7, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
