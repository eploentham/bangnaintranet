<%-- 
    Document   : rpt_critiria_patient_visit_hb-typing
    Created on : Oct 2, 2009, 8:53:27 AM
    Author     : root
--%>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="java.sql.*" %>
<%@page import="bangnaintranet.RptBangna.*;"%>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
ComboDB combodb = new ComboDB(config1);
RptBangna rptbangna = new RptBangna();
ReportName reportname;
String txt_reportname="", txt_critiria1="", txt_critiria2="", txt_critiria3="", reportnamet="",txt_critiria4="",txt_critiria5="";
String txt_cbo_month="", txt_cbo_year="", cbotime="", flag="", txt_cbo_claim="",txt_critiria_branch="";
String txt_cbo_branch="", chk_status_sex="",txt_cbo_lab="",txt_critiria6="";
if(request.getParameter("txt_report_name")!=null){
    txt_reportname = new String (request.getParameter("txt_report_name").getBytes("ISO8859_1"),"TIS-620");
}else{
    txt_reportname="patient_visit_hb-typing";
    }
if(request.getParameter("flag")!=null){
    flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("chk_status_sex")!=null){
    chk_status_sex = new String (request.getParameter("chk_status_sex").getBytes("ISO8859_1"),"TIS-620");
}else{
    chk_status_sex="all";
}
if(request.getParameter("cbo_claim")!=null){
    txt_cbo_claim = new String (request.getParameter("cbo_claim").getBytes("ISO8859_1"),"TIS-620");
}else{
    txt_cbo_claim="all";
}
//txt_reportname="doctor_dx_groupby_typepayment";
    txt_cbo_branch=combodb.getComboBranch("");
    txt_cbo_lab=combodb.CboLab("103001","");
    //txt_cbo_year=config1.getComboYear("");
    txt_cbo_claim=combodb.CboClaimNamet("103001","");
    //cbotime=config1.CboTime();
    txt_critiria_branch = "<tr> <td class='style14' width='100'>�Ң�</td> "
                +"<td colspan='5' class='style14' width='250'>"
                +"<select name='cbo_branch' id='cbo_branch'> "
                +txt_cbo_branch+"</select>&nbsp; "
                +"</td> </tr>";
    txt_critiria1 = "<tr> <td class='style14' width='100'>��Ш��ѹ���</td> "
                +"<td colspan='2' class='style14' width='250'>"
                +"<input type='text' name='txt_date_start' id='txt_date_start' value='' readonly='readonly' class='dateinput' /></td> "
                +"<!--<td class='style14'></td>--> "
                +"<td class='style14' width='100'>�֧�ѹ���</td> "
                +" <td colspan='2' class='style14' width='250'><input type='text' name='txt_date_end' id='txt_date_end' value='' readonly='readonly' class='dateinput' />&nbsp; "
                +"</td> </tr>";
    txt_critiria2 = "<tr><td class='style14'>�������Է��</td> "
                +"<td colspan='5' class='style14'><label> "
                +"<select name='cbo_claim' id='cbo_claim'> "
                +txt_cbo_claim+"</select> "
                +"</label></td> "
                +"</tr> ";
    //txtcritiria2="";// ����� ����դ���������
        txt_critiria3="<tr><td class='style14'>���͹� ��</td>"
                +"<td colspan='2' class='style14'><label> "
                +"<input type='radio' name='chk_status_sex' value='1' id='chk_status_sex' checked onClick='changeselecttime(report);'> "
                +"���</label> </td>"
                +"<td colspan='3' class='style14'><label> "
                +"<input type='radio' name='chk_status_sex' value ='2' id='chk_status_sex' onClick='changeselecttime(graph);'>˭ԧ</label></td>"
                +"</tr> ";
        txt_critiria4="<tr><td class='style14'>���͹� LAB</td>"
                +"<td colspan='5' class='style14'><label> "
                +"<select name='cbo_lab' id='cbo_lab'> "
                +txt_cbo_lab+"</select> </td>"
                +"</tr> ";
        txt_critiria5 = "<tr> <td class='style14' width='100'>���͹� age</td> "
                +"<td colspan='2' class='style14' width='250'>"
                +"<input type='text' name='txt_age_start' id='txt_age_start' value='' /></td> "
                +"<!--<td class='style14'></td>--> "
                +"<td class='style14' width='100'></td> "
                +" <td colspan='2' class='style14' width='250'><input type='text' name='txt_age_end' id='txt_age_end' value='' />&nbsp; "
                +"</td> </tr>";
        txt_critiria6="<tr><td class='style14'>���͹� </td>"
                +"<td colspan='2' class='style14'><label> "
                +"<input type='radio' name='chk_status_lab' value='noshow' id='chk_status_lab' checked onClick='changeselecttime(report);'> "
                +"����ʴ��� LAB</label> </td>"
                +"<td colspan='3' class='style14'><label> "
                +"<input type='radio' name='chk_status_lab' value ='show' id='chk_status_lab' onClick='changeselecttime(graph);'>�ʴ��� LAB</label></td>"
                +"</tr> ";
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">
        
        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>

        <title>JSP Page</title>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#txt_date_start").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#txt_date_end").datepicker({ dateFormat: 'dd-mm-yy' });

            });

        </script>
        <script type="text/javascript">
           // Load Dojo's code relating to the Button widget
           dojo.require("dijit.form.Button");
        </script>
        <script type="text/javascript">
          dojo.require("dijit.form.DateTextBox");
          dojo.require("dojo.parser");
        </script>
    </head>
    <body>
        <form name="rpt_critiria_patient_visit_hb-typing" method="post" action="rpt_report_view.jsp">
        <table width="606" border="0" cellspacing="0" cellpadding="0" align="center">
                      <tr class="style14b">
                          <th colspan="6" scope="col" align="center">���͡��¡��</th>
                      </tr>
                      <%out.print(txt_critiria_branch);%>
                      <%out.print(txt_critiria1);%>
                      <%out.print(txt_critiria2); %>
                      <%out.print(txt_critiria3); %>
                      <%out.print(txt_critiria4); %>
                      <%out.print(txt_critiria5); %>
                      <%out.print(txt_critiria6); %>
                      <tr>
                        <td class="style14"  colspan="6">&nbsp;</td>
                      </tr>
                      <tr>
                        <td width="82" class="style14">&nbsp;</td>
                        <td width="80" class="style14" colspan="2">
                          <label></label><label>
                          <input type="button" name="btn_summit" id="btn_summit" value="Submit" onclick="changesubmitform();">
                          <input type="hidden" name="txt_report_name" id="txt_report_name" value=<%out.print(txt_reportname);%>>
                          <input type="hidden" name="txt_form" id="txt_form" value="daily">
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
        document.forms[0].action = "rpt_critiria_patient_visit_hb.jsp?flag="+flag;
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
