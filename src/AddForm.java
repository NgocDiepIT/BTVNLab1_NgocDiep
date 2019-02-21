import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet( urlPatterns = { "/add" })
public class AddForm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = resp.getWriter();

        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Phép tính với 2 số</title></head>");
        writer.println("<body>");
        writer.println("<form method='post'>");
        writer.println("<table>");
        writer.println("<tr>");
        writer.println("<td><input name = 'num1'/></td>");
        writer.println("<td><select name ='option'>");
        writer.println("<option value = 'cong'>+</option>");
        writer.println("<option value = 'tru'>-</option>");
        writer.println("<option value = 'nhan'>*</option>");
        writer.println("<option value = 'chia'>/</option>");
        writer.println("</select></td>");
        writer.println("<td><input name = 'num2'/></td>");
        writer.println("</tr>");
        writer.println("</table>");
        writer.println("<td><input type='submit' value = 'KẾT QUẢ'/></td>");
        writer.println("</form>");
        writer.println("</body>");
        writer.println("</html>");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        req.setCharacterEncoding("UTF-8");
        PrintWriter writer = resp.getWriter();

        int result = 0;
        String handle = req.getParameter("option");

        if(handle.equalsIgnoreCase("cong"))
        {
            result = Integer.parseInt(req.getParameter("num1")) + Integer.parseInt(req.getParameter("num2"));
        }
        if(handle.equalsIgnoreCase("tru"))
        {
            result = Integer.parseInt(req.getParameter("num1")) - Integer.parseInt(req.getParameter("num2"));
        }
        if(handle.equalsIgnoreCase("nhan"))
        {
            result = Integer.parseInt(req.getParameter("num1")) * Integer.parseInt(req.getParameter("num2"));
        }
        if(handle.equalsIgnoreCase("chia"))
        {
            if(Integer.parseInt(req.getParameter("num2"))==0)
            {
                writer.println("Phép chia không thể thực hiện!");
            }
            result = Integer.parseInt(req.getParameter("num1")) / Integer.parseInt(req.getParameter("num2"));
        }
        writer.println("<html>");
        writer.println("<head>");
        writer.println("<title>Phép tính với 2 số</title></head>");
        writer.println("</head>");
        writer.println("<body><h1>Kết quả phép tính:</h1>");
        writer.println("<h1>" + result + "<h1>");
        req.setAttribute("result",result);
        writer.println("</body>");
        writer.println("</html>");
    }
}
