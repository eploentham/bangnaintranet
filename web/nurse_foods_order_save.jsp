<%-- 
    Document   : nurse_foods_order_save
    Created on : 8 ส.ค. 2552, 12:06:47
    Author     : pop
--%>

<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.Vector" %>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
NurseTFoodsOrderDB foodsorderdb = new NurseTFoodsOrderDB();
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
NurseTFoodsOrder foodsorder = new NurseTFoodsOrder();
NurseTFoodsOrderDetail foodsorderdetail = new NurseTFoodsOrderDetail();
bangnaLibrary.BBranch branch = new bangnaLibrary.BBranch();
branch = config1.getBranchActive();
String branch_id="", department_id="",user_foods_nutritionist="",ward_id="";
String foods_order_id="",date_foods_order="",user_foods_order="",user_foods_receive="";
String room_id="",bed_id="",patient_hn_no="",patient_fullnamet="",type_foods_order="",remark="";
String usernametfoodsorder="",usernametfoodsreceive="",usernametnutritionist="";
String flag_redirect="", text="",type_namet_foods_order="",foods_order_detail_id="";
String ward_namet="",detail_active="",foods_order_active="", foods_period_id="";
String paid_id="", paid_namet="",page_number="";
try{

    if(request.getParameter("flag_redirect")!=null){
        flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
        }
    else{
        flag_redirect = "";
        }
    if(request.getParameter("txt_foods_order_id")!=null){
        foods_order_id = new String (request.getParameter("txt_foods_order_id").getBytes("ISO8859_1"),"TIS-620");
        foods_order_id = foods_order_id.trim();
        }
    else{
        foods_order_id = "";
        }
    foodsorder.setFoodsOrderId(foods_order_id);
    if(request.getParameter("cbo_ward")!=null){
        ward_id = new String (request.getParameter("cbo_ward").getBytes("ISO8859_1"),"TIS-620");
        ward_id = ward_id.trim();
        }
    else{
        ward_id = "";
        }
    foodsorder.setWardId(ward_id);
    if(request.getParameter("cbo_branch")!=null){
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
        branch_id = branch_id.trim();
        }
    else{
        branch_id = "";
        }
    if(branch_id.equals("")){
        branch_id = branch.getBranchId();
        }
    foodsorder.setBranchId(branch_id);
    if(request.getParameter("txt_ward_namet")!=null){
        ward_namet = new String (request.getParameter("txt_ward_namet").getBytes("ISO8859_1"),"TIS-620");
        ward_namet = ward_namet.trim();
        }
    else{
        ward_namet = "";
        }
    foodsorder.setWardNamet(ward_namet);
    if(request.getParameter("txt_date_foods_order")!=null){
        date_foods_order = new String (request.getParameter("txt_date_foods_order").getBytes("ISO8859_1"),"TIS-620");
        date_foods_order = date_foods_order.trim();
        }
    else{
        date_foods_order = "";
        }
    date_foods_order = config1.DateFormatShow2DB(date_foods_order, "ddMMyyyy");
    foodsorder.setDateFoodsOrder(date_foods_order);
    if(request.getParameter("txt_user_id_foods_order")!=null){
        user_foods_order = new String (request.getParameter("txt_user_id_foods_order").getBytes("ISO8859_1"),"TIS-620");
        user_foods_order = user_foods_order.trim();
        }
    else{
        user_foods_order = "";
        }
    foodsorder.setUserIdFoodsOrder(user_foods_order);
    if(request.getParameter("txt_user_id_foods_receive")!=null){
        user_foods_receive = new String (request.getParameter("txt_user_id_foods_receive").getBytes("ISO8859_1"),"TIS-620");
        user_foods_receive = user_foods_receive.trim();
        }
    else{
        user_foods_receive = "";
        }
    foodsorder.setUserIdFoodsReceive(user_foods_receive);
    if(request.getParameter("txt_user_id_foods_nutritionist")!=null){
        user_foods_nutritionist = new String (request.getParameter("txt_user_id_foods_nutritionist").getBytes("ISO8859_1"),"TIS-620");
        user_foods_nutritionist = user_foods_nutritionist.trim();
        }
    else{
        user_foods_nutritionist = "";
        }
    foodsorder.setUserIdNutritionist(user_foods_nutritionist);

    if(request.getParameter("txt_foods_order_detail_id")!=null){
        foods_order_detail_id = new String (request.getParameter("txt_foods_order_detail_id").getBytes("ISO8859_1"),"TIS-620");
        foods_order_detail_id = foods_order_detail_id.trim();
        }
    else{
        foods_order_detail_id = "";
        }
    foodsorderdetail.setFoodsOrderDetailId(foods_order_detail_id);
    if(request.getParameter("txt_room_id")!=null){
        room_id = new String (request.getParameter("txt_room_id").getBytes("ISO8859_1"),"TIS-620");
        room_id = room_id.trim();
        }
    else{
        room_id = "";
        }
    foodsorderdetail.setRoomId(room_id);
    if(request.getParameter("txt_bed_id")!=null){
        bed_id = new String (request.getParameter("txt_bed_id").getBytes("ISO8859_1"),"TIS-620");
        bed_id = bed_id.trim();
        }
    else{
        bed_id = "";
        }
    foodsorderdetail.setBedId(bed_id);
    if(request.getParameter("txt_patient_hn_no")!=null){
        patient_hn_no = new String (request.getParameter("txt_patient_hn_no").getBytes("ISO8859_1"),"TIS-620");
        patient_hn_no = patient_hn_no.trim();
        }
    else{
        patient_hn_no = "";
        }
    foodsorderdetail.setPatientHnNo(patient_hn_no);
    if(request.getParameter("txt_patient_fullnamet")!=null){
        patient_fullnamet = new String (request.getParameter("txt_patient_fullnamet").getBytes("ISO8859_1"),"TIS-620");
        patient_fullnamet = patient_fullnamet.trim();
        }
    else{
        patient_fullnamet = "";
        }
    foodsorderdetail.setPatientFullnamet(patient_fullnamet);
    if(request.getParameter("cbo_type_foods_order")!=null){
        type_foods_order = new String (request.getParameter("cbo_type_foods_order").getBytes("ISO8859_1"),"TIS-620");
        type_foods_order = type_foods_order.trim();
        }
    else{
        type_foods_order = "";
        }
    foodsorderdetail.setTypeFoodsId(type_foods_order);
    if(request.getParameter("txt_type_foods_order")!=null){
        type_namet_foods_order = new String (request.getParameter("txt_type_foods_order").getBytes("ISO8859_1"),"TIS-620");
        type_namet_foods_order = type_namet_foods_order.trim();
        }
    else{
        type_namet_foods_order = "";
        }
    foodsorderdetail.setTypeFoodsNamet(type_namet_foods_order);
    if(request.getParameter("txt_remark")!=null){
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        remark = remark.trim();
        }
    else{
        remark = "";
        }
    foodsorderdetail.setRemark(remark);
    if(request.getParameter("txt_foods_order_detail_active")!=null){
        detail_active = new String (request.getParameter("txt_foods_order_detail_active").getBytes("ISO8859_1"),"TIS-620");
        detail_active = detail_active.trim();
        }
    else{
        detail_active = "";
        }
    if(detail_active.equals("")) {
        detail_active="1";
        }
    foodsorderdetail.setFoodsOrderDetailActive(detail_active);
    
    if(request.getParameter("txt_user_namet_foods_order")!=null){
        usernametfoodsorder = new String (request.getParameter("txt_user_namet_foods_order").getBytes("ISO8859_1"),"TIS-620");
        usernametfoodsorder = usernametfoodsorder.trim();
        }
    else{
        usernametfoodsorder = "";
        }
    foodsorder.setUserNametFoodsOrder(usernametfoodsorder);
    if(request.getParameter("txt_user_namet_foods_receive")!=null){
        usernametfoodsreceive = new String (request.getParameter("txt_user_namet_foods_receive").getBytes("ISO8859_1"),"TIS-620");
        usernametfoodsreceive = usernametfoodsreceive.trim();
        }
    else{
        usernametfoodsreceive = "";
        }
    foodsorder.setUserNametFoodsReceive(usernametfoodsreceive);
    if(request.getParameter("txt_user_namet_nutritionist")!=null){
        usernametnutritionist = new String (request.getParameter("txt_user_namet_nutritionist").getBytes("ISO8859_1"),"TIS-620");
        usernametnutritionist = usernametnutritionist.trim();
        }
    else{
        usernametnutritionist = "";
        }
    foodsorder.setUserNametNutritionist(usernametnutritionist);
    
    //foodsorderdetail.setFoodsOrderDetailActive("1");
    if(request.getParameter("txt_foods_order_active")!=null){
        foods_order_active = new String (request.getParameter("txt_foods_order_active").getBytes("ISO8859_1"),"TIS-620");
        foods_order_active = foods_order_active.trim();
        }
    else{
        foods_order_active = "";
        }
    if(foods_order_active.equals("")){
        foods_order_active="1";
        }
    if(request.getParameter("cbo_foods_period")!=null){
        foods_period_id = new String (request.getParameter("cbo_foods_period").getBytes("ISO8859_1"),"TIS-620");
        foods_period_id = foods_period_id.trim();
        }
    else{
        foods_period_id = "";
        }
    foodsorder.setFoodsPeriodId(foods_period_id);

    if(request.getParameter("txt_remark")!=null){
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        remark = remark.trim();
        }
    else{
        remark = "";
        }
    foodsorderdetail.setRemark(remark);

    if(request.getParameter("txt_paid_id")!=null){
        paid_id = new String (request.getParameter("txt_paid_id").getBytes("ISO8859_1"),"TIS-620");
        paid_id = paid_id.trim();
        }
    else{
        paid_id = "";
        }
    if(request.getParameter("txt_paid_namet")!=null){
        paid_namet = new String (request.getParameter("txt_paid_namet").getBytes("ISO8859_1"),"TIS-620");
        paid_namet = paid_namet.trim();
        }
    else{
        paid_namet = "";
        }
    if(foodsorderdetail.getPaidId().equals("")){
        Vector v = config1.SearchPaitentinWard(branch.getBranchId(), date_foods_order, patient_hn_no,"hnno",ward_id,room_id,bed_id);
        if(v.size()>0){
            bangnaLibrary.PatientVisit patientvisit = (bangnaLibrary.PatientVisit)v.get(0);
            paid_id = patientvisit.getVisitPaidId();
            paid_namet = patientvisit.getVisitPaidNamet();
        }
    }
    foodsorderdetail.setPaidId(paid_id);
    
    if(paid_id.equals("01")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("02")){
        paid_namet = "ทป";
        }
    else if(paid_id.equals("03")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("05")){
        paid_namet = "บ.";
        }
    else if(paid_id.equals("06")){
        paid_namet = "พรบ.";
        }
    else if(paid_id.equals("07")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("09")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("10")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("11")){
        paid_namet = "บ.";
        }
    else if(paid_id.equals("13")){
        paid_namet = "กท.";
        }
    else if(paid_id.equals("15")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("16")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("17")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("18")){
        paid_namet = "อื่น"+paid_id;
        }
    else if(paid_id.equals("44")){
        paid_namet = "ปกส1";
        }
    else if(paid_id.equals("45")){
        paid_namet = "ปกส2";
        }
    else if(paid_id.equals("47")){
        paid_namet = "ปกส.อ1";
        }
    else if(paid_id.equals("48")){
        paid_namet = "ปกส.อ2";
        }
    else if(paid_id.equals("50")){
        paid_namet = "พนง";
        }
    else if(paid_id.equals("66")){
        paid_namet = "UC";
        }
    else if(paid_id.equals("88")){
        paid_namet = "UC";
        }
    foodsorderdetail.setPaidNamet(paid_namet);
    if(request.getParameter("txt_page_number")!=null){
        page_number = new String (request.getParameter("txt_page_number").getBytes("ISO8859_1"),"TIS-620");
        page_number = page_number.trim();
        }
    else{
        page_number = "";
        }
    foodsorderdetail.setPageNumber(page_number);

    foodsorder.setFoodsOrderActive(foods_order_active);
    //foodsorder.setFoodsOrderActive("1");

    String chk = foodsorderdb.setSaveFoodsOrder(foodsorder, "");
    String chk1="";
    if(foodsorderdetail.getFoodsOrderId().equals("")){
        foodsorderdetail.setFoodsOrderId(chk);
        }
    if(!foodsorderdetail.getPatientHnNo().equals("")){
        chk1 = foodsorderdb.setSaveFoodsOrderDetail(foodsorderdetail, "");
        }
    if(!chk.equals("")){
        if(flag_redirect.equals("")){
            response.sendRedirect("nurse_foods_order_add.jsp?txt_foods_order_id="+chk+"&flag=detailnew&foods_order_detail_id="+chk1);
            }
        else if(flag_redirect.equals("cancel")){
            response.sendRedirect("nurse_foods_order_view.jsp?txt_foods_order_id="+chk+"&flag=detailnew&foods_order_detail_id="+chk1);
            }
        }

    }
catch(Exception ex){
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
