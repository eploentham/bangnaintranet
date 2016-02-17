<%-- 
    Document   : admin_case_add
    Created on : Sep 22, 2009, 9:11:50 PM
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
String width_patient_name="250",text1="", flag_import="",text="",text2="",case_date="",flagpage="", branch_id="103001";
String case_id="", case_datedb="", case_active="",flag_redirect="",cbo_branch="";
Integer row=0;
Config1 config1 = new Config1();
AdminTCase case1 = new AdminTCase();
AdminTCaseDetail case_detail = new AdminTCaseDetail();
AdminTCaseDB casedb = new AdminTCaseDB();

Vector v_case_detail = new Vector();
if(request.getParameter("cbo_branch")!=null) {
    branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
    }

if(request.getParameter("flagpage")!=null) {
    flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("txt_case_id")!=null) {
    case_id = new String (request.getParameter("txt_case_id").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("txt_case_date")!=null) {
    case_date = new String (request.getParameter("txt_case_date").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("flag_redirect")!=null) {
    flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
    }
case_datedb = config1.DateFormatShow2DB(case_date, "ddMMyyyy");
if(flagpage.equals("import")){
    v_case_detail = casedb.setCaseImport(branch_id, case_datedb, flagpage);
    for(int i=0;i<=v_case_detail.size()-1;i++) {
        row++;
        case_detail = (AdminTCaseDetail)v_case_detail.get(i);
        text += "<tr class='style14'><td align='center'>"+row.toString()+"</td>"
                +"<td align='center' width='15'>"+case_date+"</td>"
                +"<td align='center'>"+case_detail.getVisitTime().toString()+"</td>"
                +"<td align='left'>"+case_detail.getPatientFullnamet().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientHn().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientVn().toString()+"</td>"
                +"<td align='left'>"+case_detail.getVisitPaidNamet().toString()+"</td>"
                +"</tr>";
        }
    case1 = casedb.getCaseCount(branch_id, "", "_temp");
    //flag_import="1";
    }
else if(flagpage.equals("save")) {
    String remark="", description="";
    if(request.getParameter("txt_remark")!=null) {
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_description")!=null) {
        description = new String (request.getParameter("txt_description").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_case_active")!=null) {
        case_active = new String (request.getParameter("txt_case_active").getBytes("ISO8859_1"),"TIS-620");
        }
    case_id = casedb.setSaveCase(branch_id, case_id, remark, description, case_active);
    v_case_detail = casedb.getAdminTCaseDetail(case_id, "");
    for(int i=0;i<=v_case_detail.size()-1;i++) {
        row++;
        case_detail = (AdminTCaseDetail)v_case_detail.get(i);
        text += "<tr class='style14'><td align='center'>"+row.toString()+"</td>"
                +"<td align='center' width='15'>"+case_date+"</td>"
                +"<td align='center'>"+case_detail.getVisitTime().toString()+"</td>"
                +"<td align='left'>"+case_detail.getPatientFullnamet().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientHn().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientVn().toString()+"</td>"
                +"<td align='left'>"+case_detail.getVisitPaidNamet().toString()+"</td>"
                +"</tr>";
        }
    case1 = casedb.getCaseCount(branch_id, case_id, "");
    if(flag_redirect.equals("cancel")){
            response.sendRedirect("admin_case_view.jsp");
            }
    else if(flag_redirect.equals("save")){
        response.sendRedirect("admin_case_view.jsp?flagpage=old_date");
        }

    }
else if(flagpage.equals("import_date")) {
    String remark="", description="";
    if(request.getParameter("txt_remark")!=null) {
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_description")!=null) {
        description = new String (request.getParameter("txt_description").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_case_active")!=null) {
        case_active = new String (request.getParameter("txt_case_active").getBytes("ISO8859_1"),"TIS-620");
        }
    case_id = casedb.setSaveCaseImport(branch_id,case_datedb, remark, description, case_active);
    v_case_detail = casedb.getAdminTCaseDetail(case_id, "");
    for(int i=0;i<=v_case_detail.size()-1;i++) {
        row++;
        case_detail = (AdminTCaseDetail)v_case_detail.get(i);
        text += "<tr class='style14'><td align='center'>"+row.toString()+"</td>"
                +"<td align='center' width='15'>"+case_date+"</td>"
                +"<td align='center'>"+case_detail.getVisitTime().toString()+"</td>"
                +"<td align='left'>"+case_detail.getPatientFullnamet().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientHn().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientVn().toString()+"</td>"
                +"<td align='left'>"+case_detail.getVisitPaidNamet().toString()+"</td>"
                +"</tr>";
        }
    
    case1 = casedb.getCaseCount(branch_id, case_id, "");
    }
else if(flagpage.equals("viewdetail")){
    v_case_detail = casedb.getAdminTCaseDetail(case_id, "");
    for(int i=0;i<=v_case_detail.size()-1;i++) {
        row++;
        case_detail = (AdminTCaseDetail)v_case_detail.get(i);
        case_date = config1.DateFormatDB2Show(case_detail.getVisitDate(), "ddMMyyyy");
        text += "<tr class='style14'><td align='center'>"+row.toString()+"</td>"
                +"<td align='center' width='15'>"+case_date+"</td>"
                +"<td align='center'>"+case_detail.getVisitTime().toString()+"</td>"
                +"<td align='left'>"+case_detail.getPatientFullnamet().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientHn().toString()+"</td>"
                +"<td align='center'>"+case_detail.getPatientVn().toString()+"</td>"
                +"<td align='left'>"+case_detail.getVisitPaidNamet().toString()+"</td>"
                +"</tr>";
        }
    case1 = casedb.getAdminTCaseByPK(case_id);
    case_date = config1.DateFormatDB2Show(case1.getCaseDate(), "ddMMyyyy");
    }
cbo_branch = config1.getComboBranch(branch_id);
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
        <style type="text/css">
            .blue { color: blue; }
        </style>
    </head>
    <body>
        <form name="admin_case_add" id="admin_case_add" action="admin_case_save.jsp" method="POST">
            <%@include  file="admin_case_header.jsp" %>

            <table border="0" align="center" width="100%">
                <thead>
                    <tr>
                        <th colspan="2"  align="center">รายการ
                            &nbsp;&nbsp;&nbsp;1. นำเข้าข้อมูล&nbsp;<button dojoType="dijit.form.Button" id="hn_noButton">...
    <script type="dojo/method" event="onClick">
    //alert('OnClick event...');
    var case_date = document.getElementById("txt_case_date").value;
    document.forms[0].action = "admin_case_add.jsp?flagpage=import&case_date="+case_date;
    document.forms[0].submit();
    //console.log("OnClick event...");
  </script>
</button>
                            <% if(flag_import.equals("1")){ %><label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitsaveimport();" NAME="anchor" ID="anchor">1.1. บันทึกข้อมูลจากการนำเข้า&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle"
      height="16" border="0"></A></label><%}%>
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
        <input type="hidden" name="txt_row" id="txt_row"  value="<%out.print(row);%>">
        <input type="hidden" name="txt_case_active" id="txt_case_active"  value="<%out.print(case1.getCaseActive());%>">
                <tbody>
                    <tr>
<td>
&nbsp;
</td>
<td>
    <table valign="top">
                    <tr>
                        <th>วันที่ :</th>
                        <td class="style14"><input type="hidden" name="txt_case_id" id="txt_case_id" value="<% out.print(case1.getCaseId());%>" readonly="readonly" >
                        <input type="text" name="txt_case_date" id="txt_case_date" value="<% out.print(case_date);%>" readonly="readonly" class="dateinput" size="10">
   &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            เงินสด :&nbsp;<input type="text" name="txt_cnt_cash" id="txt_cnt_cash" value="<% out.print(case1.getCntCash());%>" size="4">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            กองทุน :&nbsp;<input type="text" name="txt_cnt_funds" id="txt_cnt_funds" value="<% out.print(case1.getCntFunds());%>" size="4">
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            บริษัท :&nbsp;<input type="text" name="txt_cnt_company" id="txt_cnt_company" value="<% out.print(case1.getCntCompany());%>" size="4">
                        <label>&nbsp;&nbsp;สาขา<select name="cbo_branch" id="cbo_branch" >
                                    <%out.print(cbo_branch); %>
                        </select></label></td>
                    </tr>
                    <tr>
                        <th width="100">OPD</th>
                        <td class="style14"><input type="text" name="txt_cnt_opd" id="txt_cnt_opd" value="<% out.print(case1.getCntOpd());%>" size="4">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        ER :<input type="text" name="txt_cnt_er" id="txt_cnt_er" value="<% out.print(case1.getCntEr());%>" size="4">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        PCU :&nbsp;<input type="text" name="txt_cnt_pcu" id="txt_cnt_pcu" value="<% out.print(case1.getCntPcu());%>" size="4">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        Check UP :&nbsp;<input type="text" name="txt_cnt_checkup" id="txt_cnt_checkup" value="<% out.print(case1.getCntCheckup());%>" size="4">
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        ทันตกรรม :&nbsp;<input type="text" name="txt_cnt_dental" id="txt_cnt_dental" value="<% out.print(case1.getCntDental());%>" size="4">
                        
                        </td>
                    </tr>
                    <tr>
                        <th>รายละเอียด :&nbsp;</th>
                        <td class="style14"><input type="text" name="txt_description" id="txt_description" value="<% out.print(case1.getDescription());%>" size="40">
                            &nbsp;&nbsp;&nbsp;
                        หมายเหตุ :&nbsp;<input type="text" name="txt_remark" id="txt_remark" value="<% out.print(case1.getRemark());%>" size="40">

                        </td>
                    </tr>
                    <%out.print(text2);%>
    </table></td>
                </tbody>
            </table>





            <table border="0" width="100%">
                    <thead>
                        <tr>
                            <th width="10" align="center">&nbsp;</th>
                            <th width="15">วันที่</th>
                            <th width="15">เวลา</th>
                            <th width="<%out.print(width_patient_name);%>">ชื่อผู้มาใช้บริการ</th>
                            <th width='40'>HN NO</th>
                            <th width="15">VN</th>
                            <th width="50">ประเภทสิทธิ</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%out.print(text);%>
                    </tbody>
            </table>





        </form>
    </body>
    <DIV ID="testdiv1" STYLE="position:absolute;visibility:hidden;background-color:white;layer-background-color:white;"></DIV>
    <script>
    function changesubmitsave() {
          //var usernametfoodsorder = document.getElementById("cbo_user_foods_order").value;
          //var usernametfoodsreceive = document.getElementById("cbo_user_foods_receive").value;
          //var usernametnutritionist = document.getElementById("cbo_user_foods_nutritionist").value;
          //var usernametfoodsorder="",usernametfoodsreceive="",usernametnutritionist="";
        document.forms[0].action = "admin_case_add.jsp?flagpage=import_date&flag_redirect=save";
        document.forms[0].submit();
        return false;
      }
      function changesubmitcancel() {
        document.forms.admin_case_add.txt_case_active.value = '3';
        document.forms[0].action = "admin_case_add.jsp?flagpage=save&flag_redirect=cancel";
        document.forms[0].submit();
        return false;
      }
      function changesubmitprint() {
        var case_id = document.getElementById("txt_case_id").value;
        document.forms[0].action = "rpt_report_view.jsp?txt_report_name=admin_case_detail&txt_form=daily&case_id="+case_id;
        document.forms[0].submit();
        return false;
      }

    </script>
</html>
