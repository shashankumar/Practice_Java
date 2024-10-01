package com.sk;

import java.io.IOException;

import java.io.PrintWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = {"/Second"})
public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Logger logger =  LogManager.getLogger(SecondServlet.class);
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SecondServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
        PrintWriter printWriter = resp.getWriter();
        printWriter.print("<html>");
        printWriter.print("<body>");
        printWriter.print("<h1>Hello World HttpServlet Class Example</h1>");
        logger.info("<a href=\"http://www.javaguides.net\">Java Guides</a>");
        printWriter.print("<a href=\"http://www.javaguides.net\">Java Guides</a>");
        printWriter.print("</body>");
        printWriter.print("</html>");
        printWriter.close();

	}



}
