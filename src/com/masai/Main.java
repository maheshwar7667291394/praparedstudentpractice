package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		
		System.out.println("enter marks");
		int marks=input.nextInt();
		
			String url="jdbc:mysql://localhost:3306/mahesh";
			
			try (Connection com=DriverManager.getConnection(url,"root","M13a1h8@")){
				
//			Statement st=com.createStatement();
				
			 PreparedStatement ps=com.prepareStatement("update student set marks=marks+? where marks>600");
				ps.setInt(1, marks);
				
				int x=ps.executeUpdate();
				
			
			if(x>0) {
				System.out.println(x+ " row update sucessfully");
			}
			else {
				System.out.println("not update any row");
			}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		}
	}
			
		
		
	


