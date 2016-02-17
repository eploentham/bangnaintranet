<%-- 
    Document   : doctor_checkup_form
    Created on : 25 ส.ค. 2552, 19:22:42
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
String text="",patient_hn_no="",patient_full_namet="",cbo_checkup_id_show_vn="",cbo_f_patient_nation_id="";
String cbo_f_patient_prefix="", checkup_date="",cbo_branch="",cbo_f_patient_marriage_status_id="",cbo_patient_changwat="";
String cbo_blood_group="",cbo_f_patient_blood_group_id="", cbo_checkup_form="", branch_id="103001";
String check_form="",f_patient_prefix_id="", cbo_sex="", f_sex_id="",f_patient_nation_id="",f_patient_marriage_status_id="";
String f_patient_blood_group_id="", patient_changwat_id="", checkup_id="", patient_birthday="";
String flag="", doctor_namet="", doctor_id="", patient_hn="",patient_vn="",cbo_checkup_form_page="";
String checkup_form_page="", checkup_datedb="";
Config1 config1 = new Config1();
DoctorTCheckup checkup = new DoctorTCheckup();
DoctorTCheckupDB checkupdb = new DoctorTCheckupDB();
Vector v_checkup = new Vector();
try {
    if(request.getParameter("txt_checkup_id")!=null) {
        checkup_id = new String (request.getParameter("txt_checkup_id").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("flag")!=null) {
        flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("cbo_checkup_form_page")!=null) {
            checkup_form_page = new String (request.getParameter("cbo_checkup_form_page").getBytes("ISO8859_1"),"TIS-620");
            }
    if(request.getParameter("txt_checkup_date")!=null) {
            checkup_date = new String (request.getParameter("txt_checkup_date").getBytes("ISO8859_1"),"TIS-620");
            }
    if(checkup_date.equals("")){
        checkup_date = config1.getDate("ddMMyyyy");
        }
    checkup = checkupdb.getDoctorCheckUpByPK(checkup_id);
    checkup_datedb = config1.DateFormatShow2DB(checkup_date, "ddMMyyyy");
    //checkup_date = config1.DateFormatDB2Show(checkup.getCheckupDate(), "ddMMyyyy");
    patient_birthday = config1.DateFormatDB2Show(checkup.getPatientBirthday(), "ddMMyyyy");
    cbo_branch = config1.getComboBranch(branch_id);
    cbo_f_patient_prefix = config1.CboFPatientPrefix(branch_id, checkup.getFPatientPrefixId());
    cbo_checkup_form = checkupdb.CboCheckUpForm(branch_id, check_form);
    cbo_sex = config1.CboFSex(branch_id, checkup.getFSexId());
    cbo_f_patient_nation_id = config1.CboFPatientNation(branch_id, checkup.getFPatientNationId());
    cbo_f_patient_marriage_status_id = config1.CboFPatientMarriageStatus(branch_id, checkup.getFPatientMarriageStatusId());
    cbo_f_patient_blood_group_id = config1.CboFPatienBloodGroup(branch_id,checkup.getFPatientBloodGroupId());
    cbo_patient_changwat = config1.CboFAddress(branch_id,"1",checkup.getPatientChangwat());
    cbo_checkup_form_page = checkupdb.getComboFormPage(checkup_form_page);
    if(flag.equals("doctorid")) {
        if(request.getParameter("txt_doctor_id")!=null) {
            doctor_id = new String (request.getParameter("txt_doctor_id").getBytes("ISO8859_1"),"TIS-620");
        }
        Doctor doctor = new Doctor();
        doctor = config1.getDoctorFullNamet(branch_id, doctor_id);
        checkup.setDoctorId(doctor.getDoctorId());
        checkup.setDoctorFullnameT(doctor.getDoctorPrefix()+" "+ doctor.getDoctorNamet()+" "+doctor.getDoctorLastNamet());
        checkup.setDoctorFullnameE(doctor.getDoctorNamee()+" "+doctor.getDoctorLastNamee());
        }
    else if(flag.equals("hnno")) {
        if(request.getParameter("txt_hn_no")!=null) {
            patient_hn = new String (request.getParameter("txt_hn_no").getBytes("ISO8859_1"),"TIS-620");
            }
        if(request.getParameter("cbo_checkup_id_show_vn")!=null) {
            patient_vn = new String (request.getParameter("cbo_checkup_id_show_vn").getBytes("ISO8859_1"),"TIS-620");
            }
        checkup = checkupdb.getPatientResultLAB(branch_id, patient_hn, checkup_datedb);
        //patient_birthday = config1.DateFormatDB2Show(checkup.getPatientBirthday(), "ddMMyyyy");
        cbo_sex = config1.CboFSex(branch_id, checkup.getFSexId());
        cbo_patient_changwat = config1.CboFAddress(branch_id,"1",checkup.getPatientChangwat());
        cbo_f_patient_nation_id = config1.CboFPatientNation(branch_id, checkup.getFPatientNationId());
        cbo_checkup_id_show_vn = config1.CboPatientVisitShowVN(branch_id, checkup_date, "", patient_hn, patient_vn);
        cbo_f_patient_prefix = config1.CboFPatientPrefix(branch_id, checkup.getFPatientPrefixId());
        cbo_f_patient_blood_group_id = config1.CboFPatienBloodGroup(branch_id,checkup.getFPatientBloodGroupId());
        checkup_date = checkup.getCheckupDate();
        }
    }
catch(Exception ex) {
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
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
        <form name="doctor_checkup_form_add" method="post" action="doctor_checkup_form_save.jsp">
<%@include  file="doctor_checkup_form_header.jsp" %>
            <table align="center" width="100%" border="0" cellspacing="0" cellpadding="0">
      <thead>
      <th colspan="2" scope="col"><div align="center">BASIC  DATA&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label><A HREF="#" onClick="changesubmitsave();" NAME="anchor" ID="anchor">บันทึกข้อมูล&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle" height="16" border="0"></A></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>
              <select name="cbo_checkup_form" id="cbo_checkup_form">
                  <%out.print(cbo_checkup_form); %>
              </select>
          </label>
              &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>
              <select name="cbo_checkup_form_page" id="cbo_checkup_form_page">
                  <%out.print(cbo_checkup_form_page); %>
              </select>
          </label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
          <label><A HREF="#" onClick="changesubmitprint();" NAME="anchor" ID="anchor">พิมพ์ใบตรวจสุขภาพ&nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle"
        height="16" border="0"></A></label></div></th>
        </thead>
<tr class='style14r'>
    <th scope="row"  width="50" >สาขา :</th>
  <td ><div align="left">
          <label>
              <select name="cbo_branch" id="cbo_branch">
                  <%out.print(cbo_branch); %>
              </select>
          </label>&nbsp;&nbsp;&nbsp;เลขที่เอกสาร :
  <input type="text" name="txt_checkup_id" id="txt_checkup_id" size="15" value="<% out.print(checkup.getCheckupId());%>" readonly="readonly" />&nbsp;&nbsp;
          <label>&nbsp;&nbsp;วันที่ตรวจสุขภาพ :
    <input type="text" size="10" name="txt_checkup_date" id="txt_checkup_date" value="<% out.print(checkup_date);%>" readonly="readonly" class="dateinput" /><A HREF="#"
   onClick="cal.select(document.forms['doctor_checkup_form_add'].txt_checkup_date,'anchor1','dd/MM/yyyy'); return false;"
   NAME="anchor1" ID="anchor1">&nbsp;<img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></label>
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<A HREF="#" onClick="changesubmitcancel();" NAME="anchor" ID="anchor">
<img src="images/trash1.gif" alt="" width="20" height="16" border="0">ยกเลิกการใช้งาน</A>

      </div></tr>
      <tr>
        <th scope="row"  width="70" ><div align="left">HN NO :</div></th>
        <td  class="style14"><div align="left">
                <input type="text" name="txt_hn_no" id="txt_hn_no" value="<%out.print(checkup.getPatientHn());%>" size="8"onblur="changesubmithnno();">
            <A HREF="#" onClick="changesubmithnno();" NAME="anchor" ID="anchor">
            <img src="images/lightbulb.gif" alt="" width="19" height="19" border="0"></A>
          &nbsp;&nbsp;คำนำหน้าชื่อ :
            <label>
              <select name="cbo_f_patient_prefix_id" id="cbo_f_patient_prefix_id">
                  <%out.print(cbo_f_patient_prefix); %>
              </select>
          </label>
        <label>&nbsp;ชื่อ :<input type="text" name="txt_patient_firstnamet" id="txt_patient_firstnamet"
                   value="<%out.print(checkup.getPatientFirstnamet());%>" size="20" ></label>
        &nbsp;<label>&nbsp;นามสกุล :<input type="text" name="txt_patient_lastnamet" id="txt_patient_lastnamet"
                   value="<%out.print(checkup.getPatientLastnamet());%>" size="20" ></label>
        &nbsp;<label>VN :<select name="cbo_checkup_id_show_vn" id="cbo_checkup_id_show_vn">
                  <%out.print(cbo_checkup_id_show_vn); %>
              </select>
          </label>&nbsp;<A HREF="#" onClick="changesubmitvn();" NAME="anchor" ID="anchor">
            <img src="images/lightbulb.gif" alt="" width="19" height="19" border="0"></A></div>
        </td>
      </tr>
      <tr>
        <th scope="row"  width="80" ><div align="left">อายุ :</div></th>
        <td class="style14"><div align="left">
    <input type="text" name="txt_patient_age" id="txt_patient_age" value="<%out.print(checkup.getPatientAge());%>" size="2"  class='input_text'>
<label>กรุ๊ปเลือด :<select name="cbo_f_patient_blood_group_id" id="cbo_f_patient_blood_group_id">
                  <%out.print(cbo_f_patient_blood_group_id); %>
              </select></label>
    
   
               <label>จังหวัด :<select name="cbo_patient_changwat" id="cbo_patient_changwat">
                  <%out.print(cbo_patient_changwat); %>
              </select></label>
               <label>ประเทศ :<select name="cbo_f_patient_nation_id" id="cbo_f_patient_nation_id">
                  <%out.print(cbo_f_patient_nation_id); %>
              </select></label>
              <label>สถานะ :<select name="cbo_f_patient_marriage_status_id" id="cbo_f_patient_marriage_status_id">
                  <%out.print(cbo_f_patient_marriage_status_id); %>
              </select></label>
          </div>
        </td>
      </tr>
      <tr><th scope="row"  width="80" ><div align="left">Name :</div></th>
          <td class="style14"><div align="left">
              <input type="text" name="txt_patient_firstnamee" id="txt_patient_firstnamee"
                   value="<%out.print(checkup.getPatientFirstnamee());%>" size="20" >
  <label>&nbsp;Surname :<input type="text" name="txt_patient_lastnamee" id="txt_patient_lastnamee"
                   value="<%out.print(checkup.getPatientLastnamee());%>" size="20" ></label>
               <label>&nbsp;วันเกิด :<input type="text" name="txt_patient_birthday" id="txt_patient_birthday"
               value="<%out.print(checkup.getPatientBirthday());%>" size="10" class="dateinput" ></label>
               <label>&nbsp;เพศ :<select name="cbo_f_sex_id" id="cbo_f_sex_id">
                  <%out.print(cbo_sex); %>
              </select></label>
      <label>ID :<input type="text" name="txt_patient_pid" id="txt_patient_pid" value="<%out.print(checkup.getPatientPid());%>" size="12" class='input_text'></label>
      <label>Passport :<input type="text" name="txt_passport_no" id="txt_passport_no" value="<%out.print(checkup.getPassportNo());%>" size="8" class='input_text'></label>
              </div>
          </td>
      </tr>

        <input type="hidden" name="txt_type_datebase" value="bangna" >
        <input type="hidden" name="txt_form" value="daily" >
        <input type="hidden" name="txt_report_name" value="doctor_checkup_" >
        <input type="hidden" name="txt_status" value="1" >
        <input type="hidden" name="txt_checkup_active" value="<%out.print(checkup.getCheckupActive());%>" >
    </table>
<table align="center" width="100%" border="0" cellspacing="0" cellpadding="0">
      <thead>
      <th colspan="6" scope="col"><div align="center">MEDICAL HISTORY</div></th>
        </thead>
        <tr class="style14">
            <th scope="row"  width="80" >Asthma</th>
            <td class="style14">
    <label><input type="radio" name="chk_asthma" value="1" id="asthma_1" <% if(checkup.getAsthma().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_asthma" value="2" id="asthma_2" <% if(checkup.getAsthma().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="80" >Edema</th>
            <td class="style14">
    <label><input type="radio" name="chk_edema" value="1" id="edema_1" <% if(checkup.getEdema().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_edema" value="2" id="edema_2" <% if(checkup.getEdema().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="80" >Hypertension</th>
            <td class="style14">
    <label><input type="radio" name="chk_hypertension" value="1" id="hypertension_1" <% if(checkup.getHypertension().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_hypertension" value="2" id="hypertension_2" <% if(checkup.getHypertension().equals("2")) { out.print("checked"); }%> />No</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row"  width="120" >Yaws</th>
          <td class="style14">
    <label><input type="radio" name="chk_yaws" value="1" id="yaws_1" <% if(checkup.getYaws().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_yaws" value="2" id="yaws_2" <% if(checkup.getYaws().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Hemoptysis</th>
            <td class="style14">
    <label><input type="radio" name="chk_hemoptysis" value="1" id="hemoptysis_1" <% if(checkup.getHemoptysis().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_hemoptysis" value="2" id="hemoptysis_2" <% if(checkup.getHemoptysis().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Otorrhea</th>
            <td class="style14">
    <label><input type="radio" name="chk_otorrhea" value="1" id="otorrhea_1" <% if(checkup.getOtorrhea().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_otorrhea" value="2" id="otorrhea_2" <% if(checkup.getOtorrhea().equals("2")) { out.print("checked"); }%> />No</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row"  width="120" >Heart diseases</th>
            <td class="style14">
    <label><input type="radio" name="chk_heart_diseases" value="1" id="heart_diseases_1" <% if(checkup.getHeartDiseases().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_heart_diseases" value="2" id="heart_diseases_2" <% if(checkup.getHeartDiseases().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Hernia</th>
            <td class="style14">
    <label><input type="radio" name="chk_hernia" value="1" id="hernia_1" <% if(checkup.getHernia().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_hernia" value="2" id="hernia_2" <% if(checkup.getHernia().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Diabetes mellitus</th>
            <td class="style14">
    <label><input type="radio" name="chk_diabetes_mellitus" value="1" id="diabetes_mellitus_1" <% if(checkup.getDiabetesMellitus().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_diabetes_mellitus" value="2" id="diabetes_mellitus_2" <% if(checkup.getDiabetesMellitus().equals("2")) { out.print("checked"); }%> />No</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row"  width="120" >Hemorrhoid</th>
            <td class="style14">
    <label><input type="radio" name="chk_hemorrhoid" value="1" id="hemorrhoid_1" <% if(checkup.getHemorrhoid().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_hemorrhoid" value="2" id="hemorrhoid_2" <% if(checkup.getHemorrhoid().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Jaundice</th>
            <td class="style14">
    <label><input type="radio" name="chk_jaundice" value="1" id="jaundice_1" <% if(checkup.getJaundice().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_jaundice" value="2" id="jaundice_2" <% if(checkup.getJaundice().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Accident</th>
            <td class="style14">
    <label><input type="radio" name="chk_accident" value="1" id="accident_1" <% if(checkup.getAccident().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_accident" value="2" id="accident_2" <% if(checkup.getAccident().equals("2")) { out.print("checked"); }%> />No</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row"  width="120" >Epilepsy</th>
            <td class="style14">
    <label><input type="radio" name="chk_epilepsy" value="1" id="epilepsy_1" <% if(checkup.getEpilepsy().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_epilepsy" value="2" id="epilepsy_2" <% if(checkup.getEpilepsy().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Fractures</th>
            <td class="style14">
    <label><input type="radio" name="chk_fractures" value="1" id="fractures_1" <% if(checkup.getFractures().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_fractures" value="2" id="fractures_2" <% if(checkup.getFractures().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Veneral Diseases</th>
            <td class="style14">
    <label><input type="radio" name="chk_veneral_diseases" value="1" id="veneral_diseases_1" <% if(checkup.getVeneralDiseases().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_veneral_diseases" value="2" id="veneral_diseases_2" <% if(checkup.getVeneralDiseases().equals("2")) { out.print("checked"); }%> />No</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row"  width="120" >Surgical Operation</th>
            <td class="style14">
    <label><input type="radio" name="chk_surgical_operation" value="1" id="surgical_operation_1" <% if(checkup.getSurgicalOperation().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_surgical_operation" value="2" id="surgical_operation_2" <% if(checkup.getSurgicalOperation().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Acquired immune deficiency syndrome</th>
            <td class="style14">
    <label><input type="radio" name="chk_acquired_immune_deficiency_syndrome" value="1" id="acquired_immune_deficiency_syndrome_1" <% if(checkup.getAcquiredImmune().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_acquired_immune_deficiency_syndrome" value="2" id="acquired_immune_deficiency_syndrome_2" <% if(checkup.getAcquiredImmune().equals("2")) { out.print("checked"); }%> />No</label>            </td>
            <th scope="row"  width="120" >Malaria</th>
            <td class="style14">
    <label><input type="radio" name="chk_malaria" value="1" id="malaria_1" <% if(checkup.getMalaria().equals("1")) { out.print("checked"); }%> />Yes</label>
    <label><input type="radio" name="chk_malaria" value="2" id="malaria_2" <% if(checkup.getMalaria().equals("2")) { out.print("checked"); }%> />No</label>            </td>
        </tr>
        <tr>
            <td colspan="6" class="style14">
                <label>Female  L.M.P. :&nbsp;<input type="text" name="txt_female_lmp" id=txt_female_lmp" value="<%out.print(checkup.getFemaleLMP());%>" size="30" ></label>
&nbsp;&nbsp;<label>Please explain all items answered "Yes" :&nbsp;<input type="text" name="txt_medical_explain" id=txt_medical_explain" value="<%out.print(checkup.getMedicalExplain());%>" size="55" ></label>            </td>
        </tr>
</table>
<table align="center" width="100%" border="0" cellspacing="0" cellpadding="0">
      <thead>
      <th colspan="2" scope="col"><div align="center">PHYSICAL EXAMINATION</div></th>
        </thead>
        <tr><th>Height :</th>
            <td class="style14">
    <label><input type="text" name="txt_height" id=txt_height" value="<%out.print(checkup.getHeight());%>" size="3" >cms.</label>
    &nbsp;&nbsp;<label>Width :<input type="text" name="txt_width" id=txt_width" value="<%out.print(checkup.getWidth());%>" size="3" >Kg.</label>
    &nbsp;&nbsp;<label>Blood Pressure :<input type="text" name="txt_blood_pressure" id=txt_blood_pressure" value="<%out.print(checkup.getBloodPressure());%>" size="3" >mm.Hg.</label>
    &nbsp;&nbsp;<label>Pulse :<input type="text" name="txt_pulse" id=txt_pulse" value="<%out.print(checkup.getPulse());%>" size="3" >/min</label>
            </td></tr>
        <tr><th>Vision :</th>
            <td class="style14">
    <label>Right :<input type="text" name="txt_eye_right" id=txt_eye_right" value="<%out.print(checkup.getEyeRight());%>" size="3" ></label>
    &nbsp;&nbsp;<label>Left :<input type="text" name="txt_eye_left" id=txt_eye_left" value="<%out.print(checkup.getEyeLeft());%>" size="3" ></label>
   <label><input type="radio" name="chk_glasses" value="1" id="glasses_1" <% if(checkup.getGlasses().equals("1")) { out.print("checked"); }%> />With glasses</label>
    <label><input type="radio" name="chk_glasses" value="2" id="glasses_2" <% if(checkup.getGlasses().equals("2")) { out.print("checked"); }%> />Without glasses</label>
&nbsp;&nbsp;&nbsp;&nbsp;<label>Color blindness :<input type="radio" name="chk_color_blindness" value="1" id="color_blindness_1" <% if(checkup.getColorBlindness().equals("1")) { out.print("checked"); }%> />YES</label>
<label><input type="radio" name="chk_color_blindness" value="2" id="color_blindness_2" <% if(checkup.getColorBlindness().equals("2")) { out.print("checked"); }%> />NO</label>
            &nbsp;&nbsp;&nbsp;&nbsp;</td></tr>
</table>
<table align="center" width="100%" border="0" cellspacing="0" cellpadding="0">
      <thead>
      <th colspan="6" scope="col"><div align="center">CHECK EACH ITEM APPROPRIATE COLUMN</div></th>
        </thead>
        <tr class="style14">
            <th scope="row" width="150">General appearance :</th>
            <td class="style14"width="220">
    <label><input type="radio" name="chk_general_appearance" value="1" id="general_appearance_1" <% if(checkup.getGeneralAppearance().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_general_appearance" value="2" id="general_appearance_2" <% if(checkup.getGeneralAppearance().equals("2")) { out.print("checked"); }%> />AbNormal</label></td>
            <th scope="row" width="150">Skin,Scalp</th>
            <td class="style14" width="280">
    <label><input type="radio" name="chk_skin_scalp" value="1" id="skin_scalp_1" <% if(checkup.getSkinScalp().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_skin_scalp" value="2" id="skin_scalp_2" <% if(checkup.getSkinScalp().equals("2")) { out.print("checked"); }%> />AbNormal</label></td>
            <th scope="row" width="150">Lymph nodes</th>
            <td class="style14" width="100">
    <label><input type="radio" name="chk_lymph_nodes" value="1" id="lymph_nodes_1" <% if(checkup.getLymphNodes().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_lymph_nodes" value="2" id="lymph_nodes_2" <% if(checkup.getLymphNodes().equals("2")) { out.print("checked"); }%> />AbNormal</label></td>
        </tr>
        <tr class="style14">
            <th scope="row" >Abdomen</th>
            <td class="style14" >
    <label><input type="radio" name="chk_abdomen" value="1" id="abdomen_1" <% if(checkup.getAbdomen().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_abdomen" value="2" id="abdomen_2" <% if(checkup.getAbdomen().equals("2")) { out.print("checked"); }%> />AbNormal</label></td>
            <th scope="row"  >Liver</th>
            <td class="style14" >
    <label><input type="radio" name="chk_liver" value="1" id="chk_liver_1" <% if(checkup.getLiver().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_liver" value="2" id="chk_liver_2" <% if(checkup.getLiver().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Spleens</th>
            <td class="style14" >
    <label><input type="radio" name="chk_spleens" value="1" id="spleens_1" <% if(checkup.getSpleen().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_spleens" value="2" id="spleens_2" <% if(checkup.getSpleen().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row" >Eyes:</th>
            <td class="style14" >
    <label><input type="radio" name="chk_eyes" value="1" id="eyes_1" <% if(checkup.getEyes().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_eyes" value="2" id="eyes_2" <% if(checkup.getEyes().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Ears:</th>
            <td class="style14" >
    <label><input type="radio" name="chk_ears" value="1" id="ears_1" <% if(checkup.getEars().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_ears" value="2" id="ears_2" <% if(checkup.getEars().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Otoscopic Exam.</th>
            <td class="style14" >
    <label><input type="radio" name="chk_otoscopic_exam" value="1" id="otoscopic_exam_1" <% if(checkup.getOtoscopicExam().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_otoscopic_exam" value="2" id="otoscopic_exam_2" <% if(checkup.getOtoscopicExam().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row" >Extenal genitalia</th>
            <td class="style14" >
    <label><input type="radio" name="chk_extenal_genitalia" value="1" id="extenal_genitalia_1" <% if(checkup.getExtenalGenitalia().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_extenal_genitalia" value="2" id="extenal_genitalia_2" <% if(checkup.getExtenalGenitalia().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Rectal exam</th>
            <td class="style14" >
    <label><input type="radio" name="chk_rectal_exam" value="1" id="rectal_exam_1" <% if(checkup.getRectalExam().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_rectal_exam" value="2" id="rectal_exam_2" <% if(checkup.getRectalExam().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row" >Nose</th>
            <td class="style14" >
    <label><input type="radio" name="chk_nose" value="1" id="nose_1" <% if(checkup.getNose().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_nose" value="2" id="nose_2" <% if(checkup.getNose().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Pharynx Tonsils</th>
            <td class="style14" >
    <label><input type="radio" name="chk_pharynx_tonsils" value="1" id="pharynx_tonsils_1" <% if(checkup.getPharynxTonsils().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_pharynx_tonsils" value="2" id="pharynx_tonsils_2" <% if(checkup.getPharynxTonsils().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Thyroid gland</th>
            <td class="style14" >
    <label><input type="radio" name="chk_thyroid_gland" value="1" id="thyroid_gland_1" <% if(checkup.getThyroidGland().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_thyroid_gland" value="2" id="thyroid_gland_2" <% if(checkup.getThyroidGland().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row" >Vertebrae</th>
            <td class="style14" >
    <label><input type="radio" name="chk_vertebrae" value="1" id="vertebrae_1" <% if(checkup.getVertebrae().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_vertebrae" value="2" id="vertebrae_2" <% if(checkup.getVertebrae().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Locomotor</th>
            <td class="style14">
    <label><input type="radio" name="chk_locomotor" value="1" id="locomotor_1" <% if(checkup.getLocomotor().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_locomotor" value="2" id="locomotor_2" <% if(checkup.getLocomotor().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Reflexes</th>
            <td class="style14" >
    <label><input type="radio" name="chk_reflexes" value="1" id="reflexes_1" <% if(checkup.getReflexes().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_reflexes" value="2" id="reflexes_2" <% if(checkup.getReflexes().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row" >Lungs</th>
            <td class="style14" >
    <label><input type="radio" name="chk_lungs" value="1" id="lungs_1" <% if(checkup.getLungs().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_lungs" value="2" id="lungs_2" <% if(checkup.getLungs().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row"  >Heart</th>
            <td class="style14" >
    <label><input type="radio" name="chk_heart" value="1" id="heart_1" <% if(checkup.getHeart().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_heart" value="2" id="heart_2" <% if(checkup.getHeart().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >Mental health status</th>
            <td class="style14" >
    <label><input type="radio" name="chk_mental_health_status" value="1" id="mental_health_status_1" <% if(checkup.getMentalHealthStatus().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_mental_health_status" value="2" id="mental_health_status_2" <% if(checkup.getMentalHealthStatus().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
        </tr>

        <tr class="style14">
            <th scope="row" >Other</th>
            <td class="style14" colspan="3">
    <label><input type="text" name="txt_other_description" id=txt_other_description" value="<%out.print(checkup.getOtherDescription());%>" size="30" ></label>
    <label><input type="radio" name="chk_other" value="1" id="other_1" <% if(checkup.getOther().equals("1")) { out.print("checked"); }%> />Normal</label>
    <label><input type="radio" name="chk_other" value="2" id="other_2" <% if(checkup.getOther().equals("2")) { out.print("checked"); }%> />AbNormal</label>            </td>
            <th scope="row" >ADDITIONAL COMMENTS</th>
            <td class="style14" >
    <label><input type="text" name="txt_additional_comments" id=txt_additional_comments" value="<%out.print(checkup.getAdditionComments());%>" size="30" ></label>            </td>
        </tr>
        <tr class="style14">
            <th scope="row" colspan="6" ></th>
        </tr>
</table>
<table align="center" width="100%" border="0" cellspacing="0" cellpadding="0">
        <tr class="style14">
            <th scope="row"  width="100">Hemoglobin :</th>
            <td width="800" colspan="5" class="style14">
<label><input type="text" name="txt_hemoglobin" id=txt_hemoglobin" value="<%out.print(checkup.getHemoglobin());%>" size="5" >g/dl</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>White blood cell :<input type="text" name="txt_white_blood_cell" id=txt_white_blood_cell" value="<%out.print(checkup.getWhiteBloodCell());%>" size="5" >cells/cu.mm.</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>Hematocrit :<input type="text" name="txt_hematocrit" id=txt_hematocrit" value="<%out.print(checkup.getHematocrit());%>" size="5" >%</label></td>
        </tr>
        <tr class="style14">
            <th scope="row" width="100">Differential  :</th>
            <td  colspan="5"width="800" class="style14">
<label>PMN :<input type="text" name="txt_differential_pmn" id=txt_differential_pmn" value="<%out.print(checkup.getDifferentiaPmn());%>" size="4" >%</label>&nbsp;&nbsp;&nbsp;
<label>Lymp :<input type="text" name="txt_differential_lymp" id=txt_differential_lymp" value="<%out.print(checkup.getDifferentialLymp());%>" size="4" >%</label>&nbsp;&nbsp;&nbsp;
<label>Mono :<input type="text" name="txt_differential_mono" id=txt_differential_mono" value="<%out.print(checkup.getDifferentialMono());%>" size="4" >%</label>&nbsp;&nbsp;&nbsp;
<label>Eos :<input type="text" name="txt_differential_eos" id=txt_differential_eos" value="<%out.print(checkup.getDifferentialEos());%>" size="4" >%</label>
<br><label>Baso :<input type="text" name="txt_differential_baso" id=txt_differential_baso" value="<%out.print(checkup.getDifferentiaBaso());%>" size="4" >%</label>&nbsp;&nbsp;&nbsp;
<label>Band :<input type="text" name="txt_differential_band" id=txt_differential_band" value="<%out.print(checkup.getDifferentialBand());%>" size="4" >%</label>&nbsp;&nbsp;&nbsp;
<label>Blast :<input type="text" name="txt_differential_blast" id=txt_differential_blast" value="<%out.print(checkup.getDifferentialBlast());%>" size="4" >%</label></td>
        </tr>
        <tr class="style14">
            <th rowspan="3" scope="row" width="200">Serological test <br>for anti HIV</th>
          <td class="style14" >
    <label><input type="radio" name="chk_hiv" value="1" id="hiv_1" <% if(checkup.getHiv().equals("1")) { out.print("checked"); }%> />Indirect solid-phase enzyme immunoassay</label>
    </td>
  <td  colspan="4" class="style14">
  <label><input type="radio" name="chk_hiv_gpa" value="1" id="hiv_gpa_1" <% if(checkup.getHivGpa().equals("1")) { out.print("checked"); }%> />Positive</label>
<label><input type="radio" name="chk_hiv_gpa" value="2" id="hiv_gpa_2" <% if(checkup.getHivGpa().equals("2")) { out.print("checked"); }%> />Negative</label>
            </td>

        </tr>
        <tr><td class="style14"><span class="style14">
          <label>
          <input type="radio" name="chk_hiv" value="2" id="hiv_2" <% if(checkup.getHiv().equals("2")) { out.print("checked"); }%> />Immuno-chromatography (ICA)</label>
        </span></td>
        <td colspan="4" class="style14"><span class="style14">
  <label><input type="radio" name="chk_hiv_elisa" value="1" id="hiv_elisa_1" <% if(checkup.getHivElisa().equals("1")) { out.print("checked"); }%> />Positive</label></span>
<label><input type="radio" name="chk_hiv_elisa" value="2" id="hiv_elisa_2" <% if(checkup.getHivElisa().equals("2")) { out.print("checked"); }%> />Negative</label>
        </td>
        </tr>
        <tr><td class="style14">
    <label><input type="radio" name="chk_hiv" value="3" id="hiv_3" <% if(checkup.getHiv().equals("3")) { out.print("checked"); }%> />Enzyme Imunoassay(EIA)</label></td>
<td colspan="4"class="style14">
    <label><input type="radio" name="chk_hiv_western_blot" value="1" id="hiv_western_blot_1" <% if(checkup.getHivWesternBlot().equals("1")) { out.print("checked"); }%> />Positive</label>
<label><input type="radio" name="chk_hiv_western_blot" value="2" id="hiv_western_blot_2" <% if(checkup.getHivWesternBlot().equals("2")) { out.print("checked"); }%> />Negative</label>
</td>
        </tr>
        <tr class="style14">
            <th rowspan="4" scope="row" >Hepatitis B Surface Antigen Test :</th>
            <td colspan="2" class="style14">
    <label><input type="radio" name="chk_hepatitis" value="1" id="hepatitis_1" <% if(checkup.getHepatitis().equals("1")) { out.print("checked"); }%> />Positive</label>
    <label><input type="radio" name="chk_hepatitis" value="2" id="hepatitis_2" <% if(checkup.getHepatitis().equals("2")) { out.print("checked"); }%> />Negative</label></td>
        </tr>
        <tr class="style14">
            <!--<th>&nbsp;</th>-->
            <td class="style14">
    <label><input type="radio" name="chk_hepatitis_type" value="1" id="hepatitis_type_1" <% if(checkup.getHepatitisType().equals("1")) { out.print("checked"); }%> />VDRL  Test</label></td>
            <td class="style14">
    <label><input type="radio" name="chk_hepatitis_vdrl" value="1" id="hepatitis_vdrl_1" <% if(checkup.getHepatitisVdrl().equals("1")) { out.print("checked"); }%> />Positive</label>
    <label><input type="radio" name="chk_hepatitis_vdrl" value="2" id="hepatitis_vdrl_2" <% if(checkup.getHepatitisVdrl().equals("2")) { out.print("checked"); }%> />Negative</label></td>
        </tr>
        <tr class="style14">
            <!--<th>&nbsp;</th>-->
            <td class="style14">
    <label><input type="radio" name="chk_hepatitis_type" value="2" id="hepatitis_type_2" <% if(checkup.getHepatitisType().equals("2")) { out.print("checked"); }%> />RPR  Test</label></td>
            <td class="style14">
    <label><input type="radio" name="chk_hepatitis_rpr" value="1" id="hepatitis_rpr_1" <% if(checkup.getHepatitisRpr().equals("1")) { out.print("checked"); }%> />Positive</label>
    <label><input type="radio" name="chk_hepatitis_rpr" value="2" id="hepatitis_rpr_2" <% if(checkup.getHepatitisRpr().equals("2")) { out.print("checked"); }%> />Negative</label></td>
        </tr>
        <tr class="style14">
            <!--<th>&nbsp;</th>-->
            <td class="style14">
    <label><input type="radio" name="chk_hepatitis_type" value="3" id="hepatitis_type_3" <% if(checkup.getHepatitisType().equals("3")) { out.print("checked"); }%> />TPHA  Test</label></td>
            <td class="style14">
    <label><input type="radio" name="chk_hepatitis_tpha" value="1" id="hepatitis_tpha_1" <% if(checkup.getHepatitisTpha().equals("1")) { out.print("checked"); }%> />Positive</label>
    <label><input type="radio" name="chk_hepatitis_tpha" value="2" id="hepatitis_tpha_2" <% if(checkup.getHepatitisTpha().equals("2")) { out.print("checked"); }%> />Negative</label></td>
        </tr>
        <tr>
            <th>Blood film for malaria</th>
            <td  class="style14">
    <label><input type="radio" name="chk_blood_film" value="1" id="blood_film_1" <% if(checkup.getBloodFilm().equals("1")) { out.print("checked"); }%> />Positive</label>
<input type="text" name="txt_blood_film_comment" id=txt_blood_film_comment" value="<%out.print(checkup.getBloodFilmComment());%>" size="30" ></td>
            <td class="style14">
    <label><input type="radio" name="chk_blood_film" value="2" id="blood_film_2" <% if(checkup.getBloodFilm().equals("2")) { out.print("checked"); }%> />Negative</label></td>
        </tr>
</table>
        <table width="100%">
    <tr>
        <th width="160">Urine analysis</th>
        <td class="style14">
            <label>Color&nbsp;<input type="text" name="txt_uri_color" id=txt_uri_color" value="<%out.print(checkup.getUriColor());%>" size="10" ></label>
            <label>Sp. gr.&nbsp;<input type="text" name="txt_uri_sp" id=txt_uri_sp" value="<%out.print(checkup.getUriSp());%>" size="10" ></label>
            <label>pH&nbsp;<input type="text" name="txt_uri_ph" id=txt_uri_ph" value="<%out.print(checkup.getUriPh());%>" size="10" ></label>
            <label>Sugar&nbsp;<input type="text" name="txt_uri_sugar" id=txt_uri_sugar" value="<%out.print(checkup.getUriSugar());%>" size="10" ></label>
            
        </td>
    </tr>
    <tr>
        <th width="160"></th>
        <td  class="style14">
            <label>Albumin<input type="text" name="txt_albumin" id=txt_albumin" value="<%out.print(checkup.getAlbumin());%>" size="10" ></label>
            <label>Blood<input type="text" name="txt_blood" id=txt_blood" value="<%out.print(checkup.getBlood());%>" size="10" ></label>
            <label>Ketone<input type="text" name="txt_ketone" id=txt_ketone" value="<%out.print(checkup.getKetone());%>" size="10" ></label>
            <label>Bile<input type="text" name="txt_bile" id=txt_bile" value="<%out.print(checkup.getBile());%>" size="10" ></label>
            <br><label>Micro : WBC<input type="text" name="txt_micro_wbc" id=txtmicro_wbc" value="<%out.print(checkup.getMicroWbc());%>" size="10" ></label>
            <label>RBC<input type="text" name="txt_rbc" id=txt_rbc" value="<%out.print(checkup.getRbc());%>" size="10" >/HPF.</label>
            <label>Casts<input type="text" name="txt_casts" id=txt_casts" value="<%out.print(checkup.getCasts());%>" size="10" >/HPF.</label>
        </td>
    </tr>
    <tr>
        <th width="160">Epithelial cell</th>
        <td class="style14">
            <label><input type="text" name="txt_epithelal_cell" id=txt_epithelal_cell" value="<%out.print(checkup.getEpithelalCell());%>" size="10" >/HPF.</label>
            <label>Others<input type="text" name="txt_epithelal_other" id=txt_epithelal_other" value="<%out.print(checkup.getEpithelalOther());%>" size="30" ></label>
        </td>
    </tr></table>
        <table width="100%">
    <tr>
        <th width="300">Urine Pregnancy test  (For female only)</th>
        <td class="style14"><label><input type="radio" name="chk_urine" value="1" id="urine_1" <% if(checkup.getUrine().equals("1")) { out.print("checked"); }%> />Positive</label>
    <label><input type="radio" name="chk_urine" value="2" id="urine_2" <% if(checkup.getUrine().equals("2")) { out.print("checked"); }%> />Negative</label></td>
    </tr>
    <tr>
        <th>Stool Examination for parasites</th>
        <td class="style14"><label><input type="radio" name="chk_stool" value="1" id="stool_1" <% if(checkup.getStool().equals("1")) { out.print("checked"); }%> />Found for parasite</label>
    <label><input type="radio" name="chk_stool" value="2" id="stool_2" <% if(checkup.getStool().equals("2")) { out.print("checked"); }%> />Not found</label></td>
    </tr>
    <tr>
        <th>Chest X-ray for tuberculosis</th>
        <td class="style14"><label><input type="radio" name="chk_chest_x_ray" value="1" id="chest_x_ray_1" <% if(checkup.getChestXRay().equals("1")) { out.print("checked"); }%> />Positive</label>
    <label><input type="radio" name="chk_chest_x_ray" value="2" id="chest_x_ray_2" <% if(checkup.getChestXRay().equals("2")) { out.print("checked"); }%> />Negative</label></td>
    </tr>
    <tr>
        <th>Anti-HCV :</th>
        <td class="style14"><label><input type="radio" name="chk_anti_hcv" value="1" id="anti_hcvy_1" <% if(checkup.getAntiHcv().equals("1")) { out.print("checked"); }%> />Positive</label>
    <label><input type="radio" name="chk_anti_hcv" value="2" id="anti_hcv_2" <% if(checkup.getAntiHcv().equals("2")) { out.print("checked"); }%> />Negative</label></td>
    </tr>
    <tr>
        <th width="300">CONCLUSION</th>
        <td class="style14"><label><input type="text" name="txt_conclusion" id=txt_conclusion" value="<%out.print(checkup.getConclusion());%>" size="50" ></label></td>
    </tr>
    <tr>
        <th width="300">Doctor ID</th>
        <td><label><input type="text" name="txt_doctor_id" id=txt_doctor_id" value="<%out.print(checkup.getDoctorId());%>" size="5" onblur="changesubmitdoctorid();" ></label>
    <label><input type="text" name="txt_doctor_fullnamee" id=txt_doctor_fullnamee" value="<%out.print(checkup.getDoctorFullnameE());%>" size="30" ></label></td>
    </tr>
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
      function changesubmitsave() {
          //var row = document.getElementById("txt_row").value;
          //var usernametfoodsreceive = document.getElementById("cbo_user_foods_receive").value;
          //var usernametnutritionist = document.getElementById("cbo_user_foods_nutritionist").value;
          //var usernametfoodsorder="",usernametfoodsreceive="",usernametnutritionist="";
        document.forms[0].action = "doctor_checkup_form_save.jsp";
        document.forms[0].submit();
        return false;
      }
      function changesubmitcancel() {
        document.forms.doctor_checkup_form_add.txt_checkup_active.value = '3';
        document.forms[0].action = "doctor_checkup_form_save.jsp";
        document.forms[0].submit();
        return false;
      }
      function changesubmitdoctorid() {
        //document.forms.doctor_checkup_form_add.txt_checkup_active.value = '3';
        document.forms[0].action = "doctor_checkup_form_add.jsp?flag=doctorid";
        document.forms[0].submit();
        return false;
      }
      function changesubmithnno() {
        //document.forms.doctor_checkup_form_add.txt_checkup_active.value = '3';
        document.forms[0].action = "doctor_checkup_form_add.jsp?flag=hnno";
        document.forms[0].submit();
        return false;
      }
      function changesubmitprint() {
      var checkup_id = document.getElementById("txt_checkup_id").value;
      var checkup_form = document.getElementById("cbo_checkup_form").value;
      var checkup_form_page = document.getElementById("cbo_checkup_form_page").value;
      document.forms[0].action = "rpt_report_view.jsp?txt_report_name=doctor_checkup_form&checkup_id="
          +checkup_id+"&txt_form=daily&flagpage=viewdetail&form=001&checkup_form="+checkup_form
          +"&checkup_form_page="+checkup_form_page;
      document.forms[0].submit();
        return false;
      }
  </script>
</html>
