package DB;

import buldingmaintance.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author orgershov
 */
public class DataBase {

    protected static DataBase instance = new DataBase();

    String jdbcUrl = "jdbc:mysql://localhost:3306/building_maintainance?zeroDateTimeBehavior=convertToNull";
    String jdbcUser = "root";
    String jdbcPassword;
    String jdbcDeiver = "com.mysql.jdbc.Driver";
    List<Message> messages = new ArrayList<Message>();
    List<Order> orders = new ArrayList<Order>();
    List<Payment> payments = new ArrayList<Payment>();
    List<User> users = new ArrayList<User>();
    Connection connection;

    private DataBase() {
        try {

            Class.forName(jdbcDeiver);
            connection = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

            Statement statement = connection.createStatement();

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    DataBase dataBase = DataBase.GetInstance();

    public static DataBase GetInstance() {
        return instance;
    }

    /*
     public void connectToDataBase() {
     try {

     Class.forName(jdbcDeiver);
     Connection connection
     = DriverManager.getConnection(jdbcUrl, jdbcUser, jdbcPassword);

     Statement statement = connection.createStatement();
     //הוצאת ערכים	
     String allCustomersQuery = "SELECT * FROM USERS;";
     ResultSet resultSet = statement.executeQuery(allCustomersQuery);

     while (resultSet.next()) {
     String name = resultSet.getString("First Name");
     System.out.println(name);
     }

            
     //הכנסת ערכים
     String insertYser = "insert into  USERS values(2,'or','gershov','orgershov@gmail.com','or','gershov','ramat hagolan',2,3,'user');";
     statement.executeUpdate(insertYser);

            
     } catch (SQLException sqle) {
     System.out.println("SQLException: " + sqle.getMessage());
     System.out.println("Vendor Error: " + sqle.getErrorCode());
     } catch (ClassNotFoundException e) {
     e.printStackTrace();
     }

     }

     */
    public void AddUser(User user) { //gets an object from type user and adds its fields to database
        
        try {
            Class.forName(jdbcDeiver);

            Statement statement = connection.createStatement();
            String insertUser = "insert into  USERS values(" + user.getID() + ",'" + user.getFirstName() + "'"
                    + ",'" + user.getLastName() + "','" + user.getEmail() + "','" + user.getUserName() + "','"
                    + user.getPassword() + "','" + user.getBuildingAddress() + "'," + "," + user.getApartmentId()
                    + ",'" + user.getPhoneNumber() + "','" + user.getUserPermission() + "');";

            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void RemoveUser(int id) {//deletes user by id
        try {
            Class.forName(jdbcDeiver);

            Statement statement = connection.createStatement();
            String deleteUser = "delete from  USERS where ID = " + id + "";
            statement.executeUpdate(deleteUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void sendMessage(Message message) {//adds message to a database
        try {
            Class.forName(jdbcDeiver);

            Statement statement = connection.createStatement();
           java.sql.Timestamp timestamp = new java.sql.Timestamp( message.getTimeCreated().getTimeInMillis());
            String insertUser = "insert into  messages values(" + message.getMessageID() + ",'"
                    + message.getFromUser() + "'" + ",'"
                    + message.getToUser() + "','"
                    + timestamp + "','"
                    + message.getContent() + "');";

            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void makeOrder(Order order) {//adds an order to a database
        try {
            Class.forName(jdbcDeiver);
            java.sql.Timestamp timestamp = new java.sql.Timestamp( order.getDateRecieved().getTimeInMillis());
            Statement statement = connection.createStatement();
            String insertUser = "insert into  orders values(" + order.getOrderID() + ",'"
                    + order.getOrder() + "'" + ",'"
                    + order.getFrom() + "','"
                    + timestamp + "','"
                    + order.getTo() + "');";

            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void makePayment(Payment payment) {//adds an payment to a database
        try {
            Class.forName(jdbcDeiver);
          java.sql.Timestamp timestamp = new java.sql.Timestamp( payment.getDateRecieved().getTimeInMillis());
            Statement statement = connection.createStatement();
            String insertUser = "insert into  payments values(" + payment.getPaymentId() + ",'"
                    + payment.getFrom() + "'" + ",'"
                    + payment.getTo() + "','"
                    + payment.getSum() + "','"
                    + timestamp + "','"
                    + payment.getComment() + "');";

            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public User logIn(String username, String password) {
        try {

            Class.forName(jdbcDeiver);
           

            Statement statement = connection.createStatement();

            String login = "SELECT * FROM USERS WHERE  UserName ='" + username +"' AND Password= '" + password + "'";

            ResultSet resultSet = statement.executeQuery(login);
         
     
          if(resultSet.next()){
            int id = resultSet.getInt("ID");
            String firstName = resultSet.getString("FirstName");

            String lastName = resultSet.getString("LastName");

        
            String email = resultSet.getString("Email");
            String userName = resultSet.getString("UserName");
            String Password = resultSet.getString("Password");

            String buildingAddress = resultSet.getString("BuildingAddress");
            int apartmentId = resultSet.getInt("Apartmentid");
            String phoneNumber = resultSet.getString("PhoneNumber");
            String userPermission = resultSet.getString("User Permission");   
               

            if (userPermission.equals("admin")) {
                User admin = new User(id, firstName, lastName, email, userName, Password,
                        buildingAddress, phoneNumber,userPermission , apartmentId);
                return admin;
            }
           else if (userPermission.equals("resident")) {
                User resident = new User(id, firstName, lastName, email, userName, Password,
                        buildingAddress, phoneNumber,userPermission, apartmentId);
               
                return resident;
            }
            }
      
            
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        
        return null ;
    }
}
