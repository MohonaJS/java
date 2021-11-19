<%@page import="studentmanagement.dao.StudentResultDao" %>
<jsp:useBean id="r" class="studentmanagement.model.StudentResult"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<% 
int i =StudentResultDao.save(r);
if(i>0){
    response.sendRedirect("success1.jsp");

}else{
    response.sendRedirect("error.jsp");
}

%>