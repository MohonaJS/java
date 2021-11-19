<%@page import="webtest7.dao.StudentDao" %>
<jsp:useBean id="s" class="webtest7.model.Student"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
    int i = StudentDao.save(s);
    
    if(i>0){
    response.sendRedirect("stSuccess.jsp");
}
     else {
     response.sendRedirect("stError.jsp");
}

%>