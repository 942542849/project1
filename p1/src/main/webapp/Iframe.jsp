<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>

</head>
<body>
<style type="text/css">
.left{
width: 100px;
height: 20px;
}
.right{
width: 500px;
height: 400px;

}
</style>
<div class="left">
<a href="Book/index.action" target="rightframe">Book</a>
<a href="Type/index.action" target="rightframe">Type</a>
</div>
<div class="right">
<iframe src="Book/index.action " name="rightframe" width="500" height="400"></iframe>
</div>
</body>
</html>