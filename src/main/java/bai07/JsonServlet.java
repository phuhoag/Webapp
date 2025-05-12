package bai07;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.IOException;

@WebServlet("/json")
public class JsonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("application/json;charset=UTF-8");

        String json = "{\n" +
                "  \"name\": \"Nguyen Van A\",\n" +
                "  \"email\": \"vana@example.com\",\n" +
                "  \"gender\": \"Nam\"\n" +
                "}";


        resp.getWriter().write(json);
    }
}
