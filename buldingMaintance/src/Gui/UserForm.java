/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DB.DataBase;
import Languages.LocalizationUtil;
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
    String idLenghtError =(LocalizationUtil.localizedResourceBundle.getString("idLenghtError"));
    String intErrorMessage =(LocalizationUtil.localizedResourceBundle.getString("intErrorMessage"));
    String numErrorTitle =(LocalizationUtil.localizedResourceBundle.getString("numErrorTitle"));
    String nullValueError=(LocalizationUtil.localizedResourceBundle.getString("nullValueError"));
    String nullValueTitle=(LocalizationUtil.localizedResourceBundle.getString("nullValueTitle"));
    String noMoreMessages=(LocalizationUtil.localizedResourceBundle.getString("noMoreMessages"));
    String mTitle=(LocalizationUtil.localizedResourceBundle.getString("mTitle"));

    public UserForm(Resident resident) {
        initComponents();
        this.resident = resident;
        OnOffComponents(false, false, false, false, false);
        OnOffPanel(false, false, false, false, false);
        SetSelectedLenguge();
    }

    /**
     * changes the languages of the text
     */
    private void SetSelectedLenguge() {
        btnAddAFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("btnAddAFeedback"));
        btnMakeOrder.setText(LocalizationUtil.localizedResourceBundle.getString("btnMakeOrder"));
        btnMakepayment.setText(LocalizationUtil.localizedResourceBundle.getString("btnMakepayment"));
        btnOrderService.setText(LocalizationUtil.localizedResourceBundle.getString("btnOrderService"));
        btnSend.setText(LocalizationUtil.localizedResourceBundle.getString("btnSend"));
        btnSendFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("btnSendFeedback"));
        btnShowServiceList.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowServiceList"));
        btnShowTheFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowTheFeedback"));
        btnViewMassege.setText(LocalizationUtil.localizedResourceBundle.getString("btnViewMassege"));
        lblEddFeedbackAbutAService.setText(LocalizationUtil.localizedResourceBundle.getString("lblEddFeedbackAbutAService"));
        lblEnterFeddbackId.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterFeddbackId"));
        lblEnterFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterFeedback"));
        lblEnterIdOfServiceToSeeFeeedback.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterIdOfServiceToSeeFeeedback"));
        lblEnterPriveTaken.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterPriveTaken"));
        lblEnterRatingOfService.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterRatingOfService"));
        lblEnterWorkDone.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterWorkDone"));
        lblIdOfService.setText(LocalizationUtil.localizedResourceBundle.getString("lblIdOfService"));
        lblPaymentCommant.setText(LocalizationUtil.localizedResourceBundle.getString("lblPaymentCommant"));
        lblSendTo.setText(LocalizationUtil.localizedResourceBundle.getString("lblSendTo"));
        lblServieList.setText(LocalizationUtil.localizedResourceBundle.getString("lblServieList"));
        lblTypeOfService.setText(LocalizationUtil.localizedResourceBundle.getString("lblTypeOfService"));
        btnSendMassege.setText(LocalizationUtil.localizedResourceBundle.getString("btnSendMassege"));
        btnShowMesseges.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowMessages"));
        btnPay.setText(LocalizationUtil.localizedResourceBundle.getString("btnPay"));
        lblSum.setText(LocalizationUtil.localizedResourceBundle.getString("lblSum"));
        
      
    }

    /**
     * checking if the value is number and in the size of integer if yes return
     * true
     *
     * @param number
     * @return
     */
    private boolean isInteger(String number) {
        if (number.matches("[0-9]+") == false || number.length() > 9) {
            JOptionPane.showMessageDialog(null, intErrorMessage, numErrorTitle, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * checks if the id is valid
     *
     * @param id
     * @return
     */
    private boolean isValidId(String id) {
        if (isInteger(id)) {
            if (id.length() == 9) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, idLenghtError, numErrorTitle, JOptionPane.ERROR_MESSAGE);
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
        btnShowServiceList.setBounds(390, 290, 200, 40);

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
        btnSendMassege.setBounds(50, 60, 250, 50);

        btnViewMassege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewMassege.setText("view massege");
        btnViewMassege.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewMassege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewMassegeActionPerformed(evt);
            }
        });
        jpnMain.add(btnViewMassege);
        btnViewMassege.setBounds(50, 140, 250, 50);

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
        btnMakepayment.setBounds(50, 220, 250, 50);

        btnMakeOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMakeOrder.setText("order maintainace");
        btnMakeOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeOrderActionPerformed(evt);
            }
        });
        jpnMain.add(btnMakeOrder);
        btnMakeOrder.setBounds(50, 300, 250, 50);

        btnAddAFeedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddAFeedback.setText("add feedback");
        btnAddAFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddAFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddAFeedbackActionPerformed(evt);
            }
        });
        jpnMain.add(btnAddAFeedback);
        btnAddAFeedback.setBounds(50, 380, 250, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/UFBackgrund.png"))); // NOI18N
        jpnMain.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 630);

        getContentPane().add(jpnMain);

        setBounds(250, 250, 957, 524);
    }// </editor-fold>//GEN-END:initComponents
      /**
     * when button send message clicked
     *
     * @param evt
     */
    private void btnSendMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMassegeActionPerformed
        //set the needed components to disply.true
        OnOffComponents(true, false, false, false, false);
        OnOffPanel(true, false, false, false, false);
        //create arry list of usernames
        ArrayList<String> usernames = dataBase.listOfUsers();
        //fill the combo box whith the list
        for (String user : usernames) {
            combSendTo.addItem(user);
        }
        //clear text from all fildes
        txtWriteMessage.setText(null);
    }//GEN-LAST:event_btnSendMassegeActionPerformed
    /**
     * what happens when show message button clicked
     *
     * @param evt
     */

    private void btnViewMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMassegeActionPerformed
        //set the needed components to disply.true
        OnOffComponents(false, true, false, false, false);
        OnOffPanel(true, true, false, false, false);

        //add all the messages from database  to messege list     
        messages = resident.RecieveMessage(resident.getUserName());

        //clear text from all fildes
        txtShowMessage.setText(null);

    }//GEN-LAST:event_btnViewMassegeActionPerformed

    /**
     * show my messages button
     *
     * @param evt
     */
    private void btnShowMessegesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMessegesActionPerformed
        //flag that indicates if thers is no more messages      
        boolean flag = true;

        if (flag) {
            String allMessages = "";
            //adding all messages from messages list lt a string to display on textbox
            for (Message message : messages) {
                allMessages += message.toString();
            }
            txtShowMessage.setText(allMessages);
            flag = false;
        } //when the is no moe messages alerting the user
        else if (!flag) {
            JOptionPane.showMessageDialog(null, noMoreMessages, mTitle, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShowMessegesActionPerformed
    /**
     * when send message button pressed sends the message
     *
     * @param evt
     */
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        //flag that indecates if message fild is empty      
        boolean flag = true;

        //if message text is null alerting the user to try again
        if (txtWriteMessage.getText().equals("")) {
            flag = false;
            JOptionPane.showMessageDialog(null, nullValueError, nullValueTitle, JOptionPane.ERROR_MESSAGE);

        } //if message faild is not null ending the message
         if (flag) {
            String content = txtWriteMessage.getText();
            String username = (String) combSendTo.getSelectedItem();
            Message message = new Message(content, resident.getUserName(), username);
            resident.SendMessage(message);
            txtWriteMessage.setText("");

        }
        //clear all textfilds
        txtWriteMessage.setText(null);
    }//GEN-LAST:event_btnSendActionPerformed
    /**
     * what happens when make payment button clicked
     *
     * @param evt
     */
    private void btnMakepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakepaymentActionPerformed
        //set the needed components to disply.true
        OnOffComponents(false, false, true, false, false);
        OnOffPanel(true, true, true, false, false);
        //clear text from all fildes
        txtSum.setText(null);
        txtPaymentCommant.setText(null);
    }//GEN-LAST:event_btnMakepaymentActionPerformed

    /**
     * what happens when order maintinece button clicked
     *
     * @param evt
     */
    private void btnMakeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeOrderActionPerformed
        //set the needed components to disply.true
        OnOffComponents(false, false, false, true, false);
        OnOffPanel(true, true, true, true, false);

        //fiil listOfId whit id from database
        ArrayList<String> listOfId = dataBase.showWorkersId();

        //fill the comboboxes whith the ids of workers
        for (String id : listOfId) {
            combIdOfServiceToSeeFeedback.addItem(id);
            compIdOfTheServicToOrder.addItem(id);
        }
        //clear text from all fildes
        txtEnterPriceTaken.setText(null);
        txtEnterFeedback.setText(null);
    }//GEN-LAST:event_btnMakeOrderActionPerformed
    /**
     * make the payment
     *
     * @param evt
     */
    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        //flag that indecates if values inserted correctly
        boolean flag = true;

        //if values inserted veong alert the user to try adain
        if (txtSum.getText().equals("") || txtPaymentCommant.getText().equals("")) {
            flag = false;
            JOptionPane.showMessageDialog(null, nullValueError, nullValueTitle, JOptionPane.ERROR_MESSAGE);
        }
        int sum = 0;
        Payment pay = new Payment();

        if (isInteger(txtSum.getText())) {
            sum = Integer.parseInt(txtSum.getText());
        } else {
            flag = false;
        }

        //if values inserted correctly add the payment
        if (flag) {
            String commant = txtPaymentCommant.getText();
            pay = new Payment(resident.getUserName(), "Admin", commant, sum);
        }
        resident.addPayment(pay);

        //clear the text fild
        txtSum.setText(null);
        txtPaymentCommant.setText(null);
    }//GEN-LAST:event_btnPayActionPerformed
    /**
     * order the maintenance
     *
     * @param evt
     */
    private void btnOrderServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderServiceActionPerformed
        String id = "";
        //flag that indecates iv vles insertert are valid
        boolean flag = true;
        //if text fild is null alerting the user to try again
        if (txtEnterTypeOfService.getText().equals("")) {
            flag = false;
            JOptionPane.showMessageDialog(null, nullValueError, nullValueTitle, JOptionPane.ERROR_MESSAGE);

        }

        id = (String) compIdOfTheServicToOrder.getSelectedItem();
        //if evering is inserted propably add the order to the database
        if (flag) {
            String type = txtEnterTypeOfService.getText();
            Order order = new Order(resident.getUserName(), id, type);
            resident.callService(order);
        }
        txtEnterTypeOfService.setText(null);
    }//GEN-LAST:event_btnOrderServiceActionPerformed
    /**
     * add a feedback abut a service
     *
     * @param evt
     */
    private void btnAddAFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddAFeedbackActionPerformed
        //set the needed components to disply.true
        OnOffComponents(false, false, false, false, true);
        OnOffPanel(true, true, true, true, true);

        //adding to listofId id of all vorkers and edding it to combobox 
        ArrayList<String> listOfId = new ArrayList<String>();
        listOfId = dataBase.showWorkersId();
        for (String id : listOfId) {
            compIdOfTheServicToAddFeedBack.addItem(id);
        }

        //clear tehe text fild
        txtEnterPriceTaken.setText(null);
        txtEnterFeedback.setText(null);
        txtEnterWorkTypeDone.setText(null);
    }//GEN-LAST:event_btnAddAFeedbackActionPerformed

    /**
     * add the feedback to database
     *
     * @param evt
     */
    private void btnSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFeedbackActionPerformed
        //flag that indecates if all values inserted properly
        boolean flag0 = true;

        //if the valuse are nuul alerting the user to try again
        if (txtEnterPriceTaken.getText().equals("")
                || txtEnterFeedback.getText().equals("")
                || txtEnterWorkTypeDone.getText().equals("")) {
            flag0 = false;
            JOptionPane.showMessageDialog(null, nullValueError, nullValueTitle, JOptionPane.ERROR_MESSAGE);

        } else if (flag0) {

            int id = 0;
            int rating = 0;
            float price = 0;
            //flag that indecates if all values inserted properly
            boolean flag = true;
            Feedback feedback = new Feedback();
            String workerFeedback = "";

            id = Integer.parseInt((String) compIdOfTheServicToAddFeedBack.getSelectedItem());
            rating = Integer.parseInt((String) compAddRating.getSelectedItem());

            if (isInteger(txtEnterPriceTaken.getText())) {
                price = Integer.parseInt(txtEnterPriceTaken.getText());
            } else {
                flag = false;
            }

            String feedbackText = txtEnterFeedback.getText();
            String workDone = txtEnterWorkTypeDone.getText();
            //if all values insertert correctly adding the feedbak to the database
            if (flag) {
                feedback = new Feedback(id, feedbackText, rating, workDone, price);
                resident.addFeedback(feedback);
            }
        }
        //clearing the text filds
        txtEnterPriceTaken.setText(null);
        txtEnterFeedback.setText(null);
        txtEnterWorkTypeDone.setText(null);
    }//GEN-LAST:event_btnSendFeedbackActionPerformed

    /**
     * show feedback abut a user from database
     *
     * @param evt
     */
    private void btnShowTheFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTheFeedbackActionPerformed
        

        int id = 0;
        String workerFeedback = "";
        //get the id of worker to show feedback abut him
        id = Integer.parseInt((String) combIdOfServiceToSeeFeedback.getSelectedItem());
        //add all fedback abut the worker to list feedback and displays them     
        feedbacks = resident.seeFeedback(id);
        for (Feedback feedback : feedbacks) {
            workerFeedback += feedback.toString();
        }
        txtListOfServices.setText(workerFeedback);

    }//GEN-LAST:event_btnShowTheFeedbackActionPerformed
    /**
     * show all workers from the database
     *
     * @param evt
     */
    private void btnShowServiceListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowServiceListActionPerformed
        String allWorkers = "";
        workers = dataBase.showAllWorkers();
        //adding all workers to the string workerList to display on textbox
        for (ExternalWorker worker : workers) {
            allWorkers += worker.toString();
        }
        txtListOfServices.setText(allWorkers);
    }//GEN-LAST:event_btnShowServiceListActionPerformed

    /**
     * set visible the needed Components
     *
     * @param sendMessage
     * @param viewMessage
     * @param payment
     * @param order
     * @param feedback
     */
    public void OnOffPanel(boolean sendMessage, boolean viewMessage,
            boolean payment, boolean order, boolean feedback) {
        jpnSendMassege.setVisible(sendMessage);
        jpnViewMassege.setVisible(viewMessage);
        jpnPayment.setVisible(payment);
        jpnOrderMaintinace.setVisible(order);
        jpnAddFeedback.setVisible(feedback);

    }

    /**
     * set visible the needed Components
     *
     * @param sendMessage
     * @param viewMessage
     * @param payment
     * @param order
     * @param feedback
     */
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
