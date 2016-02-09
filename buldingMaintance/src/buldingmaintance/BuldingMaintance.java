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
      
      User user=new User();
      
      dataBase.AddUser(null);
    }
}
