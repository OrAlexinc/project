/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DB.DataBase;
import Languages.LocalizationUtil;
import buldingmaintance.*;
import java.awt.List;
import java.util.*;
import buldingmaintance.*;
import javax.swing.JOptionPane;

/**
 *
 * @author mishpuha
 */
public class AdminForm extends javax.swing.JFrame {

    /**
     * Creates new form AdminForm
     */
    Admin admin;

    java.util.List<User> users = new ArrayList<User>();
    java.util.List<Message> messages = new ArrayList<Message>();
    java.util.List<Payment> payments = new ArrayList<Payment>();
    java.util.List<Order> orders = new ArrayList<Order>();
    java.util.List<ExternalWorker> workers = new ArrayList<ExternalWorker>();
    java.util.List<Feedback> feedbacks = new ArrayList<Feedback>();
     java.util. ArrayList<User> notPayed = new ArrayList<User>();
    
    DataBase dataBase = DataBase.GetInstance();
    
    String idLenghtError =(LocalizationUtil.localizedResourceBundle.getString("idLenghtError"));
    String idErrorMessage =(LocalizationUtil.localizedResourceBundle.getString("idErrorMessage"));
    String idErrorTitle=(LocalizationUtil.localizedResourceBundle.getString("idErrorTitle"));
    String feedbackErrorMessage=(LocalizationUtil.localizedResourceBundle.getString("feedbackErrorMessage"));
    String feedbackLenghtError=(LocalizationUtil.localizedResourceBundle.getString("feedbackLenghtError"));
    String sumError =LocalizationUtil.localizedResourceBundle.getString("sumError");
    String sumLenghtError=(LocalizationUtil.localizedResourceBundle.getString("sumLenghtError"));
     String intErrorMessage =(LocalizationUtil.localizedResourceBundle.getString("intErrorMessage"));
     String nameError=(LocalizationUtil.localizedResourceBundle.getString("nameError"));
     String noMoreMessages=(LocalizationUtil.localizedResourceBundle.getString("noMoreMessages"));
       String nullValueError=(LocalizationUtil.localizedResourceBundle.getString("nullValueError"));
       String userAddedMessage=(LocalizationUtil.localizedResourceBundle.getString("userAddedMessage"));
    public AdminForm(Admin admin) {

        this.admin = admin;
        initComponents();
        onOffPanel(false, false, false, false, false, false, false, false, false);
        onOffComponents(false, false, false, false, false, false, false, false, false);
        SetSelectedLenguge();

    }

    /**
     * changes the languages of the text
     */
    private void SetSelectedLenguge() {
       btnAddFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("btnAddFeedback"));
        btnAddNewUser.setText(LocalizationUtil.localizedResourceBundle.getString("btnAddNewUser"));
        btnAddService.setText(LocalizationUtil.localizedResourceBundle.getString("btnAddService"));
        btnAddTheServiceGuy.setText(LocalizationUtil.localizedResourceBundle.getString("btnAddTheServiceGuy"));
        btnAddUser.setText(LocalizationUtil.localizedResourceBundle.getString("btnAddUser"));
       btnDeleteService.setText(LocalizationUtil.localizedResourceBundle.getString("btnDeleteService"));
       btnDeleteTheUser.setText(LocalizationUtil.localizedResourceBundle.getString("btnDeleteTheUser"));
        btnMakePaymnet.setText(LocalizationUtil.localizedResourceBundle.getString("btnMakePaymnet"));
        btnMakeTheOrder.setText(LocalizationUtil.localizedResourceBundle.getString("btnMakeTheOrder"));
        btnOrder.setText(LocalizationUtil.localizedResourceBundle.getString("btnOrder"));
        btnPay.setText(LocalizationUtil.localizedResourceBundle.getString("btnPay"));
        btnReadMessage.setText(LocalizationUtil.localizedResourceBundle.getString("btnReadMessage"));
        btnSendMassege.setText(LocalizationUtil.localizedResourceBundle.getString("btnSendMassege"));
        btnShowAllUsers.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowAllUsers"));
        btnShowMessages.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowMessages"));
        btnShowSerive.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowSerive"));
        btnShowUserById.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowUserById"));
        btnUserManagemant.setText(LocalizationUtil.localizedResourceBundle.getString("btnUserManagemant"));
        btnViewAllPayments.setText(LocalizationUtil.localizedResourceBundle.getString("btnViewAllPayments"));
        btnViewPayments.setText(LocalizationUtil.localizedResourceBundle.getString("btnViewPayments"));
        btnViewWhoNotPayed.setText(LocalizationUtil.localizedResourceBundle.getString("btnViewWhoNotPayed"));
        btnViewWhoPayd.setText(LocalizationUtil.localizedResourceBundle.getString("btnViewWhoPayd"));
        lblApartmantId.setText(LocalizationUtil.localizedResourceBundle.getString("lblApartmantId"));
        lblCommant.setText(LocalizationUtil.localizedResourceBundle.getString("lblCommant"));
        lblDeleteService.setText(LocalizationUtil.localizedResourceBundle.getString("lblDeleteService"));
        lblEddNewService.setText(LocalizationUtil.localizedResourceBundle.getString("lblEddNewService"));
        lblEnteNewUserDetails.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnteNewUserDetails"));
        lblEnterEmail.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterEmail"));
        lblEnterFirstName.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterFirstName"));
        lblEnterID.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterID"));
        lblEnterIdOfServiceToDelete.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterIdOfServiceToDelete"));
        lblEnterIdOfServieToShowFeeedback.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterIdOfServieToShowFeeedback"));
        lblEnterLastName.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterLastName"));
        lblEnterPassword.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterPassword"));
        lblEnterPhoneNumber.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterPhoneNumber"));
        lblEnterServiceGuyFirstName.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterServiceGuyFirstName"));
        lblEnterServiceGuyId.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterServiceGuyId"));
        lblEnterServiceGuyLastName.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterServiceGuyLastName"));
        lblEnterServiceType.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterServiceType"));
        lblEnterServieId.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterServieId"));
        lblEnterUserName.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterUserName"));
        lblEnterUserToDelete.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterUserToDelete"));
        lblEnterWorkDone.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterWorkDone"));
        lblSentTo.setText(LocalizationUtil.localizedResourceBundle.getString("lblSentTo"));
        lblServiceType.setText(LocalizationUtil.localizedResourceBundle.getString("lblServiceType"));
        lblSum.setText(LocalizationUtil.localizedResourceBundle.getString("lblSum"));
        lblUserById.setText(LocalizationUtil.localizedResourceBundle.getString("lblUserById"));
        btnSend.setText(LocalizationUtil.localizedResourceBundle.getString("btnSend"));
        btnShowTheFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("btnShowTheFeedback"));
        lblEddFeedbackAbutAService.setText(LocalizationUtil.localizedResourceBundle.getString("lblEddFeedbackAbutAService"));
