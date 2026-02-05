<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor = "YELLOW">

<h1>

<%

String name = request.getParameter("name");
String phone = request.getParameter("phone");

out.println("Name is:- "+name);
out.println("<br>Phone is:- "+phone);

%>
</h1>

</body>
</html>