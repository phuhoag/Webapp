<%@ page contentType="text/html;charset=UTF-8" %>
<%@ page import="javax.servlet.http.*, javax.servlet.*" %>
<%
    String username = (session != null) ? (String) session.getAttribute("username") : null;
%>
<%
    if (username == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>
<html>
<head><title>Welcome</title></head>
<body>
    <h1>Welcome, <%= username %>!</h1>
</body>
</html>
