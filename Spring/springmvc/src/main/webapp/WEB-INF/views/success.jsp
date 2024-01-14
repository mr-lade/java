<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success Page</title>
</head>
<body>
<h1>Registration Successful</h1>
<h1>Your Registration Details are as follows:-</h1>
<% 
String name= (String)request.getAttribute("name");
String email= (String)request.getAttribute("email");
String password= (String)request.getAttribute("password");
%>
<h1>The username is :- <%=name %></h1>
<h1>The Email is :- <%=email %></h1>
<h1>The Password is :- <%=password %></h1>


</body>
</html>