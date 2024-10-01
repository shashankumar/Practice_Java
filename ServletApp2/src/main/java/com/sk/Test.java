package com.sk;

import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.WildcardType;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Test
 */
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Test() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter writer = response.getWriter();
		try {
			Statement smt = JDBCUtility.getConnection().createStatement();
			ResultSet query = smt.executeQuery("Select * from Pune");

			writer.println(
					"<style>table {border-collapse: collapse;width: 100%;}th, td { text-align: left;padding: 8px;}tr:nth-child(even) {background-color: #D6EEEE;}</style>");

			writer.println("<html>");
			writer.println("<body><center>");
			writer.println("<table border='1'>");

			while (query.next()) {
				writer.println("<tr>");
				writer.println("<td>");
				writer.println(query.getInt(1));
				writer.println("</td>");
				writer.println("<br>");
				writer.println("<td>");
				writer.println(query.getString(2));
				writer.println("</td>");
				writer.println("</tr>");
				
				System.out.println(query.getInt(1));

			}
			writer.println("</table></html>");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
