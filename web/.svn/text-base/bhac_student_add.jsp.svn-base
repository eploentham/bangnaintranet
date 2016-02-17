<%-- 
    Document   : bhac_student_add
    Created on : Sep 27, 2009, 11:17:48 AM
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
String text="", cbo_religion="",cbo_student_current_tambon="",cbo_student_current_amphur="",cbo_student_current_changwat="";
String religion_id="",flagpage="",student_id="",student_date="",flag_redirect="",student_current_changwat_id="";
Config1 config1 = new Config1();
BhacTStudent student = new BhacTStudent();
BhacTStudentDB studentdb = new BhacTStudentDB();

if(request.getParameter("cbo_religion")!=null){
        religion_id = new String (request.getParameter("cbo_religion").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("cbo_student_current_changwat")!=null){
        student_current_changwat_id = new String (request.getParameter("cbo_student_current_changwat").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("flagpage")!=null) {
    flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("txt_student_id")!=null) {
    student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("txt_student_date")!=null) {
    student_date = new String (request.getParameter("txt_student_date").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("flag_redirect")!=null) {
    flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
    }
cbo_religion = config1.CboReligionNamet(religion_id);
cbo_student_current_changwat = config1.CboChangwat(student_current_changwat_id);
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">
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
                $("#cbo_student_current_changwat").blur(showAmphur);
                $("#txt_student_birthday").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#cbo_student_current_amphur").load("showamphur.jsp", {itemId: $(this).val()});
            });
            function showAmphur(){
                //$("#cbo_student_current_amphur").re
                $("#cbo_student_current_amphur").load("showamphur.jsp", {itemId: $(this).val()});
            }

        </script>
        <style type="text/css">
            .blue { color: blue; }
        </style>
    </head>
    <body>
        <form name="bhac_student_add" id="bhac_student_add" action="bhac_student_save.jsp" method="POST">
            <%@include  file="bhac_student_header.jsp" %>
            <table border="0" width="100%">
                <thead>
                    <tr align="center">
                        <th colspan="2">ป้อนรายการ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitsave();" NAME="anchor" ID="anchor">บันทึกข้อมูล&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle"
      height="16" border="0"></A></label></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th>รหัสนักเรียน:</th>
    <td><label><input type="text" name="txt_student_code" id="txt_student_code" value="<%out.print(student.getStudentCode());%>" ></label>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ชื่อ<input type="text" name="txt_student_first_namet" id="txt_student_first_namet" value="<%out.print(student.getStudentFirstNamet());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>นามสกุล<input type="text" name="txt_student_last_namet" id="txt_student_last_namet" value="<%out.print(student.getStudentLastNamet());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>วันเกิด<input type="text" name="txt_student_birthday" id="txt_student_birthday" value="<%out.print(student.getStudentBirthday());%>"  readonly="readonly" class="dateinput" size="9"/></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>อายุ<input type="text" name="txt_student_age" id="txt_student_age" value="<%out.print(student.getStudentAge());%>" size="4"/></label>
<input type="hidden" name="txt_student_id" id="txt_student_id" value="<%out.print(student.getStudentId());%>" >
</tr>
                    <tr>
                        <th>น้ำหนัก:</th>
                        <td><label><input type="text" name="txt_student_width" id="txt_student_width" value="<%out.print(student.getStudentWidth());%>" ></label>
                            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ส่วนสูง<input type="text" name="txt_student_height" id="txt_student_height" value="<%out.print(student.getStudentHeight());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>เพศ<input type="radio" name="chk_student_sex"id="sex_1" value="1"  <% if(student.getStudentSex().equals("1")) { out.print("checked"); }%>/> ชาย</label><label><input type="radio" name="chk_student_sex"id="sex_2" value="2"  <% if(student.getStudentSex().equals("2")) { out.print("checked"); }%>/>หญิง</label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>สัญชาติ<input type="text" name="txt_student_nationality" id="txt_student_nationality" value="<%out.print(student.getStudentNationality());%>" ></label>
                        </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td><label>ศาสนา<select name="cbo_student_religion" id="cbo_student_religion">
                                <%out.print(cbo_religion); %>
                                </select></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ID<input type="text" name="txt_student_pid" id="txt_student_pid" value="<%out.print(student.getStudentPid());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ออก ณ.<input type="text" name="txt_student_pid_issued" id="txt_student_pid_issued" value="<%out.print(student.getStudentPidIssued());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>วันหมดอายุ<input type="text" name="txt_student_pid_expire" id="txt_student_pid_expire" value="<%out.print(student.getStudentPidExpire());%>" ></label></td>
                    </tr>
                    <tr>
                        <th>ที่อยู่</th>
                        <td>
                <label><input type="text" name="txt_student_current_house" id="txt_student_current_house" value="<%out.print(student.getStudentCurrentHouse());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>หมู่<input type="text" name="txt_student_current_moo" id="txt_student_current_moo" value="<%out.print(student.getStudentCurrentMoo());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>apartment<input type="text" name="txt_student_current_apartment" id="txt_student_current_apartment" value="<%out.print(student.getStudentCurrentApartment());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ห้อง<input type="text" name="txt_student_current_apartment_room" id="txt_student_current_apartment_room" value="<%out.print(student.getStudentCurrentApartmentRoom());%>" ></label>
                        </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td>
                            <label>ซอย<input type="text" name="txt_student_current_soi" id="txt_student_current_soi" value="<%out.print(student.getStudentCurrentSoi());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ถนน<input type="text" name="txt_student_current_road" id="txt_student_current_road" value="<%out.print(student.getStudentCurrentRoad());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>จังหวัด<select name="cbo_student_current_changwat" id="cbo_student_current_changwat" >
                                <%out.print(cbo_student_current_changwat); %>
                                </select></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>อำเภอ<div id="cbo_student_current_amphur"></div></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>ตำบล<select name="cbo_student_current_tambon" id="cbo_student_current_tambon">
                                <%out.print(cbo_student_current_tambon); %>
                                </select></label>
                        </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>รหัสไปรษณย์<input type="text" name="txt_student_current_postcode" id="txt_student_current_postcode" value="<%out.print(student.getStudentCurrentSoi());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>โทรศัพท์<input type="text" name="txt_student_telephone" id="txt_student_telephone" value="<%out.print(student.getStudentTelephone());%>" ></label>
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<label>E-mail<input type="text" name="txt_student_email" id="txt_student_email" value="<%out.print(student.getStudentEmail());%>" ></label>
                        </td>
                    </tr>
                    <tr>
                        <th></th>
                        <td><table border="0">
                                <thead>
                                    <tr>
                                        <th>ระดับ</th>
                                        <th>สถานศึกษา</th>
                                        <th>คณะ/สาขา</th>
                                        <th>ปีการศึกษา</th>
                                        <th>คะแนน</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    <tr>
                                        <th>มัธยมต้น</th>
<td><input type="text" name="txt_student_secondary_school_namet" id="txt_student_secondary_school_namet" value="<%out.print(student.getStudentSecondarySchoolNamet());%>" ></td>
<td><input type="text" name="txt_student_secondary_school_faculty" id="txt_student_secondary_school_faculty" value="<%out.print(student.getStudentSecondarySchoolFaculty());%>" ></td>
<td><input type="text" name="txt_sstudent_secondary_school_year" id="txt_sstudent_secondary_school_year" value="<%out.print(student.getStudentSecondarySchoolYear());%>" ></td>
<td><input type="text" name="txt_student_secondary_school_point" id="txt_student_secondary_school_point" value="<%out.print(student.getStudentSecondarySchoolPoint());%>" ></td>
                                    </tr>
                                    <tr>
                                        <th>มัธยมปลาย</th>
<td><input type="text" name="txt_student_high_school_namet" id="txt_student_high_school_namet" value="<%out.print(student.getStudentHighSchoolNamet());%>" ></td>
<td><input type="text" name="txt_student_high_school_faculty" id="txt_student_high_school_faculty" value="<%out.print(student.getStudentHighSchoolFaculty());%>" ></td>
<td><input type="text" name="txt_student_high_school_year" id="txt_student_high_school_year" value="<%out.print(student.getStudentHighSchoolYear());%>" ></td>
<td><input type="text" name="txt_student_high_school_point" id="txt_student_high_school_point" value="<%out.print(student.getStudentHighSchoolPoint());%>" ></td>
                                    </tr>
                                    <tr>
                                        <th>ปริญญาตรี</th>
<td><input type="text" name="txt_student_bachelor_school_namet" id="txt_student_bachelor_school_namet" value="<%out.print(student.getStudentBachelorSchoolNamet());%>" ></td>
<td><input type="text" name="txt_student_bachelor_school_faculty" id="txt_student_bachelor_school_faculty" value="<%out.print(student.getStudentBachelorSchoolFaculty());%>" ></td>
<td><input type="text" name="txt_student_bachelor_school_year" id="txt_student_bachelor_school_year" value="<%out.print(student.getStudentBachelorSchoolYear());%>" ></td>
<td><input type="text" name="txt_student_bachelor_school_point" id="txt_student_bachelor_school_point" value="<%out.print(student.getStudentBachelorSchoolPoint());%>" ></td>
                                    </tr>
                                    <tr>
                                        <th>อื่นๆ</th>
<td><input type="text" name="txt_student_other1_school" id="txt_student_other1_school" value="<%out.print(student.getStudentOther1School());%>" >
<input type="text" name="txt_student_other1_school_namet" id="txt_student_other1_school_namet" value="<%out.print(student.getStudentOther1SchoolNamet());%>" ></td>
<td><input type="text" name="txt_student_other1_school_faculty" id="txt_student_other1_school_faculty" value="<%out.print(student.getStudentOther1SchoolFaculty());%>" ></td>
<td><input type="text" name="txt_student_other1_school_year" id="txt_student_other1_school_year" value="<%out.print(student.getStudentOther1SchoolYear());%>" ></td>
<td><input type="text" name="txt_student_other1_school_point" id="txt_student_other1_school_point" value="<%out.print(student.getStudentOther1SchoolPoint());%>" ></td>
                                    </tr>
                                </tbody>
                            </table>
                        </td>
                    </tr>
                    <tr>
                                        <th>เอกสารสำคัญ</th>
                                        <td colspan="4">
        <label><input type="checkbox" name="chk_student_document_status_degree" value="ON" <% if(student.getStudentDocumentStatusDegree().equals("1")) { out.print("checked"); }%>>สำเนารับรองวุฒกการศึกษา</label>
        <label><input type="checkbox" name="chk_student_document_status_pid" value="ON" <% if(student.getStudentDocumentStatusPid().equals("1")) { out.print("checked"); }%>>สำเนาบัตรประชาชน 2 ฉบับ</label>
        <label><input type="checkbox" name="chk_student_document_status_user_home" value="ON" <% if(student.getStudentDocumentStatusUserHome().equals("1")) { out.print("checked"); }%>>สำเนาทะเบียนบ้าน 2 ฉบับ</label>
        <label><input type="checkbox" name="chk_student_document_status_picture" value="ON" <% if(student.getStudentDocumentStatusPicture().equals("1")) { out.print("checked"); }%>>รูปถ่าย 1 นิ้วหรือ 2 นิ้วรูป ถ่ายไม่เกิน 6 เดือน</label>
        <label><input type="checkbox" name="chk_student_document_status_other1" value="ON" <% if(student.getStudentDocumentStatusOther1().equals("1")) { out.print("checked"); }%>>อื่นๆ</label>
        <input type="text" name="txt_student_document_status_other2" id="txt_student_document_status_other2" value="<%out.print(student.getStudentDocumentStatusOther2());%>" >
    </td>
                                    </tr>
                                    <tr>
                                        <th>ชุดฝึกงาน</th>
<td>
<label><input type="text" name="txt_student_dress_height" id="txt_student_dress_height" value="<%out.print(student.getStudentDressHeight());%>" ></label>
<label><input type="text" name="txt_student_dress_hip" id="txt_student_dress_hip" value="<%out.print(student.getStudentDressHip());%>" ></label>
<label><input type="text" name="txt_student_dress_chest" id="txt_student_dress_chest" value="<%out.print(student.getStudentDressChest());%>" ></label>
<label><input type="text" name="txt_student_dress_shoulder" id="txt_student_dress_shoulder" value="<%out.print(student.getStudentDressShoulder());%>" ></label>
<label><input type="text" name="txt_student_dress_other" id="txt_student_dress_other" value="<%out.print(student.getStudentDressOther());%>" ></label>
</td>

                                    </tr>
                </tbody>
            </table>








        </form>
    </body>
    
</html>
