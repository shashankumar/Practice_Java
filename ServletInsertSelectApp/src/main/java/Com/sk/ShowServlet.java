package Com.sk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import Com.sk.JDBCUtility;

/**
 * Servlet implementation class ShowServlet
 */
public class ShowServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	StudentDAO sdo = new StudentDAO();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		try {
			ResultSet query = this.sdo.showStudent();
			

			writer.println(
					"<style>table {border-collapse: collapse;width:100%;hieght:100%}th, td { text-align: left;padding: 8px;}tr:nth-child(even) {background-color: #D6EEEE;}</style>");
			writer.println("<!DOCTYPE html>");
			writer.println("<html>");
			writer.println("<body><center>");
			writer.println("<h3>Students Details</h3>");
			writer.println("<br>");
			writer.println("<table border='1'>");

			while (query.next()) {
				writer.println("<tr>");
				writer.println("<td>");
				writer.println(query.getInt(1));
				writer.println("</td>");
				//writer.println("<br>");
				writer.println("<td>");
				writer.println(query.getString(2));
				writer.println("</td>");
				
				//writer.println("<br>");
				writer.println("<td>");
				writer.println(query.getString(3));
				writer.println("</td>");
				
				//writer.println("<br>");
				writer.println("<td>");
				writer.println(query.getString(4));
				writer.println("</td>");
				writer.println("</tr>");
				

			}
			//writer.println("<br>");
			writer.println("</table>");
			writer.println("<br>");
			writer.println("<h4><a href='http://localhost:8080/ServletInsertSelectApp/index.jsp'>Go To Student Details Page</a></h4>");
			
			writer.println("</center></body>");
			writer.println("</html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
