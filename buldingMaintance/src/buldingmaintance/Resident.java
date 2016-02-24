/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import DB.DataBase;
import java.util.List;

/**
 *
 * @author orgershov
 */
public class Resident extends User{
DataBase dataBase = DataBase.GetInstance();

    public Resident() {
    }

    /**
     * constructor
     * @param ID
     * @param firstName
     * @param lastName
     * @param email
     * @param userName
     * @param password
     * @param buildingAddress
     * @param phoneNumber
     * @param userPermission
     * @param apartmentId 
     */
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
    
    public List<Message> readMessage(String userName){
      return dataBase.recieveMessages(userName);
    } 
    
    public void callService(Order order){
        dataBase.makeOrder(order);
    }
    public void addFeedback(Feedback feedbak){
        dataBase.AddFeedbackForWorker(feedbak);
    }
    public  List<Feedback> seeFeedback(int id){
       
        return dataBase.showWorkersFeedbackById(id);
    }

    @Override
    public void SendMessage(Message message) {
       dataBase.sendMessage(message);
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
    
}