lblEnterFeddbackId.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterFeddbackId"));
lblEnterRatingOfService.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterRatingOfService"));
lblEnterPriveTaken.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterPriveTaken"));
lblEnterWorkDone.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterWorkDone"));
lblEnterFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("lblEnterFeedback"));
btnSendFeedback.setText(LocalizationUtil.localizedResourceBundle.getString("btnSendFeedback"));

    }

    /**
     * checking if the values from input is number and in the size of integer if yes
     * returns true
     *
     * @param number
     * @return
     */
    private boolean isInteger(String number) {
        if (number.matches("[0-9]+") == false || number.length() > 9) {
            JOptionPane.showMessageDialog(null, intErrorMessage, idErrorTitle, JOptionPane.ERROR_MESSAGE);
            return false;
        }
        return true;
    }

    /**
     * checks if the id is valid if yes return true
     *
     * @param id
     * @return
     */
    private boolean isValidId(String id) {
        if (isInteger(id)) {
            if (id.length() == 9) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, idLenghtError, idErrorTitle, JOptionPane.ERROR_MESSAGE);
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

        jplMainPannel = new javax.swing.JPanel();
        btnSendMassege = new javax.swing.JButton();
        btnReadMessage = new javax.swing.JButton();
        btnMakePaymnet = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnViewPayments = new javax.swing.JButton();
        btnAddUser = new javax.swing.JButton();
        btnAddService = new javax.swing.JButton();
        jpnSendMassege = new javax.swing.JPanel();
        btnSend = new javax.swing.JButton();
        lblSentTo = new javax.swing.JLabel();
        jpnReadMessages = new javax.swing.JPanel();
        btnShowMessages = new javax.swing.JButton();
        jpnMakePayment = new javax.swing.JPanel();
        jpnViewPayments = new javax.swing.JPanel();
        btnViewWhoPayd = new javax.swing.JButton();
        btnViewWhoNotPayed = new javax.swing.JButton();
        btnViewAllPayments = new javax.swing.JButton();
        jpnService = new javax.swing.JPanel();
        btnShowSerive = new javax.swing.JButton();
        jpnAddUser = new javax.swing.JPanel();
        lblEnterFirstName = new javax.swing.JLabel();
        lblEnterLastName = new javax.swing.JLabel();
        lblEnterEmail = new javax.swing.JLabel();
        btnAddNewUser = new javax.swing.JButton();
        lblEnteNewUserDetails = new javax.swing.JLabel();
        lblEnterUserToDelete = new javax.swing.JLabel();
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
        jpnUserManagment = new javax.swing.JPanel();
        scrollUserManagment = new javax.swing.JScrollPane();
        txtUserManagment = new javax.swing.JTextPane();
        btnShowUserById = new javax.swing.JButton();
        lblUserById = new javax.swing.JLabel();
        btnShowAllUsers = new javax.swing.JButton();
        jpnAddFeedback = new javax.swing.JPanel();
        lblEddFeedbackAbutAService = new javax.swing.JLabel();
        lblEnterFeddbackId = new javax.swing.JLabel();
        lblEnterRatingOfService = new javax.swing.JLabel();
        lblEnterPriveTaken = new javax.swing.JLabel();
        txtEnterPriceTaken = new javax.swing.JTextField();
        lblEnterWorkDone = new javax.swing.JLabel();
        txtEnterWorkTypeDone = new javax.swing.JTextField();
        scrollEnterFeedback = new javax.swing.JScrollPane();
        txtEnterFeedback = new javax.swing.JTextArea();
        lblEnterFeedback = new javax.swing.JLabel();
        btnSendFeedback = new javax.swing.JButton();
        compAddRating = new javax.swing.JComboBox();
        compIdOfTheServicToAddFeedBack = new javax.swing.JComboBox();
        combIdOfUserToDisplay = new javax.swing.JComboBox();
        lblEnterServiceType = new javax.swing.JLabel();
        txtEnterServiceName = new javax.swing.JTextField();
        lblEnterServiceGuyFirstName = new javax.swing.JLabel();
        lblEnterServiceGuyLastName = new javax.swing.JLabel();
        lblEnterServiceGuyId = new javax.swing.JLabel();
        txtEnterServiceGuyFirsttName = new javax.swing.JTextField();
        txtEnterServiceGuyLastName = new javax.swing.JTextField();
        txtEnterServiceGuyId = new javax.swing.JTextField();
        btnAddTheServiceGuy = new javax.swing.JButton();
        lblDeleteService = new javax.swing.JLabel();
        lblEnterIdOfServiceToDelete = new javax.swing.JLabel();
        btnDeleteService = new javax.swing.JButton();
        combIdOfServieToDelete = new javax.swing.JComboBox();
        lblApartmantId = new javax.swing.JLabel();
        txtApartment = new javax.swing.JTextField();
        combIdOfUserToDelete = new javax.swing.JComboBox();
        lblEnterServieId = new javax.swing.JLabel();
        btnMakeTheOrder = new javax.swing.JButton();
        lblServiceType = new javax.swing.JLabel();
        txtServieType = new javax.swing.JTextField();
        scrollShowSerivices = new javax.swing.JScrollPane();
        txtShowServices = new javax.swing.JTextArea();
        lblEnterIdOfServieToShowFeeedback = new javax.swing.JLabel();
        btnShowTheFeedback = new javax.swing.JButton();
        combIdOfServiceToSeeFeedback = new javax.swing.JComboBox();
        compIdOfTheServicToOrder = new javax.swing.JComboBox();
        scrollViewPaymenys = new javax.swing.JScrollPane();
        txtViewPayments = new javax.swing.JTextArea();
        txtSum = new javax.swing.JTextField();
        btnPay = new javax.swing.JButton();
        lblSum = new javax.swing.JLabel();
        lblCommant = new javax.swing.JLabel();
        scrollPaymentCommant = new javax.swing.JScrollPane();
        txtPaymentCommant = new javax.swing.JTextArea();
        scrollShowMessage = new javax.swing.JScrollPane();
        txtShowMessage = new javax.swing.JTextArea();
        scrollWriteMessage = new javax.swing.JScrollPane();
        txtWriteMessage = new javax.swing.JTextArea();
        combSendTo = new javax.swing.JComboBox();
        btnUserManagemant = new javax.swing.JButton();
        btnAddFeedback = new javax.swing.JButton();
        javax.swing.JLabel BackgrundImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(950, 600));
        setResizable(false);
        getContentPane().setLayout(null);

        jplMainPannel.setMinimumSize(new java.awt.Dimension(950, 550));
        jplMainPannel.setPreferredSize(new java.awt.Dimension(950, 550));
        jplMainPannel.setLayout(null);

        btnSendMassege.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSendMassege.setText("send massege");
        btnSendMassege.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendMassege.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendMassegeActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnSendMassege);
        btnSendMassege.setBounds(47, 42, 270, 43);

        btnReadMessage.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnReadMessage.setText("read messeges");
        btnReadMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnReadMessage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadMessageActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnReadMessage);
        btnReadMessage.setBounds(47, 103, 270, 44);

        btnMakePaymnet.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMakePaymnet.setText("make payment");
        btnMakePaymnet.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakePaymnet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakePaymnetActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnMakePaymnet);
        btnMakePaymnet.setBounds(47, 165, 270, 48);

        btnOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnOrder.setText("order  maintinance");
        btnOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnOrder);
        btnOrder.setBounds(47, 231, 270, 46);

        btnViewPayments.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnViewPayments.setText("view payments");
        btnViewPayments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewPaymentsActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnViewPayments);
        btnViewPayments.setBounds(47, 295, 270, 45);

        btnAddUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddUser.setText("add/delete user");
        btnAddUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddUserActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnAddUser);
        btnAddUser.setBounds(47, 358, 270, 41);

        btnAddService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddService.setText("add/delete service");
        btnAddService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddServiceActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnAddService);
        btnAddService.setBounds(47, 417, 270, 39);

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
        btnSend.setBounds(38, 261, 120, 50);

        lblSentTo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSentTo.setText("send to");
        jpnSendMassege.add(lblSentTo);
        lblSentTo.setBounds(19, 20, 100, 22);

        jpnReadMessages.setBackground(new java.awt.Color(255, 102, 51));
        jpnReadMessages.setOpaque(false);
        jpnReadMessages.setLayout(null);

        btnShowMessages.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowMessages.setText("show messeges");
        btnShowMessages.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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

        btnViewWhoPayd.setText("payd");
        btnViewWhoPayd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewWhoPayd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewWhoPaydActionPerformed(evt);
            }
        });
        jpnViewPayments.add(btnViewWhoPayd);
        btnViewWhoPayd.setBounds(474, 85, 150, 41);

        btnViewWhoNotPayed.setText("ramining");
        btnViewWhoNotPayed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewWhoNotPayed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewWhoNotPayedActionPerformed(evt);
            }
        });
        jpnViewPayments.add(btnViewWhoNotPayed);
        btnViewWhoNotPayed.setBounds(474, 144, 150, 40);

        btnViewAllPayments.setText("All");
        btnViewAllPayments.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewAllPayments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewAllPaymentsActionPerformed(evt);
            }
        });
        jpnViewPayments.add(btnViewAllPayments);
        btnViewAllPayments.setBounds(474, 211, 150, 40);

        jpnService.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jpnService.setOpaque(false);
        jpnService.setLayout(null);

        btnShowSerive.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowSerive.setText("show list");
        btnShowSerive.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowSerive.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowSeriveActionPerformed(evt);
            }
        });
        jpnService.add(btnShowSerive);
        btnShowSerive.setBounds(330, 280, 130, 30);

        jpnAddUser.setOpaque(false);
        jpnAddUser.setLayout(null);

        lblEnterFirstName.setText("firstname");
        jpnAddUser.add(lblEnterFirstName);
        lblEnterFirstName.setBounds(10, 110, 100, 20);

        lblEnterLastName.setText("lastname");
        jpnAddUser.add(lblEnterLastName);
        lblEnterLastName.setBounds(10, 150, 100, 16);

        lblEnterEmail.setText("email");
        jpnAddUser.add(lblEnterEmail);
        lblEnterEmail.setBounds(10, 190, 100, 16);

        btnAddNewUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddNewUser.setText("add");
        btnAddNewUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddNewUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddNewUserActionPerformed(evt);
            }
        });
        jpnAddUser.add(btnAddNewUser);
        btnAddNewUser.setBounds(140, 380, 200, 40);

        lblEnteNewUserDetails.setLabelFor(jpnAddUser);
        lblEnteNewUserDetails.setText("Ente new user details");
        jpnAddUser.add(lblEnteNewUserDetails);
        lblEnteNewUserDetails.setBounds(140, 40, 190, 16);

        lblEnterUserToDelete.setText("enter the id of the user to delete");
        jpnAddUser.add(lblEnterUserToDelete);
        lblEnterUserToDelete.setBounds(360, 60, 240, 16);

        btnDeleteTheUser.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteTheUser.setText("delete");
        btnDeleteTheUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteTheUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteTheUserActionPerformed(evt);
            }
        });
        jpnAddUser.add(btnDeleteTheUser);
        btnDeleteTheUser.setBounds(370, 130, 200, 31);
        jpnAddUser.add(txtEnterUserName);
        txtEnterUserName.setBounds(140, 270, 130, 22);

        lblEnterUserName.setText("username");
        jpnAddUser.add(lblEnterUserName);
        lblEnterUserName.setBounds(10, 270, 90, 16);

        lblEnterPhoneNumber.setText("phone number");
        jpnAddUser.add(lblEnterPhoneNumber);
        lblEnterPhoneNumber.setBounds(10, 230, 130, 20);
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
        lblEnterPassword.setBounds(10, 310, 100, 16);

        jpnAddService.setOpaque(false);
        jpnAddService.setLayout(null);

        lblEddNewService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEddNewService.setText("edd a new service");
        jpnAddService.add(lblEddNewService);
        lblEddNewService.setBounds(40, 40, 220, 22);

        jpnUserManagment.setOpaque(false);
        jpnUserManagment.setLayout(null);

        txtUserManagment.setEditable(false);
        scrollUserManagment.setViewportView(txtUserManagment);

        jpnUserManagment.add(scrollUserManagment);
        scrollUserManagment.setBounds(40, 80, 560, 220);

        btnShowUserById.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowUserById.setText("show");
        btnShowUserById.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowUserById.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowUserByIdActionPerformed(evt);
            }
        });
        jpnUserManagment.add(btnShowUserById);
        btnShowUserById.setBounds(40, 380, 210, 40);

        lblUserById.setText("show suder by id");
        lblUserById.setFocusCycleRoot(true);
        jpnUserManagment.add(lblUserById);
        lblUserById.setBounds(40, 310, 270, 16);

        btnShowAllUsers.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowAllUsers.setText("show all users");
        btnShowAllUsers.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowAllUsers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowAllUsersActionPerformed(evt);
            }
        });
        jpnUserManagment.add(btnShowAllUsers);
        btnShowAllUsers.setBounds(400, 380, 200, 40);

        jpnAddFeedback.setOpaque(false);
        jpnAddFeedback.setLayout(null);

        lblEddFeedbackAbutAService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblEddFeedbackAbutAService.setText("add a feedback abut a service");
        jpnAddFeedback.add(lblEddFeedbackAbutAService);
        lblEddFeedbackAbutAService.setBounds(50, 40, 240, 20);

        lblEnterFeddbackId.setText("id fo service");
        jpnAddFeedback.add(lblEnterFeddbackId);
        lblEnterFeddbackId.setBounds(50, 80, 140, 16);

        lblEnterRatingOfService.setText("reating(0-10)");
        jpnAddFeedback.add(lblEnterRatingOfService);
        lblEnterRatingOfService.setBounds(230, 80, 120, 16);

        lblEnterPriveTaken.setText("price taken");
        jpnAddFeedback.add(lblEnterPriveTaken);
        lblEnterPriveTaken.setBounds(400, 80, 130, 16);
        jpnAddFeedback.add(txtEnterPriceTaken);
        txtEnterPriceTaken.setBounds(400, 110, 130, 22);

        lblEnterWorkDone.setText("enter the work type");
        jpnAddFeedback.add(lblEnterWorkDone);
        lblEnterWorkDone.setBounds(50, 150, 170, 16);
        jpnAddFeedback.add(txtEnterWorkTypeDone);
        txtEnterWorkTypeDone.setBounds(40, 180, 190, 22);

        txtEnterFeedback.setColumns(20);
        txtEnterFeedback.setRows(5);
        scrollEnterFeedback.setViewportView(txtEnterFeedback);

        jpnAddFeedback.add(scrollEnterFeedback);
        scrollEnterFeedback.setBounds(50, 240, 430, 120);

        lblEnterFeedback.setText("enter feedback");
        jpnAddFeedback.add(lblEnterFeedback);
        lblEnterFeedback.setBounds(50, 210, 160, 16);

        btnSendFeedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSendFeedback.setText("send feedback");
        btnSendFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSendFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendFeedbackActionPerformed(evt);
            }
        });
        jpnAddFeedback.add(btnSendFeedback);
        btnSendFeedback.setBounds(50, 380, 230, 40);

        compAddRating.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jpnAddFeedback.add(compAddRating);
        compAddRating.setBounds(210, 110, 120, 20);

        jpnAddFeedback.add(compIdOfTheServicToAddFeedBack);
        compIdOfTheServicToAddFeedBack.setBounds(50, 110, 120, 20);

        jpnUserManagment.add(jpnAddFeedback);
        jpnAddFeedback.setBounds(0, 0, 640, 480);

        jpnUserManagment.add(combIdOfUserToDisplay);
        combIdOfUserToDisplay.setBounds(30, 340, 120, 22);

        jpnAddService.add(jpnUserManagment);
        jpnUserManagment.setBounds(0, 0, 630, 480);

        lblEnterServiceType.setText("enter service name");
        jpnAddService.add(lblEnterServiceType);
        lblEnterServiceType.setBounds(30, 90, 170, 30);
        jpnAddService.add(txtEnterServiceName);
        txtEnterServiceName.setBounds(30, 130, 250, 20);

        lblEnterServiceGuyFirstName.setText("firstname");
        jpnAddService.add(lblEnterServiceGuyFirstName);
        lblEnterServiceGuyFirstName.setBounds(30, 160, 130, 30);

        lblEnterServiceGuyLastName.setText("lastname");
        jpnAddService.add(lblEnterServiceGuyLastName);
        lblEnterServiceGuyLastName.setBounds(30, 230, 230, 16);

        lblEnterServiceGuyId.setText("ID");
        jpnAddService.add(lblEnterServiceGuyId);
        lblEnterServiceGuyId.setBounds(30, 300, 120, 16);
        jpnAddService.add(txtEnterServiceGuyFirsttName);
        txtEnterServiceGuyFirsttName.setBounds(30, 190, 120, 22);
        jpnAddService.add(txtEnterServiceGuyLastName);
        txtEnterServiceGuyLastName.setBounds(30, 260, 120, 22);
        jpnAddService.add(txtEnterServiceGuyId);
        txtEnterServiceGuyId.setBounds(30, 330, 130, 22);

        btnAddTheServiceGuy.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddTheServiceGuy.setText("add");
        btnAddTheServiceGuy.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddTheServiceGuy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddTheServiceGuyActionPerformed(evt);
            }
        });
        jpnAddService.add(btnAddTheServiceGuy);
        btnAddTheServiceGuy.setBounds(30, 375, 240, 40);

        lblDeleteService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblDeleteService.setText("delete a service");
        jpnAddService.add(lblDeleteService);
        lblDeleteService.setBounds(380, 46, 180, 20);

        lblEnterIdOfServiceToDelete.setText("ender id of servic to delete");
        jpnAddService.add(lblEnterIdOfServiceToDelete);
        lblEnterIdOfServiceToDelete.setBounds(380, 90, 220, 16);

        btnDeleteService.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnDeleteService.setText("delete");
        btnDeleteService.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnDeleteService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteServiceActionPerformed(evt);
            }
        });
        jpnAddService.add(btnDeleteService);
        btnDeleteService.setBounds(380, 160, 200, 40);

        jpnAddService.add(combIdOfServieToDelete);
        combIdOfServieToDelete.setBounds(380, 120, 160, 22);

        jpnAddUser.add(jpnAddService);
        jpnAddService.setBounds(0, 0, 630, 480);

        lblApartmantId.setText("apartment");
        jpnAddUser.add(lblApartmantId);
        lblApartmantId.setBounds(9, 350, 90, 16);

        txtApartment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtApartmentActionPerformed(evt);
            }
        });
        jpnAddUser.add(txtApartment);
        txtApartment.setBounds(140, 350, 130, 22);

        jpnAddUser.add(combIdOfUserToDelete);
        combIdOfUserToDelete.setBounds(360, 90, 230, 22);

        jpnService.add(jpnAddUser);
        jpnAddUser.setBounds(0, 0, 630, 470);

        lblEnterServieId.setText("enter the id of servie you want to order");
        jpnService.add(lblEnterServieId);
        lblEnterServieId.setBounds(40, 310, 240, 30);

        btnMakeTheOrder.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnMakeTheOrder.setText("order");
        btnMakeTheOrder.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMakeTheOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeTheOrderActionPerformed(evt);
            }
        });
        jpnService.add(btnMakeTheOrder);
        btnMakeTheOrder.setBounds(410, 380, 170, 30);

        lblServiceType.setText("Service type");
        jpnService.add(lblServiceType);
        lblServiceType.setBounds(290, 320, 80, 16);
        jpnService.add(txtServieType);
        txtServieType.setBounds(270, 340, 100, 22);

        txtShowServices.setEditable(false);
        txtShowServices.setColumns(20);
        txtShowServices.setRows(5);
        scrollShowSerivices.setViewportView(txtShowServices);

        jpnService.add(scrollShowSerivices);
        scrollShowSerivices.setBounds(30, 50, 300, 260);

        lblEnterIdOfServieToShowFeeedback.setText("enter id of service to view feedback");
        jpnService.add(lblEnterIdOfServieToShowFeeedback);
        lblEnterIdOfServieToShowFeeedback.setBounds(370, 50, 220, 16);

        btnShowTheFeedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnShowTheFeedback.setText("show feedback");
        btnShowTheFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnShowTheFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnShowTheFeedbackActionPerformed(evt);
            }
        });
        jpnService.add(btnShowTheFeedback);
        btnShowTheFeedback.setBounds(370, 120, 200, 30);

        jpnService.add(combIdOfServiceToSeeFeedback);
        combIdOfServiceToSeeFeedback.setBounds(380, 80, 200, 22);

        jpnService.add(compIdOfTheServicToOrder);
        compIdOfTheServicToOrder.setBounds(60, 340, 120, 20);

        jpnViewPayments.add(jpnService);
        jpnService.setBounds(0, 0, 620, 450);

        txtViewPayments.setEditable(false);
        txtViewPayments.setColumns(20);
        txtViewPayments.setRows(5);
        scrollViewPaymenys.setViewportView(txtViewPayments);

        jpnViewPayments.add(scrollViewPaymenys);
        scrollViewPaymenys.setBounds(30, 50, 430, 330);

        jpnMakePayment.add(jpnViewPayments);
        jpnViewPayments.setBounds(0, 0, 630, 480);
        jpnMakePayment.add(txtSum);
        txtSum.setBounds(50, 94, 125, 22);

        btnPay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPay.setText("pay");
        btnPay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });
        jpnMakePayment.add(btnPay);
        btnPay.setBounds(50, 257, 149, 40);

        lblSum.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblSum.setText("enter sum");
        jpnMakePayment.add(lblSum);
        lblSum.setBounds(50, 70, 110, 16);

        lblCommant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblCommant.setText("commant");
        jpnMakePayment.add(lblCommant);
        lblCommant.setBounds(50, 120, 100, 22);

        txtPaymentCommant.setColumns(20);
        txtPaymentCommant.setRows(5);
        scrollPaymentCommant.setViewportView(txtPaymentCommant);

        jpnMakePayment.add(scrollPaymentCommant);
        scrollPaymentCommant.setBounds(40, 150, 310, 100);

        jpnReadMessages.add(jpnMakePayment);
        jpnMakePayment.setBounds(0, 0, 630, 470);

        txtShowMessage.setEditable(false);
        txtShowMessage.setColumns(20);
        txtShowMessage.setRows(5);
        scrollShowMessage.setViewportView(txtShowMessage);

        jpnReadMessages.add(scrollShowMessage);
        scrollShowMessage.setBounds(80, 70, 390, 180);

        jpnSendMassege.add(jpnReadMessages);
        jpnReadMessages.setBounds(0, 0, 630, 480);

        txtWriteMessage.setColumns(20);
        txtWriteMessage.setRows(5);
        scrollWriteMessage.setViewportView(txtWriteMessage);

        jpnSendMassege.add(scrollWriteMessage);
        scrollWriteMessage.setBounds(50, 70, 410, 170);

        jpnSendMassege.add(combSendTo);
        combSendTo.setBounds(120, 20, 110, 22);

        jplMainPannel.add(jpnSendMassege);
        jpnSendMassege.setBounds(320, 0, 630, 480);

        btnUserManagemant.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnUserManagemant.setText("user managment");
        btnUserManagemant.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnUserManagemant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserManagemantActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnUserManagemant);
        btnUserManagemant.setBounds(50, 470, 270, 40);

        btnAddFeedback.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnAddFeedback.setText("add feedback");
        btnAddFeedback.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFeedbackActionPerformed(evt);
            }
        });
        jplMainPannel.add(btnAddFeedback);
        btnAddFeedback.setBounds(50, 520, 270, 40);

        BackgrundImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/adminBackgrund.png"))); // NOI18N
        jplMainPannel.add(BackgrundImage);
        BackgrundImage.setBounds(0, 0, 960, 570);

        getContentPane().add(jplMainPannel);
        jplMainPannel.setBounds(0, 0, 950, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
     * when button send message clicked
     *
     * @param evt
     */
    private void btnSendMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMassegeActionPerformed
        //set the needed components to disply.true
        onOffPanel(true, false, false, false, false, false, false, false, false);
        onOffComponents(true, false, false, false, false, false, false, false, false);

        //clear text from all fildes
        txtWriteMessage.setText(null);
        //create arry list of usernames
        ArrayList<String> usernames = dataBase.listOfUsers();
        //fill the combo box whith the list
        for (String user : usernames) {
            combSendTo.addItem(user);
        }

    }//GEN-LAST:event_btnSendMassegeActionPerformed
    /**
     * what happens when show message button clicked
     */
    private void btnReadMessageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadMessageActionPerformed
        //set the needed components to disply.true
        onOffPanel(true, true, false, false, false, false, false, false, false);
        onOffComponents(false, true, false, false, false, false, false, false, false);

        //add all the messages from database  to messege list     
        messages = admin.RecieveMessage(admin.getUserName());

        //clear text from all fildes
        txtShowMessage.setText(null);
    }//GEN-LAST:event_btnReadMessageActionPerformed
    /**
     * what happens when make payment button clicked
     *
     * @param evt
     */
    private void btnMakePaymnetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakePaymnetActionPerformed
        //set the needed components to disply.true
        onOffPanel(true, true, true, false, false, false, false, false, false);
        onOffComponents(false, false, true, false, false, false, false, false, false);

        //clear text from all fildes
        txtSum.setText(null);
        txtPaymentCommant.setText(null);
    }//GEN-LAST:event_btnMakePaymnetActionPerformed
    /**
     * what happens when order maintenance button clicked
     *
     * @param evt
     */
    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        //set the needed components to disply.true
        onOffPanel(true, true, true, true, true, false, false, false, false);
        onOffComponents(false, false, false, false, true, false, false, false, false);

        //clear text from all fildes
        txtShowServices.setText(null);
        txtServieType.setText(null);

        //fill the list workers whith forkers from the database       
        workers = dataBase.showAllWorkers();

        //fiil listOfId whit id from database
        ArrayList<String> listOfId = dataBase.showWorkersId();

        //fill the comboboxes whith the ids of workers
        for (String id : listOfId) {
            combIdOfServiceToSeeFeedback.addItem(id);
            compIdOfTheServicToOrder.addItem(id);

        }

    }//GEN-LAST:event_btnOrderActionPerformed
    /**
     * what happens when view payment button clicked
     *
     * @param evt
     */
    private void btnViewPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewPaymentsActionPerformed
        //set the needed components to disply.true
        onOffPanel(true, true, true, true, false, false, false, false, false);
        onOffComponents(false, false, false, true, false, false, false, false, false);

        //add payments from database to payment list
        payments = admin.recievePayments(admin);
            
        //add all userr who not payed yet to list
        notPayed=(ArrayList<User>) admin.NotPayedYet();
        
