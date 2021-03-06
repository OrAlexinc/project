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

public class DataBase { 
    protected static DataBase instance = new DataBase();

    String jdbcUrl = "jdbc:mysql://localhost:3306/building_maintainance?zeroDateTimeBehavior=convertToNull";
    String jdbcUser = "root";
    String jdbcPassword="root";
    String jdbcDriver = "com.mysql.jdbc.Driver";
    List<Message> messages = new ArrayList<Message>();
    List<Order> orders = new ArrayList<Order>();
    List<Payment> payments = new ArrayList<Payment>();
    List<User> users = new ArrayList<User>();
    List<ExternalWorker> workers = new ArrayList<ExternalWorker>();
    List<Feedback> feedbacks = new ArrayList<Feedback>();

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

 /**
 * creating instance of database and all of the methods
 * @author prime
 */
    public static DataBase GetInstance() {
        return instance;
    }
/**
 * gets an object from type user and adds its fields to database
 * @param user 
 */
    public String AddUser(User user) { 

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String insertUser = "insert into  USERS values(" + user.getID() + ","
                    + "'" + user.getFirstName() + "',"
                    + "'" + user.getLastName() + "',"
                    + "'" + user.getEmail() + "',"
                    + "'" + user.getUserName() + "',"
                    + "'" + user.getPassword() + "',"
                    + "'" + user.getBuildingAddress() + "',"
                    + "" + user.getApartmentId() + ","
                    + "'" + user.getPhoneNumber() + "'"
                    + ",'" + user.getUserPermission() + "');";
            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
           
            System.out.println("Vendor Error: " + sqle.getErrorCode());
            
            return "SQLException: " + sqle.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "ok";
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
     * @return all the users from database
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

    /**
     * @param ID
     * @return returns the user related to id  
     */
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
                String userPermission = resultSet.getString("UserPermission");

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

    /**
     * in order to display all user's id in combo-box
     * @param ID
     * @returns all id's of all the users
     */
    public ArrayList<String> setUsersId() {
        ArrayList<String> usersId = new ArrayList<String>();
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlUser = "SELECT * FROM  users  ID";

            ResultSet resultSet = statement.executeQuery(sqlUser);

            while (resultSet.next()) {
                int id = resultSet.getInt("ID");

                usersId.add(Integer.toString(id));
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return usersId;
    }

    /**
     * to display all user names in combo-box
     *
     * @returns all the usernames
     */
    public ArrayList<String> listOfUsers() {
        ArrayList<String> usernames = new ArrayList<String>();
        String userName = "";
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlUser = "SELECT * FROM  users username";

            ResultSet resultSet = statement.executeQuery(sqlUser);

            while (resultSet.next()) {
                userName = resultSet.getString("UserName");
                usernames.add(userName);
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return usernames;
    }

    /**
     * make sure that there will be no duplicates in messages table
     *
     * @returns id
     */
    public int getMessageId() {
        int messageId = 0;
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String getNewId = "SELECT * FROM messages WHERE  SerialNumber = (SELECT MAX(SerialNumber)  FROM messages)";
            ResultSet resultSet = statement.executeQuery(getNewId);
            if (resultSet.next()) {
                messageId = resultSet.getInt("SerialNumber");
                messageId++;
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return messageId;
    }
/**
 * adds message to a database
 * @param message 
 */
    public void sendMessage(Message message) {
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            Calendar calendar=Calendar.getInstance();
            java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
            
            String insertUser = "insert into  messages values(" + message.getMessageID() + ",'"
                    + message.getFromUser() + "'" + ",'"
                    + message.getToUser() + "','"
                    + ourJavaDateObject + "','"
                    + message.getContent() + "');";

            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
/**
 * gets a list of all the messages for id provided 
 * @param userName
 * @return 
 */
    public List<Message> recieveMessages(String userName) {
        List<Message> thisUserMessages = new ArrayList<Message>();

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            String toUsername = userName;

            String pullMessage = "SELECT * FROM MESSAGES WHERE  ToUser ='" + toUsername + "'";

            ResultSet resultSet = statement.executeQuery(pullMessage);

            while (resultSet.next()) {
                int sNumber = resultSet.getInt("SerialNumber");
                String from = resultSet.getString("FromUser");
                String to = resultSet.getString("ToUser");
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

    /**
     * make sure that will not be duplicates in order table
     *
     * @return
     */
    public int getOrderId() {
        int orderId = 0;
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String getNewId = "SELECT * FROM orders WHERE  SerialNumber = (SELECT MAX(SerialNumber)  FROM orders)";
            ResultSet resultSet = statement.executeQuery(getNewId);
            if (resultSet.next()) {
                orderId = resultSet.getInt("SerialNumber");
                orderId++;
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return orderId;
    }
/**
 * adds an order to a database
 * @param order 
 */
    public void makeOrder(Order order) {
        try {
            Class.forName(jdbcDriver);
            Statement statement = connection.createStatement();
            
            Calendar calendar=Calendar.getInstance();
            java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
            
            String insertUser = "insert into  orders values(" + order.getOrderID() + ",'"
                    + order.getOrder() + "'" + ",'"
                    + order.getFrom() + "','"
                    + ourJavaDateObject + "','"
                    + order.getTo() + "');";

            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * makes sure that will be no duplicates in payment table
     *
     * @return
     */
    public int getPaymentId() {
        int paymentId = 0;
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String getNewId = "SELECT * FROM payments WHERE  SerialNumber = (SELECT MAX(SerialNumber)  FROM payments)";
            ResultSet resultSet = statement.executeQuery(getNewId);
            if (resultSet.next()) {
                paymentId = resultSet.getInt("SerialNumber");
                paymentId++;
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return paymentId;
    }
/**
 * adds an payment to a database
 * @param payment 
 */
    public void makePayment(Payment payment) {
        try {
            Class.forName(jdbcDriver);
            Statement statement = connection.createStatement();

             Calendar calendar=Calendar.getInstance();
            java.sql.Date ourJavaDateObject = new java.sql.Date(calendar.getTime().getTime());
            
            String insertUser = "insert into  payments values(" + payment.getPaymentId() + ",'"
                    + payment.getFrom() + "'" + ",'"
                    + payment.getTo() + "','"
                    + payment.getSum() + "','"
                    + ourJavaDateObject + "','"
                    + payment.getComment() + "');";

            statement.executeUpdate(insertUser);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
/**
 * returns list of all payments done
 * @param user
 * @return 
 */
    public List<Payment> recievePayments() {
        List<Payment> allPayments = new ArrayList<Payment>();

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

       
            String pullPayments = "SELECT * FROM payments";

            ResultSet resultSet = statement.executeQuery(pullPayments);

            while (resultSet.next()) {
                int sNumber = resultSet.getInt("SerialNumber");
                String from = resultSet.getString("FromUser");
                String to = resultSet.getString("ToUser");
                float sum = resultSet.getFloat("Sum");
                Date time = resultSet.getDate("Time");
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
     * @return user if successfully logged in, null if not
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
/**
 * gets an object from type ExternalWorker and adds its fields to database
 * @param worker 
 */
    public String AddExternalWorkers(ExternalWorker worker) {

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            String insertWorker = "insert into  external_workers values(" + worker.getWorkerId() + ","
                    + "'" + worker.getServiceName() + "',"
                    + "'" + worker.getFirstName() + "',"
                    + "'" + worker.getLastName() + "',"
                    + "'" + worker.getPhoto() + "');";

            statement.executeUpdate(insertWorker);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
            return  "SQLException: " + sqle.getMessage();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return "ok";
    }
/**
 * returns the list of all workers
 * @return 
 */
    public List<ExternalWorker> showAllWorkers() {
        ExternalWorker worker = new ExternalWorker();
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlWorker = "SELECT * FROM  external_workers";

            ResultSet resultSet = statement.executeQuery(sqlWorker);

            while (resultSet.next()) {
                int id = resultSet.getInt("workerID");
                String serviceName = resultSet.getString("serviceName");
                String firstName = resultSet.getString("firstName");
                String lastName = resultSet.getString("lastName");

                worker = new ExternalWorker(id, serviceName, firstName, lastName);
                workers.add(worker);
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return workers;
    }

    /**
     * shows all worker's id in combo-box
     *
     * @param id
     */
    public ArrayList<String> showWorkersId() {
        String ids = "";

        ArrayList<String> listOfId = new ArrayList<String>();

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlWorker = "SELECT * FROM  external_workers workerID";

            ResultSet resultSet = statement.executeQuery(sqlWorker);

            while (resultSet.next()) {
                int id = resultSet.getInt("workerID");
                ids = Integer.toString(id);

                listOfId.add(ids);

            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return listOfId;
    }
/**
 * removes worker by id entered
 * @param id 
 */
    public void RemoveExternalWorker(int id) {
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            String deleteWorker = "delete from  external_workers where workerID = " + id + "";
            statement.executeUpdate(deleteWorker);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
/**
 * adds new feedback to database
 * @param feedback 
 */
    public void AddFeedbackForWorker(Feedback feedback) {

        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();
            String insertFeedback = "insert into worker_feedback values(" + feedback.getWorkerId() + ","
                    + "'" + feedback.getFeedback() + "',"
                    + "'" + feedback.getRating() + "',"
                    + "'" + feedback.getWorkDone() + "',"
                    + "'" + feedback.getPriceTaken() + "');";

            statement.executeUpdate(insertFeedback);
        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * gets worker id and shows all the feedbacks about him
     * @param id
     * @return 
     */
    public List<Feedback> showWorkersFeedbackById(int id) {
        Feedback feedback = new Feedback();
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlFeedback = "SELECT * FROM  worker_feedback where workerID = " + id + "";

            ResultSet resultSet = statement.executeQuery(sqlFeedback);

            while (resultSet.next()) {
                int Id = resultSet.getInt("workerID");
                String feedBack = resultSet.getString("feedback");
                int rating = resultSet.getInt("rating");
                String workDone = resultSet.getString("workDone");
                float priceTaken = resultSet.getFloat("priceTaken");

                feedback = new Feedback(Id, feedBack, rating, workDone, priceTaken);
                feedbacks.add(feedback);
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        return feedbacks;
    }
    
    
    /**
     * returns the average of all payments
     * @return 
     */
    public float showPaymentsAverage(){
        float totalSum=0;
        int paymentCnt=0;
        float avg=0;
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            String sqlAverage = "SELECT Sum FROM payments";

            ResultSet resultSet = statement.executeQuery(sqlAverage);

            while (resultSet.next()) { 
                totalSum += resultSet.getFloat("Sum");
                paymentCnt++;
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        avg=totalSum/paymentCnt;
        return avg;
    }   
    
    /**
     * returns the list of all users who not payed
     * @return 
     */
    public List<User> showWhoNotPayed(){
        List<User> users=null; 
        User user=null;
        try {
            Class.forName(jdbcDriver);

            Statement statement = connection.createStatement();

            
            
            
            
            
            String sqlAverage = "SELECT * FROM USERS WHERE id not in (SELECT fromUser FROM payments)";

            ResultSet resultSet = statement.executeQuery(sqlAverage);

            while (resultSet.next()) { 
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
            
                user = new User(id, firstName, lastName, email, userName, Password,
                            buildingAddress, phoneNumber, userPermission, apartmentId);
                users.add(user);
            }

        } catch (SQLException sqle) {
            System.out.println("SQLException: " + sqle.getMessage());
            System.out.println("Vendor Error: " + sqle.getErrorCode());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found exeption");
        }
        
        return users;
    }   
}
