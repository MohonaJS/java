<% 
    String userName=request.getParameter("username");
    String password=request.getParameter("password");
    
    if(userName.equalsIgnoreCase("m") && password.equals("12")){
    response.sendRedirect("adminHome.jsp");
    
    
    }else{
     response.sendRedirect("errorAdminLogin.html");

}

%>