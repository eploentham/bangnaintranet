<%-- 
    Document   : admin_case_save
    Created on : Sep 22, 2009, 9:12:03 PM
    Author     : root
--%>

<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.Vector" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
String flag_redirect="", text="";
try{
    if(request.getParameter("flag_redirect")!=null) {
        flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
        }
    else {
        flag_redirect = "";
        }
    }
catch(Exception ex) {
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
