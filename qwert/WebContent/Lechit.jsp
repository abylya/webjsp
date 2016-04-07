<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="java.util.LinkedList"%>
<%@page import="ru.com.klinika.ClinikRobota"%>
<%@page import="ru.com.klinika.Klient"%>
<%@page import="ru.com.klinika.Jivotnie"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: #DF8C5D">
<%request.setCharacterEncoding("UTF-8");%>
<%response.setContentType("text/html");response.setCharacterEncoding("utf-8"); %>
<h1 align="center">Зоо клиника</h1>
<%String nbrPasp=request.getParameter("nbrPasp"); %>
<%for(Klient k:ClinikRobota.cpicok){
	if(k.getPasport().equals(nbrPasp)){%>
	<form action="Lechit" >
	<input type="hidden" name="nbrPasp" value="<%=nbrPasp%>">
		<table border="1">
       <%for(Jivotnie j:k.getPitomez()) {%>  
		   <tr>
		        <td><%=j.getKlichka() %><input type="radio" name="klichka" value="<%=j.getKlichka()%>"> </td>         
		  </tr>
		  <%} %>
		  </table>
		   <p><input type="submit" value="Отправить"></p>
		</form>
	<% }%>
<% }%>

 <p> <a href="NewFile.html" > Вернутся в миню</a>
</body>
</html>