//clear text from all fildes
        txtViewPayments.setText(null);
        txtShowServices.setText(null);
    }//GEN-LAST:event_btnViewPaymentsActionPerformed
    /**
     *when add/delete user button clicked
     *
     * @param evt
     */
    private void btnAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddUserActionPerformed
         //set the needed components to disply.true
        onOffPanel(true, true, true, true, true, true, false, false, false);        
        onOffComponents(false, false, false, false, false, true, false, false, false);
       
        //clear text from all fildes
        txtEnterPhoneNumber.setText(null);
        txtEnterLastName.setText(null);
        txtEnderName.setText(null);
        txtEnterEmail.setText(null);
        txtEnterPassword.setText(null);
        txtEnterUserName.setText(null);
        txtEnterID.setText(null);
        txtApartment.setText(null);
       
        //fill arraylist listOfId whith id from database
        ArrayList<String> listOfId = dataBase.setUsersId();

        //fill combobox whith id fom listOfId
        for (String id : listOfId) {
            combIdOfUserToDelete.addItem(id);
        }

    }//GEN-LAST:event_btnAddUserActionPerformed
    /**
     * when button add service clicked
     * @param evt
     */
    private void btnAddServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddServiceActionPerformed
           //set the needed components to disply.true
        onOffPanel(true, true, true, true, true, true, true, false, false);
        onOffComponents(false, false, false, false, false, false, true, false, false);
     
        //clear text from all fildes
        txtEnterServiceName.setText(null);
        txtEnterServiceGuyFirsttName.setText(null);
        txtEnterServiceGuyLastName.setText(null);
        txtEnterServiceGuyId.setText(null);
       
        // listOfId getting the id fo workers from db
        ArrayList<String> listOfId =dataBase.showWorkersId();
    
        //fiil combobox whith id from listOfId
        for (String id : listOfId) {
            combIdOfServieToDelete.addItem(id);
        }
    }//GEN-LAST:event_btnAddServiceActionPerformed
    /**
     *when button add new user  pressed the user added to database
     *
     * @param evt
     */
    private void btnAddNewUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddNewUserActionPerformed
        //set text to all fildes
        String firstName = txtEnterLastName.getText();
        String lastName = txtEnderName.getText();
        String password = txtEnterPassword.getText();
        String userName = txtEnterUserName.getText();
        String phoneNumber = "";
        String email = txtEnterEmail.getText();
        int apartmantId = 1;
        int id = 0;
       
        //flag in order to know if all valus that inserted are valid
        boolean flag = true;

            //create new resident object
        User resident = new Resident();
        
        
        //chking if valuse that inserted are valid if no than sen message to user to insert valid value
        if (!resident.setLastName(lastName)) {
            JOptionPane.showMessageDialog(null,nameError, idErrorTitle, JOptionPane.ERROR_MESSAGE);
            flag = false;
        }
        if (!resident.setFirstName(firstName)) {
            JOptionPane.showMessageDialog(null, nameError, idErrorTitle, JOptionPane.ERROR_MESSAGE);
            flag = false;
        }

        if (isValidId(txtEnterID.getText())) {
            id = Integer.parseInt(txtEnterID.getText());
        } else {
           
            flag = false;
        }
        if (!isInteger(txtApartment.getText())) {

            flag = false;
        } else {

            apartmantId = Integer.parseInt(txtApartment.getText());
        }
        if (!isInteger(txtEnterPhoneNumber.getText())) {

            flag = false;
        } else {
            phoneNumber = txtEnterPhoneNumber.getText();
        }
        
        //if all valus that inserted are valid addes user to database
        if (flag) {  
           
            String isDone=admin.addUser(resident);
         if(!isDone.equals("ok"))
         {
              JOptionPane.showMessageDialog(null,isDone,null, JOptionPane.INFORMATION_MESSAGE);
         }
         else
         {
             
              resident = new Resident(id, firstName, lastName, email, userName, password, admin.getBuildingAddress(), phoneNumber, "resident", apartmantId);
            //alerting the admin that the user has added
             JOptionPane.showMessageDialog(null,userAddedMessage,null, JOptionPane.INFORMATION_MESSAGE);
        //clear text from all fildes
        txtEnterPhoneNumber.setText(null);
        txtEnterLastName.setText(null);
        txtEnderName.setText(null);
        txtEnterEmail.setText(null);
        txtEnterPassword.setText(null);
        txtEnterUserName.setText(null);
        txtEnterID.setText(null);
        txtApartment.setText(null);
         }
        
        
        }

    }//GEN-LAST:event_btnAddNewUserActionPerformed
    /**
     * what happens when delete button  clicked
     *
     * @param evt
     */
    private void btnDeleteTheUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteTheUserActionPerformed
        int id = 0;
        id = Integer.parseInt((String) combIdOfUserToDelete.getSelectedItem());
       
        //send the chosen id to delete the user from database
        admin.deleteUser(id);
    }//GEN-LAST:event_btnDeleteTheUserActionPerformed
    /**
     * when send message button pressed sends the message
     *
     * @param evt
     */
    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed

        
        String text = txtWriteMessage.getText();
        String username = (String) combSendTo.getSelectedItem();
        Message message = new Message(text, admin.getUserName(), username);
            
        //adding the message to the database
        admin.SendMessage(message);
        
        //clear all textfilds
        txtWriteMessage.setText(null);
    }//GEN-LAST:event_btnSendActionPerformed
    /**
     * show your messages
     *
     * @param evt
     */
    private void btnShowMessagesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMessagesActionPerformed
       //flag that indicates if thers is no more messages      
        boolean flag = true;
       
        //if flag true
        if (flag) {          
          
            String allmesssages = "";

            //adding all messages from messages list lt a string to display on textbox
            for (Message m : messages) {
                allmesssages += m.toString();
           
            }        
            txtShowMessage.setText(allmesssages);
     
            flag = false;
            
            //when the is no moe messages alerting the user
        } else if (!flag) {
            JOptionPane.showMessageDialog(null, noMoreMessages, idErrorTitle, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnShowMessagesActionPerformed
    /**
     * show the  payments that payed
     *
     * @param evt
     */
    private void btnViewWhoPaydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewWhoPaydActionPerformed
        String paymentList = "";
       //adding payments from list payments to string  in order to dislay on textbox
        for (Payment p : payments) {
            paymentList += p.toString();
        }
        txtViewPayments.setText(paymentList);
    }//GEN-LAST:event_btnViewWhoPaydActionPerformed
    /**
     * show who not payed yet
     *
     * @param evt
     */
    private void btnViewWhoNotPayedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewWhoNotPayedActionPerformed
      
        
         String userWhoNotPayed = "";
       //addingusers who not payed from list notPayed to string  in order to dislay on textbox
        for (User notPay : notPayed) {
            userWhoNotPayed += notPayed.toString();
        }
        txtViewPayments.setText(userWhoNotPayed);
    }//GEN-LAST:event_btnViewWhoNotPayedActionPerformed
    /**
     * show all total payments 
     *
     * @param evt
     */
    private void btnViewAllPaymentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewAllPaymentsActionPerformed
      txtViewPayments.setText(Integer.toString((int)dataBase.showPaymentsAverage()));
    }//GEN-LAST:event_btnViewAllPaymentsActionPerformed
    /**
     * show all workers from the database
     *
     * @param evt
     */
    private void btnShowSeriveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowSeriveActionPerformed

        
        String workerList = "";
        //adding all workers to the string workerList to display on textbox
        for (ExternalWorker worker : workers) {
            workerList += worker.toString();
        }
        txtShowServices.setText(workerList);

    }//GEN-LAST:event_btnShowSeriveActionPerformed
    /**
     * order the maintenance
     *
     * @param evt
     */
    private void btnMakeTheOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeTheOrderActionPerformed

        txtShowServices.setText(null);
        String id = "";
        
        //flag that indecates iv vles insertert are valid
        boolean flag = false;

        id = (String) compIdOfTheServicToOrder.getSelectedItem();

       
        String type = txtServieType.getText();
      
        //if text fild is null alerting the user to rty again
        if (txtServieType.getText() == null) {
            JOptionPane.showMessageDialog(null, nullValueError, idErrorTitle, JOptionPane.ERROR_MESSAGE);
            flag = false;
        }
        
        //if evering is inserter propably add the order to the database
        if (flag) {
            Order order = new Order(admin.getUserName(), id, type);
            admin.order(order);
        }
        txtServieType.setText(null);

    }//GEN-LAST:event_btnMakeTheOrderActionPerformed
    /**
     * make the payment
     *
     * @param evt
     */
    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed
        int sum = 0;

        //if the sum that senterd is integer adds the payment to the database
        if (isInteger(txtSum.getText())) {
            sum = Integer.parseInt(txtSum.getText());
            String commant = txtPaymentCommant.getText();
            Payment pay = new Payment(admin.getUserName(), admin.getUserName(), commant, sum);
            admin.makePayment(pay);
        }
       
        //clear the text fild
        txtPaymentCommant.setText(null);
    }//GEN-LAST:event_btnPayActionPerformed
    /**
     * view your all users
     *
     * @param evt
     */
    private void btnUserManagemantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserManagemantActionPerformed
       //set the needed components to disply.true
        onOffPanel(true, true, true, true, true, true, true, true, false);
        onOffComponents(false, false, false, false, false, false, false, true, false);
        
        //add to list users all users from the database
        users = admin.showAllUser();
   
        //add to listOfId id off all user from the database ann adding it to combobox
        ArrayList<String> listOfId = dataBase.setUsersId();
        for (String id : listOfId) {
            combIdOfUserToDisplay.addItem(id);
        }
       
        //clear the textfild
        txtUserManagment.setText(null);
    }//GEN-LAST:event_btnUserManagemantActionPerformed
    /**
     * show  all  users
     *
     * @param evt
     */
    private void btnShowAllUsersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowAllUsersActionPerformed

        String allUsers = "";
       
        //add all users from list users to the string allUsers and displays them
            for (User user : users) {
                allUsers += user.toString();

            }
            txtUserManagment.setText(allUsers);
        
    }//GEN-LAST:event_btnShowAllUsersActionPerformed
    /**
     * show specipic user
     *
     * @param evt
     */
    private void btnShowUserByIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowUserByIdActionPerformed
        int id = 0;
        id = Integer.parseInt((String) combIdOfUserToDelete.getSelectedItem());            
        User user;      
    
        //send the selected id from combobox and display the user that chosen
        user = admin.showUserById(id);
        txtUserManagment.setText(user.toString());

    }//GEN-LAST:event_btnShowUserByIdActionPerformed

    private void txtApartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtApartmentActionPerformed

    }//GEN-LAST:event_txtApartmentActionPerformed

    /**
     * add a new service guy
     *
     * @param evt
     */
    private void btnAddTheServiceGuyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddTheServiceGuyActionPerformed
        String serviceName = txtEnterServiceName.getText();
        String firstName = txtEnterServiceGuyFirsttName.getText();
        String lastName = txtEnterServiceGuyLastName.getText();
        ExternalWorker externalWorker = new ExternalWorker();
        int id = 0;
       
        //flag that indecates if all values inserted properly
        boolean flag = true;
        
        //if vlue inserted wrong notifaying the user to try agiain
        if (isValidId(txtEnterServiceGuyId.getText())) {
            id = Integer.parseInt(txtEnterServiceGuyId.getText());
        } else {
            flag = false;
        }
        if (!externalWorker.setLastName(lastName)) {
            JOptionPane.showMessageDialog(null, nameError, idErrorTitle, JOptionPane.ERROR_MESSAGE);
            flag = false;
        }
        if (!externalWorker.setFirstName(firstName)) {
            JOptionPane.showMessageDialog(null, nameError, idErrorTitle, JOptionPane.ERROR_MESSAGE);
            flag = false;
        }

        //if all valuse inserted properly adding worker to database
        if (flag) {
              String isOk=  admin.addService(externalWorker);
              if(isOk.equals("ok")){
            externalWorker = new ExternalWorker(id, serviceName, firstName, lastName);
             //clear text from all fildes
        txtEnterServiceName.setText(null);
        txtEnterServiceGuyFirsttName.setText(null);
        txtEnterServiceGuyLastName.setText(null);
        txtEnterServiceGuyId.setText(null);
              }
              else
                   JOptionPane.showMessageDialog(null, isOk, null, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAddTheServiceGuyActionPerformed
    /**
     * delete a user from database
     *
     * @param evt
     */
    private void btnDeleteServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteServiceActionPerformed

        int id = 0;        
        id = Integer.parseInt((String) combIdOfServieToDelete.getSelectedItem());
        //sending the id that chosen to databse to delete the user
        admin.deleteServie(id);

    }//GEN-LAST:event_btnDeleteServiceActionPerformed
/**
 * show feedback abut a user from database
 * @param evt 
 */
    private void btnShowTheFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowTheFeedbackActionPerformed
        int id = 0;
        String workerFeedback = "";
      
        //get the id of worker to show feedback abut him
        id = Integer.parseInt((String) combIdOfServiceToSeeFeedback.getSelectedItem());

        //add all fedback abut the worker to list feedback and displays them
        feedbacks = admin.seeFeedback(id);
        for (Feedback feedback : feedbacks) {
            workerFeedback += feedback.toString();
        }
        txtShowServices.setText(workerFeedback);

    }//GEN-LAST:event_btnShowTheFeedbackActionPerformed
    /**
     * add a feedback abut a worker
     *
     * @param evt
     */
    private void btnAddFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFeedbackActionPerformed
        //set the needed components to disply.true
        onOffPanel(true, true, true, true, true, true, true, true, true);
        onOffComponents(false, false, false, false, false, false, false, false, true);
        
        //adding to listofId id of all vorkers and edding it to combobox 
        ArrayList<String> listofId = dataBase.showWorkersId();
        for (String id : listofId) {
            compIdOfTheServicToAddFeedBack.addItem(id);
        }
    }//GEN-LAST:event_btnAddFeedbackActionPerformed
