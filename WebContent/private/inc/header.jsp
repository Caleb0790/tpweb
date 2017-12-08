<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@page import="tp.data.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Ma biblio</title>
</head>
	<style>
	table tr:nth-child(even) {
	    background-color: #eee;
	}
	table tr:nth-child(odd) {
	   background-color:#fff;
	}
	table th {
	    background-color: black;
	    color: white;
	}
	</style>
<h1>Welcome in my biblio dude</h1>
	<form action="./logout"><input type="submit" value="Déconnexion"></form>
		<% UserBean usr= (UserBean)session.getAttribute("USER"); %>
	Hello  <%= usr.getLogin() %> connecté depuis <%= usr.getLoginDate() %>