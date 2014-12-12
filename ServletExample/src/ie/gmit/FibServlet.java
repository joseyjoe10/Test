package ie.gmit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.PrintWriter;
import java.rmi.NotBoundException;

public class FibServlet extends HttpServlet { 
  protected void doGet(HttpServletRequest request, 
      HttpServletResponse response) throws ServletException, IOException 
  {
    // reading the user input
    int length= Integer.valueOf(request.getParameter("length")); 
    int jobNumber = FibService.add(length);
    
    FibClient fib = new FibClient();
    try {
		fib.rmiCall(length);
	} catch (NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    String result = "null";
    try {
		result = fib.rmiCall(length);
	} catch (NotBoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    
    
    
    response.setContentType("text/plain"); 
    response.setCharacterEncoding("UTF-8"); 
    response.getWriter().write(String.valueOf("\nJob Number " +String.valueOf(jobNumber)));
    response.getWriter().write(String.valueOf("\nResult " +String.valueOf(result)));
      
   
  }  
}