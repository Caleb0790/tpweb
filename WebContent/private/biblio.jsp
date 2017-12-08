<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ include file="inc/header.jsp"%>
<%@page import="tp.data.*"%>
<%@page import="java.util.List"%>
<body>

	<% 
		Library lib=Library.getInstance();
		List<Book> allBooks= lib.getAll();
	%>
	<table>
		<tr>
			<th>ID</th>
			<th width=200px>Titre</th>
			<th>nombre de pages</th>
		</tr>
		<% 
			for(Book b : allBooks){
		%>
		<tr>
			<td><a href="bookdetail.jsp?id=<%=b.getId()%>"><%= b.getId()%></td>
			<td><%= b.getTitle() %></td>
			<td><%= b.getNbPages()%></td>	
		</tr>
		<%} %>
	</table>

</body>

<%@ include file="inc/footer.jsp"%>