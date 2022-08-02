import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

@WebServlet("/addUser")
public class AddUser extends HttpServlet {
    public void init() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "root");
            PreparedStatement pst = con.prepareStatement("SELECT name FROM login WHERE name = ?;");
            pst.setString(1, req.getParameter("username"));
            ResultSet rs = pst.executeQuery();
            if(!rs.next()) { 
                pst = con.prepareStatement("INSERT INTO web_users VALUES(?,?);");
                pst.setString(1, req.getParameter("name"));
                pst.setString(2, req.getParameter("password"));
                pst.executeUpdate();
                con.close();
                pst.close();
                rs.close();
                PrintWriter out = res.getWriter();
                res.sendRedirect("login.jsp");
            }
            else {
                PrintWriter out = res.getWriter();
                res.sendRedirect("login.jsp");
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}