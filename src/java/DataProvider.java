
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DataProvider extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //reads the request
        String color=request.getParameter("bgclr");
        String name = request.getParameter("name");
        String country = request.getParameter("country");
        String items[] = request.getParameterValues("donation");
        //process the request
        int totalCases = 0;
        int activeCases = 0;
        int totalDeath = 0;

        switch (country) {
            case "india":
                totalCases = 2000000;
                activeCases = 500000;
                totalDeath = 29000;
                break;
            case "usa":
                totalCases = 2500000;
                activeCases = 700000;
                totalDeath = 39000;
                break;
            case "uk":
                totalCases = 800000;
                activeCases = 300000;
                totalDeath = 129000;
                break;
        }

        //provides the response
        PrintWriter out = response.getWriter();

        out.println("<html>");
        out.println("<body bgcolor="+color+">");
        out.println("<h3>Welcome " + name + " To Our Site</h3>");
        out.println("<h4>Information For " + country + "</h4>");
        out.println("<hr>");
        out.println("<table border=\"2\">");
        out.println("<tr>");
        out.println("<td>Total Cases</td>");
        out.println("<td>" + totalCases + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Active Cases</td>");
        out.println("<td>" + activeCases + "</td>");
        out.println("</tr>");
        out.println("<tr>");
        out.println("<td>Total Deaths</td>");
        out.println("<td>" + totalDeath + "</td>");
        out.println("</tr>");
        out.println("</table>");
        if (items != null) {
            out.println("<h4>You Want To Donate : </h4>");
            out.println("<ul>");
            for (String item : items) {
                out.println("<li>");
                out.println(item);
                out.println("</li>");
            }
            out.println("</ul>");
        }
        out.println("<hr>");
        out.println("<marquee>Stay At Home, Be Safe</marquee>");
        out.println("</body></html>");

        out.close();
    }

}
