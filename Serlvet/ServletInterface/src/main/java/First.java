import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.io.*;
import javax.servlet.ServletException;
public class First implements Servlet {
	ServletConfig config = null;
	public void init(ServletConfig config) {
		this.config = config;
		System.out.println("Servlet Initialised");
	}
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		pw.print("<html><body>");
		pw.print("<b>Servlet Interface is Implemented</b>");
		pw.print("</html></body>");
	}
	public void destroy() {
		System.out.println("Servlet Destroyed");
		
	}
public ServletConfig getServletConfig( ) {
	return config;
	
}
public String getServletInfo() {
	
	return("Servlet Information");
}
}
