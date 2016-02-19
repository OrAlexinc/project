/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import DB.DataBase;
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

        DataBase dataBase = DataBase.GetInstance();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
        //User user = new User(3, "ben", "gilad", "ben@gilad.com", "ben123", "gilad20", "ariel", "4", "user",5);

        //dataBase.AddUser(user);
    }
}
