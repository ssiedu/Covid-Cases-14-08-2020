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
            out.println("Thanks For Visiting Us.");
            out.println("Total Cases In "+country+" : "+totalCases);
            out.println("Active Cases In "+country+" : "+activeCases);
            out.println("Total Deaths Cases In "+country+" : "+totalDeath);
            
            out.close();
    }
    
}
