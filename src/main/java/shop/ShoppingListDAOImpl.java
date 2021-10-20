package shop;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class ShoppingListDAOImpl implements ShoppingListDAO {

    public static final String HOST = "jdbc:mysql://localhost:3306/shop";
    public static final String USER = "sepehr";
    public static final String PASS = "7learn";
    public static final String INSERT_SQL = "INSERT INTO item (name, quantity) VALUES (?, ?)";
    public static final String SELECT_SQL = "SELECT * FROM item";

    @Override
    public List<Item> findAllItems() {
        List<Item> items = new LinkedList<>();
        try (final Connection con = getConnection(HOST, USER, PASS);
             final PreparedStatement select = con.prepareStatement(SELECT_SQL)) {

            final ResultSet resultSet = select.executeQuery();
            while (resultSet.next()) {
                final String name = resultSet.getString("name");
                final int quantity = resultSet.getInt("quantity");
                items.add(new Item(name, quantity));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return items;
    }

    @Override
    public void saveItems(List<Item> items) {
        try (final Connection con = getConnection(HOST, USER, PASS);
             final PreparedStatement insert = con.prepareStatement(INSERT_SQL);) {
            insert.setString(1, "Orange");
            insert.setInt(2, 5);
            insert.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
