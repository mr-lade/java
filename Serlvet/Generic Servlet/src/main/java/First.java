import java.io.*;  
import javax.servlet.*;  
  
public class First extends GenericServlet{  
public void init() {
	System.out.println("Servlet Initialised");
	
}
public void service(ServletRequest req,ServletResponse res)  
throws IOException,ServletException{  
  
res.setContentType("text/html");  
  
PrintWriter out=res.getWriter();  
out.print("<html><body>");  
out.print("<b>hello generic servlet</b>");  
out.print("</body></html>");  
  
} 

public void destroy() {
	System.out.println("Servlet Destroyed");
	
}
}  