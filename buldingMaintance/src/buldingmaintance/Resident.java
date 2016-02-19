/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import DB.DataBase;

/**
 *
 * @author orgershov
 */
public class Resident extends User{
DataBase dataBase = DataBase.GetInstance();
    public Resident(int ID, String firstName, String lastName, String email, String userName,
            String password, String buildingAddress, String phoneNumber, String userPermission, int apartmentId) {
        super(ID, firstName, lastName, email, userName, password, buildingAddress, phoneNumber, userPermission, apartmentId);
    }

    public void writeMessage(Message message){
        dataBase.sendMessage(message);
        
    }
   public void addPayment(Payment pay){
   dataBase.makePayment(pay);
    
       }
    
    public void readMessage(){
        
    } 
    
    public void callService(Order order){
        dataBase.makeOrder(order);
    }
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
