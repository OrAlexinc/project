/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

/**
 *
 * @author orgershov
 */
public class UserForm extends javax.swing.JFrame {

    /**
     * Creates new form UserForm
     */
    public UserForm() {
        initComponents();
        OnOff(false,false ,false,false,false,false); 
     
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
        txtWriteMassege = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jpnViewMassege = new javax.swing.JPanel();
        txtViewMassege = new javax.swing.JScrollPane();
        txtShowMessage = new javax.swing.JTextArea();
        jpnPayment = new javax.swing.JPanel();
        btnPay = new javax.swing.JButton();
        txtSum = new javax.swing.JTextField();
        lblSum = new javax.swing.JLabel();
        txtPaymentComannt = new javax.swing.JTextField();
        lblPaymentCommant = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnSendMassege = new javax.swing.JButton();
        btnViewMassege = new javax.swing.JButton();
        btnMakepayment = new javax.swing.JButton();
        btnMakeOrder = new javax.swing.JButton();
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

        btnSend.setText("send");
        btnSend.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSend.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSendActionPerformed(evt);
            }
        });
        jpnSendMassege.add(btnSend);
        btnSend.setBounds(469, 330, 150, 40);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        txtWriteMassege.setViewportView(jTextArea2);

        jpnSendMassege.add(txtWriteMassege);
        txtWriteMassege.setBounds(70, 80, 510, 250);

        jpnViewMassege.setBackground(java.awt.SystemColor.controlLtHighlight);
        jpnViewMassege.setMinimumSize(new java.awt.Dimension(690, 300));
        jpnViewMassege.setOpaque(false);
        jpnViewMassege.setLayout(null);

        txtShowMessage.setColumns(20);
        txtShowMessage.setRows(5);
        txtShowMessage.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtViewMassege.setViewportView(txtShowMessage);

        jpnViewMassege.add(txtViewMassege);
        txtViewMassege.setBounds(70, 80, 510, 260);

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
        btnShowMesseges.setBounds(100, 40, 170, 40);
        btnShowMesseges.getAccessibleContext().setAccessibleParent(jpnSendMassege);

        jpnPayment.setOpaque(false);
        jpnPayment.setLayout(null);

        btnPay.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnPay.setText("pay");
        jpnPayment.add(btnPay);
        btnPay.setBounds(70, 320, 110, 40);
        jpnPayment.add(txtSum);
        txtSum.setBounds(70, 130, 150, 30);

        lblSum.setBackground(new java.awt.Color(102, 204, 255));
        lblSum.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblSum.setText("enter sum");
        jpnPayment.add(lblSum);
        lblSum.setBounds(70, 100, 130, 22);
        jpnPayment.add(txtPaymentComannt);
        txtPaymentComannt.setBounds(70, 190, 310, 110);

        lblPaymentCommant.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        lblPaymentCommant.setText("Comant");
        jpnPayment.add(lblPaymentCommant);
        lblPaymentCommant.setBounds(70, 170, 140, 22);

        jPanel1.setOpaque(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 650, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        jpnPayment.add(jPanel1);
        jPanel1.setBounds(0, 10, 650, 480);

        jpnViewMassege.add(jpnPayment);
        jpnPayment.setBounds(0, 0, 640, 480);

        jpnSendMassege.add(jpnViewMassege);
        jpnViewMassege.setBounds(0, -10, 660, 480);
        jpnViewMassege.getAccessibleContext().setAccessibleParent(jpnMain);

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
        btnMakeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeOrderActionPerformed(evt);
            }
        });
        jpnMain.add(btnMakeOrder);
        btnMakeOrder.setBounds(50, 300, 190, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Gui/UFBackgrund.png"))); // NOI18N
        jpnMain.add(jLabel1);
        jLabel1.setBounds(0, 0, 960, 630);

        getContentPane().add(jpnMain);

        setBounds(250, 250, 957, 524);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSendMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendMassegeActionPerformed

         OnOff(true,false,false,true,false,false );
    }//GEN-LAST:event_btnSendMassegeActionPerformed

    private void btnViewMassegeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewMassegeActionPerformed
       
        OnOff(false,true ,false,true,true,false);
       
    }//GEN-LAST:event_btnViewMassegeActionPerformed

    private void btnShowMessegesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnShowMessegesActionPerformed
        jpnSendMassege.setVisible(false);
        jpnViewMassege.setVisible(false);      
    }//GEN-LAST:event_btnShowMessegesActionPerformed

    private void btnSendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSendActionPerformed
        jpnSendMassege.setVisible(false);
        jpnViewMassege.setVisible(false);
    }//GEN-LAST:event_btnSendActionPerformed

    private void btnMakepaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakepaymentActionPerformed
        OnOff(false,false ,true,true,true,true); 
    }//GEN-LAST:event_btnMakepaymentActionPerformed

    private void btnMakeOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeOrderActionPerformed
        OnOff(false,false ,false,false,false,false); 
    }//GEN-LAST:event_btnMakeOrderActionPerformed

    /**
     * @param args the command line arguments
     */
    public void OnOff(boolean Set1,boolean Set2,boolean Set3,boolean p1,boolean p2,boolean p3)
    {
        jpnSendMassege.setVisible(p1);
        btnSend.setVisible(Set1);
        txtWriteMassege.setVisible(Set1);
        jpnViewMassege.setVisible(p2);
        btnShowMesseges.setVisible(Set2);
        txtViewMassege.setVisible(Set2);
        jpnPayment.setVisible(p3);
        txtSum.setVisible(Set3);
        txtPaymentComannt.setVisible(Set3);
        btnPay.setVisible(Set3);
        
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
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserForm().setVisible(true);
            }
        });
      
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMakeOrder;
    private javax.swing.JButton btnMakepayment;
    private javax.swing.JButton btnPay;
    private javax.swing.JButton btnSend;
    private javax.swing.JButton btnSendMassege;
    private final javax.swing.JButton btnShowMesseges = new javax.swing.JButton();
    private javax.swing.JButton btnViewMassege;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JPanel jpnMain;
    private javax.swing.JPanel jpnPayment;
    private final javax.swing.JPanel jpnSendMassege = new javax.swing.JPanel();
    private javax.swing.JPanel jpnViewMassege;
    private javax.swing.JLabel lblPaymentCommant;
    private javax.swing.JLabel lblSum;
    private javax.swing.JTextField txtPaymentComannt;
    private javax.swing.JTextArea txtShowMessage;
    private javax.swing.JTextField txtSum;
    private javax.swing.JScrollPane txtViewMassege;
    private javax.swing.JScrollPane txtWriteMassege;
    // End of variables declaration//GEN-END:variables
}
