
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
<% Klient kl=new Klient();%>
<%boolean flag=false; %>
<%for(Klient k:ClinikRobota.cpicok){
	 if(k.getPasport().equals(nbrPasp)){
	flag=true;
		kl=k;%>
		<form action="Redaktor">
		
		<input type="hidden" name="hashcod" value="<%=nbrPasp%>">

		       
		             Имя клиента<input type="text" name="name" value="<%=kl.getImya()%>"><br>
		              <%for(Jivotnie j:kl.getPitomez()){ %>  
		              <%int i=kl.getPitomez().indexOf(j); %>   
		              Вид <%=i+1%>-го питомца<input type="text" name="vid<%=i%>" value="<%=kl.getPitomez().get(i).getVid()%>"><br>
		              Кличка <%=i+1%>-го питомца<input type="text" name="klichka<%=i%>" value="<%=kl.getPitomez().get(i).getKlichka()%>"><br>     
		              <%}%>
		          
		     
		     <p><input type="submit" value="Отправить"></p>
		</form>
	<%}
	 
 }%>
<% if(!flag){%> <h2>В списке нет такого клиента</h2><%} %>
<p>
<a href="NewFile.html" > Вернутся в миню</a>
</body>
</html>