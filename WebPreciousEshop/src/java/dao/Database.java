package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Database {

    public Connection con;
    public String server;
    public String username;
    public String password;
    public String database;
    
    Statement statement;
    PreparedStatement preparedStatement;
    ResultSet rs;

    public Database() {

        username = "root";
        password = "password";
        database = "eshop1";
        server = "jdbc:mysql://localhost:3306/" + database;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(server, username, password);
            System.out.println("Connected!");
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Connection is not established");
        }

    }

}
