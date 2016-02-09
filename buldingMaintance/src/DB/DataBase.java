/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB;
import buldingmaintance.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author orgershov
 */
public class DataBase {
   
       
      
     
        protected static DataBase instance =new DataBase();
        String jdbcUrl="jdbc:mysql://localhost:3306/building_maintainance?zeroDateTimeBehavior=convertToNull";
        String jdbcUser="root";
	String jdbcPassword="root";
        String jdbcDeiver="com.mysql.jdbc.Driver";
        private DataBase() { 
          try {
	
			Class.forName(jdbcDeiver);
			Connection connection = 
					DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

			Statement statement = connection.createStatement();		   				
			
		}
		
		catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("Vendor Error: " + sqle.getErrorCode());
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        }
        DataBase dataBase = DataBase.GetInstance();
        public static DataBase GetInstance()
        {
            return instance;
        }
        
        
 //////*************************************************************/////////////////////////
		
            public void connectToDataBase(){
		try {
	
			Class.forName(jdbcDeiver);
			Connection connection = 
					DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

			Statement statement = connection.createStatement();
		        //הוצאת ערכים	
			String allCustomersQuery = "SELECT * FROM USERS;";
			ResultSet resultSet = statement.executeQuery(allCustomersQuery);
			
			while(resultSet.next())
			{
                            String name=resultSet.getString("First Name");
				System.out.println(name);
			}
                        
                        /****************************/
                        //הכנסת ערכים
                        String insertYser = "insert into  USERS values(2,'or','gershov','orgershov@gmail.com','or','gershov','ramat hagolan',2,3,'user');";
			 statement.executeUpdate(insertYser);
			
			/******************************/
		}
		
		catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("Vendor Error: " + sqle.getErrorCode());
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
                
            }
/**********************************************************************************/
                    
             public void AddUser(User user)
                     
             { try{Class.forName(jdbcDeiver);
			Connection connection = 
					DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);
                 Statement statement = connection.createStatement();
                 String insertYser = "insert into  USERS values("+user.getID()+",'"+user.getFirstName()+"'"
                 + ",'"+user.getLastName()+"','"+user.getEmail()+"','"+user.getUserName()+"','"+user.getPassword()+"','"+user.getBuildingAddress()+"',"
                         + ""+user.getApartmentId()+","+user.getPhoneNumber()+",'"+user.getUserPermission()+"');";
	         statement.executeUpdate(insertYser); 
             }
             catch (SQLException sqle) {
			System.out.println("SQLException: " + sqle.getMessage());
			System.out.println("Vendor Error: " + sqle.getErrorCode());
		}
		
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
             }

	
}  

