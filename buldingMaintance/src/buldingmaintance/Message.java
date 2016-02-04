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
    //Date date;
    
    
    void Message(String content,String fromUser,String toUser){
        setContent(content);
        
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
    
}
