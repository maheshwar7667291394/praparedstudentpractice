package practice2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/mahesh";
			
			try {
				Connection com=DriverManager.getConnection(url,"root","M13a1h8@");
				if(com !=null) {
					System.out.println("connected.....");
				}
				else {
					System.out.println("not connected....");
				}
				
				
//				Statement st=com.createStatement();
				PreparedStatement ps=com.prepareStatement("insert into student values(?,?,?,?)");
				ps.setInt(1,9);
				ps.setString(2,"ramukakakak");
				ps.setString(3,"jaynagar");
				ps.setInt(4,560);
				int x=ps.executeUpdate();
				if(x>0) {
					System.out.println("delate  succesfull");
				}
				else {
					System.out.println("not delated");
				}
				
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	
		
	}

}
