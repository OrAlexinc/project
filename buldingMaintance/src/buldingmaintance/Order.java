/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import java.util.Calendar;

/**
 *
 * @author mishpuha
 */
public class Order {
    static private int OrderID;
    private String from;
    private String to;
    private String order;
    private Calendar dateRecieved;

    public Order(String from, String to, String order) {
        this.from = from;
        this.to = to;
        this.order = order;
        dateRecieved=Calendar.getInstance();
        OrderID++;
    }
    
    
    
    
    public int getOrderID() {
        return OrderID;
    }

    public void setOrderID(int OrderID) {
        this.OrderID = OrderID;
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

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
    
        public Calendar getDateRecieved(){
        return this.dateRecieved;
    }

    @Override
    public String toString() {
        return "Order#"+OrderID+  "from:" + from + ", to" + to + "order:" + order + " dateOrderd" + dateRecieved  ;
    }
        
}
