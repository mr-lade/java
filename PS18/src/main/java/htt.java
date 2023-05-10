import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;


public class htt extends HttpServlet{
	public boolean isPrime(int n) {
	    if (n <= 1) {
	        return false; // 1 is not a prime number
	    }
	    for (int i = 2; i <= Math.sqrt(n); i++) {
	        if (n % i == 0) {
	            return false; // n is divisible by i, so it is not a prime number
	        }
	    }
	    return true; // n is not divisible by any integer between 2 and sqrt(n), so it is a prime number
	}
	
	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		PrintWriter pw=res.getWriter();
		res.setContentType("text/html");
		String n = req.getParameter("num");
		int x = Integer.parseInt(n);
		if(!isPrime(x))
		{
			pw.println("It is not a prime number");
			System.out.println("It is not a prime number");
		}
		else {
			pw.println("It is a prime number");
			System.out.println("It is a prime number");
		}
	}
}