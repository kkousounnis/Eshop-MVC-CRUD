package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Customer;

/**
 *
 * @author konstantinos
 */
public class CustomerDao extends Database implements ICustomerDao {

    public Database db;

    @Override
    public int insert(Customer customer, String tableName) {
        if (db == null) {
            db = new Database();
        }
        int result = 0;

        try {

            //statement = con.createStatement();
            preparedStatement = con.prepareStatement(
                    "INSERT INTO " + tableName + ""
                    + "(`first_name`,"
                    + "`last_name`,"
                    + " `tel`,"
                    + " `email`)"
                    + " VALUES (?,?,?,?)");

            preparedStatement.setString(1, customer.getFirstName());
            preparedStatement.setString(2, customer.getLastName());
            preparedStatement.setString(3, customer.getTel());
            preparedStatement.setString(4, customer.getEmail());

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return result;
    }

    @Override
    public int update(int customerId) {
        if (db == null) {
            db = new Database();
        }

        int result = 0;
        try {

            //statement = con.createStatement();
            preparedStatement = con.prepareStatement(
                    "UPDATE `customers` SET `id` = ? WHERE id = ?");

            preparedStatement.setString(1, String.valueOf(customerId));
            preparedStatement.setString(2, String.valueOf(customerId));

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return (result);
    }

    @Override
    public int update(String firstname, String lastname) {
        if (db == null) {
            db = new Database();
        }

        int result = 0;
        try {

            //statement = con.createStatement();
            preparedStatement = con.prepareStatement(
                    "UPDATE `customers` SET `first_name`=? and `last_name` = ? WHERE `first_name` = ? and `last_name` = ?");

            preparedStatement.setString(1, firstname);
            preparedStatement.setString(2, lastname);
            preparedStatement.setString(3, firstname);
            preparedStatement.setString(4, lastname);

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return (result);
    }

    @Override
    public int update(String email) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int customerId) {
        if (db == null) {
            db = new Database();
        }

        int result = 0;
        try {

            //statement = con.createStatement();
            preparedStatement = con.prepareStatement(
                    "DELETE FROM `customers` WHERE id=?");

            preparedStatement.setString(1, String.valueOf(customerId));

            result = preparedStatement.executeUpdate();

        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return (result);
    }

    @Override
    public List<Customer> all() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = null;
        int customerId = -1;
        try {
            statement = con.createStatement();

            rs = statement.executeQuery("SELECT * FROM `customers`");
            while (rs.next()) {
                customerId = rs.getInt("id");
                customer = new Customer(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("tel"),
                        rs.getString("email"));
                customers.add(customer);
            }
            // customerId = cmd.getIntField(sc, "Please select the customer");

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return customers;
    }

    @Override
    public Customer getCustomerById(int id) {
        if (db == null) {
            db = new Database();
        }
        Customer customer = null;
        int result = 0;
        try {

            //statement = con.createStatement();
            preparedStatement = con.prepareStatement(
                    "SELECT FROM `customers` WHERE id=?");

            preparedStatement.setString(1, String.valueOf(id));

            rs = preparedStatement.executeQuery();
            while (rs.next()) {

                customer = new Customer(
                        rs.getString("first_name"),
                        rs.getString("last_name"),
                        rs.getString("tel"),
                        rs.getString("email"));
            }
            
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return (customer);
    }

}
