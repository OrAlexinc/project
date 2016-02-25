/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import DB.DataBase;
import Languages.LocalizationUtil;
import buldingmaintance.*;
import java.util.Locale;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author Student
 */
public class LoginForm extends javax.swing.JFrame {
DataBase dataBase = DataBase.GetInstance();
    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
       setLeguge();
        //radio buttons to select lenuge
        rBtnEnglish.setActionCommand("en");
        rBtnHebrow.setActionCommand("iw");
        rBtnRussian.setActionCommand("ru");
       
        
    }
       //changes the langue ofbuttons
     private void setLeguge(){
       btnLogin.setText(LocalizationUtil.localizedResourceBundle.getString("btnLogin"));
                lblPassword.setText(LocalizationUtil.localizedResourceBundle.getString("lblPassword"));
                lblUsername.setText(LocalizationUtil.localizedResourceBundle.getString("lblUsername"));
                rBtnEnglish.setText(LocalizationUtil.localizedResourceBundle.getString("rBtnEnglish"));
                rBtnHebrow.setText(LocalizationUtil.localizedResourceBundle.getString("rBtnHebrow"));
                rBtnRussian.setText(LocalizationUtil.localizedResourceBundle.getString("rBtnRussian"));
                btnSelectLanguge.setText(LocalizationUtil.localizedResourceBundle.getString("btnSelectLanguge"));  
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupLanguage = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        btnLogin = new javax.swing.JButton();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        rBtnHebrow = new javax.swing.JRadioButton();
        rBtnEnglish = new javax.swing.JRadioButton();
        btnSelectLanguge = new javax.swing.JButton();
        rBtnRussian = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(500, 300));
        getContentPane().setLayout(null);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        lblUsername.setText(" User Name");

        lblPassword.setText("Password");

        grupLanguage.add(rBtnHebrow);
        rBtnHebrow.setText("Hebrew");
        rBtnHebrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rBtnHebrowActionPerformed(evt);
            }
        });

        grupLanguage.add(rBtnEnglish);
        rBtnEnglish.setText("English");

        btnSelectLanguge.setText("select");
        btnSelectLanguge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectLangugeActionPerformed(evt);
            }
        });

        grupLanguage.add(rBtnRussian);
        rBtnRussian.setText("Russian");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(rBtnHebrow)
                        .addGap(18, 18, 18)
                        .addComponent(rBtnRussian)
                        .addGap(28, 28, 28)
                        .addComponent(rBtnEnglish, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(btnSelectLanguge))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rBtnHebrow)
                    .addComponent(rBtnRussian)
                    .addComponent(rBtnEnglish)
                    .addComponent(btnSelectLanguge))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPassword)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(126, 126, 126))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(btnLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 420, 300);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
 * click on login button
 * @param evt 
 */
    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
    String username=txtUsername.getText();
    String password=txtPassword.getText();
 
    String connctionEror=(LocalizationUtil.localizedResourceBundle.getString("connctionEror"));
    String ErorType=(LocalizationUtil.localizedResourceBundle.getString("ErorType"));
     User user=dataBase.logIn(username, password);
     
     //if user not exist in database alering the user
  if(user==null){
         JOptionPane.showMessageDialog(null, connctionEror, ErorType , JOptionPane.INFORMATION_MESSAGE);
    }
  //if user is a resident romission creating resident object and creating userform 
  else if((user.getUserPermission()).equals("resident")){
    final Resident resident=new Resident(user.getID(),
       user.getFirstName(),user.getLastName(),
       user.getEmail(),user.getUserName(),user.getPassword(),
               user.getBuildingAddress(),
       user.getPhoneNumber(),user.getUserPermission(),
       user.getApartmentId());
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UserForm(resident).setVisible(true);
            }
           
       });
       
    }
  //if user permission is admin creating admin object and admin form
    else if((user.getUserPermission()).equals("admin")){
       final  Admin admin =new Admin(user.getID(),
       user.getFirstName(),user.getLastName(),
       user.getEmail(),user.getUserName(),user.getPassword(),
               user.getBuildingAddress(),
       user.getPhoneNumber(),user.getUserPermission(),
       user.getApartmentId());
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminForm(admin).setVisible(true);
            }
        });
        
    }
  
 
    
    }//GEN-LAST:event_btnLoginActionPerformed
 /**
  * when select langue button pressed
  * @param evt 
  */
    private void btnSelectLangugeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectLangugeActionPerformed
  // take the action command that was defined on the radio button
                String selectedLanguage = grupLanguage.getSelection().getActionCommand();             
                LocalizationUtil.localizedResourceBundle = ResourceBundle.getBundle("languages.uimessages", new Locale(selectedLanguage));
                setLeguge();
                
    }//GEN-LAST:event_btnSelectLangugeActionPerformed

    private void rBtnHebrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rBtnHebrowActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rBtnHebrowActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSelectLanguge;
    private javax.swing.ButtonGroup grupLanguage;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton rBtnEnglish;
    private javax.swing.JRadioButton rBtnHebrow;
    private javax.swing.JRadioButton rBtnRussian;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
