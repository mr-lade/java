import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Calculator extends HttpServlet {
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		res.setContentType("text/html");
		PrintWriter pw = res.getWriter();
		String n1 = req.getParameter("fnum");
		String n2 = req.getParameter("snum");
		String op = req.getParameter("op");
		switch(op) {
		
		case "Add" : 
			int x = Integer.parseInt(n1);
			int y = Integer.parseInt(n2);
			int z = x+y;
			pw.println("The addition is = "+z);
			System.out.println("The addition is = "+z);
			break;
			
		case "Sub" : 
			int a = Integer.parseInt(n1);
			int b = Integer.parseInt(n2);
			int c = a-b;
			pw.println("The Substraction is = "+c);
			System.out.println("The Substraction is = "+c);
			break;
			
		case "Mul" : 
			int d = Integer.parseInt(n1);
			int e = Integer.parseInt(n2);
			int f = d*e;
			pw.println("The Multiplication is = "+f);
			System.out.println("The Multiplication is = "+f);
			break;
			
		case "Div" : 
			int g = Integer.parseInt(n1);
			int h = Integer.parseInt(n2);
			int i = g/h;
			pw.println("The Division is = "+i);
			System.out.println("The Division is = "+i);
			break;
			
			default: 
				pw.println("Invalid Option");
				System.out.println("Invaliid Option");
		}
	}

}
