package com.ITT.rajcomics.db;

//import java.beans.Statement;
import java.sql.*;
//import java.sql.DriverManager;

public class DataBase implements DBInterface{
	public void displayCharacterList(){
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/comic_universe_db","root","root");    
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from character_tablle");
			if(rs == null){
				String heroDontExistMessage = "No Heroes exist in this world.\n" + "You have to be your own hero\n";
				System.out.println(heroDontExistMessage);
				return;
			}
			while(rs.next()) { 
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getString(3)+ " "+ rs.getInt(4)+ " "+ rs.getString(5)); 
			}
		}
		catch(Exception e){
			
		}
	}
}