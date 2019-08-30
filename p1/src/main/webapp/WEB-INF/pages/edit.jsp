<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title></title>
</head>
<body>
<c:if test="${info==null}">
<form action="insert" method="post">
<input name="name" value="">
<input type="submit">
</form>
</c:if>
<c:if test="${info!=null}">
<form action="update" method="post">
<input name="id" type="hidden" value="${info.id}">
<input name="name" value="${info.name}">
<input type="submit">
</form>
</c:if>

</body>
</html>