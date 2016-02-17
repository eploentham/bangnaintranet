<%-- 
    Document   : doctor_checkup_form_view
    Created on : 25 ส.ค. 2552, 19:23:42
    Author     : pop
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
Config1 config1 = new Config1();
Integer row=0;
String text="",flagpage="",branch_id="",cbo_branch="",date_start="",date_end="";
String txt_color="",txt_color1="", checkup_date="",row_color="";
DoctorTCheckup checkup = new DoctorTCheckup();
DoctorTCheckupDB checkupdb = new DoctorTCheckupDB();
Vector v_checkup = new Vector();
try {
    if(request.getParameter("flagpage")!=null) {
        flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    }
    if(request.getParameter("cbo_branch")!=null) {
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
    }
    cbo_branch = config1.getComboBranch(branch_id);
    v_checkup = checkupdb.getDoctorCheckUp("103001", "");
    for(int i=0;i<=v_checkup.size()-1;i++) {
        row++;
        checkup = (DoctorTCheckup)v_checkup.get(i);
        checkup_date = config1.DateFormatDB2Show(checkup.getCheckupDate(), "ddMMyyyy");

        text+="<tr class='style14r' "+row_color+"> <td align='center' width='30'>"+row.toString()+"</td>"
    +"<td width='200'><A HREF='doctor_checkup_form_add.jsp?txt_checkup_id="+checkup.getCheckupId()
    +"&flag=viewdetail' name='doctor_checkup_form_add' id='doctor_checkup_form_add'>"
        +txt_color+checkup.getPatientFirstnamet()+" "+checkup.getPatientLastnamet()+txt_color1+"</a></td>"
            +"<td width='50' align='right'>"+txt_color+checkup.getPatientHn()+txt_color1+"</td>"
            +"<td width='50' align='right'>"+txt_color+checkup_date+txt_color1+"</td>"
            +"<td width='50' align='right'>"+txt_color+checkup.getCheckupTime()+txt_color1+"</td>"
            +"<td width='150' align='right'>"+txt_color+checkup.getPatientAge()+txt_color1+"</td>"
            +"<td width='140' align='right'>"+txt_color+checkup.getPatientPid()+txt_color1+"</td>"
            +"<td width='200' align='left'>"+txt_color+checkup.getAdditionComments()+txt_color1+"</td>"
            +"</tr>";
        }

    if(text.equals("")) {
        text="<tr class='style14r' ><td>ไม่พบข้อมูล</td><td></td><td></td><td></td><td></td><td></td<td></td<td></td</tr>";
        }
    }
catch(Exception ex){
    text = ex.getMessage();
    }
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
        <form name="doctor_checkup_form_view" id="doctor_checkup_form_view" action="doctor_checkup_form_add.jsp" method="POST">
            <%@include  file="doctor_checkup_form_header.jsp" %>

            <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <!-- <tr><td><a href="noti_repair_add.jsp?noti_repair_id=&flagpage=viewdetail" class="style14b">แจ้งซ่อมใหม่ 11</a></td></tr>-->
            <%if(flagpage.equals("old_date")){ %>
            <tr><td>
                        <fieldset class="style14r">
                            <legend>เงื่อนไข:</legend>
                            <label>&nbsp;&nbsp;สาขา :&nbsp;<select name="cbo_branch" id="cbo_branch">
                                <%out.print(cbo_branch); %>
                </select></label>

                <label>&nbsp;&nbsp;วันที่ :&nbsp;<input type="text" name="txt_date_start" id="txt_date_start" value="<% out.print(date_start);%>" readonly="readonly" class="dateinput" ><A HREF="#"
   onClick="cal.select(document.forms['doctor_checkup_form_view'].txt_date_start,'anchor1','dd/MM/yyyy'); return false;"
   NAME="anchor1" ID="anchor1">&nbsp; <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></label>
<label>&nbsp;&nbsp;ถึงวันที่ :&nbsp;<input type="text" name="txt_date_end" id="txt_date_end" value="<% out.print(date_end);%>" readonly="readonly" class="dateinput" ><A HREF="#"
   onClick="cal.select(document.forms['doctor_checkup_form_view'].txt_date_end,'anchor2','dd/MM/yyyy'); return false;"
   NAME="anchor2" ID="anchor2">&nbsp; <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></label>
<button dojoType="dijit.form.Button" id="helloButton">ค้นหา
                                <script type="dojo/method" event="onClick">
                                //alert('OnClick event...');
        //var asset_status = document.getElementById("chk_asset_status").value;
        //var branch_id = document.getElementById("cbo_branch").value;;
        //var type_device_id = document.getElementById("cbo_type_device").value;;
                                    document.forms[0].action = "nurse_foods_order_view.jsp?flagpage=old_data";
                                    document.forms[0].submit();
                                //console.log("OnClick event...");
                              </script>
                            </button>


                        </fieldset>
                </td></tr>
            <% } %>
            <thead>
                <tr bgcolor="#336699"  class="style14w">
                    <th width="15" ><div align="center">ลำดับ</div></th>
                  <th width="80" ><div align="center">ชื่อ-นามสกุล</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">HN NO</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">วันที่</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">เวลา</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">อายุ</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">ID</div></th>
                  <th width="200" bgcolor="#336699" ><div align="center">AdditionComment</div></th>
                </tr>
            </thead>
            <% out.print(text);%>
            </table>




            
        </form>
    </body>
    <DIV ID="testdiv1" STYLE="position:absolute;visibility:hidden;background-color:white;layer-background-color:white;"></DIV>
    <script>
  function performSearch() {
        $('resultsContainer').innerHTML = '';
        new Ajax.Request(
          '/aip.chap10/command/SearchForRecipes',
          {
            onSuccess: showResults,
            onFailure: showResults,
            parameters:
              $H({
                terms: $F('searchTermsField')
              }).toQueryString()
          }
        );
        if (!window.progressBar) {
          window.progressBar = new ProgressBar(
            'progressBarContainer',
            {
              className: 'progressBar',
              color: 'blue',
              interval: 1000
            }
          );
        }
        progressBar.start();
      }

      function showResults(request) {
        progressBar.stop();
        $('resultsContainer').innerHTML = request.responseText;
      }
    </script>
</html>
