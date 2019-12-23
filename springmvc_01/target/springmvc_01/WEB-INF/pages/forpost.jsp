<%@ page contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    <title>请插入数据</title>
  </head>
  <body>
  <br>请在下方的表单中插入你的数据:</br>
  </br>
  </br>

  <form action ="/student/addstudent"  method="POST">
    <table>
        <tr>
        <td>学生ID:<input = "text"  name="id" ></td>
        </tr>
        <tr>
        <td>学生姓名:<input = "text"  name="name" ></td>
        </tr>
        <tr>
        <td>学生QQ号:<input = "text"  name="qq" ></td>
        </tr>
        <tr>
        <td>学习类型:<input = "text"  name="type" ></td>
        </tr>
        <tr>
        <td>
        入学时间:<input = "text"  name="time" ></td>
        </tr>
        <tr>
        <td>学号:<input = "text"  name="stunum" ></td>
        </tr>
         <tr>
         <td>日报:<input = "text"  name="daily" ></td>
         </tr>
         <tr>
         <td>立下愿望:<input = "text"  name="wish" ></td>
         </tr>
         <tr>
         <td>他的师兄:<input = "text"  name="senior" ></td>
         </tr>
         <tr>
         <td>提交按钮：<input type = "submit" value = "提交"></td>
         </tr>
         </table>
       </form>
    </body>
</html>