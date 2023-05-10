import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DToF extends HttpServlet{
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,  IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String n1 = req.getParameter("num1");
		String op = req.getParameter("operation");
		
		switch(op) {
		case "Celsius to Fahrenheit" :
			int x = Integer.parseInt(n1);
			int z = (x*9/5)+32;
			pw.println("The Conversion of " + x + " Celsius to Fahrenheit is : "+ z);
			System.out.println("The Conversion of " + x + " Celsius to Fahrenheit is : "+ z);
			break;
			
		case "Fahrenheit to Celsius" :
			int a = Integer.parseInt(n1);
			int c = (a-32)*5/9;
			pw.println("The Conversion of " + a + "Fahrenheit to Celsius is : "+ c);
			System.out.println("The Conversion of " + a + "Fahrenheit to Celsius is : "+ c);
			break;
			
		default : 
			pw.println("Invalid choice");
			System.out.println("Invalid Choice");
		}
	}
}	
