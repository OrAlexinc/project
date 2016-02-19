/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DB.DataBase;
import buldingmaintance.*;
import java.awt.List;
import java.util.ArrayList;
import buldingmaintance.*;

/**
 *
 * @author mishpuha
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
     User a;
      ArrayList<User> users = new ArrayList<User>(); 
     ArrayList<Message> messages = new ArrayList<Message>(); 
     ArrayList<Payment> payments = new ArrayList<Payment>(); 
     ArrayList<Order> orders = new ArrayList<Order>(); 
    public AdminForm(User user) {
         DataBase dataBase = DataBase.GetInstance();
        
        a=user;
        initComponents();
        onOffPanel(false,false,false,false,false,false,false);
        onOffComponents(false,false,false,false,false,false,false);
    
     
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jplMainPannel = new javax.swing.JPanel();
        btnSendMassege = new javax.swing.JButton();
        btnReadMessage = new javax.swing.JButton();
        btnMakePaymnet = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnViewPayments = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        jpnSendMassege = new javax.swing.JPanel();
        txtWriteMassege = new javax.swing.JTextField();
        btnSend = new javax.swing.JButton();
        txtSendTo = new javax.swing.JTextField();
        lblSentTo = new javax.swing.JLabel();
        jpnReadMessages = new javax.swing.JPanel();
        txtShovMessage = new javax.swing.JTextField();
        btnShowMessages = new javax.swing.JButton();
        jpnMakePayment = new javax.swing.JPanel();
        jpnViewPayments = new javax.swing.JPanel();
        txtViewPayments = new javax.swing.JTextField();
        btnViewWhoPayd = new javax.swing.JButton();
        btnViewWhoNotPayed = new javax.swing.JButton();
        btnViewAllPayments = new javax.swing.JButton();
        jpnService = new javax.swing.JPanel();
        txtService = new javax.swing.JTextField();
        btnShowSerive = new javax.swing.JButton();
        jpnAddUser = new javax.swing.JPanel();
        lblEnterFirstName = new javax.swing.JLabel();
        lblEnterLastName = new javax.swing.JLabel();
        lblEnterEmail = new javax.swing.JLabel();
        btnAddNewUser = new javax.swing.JButton();
        lblEnteNewUserDetails = new javax.swing.JLabel();
        lblEnterUserToDelete = new javax.swing.JLabel();
        txtIdOfTheUserToDelete = new javax.swing.JTextField();
        btnDeleteTheUser = new javax.swing.JButton();
        txtEnterUserName = new javax.swing.JTextField();
        lblEnterUserName = new javax.swing.JLabel();
        lblEnterPhoneNumber = new javax.swing.JLabel();
        txtEnterEmail = new javax.swing.JTextField();
        txtEnterPhoneNumber = new javax.swing.JTextField();
        txtEnterLastName = new javax.swing.JTextField();
        txtEnderName = new javax.swing.JTextField();
        txtEnterID = new javax.swing.JTextField();
        lblEnterID = new javax.swing.JLabel();
        txtEnterPassword = new javax.swing.JTextField();
        lblEnterPassword = new javax.swing.JLabel();
        jpnAddService = new javax.swing.JPanel();
        lblEddNewService = new javax.swing.JLabel();
        lblApartmantId = new javax.swing.JLabel();
        txtApartment = new javax.swing.JTextField();
        lblEnterServieId = new javax.swing.JLabel();
        txtIdOfServiceToOrder = new javax.swing.JTextField();
        btnMakeTheOrder = new javax.swing.JButton();
        lblServiceType = new javax.swing.JLabel();
        txtServieType = new javax.swing.JTextField();
        txtSum = new javax.swing.JTextField();
        txtCommant = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        btnAddService = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 480));
        getContentPane().setLayout(null);

        btnSendMassege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSendMassege.setText("send massege");
        btnSendMassege.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendMassege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMassegeActionPerformed(evt);
            }
        });

        btnReadMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReadMessage.setText("read messeges");
        btnReadMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReadMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadMessageActionPerformed(evt);
            }
        });

        btnMakePaymnet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMakePaymnet.setText("make payment");
        btnMakePaymnet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakePaymnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakePaymnetActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrder.setText("order  maintinance");
        btnOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnViewPayments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewPayments.setText("view payments");
        btnViewPayments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPaymentsActionPerformed(evt);
            }
        });

        btnAddUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddUser.setText("add/delete user");
        btnAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });

        jpnSendMassege.setOpaque(false);
        jpnSendMassege.setLayout(null);

        txtWriteMassege.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jpnSendMassege.add(txtWriteMassege);
        txtWriteMassege.setBounds(40, 80, 504, 183);

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSend.setText("send");
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jpnSendMassege.add(btnSend);
        btnSend.setBounds(38, 261, 120, 50);
        jpnSendMassege.add(txtSendTo);
        txtSendTo.setBounds(120, 20, 100, 22);

        lblSentTo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSentTo.setText("send to");
        jpnSendMassege.add(lblSentTo);
        lblSentTo.setBounds(50, 20, 59, 22);

        jpnReadMessages.setBackground(new java.awt.Color(255, 102, 51));
        jpnReadMessages.setOpaque(false);
        jpnReadMessages.setLayout(null);
        jpnReadMessages.add(txtShovMessage);
        txtShovMessage.setBounds(49, 51, 503, 182);

        btnShowMessages.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowMessages.setText("show messeges");
        btnShowMessages.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMessagesActionPerformed(evt);
            }
        });
        jpnReadMessages.add(btnShowMessages);
        btnShowMessages.setBounds(40, 260, 170, 50);

        jpnMakePayment.setOpaque(false);
        jpnMakePayment.setLayout(null);

        jpnViewPayments.setOpaque(false);
        jpnViewPayments.setLayout(null);

        txtViewPayments.setScrollOffset(1000);
        jpnViewPayments.add(txtViewPayments);
        txtViewPayments.setBounds(68, 85, 368, 278);

        btnViewWhoPayd.setText("payd");
        btnViewWhoPayd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewWhoPayd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewWhoPaydActionPerformed(evt);
            }
        });
        jpnViewPayments.add(btnViewWhoPayd);
        btnViewWhoPayd.setBounds(474, 85, 98, 41);

        btnViewWhoNotPayed.setText("ramining");
        btnViewWhoNotPayed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewWhoNotPayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewWhoNotPayedActionPerformed(evt);
            }
        });
        jpnViewPayments.add(btnViewWhoNotPayed);
        btnViewWhoNotPayed.setBounds(474, 144, 98, 40);

        btnViewAllPayments.setText("All");
        btnViewAllPayments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAllPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllPaymentsActionPerformed(evt);
            }
        });
        jpnViewPayments.add(btnViewAllPayments);
        btnViewAllPayments.setBounds(474, 211, 98, 40);

        jpnService.setOpaque(false);
        jpnService.setLayout(null);
        jpnService.add(txtService);
        txtService.setBounds(50, 90, 400, 190);

        btnShowSerive.setText("show list");
        btnShowSerive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowSerive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSeriveActionPerformed(evt);
            }
        });
        jpnService.add(btnShowSerive);
        btnShowSerive.setBounds(490, 100, 90, 40);

        jpnAddUser.setOpaque(false);
        jpnAddUser.setLayout(null);

        lblEnterFirstName.setText("firstname");
        jpnAddUser.add(lblEnterFirstName);
        lblEnterFirstName.setBounds(40, 110, 70, 20);

        lblEnterLastName.setText("lastname");
        jpnAddUser.add(lblEnterLastName);
        lblEnterLastName.setBounds(40, 150, 70, 16);

        lblEnterEmail.setText("email");
        jpnAddUser.add(lblEnterEmail);
        lblEnterEmail.setBounds(40, 190, 70, 16);

        btnAddNewUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddNewUser.setText("add");
        btnAddNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewUserActionPerformed(evt);
            }
        });
        jpnAddUser.add(btnAddNewUser);
        btnAddNewUser.setBounds(80, 380, 130, 40);

        lblEnteNewUserDetails.setLabelFor(jpnAddUser);
        lblEnteNewUserDetails.setText("Ente new user details");
        jpnAddUser.add(lblEnteNewUserDetails);
        lblEnteNewUserDetails.setBounds(140, 40, 190, 16);

        lblEnterUserToDelete.setText("enter the id of the user to delete");
        jpnAddUser.add(lblEnterUserToDelete);
        lblEnterUserToDelete.setBounds(360, 60, 200, 16);
        jpnAddUser.add(txtIdOfTheUserToDelete);
        txtIdOfTheUserToDelete.setBounds(360, 90, 140, 22);

        btnDeleteTheUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteTheUser.setText("delete");
        btnDeleteTheUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteTheUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTheUserActionPerformed(evt);
            }
        });
        jpnAddUser.add(btnDeleteTheUser);
        btnDeleteTheUser.setBounds(360, 130, 110, 31);
        jpnAddUser.add(txtEnterUserName);
        txtEnterUserName.setBounds(140, 270, 130, 22);

        lblEnterUserName.setText("username");
        jpnAddUser.add(lblEnterUserName);
        lblEnterUserName.setBounds(40, 270, 60, 16);

        lblEnterPhoneNumber.setText("phone number");
        jpnAddUser.add(lblEnterPhoneNumber);
        lblEnterPhoneNumber.setBounds(40, 230, 100, 20);
        jpnAddUser.add(txtEnterEmail);
        txtEnterEmail.setBounds(140, 190, 130, 22);
        jpnAddUser.add(txtEnterPhoneNumber);
        txtEnterPhoneNumber.setBounds(140, 230, 130, 22);
        jpnAddUser.add(txtEnterLastName);
        txtEnterLastName.setBounds(140, 150, 130, 22);
        jpnAddUser.add(txtEnderName);
        txtEnderName.setBounds(140, 110, 130, 22);
        jpnAddUser.add(txtEnterID);
        txtEnterID.setBounds(140, 70, 130, 22);

        lblEnterID.setText("ID");
        jpnAddUser.add(lblEnterID);
        lblEnterID.setBounds(40, 70, 70, 16);
        jpnAddUser.add(txtEnterPassword);
        txtEnterPassword.setBounds(140, 310, 130, 22);

        lblEnterPassword.setText("password");
        jpnAddUser.add(lblEnterPassword);
        lblEnterPassword.setBounds(40, 310, 70, 16);

        jpnAddService.setOpaque(false);
        jpnAddService.setLayout(null);

        lblEddNewService.setText("edd a new service");
        jpnAddService.add(lblEddNewService);
        lblEddNewService.setBounds(40, 40, 180, 16);

        jpnAddUser.add(jpnAddService);
        jpnAddService.setBounds(0, 0, 610, 480);

        lblApartmantId.setText("apartment");
        jpnAddUser.add(lblApartmantId);
        lblApartmantId.setBounds(40, 350, 59, 16);
        jpnAddUser.add(txtApartment);
        txtApartment.setBounds(140, 350, 130, 22);

        jpnService.add(jpnAddUser);
        jpnAddUser.setBounds(0, 0, 610, 480);

        lblEnterServieId.setText("enter the id of servie you want to order");
        jpnService.add(lblEnterServieId);
        lblEnterServieId.setBounds(60, 300, 240, 30);
        jpnService.add(txtIdOfServiceToOrder);
        txtIdOfServiceToOrder.setBounds(60, 340, 220, 22);

        btnMakeTheOrder.setText("order");
        btnMakeTheOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeTheOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeTheOrderActionPerformed(evt);
            }
        });
        jpnService.add(btnMakeTheOrder);
        btnMakeTheOrder.setBounds(60, 380, 100, 30);

        lblServiceType.setText("Service type");
        jpnService.add(lblServiceType);
        lblServiceType.setBounds(330, 310, 80, 16);
        jpnService.add(txtServieType);
        txtServieType.setBounds(330, 340, 100, 22);

        jpnViewPayments.add(jpnService);
        jpnService.setBounds(-10, -30, 610, 480);

        jpnMakePayment.add(jpnViewPayments);
        jpnViewPayments.setBounds(10, 30, 610, 450);
        jpnMakePayment.add(txtSum);
        txtSum.setBounds(50, 94, 125, 22);
        jpnMakePayment.add(txtCommant);
        txtCommant.setBounds(50, 144, 362, 95);

        btnPay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPay.setText("pay");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jpnMakePayment.add(btnPay);
        btnPay.setBounds(50, 257, 149, 40);

        jpnReadMessages.add(jpnMakePayment);
        jpnMakePayment.setBounds(0, 0, 610, 480);

        jpnSendMassege.add(jpnReadMessages);
        jpnReadMessages.setBounds(0, 0, 610, 480);

        btnAddService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddService.setText("add/delete service");
        btnAddService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jplMainPannelLayout = new javax.swing.GroupLayout(jplMainPannel);
        jplMainPannel.setLayout(jplMainPannelLayout);
        jplMainPannelLayout.setHorizontalGroup(
            jplMainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMainPannelLayout.createSequentialGroup()
                .addGroup(jplMainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnSendMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnReadMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jplMainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jplMainPannelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(btnMakePaymnet, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jplMainPannelLayout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addGroup(jplMainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jplMainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnViewPayments, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(btnAddUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(117, 117, 117)
                .addComponent(jpnSendMassege, javax.swing.GroupLayout.DEFAULT_SIZE, 607, Short.MAX_VALUE))
        );
        jplMainPannelLayout.setVerticalGroup(
            jplMainPannelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jplMainPannelLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(btnSendMassege, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnReadMessage, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnMakePaymnet, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnViewPayments, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddUser, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAddService, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
            .addComponent(jpnSendMassege, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        getContentPane().add(jplMainPannel);
        jplMainPannel.setBounds(0, 0, 950, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMassegeActionPerformed
      
        onOffPanel(true,false,false,false,false,false,false);
        onOffComponents(true,false,false,false,false,false,false);
      
    }//GEN-LAST:event_btnSendMassegeActionPerformed
/**
    *
    */
    private void btnReadMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadMessageActionPerformed
     onOffPanel(true,true,false,false,false,false,false);
     onOffComponents(false,true,false,false,false,false,false);
    }//GEN-LAST:event_btnReadMessageActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnMakePaymnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakePaymnetActionPerformed
        onOffPanel(true,true,true,false,false,false,false);
        onOffComponents(false,false,true,false,false,false,false);
    }//GEN-LAST:event_btnMakePaymnetActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
      onOffPanel(true,true,true,true,true,false,false);
      onOffComponents(false,false,false,false,true,false,false);
    }//GEN-LAST:event_btnOrderActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnViewPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPaymentsActionPerformed
        onOffPanel(true,true,true,true,false,false,false);
        onOffComponents(false,false,false,true,false,false,false);
    }//GEN-LAST:event_btnViewPaymentsActionPerformed
