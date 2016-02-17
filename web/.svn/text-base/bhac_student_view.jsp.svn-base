<%-- 
    Document   : bhac_student_view
    Created on : Sep 27, 2009, 11:18:04 AM
    Author     : root
--%>
<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
String cbo_school_year="", cbo_model_studies="", student_first_namet="", student_last_namet="";

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <SCRIPT LANGUAGE="JavaScript" SRC="js/CalendarPopup.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/AnchorPosition.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/PopupWindow.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/date.js"></SCRIPT>
        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <SCRIPT LANGUAGE="JavaScript">
	var cal = new CalendarPopup("testdiv1");
	</SCRIPT>
        <script type="text/javascript">
           // Load Dojo's code relating to the Button widget
           dojo.require("dijit.form.Button");
        </script>
        <script type="text/javascript">
          dojo.require("dijit.form.DateTextBox");
          dojo.require("dojo.parser");
        </script>

         <style type="text/css">
          .progressBar {
            position: relative;
            width: 256px;
            height: 16px;
            border: 1px solid black;
          }
        </style>
        <style type="text/css">
          div.error {
            color: red;
          }
        </style>
        <script type="text/javascript">
      var framework = new ValidatorFramework();
      window.onload = function() {
        Event.observe('asset_view','submit',function(event) {
          if (!framework.validateForm(event.target))
            Event.stop(event);
        });
        Event.observe('asset_view','keyup',function(event) {
          framework.validateForm(event.target.form);
        });
      }
    </script>
    </head>
    <body>
        <form name="bhac_student_view" id="bhac_student_view" action="bhac_student_view.jsp" method="POST">
            <%@include  file="bhac_student_header.jsp" %>

            <table><tr><td colspan="6">
                        <fieldset class="style14r">
                            <legend>เงื่อนไข:</legend>
                            <label>&nbsp;&nbsp;ปีการศึกษา :&nbsp;<select name="cbo_school_year" id="cbo_school_year">
                                <%out.print(cbo_school_year); %>
                </select></label>
                <label>&nbsp;&nbsp;รุ่น :&nbsp;<select name="cbo_model_studies" id="cbo_model_studies">
                                <%out.print(cbo_model_studies); %>
                    </select></label>
    <label>&nbsp;&nbsp;ชื่อ-นักเรียน :&nbsp;<input type="text" name="txt_student_first_namet" id="txt_student_first_namet" value="<% out.print(student_first_namet);%>" ></label>
<label>&nbsp;&nbsp;นามสกุล :&nbsp;<input type="text" name="txt_student_last_namet" id="txt_student_last_namet" value="<% out.print(student_last_namet);%>" ></label>
<button dojoType="dijit.form.Button" id="helloButton">ค้นหา
                                <script type="dojo/method" event="onClick">
                                //alert('OnClick event...');
        //var asset_status = document.getElementById("chk_asset_status").value;
        //var branch_id = document.getElementById("cbo_branch").value;;
        //var type_device_id = document.getElementById("cbo_type_device").value;;
                                    document.forms[0].action = "bhac_student_view.jsp?flagpage=search";
                                    document.forms[0].submit();
                                //console.log("OnClick event...");
                              </script>
                            </button>


                        </fieldset>
                </td></tr></table>

    </body>
</html>
