package Com.sk;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InsertServlet
 */
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	StudentDAO sdo = new StudentDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public InsertServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		response.setContentType("text/html");
		int sid = Integer.parseInt(request.getParameter("sid"));
		int lid = Integer.parseInt(request.getParameter("lid"));
		String name = request.getParameter("name");
		String city = request.getParameter("city");
		writer.println("Successfully saved");
		
		System.out.println(sid);
		
		try {
			int num = this.sdo.insertStudent(sid, lid, name, city);
			writer.println(
					"<style>table {border-collapse: collapse;width: 100%;}th, td { text-align: left;padding: 8px;}tr:nth-child(even) {background-color: #D6EEEE;}</style>");
			writer.println("<!DOCTYPE html>");
			writer.println("<html>");
			writer.println("<body><center>");
			writer.println("<table border='1'>");
			writer.println(num+" Records are scussefully inserted");
			writer.println("<h4><a href='http://localhost:8080/ServletInsertSelectApp/index.jsp'>Go To Student Details Page</a></h4>");
			writer.println("</html>");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
