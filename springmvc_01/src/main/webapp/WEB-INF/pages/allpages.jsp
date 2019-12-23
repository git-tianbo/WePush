<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
  <head>
    <title>Title</title>
  </head>
  <body>
  <br>
  你想添加用户吗？ 请点击这里：<a href = "/student/add"  >添加用户</a>
  </br>
  <td>
  <td>
  <table align="center" border="1" cellspacing="0">
      <tr>
         <td>id</td>
         <td>name</td>
         <td>qq</td>
         <td>type</td>
         <td>time</td>
         <td>stunum</td>
         <td>daily</td>
         <td>wish</td>
         <td>senior</td>
          <td>修改</td>
          <td>删除</td>
     </tr>
     <%--//接收controller给出的model数据--%>
     <%--c标签里封装了java循环语法--%>
     <c:forEach items ="${pagelist}" var="Student">
  <tr>
         <td>${Student.id}</td>
         <td>${Student.name}</td>
         <td>${Student.qq}</td>
         <td>${Student.type}</td>
         <td>${Student.time}</td>
         <td>${Student.stunum}</td>
         <td>${Student.daily}</td>
         <td>${Student.wish}</td>
         <td>${Student.senior}</td>
         <td><a href="/student/up/${Student.id}">修改</a></td>
         <td><a href="/student/delete/${Student.id}">删除</a></td>
         </tr>
  </c:forEach>
  </table>

  <td><a href="/student/AllPage">首页</a></td>
  <td><a href="/student/AllPage?pageNow=${prePage}">上一页</a></td>
  <td><a href="/student/AllPage?pageNow=${nextPage}">下一页</a></td>
  <td><a href="/student/AllPage?pageNow=${totalPages}">尾页</a></td>
  <td>当前第${pageNow}页</td>
  <td>总共${totalPages}页</td>
     <br>
     <form action="/student/AllPage">
         去<input type="text" name="pageNow">页
  <input type="submit" value="go">
     </form>
  </body>
</html>
