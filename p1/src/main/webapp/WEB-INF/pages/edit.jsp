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
<select name="sex">
<c:forEach items="${sexs}" var="r" varStatus="v">
<option value="${v.index}">${r}</option>
</c:forEach>
</select>
<input type="submit">
</form>
</c:if>
<c:if test="${info!=null}">
<form action="update" method="post">
<input name="id" type="hidden" value="${info.id}">
<input name="name" value="${info.name}">
<select name="sex">
<c:forEach items="${sexs}" var="r" varStatus="v">
 <c:if test="${info.sex!=v.index}" >
<option value="${v.index}">${r}</option>
</c:if> 
 <c:if test="${info.sex==v.index}" >
<option value="${v.index}"selected="selected">${r}</option>
</c:if> 
</c:forEach>
</select>
<input type="submit">
</form>
</c:if>

</body>
</html>