package com.yourcodelab.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import com.yourcodelab.db.ConnectDB;

public class GenericDAO {
	private ConnectDB db = new ConnectDB();
	protected Connection connect;
	
	public void openConnection(){
		connect = null;
		
		try {
			connect = db.getConnection();
		} catch (ClassNotFoundException e) {
			System.out.println("Class not Found");
		} catch (IOException e) {
			System.out.println("File not Found");
		} catch (SQLException e) {
			System.out.println("Error on Connecting");
		}
	}
	
	public void closeConnection(){
		if(connect != null){
			try {
				connect.close();
			} catch (SQLException e) {
				System.out.println("Error on Closing Connection");
			}
		}
	}
}
