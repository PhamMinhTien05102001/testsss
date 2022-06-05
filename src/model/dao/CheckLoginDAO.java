package model.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import model.bean.Wife;

public class CheckLoginDAO {
	public boolean isValidUser(String username, String password)
	{
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dulieu_wife", "root", "");
			Statement sm = con.createStatement();
			
			String sql = "SELECT * FROM admin";
			ResultSet rs = sm.executeQuery(sql);
			while(rs.next()){
				if(username.equals(rs.getString(1)) && password.equals(rs.getString(2))){
					return true;
				}
			}
					
		}catch(Exception e){
		 	System.out.print(e);
		}
		return false;
	}
	
	public ArrayList<Wife> GetListWife(String username){
		ArrayList<Wife> data = new ArrayList<Wife>();
		
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dulieu_wife", "root", "");
			Statement sm = con.createStatement();
			
			String sql = "SELECT * FROM wife";
			ResultSet rs = sm.executeQuery(sql);
			while(rs.next()){
				Wife w = new Wife();
				w.setName(rs.getString(1));
				w.setAddress(rs.getString(2));
				w.setAlive(rs.getBoolean(3));
				
				data.add(w);
			}
					
		}catch(Exception e){
		 	System.out.print(e);
		}
		
		return data;
	}
}

