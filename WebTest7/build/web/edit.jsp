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
    </head>
    
     <%@page import="webtest7.dao.ResultDao" %>
         <%@page import="webtest7.model.Result" %>
         <%@page import="java.util.*" %>
         
     
         
         <% 
         String id = request.getParameter("id");
         Result r=ResultDao.find(Integer.parseInt(id));
         %>
         
    
    <body>
         <form action="editform.jsp" method="post"> 
             <input type="hidden" name="id" value="<%=r.getId()%>"/>
            <label>Name</label> <input type="text" name="name" value="<%=r.getName()%>"/><br><br>
            <label>Email</label> <input type="email" name="email" value="<%=r.getEmail()%>"/><br><br>
            <label>Address</label> <input type="text" name="address" value="<%=r.getAddress()%>"><br><br>
            <label>Password</label> <input type="password" name="password" value="<%=r.getAddress()%>"><br><br>
            <label>District</label> 
            <select name="district" value="<%=r.getDistrict()%>">
                <option >--Select--</option>
                <option name="Dhaka">Dhaka</option>
                <option name="Chittagong">Chittagong</option>
                <option name="Khulna">Khulna</option>
                <option name="Cumilla">Cumilla</option>
                <option name="Chandpur">Chandpur</option>
            
            </select><br><br>
            <input type="submit" value="Update">
        </form>
    </body>
</html>
