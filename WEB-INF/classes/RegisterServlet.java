import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import java.sql.PreparedStatement; 
import java.sql.*;

public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html; charset=UTF-8");
        request.setCharacterEncoding("UTF-8");

        String name = request.getParameter("name");
        String goal_cal = request.getParameter("goal_cal");

        int _goal_cal = Integer.parseInt(goal_cal);

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");

            Connection cn = DriverManager.getConnection(
                    "jdbc:oracle:thin:@localhost:1521:orcl", "info", "pro");

            
            PreparedStatement st = cn.prepareStatement("insert into login(name,goal_cal) values(?,?)");
            st.setString(1, name);
            st.setInt(2, _goal_cal);


            st.executeUpdate();
            //cn.commit();
            cn.close();
            request.setAttribute("name",name);
            request.setAttribute("goal_cal",goal_cal);

            RequestDispatcher dis = request.getRequestDispatcher("login");
            dis.forward(request,response);

            
        } catch (NullPointerException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}