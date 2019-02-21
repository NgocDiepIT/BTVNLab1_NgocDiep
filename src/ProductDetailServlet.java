import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/productdetail")
public class ProductDetailServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        resp.getWriter().println("<h2>Item 1</h2>");
        resp.getWriter().println("</br><b>Price</b>: $8");
        resp.getWriter().println("</br><b>Description</b>: Lorem ipsum dolor sit amet, consectetur adipiscing elit");
    }
}