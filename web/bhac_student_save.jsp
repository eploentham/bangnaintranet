<%-- 
    Document   : bhac_student_save
    Created on : Sep 27, 2009, 11:18:37 AM
    Author     : root
--%>
<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.Vector" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
String flag_redirect="", student_id="",text="", student_active="",student_code="",student_first_namet="",student_last_namet="";
String student_birthday="",student_age="",student_width="",student_height="",student_sex="",student_nationality="",student_pid="";
String student_pid_issued="",student_pid_expire="",student_current_house="",student_current_moo="",student_current_apartment="";
String student_current_apartment_room="",student_current_soi="",student_current_road="",student_current_tambon="",student_current_amphur="";
Config1 config1 = new Config1();
BhacTStudent student = new BhacTStudent();
BhacTStudentDB studentdb = new BhacTStudentDB();
try{

    if(request.getParameter("flag_redirect")!=null){
        flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
        }
    else{
        flag_redirect = "";
        }
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_active")!=null){
        student_active = new String (request.getParameter("txt_student_active").getBytes("ISO8859_1"),"TIS-620");
        student_active = student_active.trim();
        }
    else{
        student_active = "";
        }
    if(student_active.equals("")){
        student_active = "1";
        }
    student.setStudentActive(student_active);
    if(request.getParameter("txt_student_code")!=null){
        student_code = new String (request.getParameter("txt_student_code").getBytes("ISO8859_1"),"TIS-620");
        student_code = student_code.trim();
        }
    else{
        student_code = "";
        }
    student.setStudentCode(student_code);
    if(request.getParameter("txt_student_first_namet")!=null){
        student_first_namet = new String (request.getParameter("txt_student_first_namet").getBytes("ISO8859_1"),"TIS-620");
        student_first_namet = student_first_namet.trim();
        }
    else{
        student_first_namet = "";
        }
    student.setStudentFirstNamet(student_first_namet);
    if(request.getParameter("txt_student_last_namet")!=null){
        student_last_namet = new String (request.getParameter("txt_student_last_namet").getBytes("ISO8859_1"),"TIS-620");
        student_last_namet = student_last_namet.trim();
        }
    else{
        student_last_namet = "";
        }
    student.setStudentLastNamet(student_last_namet);
    if(request.getParameter("txt_student_birthday")!=null){
        student_birthday = new String (request.getParameter("txt_student_birthday").getBytes("ISO8859_1"),"TIS-620");
        student_birthday = student_birthday.trim();
        }
    else{
        student_birthday = "";
        }
    student_birthday = config1.DateFormatShow2DB(student_birthday, "ddMMyyyy");
    student.setStudentBirthday(student_birthday);
    if(request.getParameter("txt_student_age")!=null){
        student_age = new String (request.getParameter("txt_student_age").getBytes("ISO8859_1"),"TIS-620");
        student_age = student_age.trim();
        }
    else{
        student_age = "";
        }
    student.setStudentAge(student_age);
    if(request.getParameter("txt_student_width")!=null){
        student_width = new String (request.getParameter("txt_student_width").getBytes("ISO8859_1"),"TIS-620");
        student_width = student_width.trim();
        }
    else{
        student_width = "";
        }
    student.setStudentWidth(student_width);
    if(request.getParameter("txt_student_height")!=null){
        student_height = new String (request.getParameter("txt_student_height").getBytes("ISO8859_1"),"TIS-620");
        student_height = student_height.trim();
        }
    else{
        student_height = "";
        }
    student.setStudentHeight(student_height);
    if(request.getParameter("txt_student_nationality")!=null){
        student_nationality = new String (request.getParameter("txt_student_nationality").getBytes("ISO8859_1"),"TIS-620");
        student_nationality = student_nationality.trim();
        }
    else{
        student_nationality = "";
        }
    student.setStudentNationality(student_nationality);
    if(request.getParameter("chk_student_sex")!=null) {
        student_sex = new String (request.getParameter("chk_student_sex").getBytes("ISO8859_1"),"TIS-620");
        student_sex = student_sex.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentSex(student_sex);
    if(request.getParameter("txt_student_pid")!=null) {
        student_pid = new String (request.getParameter("txt_student_pid").getBytes("ISO8859_1"),"TIS-620");
        student_pid = student_pid.trim();
        }
    else{
        student_pid = "";
        }
    student.setStudentPid(student_pid);
    if(request.getParameter("txt_student_pid_issued")!=null) {
        student_pid_issued = new String (request.getParameter("txt_student_pid_issued").getBytes("ISO8859_1"),"TIS-620");
        student_pid_issued = student_pid_issued.trim();
        }
    else{
        student_pid_issued = "";
        }
    student.setStudentPidIssued(student_pid_issued);
    if(request.getParameter("txt_student_pid_expire")!=null) {
        student_pid_expire = new String (request.getParameter("txt_student_pid_expire").getBytes("ISO8859_1"),"TIS-620");
        student_pid_expire = student_pid_expire.trim();
        }
    else{
        student_pid_expire = "";
        }
    student.setStudentPidExpire(student_pid_expire);
    if(request.getParameter("txt_student_current_apartment_room")!=null) {
        student_current_apartment_room = new String (request.getParameter("txt_student_current_apartment_room").getBytes("ISO8859_1"),"TIS-620");
        student_current_apartment_room = student_current_apartment_room.trim();
        }
    else{
        student_current_apartment_room = "";
        }
    student.setStudentCurrentApartmentRoom(student_current_apartment_room);
    if(request.getParameter("txt_student_current_house")!=null) {
        student_current_house = new String (request.getParameter("txt_student_current_house").getBytes("ISO8859_1"),"TIS-620");
        student_current_house = student_current_house.trim();
        }
    else{
        student_current_house = "";
        }
    student.setStudentCurrentHouse(student_current_house);
    if(request.getParameter("txt_student_current_moo")!=null) {
        student_current_moo = new String (request.getParameter("txt_student_current_moo").getBytes("ISO8859_1"),"TIS-620");
        student_current_moo = student_current_moo.trim();
        }
    else{
        student_current_moo = "";
        }
    student.setStudentCurrentMoo(student_current_moo);
    if(request.getParameter("txt_student_current_apartment")!=null){
        student_current_apartment = new String (request.getParameter("txt_student_current_apartment").getBytes("ISO8859_1"),"TIS-620");
        student_current_apartment = student_current_apartment.trim();
        }
    else{
        student_current_apartment = "";
        }
    student.setStudentCurrentApartment(student_current_apartment);
    if(request.getParameter("txt_student_current_soi")!=null){
        student_current_soi = new String (request.getParameter("txt_student_current_soi").getBytes("ISO8859_1"),"TIS-620");
        student_current_soi = student_current_soi.trim();
        }
    else{
        student_current_soi = "";
        }
    student.setStudentCurrentSoi(student_current_soi);
    if(request.getParameter("txt_student_current_road")!=null){
        student_current_road = new String (request.getParameter("txt_student_current_road").getBytes("ISO8859_1"),"TIS-620");
        student_current_road = student_current_road.trim();
        }
    else{
        student_current_road = "";
        }
    student.setStudentCurrentRoad(student_current_road);
    if(request.getParameter("txt_student_current_tambon")!=null){
        student_current_tambon = new String (request.getParameter("txt_student_current_tambon").getBytes("ISO8859_1"),"TIS-620");
        student_current_tambon = student_current_tambon.trim();
        }
    else{
        student_current_tambon = "";
        }
    student.setStudentCurrentTambon(student_current_tambon);
    if(request.getParameter("txt_student_current_amphur")!=null){
        student_current_amphur = new String (request.getParameter("txt_student_current_amphur").getBytes("ISO8859_1"),"TIS-620");
        student_current_amphur = student_current_amphur.trim();
        }
    else{
        student_current_amphur = "";
        }
    student.setStudentCurrentAmphur(student_current_amphur);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    if(request.getParameter("txt_student_id")!=null){
        student_id = new String (request.getParameter("txt_student_id").getBytes("ISO8859_1"),"TIS-620");
        student_id = student_id.trim();
        }
    else{
        student_id = "";
        }
    student.setStudentId(student_id);
    


    String chk = studentdb.setSaveBhacTStudent(student, "");
    if(!chk.equals("")){
        if(flag_redirect.equals("")){
            response.sendRedirect("bhac_student_add.jsp?txt_student_id="+chk);
            }
        else if(flag_redirect.equals("cancel")){
            response.sendRedirect("bhac_student_add.jsp?txt_student_id="+chk);
            }
        }
    } catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
