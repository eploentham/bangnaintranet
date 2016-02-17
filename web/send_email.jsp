<%-- 
    Document   : send_email
    Created on : Oct 17, 2009, 9:59:14 AM
    Author     : root
--%>

<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="java.io.* " %>
<%@page import ="javax.mail.* " %>
<%@page import ="javax.mail.internet.*"%>
<%@page import ="javax.activation.* " %>
<%@page import ="org.apache.commons.mail.*"%>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
String smpt_host = "mail.bangna.co.th";
String mail="", mailheader="", mailimage="", mailfooter="", subject="";
int index_1=0,index_2=0,index_image1=0,index_image2=0;
try{
    Properties props = new Properties();
    props.put("mail.smtp.host","mail.bangna.co.th");
    if(request.getParameter("textarea1")!=null){
        mail = new String (request.getParameter("textarea1").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_subject")!=null){
        subject = new String (request.getParameter("txt_subject").getBytes("ISO8859_1"),"TIS-620");
        }
    //mail =mail.replace("<p>", "");
    //mail =mail.replace("</p>", "");
    index_1 = mail.indexOf("<");
    if(index_1>0){
        mailheader = mail.substring(0, index_1);
        }
    index_2 = mail.indexOf(">");
    if(index_2>0){
        mailfooter = mail.substring(index_2+1, mail.length());
        }
    index_image1 = mail.indexOf("http");
    index_image2 = mail.indexOf("alt");
    if(index_image1>0){
        mailimage = mail.substring(index_image1, index_image2-2);
        }
    // Create the email message
  HtmlEmail email = new HtmlEmail();
  email.setHostName("mail.bangna.co.th");
  email.addTo("eploentham@gmail.com", "John Doe");
  email.setFrom("ekapop@bangna.co.th", "Me");
  email.setSubject(subject);

  // embed the image and get the content id
  //URL url = new URL("http://www.apache.org/images/asf_logo_wide.gif");
  String cid = email.embed(mailimage, "image");

  // set the html message
  email.setHtmlMsg("<html>"+mailheader+" <img src=\"cid:\">"+mailfooter+"</html>");

  // set the alternative message
  //email.setTextMsg("Your email client does not support HTML messages");
  

  email.setAuthentication("ekapop@bangna.co.th", "Ekartc2c5");
  // send the email
  email.send();

















  System.out.println("Success");
}catch(Exception e){
  e.printStackTrace();
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <script type="text/javascript" src="js/tiny_mce/tiny_mce.js"></script>

        <script type="text/javascript">
            function getFormattedText(){
                tinyMCE.triggerSave();
                //tinyMCE.activeEditor.getContent();
                var cont = tinyMCE.get('textarea1').getContent();
                alert(cont);
                return false;
            }
tinyMCE.init({
	// General options
	mode : "textareas",
	theme : "advanced",
        elements : "textarea1" ,
	plugins : "safari,spellchecker,pagebreak,style,layer,table,save,advhr,advimage,advlink,emotions,iespell,inlinepopups,insertdatetime,preview,media,searchreplace,print,contextmenu,paste,directionality,fullscreen,noneditable,visualchars,nonbreaking,xhtmlxtras,template,imagemanager,filemanager",

	// Theme options
	theme_advanced_buttons1 : "save,newdocument,|,bold,italic,underline,strikethrough,|,justifyleft,justifycenter,justifyright,justifyfull,|,styleselect,formatselect,fontselect,fontsizeselect",
	theme_advanced_buttons2 : "cut,copy,paste,pastetext,pasteword,|,search,replace,|,bullist,numlist,|,outdent,indent,blockquote,|,undo,redo,|,link,unlink,anchor,image,cleanup,help,code,|,insertdate,inserttime,preview,|,forecolor,backcolor",
	theme_advanced_buttons3 : "tablecontrols,|,hr,removeformat,visualaid,|,sub,sup,|,charmap,emotions,iespell,media,advhr,|,print,|,ltr,rtl,|,fullscreen",
	theme_advanced_buttons4 : "insertlayer,moveforward,movebackward,absolute,|,styleprops,spellchecker,|,cite,abbr,acronym,del,ins,attribs,|,visualchars,nonbreaking,template,blockquote,pagebreak,|,insertfile,insertimage",
	theme_advanced_toolbar_location : "top",
	theme_advanced_toolbar_align : "left",
	theme_advanced_statusbar_location : "bottom",
	theme_advanced_resizing : true,

	// Example content CSS (should be your site CSS)
	content_css : "css/example.css",

	// Drop lists for link/image/media/template dialogs
	template_external_list_url : "js/template_list.js",
	external_link_list_url : "js/link_list.js",
	external_image_list_url : "js/image_list.js",
	media_external_list_url : "js/media_list.js",

	// Replace values for the template plugin
	template_replace_values : {
		username : "Some User",
		staffid : "991234"
	}
});
</script>

    </head>
    <body>
        <form name="send_email" action="send_email.jsp">
        <table border="0" width="100%">
            <thead>
                <tr>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr><td>To :</td><td><input type="text" name="txt_to" value="" size="50" /></td><td rowspan="2"><a href="getFormattedText();">Send Email</a></td></tr>
                <tr><td>Subject :</td><td><input type="text" name="txt_subject" value=""  size="50"/></td></tr>

                <tr>
                    <td colspan="3"><textarea name="textarea1" id="textarea1" style=""width="100%">
</textarea></td>
                </tr>
            </tbody>
        </table>

        </form>
    </body>
</html>
