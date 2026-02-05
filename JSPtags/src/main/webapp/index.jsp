<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="YELLOW">

<%-- Comment Tag --%>

<%--Declarative Tag --%>
<%!
 int pincode = 2013308;

 String getAddress()
 {
	 return "GreaterNodia";
 }
%>

<%--Expression Tag--%>

<%
out.print("Pincode is:- "+pincode);
out.print("<br>Address is:- "+getAddress());
%>

<br><br>
<%--Expression Tag --%>

<%= "Welcome to Ainwik Infotech." %>

</body>
</html>