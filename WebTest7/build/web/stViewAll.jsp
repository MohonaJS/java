<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
         <%@page import="webtest7.dao.StudentDao" %>
         <%@page import="webtest7.model.Student" %>
         <%@page import="java.util.*" %>
         
         <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %>
         <% 
         List<Student> list=StudentDao.viewAll();
         request.setAttribute("list", list);
         %>
         
         <table border="1px solid black" width="80%">
             <tr>
                 <th>ID</th>
                 <th>NAME</th>
                 <th>EMAIL</th>
                 <th>Age</th>
                 <th>Subject</th>
                 <th>Gender</th>
                 <th>ACTION</th>
             </tr>
             <tbody>
                 <m:forEach items="${list}" var="s">
                     <tr>
                         <td>${s.getId()}</td>
                         <td>${s.getName()}</td>
                         <td>${s.getEmail()}</td>
                         <td>${s.getAge()}</td>
                         <td>${s.getSubject()}</td>
                         <td>${s.getGender()}</td>
                         <td>
                            
                             <a href="stEdit.jsp?id=${s.getId()}">Edit</a>
                             <a href="stDelete.jsp?id=${s.getId()}">Delete</a>
                         </td>
                     </tr>
                 </m:forEach>
             </tbody>
             
             
             
         </table>
     
    </body>
</html>
