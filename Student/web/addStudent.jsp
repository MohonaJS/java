<%@page import="student.dao.StudentRRDao" %>
<jsp:useBean id="s" class="student.model.StudentMM"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
    int i=StudentRRDao.save(s);
    
    if(i>0 ){
    response.sendRedirect("success.jsp");
    
    }else{
         response.sendRedirect("error.jsp");
    }
    



%>