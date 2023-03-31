package com.xworkz.shoppingg.app.repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.xworkz.shoppingg.app.dto.ShoppinggDTO;

public class ShoppinggRepositoryIMPL implements ShoppinggRepository {

	String query;

	public ShoppinggRepositoryIMPL() {
		System.out.println("defaulte construter ShoppinggRepositoryIMPL ");
	}

	public ShoppinggRepositoryIMPL(String query) {
		this.query = query;
	}

	@Override
	public boolean onSave(ShoppinggDTO dto) {
		// TODO Auto-generated method stub
		try {
			
		
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root","Xworkzodc@123");
			
			String query="insert into orianmall values(?,?,?,?,? , ?)";
			PreparedStatement preparedStatement=con.prepareStatement(query);
			
			
			preparedStatement.setInt(1,dto.getEmailId());
			preparedStatement.setString(2,dto.getName());
			preparedStatement.setString(3,dto.getQualification());
			preparedStatement.setInt(4,dto.getContacte_No());
			preparedStatement.setString(5,dto.getLocation());
			preparedStatement.setInt(6, dto.getId());
			
			int i=preparedStatement.executeUpdate();
			if (i!=0) {
				System.out.println("save");
			} else {
                System.out.println("not save");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
			return true;
		}

	@Override
	public boolean onUpdate(int emailId) {
try {
		Class.forName("com.mysql.cj.jdbc.Driver");	
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root",
				"Xworkzodc@123");
		
		String query="update orianmall set name='kiran' where emailId=?";

		PreparedStatement preparedStatement=con.prepareStatement(query);
		preparedStatement.setInt(1, emailId);

		
		int i=preparedStatement.executeUpdate();
		if (i!=0) {
			System.out.println("update");
		} else {
            System.out.println("not update");
		}
	} catch (Exception e) {
		// TODO: handle exception
		
		e.printStackTrace();
	}
	
		return true;
	}

	@Override
	public boolean onDelete(int emailId) {
		// TODO Auto-generated method stub
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root",
					"Xworkzodc@123");
			
			
			
			String query="update orianmall  where emailId=?";
			PreparedStatement preparedStatement=con.prepareStatement(query);
preparedStatement.setInt(1,emailId);
			
			int i=preparedStatement.executeUpdate();
			if (i!=0) {
				System.out.println("delet");
			} else {
	            System.out.println("not delete");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
			return true;
		}


	@Override
	public boolean onUpdate2(String name) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root",
					"Xworkzodc@123");
			
			String query="update orianmall set location='mgkg' where name=?";
			PreparedStatement preparedStatement=con.prepareStatement(query);
	preparedStatement.setString(1,name);
			

			
			int i=preparedStatement.executeUpdate();
			if (i!=0) {
				System.out.println("update");
			} else {
	            System.out.println("not update");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
			return true;
		}

	@Override
	public boolean onUpdate1(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root",
					"Xworkzodc@123");
			
			String query="update orianmall set name='kiran' where id=id";
			

			PreparedStatement preparedStatement=con.prepareStatement(query);
			preparedStatement.setInt(1, id);
			
			int i=preparedStatement.executeUpdate();
			if (i!=0) {
				System.out.println("update");
			} else {
	            System.out.println("not update");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
			return true;
		}

	@Override
	public boolean onDelete1(int id) {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root",
					"Xworkzodc@123");
			
			
			
			String query="update orianmall  where id=?";
			PreparedStatement preparedStatement=con.prepareStatement(query);
preparedStatement.setInt(1,id);
			
			int i=preparedStatement.executeUpdate();
			if (i!=0) {
				System.out.println("delete");
			} else {
	            System.out.println("not delete");
			}
		} catch (Exception e) {
			// TODO: handle exception
			
			e.printStackTrace();
		}
		
			return true;
		}

	@Override
	public boolean onRead() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root",
					"Xworkzodc@123");
			
			String query="selecte * from orianmall";
			PreparedStatement preparedStatement=con.prepareStatement(query);
			
			

			ResultSet resultSet = preparedStatement.executeQuery();
			while  (resultSet.next()) {
				System.out.println("emailId =" + resultSet.getInt(1) + "," + "name =" + resultSet.getString(2) + ","
						+ "qualification =" + resultSet.getString(3) + "," + "contacte_No =" + resultSet.getInt(4)
						+ "," + "location =" + resultSet.getString(5)+ "," + "id =" + resultSet.getInt(6));
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
			return true;
		}


	@Override
	public boolean onRead1() {
		// TODO Auto-generated method stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");	
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/shoppingg", "root",
					"Xworkzodc@123");
			
			String query="selecte * from orianmall";
			PreparedStatement preparedStatement=con.prepareStatement(query);
		
			
           // preparedStatement.setInt(1, emailId);
			ResultSet resultSet = preparedStatement.executeQuery();
			while  (resultSet.next()) {
				System.out.println("emailId =" + resultSet.getInt(1) + "," + "name =" + resultSet.getString(2) + ","
						+ "qualification =" + resultSet.getString(3) + "," + "contacte_No =" + resultSet.getInt(4)
						+ "," + "location =" + resultSet.getString(5)+ "," + "id =" + resultSet.getInt(6));
				
			}
		}
		catch (Exception e) {
			// TODO: handle exception
			
			
		}
		
			return true;
		}
//
//	@Override
//	public boolean onRead1(int emailId) {
//		// TODO Auto-generated method stub
//		return false;
//	}

	
	
	
}
