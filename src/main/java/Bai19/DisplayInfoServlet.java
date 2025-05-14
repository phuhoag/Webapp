package Bai19;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet(name = "displayInfoServlet", urlPatterns = {"/display"})
public class DisplayInfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");  // Đảm bảo tiếng Việt
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String age = request.getParameter("age");

        response.getWriter().println("<h2>Thông tin bạn vừa nhập:</h2>");
        response.getWriter().println("<p>Họ tên: " + name + "</p>");
        response.getWriter().println("<p>Tuổi: " + age + "</p>");
    }
}

