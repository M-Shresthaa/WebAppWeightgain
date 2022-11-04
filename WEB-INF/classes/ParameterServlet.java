import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

public class ParameterServlet extends HttpServlet {
  String _gender;
  String _age;
  String _weight;
  int result;
  int id;

  Connection cn;

  protected void doPost(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {

    HttpSession session = ((HttpServletRequest) req).getSession();
    id = (Integer) session.getAttribute("ID");

    int age_no = 0;
    int weight_no = 0;

    res.setContentType("text/html; charset=Windows-31J");
    req.setCharacterEncoding("Windows-31J");

    PrintWriter out = res.getWriter();

    _gender = req.getParameter("gender");
    _age = req.getParameter("age");
    _weight = req.getParameter("weight");
    age_no = Integer.valueOf(_age).intValue();
    weight_no = Integer.valueOf(_weight).intValue();

    try {
      Class.forName("oracle.jdbc.driver.OracleDriver");

      cn = DriverManager.getConnection(
          "jdbc:oracle:thin:@localhost:1521:orcl", "info", "pro");

      PreparedStatement st = cn.prepareStatement("insert into user_info values(?,?,?,?,?)");
      st.setInt(1, id);
      st.setInt(2, age_no);
      st.setString(3, _gender);
      st.setInt(4, weight_no);
      st.setInt(5, result);

      st.executeUpdate();
      select();
      // cn.commit();
      req.setAttribute("age", _age);
      req.setAttribute("weight", _weight);
      req.setAttribute("gender", _gender);
      req.setAttribute("result", result);

      RequestDispatcher dis = req.getRequestDispatcher("main");

      dis.forward(req, res);

    } catch (NullPointerException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      e.printStackTrace();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  protected void doGet(HttpServletRequest req, HttpServletResponse res)
      throws ServletException, IOException {
    try {
      cn = DriverManager.getConnection(
          "jdbc:oracle:thin:@localhost:1521:orcl", "info", "pro");
      select();
      req.setAttribute("age", _age);
      req.setAttribute("weight", _weight);
      req.setAttribute("gender", _gender);
      req.setAttribute("result", result);

      RequestDispatcher dis = req.getRequestDispatcher("main");

      dis.forward(req, res);
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public void select() throws Exception {
    PreparedStatement st = cn.prepareStatement("select age, weight, gender,result from user_info where user_id = (?)");
    st.setInt(1, id);
    ResultSet rs = st.executeQuery();

    while (rs.next()) {
      _age = rs.getString(1);
      _weight = rs.getString(2);
      _gender = rs.getString(3);
      result = Integer.parseInt(rs.getString(4));
    }
    cn.close();
  }
}