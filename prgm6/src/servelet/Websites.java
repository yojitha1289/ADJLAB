package servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Websites
 */
@WebServlet("/Websites")
public class Websites extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Websites() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String val = request.getParameter("n1");
		
		if(val.contentEquals("amazon")) {
			response.sendRedirect("https://www.amazon.com/");
		}
		
		else if(val.contentEquals("flipkart")) {
			response.sendRedirect("https://www.flipkart.com/");
		}
		
		else if(val.contentEquals("gmail")) {
			response.sendRedirect("https://mail.google.com/mail/u/0/#inbox");
		}
		
		else if(val.contentEquals("youtube")) {
			response.sendRedirect("https://www.youtube.com/");
		}
		
		else if(val.contentEquals("instagram")) {
			response.sendRedirect("https://www.instagram.com/");
		}
		
		else if(val.contentEquals("twitter")) {
			response.sendRedirect("https://twitter.com/?lang=en");
		}
		
	}

}
