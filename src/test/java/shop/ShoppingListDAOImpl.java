package shop;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.SQLException;

import static java.sql.DriverManager.getConnection;
import static org.assertj.core.api.Assertions.fail;

public class ShoppingListDAOImpl {

    @Test
    void should_connect_to_MySQL_Database() {
        try (final Connection con = getConnection("jdbc:mysql://localhost:3306/shop", "sepehr", "7learn")) {
            if (con == null) {
                fail("Connection to database is impossible");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            fail("Connection to database is impossible");
        }
    }
}
