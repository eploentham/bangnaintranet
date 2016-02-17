<%-- 
    Document   : pageredirect
    Created on : 21 ก.ค. 2552, 18:16:17
    Author     : pop
--%>

<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
String page_redirect="";
if(request.getParameter("page_redirect")!=null){
        page_redirect = new String (request.getParameter("page_redirect").getBytes("ISO8859_1"),"TIS-620");
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
    </head>
    <body onload="changepage(<%out.print(page_redirect);%>);">
        <form name="pageredirect" id="pageredirect" >
            <input type="hidden" name="txt_page_redirect" value="<%out.print(page_redirect);%>" />
            <%
//response.sendRedirect("http://172.1.1.3/intranet/index.php?option=com_weblinks&view=category&id=51&Itemid=64");
            %>
        </form>
    </body>
    <script>
        function changepage() {
            //alert(document.getElementById('pageredirect').value);
            window.open("nurse_wound_care_add.jsp",'_blank',true,
    'channelmode=no,status=no,fullscreen=no,menubar=no,resizable=no,scrollbars=no,location=no,directories=no');
    return false;
          }
    </script>
</html>
