import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.plaf.synth.SynthScrollBarUI;

import java.sql.*;


public class tableServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res)
		throws IOException, ServletException{
			int i = 0;
			int num = 0;
			res.setContentType("text/html; charset=Windows-31J");
			req.setCharacterEncoding("Windows-31J");
			String[] checkedFruits = req.getParameterValues("foods");
			PrintWriter out = res.getWriter();
			out.println("<html>");
			out.println("<head><h1>表計算結果</h1></head>");
			out.println("<link rel=\"stylesheet\" type=\"text/css\" href=\"style.css\"/>'");
			  	out.println("<body>");
			out.println("<table border='2px' style='width:600px;height:150px;'>"); 
		
			out.print("<p>選んだ朝食とカロリー一覧</p>");
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
		  
				Connection cn = DriverManager.getConnection(
				  "jdbc:oracle:thin:@localhost:1521:orcl","info","pro");
				
			for(String fruit : checkedFruits){
				switch (fruit){
					case "raice":
					out.println("<td>ごはんーーー168kcal</td>");
					//値を入れる処理を書く
					i = 168;
					break;
					case "egg":
					out.println("<td>卵ーーー76kcal</td>");
					//値を入れる処理を書く
					i = 76;
					break;
					case "natto":
					out.println("<td>納豆ーーー190kcal</td>");
					//値を入れる処理を書く
					i = 190;
					break;
					case "banana":
					out.println("<td>バナナーーー86kcal</td>");
					//値を入れる処理を書く
					i = 86;
					break;

				}
				num = num + i;				
			}
			PreparedStatement st = cn.prepareStatement("update user_info set result = (?)");
			st.setInt(1,num);
			System.out.println("a");
			st.executeUpdate();
			//cn.commit();
			cn.close();   	
			 out.println("</table>");

		} catch (NullPointerException e) {
			e.printStackTrace();
		  } catch (NumberFormatException e) {
			e.printStackTrace();
		  } catch (Exception e) {
			e.printStackTrace();
		  } 
		  
		 
			out.println("<p>合計は");
			out.print("--"+num+"kcal");
			out.print("です。</p>");
			out.print("<p><a href='ParameterServlet'>入力画面に戻る</a></p>");

			out.print("<form action='Logout' method='get'>");
			out.print("<input type='submit' value='ログアウト'>");
			out.print("</form>"); 
		

			out.println("</body></html>");


		  	
			

			


		}
}		
			
			