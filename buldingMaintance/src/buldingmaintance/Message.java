package buldingmaintance;
import DB.DataBase;
import java.sql.Date;
import java.util.Calendar;

public class Message {
    
    static private int messageID;
    private String content;
    private String fromUser;
    private String toUser;
    private Date timeCreated;
   DataBase dataBase = DataBase.GetInstance();
    public Message(){};
    
    /**
     * 
     * @param content
     * @param fromUser
     * @param toUser 
     */
    public Message(String content,String fromUser,String toUser){
        setContent(content);
        setFromUser(fromUser);
        setToUser(toUser); 
        timeCreated= new Date(70,0,0);
       messageID=dataBase.getMessageId();
    };
    public Message(String content,String fromUser,String toUser,int ID, Date time){
        setContent(content);
        setFromUser(fromUser);
        setToUser(toUser);
        timeCreated=time;
        messageID=ID;
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
      this.toUser=ToUser;   
      }
 
    public int getMessageID() {
        return messageID;
    }

  
    
    public Date getTimeCreated(){
        return this.timeCreated;
    }
    
    @Override
    public String toString() {
        return "Message: "+ content + "\nfrom: " + fromUser +"\nRecived"+timeCreated+
                "\n*************************************************\n";
    }
    
    
    
}