/**
 * add/delete user button
 * @param evt 
 */
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
        onOffPanel(true,true,true,true,true,true,false);
        onOffComponents(false,false,false,false,false,true,false);
 
    }//GEN-LAST:event_btnAddUserActionPerformed
/**
 * 
 * @param evt 
 */
    private void btnAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceActionPerformed
       onOffPanel(true,true,true,true,true,true,true);
       onOffComponents(false,false,false,false,false,false,true);
    }//GEN-LAST:event_btnAddServiceActionPerformed
/**
 * button add
 * when pressed the user added to database
 * @param evt 
 */
    private void btnAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewUserActionPerformed
        String firstName;
        String lastName;
        String password;
        String userName;
        String phoneNumber;
        String email;
        int apartmantId;
        int id;
        
     lastName=txtEnterLastName.getText();
     firstName=txtEnderName.getText();
     email=txtEnterEmail.getText();
     password=txtEnterPassword.getText();
     userName= txtEnterUserName.getText();
     id=Integer.parseInt(txtEnterID.getText());
     apartmantId=Integer.parseInt(txtApartment.getText());
     phoneNumber=txtEnterPhoneNumber.getText();
     
        User resident= new Resident(id,firstName,lastName,email,userName,password,a.getBuildingAddress(),phoneNumber,"resident",apartmantId);
        
    }//GEN-LAST:event_btnAddNewUserActionPerformed
