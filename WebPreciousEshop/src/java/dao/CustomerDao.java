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

    private Database db;

    @Override
    public int insert(Customer customer, String tableName) {
        if (db == null) {
            db = new Database();
        }
        int result = 0;
        final String query = "INSERT INTO " + tableName + ""
                + "(`first_name`,"
                + "`last_name`,"
                + " `tel`,"
                + " `email`)"
                + " VALUES (?,?,?,?)";
        try {

            if (con != null) {
                preparedStatement = con.prepareStatement(query);

                preparedStatement.setString(1, customer.getFirstName());
                preparedStatement.setString(2, customer.getLastName());
                preparedStatement.setString(3, customer.getTel());
                preparedStatement.setString(4, customer.getEmail());

                result = preparedStatement.executeUpdate();
            } else {
                System.out.println("Connection Problems.");
            }

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
        final String query = "UPDATE `customers` SET `id` = ? WHERE id = ?";
        int result = 0;
        try {

            if (con != null) {
                preparedStatement = con.prepareStatement(query);

                preparedStatement.setString(1, String.valueOf(customerId));
                preparedStatement.setString(2, String.valueOf(customerId));

                result = preparedStatement.executeUpdate();
            } else {
                System.out.println("Connection Problems.");
            }

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
        final String query = "UPDATE `customers` "
                + "SET `first_name`=? and `last_name` = ? "
                + "WHERE `first_name` = ? and `last_name` = ?";
        int result = 0;
        try {

            if (con != null) {
                preparedStatement = con.prepareStatement(query);

                preparedStatement.setString(1, firstname);
                preparedStatement.setString(2, lastname);
                preparedStatement.setString(3, firstname);
                preparedStatement.setString(4, lastname);

                result = preparedStatement.executeUpdate();
            } else {
                System.out.println("Connection Problems.");
            }

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
        final String query = "DELETE FROM `customers` WHERE id=?";
        int result = 0;
        try {

            if (con != null) {
                preparedStatement = con.prepareStatement(query);

                preparedStatement.setString(1, String.valueOf(customerId));

                result = preparedStatement.executeUpdate();
            } else {
                System.out.println("Connection problems.");
            }

        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return (result);
    }

    @Override
    public List<Customer> all() {
        List<Customer> customers = new ArrayList<>();
        Customer customer = null;
        final String query = "SELECT * FROM `customers`";
        
        try {
            if (con != null) {
                statement = con.createStatement();

                rs = statement.executeQuery(query);
                while (rs.next()) {
                    
                    customer = new Customer(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("tel"),
                            rs.getString("email"));
                    customers.add(customer);
                }
            } else {
                System.out.println("Connection Problems.");
            }
            // customerId = cmd.getIntField(sc, "Please select the customer");

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return (customers);
    }

    @Override
    public Customer getCustomerById(int id) {
        if (db == null) {
            db = new Database();
        }
        final String query = "SELECT FROM `customers` WHERE id=?";
        Customer customer = null;
        int result = 0;
        try {

            if (con != null) {
                preparedStatement = con.prepareStatement(query);

                preparedStatement.setString(1, String.valueOf(id));

                rs = preparedStatement.executeQuery();
                while (rs.next()) {

                    customer = new Customer(
                            rs.getInt("id"),
                            rs.getString("first_name"),
                            rs.getString("last_name"),
                            rs.getString("tel"),
                            rs.getString("email"));
                }
            } else {
                System.out.println("Connection Problems");
            }

        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }

        return (customer);
    }

}
