<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add Student</title>
</head>
<body>
	<%
		String validate = (String) request.getAttribute("errorLabel");
		String setName = (String) request.getAttribute("setName");
		String setCgpi = (String) request.getAttribute("setCgpi");
		
		if (validate == null)
			validate = "";
		if(setName==null)
			setName="";
		if(setCgpi==null)
			setCgpi="";
	%>
	<form method="post" action="add">
		Name:<input type="text" name="Name" value="<%=setName%>"><br>
		<br> CGPI:<input type="text" name="Cgpi" value="<%=setCgpi%>"><br>
		<br> <label style="color: red;" name="errorLabel"><%=validate%></label><br> <br>
		<button name="add">Add</button>

	</form>
</body>
</html>