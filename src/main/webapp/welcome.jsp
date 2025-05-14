<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="jakarta.servlet.RequestDispatcher" %>

<%
    String name = request.getParameter("username");

    if (name == null || name.trim().isEmpty()) {
%>
        <p>Không nhận được tên. Vui lòng <a href="input.jsp">quay lại</a> và nhập tên.</p>
<%
    } else {
        // Gửi tiếp nội dung tới chính trang này (chỉ ví dụ về RequestDispatcher)
        RequestDispatcher rd = request.getRequestDispatcher("welcome.jsp");
        out.println("<h2>Xin chào, " + name + "!</h2>");
    }
%>

