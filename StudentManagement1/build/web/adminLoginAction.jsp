<% 
String userName=request.getParameter("username");
String password=request.getParameter("password");

if(userName.equalsIgnoreCase("admin")&& password.equals("1234")){
response.sendRedirect("adminHome.jsp");


}else{
response.sendRedirect("errorAdminLogin.html");
}

%>