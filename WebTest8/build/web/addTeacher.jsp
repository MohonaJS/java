<%@page import="webtest8.dao.TeacherDao" %>
<jsp:useBean id="t" class="webtest8.model.Teacher"></jsp:useBean>
<jsp:setProperty property="*" name="t"></jsp:setProperty>

<% 
int i=TeacherDao.save(t);
    if(i>0){
        response.sendRedirect("success.jsp");
    }else{
    response.sendRedirect("error.jsp");

    }
%>