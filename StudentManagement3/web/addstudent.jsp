<%@page import="studentmanagement3.dao.StudentManagementDao"%>
<jsp:useBean id="s" class="studentmanagement3.model.Smanagement"></jsp:useBean>
<jsp:setProperty property="*" name="s"></jsp:setProperty>

<% 
int i = StudentManagementDao.save(s);
if(i>0){
    response.sendRedirect("success.jsp");


}else{
    response.sendRedirect("error.jsp");
    

}




%>