package com.ServletsExample;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * Servlet implementation class ExamplePage
 */
public class ExamplePage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ExamplePage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
	
		out.println("<h1>Hai this is M.RaveendraNath</h1>");
	     String fname=request.getParameter("fname");
	     String lname=request.getParameter("lname");
	     Long  MobileNumber= Long.parseLong(request.getParameter("MobileNumber"));
	     String emailid=request.getParameter("emailid");
	     String ra=request.getParameter("ra");
	     out.println(fname+" "+lname+" "+MobileNumber+" "+emailid+" "+ra);
	    System.out.println(fname+" "+lname+" "+MobileNumber+" "+emailid+" "+ra);
	    StudentForm  sf=new StudentForm();
	    sf.setFirstname(fname);
	    sf.setLastname(lname);
	    sf.setMobileno(MobileNumber);
	    sf.setEmail(emailid);
	    sf.setGender(ra);
	    
	    try {
			Jdbcform.method(sf);
		} catch (SQLException e) {
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
