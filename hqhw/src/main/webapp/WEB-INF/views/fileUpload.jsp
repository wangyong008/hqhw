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
    <form action="upload/filesUpload" method="post"  enctype="multipart/form-data">  
        <p>选择文件:<input type="file" name="files"></p>
        <p>选择文件:<input type="file" name="files"></p>
        <p><input type="submit" value="提交"></p>
    </form>  
</body>
</html>