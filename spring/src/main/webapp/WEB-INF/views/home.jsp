<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>

<form method="get" action="<%=request.getContextPath()%>/">
	<input name="num1" value="${a}">
	<input name="num2" value="${b}">
	<input name="res" value="${c}" readonly>
	<br>
	<button>결과</button>
</form>
<form method="get" action="<%=request.getContextPath()%>/">
	<input name="count" value="${count}" readonly>
	<button>증가</button>
</form>
</body>
</html>
