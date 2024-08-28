<%@page import="java.awt.geom.Path2D"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%-- This is declaration --%>
<%! int x;
int y;
%>
<%-- this are scriptlets --%>
<%

x=10;
y=20;

%>
<%-- These are expresiions --%>
<h2>Value of X = <%=x  %></h2>
<h3>
value of Y =<%=y %></h3>
</body>
</html>