/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import DB.DataBase;
import java.sql.Date;
import java.util.Calendar;

/**
 *
 * @author Student
 */
public class Payment {
      
    static private  int paymentId;
    private String from;
    private String to;
    private float sum;
    private String comment;
    private Date dateRecieved=new Date(12/23/3);
    DataBase dataBase = DataBase.GetInstance();
    public Payment( String from,String to,String comment,int sum  ){
      
        setFrom(from);
        setSum(sum);
        setComment(comment);
        setSum(sum);      
       paymentId=dataBase.getPaymentId();
    }
    
    public Payment( String from,String to,String comment,float sum , int sNumber, Date time ){
      
        setFrom(from);
        setSum((int) sum);
        setComment(comment);
        dateRecieved=time;
        paymentId=sNumber;
    }

    public int getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String note) {
        this.comment = note;
    }

    public float getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public Date getDateRecieved(){
        return this.dateRecieved;
    }

    @Override
    public String toString() {
        return "Payment#"+paymentId + "  from" + from + "  to" + to + "  sum" + sum + "  comment" + comment + "  datePayed" + dateRecieved ;
    }
    
}
