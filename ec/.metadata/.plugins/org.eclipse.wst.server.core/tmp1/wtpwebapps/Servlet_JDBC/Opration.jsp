<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<center>
<h2> wel - Come <i><%= request.getAttribute("user") %></i></h2>
<a href = "insert.jsp">Insert |</a>
<a href = "delete.jsp">Delete |</a>
<a href = "update.jsp">Update |</a>
<a href = "select.jsp">Select</a>
</center>
</body>
</html>