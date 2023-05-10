import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CmToM extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException,  IOException {
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String n1 = req.getParameter("num1");
		String op1 = req.getParameter("operation1");
		
		switch(op1) {
		case "Con1" :
			int x = Integer.parseInt(n1);
			double z = (x/100);
			pw.println("The Conversion of " + x + " Centimeter to Meter is : "+ z);
			System.out.println("The Conversion of " + x + " Centimeter to Meter is : "+ z);
			break;
			
		case "Con2" :
			int a = Integer.parseInt(n1);
			int c = (a*100);
			pw.println("The Conversion of " + a + "Meter to Centimeter is : "+ c);
			System.out.println("The Conversion of " + a + "Meter to Centimeter is : "+ c);
			break;
			
		default : 
			pw.println("Invalid choice");
			System.out.println("Invalid Choice");
		}
	}
}	
