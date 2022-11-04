import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.util.ArrayList;
import javax.servlet.*;
import javax.servlet.http.*;

public class LoginServlet extends HttpServlet {
// public void doPost(HttpServletRequest req, HttpServletResponse res)
// throws ServletException, IOException{
//   doGet(req,res);
// }
  public void doPost(HttpServletRequest req, HttpServletResponse res)
    throws ServletException, IOException {
    req.setCharacterEncoding("Windows-31J");
    System.out.println("a");
    String name = req.getParameter("name");
    String _goal_cal = req.getParameter("goal_cal");
      Connection cn = null;
      try {
      Class.forName("oracle.jdbc.driver.OracleDriver");
      
        cn = DriverManager.getConnection(
        "jdbc:oracle:thin:@localhost:1521:orcl","info","pro");

      PreparedStatement st = cn.prepareStatement("select * from login");
      ResultSet rs = st.executeQuery();

      while (rs.next()) {
        int id = rs.getInt(1);
        String uname = rs.getString(2);
        int int_cal = rs.getInt(3);
        String goal_cal = String.valueOf(int_cal);
        System.out.println("aaa");

        if (uname.equals(name) && goal_cal.equals(_goal_cal)) {
          HttpSession session = ((HttpServletRequest) req).getSession();//‚±‚±‚ÅƒZƒbƒVƒ‡ƒ“‚ðŒÄ‚Ô

          session.setAttribute("token", "OK");
          session.setAttribute("ID",id);
          //res.sendRedirect("ParameterInput.html");
          System.out.println("a");

          
          RequestDispatcher rd = req.getRequestDispatcher("ParameterInput.html");

          rd.forward(req, res);
        }
        else{
          System.out.println(uname+","+name+","+goal_cal+","+_goal_cal);
        }
        System.out.println("asd");
      }

      cn.close();
    }catch (ClassNotFoundException e){
      e.printStackTrace();
      //res.sendRedirect("loginjsp");
    } catch (SQLException e) {
      e.printStackTrace();
      //res.sendRedirect("loginjsp");
    }
    }
}
