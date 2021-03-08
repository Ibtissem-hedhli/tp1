package isetj_servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class coffeeServlet
 */
@WebServlet("/coffeeServlet")
public class coffeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public coffeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String typeremarque= request.getParameter("typeremarque");
		String texteremarque= request.getParameter("texteremarque");
		PrintWriter out=response.getWriter();
		out.println("<html><head>");
		out.println("<title> coffee shope </title></head>");
		out.println("<body><img src='img.jpg' border='0' height='250' width='300'>");
		out.println("<p>merci de nous avoir fait parvenir la remarque suivant consernant </p>");
		out.println("<b>"+typeremarque+"</b>");
		out.println("<p>"+texteremarque);
		out.println("</body></html>");
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
