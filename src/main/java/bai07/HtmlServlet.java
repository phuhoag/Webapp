package bai07;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;

@WebServlet("/html")
public class HtmlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/html;charset=UTF-8");

        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h1>Chào mừng bạn đến với trang HTML</h1>");
        resp.getWriter().println("<p>Đây là đoạn văn được tạo từ Servlet</p>");
        resp.getWriter().println("</body></html>");
    }
}
