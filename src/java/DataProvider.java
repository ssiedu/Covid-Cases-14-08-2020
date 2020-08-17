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
            String country=request.getParameter("t1");
        //process the request
            int totalCases=0;
            int activeCases=0;
            int totalDeath=0;
            
            switch(country){
                case "india":
                    totalCases=2000000;
                    activeCases=500000;
                    totalDeath=29000;
                break;
                case "usa":
                    totalCases=2500000;
                    activeCases=700000;
                    totalDeath=39000;
                break;
                case "uk":
                    totalCases=800000;
                    activeCases=300000;
                    totalDeath=129000;
                break;
            }
        
        //provides the response
            
            PrintWriter out=response.getWriter();
         
            out.println("<html>");
            out.println("<body bgcolor=\"pink\">");
            out.println("<h3>Welcome To Our Site</h3>");
            out.println("<h4>Informative Portal For Covid Information</h4>");
            out.println("<hr>");
            out.println("<table border=\"2\">");
            out.println("<tr>");
            out.println("<td>Total Cases</td>");
            out.println("<td>"+totalCases+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Active Cases</td>");
            out.println("<td>"+activeCases+"</td>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>Total Deaths</td>");
            out.println("<td>"+totalDeath+"</td>");
            out.println("</tr>");
            out.println("</table>");
            out.println("<hr>");
            out.println("<marquee>Stay At Home, Be Safe</marquee>");
            out.println("</body></html>");
            
            
            out.close();
    }
    
}
