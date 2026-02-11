package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class config {
    


public boolean authenticate(String sql, Object... values) {
    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {

        for (int i = 0; i < values.length; i++) {
            pstmt.setObject(i + 1, values[i]);
        }

        try (ResultSet rs = pstmt.executeQuery()) {
            if (rs.next()) {
                return true;
            }
        }
    } catch (SQLException e) {
        System.out.println("Login Error: " + e.getMessage());
    }
    return false;
}

public Connection connectDB() {
    try {
        Class.forName("org.sqlite.JDBC");
        Connection conn = java.sql.DriverManager.getConnection("jdbc:sqlite:db.db"); 
        return conn;
    } catch (Exception e) {
        System.out.println(e.getMessage());
        return null;
    }
}
    


}
