

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Homepage1
 */
@WebServlet("/Homepage1")
public class Homepage1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Homepage1() {
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
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String s=request.getParameter("dob");
		String s1=request.getParameter("name");
		String s2=request.getParameter("gender");
		String s3=request.getParameter("bg");
		String s4=request.getParameter("age");
		String s5=request.getParameter("address");
		String s6=request.getParameter("no");
		PrintWriter pw=response.getWriter();
		pw.println("<center font-size:30px;>*****PATIENT'S DETAILS*****<br><br>");
		pw.println("Patient's Name: "+ s1+"<br>");
		pw.println("Date Of Birth: "+ s+"<br>");
		pw.println("Gender: "+ s2+"<br>");
		pw.println("Age: " +s3+"<br>");
		pw.println("Blood Group: " +s4+"<br>");
		pw.println("Address: " +s5+"<br>");
		pw.println("Mobile Number: " +s6+"<br>");
		
			
		}
	}
