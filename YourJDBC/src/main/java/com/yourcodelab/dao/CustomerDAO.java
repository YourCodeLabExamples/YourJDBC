package com.yourcodelab.dao;

import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import com.yourcodelab.model.Customer;

public class CustomerDAO extends GenericDAO{
	private PreparedStatement ps;
	private String SQL_INSERT = "INSERT INTO TB_CUSTOMER(name, email, password) VALUES (?, ?, ?);";

	public void insertCustomer(Customer c){
		try {
			openConnection();
			
			ps = connect.prepareStatement(SQL_INSERT);
			ps.setString(1, c.getName());
			ps.setString(2, c.getEmail());
			ps.setString(3, c.getPassword());
			
			ps.executeUpdate();
			
			closeConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found");
		} catch (IOException e) {
			System.out.println("File not Found");
		} catch (SQLException e) {
			System.out.println("Error on Connecting");
		}
	}
	
	public void updateCustomer(Customer c){
		
	}

	public void deleteCustomer(Customer c){
		
	}
	
	public List<Customer> findByID(Customer c){
		return null;
	}
	
	public List<Customer> findAll(){
		return null;
	}
}
