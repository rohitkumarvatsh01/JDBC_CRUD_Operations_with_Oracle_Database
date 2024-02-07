package com.curd;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



@WebServlet("/ReadRecordServlet")
public class ReadRecordServlet extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			response.getWriter();
		}
	 
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			try {
				
				Class.forName("com.mysql.cj.jdbc.Driver");	
				String JdbcURL="jdbc:mysql://localhost:3306/Project";
				String User="root";
				String password="root";
				Connection con=DriverManager.getConnection(JdbcURL,  User, password);
				
				String query="SELECT * FROM Rohit";
				PreparedStatement ps= con.prepareStatement(query);
				ResultSet rs = ps.executeQuery();
				
				//System.out.println("Name"+" "+"Email"+" "+"UserName"+" "+"Password");
				
				while(rs.next()) {
					String name=rs.getString("Name");
					String email=rs.getString("Email");
					String userName=rs.getString("UserName");
					String password=rs.getString("Password");
					
					System.out.println(name+" "+email+" "+userName+" "+password);
			
				}
				
				System.out.println("All the Data in Table");
		
				ps.close();
				con.close();

				}
				catch(Exception e)
				{
					e.printStackTrace();
			}
		}
	 
	}
