<%@page import="studentmanagement2.dao.ViewresultDao" %>
<jsp:useBean id="r" class="studentmanagement2.model.Viewresult"></jsp:useBean>
<jsp:setProperty property="*" name="r"></jsp:setProperty>

<%
int i = ViewresultDao.save(r);

if(i>0){
    response.sendRedirect("successful.jsp");


}else{
    response.sendRedirect("error.jsp");
}



%>