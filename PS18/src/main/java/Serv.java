import javax.servlet.*;
import java.io.*;

public class Serv implements Servlet {

    ServletConfig config = null;

    public void init(ServletConfig config) {
        this.config = config;
        System.out.println("Servlet initialized");
    }

    public boolean isEven(int n) {
        if (n % 2 == 0) {
            return true; // n is even
        } else {
            return false; // n is odd
        }
    }

    public void service(ServletRequest req, ServletResponse res) throws IOException, ServletException {
        PrintWriter pw = res.getWriter();
        res.setContentType("text/html");
        String n = req.getParameter("num");
        int x = Integer.parseInt(n);
        if (isEven(x)) {
            pw.println("<html><body>");
            pw.println("It is a even number");
            System.out.println("It is a even number");
            pw.println("</body></html>");
        } else {
            pw.println("<html><body>");
            pw.println("It is not a even number");
            System.out.println("It is not a even number");
            pw.println("</body></html>");
        }
    }

    public void destroy() {
        System.out.println("Servlet is destroyed");
    }

    public ServletConfig getServletConfig() {
        return config;
    }

    public String getServletInfo() {
        return "Servlet belongs to year 2023";
    }
}
