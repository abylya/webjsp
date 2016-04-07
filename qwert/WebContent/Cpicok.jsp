

<%@page import="java.util.LinkedList"%>
<%@page import="ru.com.klinika.ClinikRobota"%>
<%@page import="ru.com.klinika.Klient"%>
<%@page import="ru.com.klinika.Jivotnie"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

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

<table border="1">
   <tr>
       <th>Имя клиента</th>
       <th>Номер паспорта</th>
       <th>Вид питомца</th>
       <th>Кличка питомца</th>
       <th>Действие</th>      
  </tr>
 
  <%for(Klient k:ClinikRobota.cpicok){ %>
  
   <tr>
       <td><%=k.getImya() %> </td>
       <td><%=k.getPasport() %></td>
    
       <td><%for(Jivotnie j:k.getPitomez()) {%><%=j.getVid() %><br><%}%></td>
       <td><%%><%for(Jivotnie j:k.getPitomez()) {%><%=j.getKlichka() %>--> <%if(j.isZdorovie()==false){ %>болен<%}else{ %>
       здоров<%} %><br><%}%></td>
        
       <td> <a href="Redaktor.jsp?naim=<%=k.getImya()%>&nbrPasp=<%=k.getPasport()%>">Редактировать </a><br>
       <a href="Delit?naim=<%=k.getImya()%>&nbrPasp=<%=k.getPasport()%>">Удалить</a><br>
       <a href="Lechit.jsp?nbrPasp=<%=k.getPasport()%>">Лечить</a></td>
       
  </tr>
  <%} %>
</table>
 <%if(ClinikRobota.cpicok.isEmpty()){ %>
   <h3>Список пуст</h3><%} %>
<p>
<a href="NewFile.html" > Вернутся в миню</a>
</body>
</html>