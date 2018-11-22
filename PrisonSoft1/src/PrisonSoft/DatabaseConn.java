/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package  PrisonSoft; 
 
import ADMIN.*;
import java.sql.*;

/**
 *
 * @author vipin
 */


class MysqlConnect {

    public String dbName = "prisonsoft";
    public String userName = "root";
    public String password = "root1";
    public Connection con = null;
    public PreparedStatement p;
    public Statement stmt;
    public ResultSet rs;

    public void crearedatabase() {

        try {

            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/" + dbName, userName, password);
            System.out.println("success 1");

            System.out.println("Connected to the database");
            stmt = (Statement) con.createStatement();
            
            
            
        } catch (Exception e) {
            System.out.println("Error!!!");
        }

    }
}





public class DatabaseConn {

   
   

    public static void main(String[] args) {
        
        MysqlConnect ob = new MysqlConnect();
        ob.crearedatabase();
        // TODO code application logic here
        
    }
}
