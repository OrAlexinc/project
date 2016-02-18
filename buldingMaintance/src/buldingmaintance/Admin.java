/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import DB.DataBase;
import java.util.ArrayList;

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
    public Message RecieveMessage(String selfUserName) {
        return super.RecieveMessage(selfUserName);
    }

    @Override
    public void SendMessage(String content, String fromUser, String toUser) {
        super.SendMessage(content, fromUser, toUser);
    }
/*
    public ArrayList<Payment> SeeAllPayments() {
       return false;
    }
*/
    public void makePayment(){
        
    }
    public void addUser(){
        
    }
    public void deleteUser(){
        
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
