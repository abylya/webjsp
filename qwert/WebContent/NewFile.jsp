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
<h3>Выберите количество больных питомцев<br> 
    не больше 4-х</h3>
 <form action="AddKlient.jsp" >
   <p><select required  size="4" name="selekt" >
    
    <option value=1>1</option>
    <option value=2>2</option>
    <option value=3>3</option>
    <option value=4>4</option>
   </select></p>
   <p><input type="submit" value="Отправить"></p>
  </form>
    
     <br>
                     <a href="NewFile.html" > Вернутся в миню</a>
</body>
</html>