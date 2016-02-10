/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

/**
 *
 * @author orgershov
 */
public class Admin extends User {

    public Admin(int ID, String firstName, String lastName, String email, String userName, String password, String buildingAddress, String phoneNumber, String userPermission, int apartmentId) {
        super(ID, firstName, lastName, email, userName, password, buildingAddress, phoneNumber, userPermission, apartmentId);
    }

    @Override
    public Message RecieveMessage(String selfUserName) {
        return super.RecieveMessage(selfUserName);
    }

    @Override
    public void SendMessage(String content, String fromUser, String toUser) {
        super.SendMessage(content, fromUser, toUser);
    }

    public void SeeAllPayments() {

    }

    @Override
    public void setApartmentId(int apartmentId) {
        super.setApartmentId(apartmentId);
    }

    @Override
    public int getApartmentId() {
        return super.getApartmentId();
    }

    @Override
    public void setUserPermission(String userPermission) {
        super.setUserPermission(userPermission);
    }

    @Override
    public String getUserPermission() {
        return super.getUserPermission();
    }

    @Override
    public void setPhoneNumber(String phoneNumber) {
        super.setPhoneNumber(phoneNumber);
    }

    @Override
    public String getPhoneNumber() {
        return super.getPhoneNumber();
    }

    @Override
    public void setBuildingAddress(String buildingAddress) {
        super.setBuildingAddress(buildingAddress);
    }

    @Override
    public String getBuildingAddress() {
        return super.getBuildingAddress();
    }

    @Override
    public void setPassword(String password) {
        super.setPassword(password);
    }

    @Override
    public String getPassword() {
        return super.getPassword();
    }

    @Override
    public void setUserName(String userName) {
        super.setUserName(userName);
    }

    @Override
    public String getUserName() {
        return super.getUserName();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getFirstName() {
        return super.getFirstName();
    }

    @Override
    public void setID(int ID) {
        super.setID(ID);
    }

    @Override
    public int getID() {
        return super.getID();
    }

}
