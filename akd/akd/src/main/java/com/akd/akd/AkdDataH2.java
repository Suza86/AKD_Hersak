package com.akd.akd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class AkdDataH2 {

	   public static void main (String [] args) throws Exception {
		   
	        Connection conn = null;
	        Statement stmt = null;
	 
	        Class.forName("org.h2.Driver");
	        conn = DriverManager.getConnection("jdbc:h2:~/akd_hersak", "", "");
	        stmt = conn.createStatement();
	 
	        stmt.execute(" drop table if exists akd_user ");
	        stmt.execute(" create table akd_user (id int primary key, ime varchar(255), prezime varchar(255), datumRodenja date) " 
	        		   + " AS SELECT * FROM CSVREAD('C:/Users/Sue/workspace/akd/akd/src/main/resources/akd.csv')");
            ResultSet rs = stmt.executeQuery("select * from akd_user");
	 
	        while (rs.next()) {
	            System.out.println(" id " + rs.getInt("id") 
	            		         + " ime " + rs.getString("ime")
	            		         + " prezime " + rs.getString("prezime")
	            		         + " datumRodenja " + rs.getDate("datumRodenja"));            		     
	        }
	        stmt.close();
	    }	
	
}
