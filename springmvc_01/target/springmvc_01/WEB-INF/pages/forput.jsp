<%--
  Created by IntelliJ IDEA.
  User: 30252
  Date: 2019/12/6
  Time: 22:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>更改</title>
  </head>
  <body>
 <br>请更改学员的姓名</br>
  </br>
  </br>
  <form action="/student/update" method = "POST"">
  <td><input type ="hidden" name="id" value="${s.id}"></td>
  <td>您要更改的更改学生姓名: <input type = "text"  name="name"  value ="${s.name}"></td>
  <td><input type= "hidden"  name="qq"  value ="${s.qq}"></td>
  <td><input type= "hidden"  name="type"  value ="${s.type}"></td>
  <td><input type= "hidden"  name="time"  value ="${s.time}"></td>
  <td><input type= "hidden"  name="stunum"  value ="${s.stunum}"></td>
  <td><input type= "hidden"  name="daily"  value ="${s.daily}"></td>
  <td><input type= "hidden"  name="wish"  value ="${s.wish}"></td>
  <td><input type= "hidden"  name="senior"  value ="${s.senior}"></td>
     <input type="submit" value="确认">
     </form>
  </body>
</html>