/**
 * what heppenns when delete button in delete user prassed
 * @param evt 
 */
    private void btnDeleteTheUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTheUserActionPerformed
        int id=Integer.parseInt(txtIdOfTheUserToDelete.getText());
       // a.addUser(id);
    }//GEN-LAST:event_btnDeleteTheUserActionPerformed
/**
 * when send message button pressed
 * sends the message
 * @param evt 
 */
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
      String username;
      String text;
      
      username=txtSendTo.getText();
      text=txtWriteMassege.getText();
      Message message =new Message(text,a.getUserName(),username);
      a.SendMessage(message);
    }//GEN-LAST:event_btnSendActionPerformed
/**
 * show your messages
 * @param evt 
 */
    private void btnShowMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMessagesActionPerformed
      
    }//GEN-LAST:event_btnShowMessagesActionPerformed
/**
 * show the corrent payments
 * @param evt 
 */
    private void btnViewWhoPaydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewWhoPaydActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewWhoPaydActionPerformed
/**
 * show who not payed  yet
 * @param evt 
 */
    private void btnViewWhoNotPayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewWhoNotPayedActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewWhoNotPayedActionPerformed
/**
 * show all paymnts who payed and who not
 * @param evt 
 */
    private void btnViewAllPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllPaymentsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewAllPaymentsActionPerformed
