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
	  <h1>Update Window</h1>
	  <h3><i> Note*:- New data to update </i></h3>
	  <form action="Update" method="post">
	    Enter RollNO :<input type="text" name="rollno"><br>
	    Enter First-Name :<input type="text" name="fname"><br>
	    Enter Last-Name :<input type="text" name="lname"><br>
        Enter Address :<input type="text" name="addr"><br>
        Enter Email-ID :<input type="text" name="email"><br>
        Enter Mobile-No :<input type="text" name="mno"><br>
        Enter Course :<input type="text" name="course"><br>
        Enter Date-of-Birth :<input type="text" name="dob"><br>
        <input type="submit" value="Update"><br>
	  </form>	
	</center>
</body>
</html>