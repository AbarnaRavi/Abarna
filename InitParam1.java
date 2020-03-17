

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class InitParam1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public InitParam1() {
        super();
       
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		out.print("<h1>Init Parameters Names are:");
		Enumeration enumeration=getServletConfig().getInitParameterNames();
		while(enumeration.hasMoreElements()){
			out.print(enumeration.nextElement()+" ");
		}
		ServletContext con1=getServletContext();
		out.println("<h1>Company."+con1.getInitParameter("Company"));
		out.println("Venue:"+con1.getInitParameter("Venue"));
	    out.println("Traning."+con1.getInitParameter("Training"));
		
		out.println("<h1>Company."+getServletContext().getInitParameter("Company"));
		out.println("Venue:"+getServletContext().getInitParameter("Venue"));
		out.println("Traning."+getServletContext().getInitParameter("Training"));
		
		
		
		
		
		
		
		
		
				
		
		
		
		}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
