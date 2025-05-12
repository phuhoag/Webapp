package Bai08;

import jakarta.servlet.annotation.WebInitParam;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;

@WebServlet(
        urlPatterns = "/info2",
        initParams = {
                @WebInitParam(name = "companyName", value = "ABC Corp"),
                @WebInitParam(name = "website", value = "https://abc.com")
        }
)
public class InfoServlet2 extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        // Lấy tham số cấu hình
        String companyName = getServletConfig().getInitParameter("companyName");
        String website = getServletConfig().getInitParameter("website");

        // Thiết lập kiểu nội dung trả về
        resp.setContentType("text/html;charset=UTF-8");

        // In ra HTML
        resp.getWriter().println("<html><body>");
        resp.getWriter().println("<h2>Thông tin công ty</h2>");
        resp.getWriter().println("<p><strong>Tên công ty:</strong> " + companyName + "</p>");
        resp.getWriter().println("<p><strong>Website:</strong> <a href='" + website + "'>" + website + "</a></p>");
        resp.getWriter().println("</body></html>");
    }
}