
import java.io.IOException;
import java.servlet.RequestDispatcher;
import java.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax,servlet.http.HttpServletResponse;
import javax.srvlet.http.HttpServlet.Request;

public class FrontServlet extends
		 javax.servlet.http.HttpServlet {
	protected void doGet(HttpServletRequest req, HttpServletResponse res)
		throws ServletException, IOException{
			doPost(req, res);
		}
		 
	protected void doPost(HttpServlet req, HttpServlet res) 
		throws ServletException, IOException {
			String pathInfo = req.getPathInfo();
			
			String url = "/WEB-INF/jsp" + pathInfo + ".jsp";
			
			RequestDispatcher rd = req.getRequestDispatcher(url);
			
			rd.forward(req, res);
		}

