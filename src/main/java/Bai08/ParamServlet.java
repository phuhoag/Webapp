package Bai08;

import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(
        urlPatterns = "/params",
        initParams = {
                @WebInitParam(name = "author", value = "Nguyen Van A"),
                @WebInitParam(name = "email", value = "a@example.com"),
                @WebInitParam(name = "language", value = "Java EE")
        }
)
public class ParamServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletConfig config = getServletConfig();
        Enumeration<String> paramNames = config.getInitParameterNames();

        resp.setContentType("text/html;charset=UTF-8");
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h2>Danh sách tham số khởi tạo</h2>");
        resp.getWriter().println("<table border='1' cellpadding='5'>");
        resp.getWriter().println("<tr><th>Tên tham số</th><th>Giá trị</th></tr>");

        while (paramNames.hasMoreElements()) {
            String name = paramNames.nextElement();
            String value = config.getInitParameter(name);
            resp.getWriter().println("<tr><td>" + name + "</td><td>" + value + "</td></tr>");
        }

        resp.getWriter().println("</table>");
        resp.getWriter().println("</body></html>");
    }
}
