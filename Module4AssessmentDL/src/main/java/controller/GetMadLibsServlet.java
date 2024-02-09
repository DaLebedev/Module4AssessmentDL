package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLibMaker;

/**
 * Servlet implementation class GetMadLibsServlet
 */
@WebServlet("/GetMadLibsServlet")
public class GetMadLibsServlet extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetMadLibsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//When form is posted, retrieve all input parameters from form
		
		String adjective1 = request.getParameter("adjective1");
		String adjective2 = request.getParameter("adjective2");
		String pluralNoun1 = request.getParameter("pluralNoun1");
		String pluralNoun2 = request.getParameter("pluralNoun2");
		String adjective3 = request.getParameter("adjective3");
		String pluralNoun3 = request.getParameter("pluralNoun3");
		String animal = request.getParameter("animal");
		String verb = request.getParameter("verb");
		String pastTenseVerb1 = request.getParameter("pastTenseVerb1");
		String pastTenseVerb2 = request.getParameter("pastTenseVerb2");
		
		// Create MadLibMaker object with retrieved data
		MadLibMaker madLibMaker = new MadLibMaker(adjective1, adjective2, pluralNoun1, 
				pluralNoun2, adjective3, pluralNoun3, animal, verb, pastTenseVerb1,
				pastTenseVerb2);
		
		// Set madLibMaker object as usable attribute in JSP
		request.setAttribute("userMadLib", madLibMaker);
		
		// Forwards request to result.jsp
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
