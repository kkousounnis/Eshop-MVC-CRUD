/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Product;

/**
 *
 * @author konstantinos
 */
public class ProductDao extends Database implements IProductDao {
    private Database db;
    @Override
    public int insert(Product product, String tableName) {
        //INSERT INTO `customers`(`name`,`price`,`quantity`) VALUES ('Fix it kit','187','1');
        int result = 0;

        try {
            //System.out.println(sb.toString());

            statement = con.createStatement();

            preparedStatement = con.prepareStatement(
                    "INSERT INTO " + tableName + ""
                    + "(`name`,"
                    + "`price`,"
                    + " `quantity`)"
                    + " VALUES (?,?,?)");

            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getQuantity());

            result = preparedStatement.executeUpdate();
        } catch (SQLException e) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, e);
        }
        return result;
    }

    @Override
    public int update(int productId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int update(double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int delete(int quantity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Product> all() {
        List<Product> products = new ArrayList<>();
        Product product = null;
        final String query = "SELECT * FROM `products`";
        try {
            if (con != null) {
                statement = con.createStatement();

                rs = statement.executeQuery(query);
                while (rs.next()) {
                    product = new Product(
                            rs.getString("name"),
                            rs.getDouble("price"),
                            rs.getInt("quantity"));
                    products.add(product);
                }
            } else {
                System.out.println("Connection Problems.");
            }
            // customerId = cmd.getIntField(sc, "Please select the customer");

        } catch (SQLException se) {
            se.printStackTrace();
        }
        return (products);
    }

    @Override
    public Product getProductById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
