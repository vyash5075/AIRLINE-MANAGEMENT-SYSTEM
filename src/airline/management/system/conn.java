/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package airline.management.system;
import java.sql.*;
/**
 *
 * @author yash verma
 */
public class conn {
    
    Connection c;
    Statement s;
    conn(){
        try{
            Class.forName("com.mysql.jdbc.Driver");   //driver register
            c=DriverManager.getConnection("jdbc:mysql:///project4","root","");    //create connection
            s=c.createStatement();
        }
        catch(Exception e){
            System.out.println(e);
            
        }
    }
}
