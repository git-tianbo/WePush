<%@ page language="java" contentType="text/html; charset=UTF-8"pageEncoding="UTF-8"%>
<%@ taglib prefix ="json" uri ="http://www.atg.com/taglibs/json"%>
 <html>
 <head>
 <title>用户</title>
</head>
<body>
<json:object>
    <json:property name="id" value="${s1.id}"/></br>
    <json:property name="name" value="${s1.name}"/></br>
    <json:property name="qq" value="${s1.qq}"/></br>
    <json:property name="type" value="${s1.type}"/></br>
    <json:property name="time" value="${s1.time}"/></br>
    <json:property name="stunum" value="${s1.stunum}"/></br>
    <json:property name="daily" value="${s1.daily}"/></br>
    <json:property name="wish" value="${s1.wish}"/></br>
    <json:property name="senior" value="${s1.senior}"/></br>
    <json:property name="code" value="${code}"/></br>
    <json:property name="message" value="${message}"/></br>
</json:object>
</body>
</html>
