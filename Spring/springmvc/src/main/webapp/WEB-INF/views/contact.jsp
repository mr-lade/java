<%@ page import ="java.util.List" %>
<%@ page import ="java.util.ArrayList.*"%>
<%@ page import =" java.util.Arrays"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact Page</title>
</head>
<body>
<h1>This is Contact Page</h1>
<h1>Thankyou for Contacting Us</h1>
<% 
String s= (String)request.getAttribute("name");
Integer i= (Integer)request.getAttribute("id");
%>
<h1>The name is=<%=s %></h1>
<h1>The id is=<%=i %></h1>
</body>
</html>