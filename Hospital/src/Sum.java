

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Sum
 */
@WebServlet("/Sum")
public class Sum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Sum() {
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
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String s1=request.getParameter("Number1");
		String s2=request.getParameter("Number2");
		String add=null;
		String sub=null;
		String mul=null;
		String div=null;
		int x=Integer.parseInt(s1);
		int y=Integer.parseInt(s2);
		add=request.getParameter("add1");
		sub=request.getParameter("sub1");
		mul=request.getParameter("mul1");
		div=request.getParameter("div1");
		if(add!=null || sub!=null || mul!=null || div!=null)
		{
			if(add!=null)
			{
				pw.println("Sum = "+(x+y)+"<br>");
			}
			if(sub!=null)
			{
				pw.println("Difference = " + (x-y) + "<br>");	
			}
			if(mul!=null)
			{
				pw.println("Product = "+(x*y)+"<br>");
			}
			if(div!=null)
			{
				pw.println("Quotient = "+(x/y)+"<br>");
			}	
		}
		else
		{
			pw.println("null");
		}
		
	}

}
