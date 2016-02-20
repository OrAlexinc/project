/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import java.util.Calendar;

/**
 *
 * @author Student
 */
public class Payment {
      
    static private  int paymentLd;
    private String from;
    private String to;
    private int sum;
    private String comment;
    private Calendar dateRecieved;
    
    public Payment( String from,String to,String comment,int sum  ){
      
        setFrom(from);
        setSum(sum);
        setComment(comment);
        setSum(sum);
        dateRecieved=Calendar.getInstance();
        paymentLd++;
    }

    public int getPaymentId() {
        return paymentLd;
    }

    public void setPaymentLd(int paymentLd) {
        this.paymentLd = paymentLd;
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

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
    public Calendar getDateRecieved(){
        return this.dateRecieved;
    }

    @Override
    public String toString() {
        return "Payment#"+paymentLd + "from" + from + "to" + to + "sum" + sum + "comment" + comment + "datePayed" + dateRecieved ;
    }
    
}
