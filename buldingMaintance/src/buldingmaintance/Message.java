package buldingmaintance;
import java.sql.Date;
import java.util.Calendar;

public class Message {
    
    static private int messageID;
    private String content;
    private String fromUser;
    private String toUser;
    private Calendar timeCreated;
   
    public Message(){};
    
    public Message(String content,String fromUser,String toUser){
        setContent(content);
        setFromUser(fromUser);
        setToUser(toUser);
        timeCreated=Calendar.getInstance();
        messageID++;
    };

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
 
    public String getFromUser(){
        return fromUser;
    }
    
    public void setFromUser(String fromUser){
        this.fromUser= fromUser;
    }
    
    public String getToUser(){
        return this.toUser;
    }
     
    public void setToUser(String ToUser){
      this.toUser=toUser;   
      }
 
    public int getMessageID() {
        return messageID;
    }
    
    public Calendar getTimeCreated(){
        return this.timeCreated;
    }
    
    @Override
    public String toString() {
        return "Message"+ content + "\n from:" + fromUser ;
    }
    
    
    
}
