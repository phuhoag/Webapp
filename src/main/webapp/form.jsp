<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="vi">
<head>
    <meta charset="UTF-8">
    <title>Form Nhập Tên và Tuổi</title>
</head>
<body>
    <h2>Nhập thông tin cá nhân</h2>
    <form action="display" method="post">
        <label>Họ và tên:</label>
        <input type="text" name="name" required><br><br>

        <label>Tuổi:</label>
        <input type="number" name="age" required><br><br>

        <button type="submit">Gửi</button>
    </form>
</body>
</html>
