

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;

@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("LifeCycleServlet: init() called");
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("LifeCycleServlet: doGet() called");
        response.setContentType("text/html");
        response.getWriter().println("<h1>This is LifeCycleServlet</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        System.out.println("LifeCycleServlet: doPost() called");
        response.setContentType("text/html");
        response.getWriter().println("<h1>LifeCycleServlet POST request</h1>");
    }

    @Override
    public void destroy() {
        System.out.println("LifeCycleServlet: destroy() called");
    }
}
