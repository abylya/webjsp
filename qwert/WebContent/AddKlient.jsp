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
<%int n=Integer.valueOf(request.getParameter("selekt")); %>

 
      <form action="ServAddKlient?id=<%=n %>" method="post" >
     
           <table align="center">
              <tr>
                   <td>Ведите имя клиента
                   <td><input required type="text" name="naim">
              </tr>

               <tr>
                   <td>Ведите первые 2-е буквы паспорта 
                   <td><input required type="text" name="BykPasport" pattern="[A-Za-zА-Яа-яЁё]{2}">
               </tr>
               
                 <tr>
                   <td>Ведите 4-е цыфры паспорта 
                   <td><input required type="text" name="NbrPasport" pattern="[0-9]{4}">
               </tr>
  <%for(int i=0;i<n;i++){ %>
   
                <tr>
              
                    <td>Ведите вид <%=i+1%> животного клиента
                      <td><input required type="text" name="vid<%=i %>">
                </tr>

                <tr>
                      <td>Ведите кличку <%=i+1%> животного клиента
                      <td><input required type="text" name="klichka<%=i %>">
                </tr>
      <%} %>
                 <tr>
                        <td><input required type="submit" value="отправить">
                 </tr>
                 
         </table>               
            
    </form>
     <br>
                     <a href="NewFile.html" > Вернутся в миню</a>
</body>
</html>