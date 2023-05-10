import javax.servlet.*;
import java.io.*;


public class gener extends GenericServlet{
	public boolean isArmstrong(int n) {
	    int sum = 0;
	    int numDigits = 0;
	    int temp = n;
	    
	    // Count the number of digits in the given number
	    while (temp != 0) {
	        numDigits++;
	        temp /= 10;
	    }
	    
	    // Calculate the sum of the cubes of the digits
	    temp = n;
	    while (temp != 0) {
	        int digit = temp % 10;
	        sum += Math.pow(digit, numDigits);
	        temp /= 10;
	    }
	    
	    // Check if the given number is an Armstrong number
	    return (sum == n);
	}

	
	public void service(ServletRequest req,ServletResponse res)throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String n = req.getParameter("num");
		int x = Integer.parseInt(n);
		if(isArmstrong(x))
		{
			pw.println("<html><body>");
			pw.println("It is a armstrong number");
			System.out.println("It is a armstrong number");
			pw.println("</body></html>");
		}
		else {
			pw.println("<html><body>");
			pw.println("It is not a armstrong number");
			System.out.println("It is not a armstrong number");
			pw.println("</body></html>");
		}
	}
}