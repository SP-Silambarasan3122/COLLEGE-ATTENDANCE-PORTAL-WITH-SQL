import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

public class AttendanceServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String name = request.getParameter("name");
        String regno = request.getParameter("regno");
        String status = request.getParameter("status");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/attendance_db",
                "root",
                "password"
            );

            PreparedStatement ps = con.prepareStatement(
                "INSERT INTO attendance VALUES (?, ?, ?)"
            );

            ps.setString(1, name);
            ps.setString(2, regno);
            ps.setString(3, status);

            ps.executeUpdate();

            response.getWriter().println("Attendance Saved Successfully!");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}