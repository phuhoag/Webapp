package bai07;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import jakarta.servlet.*;
import java.io.*;

@WebServlet("/image")
public class ImageServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String imagePath = "/resources/cat.jpg"; // ảnh nằm trong webapp/resources
        ServletContext context = getServletContext();
        InputStream is = context.getResourceAsStream(imagePath);

        if (is == null) {
            resp.sendError(HttpServletResponse.SC_NOT_FOUND); // 404 nếu không tìm thấy ảnh
            return;
        }

        resp.setContentType("image/png"); // hoặc "image/jpeg"
        OutputStream os = resp.getOutputStream();

        byte[] buffer = new byte[1024];
        int bytesRead;

        while ((bytesRead = is.read(buffer)) != -1) {
            os.write(buffer, 0, bytesRead);
        }

        is.close();
        os.close();
    }
}
