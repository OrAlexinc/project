/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import java.awt.Image;

/**
 *
 * @author prime
 */
public class ExternalWorker {

    private int workerId;
    private String serviceName;
    private String firstName;
    private String lastName;
    private Image photo;
    private Feedback feedback;

    public ExternalWorker(){};    
    
    public ExternalWorker(int workerId, String serviceName, String firstName, String lastName) {
        this.workerId = workerId;
        this.serviceName = serviceName;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    
    public int getWorkerId() {
        return workerId;
    }

    public void setWorkerId(int workerId) {
        this.workerId = workerId;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Image getPhoto() {
        return photo;
    }

    public void setPhoto(Image photo) {
        this.photo = photo;
    }

    @Override
     public String toString() {
        return   "ID:" + workerId + " firstName:" + firstName + " lastName: " 
                + lastName + ""+ " \n service name:" + serviceName  ;

}
}