/**
 * show all possibale serivece guys
 * @param evt 
 */
    private void btnShowSeriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSeriveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnShowSeriveActionPerformed
/**
 * order the servie guy
 * @param evt 
 */
    private void btnMakeTheOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeTheOrderActionPerformed
      String id=txtIdOfServiceToOrder.getText();
      String type= txtServieType.getText();
      
      Order order=new Order(a.getUserName(),id,type);
       a.order(order);
    }//GEN-LAST:event_btnMakeTheOrderActionPerformed
/**
 * make the payment
 * @param evt 
 */
    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
      int sum=Integer.parseInt(txtSum.getText());
    String commant= txtCommant.getText();
        Payment pay=new Payment(a.getUserName(),a.getUserName(),commant,sum);
        a.makePayment(pay);
    }//GEN-LAST:event_btnPayActionPerformed
/**
 * 
 * @param sendMessage
 * @param readMessage
 * @param makePayment
 * @param viewPayment
 * @param service
 * @param addUser
 * @param addService 
 */
    private void onOffPanel(boolean sendMessage,boolean readMessage,boolean makePayment,boolean viewPayment
            ,boolean service,boolean addUser,boolean addService) {
        jpnSendMassege.setVisible(sendMessage);
        jpnReadMessages.setVisible(readMessage);
        jpnMakePayment.setVisible(makePayment);
        jpnViewPayments.setVisible(viewPayment);
        jpnService.setVisible(service);
        jpnAddUser.setVisible(addUser);
        jpnAddService.setVisible(addService);
                
    }
    /**
     * 
     * @param sendMessage
     * @param readMessage
     * @param makePayment
     * @param viewPayment
     * @param service
     * @param addUser
     * @param addService 
     */
    private void onOffComponents(boolean sendMessage,boolean readMessage,boolean makePayment,boolean viewPayment
            ,boolean service,boolean addUser,boolean addService){
    
     lblSentTo.setVisible(sendMessage);
     txtSendTo.setVisible(sendMessage);
     txtWriteMassege.setVisible(sendMessage);
     btnSend.setVisible(sendMessage);
     
     txtShovMessage.setVisible(readMessage);
     btnShowMessages.setVisible(readMessage);
     
     txtSum.setVisible(makePayment);
     txtCommant.setVisible(makePayment);
     btnPay.setVisible(makePayment);
     
     txtViewPayments.setVisible(viewPayment);
     btnViewWhoPayd.setVisible(viewPayment);
     btnViewWhoNotPayed.setVisible(viewPayment);
     btnViewAllPayments.setVisible(viewPayment);
     
     txtService.setVisible(service);
     btnShowSerive.setVisible(service);
     lblEnterServieId.setVisible(service);
     lblServiceType.setVisible(service);
     txtServieType.setVisible(service);
     txtIdOfServiceToOrder.setVisible(service);
     btnMakeTheOrder.setVisible(service);
     
     lblEnterFirstName.setVisible(addUser);
     lblEnterLastName.setVisible(addUser);
     lblEnterEmail.setVisible(addUser);
     lblEnterUserName.setVisible(addUser);
     lblEnterPassword.setVisible(addUser);
     lblEnterID.setVisible(addUser);
     lblEnteNewUserDetails.setVisible(addUser);
     lblEnterUserToDelete.setVisible(addUser);
     lblEnterPhoneNumber.setVisible(addUser);
     lblApartmantId.setVisible(addUser);
     txtEnterPhoneNumber.setVisible(addUser);
     txtEnterLastName.setVisible(addUser);
     txtEnderName.setVisible(addUser);
     txtEnterEmail.setVisible(addUser);
     txtEnterPassword.setVisible(addUser);
     txtEnterUserName.setVisible(addUser);
     txtEnterID.setVisible(addUser);
     txtApartment.setVisible(addUser);
     txtIdOfTheUserToDelete.setVisible(addUser);
     btnAddNewUser.setVisible(addUser);
     btnDeleteTheUser.setVisible(addUser);
     
     lblEddNewService.setVisible(addService);
     
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[])  {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddNewUser;
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDeleteTheUser;
    private javax.swing.JButton btnMakePaymnet;
    private javax.swing.JButton btnMakeTheOrder;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnReadMessage;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendMassege;
    private javax.swing.JButton btnShowMessages;
    private javax.swing.JButton btnShowSerive;
    private javax.swing.JButton btnViewAllPayments;
    private javax.swing.JButton btnViewPayments;
    private javax.swing.JButton btnViewWhoNotPayed;
    private javax.swing.JButton btnViewWhoPayd;
    private javax.swing.JPanel jplMainPannel;
    private javax.swing.JPanel jpnAddService;
    private javax.swing.JPanel jpnAddUser;
    private javax.swing.JPanel jpnMakePayment;
    private javax.swing.JPanel jpnReadMessages;
    private javax.swing.JPanel jpnSendMassege;
    private javax.swing.JPanel jpnService;
    private javax.swing.JPanel jpnViewPayments;
    private javax.swing.JLabel lblApartmantId;
    private javax.swing.JLabel lblEddNewService;
    private javax.swing.JLabel lblEnteNewUserDetails;
    private javax.swing.JLabel lblEnterEmail;
    private javax.swing.JLabel lblEnterFirstName;
    private javax.swing.JLabel lblEnterID;
    private javax.swing.JLabel lblEnterLastName;
    private javax.swing.JLabel lblEnterPassword;
    private javax.swing.JLabel lblEnterPhoneNumber;
    private javax.swing.JLabel lblEnterServieId;
    private javax.swing.JLabel lblEnterUserName;
    private javax.swing.JLabel lblEnterUserToDelete;
    private javax.swing.JLabel lblSentTo;
    private javax.swing.JLabel lblServiceType;
    private javax.swing.JTextField txtApartment;
    private javax.swing.JTextField txtCommant;
    private javax.swing.JTextField txtEnderName;
    private javax.swing.JTextField txtEnterEmail;
    private javax.swing.JTextField txtEnterID;
    private javax.swing.JTextField txtEnterLastName;
    private javax.swing.JTextField txtEnterPassword;
    private javax.swing.JTextField txtEnterPhoneNumber;
    private javax.swing.JTextField txtEnterUserName;
    private javax.swing.JTextField txtIdOfServiceToOrder;
    private javax.swing.JTextField txtIdOfTheUserToDelete;
    private javax.swing.JTextField txtSendTo;
    private javax.swing.JTextField txtService;
    private javax.swing.JTextField txtServieType;
    private javax.swing.JTextField txtShovMessage;
    private javax.swing.JTextField txtSum;
    private javax.swing.JTextField txtViewPayments;
    private javax.swing.JTextField txtWriteMassege;
    // End of variables declaration//GEN-END:variables
}
