<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="tp.data.*"%>
<%@page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
	<% 
		Library lib=Library.getInstance();
		Book book= lib.getById(Integer.parseInt(request.getParameter("id")));
	%>
	<h1>Title: <%= book.getTitle()%></h1>
	<p>Pages: <%= book.getNbPages() %></p>
	<p>Mots clées: 
		<%= book.getKeywords()
		%>
			
	</p>
</body>
</html>