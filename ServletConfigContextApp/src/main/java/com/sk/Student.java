package com.sk;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import java.util.Iterator;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Student
 */
public class Student extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Student() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		ServletConfig config = getServletConfig();
		out.println(
				"<style>table {border-collapse: collapse;width: 100%;}th, td { text-align: left;padding: 8px;}tr:nth-child(even) {background-color: #D6EEEE;}</style>");

		out.print("<html>");
		out.print("<head>");
		out.print("</head>");
		out.print("<body>");
		out.print("<table border='1'>");
		out.print("<tr>");
		Enumeration<String> names = config.getInitParameterNames();
		out.print("<tr>");
		while(names.hasMoreElements()) {
			String element = names.nextElement();
			
			out.print("<td>");
			out.println(element);
			out.print("</td>");
			
		}
		out.print("</tr>");
		
		
		String id = config.getInitParameter("name");
		
		String name = config.getInitParameter("id");
		
		String clas = config.getInitParameter("class");
		out.print(config.getServletContext().getInitParameter("contxt"));
		out.print("<tr>");
		out.print("<td>");
		out.println(id);
		out.print("</td>");
		out.print("<td>");
		out.println(name);
		out.print("</td>");
		out.print("<td>");
		out.println(clas);
		out.print("</td>");
		out.print("</tr>");
		out.print("</table>");
		out.print("</body>");
		out.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
