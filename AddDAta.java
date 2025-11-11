package CrudOperation;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class AddDAta {
	
	
	public static void addingStudent(int v1,String v2,float v3) {
//		String url="jdbc:mysql://localhost:3306/piyush?autoReconnect=true&useSSL=false";
		String url="jdbc:mysql://localhost:3306/visitors?allowPublicKeyRetrieval=true&useSSL=false&autoReconnect=true";

		String userId="root";
		String pass="1504";
		String query="insert into students value( ?,?,?);";
		try(Connection nn =DriverManager.getConnection(url,userId,pass);//Connection open.
	          PreparedStatement s1 = nn.prepareStatement(query);){
		s1.setInt(1,v1);
		s1.setString(2,v2);
		s1.setFloat(3,v3);
		
		
		int rows = s1.executeUpdate();
		System.out.println(rows+" rows updated");
		
		nn.close();// Connection close.
				
		} catch (Exception e) {
		 e.printStackTrace();
		}

	}

	public static void updatedataStudent(String name,int id){
//		String url="jdbc:mysql://localhost:3306/piyush?autoReconnect=true&useSSL=false";
		String url="jdbc:mysql://localhost:3306/visitors?allowPublicKeyRetrieval=true&useSSL=false&autoReconnect=true";

		String userId="root";
		String pass="1504";
		String query="update students Set fname =? where id=?;";
		try(
		Connection d1= DriverManager.getConnection(url,userId,pass);
		PreparedStatement s1 = d1.prepareStatement(query);){
		
		s1.setNString(1,name);
		s1.setInt(2, id);
		
		int rows =s1.executeUpdate();
		System.out.println(rows+"rows updated");
		d1.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static void deletedatastudent(int vv){
//		String url="jdbc:mysql://localhost:3306/piyush?autoReconnect=true&useSSL=false";
		String url="jdbc:mysql://localhost:3306/visitors?allowPublicKeyRetrieval=true&useSSL=false&autoReconnect=true";

		String userId="root";
		String pass="1504";
		
		String q2 = "DELETE FROM students WHERE id = ?";
		
		try(
		Connection dd= DriverManager.getConnection(url, userId, pass);
		PreparedStatement st1=dd.prepareStatement(q2);){
		st1.setInt(1,vv);
	
		
		int rows =st1.executeUpdate();
		System.out.println(rows+" rows delete ");
		dd.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

	public static void Displayingdata(){
//		String url="jdbc:mysql://localhost:3306/piyush?autoReconnect=true&useSSL=false";
		String url="jdbc:mysql://localhost:3306/visitors?allowPublicKeyRetrieval=true&useSSL=false&autoReconnect=true";

		String userId="root";
		String pass="1504";
		
		
		String query="Select * from students;";
		
		try(
		Connection nn =DriverManager.getConnection(url,userId,pass);//Connection open.
		Statement s1 =nn.createStatement();
		ResultSet rs = s1.executeQuery(query);){
		
		while(rs.next()) {
			int ids=rs.getInt("id");
			String names=rs.getNString("fname");
			float pers=rs.getFloat("per");
			
			System.out.println(ids+" : "+names+" : "+pers);
			
		}
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	

}