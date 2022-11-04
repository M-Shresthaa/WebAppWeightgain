import java.io.IOException;
import javax.servlet.*;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.http.*;

public class AuthenticateFilter implements Filter {

  public void init(FilterConfig config) throws ServletException {}

  public void destroy() {}

  public void doFilter(
    ServletRequest req,
    ServletResponse res,
    FilterChain chain
  )
    throws IOException, ServletException {
    HttpSession session = ((HttpServletRequest) req).getSession();

    String flag = (String) session.getAttribute("token");

    if (flag == null) {
      RequestDispatcher dis = req.getRequestDispatcher("login");
      dis.forward(req, res);
    } else {
      chain.doFilter(req, res);
    }
  }
}
