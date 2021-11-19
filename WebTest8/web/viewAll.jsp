<%-- 
    Document   : viewAll
    Created on : 18-Mar-2021, 19:36:25
    Author     : chowd
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Our first java code</title>
    </head>
    <body>
     <%@page import="webtest8.dao.TeacherDao" %>
<%@page import="webtest8.model.Teacher" %>
<%@page import="java.util.*" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="t" %>

     <% 
         List<Teacher> list=TeacherDao.viewAll();
         request.setAttribute("list", list);
         %>

         <table width="100%" border="1">
             <tr bgcolor="aqua">
                 <td>Id</td>
                 <td>NAME</td>
                 <td>EMAIL</td>
                 <td>PASSWORD</td>
                 <td>GENDER</td>
                 <td>SUBJECT</td>
                 <td>ACTION</td>
             </tr>
             
             <t:forEach items="${list}" var="v">
                 <tr bgcolor="aqua">
                     <td>${v.getId()}</td>
                     <td>${v.getName()}</td>
                     <td>${v.getEmail()}</td>
                     <td>${v.getPassword()}</td>
                     <td>${v.getGender()}</td>
                     <td>${v.getSubject()}</td>
                     <td bgcolor="grey"> 
                         <a href="edit.jsp?id=${v.getId()}">Edit</a>
                         <a href="delete.jsp?id=${v.getId()}">Delete</a>
                     </td>
                 </tr>
                 
             </t:forEach>
         </table>
    </body>
</html>
