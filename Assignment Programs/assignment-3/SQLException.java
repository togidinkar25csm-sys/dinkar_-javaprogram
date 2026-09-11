package name;

import java.sql.*;

public class SQLExceptionExample
{
    public static void main(String[] args)
    {
        try
        {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/studentdb",
                "root",
                "password"
            );

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(
                "SELECT * FROM students"
            );

            while (rs.next())
            {
                System.out.println(
                    "ID: " + rs.getInt("id")
                    + ", Name: " + rs.getString("name")
                );
            }

            con.close();
        }
        catch (SQLException e)
        {
            System.out.println("SQLException occurred!");
            System.out.println("Database error: " + e.getMessage());
        }
    }
}