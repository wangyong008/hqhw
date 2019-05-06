<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Insert title here</title>
</head>
<body>

	<h2>上传多个文件 实例</h2>
	<form action="Test/a" method="post">
		<p>
			<input type="submit" value="提交">
		</p>
	</form>
	<script src="js/jquery-3.3.1.js"></script>
	<script type="text/javascript">
		var a = $("#a");
		~function() {
			a.click(function() {
				$.ajax({
					url : "",
					type : "post",
					data : {ad:"123"},
					dataType:"json",
					contentType:"application/json;charset=UTF-8",
					success:function(code){
						alert(1);
					}
					});
			});
		}();
	</script>
</body>
</html>