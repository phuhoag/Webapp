<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Form Thông Tin</title>
</head>
<body>

    <h2>Nhập Thông Tin</h2>
       <form action="info" method="post">
           Họ tên: <input type="text" name="name"><br><br>
           Email: <input type="email" name="email"><br><br>
           Giới tính:
           <input type="radio" name="gender" value="Nam">Nam
           <input type="radio" name="gender" value="Nữ">Nữ<br><br>
           Sở thích:<br>
           <input type="checkbox" name="hobbies" value="Đọc sách">Đọc sách<br>
           <input type="checkbox" name="hobbies" value="Du lịch">Du lịch<br>
           <input type="checkbox" name="hobbies" value="Nghe nhạc">Nghe nhạc<br><br>
           <input type="submit" value="Gửi">
       </form>
</body>
</html>


