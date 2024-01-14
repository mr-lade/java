<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Help Page</title>
</head>
<body>
<h1>This is Help Page</h1>
<h1>Flow of Data From Controller to View</h1>
<% 
String s= (String)request.getAttribute("name");
Integer i = (Integer)request.getAttribute("id");
%>
<h1>The name is :<%=s %> </h1>
<h1>The id is :<%=i%> </h1>

</body>
</html>