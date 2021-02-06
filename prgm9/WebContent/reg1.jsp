<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*,javax.sql.*"%>

<%!
	Connection con;
	String name;
	String regno;
	String password;
	String email;
	Statement ob;
	int rows;
%>
<%
con = null;
	Class.forName("com.mysql.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3310/lab8","root","");
	System.out.println("Database Connected Successfully");
	ob = con.createStatement();
	name  = request.getParameter("name");
	regno  = request.getParameter("regno");
	password  = request.getParameter("password");
	email  = request.getParameter("email");
	String query="insert into details1 values(?,?,?,?)";
	PreparedStatement psmt=con.prepareStatement(query);
	psmt.setString(1,name);
	psmt.setString(2,regno);
	psmt.setString(3,password);
	psmt.setString(4,email);
	rows=psmt.executeUpdate();
	if(rows > 0) {%>
		<h1>data inserted successfully</h1>
		<%
	}
	else {%>
		<h1>Data is not inserted</h1>
		<%
	}
%>

</body>
</html>