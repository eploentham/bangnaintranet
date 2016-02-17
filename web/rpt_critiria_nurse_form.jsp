<%-- 
    Document   : rpt_critiria
    Created on : 1 ก.ค. 2552, 10:58:10
    Author     : pop
--%>
<%@page import ="bangnaintranet.*" %>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
String date_start = "", ward="", hn_no="", flag="", cboward="", cbohn_no="", flag_page="", date_startdb="";
date_start = config1.StringNull(request.getParameter("txt_date_start"));
if(date_start.equals("")){
    date_start = config1.getDate("ddMMyyyy");
    }
cboward = config1.StringNull(request.getParameter("cbo_ward"));
cbohn_no = config1.StringNull(request.getParameter("cbo_hn_no"));
flag = config1.StringNull(request.getParameter("flag"));
flag_page = config1.StringNull(request.getParameter("flag_page"));
NurseFormDB nurseformdb = new NurseFormDB();
//Vector v = nurseformdb.SearchForm(date_start, ward, flag);
if(flag.equals("ward")) {
        ward = nurseformdb.CboWard(date_start,flag, cboward,"");
    }
else if(flag.equals("dental")){
    
    }
else {
        ward = nurseformdb.CboWard(date_start,"ward", cboward,"");
        hn_no = nurseformdb.CboWard(date_start,flag, cbohn_no, cboward);
    }
if(flag_page.equals("dental")){
    date_startdb = config1.DateFormatShow2DB(date_start,"ddMMyyyy");
    hn_no = config1.CboPatientVisit("103001",date_startdb,"115",flag, "");
    }
else if(flag_page.equals("lab")){
    
    }

%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">

        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#txt_date_start").datepicker({ dateFormat: 'dd-mm-yy' });
            });
        </script>
    </head>
    <body>
<form name="rpt_critiria_nurse_form" method="post" action="noti_repair_save.jsp">



    <table align="center" width="600" border="0" cellspacing="0" cellpadding="0">
      <thead>
            <!--<tr>
                <th width="35%" ></th>
                <th width="65%"></th>
            </tr>-->
      <th colspan="2" scope="col"><div align="center">เลือกรายการ</div></th>
        </thead>
        <!--<tr>
        
        </tr>-->
      <tr>
        <th scope="row"  width="120" ><div align="left">วันที่ :</div></th>
        <td  class="style14b"><div align="left">
