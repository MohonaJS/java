<%-- 
    Document   : edit
    Created on : 14-Mar-2021, 09:38:09
    Author     : chowd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style><%@include file="style.css"%></style>
    </head>
    
     <%@page import="webtest8.dao.TeacherDao" %>
         <%@page import="webtest8.model.Teacher" %>
         <%@page import="java.util.*" %>
         
     
         
         <% 
         String id = request.getParameter("id");
         Teacher t=TeacherDao.find(Integer.parseInt(id));
         %>
         
    
    <body>
       <form action="editForm.jsp" method="post"> 
           <table width="30%" bgcolor="aqua" border="1" class="table">
                <input type="hidden" name="id" value="<%=t.getId()%>"/>
                <tr id="name">
                    <td>Name</td>
                    <td>:</td>
                    <td><input type="text" name="name" value="<%=t.getName()%>"/></td>
                </tr> 
                
                <tr>
                    <td>Email</td>
                    <td>:</td>
                    <td><input type="email" name="email" value="<%=t.getEmail()%>"/></td>
                </tr> 
                
                <tr>
                    <td>password</td>
                    <td>:</td>
                    <td><input type="text" name="password" value="<%=t.getPassword()%>"></td>
                </tr> 
                <tr> 
                    <td>Gender</td>
                     <td>:</td>
                      <td>
                        Male <input type="radio" name="gender" value="male">
                        Female <input type="radio" name="gender" value="female">
                        Other <input type="radio" name="gender" value="other">
                      </td>
                </tr>
                <tr>
                    <td>Subject</td>
                    <td>:</td>
                    <td>
                        <select name="subject" value="<%=t.getSubject()%>">
                            <option>Select</option>
                            <option>Swedish</option>
                            <option>English</option>
                            <option>Bangla</option>
                            <option>Math</option>


                        </select>
                </td>
                </tr>
                <tr>
                    <td>
                <input type="submit" value="update">
                </td>   
                </tr>
            </table>
        </form>
        
    </body>
</html>
