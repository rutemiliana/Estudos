// arquivo MinhaServlet.java
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.*;

@WebServlet("/nome")
public class MinhaServlet extends HttpServlet {
   public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
      String paramNome = request.getParameter("pNome");
      PrintWriter out = response.getWriter();
      out.println("<html><head><meta charset=\"ISO-8859-1\"></head><body>O nome digitado é " + paramNome + "</body></html>");
   }
}
