<%-- 
    Document   : admin_case_view
    Created on : Sep 22, 2009, 9:11:37 PM
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
Config1 config1 = new Config1();
String flagpage="",cbo_branch="",cbo_department="", date_start="", date_end="",branch_id="",text="",txt_color1="";
String date_startdb="",date_enddb="",txt_color="",row_color="",width_date="", case_date="",width_ward="",width_period="150";
String date_current="";
String cbo_month="",month_id="", cbo_year="", year_id="", day="";
Integer row=0;
Vector v_case = new Vector();
AdminTCase case1 = new AdminTCase();
AdminTCaseDB casedb = new AdminTCaseDB();
try {
    if(request.getParameter("flagpage")!=null) {
        flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("cbo_branch")!=null) {
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("cbo_month")!=null) {
        month_id = new String (request.getParameter("cbo_month").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("cbo_year")!=null) {
        year_id = new String (request.getParameter("cbo_year").getBytes("ISO8859_1"),"TIS-620");
        }
    if(branch_id.equals("")){
        branch_id = "103001";
        }
    if(month_id.equals("")){
        date_current = config1.getDate("MM");
        month_id = date_current;
        }
    if(request.getParameter("txt_date_start")!=null) {
        date_start = new String (request.getParameter("txt_date_start").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_date_end")!=null) {
        date_end = new String (request.getParameter("txt_date_end").getBytes("ISO8859_1"),"TIS-620");
        }
    flagpage="old_date";
    cbo_branch = config1.getComboBranch(branch_id);
    cbo_month = config1.getComboMonth(month_id);
    cbo_year = config1.getComboYear(year_id);
    day=config1.getMonthEndDay(year_id, month_id);
    date_startdb = year_id+"-"+month_id+"-01";
    date_enddb = year_id+"-"+month_id+"-"+day;
    v_case = casedb.getAdminTCase("",date_startdb,date_enddb, branch_id,"date");
    for(int i=0;i<=v_case.size()-1;i++) {
        row++;
        case1 = (AdminTCase)v_case.get(i);
        case_date = config1.DateFormatDB2Show(case1.getCaseDate(), "ddMMyyyy");

        row_color = "";
        text+="<tr class='style14r' "+row_color+"> <td align='center' width='20'>"+row.toString()+"</td>"
            +"<td width='"+width_period+"'><A HREF='admin_case_add.jsp?txt_case_id="+case1.getCaseId()
            +"&flagpage=viewdetail' name='admin_case_add' id='admin_case_add'>"
                +txt_color+case_date+" ["+case1.getCaseId()+"]"
                +txt_color1+"</a></td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntOpd()+txt_color1+"</td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntEr()+txt_color1+"</td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntPcu()+txt_color1+"</td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntCheckup()+txt_color1+"</td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntDental()+txt_color1+"</td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntCash()+txt_color1+"</td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntFunds()+txt_color1+"</td>"
            +"<td width='"+width_ward+"' align='center'>"+txt_color+case1.getCntCompany()+txt_color1+"</td>"

            +"</tr>";
        }
    if(text.equals("")){
        text="<tr class='style14r' ><td>ไม่พบข้อมูล</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td></tr>";
        }
    }
catch(Exception ex){
    text = ex.getMessage();
    }
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
        <form name="admin_case_view" id="admin_case_view" action="admin_case_view.jsp" method="POST">
            <%@include  file="admin_case_header.jsp" %>
            <%if(flagpage.equals("old_date")){ %>
            <table><tr><td colspan="6">
                        <fieldset class="style14r">
                            <legend>เงื่อนไข:</legend>
                            <label>&nbsp;&nbsp;สาขา :&nbsp;<select name="cbo_branch" id="cbo_branch">
                                <%out.print(cbo_branch); %>
                </select></label>
                <label>&nbsp;&nbsp;ปี :&nbsp;<select name="cbo_year" id="cbo_year">
                                <%out.print(cbo_year); %>
                    </select></label>
                <label>&nbsp;&nbsp;เดือน :&nbsp;<select name="cbo_month" id="cbo_month">
                                <%out.print(cbo_month); %>
                    </select></label>
                
<button dojoType="dijit.form.Button" id="helloButton">ค้นหา
                                <script type="dojo/method" event="onClick">
                                //alert('OnClick event...');
        //var asset_status = document.getElementById("chk_asset_status").value;
        //var branch_id = document.getElementById("cbo_branch").value;;
        //var type_device_id = document.getElementById("cbo_type_device").value;;
                                    document.forms[0].action = "admin_case_view.jsp?flagpage=old_date";
                                    document.forms[0].submit();
                                //console.log("OnClick event...");
                              </script>
                            </button>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitprint();" NAME="anchor" ID="anchor"> พิมพ์ข้อมูล&nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle"
      height="16" border="0"></A></label>
<input type="hidden" name="txt_date_start" id="txt_date_start" value="<% out.print(date_startdb);%>" size="4">
<input type="hidden" name="txt_date_end" id="txt_date_end" value="<% out.print(date_enddb);%>" size="4">
                        </fieldset>
                </td></tr></table>
            <% } %>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <!-- <tr><td><a href="noti_repair_add.jsp?noti_repair_id=&flagpage=viewdetail" class="style14b">แจ้งซ่อมใหม่ 11</a></td></tr>-->

            <thead>
                <tr bgcolor="#336699"  class="style14w">
                    <th width="15" ><div align="center">ลำดับ</div></th>
                  <th width="80" ><div align="center">วันที่</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">OPD</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">ER</div></th>
                  <th width="70" bgcolor="#336699" ><div align="center">PCU</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">Checkup</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">ทันตกรรม</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">เงินสด</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">กองทุน</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">บริษัท</div></th>
                </tr>
            </thead>
            <% out.print(text);%>
            </table>


        </form>
    </body>
    
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
      function changesubmitprint() {
        //var case_id = document.getElementById("txt_case_id").value;
        var date_startdb = document.getElementById("txt_date_start").value;
        var date_enddb = document.getElementById("txt_date_end").value;
        document.forms[0].action = "rpt_report_view.jsp?txt_report_name=admin_case_daily&txt_form=daily&case_date_start="+date_startdb+"&case_date_end="+date_enddb;
        document.forms[0].submit();
        return false;
      }
    </script>
</html>
