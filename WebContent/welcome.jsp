<%@page import="model.bean.Wife"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<% 
		ArrayList<Wife> wifeArray = (ArrayList<Wife>) request.getAttribute("wifeArray"); 
		for(int i = 0; i < wifeArray.size(); i++){
	%>
		<tr>
			<td><%= wifeArray.get(i).getName() %></td>
			<td><%= wifeArray.get(i).getAddress() %></td>
			<td><%= wifeArray.get(i).isAlive() %></td>
		</tr>
	<%
		}
	%>
</table>
</body>
</html>