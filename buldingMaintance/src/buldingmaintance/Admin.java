/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import DB.DataBase;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author orgershov
 */
public class Admin extends User {
DataBase dataBase = DataBase.GetInstance();
    public Admin(int ID, String firstName, String lastName, String email, String userName, String password, String buildingAddress, String phoneNumber, String userPermission, int apartmentId) {
        super(ID, firstName, lastName, email, userName, password, buildingAddress, phoneNumber, userPermission, apartmentId);
    }

    @Override
    public List<Message> RecieveMessage(String selfUserName) {
        return dataBase.recieveMessages(selfUserName);
    }

    @Override
    public void SendMessage(Message message) {
       dataBase.sendMessage(message);
    }
/*
    public ArrayList<Payment> SeeAllPayments() {
       return false;
    }
*/
    public void makePayment(Payment paymant){
        dataBase.makePayment(paymant);
    }
    public  List<Payment> recievePayments(User user){
        return dataBase.recievePayments(user);
    }
    public void addUser(User user){
        dataBase.AddUser(user);
    }
    public void deleteUser(int id){
        dataBase.RemoveUser(id);
    }
    public List<User> showAllUser (){
        return dataBase.viewAllUsers();
    }
    public User showUserById(int id){
        
       return dataBase.showUserById(id);
    }
    public void order(Order order)
    {
        dataBase.makeOrder(order);
    }
    public void addService(){
        
    }
    public void deleteServie(){
        
    }
    
    @Override
    public String toString() {
        return  super.toString();
    }
  
}
