import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class calculator extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,  IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String n1 = req.getParameter("num1");
		String n2 = req.getParameter("num2");
		String op = req.getParameter("operation");
		
		switch(op) {
		case "addition" :
			int x = Integer.parseInt(n1);
			int y = Integer.parseInt(n2);
			int z = x+y;
			pw.println("The addition of " + x + " and " + y + " is : "+ z);
			System.out.println("The addition of " + x + " and " + y + " is : "+ z);
			break;
			
		case "subtraction" :
			int a = Integer.parseInt(n1);
			int b = Integer.parseInt(n2);
			int c = a-b;
			pw.println("The subtraction between " + b + " and " + a + " is : "+ c);
			System.out.println("The subtraction between " + b + " and " + a + " is : "+ c);
			break;
			
		case "multiplication" :
			int p = Integer.parseInt(n1);
			int q = Integer.parseInt(n2);
			int r = p*q;
			pw.println("The multiplication of " + p + " and " + q + " is : "+ r);
			System.out.println("The multiplication of " + p + " and " + q + " is : "+ r);
			break;
			
		case "division" :
			int l = Integer.parseInt(n1);
			int m = Integer.parseInt(n2);
			int n = l/m;
			pw.println("The division of " + l + " and " + m + " is : "+ n);
			System.out.println("The division of " + l + " and " + m + " is : "+ n);
			break;
			
		default : 
			pw.println("Invalid choice");
			System.out.println("Invalid Choice");
		}
	}
}	
