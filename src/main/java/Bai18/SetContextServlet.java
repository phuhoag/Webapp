package Bai18;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SetContextServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ServletContext context = getServletContext();
        context.setAttribute("siteName", "Học Lập Trình");

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h2>Đã đặt thuộc tính siteName vào ServletContext!</h2>");
    }
}
