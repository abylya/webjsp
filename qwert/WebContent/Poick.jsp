<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body style="background-color: #DF8C5D">
<h1 align="center">Зоо клиника</h1>
<%request.setCharacterEncoding("UTF-8");%>
<%response.setContentType("text/html");response.setCharacterEncoding("utf-8"); %>
<form action="Redaktor.jsp" >
    Вудите номер паспорта  <input type="text" name="nbrPasp">
   <p><input required type="submit" value="Отправить"></p>
  </form>
  
<a href="NewFile.html" > Вернутся в миню</a>

</body>
</html>