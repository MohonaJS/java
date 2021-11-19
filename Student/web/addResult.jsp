<%@page import="student.dao.StudentRRDao" %>
<jsp:useBean id="r" class="student.model.StudentMM"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<%
    int i=StudentRRDao.save(r);
    
if(i>0){
    response.sendRedirect("success.jsp");

}else{
    response.sendRedirect("error.jsp");

}
    

%>
