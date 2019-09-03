<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html >
<html>
<head>
<meta content="utf-8">
<title></title>
</head>
<body>
<style>
.left{
	width: 15%;
	height: 500px;
}
.right{
	width: 85%;
	height: 500px;
	position: absolute;
	left: 15%;
	top: 0px;
}
</style>
<script type="text/javascript">
function ok(o) {
	if(o.contentWindow.location.href.indexOf("login")>0){
		open("../login.html","_self")
	}
}


</script>

<a href="User/outlogin">注销</a>
<div class="left">
<a href="Book/index" target="right">book</a>
<a href="Type/index" target="right">type</a>
</div>

<div class="right">
<iframe name="right" width="300" height="300" src="Book/index" onload="ok(this);"></iframe>
</div>
</body>
</html>