package DB;

import buldingmaintance.*;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Calendar;
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
    String jdbcDriver = "com.mysql.jdbc.Driver";
    List<Message> messages = new ArrayList<Message>();
    List<Order> orders = new ArrayList<Order>();
    List<Payment> payments = new ArrayList<Payment>();
    List<User> users = new ArrayList<User>();
    Connection connection;

    private DataBase() {
        try {

            Class.forName(jdbcDriver);
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

     Class.forName(jdbcDriver);
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
            Class.forName(jdbcDriver);

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

    /**
     * deletes user by id
     *
     * @param id
     */
    public void RemoveUser(int id) {
        try {
            Class.forName(jdbcDriver);

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

    /**
     *
     * @return all users in database
     */
    public List<User> viewAllUsers() {
        List<User> allUsers = new ArrayList<User>();

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlUsers = "SELECT * FROM  users";

            ResultSet resultSet = statement.executeQuery(sqlUsers);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String email = resultSet.getString("Email");
                String userName = resultSet.getString("UserName");
                String password = resultSet.getString("Password");
                String buildingAddress = resultSet.getString("BuildingAddress");
                int apartmentId = resultSet.getInt("Apartmentid");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String userPermission = resultSet.getString("UserPermission");

                User user = new User(id, firstName, lastName, email, userName, password,
                        buildingAddress, phoneNumber, userPermission, apartmentId);
                allUsers.add(user);
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return allUsers;
    }

    public User showUserById(int ID) {
        User user = new User();
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlUser = "SELECT * FROM  users where ID ='" + ID + "'";

            ResultSet resultSet = statement.executeQuery(sqlUser);

            if (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String email = resultSet.getString("Email");
                String userName = resultSet.getString("UserName");
                String password = resultSet.getString("Password");
                String buildingAddress = resultSet.getString("BuildingAddress");
                int apartmentId = resultSet.getInt("Apartmentid");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String userPermission = resultSet.getString("User Permission");

                user = new User(id, firstName, lastName, email, userName, password,
                        buildingAddress, phoneNumber, userPermission, apartmentId);
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return user;
    }

    public void sendMessage(Message message) {//adds message to a database
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            java.sql.Timestamp timestamp = new java.sql.Timestamp(message.getTimeCreated().getTime());
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

    public List<Message> recieveMessages(User user) {
        List<Message> thisUserMessages = new ArrayList<Message>();

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            String toUsername = user.getUserName();

            String pullMessage = "SELECT * FROM MESSAGES WHERE  To ='" + toUsername + "'";

            ResultSet resultSet = statement.executeQuery(pullMessage);

            while (resultSet.next()) {
                int sNumber = resultSet.getInt("Serial Number");
                String from = resultSet.getString("From");
                String to = resultSet.getString("To");
                Date time = resultSet.getDate("Create_time");
                String content = resultSet.getString("Message");

                Message message = new Message(content, from, to, sNumber, time);
                thisUserMessages.add(message);
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return thisUserMessages;
    }

    public void makeOrder(Order order) {//adds an order to a database
        try {
            Class.forName(jdbcDriver);
            java.sql.Timestamp timestamp = new java.sql.Timestamp(order.getDateRecieved().getTimeInMillis());
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
            Class.forName(jdbcDriver);
            java.sql.Timestamp timestamp = new java.sql.Timestamp(payment.getDateRecieved().getDate());
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

    public List<Payment> recievePayments(User user) {
        List<Payment> allPayments = new ArrayList<Payment>();

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            String toUsername = user.getUserName();

            String pullPayments = "SELECT * FROM payments ";

            ResultSet resultSet = statement.executeQuery(pullPayments);

            while (resultSet.next()) {
                int sNumber = resultSet.getInt("Serial Number");
                String from = resultSet.getString("From");
                String to = resultSet.getString("To");
                float sum = resultSet.getFloat("Sum");
                Date time = resultSet.getDate("Create_time");
                String comment = resultSet.getString("Comment");

                Payment payment = new Payment(from, to, comment, sum, sNumber, time);
                allPayments.add(payment);

            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return allPayments;
    }

    /**
     * logIn
     *
     * @param username
     * @param password
     * @return user if successfully added, null if not
     */
    public User logIn(String username, String password) {
        try {
            Class.forName(jdbcDriver);
            Statement statement = connection.createStatement();
            String login = "SELECT * FROM USERS WHERE  UserName ='" + username + "' AND Password= '" + password + "'";
            ResultSet resultSet = statement.executeQuery(login);
            if (resultSet.next()) {
                int id = resultSet.getInt("ID");
                String firstName = resultSet.getString("FirstName");
                String lastName = resultSet.getString("LastName");
                String email = resultSet.getString("Email");
                String userName = resultSet.getString("UserName");
                String Password = resultSet.getString("Password");
                String buildingAddress = resultSet.getString("BuildingAddress");
                int apartmentId = resultSet.getInt("Apartmentid");
                String phoneNumber = resultSet.getString("PhoneNumber");
                String userPermission = resultSet.getString("UserPermission");
               
                if (userPermission.equals("admin")) {
                    User admin = new User(id, firstName, lastName, email, userName, Password,
                            buildingAddress, phoneNumber, userPermission, apartmentId);
                    return admin;
                } else if (userPermission.equals("resident")) {
                    User resident = new User(id, firstName, lastName, email, userName, Password,
                            buildingAddress, phoneNumber, userPermission, apartmentId);
                    return resident;
                }
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
            return null;
        }

        return null;
    }
}
