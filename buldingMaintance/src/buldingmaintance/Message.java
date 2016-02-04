/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

/**
 *
 * @author Student
 */
public class Message {
    
    int messageID;
    String content;
    String fromUser;
    String toUser;
    //private Calendar dateRecived;
    
    
   public Message(){}; 

    

   public Message(String content,String fromUser,String toUser){
        setContent(content);
        setFromUser(fromUser);
        setToUser(toUser);
        
        
    };
/********************************************/
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
 /*******************************************/
/*******************************************/
    public String getFromUser(){
        return fromUser;
    }
    public void setFromUser(String fromUser){
        this.fromUser= fromUser;
    }
    
    ///********************************///
    ///******************************///
    public String getToUser(){
        return this.toUser;
    }
      public void setToUser(String ToUser){
      this.toUser=toUser;   
      }
 
    public int getMessageID() {
        return messageID;
    }

    public void setMessageID(int messageID) {
        this.messageID = messageID;
    }

    @Override
    public String toString() {
        return "Message"+ content + "\n from:" + fromUser ;
    }
    
    
    
}
