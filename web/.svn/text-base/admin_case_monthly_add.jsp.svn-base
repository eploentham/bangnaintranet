<%-- 
    Document   : admin_case_monthly_add
    Created on : Oct 8, 2009, 10:40:15 PM
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
AdminTCase case1 = new AdminTCase();
AdminTCaseDetail case_detail = new AdminTCaseDetail();
AdminTCaseDB casedb = new AdminTCaseDB();
String cbo_branch="", cbo_month="", cbo_year="",branch_id="",flagpage="",case_date="",flag_redirect="",month_id="", year_id="";
if(request.getParameter("cbo_branch")!=null) {
    branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
    }

if(request.getParameter("flagpage")!=null) {
    flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("txt_case_date")!=null) {
    case_date = new String (request.getParameter("txt_case_date").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("flag_redirect")!=null) {
    flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
    }
cbo_branch = config1.getComboBranch(branch_id);
cbo_month = config1.getComboMonth(month_id);
cbo_year = config1.getComboYear(year_id);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>
        <script type="text/javascript" src="js/ui.dialog.js"></script>
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
            $(document).ready(function(){
                $("#txt_case_date").datepicker({ dateFormat: 'dd-mm-yy' });

            });

        </script>
        <script type="text/javascript">
	$(function() {
		$("#dialog").dialog({
			bgiframe: true,
			modal: true,
			buttons: {
				Ok: function() {
					$(this).dialog('close');
				}
			}
		});
	});
	</script>

        <style type="text/css">
            .blue { color: blue; }
        </style>
    </head>
    <body>
        <div id="dialog" title="Download complete">
	<p>
		<span class="ui-icon ui-icon-circle-check" style="float:left; margin:0 7px 50px 0;"></span>
		Your files have downloaded successfully into the My Downloads folder.
	</p>
	<p>
		Currently using <b>36% of your storage space</b>.
	</p>
        </div>
        <form name="admin_case_monthly_add" id="admin_case_monthly_add" action="admin_case_monthly_save.jsp" method="POST">
            <%@include  file="admin_case_header.jsp" %>
            

            <table border="0" align="center" width="100%">
                <thead>
                    <tr>
                        <th colspan="2"  align="center">รายการ
                            &nbsp;&nbsp;&nbsp;1. ดึงข้อมูล&nbsp;<button dojoType="dijit.form.Button" id="hn_noButton">...
    <script type="dojo/method" event="onClick">
    //alert('OnClick event...');
    var case_date = document.getElementById("txt_case_date").value;
    document.forms[0].action = "admin_case_monthly_add.jsp?flagpage=import&case_date="+case_date;
    document.forms[0].submit();
    //console.log("OnClick event...");
  </script>
</button>
        <label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitsave();" NAME="anchor" ID="anchor">2. บันทึกข้อมูล&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle"
      height="16" border="0"></A></label>
    <label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitprint();" NAME="anchor" ID="anchor">3. พิมพ์ข้อมูล&nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle"
      height="16" border="0"></A></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<A HREF="#" onClick="changesubmitcancel();" NAME="anchor" ID="anchor">
<img src="images/trash1.gif" alt="" width="20" height="16" border="0">ยกเลิกการใช้งาน</A></th>
                    </tr>
                </thead>
        <input type="hidden" name="txt_case_monthly_active" id="txt_case_monthly_active"  value="<%out.print(case1.getCaseActive());%>">
                <tbody>
                    <tr>
<td>
&nbsp;
</td>
<td>
    <table valign="top">
                    <tr>
                        <th>คนไข้นอก :</th>
                        <td class="style14"><input type="hidden" name="txt_case_monthly_id" id="txt_case_monthly_id" value="<% out.print(case1.getCaseId());%>" readonly="readonly" >
                        &nbsp;&nbsp;วันที่ทำข้อมูล :<input type="text" name="txt_case_monthly_date" id="txt_case_monthly_date" value="<% out.print(case_date);%>" readonly="readonly" class="dateinput" size="10">
   <label>&nbsp;&nbsp;สาขา<select name="cbo_branch" id="cbo_branch" >
                                    <%out.print(cbo_branch); %>
                        </select></label>
                        <label>&nbsp;&nbsp;ประจำปี<select name="cbo_year" id="cbo_year" >
                                    <%out.print(cbo_year); %>
                        </select></label>
                        <label>&nbsp;&nbsp;ประจำเดือน<select name="cbo_month" id="cbo_month" >
                                    <%out.print(cbo_month); %>
                            </select></label></td>
                    </tr>
<tr>
                        <th width="100">ตัวคุณ</th>
                        <td class="style14">
            OPD&nbsp;:&nbsp;&nbsp;<input type="text" name="txt_k_opd" id="txt_k_opd" value="<% out.print(case1.getCntCash());%>" size="4">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            IPD :&nbsp;<input type="text" name="txt_k_ipd" id="txt_k_ipd" value="<% out.print(case1.getCntFunds());%>" size="4">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            ธุรการ :&nbsp;<input type="text" name="txt_k_admin" id="txt_k_admin" value="<% out.print(case1.getCntCompany());%>" size="4">
                        </td></tr>
                        
                        
                        
                    <tr>
                        <th width="100">คนไข้นอก</th>
                        <td class="style14">
    OPD&nbsp;:&nbsp;&nbsp;<input type="text" name="txt_cnt_opd_opd" id="txt_cnt_opd_opd" value="<% out.print(case1.getCntOpd());%>" size="4">=<input type="text" name="txt_amt_opd_opd" id="txt_amt_opd_opd" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ER :&nbsp;<input type="text" name="txt_cnt_opd_er" id="txt_cnt_opd_er" value="<% out.print(case1.getCntEr());%>" size="4">=<input type="text" name="txt_amt_opd_erd" id="txt_amt_opd_erd" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PCU :&nbsp;<input type="text" name="txt_cnt_opd_pcu" id="txt_cnt_opd_pcu" value="<% out.print(case1.getCntPcu());%>" size="4">=<input type="text" name="txt_amt_opd_pcu" id="txt_amt_opd_pcu" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;Check UP :&nbsp;<input type="text" name="txt_cnt_opd_checkup" id="txt_cnt_opd_checkup" value="<% out.print(case1.getCntCheckup());%>" size="4">=<input type="text" name="txt_amt_opd_checkup" id="txt_amt_opd_checkup" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;ทันตกรรม :&nbsp;<input type="text" name="txt_cnt_opd_dental" id="txt_cnt_opd_dental" value="<% out.print(case1.getCntDental());%>" size="4">=<input type="text" name="txt_amt_opd_dental" id="txt_amt_opd_dental" value="<% out.print(case1.getCntOpd());%>" size="4"><br>
    ปชส&nbsp;:&nbsp;&nbsp;<input type="text" name="txt_cnt_opd_1" id="txt_cnt_opd_1" value="<% out.print(case1.getCntOpd());%>" size="4">=<input type="text" name="txt_sum_opd_1" id="txt_sum_opd_1" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;การเงิน :&nbsp<input type="text" name="txt_cnt_opd_2" id="txt_cnt_opd_2" value="<% out.print(case1.getCntEr());%>" size="4">=<input type="text" name="txt_sum_opd_2" id="txt_sum_opd_2" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;ห้องยา :&nbsp;<input type="text" name="txt_cnt_opd_3" id="txt_cnt_opd_3" value="<% out.print(case1.getCntPcu());%>" size="4">=<input type="text" name="txt_sum_opd_3" id="txt_sum_opd_3" value="<% out.print(case1.getCntOpd());%>" size="4">
                        </td>
                    </tr>
                    <tr>
                        <th>คนไข้ใน</th>
                        <td class="style14">
    OPD&nbsp;:&nbsp;&nbsp;<input type="text" name="txt_cnt_ipd_opd" id="txt_cnt_ipd_opd" value="<% out.print(case1.getCntOpd());%>" size="4">=<input type="text" name="txt_sum_ipd_opd" id="txt_sum_ipd_opd" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ER :&nbsp;<input type="text" name="txt_cnt_ipd_er" id="txt_cnt_ipd_er" value="<% out.print(case1.getCntEr());%>" size="4">=<input type="text" name="txt_sum_ipd_er" id="txt_sum_ipd_er" value="<% out.print(case1.getCntEr());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PCU :&nbsp;<input type="text" name="txt_cnt_ipd_pcu" id="txt_cnt_ipd_pcu" value="<% out.print(case1.getCntPcu());%>" size="4"><br>
    W3M&nbsp;:&nbsp;<input type="text" name="txt_cnt_ipd_w3m" id="txt_cnt_ipd_w3m" value="<% out.print(case1.getCntCheckup());%>" size="4">=<input type="text" name="txt_sum_ipd_w3m" id="txt_sum_ipd_w3m" value="<% out.print(case1.getCntCheckup());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W3W :&nbsp;<input type="text" name="txt_cnt_ipd_w3w" id="txt_cnt_ipd_w3w" value="<% out.print(case1.getCntDental());%>" size="4">=<input type="text" name="txt_sum_ipd_w3w" id="txt_sum_ipd_w3w" value="<% out.print(case1.getCntDental());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W3N :&nbsp;<input type="text" name="txt_cnt_ipd_w3n" id="txt_cnt_ipd_w3n" value="<% out.print(case1.getCntDental());%>" size="4">=<input type="text" name="txt_sum_ipd_w3n" id="txt_sum_ipd_w3n" value="<% out.print(case1.getCntDental());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W4UC:&nbsp;&nbsp;<input type="text" name="txt_cnt_ipd_w4uc" id="txt_cnt_ipd_w4uc" value="<% out.print(case1.getCntOpd());%>" size="4">=<input type="text" name="txt_sum_ipd_w4uc" id="txt_sum_ipd_w4uc" value="<% out.print(case1.getCntOpd());%>" size="4">
    <br>W4S&nbsp;:&nbsp;&nbsp;<input type="text" name="txt_cnt_ipd_w4s" id="txt_cnt_ipd_w4s" value="<% out.print(case1.getCntEr());%>" size="4">=<input type="text" name="txt_sum_ipd_w4s" id="txt_sum_ipd_w4s" value="<% out.print(case1.getCntEr());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W6UC :&nbsp;<input type="text" name="txt_cnt_ipd_w6uc" id="txt_cnt_ipd_w6uc" value="<% out.print(case1.getCntPcu());%>" size="4">=<input type="text" name="txt_sum_ipd_w6uc" id="txt_sum_ipd_w6uc" value="<% out.print(case1.getCntPcu());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;ICU :&nbsp;<input type="text" name="txt_cnt_ipd_icu" id="txt_cnt_ipd_icu" value="<% out.print(case1.getCntPcu());%>" size="4">=<input type="text" name="txt_sum_ipd_icu" id="txt_sum_ipd_icu" value="<% out.print(case1.getCntPcu());%>" size="4">
                        </td>
                    </tr>
                    <tr>
                        <th>รวมจ่าย</th>
                        <td class="style14">
    OPD&nbsp;:&nbsp;&nbsp;<input type="text" name="txt_cnt_sum_opd" id="txt_cnt_sum_opd" value="<% out.print(case1.getCntOpd());%>" size="4">=<input type="text" name="txt_amt_sum_opd" id="txt_amt_sum_opd" value="<% out.print(case1.getCntOpd());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ER :&nbsp;<input type="text" name="txt_cnt_sum_er" id="txt_cnt_sum_er" value="<% out.print(case1.getCntEr());%>" size="4">=<input type="text" name="txt_amt_sum_er" id="txt_amt_sum_er" value="<% out.print(case1.getCntEr());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;PCU :&nbsp;<input type="text" name="txt_cnt_sum_pcu" id="txt_cnt_sum_pcu" value="<% out.print(case1.getCntPcu());%>" size="4">=<input type="text" name="txt_amt_sum_pcu" id="txt_amt_sum_pcu" value="<% out.print(case1.getCntPcu());%>" size="4"><br>
    W3M&nbsp;:&nbsp;<input type="text" name="txt_cnt_sum_w3m" id="txt_cnt_sum_w3m" value="<% out.print(case1.getCntCheckup());%>" size="4">=<input type="text" name="txt_amt_sum_w3m" id="txt_amt_sum_w3m" value="<% out.print(case1.getCntCheckup());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W3W :&nbsp;<input type="text" name="txt_cnt_sum_w3w" id="txt_cnt_sum_w3w" value="<% out.print(case1.getCntDental());%>" size="4">=<input type="text" name="txt_amt_sum_w3w" id="txt_amt_sum_w3w" value="<% out.print(case1.getCntDental());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W3N :&nbsp;<input type="text" name="txt_cnt_sum_w3n" id="txt_cnt_sum_w3n" value="<% out.print(case1.getCntDental());%>" size="4">=<input type="text" name="txt_amt_sum_w3n" id="txt_amt_sum_w3n" value="<% out.print(case1.getCntDental());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W4UC:&nbsp;&nbsp;<input type="text" name="txt_cnt_sum_w4uc" id="txt_cnt_sum_w4uc" value="<% out.print(case1.getCntOpd());%>" size="4">=<input type="text" name="txt_amt_sum_w4uc" id="txt_amt_sum_w4uc" value="<% out.print(case1.getCntOpd());%>" size="4"><br>
    W4S :&nbsp<input type="text" name="txt_cnt_sum_w4s" id="txt_cnt_sum_w4s" value="<% out.print(case1.getCntEr());%>" size="4">=<input type="text" name="txt_amt_sum_w4s" id="txt_amt_sum_w4s" value="<% out.print(case1.getCntEr());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;W6UC :&nbsp;<input type="text" name="txt_cnt_sum_w6uc" id="txt_cnt_sum_w6uc" value="<% out.print(case1.getCntPcu());%>" size="4">=<input type="text" name="txt_amt_sum_w6uc" id="txt_amt_sum_w6uc" value="<% out.print(case1.getCntPcu());%>" size="4">
    &nbsp;&nbsp;&nbsp;&nbsp;ICU :&nbsp;<input type="text" name="txt_cnt_sum_icu" id="txt_cnt_sum_icu" value="<% out.print(case1.getCntPcu());%>" size="4">=<input type="text" name="txt_amt_sum_icu" id="txt_amt_sum_icu" value="<% out.print(case1.getCntPcu());%>" size="4">
                        </td>
                    </tr>
                    
    </table></td>
                </tbody>
            </table>
        </form>
    </body>
</html>