/**
 * add the feedback to the database
 * @param evt 
 */
    private void btnSendFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendFeedbackActionPerformed
        int id = 0;
        int rating = 0;
        float price = 0;
        Feedback feedback = new Feedback();
       
       //flag that indecates if all values inserted properly
        boolean flag = true;
        id = Integer.parseInt((String) compIdOfTheServicToAddFeedBack.getSelectedItem());
        rating = Integer.parseInt((String) compAddRating.getSelectedItem());

         //if vlue inserted wrong notifaying the user to try agiain
        if (isInteger(txtEnterPriceTaken.getText())) {
            price = Integer.parseInt(txtEnterPriceTaken.getText());
        } else {
            flag = false;
        }
        
         //if all valuse inserted properly adding feedback to database
        if(flag){
        String feedbackText = txtEnterFeedback.getText();
        String workDone = txtEnterWorkTypeDone.getText();
        feedback = new Feedback(id, feedbackText, rating, workDone, price);
        admin.addFeedback(feedback);
        txtEnterPriceTaken.setText(null);
        txtEnterFeedback.setText(null);
        txtEnterWorkTypeDone.setText(null);
        }
    }//GEN-LAST:event_btnSendFeedbackActionPerformed
    /**
     * set visible the needed panels
     * @param sendMessage
     * @param readMessage
     * @param makePayment
     * @param viewPayment
     * @param service
     * @param addUser
     * @param addService
     */
    private void onOffPanel(boolean sendMessage, boolean readMessage,
            boolean makePayment, boolean viewPayment, boolean service, boolean addUser, boolean addService,
            boolean userManagemant, boolean feedback) {
        jpnSendMassege.setVisible(sendMessage);
        jpnReadMessages.setVisible(readMessage);
        jpnMakePayment.setVisible(makePayment);
        jpnViewPayments.setVisible(viewPayment);
        jpnService.setVisible(service);
        jpnAddUser.setVisible(addUser);
        jpnAddService.setVisible(addService);
        jpnUserManagment.setVisible(userManagemant);
        jpnAddFeedback.setVisible(feedback);

    }

    /** set visible the needed Components 
     *
     * @param sendMessage
     * @param readMessage
     * @param makePayment
     * @param viewPayment
     * @param service
     * @param addUser
     * @param addService
     */
    private void onOffComponents(boolean sendMessage, boolean readMessage,
            boolean makePayment, boolean viewPayment, boolean service, boolean addUser, boolean addService,
            boolean userManagemant, boolean feedback) {

        lblSentTo.setVisible(sendMessage);
        txtWriteMessage.setVisible(sendMessage);
        scrollWriteMessage.setVisible(sendMessage);
        btnSend.setVisible(sendMessage);
        combSendTo.setVisible(sendMessage);

        scrollShowMessage.setVisible(readMessage);
        txtShowMessage.setVisible(readMessage);
        btnShowMessages.setVisible(readMessage);

        txtSum.setVisible(makePayment);
        scrollPaymentCommant.setVisible(makePayment);
        txtPaymentCommant.setVisible(makePayment);
        lblSum.setVisible(makePayment);
        lblCommant.setVisible(makePayment);
        btnPay.setVisible(makePayment);

        txtViewPayments.setVisible(viewPayment);
        txtShowServices.setVisible(viewPayment);
        scrollViewPaymenys.setVisible(viewPayment);
        btnViewWhoPayd.setVisible(viewPayment);
        btnViewWhoNotPayed.setVisible(viewPayment);
        btnViewAllPayments.setVisible(viewPayment);

        txtShowServices.setVisible(service);
        scrollShowSerivices.setVisible(service);
        btnShowSerive.setVisible(service);
        lblEnterServieId.setVisible(service);
        lblServiceType.setVisible(service);
        txtServieType.setVisible(service);
        btnMakeTheOrder.setVisible(service);
        lblEnterIdOfServieToShowFeeedback.setVisible(service);

        btnShowTheFeedback.setVisible(service);
        combIdOfServiceToSeeFeedback.setVisible(service);
        compIdOfTheServicToOrder.setVisible(service);

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
        combIdOfUserToDelete.setVisible(addUser);
        btnAddNewUser.setVisible(addUser);
        btnDeleteTheUser.setVisible(addUser);

        lblEddNewService.setVisible(addService);
        lblEnterServiceType.setVisible(addService);
        lblEnterServiceGuyFirstName.setVisible(addService);
        lblEnterServiceGuyLastName.setVisible(addService);
        lblEnterServiceGuyId.setVisible(addService);
        btnAddTheServiceGuy.setVisible(addService);
        txtEnterServiceName.setVisible(addService);
        txtEnterServiceGuyFirsttName.setVisible(addService);
        txtEnterServiceGuyLastName.setVisible(addService);
        txtEnterServiceGuyId.setVisible(addService);
        lblDeleteService.setVisible(addService);
        lblEnterIdOfServiceToDelete.setVisible(addService);
        combIdOfServieToDelete.setVisible(addService);
        btnDeleteService.setVisible(addService);

        scrollUserManagment.setVisible(userManagemant);
        combIdOfUserToDisplay.setVisible(userManagemant);
        lblUserById.setVisible(userManagemant);
        btnShowUserById.setVisible(userManagemant);
        btnShowAllUsers.setVisible(userManagemant);
        txtUserManagment.setVisible(userManagemant);

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

    /**
     * @param args the command line arguments
     */
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
    private javax.swing.JButton btnAddFeedback;
    private javax.swing.JButton btnAddNewUser;
    private javax.swing.JButton btnAddService;
    private javax.swing.JButton btnAddTheServiceGuy;
    private javax.swing.JButton btnAddUser;
    private javax.swing.JButton btnDeleteService;
    private javax.swing.JButton btnDeleteTheUser;
    private javax.swing.JButton btnMakePaymnet;
    private javax.swing.JButton btnMakeTheOrder;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnReadMessage;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendFeedback;
    private javax.swing.JButton btnSendMassege;
    private javax.swing.JButton btnShowAllUsers;
    private javax.swing.JButton btnShowMessages;
    private javax.swing.JButton btnShowSerive;
    private javax.swing.JButton btnShowTheFeedback;
    private javax.swing.JButton btnShowUserById;
    private javax.swing.JButton btnUserManagemant;
    private javax.swing.JButton btnViewAllPayments;
    private javax.swing.JButton btnViewPayments;
    private javax.swing.JButton btnViewWhoNotPayed;
    private javax.swing.JButton btnViewWhoPayd;
    private javax.swing.JComboBox combIdOfServiceToSeeFeedback;
    private javax.swing.JComboBox combIdOfServieToDelete;
    private javax.swing.JComboBox combIdOfUserToDelete;
    private javax.swing.JComboBox combIdOfUserToDisplay;
    private javax.swing.JComboBox combSendTo;
    private javax.swing.JComboBox compAddRating;
    private javax.swing.JComboBox compIdOfTheServicToAddFeedBack;
    private javax.swing.JComboBox compIdOfTheServicToOrder;
    private javax.swing.JPanel jplMainPannel;
    private javax.swing.JPanel jpnAddFeedback;
    private javax.swing.JPanel jpnAddService;
    private javax.swing.JPanel jpnAddUser;
    private javax.swing.JPanel jpnMakePayment;
    private javax.swing.JPanel jpnReadMessages;
    private javax.swing.JPanel jpnSendMassege;
    private javax.swing.JPanel jpnService;
    private javax.swing.JPanel jpnUserManagment;
    private javax.swing.JPanel jpnViewPayments;
    private javax.swing.JLabel lblApartmantId;
    private javax.swing.JLabel lblCommant;
    private javax.swing.JLabel lblDeleteService;
    private javax.swing.JLabel lblEddFeedbackAbutAService;
    private javax.swing.JLabel lblEddNewService;
    private javax.swing.JLabel lblEnteNewUserDetails;
    private javax.swing.JLabel lblEnterEmail;
    private javax.swing.JLabel lblEnterFeddbackId;
    private javax.swing.JLabel lblEnterFeedback;
    private javax.swing.JLabel lblEnterFirstName;
    private javax.swing.JLabel lblEnterID;
    private javax.swing.JLabel lblEnterIdOfServiceToDelete;
    private javax.swing.JLabel lblEnterIdOfServieToShowFeeedback;
    private javax.swing.JLabel lblEnterLastName;
    private javax.swing.JLabel lblEnterPassword;
    private javax.swing.JLabel lblEnterPhoneNumber;
    private javax.swing.JLabel lblEnterPriveTaken;
    private javax.swing.JLabel lblEnterRatingOfService;
    private javax.swing.JLabel lblEnterServiceGuyFirstName;
    private javax.swing.JLabel lblEnterServiceGuyId;
    private javax.swing.JLabel lblEnterServiceGuyLastName;
    private javax.swing.JLabel lblEnterServiceType;
    private javax.swing.JLabel lblEnterServieId;
    private javax.swing.JLabel lblEnterUserName;
    private javax.swing.JLabel lblEnterUserToDelete;
    private javax.swing.JLabel lblEnterWorkDone;
    private javax.swing.JLabel lblSentTo;
    private javax.swing.JLabel lblServiceType;
    private javax.swing.JLabel lblSum;
    private javax.swing.JLabel lblUserById;
    private javax.swing.JScrollPane scrollEnterFeedback;
    private javax.swing.JScrollPane scrollPaymentCommant;
    private javax.swing.JScrollPane scrollShowMessage;
    private javax.swing.JScrollPane scrollShowSerivices;
    private javax.swing.JScrollPane scrollUserManagment;
    private javax.swing.JScrollPane scrollViewPaymenys;
    private javax.swing.JScrollPane scrollWriteMessage;
    private javax.swing.JTextField txtApartment;
    private javax.swing.JTextField txtEnderName;
    private javax.swing.JTextField txtEnterEmail;
    private javax.swing.JTextArea txtEnterFeedback;
    private javax.swing.JTextField txtEnterID;
    private javax.swing.JTextField txtEnterLastName;
    private javax.swing.JTextField txtEnterPassword;
    private javax.swing.JTextField txtEnterPhoneNumber;
    private javax.swing.JTextField txtEnterPriceTaken;
    private javax.swing.JTextField txtEnterServiceGuyFirsttName;
    private javax.swing.JTextField txtEnterServiceGuyId;
    private javax.swing.JTextField txtEnterServiceGuyLastName;
    private javax.swing.JTextField txtEnterServiceName;
    private javax.swing.JTextField txtEnterUserName;
    private javax.swing.JTextField txtEnterWorkTypeDone;
    private javax.swing.JTextArea txtPaymentCommant;
    private javax.swing.JTextField txtServieType;
    private javax.swing.JTextArea txtShowMessage;
    private javax.swing.JTextArea txtShowServices;
    private javax.swing.JTextField txtSum;
    private javax.swing.JTextPane txtUserManagment;
    private javax.swing.JTextArea txtViewPayments;
    private javax.swing.JTextArea txtWriteMessage;
    // End of variables declaration//GEN-END:variables
}
