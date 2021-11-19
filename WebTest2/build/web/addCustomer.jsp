<%@page import="webtest2.dao.CustomerDao" %>
<jsp:useBean id="c" class="webtest2.model.Customer"></jsp:useBean>
<jsp:setProperty property="*" name="c"></jsp:setProperty>

<%
    int i=CustomerDao.save(c);
    if(i>0) {
    response.sendRedirect("success.jsp");
    
    }else  {
    
     response.sendRedirect("error.jsp");
    }
%>
