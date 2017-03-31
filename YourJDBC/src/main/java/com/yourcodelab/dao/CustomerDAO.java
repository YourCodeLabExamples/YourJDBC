package com.yourcodelab.dao;

import java.sql.SQLException;
import java.util.List;

import com.yourcodelab.model.Customer;

public class CustomerDAO extends GenericDAO{
	private String SQL_INSERT = "INSERT INTO TB_CUSTOMER VALUES";

	public void insertCustomer(Customer c){
		openConnection();
		
		try {
			connect.prepareStatement(SQL_INSERT);
		} catch (SQLException e) {
			
		}
		
		closeConnection();
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
