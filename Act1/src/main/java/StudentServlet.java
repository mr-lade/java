import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class StudentServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String rollno = request.getParameter("rollno");
        String name = request.getParameter("name");
        String dept = request.getParameter("dept");
        String subjects = request.getParameter("subjects");
        String phone = request.getParameter("phone");
        String address = request.getParameter("address");

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Student Details</h2>");
        out.println("<p>Roll no: " + rollno + "</p>");
        out.println("<p>Name: " + name + "</p>");
        out.println("<p>Department: " + dept + "</p>");
        out.println("<p>Subjects: " + subjects + "</p>");
        out.println("<p>Phone Number: " + phone + "</p>");
        out.println("<p>Address: " + address + "</p>");
        out.println("</body></html>");
    }
}
