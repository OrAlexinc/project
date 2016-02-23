/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DB.DataBase;
import buldingmaintance.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author orgershov
 */
public class UserForm extends javax.swing.JFrame {

    Resident resident;
    List<Message> messages = new ArrayList<Message>();
    List<ExternalWorker> workers = new ArrayList<ExternalWorker>();
    List<Feedback> feedbacks = new ArrayList<Feedback>();
    DataBase dataBase = DataBase.GetInstance();
    String idLenghtError = "id must contin 9 digits";
    String idErrorMessage = "you need enter only digits in the id";
    String idErrorTitle = "wrong input";
    String feedbackErrorMessage = "you need enter only digits to the id/rating/sum";
    String feedbackLenghtError = "you neeed to enter numbers no longer than 9 digits";

    public UserForm(Resident resident) {
        initComponents();
        this.resident = resident;
        OnOffComponents(false, false, false, false, false);
        OnOffPanel(false, false, false, false, false);

    }

    /**
     * cheaking if sring can safly converted to integer
     *
     * @param number
     * @return
     */
    private boolean isInteger(String number) {
        if (number.matches("[0-9]+") == false || number.length() > 9) {
            JOptionPane.showMessageDialog(null, "Ente only numbers", idErrorTitle, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * cheaks if the id is valid
     *
     * @param id
     * @return
     */
    private boolean isValidId(String id) {
        if (isInteger(id)) {
            if (id.length() == 9) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Enter valid 9 digits id", idErrorTitle, JOptionPane.ERROR_MESSAGE);
            }

        }
        return false;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnMain = new javax.swing.JPanel();
        btnSend = new javax.swing.JButton();
        jpnViewMassege = new javax.swing.JPanel();
        scrollShowMessage = new javax.swing.JScrollPane();
        txtShowMessage = new javax.swing.JTextArea();
        jpnPayment = new javax.swing.JPanel();
        btnPay = new javax.swing.JButton();
        txtSum = new javax.swing.JTextField();
        lblSum = new javax.swing.JLabel();
        lblPaymentCommant = new javax.swing.JLabel();
        jpnOrderMaintinace = new javax.swing.JPanel();
        lblIdOfService = new javax.swing.JLabel();
        lblTypeOfService = new javax.swing.JLabel();
        txtEnterTypeOfService = new javax.swing.JTextField();
        btnOrderService = new javax.swing.JButton();
        lblServieList = new javax.swing.JLabel();
        scrollListOfServices = new javax.swing.JScrollPane();
        txtListOfServices = new javax.swing.JTextArea();
        jpnAddFeedback = new javax.swing.JPanel();
        lblEddFeedbackAbutAService = new javax.swing.JLabel();
        lblEnterFeddbackId = new javax.swing.JLabel();
        lblEnterRatingOfService = new javax.swing.JLabel();
        lblEnterPriveTaken = new javax.swing.JLabel();
        txtEnterPriceTaken = new javax.swing.JTextField();
        lblEnterFeedback = new javax.swing.JLabel();
        scrollEnterFeedback = new javax.swing.JScrollPane();
        txtEnterFeedback = new javax.swing.JTextArea();
        btnSendFeedback = new javax.swing.JButton();
        lblEnterWorkDone = new javax.swing.JLabel();
        txtEnterWorkTypeDone = new javax.swing.JTextField();
        compAddRating = new javax.swing.JComboBox();
        compIdOfTheServicToAddFeedBack = new javax.swing.JComboBox();
        lblEnterIdOfServiceToSeeFeeedback = new javax.swing.JLabel();
        btnShowTheFeedback = new javax.swing.JButton();
        btnShowServiceList = new javax.swing.JButton();
        combIdOfServiceToSeeFeedback = new javax.swing.JComboBox();
        compIdOfTheServicToOrder = new javax.swing.JComboBox();
        scrollPaymentCommant = new javax.swing.JScrollPane();
        txtPaymentCommant = new javax.swing.JTextArea();
        lblSendTo = new javax.swing.JLabel();
        scrollWriteMassege = new javax.swing.JScrollPane();
        txtWriteMessage = new javax.swing.JTextArea();
        combSendTo = new javax.swing.JComboBox();
        btnSendMassege = new javax.swing.JButton();
        btnViewMassege = new javax.swing.JButton();
        btnMakepayment = new javax.swing.JButton();
        btnMakeOrder = new javax.swing.JButton();
        btnAddAFeedback = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("WELCOME USER");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new javax.swing.OverlayLayout(getContentPane()));

        jpnMain.setBackground(new java.awt.Color(204, 255, 204));
        jpnMain.setMinimumSize(new java.awt.Dimension(936, 456));
        jpnMain.setLayout(null);

        jpnSendMassege.setBackground(new java.awt.Color(100, 251, 14));
        jpnSendMassege.setOpaque(false);
        jpnSendMassege.setLayout(null);

        btnSend.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSend.setText("send");
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jpnSendMassege.add(btnSend);
        btnSend.setBounds(430, 360, 150, 40);

        jpnViewMassege.setBackground(java.awt.SystemColor.controlLtHighlight);
        jpnViewMassege.setMinimumSize(new java.awt.Dimension(690, 300));
        jpnViewMassege.setOpaque(false);
        jpnViewMassege.setLayout(null);

        txtShowMessage.setEditable(false);
        txtShowMessage.setColumns(20);
        txtShowMessage.setRows(5);
        txtShowMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        scrollShowMessage.setViewportView(txtShowMessage);

        jpnViewMassege.add(scrollShowMessage);
        scrollShowMessage.setBounds(70, 80, 510, 260);

        btnShowMesseges.setBackground(new java.awt.Color(255, 255, 255));
        btnShowMesseges.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowMesseges.setText("show messeges");
        btnShowMesseges.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowMesseges.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowMessegesActionPerformed(evt);
            }
        });
        jpnViewMassege.add(btnShowMesseges);
        btnShowMesseges.setBounds(50, 20, 170, 40);
        btnShowMesseges.getAccessibleContext().setAccessibleParent(jpnSendMassege);

        jpnPayment.setOpaque(false);
        jpnPayment.setLayout(null);

        btnPay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPay.setText("pay");
        btnPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jpnPayment.add(btnPay);
        btnPay.setBounds(70, 320, 110, 40);
        jpnPayment.add(txtSum);
        txtSum.setBounds(70, 130, 150, 30);

        lblSum.setBackground(new java.awt.Color(102, 204, 255));
        lblSum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSum.setText("enter sum");
        jpnPayment.add(lblSum);
        lblSum.setBounds(70, 100, 130, 22);

        lblPaymentCommant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPaymentCommant.setText("Comant");
        jpnPayment.add(lblPaymentCommant);
        lblPaymentCommant.setBounds(70, 170, 140, 22);

        jpnOrderMaintinace.setOpaque(false);
        jpnOrderMaintinace.setLayout(null);

        lblIdOfService.setText("chosen service id");
        jpnOrderMaintinace.add(lblIdOfService);
        lblIdOfService.setBounds(30, 360, 110, 30);

        lblTypeOfService.setText("type of service");
        jpnOrderMaintinace.add(lblTypeOfService);
        lblTypeOfService.setBounds(190, 370, 90, 16);
        jpnOrderMaintinace.add(txtEnterTypeOfService);
        txtEnterTypeOfService.setBounds(170, 400, 130, 22);

        btnOrderService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrderService.setText("order");
        btnOrderService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderServiceActionPerformed(evt);
            }
        });
        jpnOrderMaintinace.add(btnOrderService);
        btnOrderService.setBounds(360, 375, 120, 40);

        lblServieList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblServieList.setText("list of services");
        jpnOrderMaintinace.add(lblServieList);
        lblServieList.setBounds(40, 40, 130, 22);

        txtListOfServices.setEditable(false);
        txtListOfServices.setColumns(20);
        txtListOfServices.setRows(5);
        scrollListOfServices.setViewportView(txtListOfServices);

        jpnOrderMaintinace.add(scrollListOfServices);
        scrollListOfServices.setBounds(40, 80, 350, 250);

        jpnAddFeedback.setOpaque(false);
        jpnAddFeedback.setLayout(null);

        lblEddFeedbackAbutAService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEddFeedbackAbutAService.setText("add a feedback abut a service");
        jpnAddFeedback.add(lblEddFeedbackAbutAService);
        lblEddFeedbackAbutAService.setBounds(50, 40, 240, 20);

        lblEnterFeddbackId.setText("id fo service");
        jpnAddFeedback.add(lblEnterFeddbackId);
        lblEnterFeddbackId.setBounds(50, 80, 130, 16);

        lblEnterRatingOfService.setText("reating(0-10)");
        jpnAddFeedback.add(lblEnterRatingOfService);
        lblEnterRatingOfService.setBounds(230, 80, 90, 16);

        lblEnterPriveTaken.setText("price taken");
        jpnAddFeedback.add(lblEnterPriveTaken);
        lblEnterPriveTaken.setBounds(400, 80, 130, 16);
        jpnAddFeedback.add(txtEnterPriceTaken);
        txtEnterPriceTaken.setBounds(400, 110, 130, 22);

        lblEnterFeedback.setText("enter feedback");
        jpnAddFeedback.add(lblEnterFeedback);
        lblEnterFeedback.setBounds(50, 210, 120, 16);

        txtEnterFeedback.setColumns(20);
        txtEnterFeedback.setRows(5);
        scrollEnterFeedback.setViewportView(txtEnterFeedback);

        jpnAddFeedback.add(scrollEnterFeedback);
        scrollEnterFeedback.setBounds(50, 240, 430, 120);

        btnSendFeedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSendFeedback.setText("send feedback");
        btnSendFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFeedbackActionPerformed(evt);
            }
        });
        jpnAddFeedback.add(btnSendFeedback);
        btnSendFeedback.setBounds(40, 370, 150, 40);

        lblEnterWorkDone.setText("enter the work type");
        jpnAddFeedback.add(lblEnterWorkDone);
        lblEnterWorkDone.setBounds(50, 150, 130, 16);
        jpnAddFeedback.add(txtEnterWorkTypeDone);
        txtEnterWorkTypeDone.setBounds(40, 180, 190, 22);

        compAddRating.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jpnAddFeedback.add(compAddRating);
        compAddRating.setBounds(210, 110, 120, 20);

        jpnAddFeedback.add(compIdOfTheServicToAddFeedBack);
        compIdOfTheServicToAddFeedBack.setBounds(50, 110, 120, 20);

        jpnOrderMaintinace.add(jpnAddFeedback);
        jpnAddFeedback.setBounds(0, 0, 650, 490);

        lblEnterIdOfServiceToSeeFeeedback.setText("Enter id of service to see feedback");
        jpnOrderMaintinace.add(lblEnterIdOfServiceToSeeFeeedback);
        lblEnterIdOfServiceToSeeFeeedback.setBounds(420, 80, 210, 16);

        btnShowTheFeedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowTheFeedback.setText("show feedback");
        btnShowTheFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowTheFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTheFeedbackActionPerformed(evt);
            }
        });
        jpnOrderMaintinace.add(btnShowTheFeedback);
        btnShowTheFeedback.setBounds(420, 150, 200, 30);

        btnShowServiceList.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowServiceList.setText("show list");
        btnShowServiceList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowServiceList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowServiceListActionPerformed(evt);
            }
        });
        jpnOrderMaintinace.add(btnShowServiceList);
        btnShowServiceList.setBounds(390, 290, 140, 40);

        jpnOrderMaintinace.add(combIdOfServiceToSeeFeedback);
        combIdOfServiceToSeeFeedback.setBounds(420, 110, 200, 22);

        jpnOrderMaintinace.add(compIdOfTheServicToOrder);
        compIdOfTheServicToOrder.setBounds(30, 402, 120, 20);

        jpnPayment.add(jpnOrderMaintinace);
        jpnOrderMaintinace.setBounds(0, 0, 650, 490);

        txtPaymentCommant.setColumns(20);
        txtPaymentCommant.setRows(5);
        scrollPaymentCommant.setViewportView(txtPaymentCommant);

        jpnPayment.add(scrollPaymentCommant);
        scrollPaymentCommant.setBounds(70, 200, 340, 110);

        jpnViewMassege.add(jpnPayment);
        jpnPayment.setBounds(0, 0, 640, 480);

        jpnSendMassege.add(jpnViewMassege);
        jpnViewMassege.setBounds(0, 0, 660, 470);
        jpnViewMassege.getAccessibleContext().setAccessibleParent(jpnMain);

        lblSendTo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSendTo.setText("send to");
        jpnSendMassege.add(lblSendTo);
        lblSendTo.setBounds(80, 50, 70, 20);

        txtWriteMessage.setColumns(20);
        txtWriteMessage.setRows(5);
        scrollWriteMassege.setViewportView(txtWriteMessage);

        jpnSendMassege.add(scrollWriteMassege);
        scrollWriteMassege.setBounds(70, 80, 510, 250);

        jpnSendMassege.add(combSendTo);
        combSendTo.setBounds(150, 50, 110, 22);

        jpnMain.add(jpnSendMassege);
        jpnSendMassege.setBounds(290, 0, 670, 460);

        btnSendMassege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSendMassege.setText("send massege");
        btnSendMassege.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendMassege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMassegeActionPerformed(evt);
            }
        });
        jpnMain.add(btnSendMassege);
        btnSendMassege.setBounds(50, 60, 190, 50);

        btnViewMassege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewMassege.setText("view massege");
        btnViewMassege.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewMassege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMassegeActionPerformed(evt);
            }
        });
        jpnMain.add(btnViewMassege);
        btnViewMassege.setBounds(50, 140, 190, 50);

        btnMakepayment.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMakepayment.setText("make patment");
        btnMakepayment.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakepayment.setOpaque(false);
        btnMakepayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakepaymentActionPerformed(evt);
            }
        });
        jpnMain.add(btnMakepayment);
        btnMakepayment.setBounds(50, 220, 190, 50);

        btnMakeOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMakeOrder.setText("order maintainace");
        btnMakeOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeOrderActionPerformed(evt);
            }
        });
        jpnMain.add(btnMakeOrder);
        btnMakeOrder.setBounds(50, 300, 190, 50);

        btnAddAFeedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddAFeedback.setText("add feedback");
        btnAddAFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddAFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAFeedbackActionPerformed(evt);
            }
        });
        jpnMain.add(btnAddAFeedback);
        btnAddAFeedback.setBounds(50, 380, 190, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/UFBackgrund.png"))); // NOI18N
        jpnMain.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 630);

        getContentPane().add(jpnMain);

        setBounds(250, 250, 957, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMassegeActionPerformed

        OnOffComponents(true, false, false, false, false);
        OnOffPanel(true, false, false, false, false);
         ArrayList<String> usernames=new ArrayList<String>();
        usernames=dataBase.listOfUsers();
        for(String user:usernames){
             combSendTo.addItem(user);
        }
    }//GEN-LAST:event_btnSendMassegeActionPerformed

    private void btnViewMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMassegeActionPerformed

        OnOffComponents(false, true, false, false, false);
        OnOffPanel(true, true, false, false, false);
        messages = resident.RecieveMessage(resident.getUserName());
        txtShowMessage.setText("");
      
    }//GEN-LAST:event_btnViewMassegeActionPerformed

    /**
     * show my messages
     *
     * @param evt
     */
    private void btnShowMessegesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMessegesActionPerformed
        boolean flag = true;
        if (flag) {
            String allMessages = "";
            for (Message message : messages) {
                allMessages += message.toString();
            }
            txtShowMessage.setText(allMessages);
            flag = false;
        } else if (!flag) {
            JOptionPane.showMessageDialog(null, "you dont have any more messages!!!!", idErrorTitle, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShowMessegesActionPerformed
    /**
     * send my message
     *
     * @param evt
     */
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        boolean flag = true;
        if (txtWriteMessage.getText().equals("")) {
            flag = false;
            JOptionPane.showMessageDialog(null, "cant leave null text filds", idErrorTitle, JOptionPane.ERROR_MESSAGE);

        } else if (flag) {
            String content = txtWriteMessage.getText();
             String username =(String) combSendTo.getSelectedItem();
            Message message = new Message(content, resident.getUserName(), username);
            resident.SendMessage(message);
            txtWriteMessage.setText("");
         
        }
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnMakepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakepaymentActionPerformed
        OnOffComponents(false, false, true, false, false);
        OnOffPanel(true, true, true, false, false);
    }//GEN-LAST:event_btnMakepaymentActionPerformed

    private void btnMakeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeOrderActionPerformed
        OnOffComponents(false, false, false, true, false);
        OnOffPanel(true, true, true, true, false);

        ArrayList<String> listOfId = new ArrayList<String>();
        listOfId=dataBase.showWorkersId();
         for(String id:listOfId){           
        combIdOfServiceToSeeFeedback.addItem(id);
        compIdOfTheServicToOrder.addItem(id);
                }
    }//GEN-LAST:event_btnMakeOrderActionPerformed
    /**
     * make my payment
     *
     * @param evt
     */
    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        boolean flag = true;
        if (txtSum.getText().equals("") || txtPaymentCommant.getText().equals("")) {
            flag = false;
            JOptionPane.showMessageDialog(null, "cant leave null text filds", idErrorTitle, JOptionPane.ERROR_MESSAGE);

        } else if (flag) {
            int sum = 0;
            String workerFeedback = "";
            Payment pay = new Payment();

            if (isInteger(txtSum.getText())) {
                sum = Integer.parseInt(txtSum.getText());
                if (pay.setSum(sum)) {

                } else {
                    JOptionPane.showMessageDialog(null, "neggative number not allowed", idErrorTitle, JOptionPane.ERROR_MESSAGE);
                }
            }

            String commant = txtPaymentCommant.getText();
            pay = new Payment(resident.getUserName(), "Admin", commant, sum);

            resident.addPayment(pay);
        }
    }//GEN-LAST:event_btnPayActionPerformed
    /**
     * order a servie
     *
     * @param evt
     */
    private void btnOrderServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderServiceActionPerformed
        String id = "";
        boolean flag = true;
        if (txtEnterTypeOfService.getText().equals("")) {
            flag = false;
            JOptionPane.showMessageDialog(null, "cant leave null text filds", idErrorTitle, JOptionPane.ERROR_MESSAGE);

        } 
                   
          id=(String) compIdOfTheServicToOrder.getSelectedItem();
       if(flag){
            String type = txtEnterTypeOfService.getText();
            Order order = new Order(resident.getUserName(), id, type);
            resident.callService(order);
       }
        
    }//GEN-LAST:event_btnOrderServiceActionPerformed
    /**
     * add a feedback abut a service
     *
     * @param evt
     */
    private void btnAddAFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAFeedbackActionPerformed
        OnOffComponents(false, false, false, false, true);
        OnOffPanel(true, true, true, true, true);
        ArrayList<String> listOfId = new ArrayList<String>();
        listOfId= dataBase.showWorkersId();
        for(String id:listOfId)
        compIdOfTheServicToAddFeedBack.addItem(id);
    }//GEN-LAST:event_btnAddAFeedbackActionPerformed

    /**
     * add the feedback to database
     *
     * @param evt
     */
    private void btnSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFeedbackActionPerformed
       boolean flag0 = true;
        if (
                txtEnterPriceTaken.getText().equals("")||
                txtEnterFeedback.getText().equals("") ||
                txtEnterWorkTypeDone.getText().equals("")) {
            flag0 = false;
            JOptionPane.showMessageDialog(null, "cant leave null text filds", idErrorTitle, JOptionPane.ERROR_MESSAGE);

        } else if (flag0) {

        int id = 0;
        int rating = 0;
        float price = 0;
        boolean flag = true;
        Feedback feedback = new Feedback();
        String workerFeedback = "";
         String iD=(String) compIdOfTheServicToAddFeedBack.getSelectedItem();
         id=Integer.parseInt(iD);
          String sRating=(String) compAddRating.getSelectedItem();

          rating=Integer.parseInt(sRating);
        if (isInteger(txtEnterPriceTaken.getText())) {
            price = Integer.parseInt(txtEnterPriceTaken.getText());
        } else {
            flag = false;
        }

        String feedbackText = txtEnterFeedback.getText();
        String workDone = txtEnterWorkTypeDone.getText();
        if (flag) {
            feedback = new Feedback(id, feedbackText, rating, workDone, price);
            resident.addFeedback(feedback);
        }
        }
    }//GEN-LAST:event_btnSendFeedbackActionPerformed

    private void btnShowTheFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTheFeedbackActionPerformed
        boolean flag = true;
       
            int id = 0;
            String workerFeedback = "";

           String iD=(String) compIdOfTheServicToOrder.getSelectedItem();
              id=Integer.parseInt(iD);
            feedbacks = resident.seeFeedback(id);
            for (Feedback feedback : feedbacks) {
                workerFeedback += feedback.toString();
            }
            txtListOfServices.setText(workerFeedback);
        
    }//GEN-LAST:event_btnShowTheFeedbackActionPerformed
    /**
     * show the list if the services
     *
     * @param evt
     */
    private void btnShowServiceListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowServiceListActionPerformed
        String allWorkers = "";
        workers = dataBase.showAllWorkers();
        for (ExternalWorker worker : workers) {
            allWorkers += worker.toString();
        }
        txtListOfServices.setText(allWorkers);
        allWorkers = null;
    }//GEN-LAST:event_btnShowServiceListActionPerformed

    /**
     * @param args the command line arguments
     */
    public void OnOffPanel(boolean sendMessage, boolean viewMessage,
            boolean payment, boolean order, boolean feedback) {
        jpnSendMassege.setVisible(sendMessage);
        jpnViewMassege.setVisible(viewMessage);
        jpnPayment.setVisible(payment);
        jpnOrderMaintinace.setVisible(order);
        jpnAddFeedback.setVisible(feedback);

    }

    public void OnOffComponents(boolean sendMessage, boolean viewMessage,
            boolean payment, boolean order, boolean feedback) {
        btnSend.setVisible(sendMessage);
        scrollWriteMassege.setVisible(sendMessage);
        txtWriteMessage.setVisible(sendMessage);
        combSendTo.setVisible(sendMessage);
        lblSendTo.setVisible(sendMessage);

        btnShowMesseges.setVisible(viewMessage);
        scrollShowMessage.setVisible(viewMessage);
        txtShowMessage.setVisible(viewMessage);

        btnPay.setVisible(payment);
        txtSum.setVisible(payment);
        lblSum.setVisible(payment);
        lblPaymentCommant.setVisible(payment);
        txtPaymentCommant.setVisible(payment);
        scrollPaymentCommant.setVisible(payment);

        txtListOfServices.setVisible(order);
        scrollListOfServices.setVisible(order);
        lblServieList.setVisible(order);
        lblTypeOfService.setVisible(order);
       
        txtEnterTypeOfService.setVisible(order);
        btnOrderService.setVisible(order);
        lblEnterIdOfServiceToSeeFeeedback.setVisible(order);
       
        btnShowTheFeedback.setVisible(order);
        lblIdOfService.setVisible(order);
        btnShowServiceList.setVisible(order);
        combIdOfServiceToSeeFeedback.setVisible(order);
        compIdOfTheServicToOrder.setVisible(order);

        lblEddFeedbackAbutAService.setVisible(feedback);
       compAddRating.setVisible(feedback);
        lblEnterFeddbackId.setVisible(feedback);
       compIdOfTheServicToAddFeedBack.setVisible(feedback);
        lblEnterRatingOfService.setVisible(feedback);
        lblEnterPriveTaken.setVisible(feedback);
        txtEnterPriceTaken.setVisible(feedback);
        lblEnterFeedback.setVisible(feedback);
        scrollEnterFeedback.setVisible(feedback);
        txtEnterFeedback.setVisible(feedback);
        lblEnterWorkDone.setVisible(feedback);
        txtEnterWorkTypeDone.setVisible(feedback);

    }

    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddAFeedback;
    private javax.swing.JButton btnMakeOrder;
    private javax.swing.JButton btnMakepayment;
    private javax.swing.JButton btnOrderService;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendFeedback;
    private javax.swing.JButton btnSendMassege;
    private final javax.swing.JButton btnShowMesseges = new javax.swing.JButton();
    private javax.swing.JButton btnShowServiceList;
    private javax.swing.JButton btnShowTheFeedback;
    private javax.swing.JButton btnViewMassege;
    private javax.swing.JComboBox combIdOfServiceToSeeFeedback;
    private javax.swing.JComboBox combSendTo;
    private javax.swing.JComboBox compAddRating;
    private javax.swing.JComboBox compIdOfTheServicToAddFeedBack;
    private javax.swing.JComboBox compIdOfTheServicToOrder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jpnAddFeedback;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnOrderMaintinace;
    private javax.swing.JPanel jpnPayment;
    private final javax.swing.JPanel jpnSendMassege = new javax.swing.JPanel();
    private javax.swing.JPanel jpnViewMassege;
    private javax.swing.JLabel lblEddFeedbackAbutAService;
    private javax.swing.JLabel lblEnterFeddbackId;
    private javax.swing.JLabel lblEnterFeedback;
    private javax.swing.JLabel lblEnterIdOfServiceToSeeFeeedback;
    private javax.swing.JLabel lblEnterPriveTaken;
    private javax.swing.JLabel lblEnterRatingOfService;
    private javax.swing.JLabel lblEnterWorkDone;
    private javax.swing.JLabel lblIdOfService;
    private javax.swing.JLabel lblPaymentCommant;
    private javax.swing.JLabel lblSendTo;
    private javax.swing.JLabel lblServieList;
    private javax.swing.JLabel lblSum;
    private javax.swing.JLabel lblTypeOfService;
    private javax.swing.JScrollPane scrollEnterFeedback;
    private javax.swing.JScrollPane scrollListOfServices;
    private javax.swing.JScrollPane scrollPaymentCommant;
    private javax.swing.JScrollPane scrollShowMessage;
    private javax.swing.JScrollPane scrollWriteMassege;
    private javax.swing.JTextArea txtEnterFeedback;
    private javax.swing.JTextField txtEnterPriceTaken;
    private javax.swing.JTextField txtEnterTypeOfService;
    private javax.swing.JTextField txtEnterWorkTypeDone;
    private javax.swing.JTextArea txtListOfServices;
    private javax.swing.JTextArea txtPaymentCommant;
    private javax.swing.JTextArea txtShowMessage;
    private javax.swing.JTextField txtSum;
    private javax.swing.JTextArea txtWriteMessage;
    // End of variables declaration//GEN-END:variables
}
