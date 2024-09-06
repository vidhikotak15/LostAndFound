package com.example.login;

import javax.swing.plaf.nimbus.State;
import java.sql.*;

public class UserDatabaseConn {

    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaidik","root","Vaidik@24");

    public  UserDatabaseConn() throws SQLException {

    }

    boolean login(String username, String password) throws SQLException {
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT username, password from Users where username = "+"\""+username+"\""+" and password = "+"\""+password+"\"");
        if(rs.next()){
            return true;
        }else{
            return false;
        }

    }

    boolean signup(String username, String password) throws SQLException{
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT username, password from Users where username = "+"\""+username+"\""+" and password = "+"\""+password+"\"");
        if(rs.next()){
            System.out.println("Acct already exists");
            return false;
        }else{
            stmt.executeUpdate("insert into Users values ("+"\""+username+"\""+","+"\""+password+"\""+")");
            System.out.println("signed up!");
            return true;
        }
    }



}

class Test{

    public static void main(String[] args) throws SQLException {
        UserDatabaseConn db = new UserDatabaseConn();

        db.signup("rahil","123");
        db.login("rahil", "123");
    }
}
