package Bai18;

import jakarta.servlet.ServletException;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class VisitCounterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        ServletContext context = getServletContext();

        // Đọc giá trị hiện tại
        Integer count = (Integer) context.getAttribute("visitCount");

        if (count == null) {
            count = 1; // Lần truy cập đầu tiên
        } else {
            count++;   // Tăng biến đếm
        }

        // Gán lại vào ServletContext
        context.setAttribute("visitCount", count);

        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().println("<h2>Tổng số lượt truy cập: " + count + "</h2>");
    }
}
