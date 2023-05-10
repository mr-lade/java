import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class game extends HttpServlet {
    private int points = 0;
    private int attempts = 0;
    private int maxAttempts = 10;

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException,  IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();

        if (attempts >= maxAttempts) {
            // Max attempts reached, show end message and replay button
            pw.println("<h1>Game Over</h1>");
            pw.println("<p>You have reached the maximum number of attempts.</p>");
            pw.println("<button onclick=\"window.location.href='game.html'\">Replay</button>");
        } else {
            // Show game form
            pw.println("<h1>Welcome to the Game</h1>");
            pw.println("<p>Guess a number between 1 and 100:</p>");
            pw.println("<form method=\"get\">");
            pw.println("<input type=\"number\" name=\"num1\" />");
            pw.println("<input type=\"submit\" value=\"Submit\" />");
            pw.println("</form>");

            // Check user input and update score
            String n1 = req.getParameter("num1");
            if (n1 != null) {
                int x = Integer.parseInt(n1);
                int randNum = new Random().nextInt(100) + 1;
                attempts++;

                if (x == randNum) {
                    pw.println("<p>Congratulations! You guessed the number correctly.</p>");
                    points++;
                    pw.println("<p>Your current score is: " + points + "</p>");
                } else if (x < randNum) {
                    pw.println("<p>The number is greater than " + x + ".</p>");
                } else {
                    pw.println("<p>The number is less than " + x + ".</p>");
                }
            }
        }
    }
}
