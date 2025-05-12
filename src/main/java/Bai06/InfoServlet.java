package Bai06;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import java.io.IOException;

@WebServlet("/info")
public class InfoServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");

        String name = request.getParameter("name");
        String email = request.getParameter("email");
        String gender = request.getParameter("gender");
        String[] hobbies = request.getParameterValues("hobbies");

        response.getWriter().println("<html><body>");
        response.getWriter().println("<h2>Thông tin bạn nhập:</h2>");
        response.getWriter().println("Họ tên: " + name + "<br>");
        response.getWriter().println("Email: " + email + "<br>");
        response.getWriter().println("Giới tính: " + gender + "<br>");
        response.getWriter().println("Sở thích: ");
        if (hobbies != null) {
            for (String hobby : hobbies) {
                response.getWriter().print(hobby + " ");
            }
        } else {
            response.getWriter().print("Không chọn");
        }
        response.getWriter().println("</body></html>");
    }
}