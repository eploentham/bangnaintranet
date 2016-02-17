<%-- 
    Document   : admin_foods_order_view
    Created on : 16 ส.ค. 2552, 8:02:26
    Author     : pop
--%>

<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
String cbo_branch="",cbo_year="",cbo_month="",date_startdb="",date_enddb="",text="",cbo_period="";
String branch_id="";
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
ComboDB combodb = new ComboDB();
AdminTFoods foods_order = new AdminTFoods();
AdminTFoodsDetail foods_order_detail = new AdminTFoodsDetail();

cbo_branch = combodb.getComboBranch(branch_id);
//cbo_month=config1.getComboMonth(foods_order.getDateStart());
cbo_year=combodb.getComboYear(foods_order.getDateStart());
cbo_period=combodb.getComboPeriod(foods_order.getDateStart());
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>

        <script type="text/javascript">
           // Load Dojo's code relating to the Button widget
           dojo.require("dijit.form.Button");
        </script>
        <script type="text/javascript">
          dojo.require("dijit.form.DateTextBox");
          dojo.require("dojo.parser");
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#txt_date_start").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#txt_date_end").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#txt_foods_date").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#btn_picture_repair").click(showSearch);
                $("#anchor_save").click(saveNurseFoodsOrder);

            });
            function showSearch(){
                //$("#cbo_student_current_amphur").re
                $("#t_admin_foods_order").load("admin_foods_f_admin_foods_order_search.jsp", {year: $("#cbo_year").val(),branch_id: $("#cbo_branch").val()});
            }            

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
    </head>
    <body>
        <form name="admin_foods_order_view" id="admin_foods_order_view" action="admin_foods_order_view.jsp" method="POST">
            <%@include  file="admin_foods_order_header.jsp" %>
        </form>
        <table><tr><td colspan="6">
                        <fieldset class="style14r">
                            <legend>เงื่อนไข:</legend>
                            <label>&nbsp;&nbsp;สาขา :&nbsp;<select name="cbo_branch" id="cbo_branch">
                                <%out.print(cbo_branch); %>
                </select></label>
                <label>&nbsp;&nbsp;ปี :&nbsp;<select name="cbo_year" id="cbo_year">
                                <%out.print(cbo_year); %>
                    </select></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                

<input type="button" name="btn_picture_repair" id="btn_picture_repair" value=" ค้นหา...      " />
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitprint();" NAME="anchor" ID="anchor"> พิมพ์ข้อมูล&nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle"
      height="16" border="0"></A></label>
<input type="hidden" name="txt_date_start" id="txt_date_start" value="<% out.print(date_startdb);%>" size="4">
<input type="hidden" name="txt_date_end" id="txt_date_end" value="<% out.print(date_enddb);%>" size="4">
                        </fieldset>
                </td></tr></table>

            <div id="t_admin_foods_order"></div>
    </body>
</html>
