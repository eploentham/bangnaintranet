<%-- 
    Document   : noti_repair_upload_file
    Created on : 11 ก.ค. 2552, 12:32:32
    Author     : pop
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import ="java.io.File" %>
<%@page import ="bangnaintranet.*" %>
<%@ page language="java" import="javazoom.upload.*,java.util.*" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:useBean id="upBean" scope="page" class="javazoom.upload.UploadBean" >
  <jsp:setProperty name="upBean" property="folderstore" value="/var/www/intranet/picture/" />
  <%
  //Properties props = new Properties();
  //props.put("user","postgres");
  //props.put("password","postgres");//jdbc:postgresql://localhost:5432/hospital_osv3
  //upBean.setDatabasestore("org.postgresql.Driver","jdbc:postgresql::@mydbhost:1521:ORCL", props);
%>
</jsp:useBean>
<%
String noti_repair_id="", noti_repair_id1="", flag="";
Config1 config1 = new Config1();
NotiTNotiRepair notirepair = new NotiTNotiRepair();
noti_repair_id = (String)session.getAttribute("noti_repair.noti_repair_id");
flag = (String)session.getAttribute("noti_repair.flag");
notirepair.setNotiRepairId(noti_repair_id);
//noti_repair_id = new String (config1.StringNull(request.getParameter("noti_repair_id")));
//noti_repair_id1 = new String (config1.StringNull(request.getParameter("txt_noti_repair_id")));
//if(noti_repair_id.equals("")){
//    noti_repair_id =noti_repair_id1;
//    }


%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <style type="text/css">
                @import "js/dojo1.3.1/dojo/resources/dojo.css";
                @import "dojo1.3.1/dijit/themes/dijit.css";
                @import "../FileInput/FileInput.css";
        </style>
    </head>
    <body>
        <ul class="style1">
        <%
        
              if (MultipartFormDataRequest.isMultipartFormData(request))
              {
                 // Uses MultipartFormDataRequest to parse the HTTP request.
                 MultipartFormDataRequest mrequest = new MultipartFormDataRequest(request);
                 String todo = null;
                 if (mrequest != null) todo = mrequest.getParameter("todo");
                     if ( (todo != null) && (todo.equalsIgnoreCase("upload")) )
                     {
                        Hashtable files = mrequest.getFiles();
                        if ( (files != null) && (!files.isEmpty()) )
                        {                            
                            UploadFile file = (UploadFile) files.get("uploadfile");
                            //notirepair.getNotiRepairPictureFileName();
                            notirepair.setNotiRepairPictureRepairDelete();
                            //boolean exists = (new File("D:\\Data\\UpLoad\\"+noti_repair_id+".jpg")).exists();
                            //if (exists) {
                                // File or directory exists
                            //    boolean success = (new File("D:\\Data\\UpLoad\\"+noti_repair_id+".jpg")).delete();
                            //} else {
                                // File or directory does not exist
                            //}

                            file.setFileName(noti_repair_id+"_repair.jpg");
                            if (file != null) out.println("<li>Form field : uploadfile"+"<BR> Uploaded file : "
                                    +file.getFileName()+" ("+file.getFileSize()+" bytes)"+"<BR> Content Type : "+file.getContentType());
                            // Uses the bean now to store specified by jsp:setProperty at the top.
                            upBean.store(mrequest, "uploadfile");
                            response.sendRedirect("noti_repair_add.jsp?flagpage=adddetail&noti_repair_id="+noti_repair_id+"&txt_form=daily");
                        }
                        else
                        {
                          out.println("<li>No uploaded files");
                        }
                     }
                 else out.println("<BR> todo="+todo);

              }
        %>
        </ul>
        <form method="post" action="noti_repair_upload_file_repair.jsp" name="upform" enctype="multipart/form-data">
            <table width="60%" border="0" cellspacing="1" cellpadding="1" align="center" class="style1">
                <tr>
                    <td align="left" bgcolor="#C1DAD7"><b>Select a file to upload [<%out.print(noti_repair_id);%> ]:</b></td>
                </tr>
                <tr>
                  <td align="left">
                    <input type="file" name="uploadfile" size="50">
                    </td>
                </tr>
                <tr>
                  <td align="left">
                            <input type="hidden" name="todo" value="upload">
                    <input type="submit" name="Submit" value="Upload">
                    <input type="reset" name="Reset" value="Cancel">
                    <input type="hidden" name="txt_noti_repair_id" value="<%out.print(noti_repair_id);%>" />
                    </td>
                </tr>
              </table>
              <br>
              <br>
              <!--<table border="0" cellspacing="1" cellpadding="0" align="center">
                <tr>
                  <td bgcolor="#666666">
                    <table width="100%" border="0" cellspacing="1" cellpadding="0" align="center" class="style1">
                      <tr>
                        <td bgcolor="#FFFFFF"><b><font color="#0000FF">&nbsp;
                          HTML tags used in this form : </font></b></td>
                      </tr>
                      <tr>
                        <td bgcolor="#FFFFFF">&nbsp;&lt;<b>form</b>
                          <b>method</b>=&quot;<b><font color="#FF0000">post</font></b>&quot;
                          <b>action</b>=&quot;<b><font color="#FF0000">SimpleUpload.jsp</font></b>&quot;
                          name=&quot;upload&quot; <b>enctype</b>=&quot;<b><font color="#FF0000">multipart/form-data</font></b>&quot;&gt;</td>
                      </tr>
                      <tr>
                        <td bgcolor="#FFFFFF">&nbsp;&lt;<b>input</b>
                          <b>type</b>=&quot;<b><font color="#FF0000">file</font></b>&quot;
                          <b>name</b>=&quot;<font color="#FF0000"><b>uploadfile</b></font>&quot;
                          size=&quot;50&quot;&gt;</td>
                      </tr>
                    </table>
                  </td>
                </tr>
              </table>
              <p>&nbsp;</p>
              <p>&nbsp;</p>
              <p align="center">&nbsp;</p>
              <p align="center">&nbsp;</p>
              <p align="center"><font size="-1" face="Courier New, Courier, mono">Copyright
                &copy; <a href="http://www.javazoom.net" target="_blank">JavaZOOM</a> 1999-2006</font></p>-->
            </form>
    </body>
</html>
