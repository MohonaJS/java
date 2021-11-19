<% 
String userName=request.getParameter("username");
String password=request.getParameter("password");

if(userName.equalsIgnoreCase("Mohona") && password.equals("123")){
    response.sendRedirect("adminHome.jsp");


}else{
      response.sendRedirect("errorAdminLogin.html");

}

%>
