package buldingmaintance;

public class User {
   private int ID;
   private String firstName;
   private String lastName;
   private String email;
   private String userName;
   private String password;
   private String buildingAddress;
   private String phoneNumber;
   private String userPermission;
   private int apartmentId;
   

    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public String getBuildingAddress() {
        return buildingAddress;
    }
    public void setBuildingAddress(String buildingAddress) {
        this.buildingAddress = buildingAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getUserPermission() {
        return userPermission;
    }
    public void setUserPermission(String userPermission) {
        this.userPermission = userPermission;
    }

    public int getApartmentId() {
        return apartmentId;
    }
    public void setApartmentId(int apartmentId) {
        this.apartmentId = apartmentId;
    }
   
    public void SendMessage(String content, String fromUser, String toUser){
        Message message=new Message(content,fromUser,toUser);                   //connect to database
    }
    
    public Message RecieveMessage(String selfUserName){
        Message message=new Message();
        return message;
    }

}
