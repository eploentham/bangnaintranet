<%-- 
    Document   : rpt_critiria_daily_patient_use_pharmacy
    Created on : Oct 12, 2009, 10:38:42 AM
    Author     : root
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
String txt_reportname="";
String flag="", txtcreitria3time="",txtcritiriabranch="", flagall="";
String txtcbobranch="", start_date="", end_date="", txtcritiria1="",cbo_pharmacy="",pharmacy_id="";
if(request.getParameter("txt_report_name")!=null) {
    txt_reportname = new String (request.getParameter("txt_report_name").getBytes("ISO8859_1"),"TIS-620");
    }
else{
    txt_reportname="daily_patient_use_pharmacy";
    }
if(request.getParameter("flag")!=null){
    flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
    }
//txt_reportname="doctor_dx_groupby_typepayment";
    txtcbobranch=config1.getComboBranch("");
    cbo_pharmacy=config1.CboPharmacy("103001","");

    //cbotime=config1.CboTime();
    txtcritiriabranch = "<tr> <td class='style14' width='100'>�Ң�</td> "
                +"<td colspan='5' class='style14' width='250'> "
                +"<select name='cbo_branch' id='cbo_branch'> "
                +txtcbobranch+"</select>&nbsp; "
                +"</td> </tr>";
    txtcritiria1="<tr> <th width='100'>������ :</th> "
                +"<td colspan='3' class='style14' width='250'> "
                +"<select name='cbo_pharmacy' id='cbo_pharmacy'> "
                +cbo_pharmacy+"</select>&nbsp; "
                +"</td> </tr>";


    //select mnc_adm_flg, count(pt01.mnc_hn_no) from patient_t01 pt01
//inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no
//where pt01.mnc_sec_no in ('111','112','113','114','115','116') and pt01.mnc_date = '2009-06-01'
//group by pt01.mnc_adm_flg



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
                $("#txt_date_start").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#txt_date_end").datepicker({ dateFormat: 'dd-mm-yy' });

            });

        </script>
        <style type="text/css">
            .blue { color: blue; }
        </style>
    </head>
    <body>
        <form name="rpt_critirai_daily_patient_use_pharmacy" method="post">

            <table width="600" border="0" cellspacing="0" cellpadding="0" align="center">
                      <tr class="style14b">
                          <th colspan="6" scope="col" align="center">���͡��¡��</th>
                      </tr>
                      <tr>
                        <th scope="row" width="100" ><div align="left">�Ң� :</div></th>
                        <td colspan='2' class='style14' width='250'>
                            <select name='cbo_branch' id='cbo_branch'> <% out.print(txtcbobranch); %></select>&nbsp;
                            </td>
                      </tr>
                      <tr>
                        <th scope="row" width="100" ><div align="left">��Ш��ѹ��� :</div></th>
                        <td width="200"><input type="text" name="txt_date_start" id="txt_date_start" value="" readonly="readonly" class="dateinput" />
                        <!--<input dojoType="dijit.form.DateTextBox" type="text" name="datesaisie" id="datesaisie" value="" required="true" />--></td>
                        <td width="200"><input type="text" name="txt_date_end" id="txt_date_end" value="" readonly="readonly" class="dateinput" />
                        <!--<input dojoType="dijit.form.DateTextBox" type="text" name="datesaisie" id="datesaisie" value="" required="true" />--></td>
                    </tr>
                        <%out.print(txtcritiria1);%>
                      <tr>
                          <th scope="row" width="100" ><div align="left">���͹� :</div></th>
                        <td class="style14" colspan='3'>
                            <label ><input type="radio" name="chk_status" value="detail" id="status_1"   />��������´</label>&nbsp;&nbsp;
                            <label><input type="radio" name="chk_status" value="sum" id="status_1" disabled/>��ػ</label>
                        </td>
                        <!--<td>�ӹǹ��§ : <input type="text" name="txt_bed" id="txt_bed" value="100" class="style14" size="5"></td>-->
                      </tr>

                      <tr>
                          <td></td>
                        <td width="80" class="style14" >
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