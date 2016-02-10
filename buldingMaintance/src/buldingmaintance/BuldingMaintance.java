/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package buldingmaintance;

import DB.DataBase;

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

        User user = new User(3, "ben", "gilad", "ben@gilad.com", "ben", "gilad", "ariel", "4", "user", 3);

        dataBase.AddUser(null);
    }
}
