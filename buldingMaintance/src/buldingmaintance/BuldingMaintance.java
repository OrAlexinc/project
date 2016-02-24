/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;
import Gui.LoginForm;


/**
 *
 * @author Student
 */
public class BuldingMaintance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }
}
