<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%@ taglib prefix ="json" uri ="http://www.atg.com/taglibs/json"%>
 <html>
 <head>
 <title>根据ID查询用户</title>
</head>
 <body>
<json:object>
    <json:property name="id" value="${s.id}"/></br>
    <json:property name="name" value="${s.name}"/></br>
    <json:property name="qq" value="${s.qq}"/></br>
    <json:property name="type" value="${s.type}"/></br>
    <json:property name="time" value="${s.time}"/></br>
    <json:property name="stunum" value="${s.stunum}"/></br>
    <json:property name="daily" value="${s.daily}"/></br>
    <json:property name="wish" value="${s.wish}"/></br>
    <json:property name="senior" value="${s.senior}"/></br>
    <json:property name="code" value="${code}"/></br>
    <json:property name="message" value="${message}"/></br>
</json:object>
</body>
</html>