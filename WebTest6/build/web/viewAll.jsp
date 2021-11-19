<%@page import="java.util.List" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%@page import="webtest6.dao.ResultDao" %>
        <%@page import="webtest6.model.Result" %>
        <%@page import="java.util.*" %>
        <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="m" %> 
        <% 
        List<Result> list = ResultDao.viewAll();
        request.setAttribute("list", list);
        %>
 <table border="2" width="50%" color="hotpink">
     
     <tr>
         <th>ID </th>
         <th>Name </th>
         <th> EMAIL</th>
         <th> ADDRESS</th>
         <th>PASSWORD </th>
         <th> DISTRICT</th>
         <th> Action</th>
     </tr>
     <m:forEach items="${list}" var="s">
         <tr>
             <td>${s.getId()}</td>
             <td>${s.getName()}</td>
             <td>${s.getEmail()}</td>
             <td>${s.getPassword()}</td>
             <td>${s.getAddress()}</td>
             <td>${s.getDistrict()}</td>
             <td>
                 Edit  Delete 
                 
                 <a href="edite.jsp?id=${s.getId()}">-Edit-</a>
                 <a href="deleteform.jsp?id=${s.getId()}">Delete</a>
             </td>
             
             
         </tr>
         
     </m:forEach>
     
 </table> 
 
 
        
        
        
    </body>
</html>
