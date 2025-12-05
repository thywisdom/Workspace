package com.examly;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        
        String url = "jdbc:mysql://localhost:3306/school";
        String usr = "root";
        String pass = "suman";
        try{
             Connection con = DriverManager.getConnection(url,usr,pass);

            System.out.println("Databse connected successfully");

        }catch(Exception e){

            e.printStackTrace();
        }
    }
}
