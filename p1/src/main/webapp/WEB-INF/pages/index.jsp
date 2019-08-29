<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8" isELIgnored="false"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
<form action="index">
<input name="txt"><input type="submit" value="查询">
</form>
<table>
<tr><td>编号</td><td>名称</td><td>性别</td><td>属性</td></tr>
<c:forEach items="${list}" var="r">
<tr><td>${r.id}</td><td>${r.name }</td><td>${r.sexname }</td><td>${r.typeid }</td></tr>
</c:forEach>
</table>

</body>
</html>