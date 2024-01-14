<%@page import="com.mit.dao.UserDao"%>
<jsp:useBean id="u" class="com.mit.bean.User"></jsp:useBean>
<jsp:setProperty property="*" name="u"/>

<%
int i=UserDao.update(u);
response.sendRedirect("viewusers.jsp");
%>