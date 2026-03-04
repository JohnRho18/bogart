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
    public int insertData(String sql) {
    int result = 0;
    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        result = pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Insert Error: " + e.getMessage());
    }
    return result;
}

public ResultSet getData(String sql) throws SQLException {
    Connection conn = connectDB();
    PreparedStatement pstmt = conn.prepareStatement(sql);
    return pstmt.executeQuery();
}

public void updateData(String sql) {
    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement(sql)) {
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Update Error: " + e.getMessage());
    }
}

public void deleteData(int id, String table, String column) {
    try (Connection conn = connectDB();
         PreparedStatement pstmt = conn.prepareStatement("DELETE FROM " + table + " WHERE " + column + " = ?")) {
        pstmt.setInt(1, id);
        pstmt.executeUpdate();
    } catch (SQLException e) {
        System.out.println("Delete Error: " + e.getMessage());
    }
}


}
