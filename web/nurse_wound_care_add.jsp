<%-- 
    Document   : nurse_wound_care
    Created on : 17 ก.ค. 2552, 11:03:12
    Author     : pop
--%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
NurseTWoundCareDB nursetwoundcaredb = new NurseTWoundCareDB();
NurseTWoundCare nursetwoundcare = new NurseTWoundCare();
NurseTWoundCareDetail nursetwoundcaredetail = new NurseTWoundCareDetail();
Vector v_woundcare = new Vector();
Vector v_woundcare_detail = new Vector();
String text="", patient_hn_no="",patient_full_namet="", wound_care_running_doc="";
String cbo_wound_care_running_doc="", flag="",cbo_patient_hn_no="", flagcreate="";
String wound_care_id="", wound_care_date="", cbo_wound_care_date="",wound_care_detail_id="";
String flagdetailnew="";
//String wound_care_running_doc="";
if(request.getParameter("txt_hn_no")!=null){
        patient_hn_no = new String (request.getParameter("txt_hn_no").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("flag")!=null){
        flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("flagcreate")!=null){
        flagcreate = new String (request.getParameter("flagcreate").getBytes("ISO8859_1"),"TIS-620");
    }
if(flag.equals("runningdoc")){
        wound_care_running_doc = nursetwoundcaredb.getMaxRunningDocNo();
        cbo_wound_care_running_doc = nursetwoundcaredb.CboWoundCare(patient_hn_no, wound_care_running_doc);
    }
if(flag.equals("wound_care_show")){
    if(request.getParameter("wound_care_id")!=null){
        wound_care_id = new String (request.getParameter("wound_care_id").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("wound_care_detail_id")!=null){
        wound_care_detail_id = new String (request.getParameter("wound_care_detail_id").getBytes("ISO8859_1"),"TIS-620");
        }
    }
if(request.getParameter("flagdetailnew")!=null){
        flagdetailnew = new String (request.getParameter("flagdetailnew").getBytes("ISO8859_1"),"TIS-620");
        }
else if(flag.equals("hnno")) {
        //cbo_patient_hn_no = nurseformdb.CboWard(date_start,"ward", cboward,"");
    }
if(!patient_hn_no.equals("")){
    patient_full_namet = config1.getPatientFullNamet("103001",patient_hn_no);
    v_woundcare = nursetwoundcaredb.getNurseTWoundCare(patient_hn_no, "hn_no_groupby_hn_no");
    if(v_woundcare.size()<=0){
        flagcreate="1";
        }
    else if(flag.equals("wound_care_show")) {
        if(request.getParameter("cbo_wound_care_running_doc")!=null){
            wound_care_id = new String (request.getParameter("cbo_wound_care_running_doc").getBytes("ISO8859_1"),"TIS-620");
        }
        cbo_wound_care_running_doc = nursetwoundcaredb.CboWoundCare(v_woundcare, wound_care_id);
        cbo_wound_care_date = nursetwoundcaredb.CboWoundCareDetail(wound_care_id, wound_care_id);
        nursetwoundcare = nursetwoundcaredb.getNurseTWoundCareByPK(wound_care_id);
        if(!wound_care_detail_id.equals("")){
            nursetwoundcaredetail =  (NurseTWoundCareDetail)nursetwoundcaredb.getNurseTWoundCareDetail(wound_care_detail_id, "wound_care_detail_id").get(0);
            //nursetwoundcaredetail = v_woundcare_detail.get(0);
            }
        else{
            nursetwoundcaredetail = new NurseTWoundCareDetail();
            nursetwoundcaredetail.setWoundCareId(wound_care_id);
            }
        }
    else{
        cbo_wound_care_running_doc = nursetwoundcaredb.CboWoundCare(v_woundcare, wound_care_running_doc);
        }
    flagcreate="1";
    }

if(flagcreate.equals("1")){
    //wound_care_running_doc = nursetwoundcare.getMaxRunningDocNo();
    }
%>
<html>
    <head>
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <SCRIPT LANGUAGE="JavaScript" SRC="js/CalendarPopup.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/AnchorPosition.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/PopupWindow.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/date.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript">
	var cal = new CalendarPopup("testdiv1");
	</SCRIPT>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
    </head>
    <body>
        <form name="nurse_wound_care_add" method="post" action="nurse_wound_care_add.jsp">

    <table align="center" width="800" border="0" cellspacing="0" cellpadding="0">
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
        <th scope="row"  width="120" ><div align="left">HN NO :</div></th>
        <td  class="style14b"><div align="left">

                <input type="text" name="txt_hn_no" id="txt_hn_no" value="<%out.print(patient_hn_no);%>" size="8">
            <A HREF="#" onClick="changesubmithnno();" NAME="anchor" ID="anchor">
            <img src="images/lightbulb.gif" alt="" width="19" height="19" border="0"></A>&nbsp;
            <input type="text" name="txt_patient_full_namet" id="txt_patient_full_namet"
                   value="<%out.print(patient_full_namet);%>" size="50" >
          </div></td>
      </tr>
      <!--<tr>
        <th scope="row"  width="120" ><div align="left">ชื่อ นามสกุล :</div></th>
        <td class="style14b"><div align="left">
            <label></label>
            
        </div></td>
      </tr>-->
      <tr>
        <th scope="row"  width="120" ><div align="left">เลขที่เอกสาร :</div></th>
        <td class="style14b"><div align="left">
          <label>
              <select name="cbo_wound_care_running_doc" id="cbo_wound_care_running_doc">
                  <%out.print(cbo_wound_care_running_doc); %>
              </select>
          </label>
          <A HREF="#" onClick="changesubmitwoundcarerunningdocshow(document.getElementById('cbo_wound_care_running_doc').value);" NAME="anchor" ID="anchor2">
              <img src="images/lightbulb.gif" alt="" width="19" height="19" border="0"></A>
              <% if(flagcreate.equals("1")) { %>
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A class="style14" HREF="#" onClick="changesubmitwoundcarerunningdoccreate();" NAME="anchor" ID="anchor2">
  สร้างเลขที่เอกสารใหม่</A>
              <input type="text" name="txt_wound_care_running_doc" id="txt_wound_care_running_doc"
                     value="<%out.print(wound_care_running_doc);%>" size="10" >
              <A HREF="#" onClick="changesubmitwoundcarerunningdocsave();" NAME="anchor" ID="anchor2">
              <img src="images/savedrafticon.gif" alt="" width="16" height="16" border="0"></A>
              <% }%></div>
        </td>
      </tr>


        <input type="hidden" name="txt_type_datebase" value="mainhis" >
        <input type="hidden" name="txt_form" value="daily" >
        <input type="hidden" name="txt_report_name" value="nurse_wound_care" >
        <input type="hidden" name="txt_status" value="1" >
        <input type="hidden" name="txt_wound_care_detail_new" value="<%out.print(flagdetailnew);%>" >
        <input type="hidden" id="txt_wound_care_id" name="txt_wound_care_id" value="<%out.print(nursetwoundcare.getWoundCareId());%>" >
        <input type="hidden" id="txt_wound_care_detail_id" name="txt_wound_care_detail_id" value="<%out.print(nursetwoundcaredetail.getWoundCareDetailId());%>" >
      <!--<tr>
        <th scope="row"  width="120" ><div align="left">HN :</div></th>
        <td class="style14b"><div align="left">
          <label></label>
        </div>

        </td>
      </tr>



      <tr>
        <th scope="row"  width="120" ><div align="left"></div></th>
        <td class="style14b"><div align="left">
          <label>
              <input type="button" name="btn_summit" id="btn_summit" value="Submit" onclick="changesubmitform();">
            <input type="reset" name="btn_cancel" id="btn_cancel" value="Cancel">
      </label>
        &nbsp;
        <label>
        
        </label>
        </div></td>
      </tr>-->
    </table>


        <% if(flag.equals("wound_care_show") && (!wound_care_id.equals(""))) {%>
        <table border="0" width="100%">
            <thead>
                <tr colspan="2" scope="col">
                    <th>ใบบันทึกการดูแลบาดแผล&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <label><a href="#" onclick="changesubmitreport(document.getElementById('txt_wound_care_id').value);">
พิมพ์ใบการดูแลบาดแผล&nbsp;<img src="images/printer-a.png" alt="" width="16" height="16" border="0"></a></label>
                    </th>
                </tr>
            </thead>
            <tbody>
                <tr  colspan="2">
                    <td><label>ชื่อ-สกุล :
                    <input type="text" name="txt_wound_care_patient_full_namet"
                           id="txt_wound_care_patient_full_namet" value="<%out.print(nursetwoundcare.getPatientFullNamet());%>" readonly=true" size="20">
                    </label>
                    <label>อายุ :
                    <input type="text" name="txt_wound_care_patient_age"
                           id="txt_wound_care_patient_age" value="<%out.print(nursetwoundcare.getPatientAge());%>" readonly=true" size="2">
                    ปี</label>
                    <label>HN NO :
                    <input type="text" name="txt_wound_care_patient_hn_no"
                           id="txt_wound_care_patient_hn_no" value="<%out.print(nursetwoundcare.getPatientHnNo());%>" readonly=true" size="7">
                    </label>
                    <label>AN :
                    <input type="text" name="txt_wound_care_patient_an"
                           id="txt_wound_care_patient_an" value="<%out.print(nursetwoundcare.getPatientAn());%>" size="5">
                    </label>
                    <label>Tel Phone :
                    <input type="text" name="txt_wound_care_patient_phone_number"
                           id="txt_wound_care_patient_phone_number" value="<%out.print(nursetwoundcare.getPatientPhoneNumber());%>"  size="7">
                    </label>
                    <label>ห้อง/เตียง :
                    <input type="text" name="txt_wound_care_patient_bed_room"
                           id="txt_wound_care_patient_bed_room" value="<%out.print(nursetwoundcare.getPatientBedRoom());%>"  size="3">
                    </label>
                    <label>ภาวะเสี่ยง(Ref.1) :
                    <input type="text" name="txt_wound_care_patient_bed_room"
                           id="txt_wound_care_patient_bed_room" value="<%out.print(patient_hn_no);%>"  size="10">
                    </label>
                    </td>
                </tr>
                <tr  colspan="2">
                    <td>
                    <label>สาเหตุการเกิดแผล :
                    <label><input type="radio" name="chk_wound_cause" value="1" id="status_1" 
                      <% if(nursetwoundcare.getWoundCause().equals("1")) { out.print("checked"); }%>/>1.หัตถการ</label>
                    <label><input type="radio" name="chk_wound_cause" value="2" id="status_2"
                      <% if(nursetwoundcare.getWoundCause().equals("2")) { out.print("checked"); }%>/>2.อุบัติเหตุ</label>
                    </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <label>ประเภทบาดแผลตามหลัก IC :
                    <label><input type="radio" name="chk_wound_category" value="1" id="status_1"
                      <% if(nursetwoundcare.getWoundCategory().equals("1")) { out.print("checked"); }%>/>1.Clean&nbsp;</label>
                    <label><input type="radio" name="chk_wound_category" value="2" id="status_2"
                      <% if(nursetwoundcare.getWoundCategory().equals("2")) { out.print("checked"); }%>/>2.Clean contaminate</label>
                    <label><input type="radio" name="chk_wound_category" value="3" id="status_3"
                      <% if(nursetwoundcare.getWoundCategory().equals("3")) { out.print("checked"); }%>/>3.contaminate</label>
                    <label><input type="radio" name="chk_wound_category" value="4" id="status_4"
                      <% if(nursetwoundcare.getWoundCategory().equals("4")) { out.print("checked"); }%>/>4.Dirty&nbsp;</label>
                    </label>
                    </td>
                    <!--<td></td>-->
                </tr>
                <tr  colspan="2">
                    <td>
                    <label>ลักษณะบาดแผล :
                    <label><input type="radio" name="chk_wound_appearance" value="1" id="status_1"
                      <% if(nursetwoundcare.getWoundAppearance().equals("1")) { out.print("checked"); }%>/>1.ผ่าตัด</label>
                    <label><input type="radio" name="chk_wound_appearance" value="2" id="status_2"
                      <% if(nursetwoundcare.getWoundAppearance().equals("2")) { out.print("checked"); }%>/>2.Suture</label>
                    <label><input type="radio" name="chk_wound_appearance" value="3" id="status_3"
                      <% if(nursetwoundcare.getWoundAppearance().equals("3")) { out.print("checked"); }%>/>3.Drainage</label>
                    <label><input type="radio" name="chk_wound_appearance" value="4" id="status_4"
                      <% if(nursetwoundcare.getWoundAppearance().equals("4")) { out.print("checked"); }%>/>4.Trauma</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <label>ชนิดบาดแผล (Ref.2) <input type="input" name="txt_wound_type"
                         value="<%out.print(nursetwoundcare.getWoundType());%>" id="txt_wound_type" /></label>
                    </label>
                    </td>
                </tr>
                <tr  colspan="2">
                    <td><label>
                    <label>ตำแหน่งบาดแผล <input type="input" name="txt_wound_location"
                        value="<%out.print(nursetwoundcare.getWoundLocation());%>" id="txt_wound_location" ></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <label>ประเมินระยะเวลาการหายของบาดแผล <input type="input" name="txt_wound_treatment_cured_estimate"
                        value="<%out.print(nursetwoundcare.getWoundTreatmentCuredEstimate());%>" id="txt_wound_treatment_cured_estimate"  size="3" > วัน </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <label>จำนวนวันหายจริง <input type="input" name="txt_wound_treatment_cured_real"
                                                  value="<%out.print(nursetwoundcare.getWoundTreatmentCuredReal());%>" id="txt_wound_treatment_cured_real" size="3" ></label>
                    </label>
                    </td>
                </tr>
                <tr  colspan="2">
                    <td><label>
                    <label>คำบรรยายของบาดแผล <input type="input" name="txt_wound_description"
                        value="<%out.print(nursetwoundcare.getWoundDescription());%>" id="txt_wound_description" size="50"></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <label>หมายเหตุของพยาบาลผู้ดูแล <input type="input" name="txt_nurse_remark"
                        value="<%out.print(nursetwoundcare.getNurseRemark());%>" id="txt_nurse_remark" size="50" ></label>
                    </label></td>
                </tr>
            </tbody>
        </table>





                    
        <table border="0" width="100%">
            <!--<thead>
                <tr colspan="2" scope="col">
                    <th>Detail</th>
                </tr>
            </thead>-->
            <tbody>
                <tr>
                    <td width="25" align="center" bgcolor='#FCF1F6'><label>วันที่</label>
                    </td>
                    <td  bgcolor='#FCF1F6'><label><a href="#" 
         onclick="changesubmitwoundcaredetailnew(document.forms['nurse_wound_care_add'].txt_wound_care_id);">
        &nbsp;ป้อนข้อมูลใหม่ <img src="images/new.gif" alt="" width="16" height="16" border="0"></a>&nbsp;&nbsp;&nbsp; เลือกวันที่</label>
                    <input type="text" name="txt_wound_care_date" id="txt_wound_care_date"
                           value="<% out.print(nursetwoundcaredetail.getWoundCareDateddMMyy("ddMMyyyy"));%>" readonly="readonly" class="dateinput" size="10" />
                            <A HREF="#" onClick="cal.select(document.forms['nurse_wound_care_add'].txt_wound_care_date,
                                'anchor1','dd/MM/yyyy'); return false;" NAME="anchor1" ID="anchor1">&nbsp;
                            <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <label>ชื่อผู้ปฏิบัติ/แผนก&nbsp;<input type="input" name="txt_user_id"
                        value="<% out.print(nursetwoundcaredetail.getUserIdCreate());%>" id="txt_user_id" size="20" ></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <label><A HREF="#" onClick="changesubmitwoundcaresave();" NAME="anchor" ID="anchor">
        บันทึกการดูแลบาดแผล&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle"
      height="16" border="0"></A></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ปิดการดูแลบาดแผล&nbsp;<img src="images/navigate_check.gif" alt="" width="16" height="16" border="0"></label>
<!--<label><a href="#"
      onclick="">
พิมพ์ใบการดูแลบาดแผล&nbsp;<img src="images/printer-a.png" alt="" width="16" height="16" border="0"></a></label>-->
                    </td>
                </tr>
                <tr>
                    <td valign="top">
                        <table>
                            <%out.print(cbo_wound_care_date);%>
                        </table>
                    </td>
                    <td>
                        <table>
                            <thead>
                            <tr>
                                    <th>คำสั่งแพทย์(Ref.3)</th>
                                    <th width="240">วิธีการทำแผล</th>
                                    <th width="240">การประเมินบาดแผลก่อนทำแผล</th>
                                    <th width="200">การประเมินบาดแผลหลังทำแผล</th>
                                    
                            </tr>
                            </thead>
                            <tr>
                                <td width="20" valign="top">
                                    <label><textarea name="txt_doctor_dx" rows="6" cols="25" >
                                    <%out.print(nursetwoundcaredetail.getDoctorDx());%></textarea><!--<input type="input" name="txt_doctor_dx"
                                    value="" id="txt_doctor_dx" size="30"  >--></label>
                                </td>
                                <td valign="top">
                                    <label>
<label><input type="radio" name="chk_wound_method_category" value="1" id="status_1"
  <% if(nursetwoundcaredetail.getWoundMethodCategory().equals("1")) { out.print("checked"); }%>/>Wet Dressing</label>
<label><input type="radio" name="chk_wound_method_category" value="2" id="status_2"
  <% if(nursetwoundcaredetail.getWoundMethodCategory().equals("2")) { out.print("checked"); }%>/>Dry Dressing</label>
<label><input type="radio" name="chk_wound_method_category" value="3" id="status_3"
  <% if(nursetwoundcaredetail.getWoundMethodCategory().equals("3")) { out.print("checked"); }%>/>Irrigatee</label>
                                    </label><br>
                        <label><textarea name="txt_wound_method_category_description" rows="4" cols="35">
                    <%out.print(nursetwoundcaredetail.getWoundMethodCategoryDescription().trim());%></textarea><!--<input type="input" name="txt_wound_method_category_description"
                        value="" id="txt_wound_method_category_description" size="50" >--></label><br>
                                    <label>การดูแลพิเศษ
<label><input type="radio" name="chk_wound_method_care_category_special" value="1" id="status_1" 
  <% if(nursetwoundcaredetail.getWoundMethodCareCategorySpecial().equals("1")) { out.print("checked"); }%>/>Debridement</label>
<label><input type="radio" name="chk_wound_method_care_category_special" value="2" id="status_2"
  <% if(nursetwoundcaredetail.getWoundMethodCareCategorySpecial().equals("2")) { out.print("checked"); }%>/>Currettage</label><br>
<label><input type="radio" name="chk_wound_method_care_category_special" value="3" id="status_3"
  <% if(nursetwoundcaredetail.getWoundMethodCareCategorySpecial().equals("3")) { out.print("checked"); }%>/>Scrub Burn</label>
<label><input type="radio" name="chk_wound_method_care_category_special" value="4" id="status_4"
  <% if(nursetwoundcaredetail.getWoundMethodCareCategorySpecial().equals("4")) { out.print("checked"); }%>/>Short drain</label>
<label><input type="radio" name="chk_wound_method_care_category_special" value="5" id="status_5"
  <% if(nursetwoundcaredetail.getWoundMethodCareCategorySpecial().equals("5")) { out.print("checked"); }%>/>OFFdrain</label><br>
<label><input type="radio" name="chk_wound_method_care_category_special" value="6" id="status_6"
  <% if(nursetwoundcaredetail.getWoundMethodCareCategorySpecial().equals("6")) { out.print("checked"); }%>/>Stitch OFF </label><br>
<label><input type="radio" name="chk_wound_method_care_category_special" value="7" id="status_7"
  <% if(nursetwoundcaredetail.getWoundMethodCareCategorySpecial().equals("7")) { out.print("checked"); }%>/>อื่น ๆ</label>
                        <input type="input" name="txt_wound_method_care_category_special_description"
                value="<%out.print(nursetwoundcaredetail.getWoundMethodCareCategorySpecialDescription()); %>" id="txt_wound_method_care_category_special_description" size="20" ></label></label><!--<br>-->
                                    
                                </td>
                                <td valign="top">
                                <label>
<label><input type="radio" name="chk_wound_estimate_before_flag" value="1" id="status_1"
              <% if(nursetwoundcaredetail.getWoundEstimateBeforeFlag().equals("1")) { out.print("checked"); }%>/>แผลดี/มีความชุ่มชื้น</label>
<label><input type="radio" name="chk_wound_estimate_before_flag" value="2" id="status_2"
              <% if(nursetwoundcaredetail.getWoundEstimateBeforeFlag().equals("2")) { out.print("checked"); }%>/>Blood Supply ดี</label><br>
<label><input type="radio" name="chk_wound_estimate_before_flag" value="3" id="status_3"
              <% if(nursetwoundcaredetail.getWoundEstimateBeforeFlag().equals("3")) { out.print("checked"); }%>/>มี Discharge เป็น</label>
                                    </label>
                        <label><input type="input" name="txt_wound_estimate_before_flag_discharge_description"
                value="<%out.print(nursetwoundcaredetail.getWoundEstimateBeforeFlagDischargeDescription());%>" id="txt_wound_estimate_before_flag_discharge_description" size="15" ></label><br>
                        <label>จำนวน&nbsp;<input type="input" name="txt_wound_estimate_before_flag_discharge_quantity"
                    value="<%out.print(nursetwoundcaredetail.getWoundEstimateBeforeFlagDischargeQuantity());%>" id="txt_wound_estimate_before_flag_discharge_quantity" size="15" ></label><br>
                        <label>ลักษณะ:(Ref.4)&nbsp;<input type="input" name="txt_wound_estimate_before_flag_discharge_feature"
                    value="<%out.print(nursetwoundcaredetail.getWoundEstimateBeforeFlagDischargeFeature());%>" id="txt_wound_estimate_before_flag_discharge_feature" size="20" ></label><br>
                                
                                <label>
<label><input type="radio" name="chk_wound_estimate_before_category" value="1" id="status_1"
      <% if(nursetwoundcaredetail.getWoundEstimateBeforeCategory().equals("1")) { out.print("checked"); }%>/>แผลอักเสบ</label>
<label><input type="radio" name="chk_wound_estimate_before_category" value="2" id="status_2"
      <% if(nursetwoundcaredetail.getWoundEstimateBeforeCategory().equals("2")) { out.print("checked"); }%>/>มีเนื้อตาย</label>
<label><input type="radio" name="chk_wound_estimate_before_category" value="3" id="status_3"
      <% if(nursetwoundcaredetail.getWoundEstimateBeforeCategory().equals("3")) { out.print("checked"); }%>/>มี  Bleeding</label>
                                    </label><br>
<label><label><input type="radio" name="chk_wound_estimate_before_category" value="4" id="status_4"
     <% if(nursetwoundcaredetail.getWoundEstimateBeforeCategory().equals("4")) { out.print("checked"); }%>/>อื่น ๆ</label>
    <input type="input" name="txt_wound_estimate_before_category_other_description"
                        value="<%out.print(nursetwoundcaredetail.getWoundEstimateBeforeCategoryOtherDescription());%>" id="txt_wound_estimate_before_category_other_description" size="20" ></label><br>
<label><label><input type="radio" name="chk_wound_estimate_before_category" value="5" id="status_5"
     <% if(nursetwoundcaredetail.getWoundEstimateBeforeCategory().equals("5")) { out.print("checked"); }%>/>ขนาดของบาดแผล (Ref.5)</label>
    <input type="input" name="txt_wound_estimate_before_category_dimension_description"
            value="<%out.print(nursetwoundcaredetail.getWoundEstimateBeforeCategoryDimensionDescription());%>" id="txt_wound_estimate_before_category_dimension_description" size="10" ></label>
                                </td>
                                <td valign="top">
                        
                        <label>
<label><input type="radio" name="chk_wound_estimate_after_flag" value="1" id="status_1"
              <% if(nursetwoundcaredetail.getWoundEstimateAfterFlag().equals("1")) { out.print("checked"); }%>/>ดีขึ้น</label>
<label><input type="radio" name="chk_wound_estimate_after_flag" value="2" id="status_2"
              <% if(nursetwoundcaredetail.getWoundEstimateAfterFlag().equals("2")) { out.print("checked"); }%>/>ขอบแผลติดดี</label><br>
<label><input type="radio" name="chk_wound_estimate_after_flag" value="3" id="status_3" 
              <% if(nursetwoundcaredetail.getWoundEstimateAfterFlag().equals("3")) { out.print("checked"); }%>
              />แผลแยก</label>
<label><input type="radio" name="chk_wound_estimate_after_flag" value="4" id="status_4" 
              <% if(nursetwoundcaredetail.getWoundEstimateAfterFlag().equals("4")) { out.print("checked"); }%>/>ไม่ดีขึ้น</label>
                                    </label><br>
            <label>การแก้ปัญหา<input type="input" name="txt_wound_estimate_after_flag_solve"
                    value="<%out.print(nursetwoundcaredetail.getWoundEstimateAfterFlagSolve());%>" id="txt_wound_estimate_after_flag_solve" size="15" ></label>
                        </td>
                        <!--<td></td>--></tr>
                        </table>
                    </td>
                </tr>
            </tbody>
       </table>
        <% }%>

<DIV ID="testdiv1" STYLE="position:absolute;visibility:hidden;background-color:white;layer-background-color:white;"></DIV>











        
        
        </form>
    </body>
    <script>
function changesubmitwoundcarerunningdocshow(wound_care_id) {
    //var noti_repair_id = document.getElementById("cbo_wound_care_running_doc").value;
    //alert(wound_care_id);
    document.forms[0].action = "nurse_wound_care_add.jsp?flag=wound_care_show&wound_care_id="+wound_care_id;
    document.forms[0].submit();
    return false;
  }
  function changesubmitwoundcaredetailshow(wound_care_id,wound_care_detail_id) {
    //var noti_repair_id = document.getElementById("cbo_wound_care_running_doc").value;
    //alert(wound_care_id);
    document.forms[0].action = "nurse_wound_care_add.jsp?flag=wound_care_show&wound_care_id="+wound_care_id+"&wound_care_detail_id="+wound_care_detail_id;
    document.forms[0].submit();
    return false;
  }
  function changesubmitwoundcaredetailnew(wound_care_id) {
    //var noti_repair_id = document.getElementById("cbo_wound_care_running_doc").value;
    //alert(wound_care_id);
    //document.forms['nurse_wound_care'].flagdetailnew.value='detailnew';
    document.forms[0].action = "nurse_wound_care_add.jsp?flag=wound_care_show&wound_care_id="
        +wound_care_id+"&wound_care_detail_id=&flagdetailnew='detailnew'";
    document.forms[0].submit();
    return false;
  }
  function changesubmitwoundcarerunningdoccreate() {
    document.forms[0].action = "nurse_wound_care_add.jsp?flag=runningdoc";
    document.forms[0].submit();
    return false;
  }
  function changesubmitwoundcarerunningdocsave() {
    document.forms[0].action = "nurse_wound_care_save.jsp?flag=runningdocsave";
    document.forms[0].submit();
    return false;
  }
  function changesubmitwoundcaresave() {
    document.forms[0].action = "nurse_wound_care_save.jsp?flag=woundcaresave";
    document.forms[0].submit();
    return false;
  }
  function changesubmithnno() {
    document.forms[0].action = "nurse_wound_care_add.jsp?flag=hnno";
    document.forms[0].submit();
    return false;
  }
  function changesubmitreport(wound_care_id) {
    document.forms[0].action = "rpt_report_view.jsp?wound_care_id="+wound_care_id;
    document.forms[0].submit();
    return false;
  }
</script>
</html>
