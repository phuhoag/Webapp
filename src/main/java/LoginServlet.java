package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private String welcomeMessage;

    @Override
    public void init() throws ServletException {
        // Lấy giá trị từ init-param trong web.xml
        welcomeMessage = getServletConfig().getInitParameter("welcomeMessage");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        response.getWriter().println("<h1>" + welcomeMessage + "</h1>");
        response.getWriter().println("<h2>Đăng nhập thành công!</h2>");
    }
}
