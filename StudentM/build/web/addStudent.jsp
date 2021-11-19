<%@page import="studentm.dao.StudentMDao" %>
<jsp:useBean id="s" class="studentm.model.StudentM"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
    int i=StudentMDao.save(s);
    
    if(i>0 ){
    response.sendRedirect("success.jsp");
    
    }else{
         response.sendRedirect("error.jsp");
    }
    



%>
