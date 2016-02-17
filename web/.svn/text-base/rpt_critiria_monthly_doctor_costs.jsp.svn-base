<%-- 
    Document   : rpt_critiria_monthly_bangna_costs
    Created on : 16 ก.ค. 2552, 11:59:46
    Author     : pop
--%>
<%@page import ="bangnaintranet.*" %>
<%@page import ="java.sql.*" %>
<%@page import="bangnaintranet.RptBangna.*;"%>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
RptBangna rptbangna = new RptBangna();
ReportName reportname;
String txt_reportname="", txtcritiria1="", txtcritiria2="", txtcritiria3="", reportnamet="";
String txtcbomonth="", txtcboyear="", cbotime="", flag="", txtcbodoctor="",txtcritiriabranch="";
String txtcbobranch="", chk_selected_status_daynight="";
if(request.getParameter("txt_report_name")!=null){
    txt_reportname = new String (request.getParameter("txt_report_name").getBytes("ISO8859_1"),"TIS-620");
    }
else{
    txt_reportname="monthly_doctor_costs";
    }
if(request.getParameter("flag")!=null){
    flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("chk_status_daynight")!=null){
    chk_selected_status_daynight = new String (request.getParameter("chk_status_daynight").getBytes("ISO8859_1"),"TIS-620");
    }
else{
    chk_selected_status_daynight="all";
    }
//txt_reportname="doctor_dx_groupby_typepayment";
    txtcbobranch=config1.getComboBranch("");
    txtcbomonth=config1.getComboMonth("");
    txtcboyear=config1.getComboYear("");
    txtcbodoctor=config1.getTRDoctorFullNamet("103001", "");
    //cbotime=config1.CboTime();
    txtcritiriabranch = "<tr> <td class='style14' width='100'>สาขา</td> "
                +"<td colspan='5' class='style14' width='250'>"
                +"<select name='cbo_branch' id='cbo_branch'> "
                +txtcbobranch+"</select>&nbsp; "
                +"</td> </tr>";
    txtcritiria1 = "<tr> <td class='style14' width='100'>ประจำเดือน</td> "
                +"<td colspan='2' class='style14' width='250'>"
                +"<select name='cbo_month_start' id='cbo_month_start'> "
                +txtcbomonth+"</select>&nbsp; "
                +"<select name='cbo_year_start' id='cbo_year_start'> "
                +txtcboyear+"</select></td> "
                +"<!--<td class='style14'></td>--> "
                +"<td class='style14' width='100'>ถึงเดือน</td> "
                +" <td colspan='2' class='style14' width='250'><select name='cbo_month_end' id='cbo_month_end'> "
                +txtcbomonth+"</select>&nbsp; "
                +"<select name='cbo_year_end' id='cbo_year_end'> "
                +txtcboyear+"</select></td> </tr>";
    txtcritiria2 = "<tr><td class='style14'>แพทย์</td> "
                +"<td colspan='3' class='style14'><label> "
                +"<select name='cbo_type1_start' id='cbo_type1_start'> "
                +txtcbodoctor+"</select> "
                +"</label></td> "               
                +"</tr> ";
    //txtcritiria2="";// ไม่มี ถ้ามีค่อยมาเพิ่ม
        txtcritiria3="<tr><td class='style14'>เงื่อนไข</td>"
                +"<td colspan='2' class='style14'><label> "
                +"<input type='radio' name='chk_status_graph' value='report' id='status_report' onClick='changeselecttime(report);'> "
                +"รายงาน</label> </td>"
                +"<td colspan='3' class='style14'><label> "
                +"<input type='radio' name='chk_status_graph' value ='graph' id='status_graph' onClick='changeselecttime(graph);'>กราฟ</label></td>"
                +"</tr> ";
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="rpt_critiria_yearly_bangna_costs" method="post" action="rpt_report_view.jsp">
        <table width="606" border="0" cellspacing="0" cellpadding="0" align="center">
                      <tr class="style14b">
                          <th colspan="6" scope="col" align="center">เลือกรายการ</th>
                      </tr>
                      <%out.print(txtcritiriabranch);%>
                      <%out.print(txtcritiria1);%>
                      <%out.print(txtcritiria2); %>
                      <%out.print(txtcritiria3); %>
                      <tr>
                        <td class="style14"  colspan="6">&nbsp;</td>
                      </tr>
                      <tr>
                        <td width="82" class="style14">&nbsp;</td>
                        <td width="80" class="style14" colspan="2">
                          <label></label><label>
                          <input type="button" name="btn_summit" id="btn_summit" value="Submit" onclick="changesubmitform();">
                          <input type="hidden" name="txt_report_name" id="txt_report_name" value=<%out.print(txt_reportname);%>>
                          <input type="hidden" name="txt_form" id="txt_form" value="monthly">
                          </label></td>
      <td width="206" class="style14" colspan="3"><label>
                          <input type="reset" name="btn_reset" id="btn_reset" value="Cancel">
                        </label></td>
                      </tr>
                    </table>
        </form>
    </body>
    <script>
      function changeselecttime(flag) {
        document.forms[0].action = "rpt_critiria_yearly_bangna_costs.jsp?flag="+flag;
        document.forms[0].submit();
        return false;
      }
      function changesubmitform() {
        document.forms[0].action = "rpt_report_view.jsp";
        document.forms[0].submit();
        return false;
      }
    </script>
</html>
