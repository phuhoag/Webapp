package com.example;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.IOException;

public class WelcomeServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("WelcomeServlet: init() called");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("WelcomeServlet: doGet() called");
        response.setContentType("text/html");
        response.getWriter().println("<h1>Welcome to our website!</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("WelcomeServlet: destroy() called");
    }
}