<input type="hidden" name="flag_page" id="flag_page" value="<%out.print(flag_page);%>" readonly="readonly" />
            <input type="text" name="txt_date_start" id="txt_date_start" value="<%out.print(date_start);%>" readonly="readonly" />
            
            <A HREF="#" onClick="changesubmitward();" NAME="anchor" ID="anchor">&nbsp;
            <img src="images/lightbulb.gif" alt="" width="19" height="19" border="0"></A>
          </div></td>
      </tr>
      <% if(!flag_page.equals("dental")) {%>
      <tr>
        <th scope="row"  width="120" ><div align="left">Ward :</div></th>
        <td class="style14b"><div align="left">

            <label>
              <select name="cbo_ward" id="cbo_ward">
                  <%out.print(ward); %>
              </select></label>
          <A HREF="#" onClick="changesubmithnno();" NAME="anchor2" ID="anchor2">&nbsp;
            <img src="images/lightbulb.gif" alt="" width="19" height="19" border="0"></A></div></td>
      </tr>
      <% }%>
      <tr>
        <th scope="row"  width="120" ><div align="left">HN :</div></th>
        <td class="style14b"><div align="left">
          <label>
              <select name="cbo_hn_no" id="cbo_hn_no">
                  <%out.print(hn_no); %>
              </select>
              </label>
        </div></td>
      </tr>



      <tr>
        <th scope="row"  width="120" ><div align="left">HN :</div></th>
        <td class="style14b"><div align="left">
                <% if(flag_page.equals("nurse")) { %>
          <label><input type="radio" name="txt_report_name" value="nurse_form_001" id="nurse_form_001"  >001 (ใบบันทึกการให้ยาฉีด)</label>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_002" id="nurse_form_002" >002 (ใบบันทึกการให้ยาฉีด-รับประทาน)</label>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_003" id="nurse_form_003" >003 (ใบบันทึกการให้ยารับประทาน)</label>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_004" id="nurse_form_004" >004 (ใบสรุปการรักษาพยาบาล)</label>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_005" id="nurse_form_005" >005 (ใบบันทึกการให้สารละลายทางหลอดเลือดดำ)</label>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_006" id="nurse_form_006" >006 (ใบบันทึกการให้เลือด+ดูแลบาดแผล)</label>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_007" id="nurse_form_007"  disabled >007 (ใบบันทึกการดูแลบาดแผล)</label>
          
          <% } %>
          
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_patient_grant_hiv" id="nurse_form_patient_grant_hiv" >008 (หนังสือแสดงความยินยอมตรวจเชื้อเอดส์)</label>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_patient_grant_hiv_suggest" id="nurse_form_patient_grant_hiv_suggest" >008.1 (ใบคำแนะนำการตรวจ HIV)</label>
          <% if(flag_page.equals("dental")) { %>
          <br><label><input type="radio" name="txt_report_name" value="dental_form_patient_regis" id="dental_form_patient_regis" >009 (ใบบันทึกข้อมูลผู้รับบริการทัตนกรรม)</label>
          <% } %>
          <br><label><input type="radio" name="txt_report_name" value="nurse_form_request_blood" id="nurse_form_request_blood" >010 (ใบขอใช้โลหิต ศูนย์บริการโลหิตแห่งชาติ สภากาชาดไทย)</label>
          </div>

        </td>
      </tr>



      <tr>
        <th scope="row"  width="120" ><div align="left"></div></th>
        <td class="style14b"><div align="left">
          <label>
              <input type="button" name="btn_summit" id="btn_summit" value="Submit" onclick="changesubmitform();">
          </label>
        &nbsp;
        <label>
        <input type="reset" name="btn_cancel" id="btn_cancel" value="Cancel">
        <input type="hidden" name="txt_type_datebase" value="mainhis" >
        <input type="hidden" name="txt_form" value="rpt_critiria_nurse_form" >
        <input type="hidden" name="txt_status" value="1" >
        </label>
        </div></td>
      </tr>
    </table>


        <!--<table width="906" border="0" align="center" cellpadding="0" cellspacing="0">
          <tr>
            <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="20" valign="top" bgcolor="#FFFFFF"><img src="images/fglt20.gif" width="20" height="20"></td>
                    <td valign="top" background="images/fgtt20.gif"><img src="images/fgtt20.gif" width="20" height="20"></td>
                    <td width="20" valign="top" bgcolor="#FFFFFF"><img src="images/fgrt20.gif" width="20" height="20"></td>
                  </tr>
                </table>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="20" valign="top" background="images/fgll20.gif"><img src="images/fgll20.gif" width="20" height="20"></td>
                    <td align="center">
                    <table width="100%" border="0" cellspacing="0" cellpadding="0">                    
                        <tr><td>

                        	


                        </td></tr>
                    </table></td>
                    <td width="20" valign="top" background="images/fgrr20.gif"><img src="images/fgrr20.gif" width="20" height="20"></td>
                  </tr>
                </table>
                <table width="100%" border="0" cellspacing="0" cellpadding="0">
                  <tr>
                    <td width="20" valign="top"><img src="images/fglb20.gif" width="20" height="20"></td>
                    <td background="images/fgbb20.gif"><img src="images/fgbb20.gif" width="20" height="20"></td>
                    <td width="20" valign="top"><img src="images/fgrb20.gif" width="20" height="20"></td>
                  </tr>
                </table></td>
          </tr>
        </table>-->
        </form>
    </body>
<script>
  function changesubmitward() {
      var flag_page = document.getElementById("flag_page").value;
    document.forms[0].action = "rpt_critiria_nurse_form.jsp?flag=ward&flag_page="+flag_page;
    document.forms[0].submit();
    return false;
  }
  function changesubmithnno() {
      var flag_page = document.getElementById("flag_page").value;
    document.forms[0].action = "rpt_critiria_nurse_form.jsp?flag=hnno&flag_page="+flag_page;
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
