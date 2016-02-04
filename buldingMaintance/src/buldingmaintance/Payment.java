/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

/**
 *
 * @author Student
 */
public class Payment {
      
    private  String paymentLd;
    private String from;
    private String to;
    private int sum;
    private String note;
    
    public Payment( String from,String to,String note,int sum  ){
      
        setFrom(from);
        setSum(sum);
        setNote(note);
        setSum(sum);
    }

    public String getPaymentLd() {
        return paymentLd;
    }

    public void setPaymentLd(String paymentLd) {
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

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
    
}
