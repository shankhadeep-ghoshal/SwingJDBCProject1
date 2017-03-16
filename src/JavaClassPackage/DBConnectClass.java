/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaClassPackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Echo01
 */
public class DBConnectClass {
    public static Connection Connection(String username,String password){
        Connection connection = null;
        String url1="jdbc:mysql://shankhadeepghoshaldb.c3tb4kwyyqq6.eu-central-1.rds.amazonaws.com:3306/EmployeeDB";
        String url2="jdbc:mysql://db4free.net:3307/dogpatch06";
       try{
           Class.forName("com.mysql.jdbc.Driver").newInstance();
           connection = DriverManager.getConnection(url2,username,password);
           return connection;
       }catch(SQLException | ClassNotFoundException | IllegalAccessException | InstantiationException e){
           e.printStackTrace();
           JOptionPane.showMessageDialog(null,e);
           return null;
       }
    }
    
}
