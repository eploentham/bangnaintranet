<%--
    Document   : noti_repair_save
    Created on : 25 .. 2552, 17:30:55
    Author     : pop
--%>
<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
NurseTWoundCare woundcare = new NurseTWoundCare();
NurseTWoundCareDetail woundcaredetail = new NurseTWoundCareDetail();
NurseTWoundCareDB woundcaredb = new NurseTWoundCareDB();
Config1 config1 = new Config1();

String wound_care_id="", patient_hn_no="", patient_age="",patient_full_namet="",patient_an="";
String patient_phone_number="", patient_bed_room="";

String wound_care_running_doc_no="", wound_cause="", wound_type="", wound_appearance="", wound_category="'";
String wound_location="", wound_treatment_cured_estimate="", wound_treatment_cured_real="";
String nurse_remark="", wound_description="", wound_care_date_start="", wound_care_date_end="";
String wound_care_active="", wound_care_status="", wound_care_user_id="";

String wound_care_detail_id="", wound_care_date="", doctor_dx="", wound_method_category_description="";
String wound_method_care_category_special="", wound_method_care_category_special_description="";
String wound_care_time="", wound_estimate_before_flag="", wound_estimate_before_flag_discharge_description="";
String wound_estimate_before_flag_discharge_quantity="", wound_estimate_before_flag_discharge_feature="";
String wound_estimate_before_category="", wound_estimate_before_category_other_description="";
String wound_estimate_before_category_dimension_description="", wound_estimate_after_flag="";
String wound_estimate_after_flag_solve="", user_id_create="", user_id_modify="", user_id_cancel="";
String date_create="", date_modify="", date_cancel="",wound_method_category="";

String text="", flagdetailnew="";
try{
    //String remoteip = request.getRemoteAddr();
    InetAddress in  = InetAddress.getLocalHost();
    //notitnotirepairdb.notitnotirepair.setRemoteIpUserCreate(in.getHostName()+"-"+ in.getHostAddress()+"-"+request.getRemoteAddr());
    //attend_time = config1.getDate("HH:mm");
    //notitnotirepairdb.notitnotirepair.setAttendTime(attend_time);
    
    if(request.getParameter("txt_wound_care_id")!=null){
        wound_care_id = new String (request.getParameter("txt_wound_care_id").getBytes("ISO8859_1"),"TIS-620");
        wound_care_id = wound_care_id.trim();
    }
    else{
        wound_care_id = "";
    }
    woundcare.setWoundCareId(wound_care_id);
    if(request.getParameter("txt_hn_no")!=null){
        patient_hn_no = new String (request.getParameter("txt_hn_no").getBytes("ISO8859_1"),"TIS-620");
        patient_hn_no = patient_hn_no.trim();
    }
    else{
        patient_hn_no = "";
    }
    woundcare.setPatientHnNo(patient_hn_no);
    if(request.getParameter("txt_wound_care_patient_age")!=null){
        patient_age = new String (request.getParameter("txt_wound_care_patient_age").getBytes("ISO8859_1"),"TIS-620");
        patient_age = patient_age.trim();
    }
    else{
        patient_age = "";
    }
    woundcare.setPatientAge(patient_age);
    if(request.getParameter("txt_patient_full_namet")!=null){
        patient_full_namet = new String (request.getParameter("txt_patient_full_namet").getBytes("ISO8859_1"),"TIS-620");
        patient_full_namet = patient_full_namet.trim();
    }
    else{
        patient_full_namet = "";
    }
    woundcare.setPatientFullNamet(patient_full_namet);
    if(request.getParameter("txt_wound_care_patient_an")!=null){
        patient_an = new String (request.getParameter("txt_wound_care_patient_an").getBytes("ISO8859_1"),"TIS-620");
        patient_an = patient_an.trim();
    }
    else{
        patient_an = "";
    }
    woundcare.setPatientAn(patient_an);
    if(request.getParameter("txt_wound_care_patient_phone_number")!=null){
        patient_phone_number = new String (request.getParameter("txt_wound_care_patient_phone_number").getBytes("ISO8859_1"),"TIS-620");
        patient_phone_number = patient_phone_number.trim();
    }
    else{
        patient_phone_number = "";
    }
    woundcare.setPatientPhoneNumber(patient_phone_number);
    if(request.getParameter("txt_wound_care_patient_bed_room")!=null){
        patient_bed_room = new String (request.getParameter("txt_wound_care_patient_bed_room").getBytes("ISO8859_1"),"TIS-620");
        patient_bed_room = patient_bed_room.trim();
    }
    else{
        patient_bed_room = "";
    }
    woundcare.setPatientBedRoom(patient_bed_room);

    
    if(request.getParameter("txt_wound_care_running_doc")!=null){
        wound_care_running_doc_no = new String (request.getParameter("txt_wound_care_running_doc").getBytes("ISO8859_1"),"TIS-620");
        wound_care_running_doc_no = wound_care_running_doc_no.trim();
    }
    else{
        wound_care_running_doc_no = "";
        }
    woundcare.setWoundCareRunningDocNo(wound_care_running_doc_no);
    if(request.getParameter("chk_wound_cause")!=null){
        wound_cause = new String (request.getParameter("chk_wound_cause").getBytes("ISO8859_1"),"TIS-620");
        wound_cause = wound_cause.trim();
    }
    else{
        wound_cause = "";
        }
    woundcare.setWoundCause(wound_cause);
    if(request.getParameter("txt_wound_type")!=null){
        wound_type = new String (request.getParameter("txt_wound_type").getBytes("ISO8859_1"),"TIS-620");
        wound_type = wound_type.trim();
    }
    else{
        wound_type = "";
        }
    woundcare.setWoundType(wound_type);
    if(request.getParameter("chk_wound_appearance")!=null){
        wound_appearance = new String (request.getParameter("chk_wound_appearance").getBytes("ISO8859_1"),"TIS-620");
        wound_appearance = wound_appearance.trim();
    }
    else{
        wound_appearance = "";
        }
    woundcare.setWoundAppearance(wound_appearance);
    if(request.getParameter("chk_wound_category")!=null){
        wound_category = new String (request.getParameter("chk_wound_category").getBytes("ISO8859_1"),"TIS-620");
        wound_category = wound_category.trim();
    }
    else{
        wound_category = "";
        }
    woundcare.setWoundCategory(wound_category);
    if(request.getParameter("txt_wound_location")!=null){
        wound_location = new String (request.getParameter("txt_wound_location").getBytes("ISO8859_1"),"TIS-620");
        wound_location = wound_location.trim();
    }
    else{
        wound_location = "";
        }
    woundcare.setWoundLocation(wound_location);
    if(request.getParameter("txt_wound_treatment_cured_estimate")!=null){
        wound_treatment_cured_estimate = new String (request.getParameter("txt_wound_treatment_cured_estimate").getBytes("ISO8859_1"),"TIS-620");
        wound_treatment_cured_estimate = wound_treatment_cured_estimate.trim();
    }
    else{
        wound_treatment_cured_estimate = "";
        }
    woundcare.setWoundTreatmentCuredEstimate(wound_treatment_cured_estimate);


    if(request.getParameter("txt_wound_treatment_cured_real")!=null){
        wound_treatment_cured_real = new String (request.getParameter("txt_wound_treatment_cured_real").getBytes("ISO8859_1"),"TIS-620");
        wound_treatment_cured_real = wound_treatment_cured_real.trim();
    }
    else{
        wound_treatment_cured_real = "";
        }
    woundcare.setWoundTreatmentCuredReal(wound_treatment_cured_real);
    if(request.getParameter("txt_nurse_remark")!=null){
        nurse_remark = new String (request.getParameter("txt_nurse_remark").getBytes("ISO8859_1"),"TIS-620");
        nurse_remark = nurse_remark.trim();
    }
    else{
        nurse_remark = "";
        }
    woundcare.setNurseRemark(nurse_remark);
    if(request.getParameter("txt_wound_description")!=null){
        wound_description = new String (request.getParameter("txt_wound_description").getBytes("ISO8859_1"),"TIS-620");
        wound_description = wound_description.trim();
    }
    else{
        wound_description = "";
        }
    woundcare.setWoundDescription(wound_description);









    
    if(request.getParameter("txt_wound_care_detail_id")!=null){
        wound_care_detail_id = new String (request.getParameter("txt_wound_care_detail_id").getBytes("ISO8859_1"),"TIS-620");
        wound_care_detail_id = wound_care_detail_id.trim();
    }
    else{
        wound_care_detail_id = "";
        }
    woundcaredetail.setWoundCareDetailId(wound_care_detail_id);
    woundcaredetail.setWoundCareId(wound_care_id);
    if(request.getParameter("txt_wound_care_date")!=null){
        wound_care_date = new String (request.getParameter("txt_wound_care_date").getBytes("ISO8859_1"),"TIS-620");
        wound_care_date = wound_care_date.trim();
    }
    else{
        wound_care_date = "";
        }
    woundcaredetail.setWoundCareDate(wound_care_date);
    if(request.getParameter("txt_doctor_dx")!=null){
        doctor_dx = new String (request.getParameter("txt_doctor_dx").getBytes("ISO8859_1"),"TIS-620");
        doctor_dx = doctor_dx.trim();
    }
    else{
        doctor_dx = "";
        }
    woundcaredetail.setDoctorDx(doctor_dx);
    if(request.getParameter("chk_wound_method_category")!=null){
        wound_method_category = new String (request.getParameter("chk_wound_method_category").getBytes("ISO8859_1"),"TIS-620");
        wound_method_category = wound_method_category.trim();
    }
    else{
        wound_method_category = "";
        }
    woundcaredetail.setWoundMethodCategory(wound_method_category);
    if(request.getParameter("txt_wound_method_category_description")!=null){
        wound_method_category_description = new String (request.getParameter("txt_wound_method_category_description").getBytes("ISO8859_1"),"TIS-620");
        wound_method_category_description = wound_method_category_description.trim();
    }
    else{
        wound_method_category = "";
        }
    woundcaredetail.setWoundMethodCategoryDescription(wound_method_category_description);
    if(request.getParameter("chk_wound_method_care_category_special")!=null){
        wound_method_care_category_special = new String (request.getParameter("chk_wound_method_care_category_special").getBytes("ISO8859_1"),"TIS-620");
        wound_method_care_category_special = wound_method_care_category_special.trim();
    }
    else{
        wound_method_care_category_special = "";
        }
    woundcaredetail.setWoundMethodCareCategorySpecial(wound_method_care_category_special);
    if(request.getParameter("txt_wound_method_care_category_special_description")!=null){
        wound_method_care_category_special_description = new String (request.getParameter("txt_wound_method_care_category_special_description").getBytes("ISO8859_1"),"TIS-620");
        wound_method_care_category_special_description = wound_method_care_category_special_description.trim();
    }
    else{
        wound_method_care_category_special_description = "";
        }
    woundcaredetail.setWoundMethodCareCategorySpecialDescription(wound_method_care_category_special_description);
    if(request.getParameter("txt_model")!=null){
        wound_care_time = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        wound_care_time = wound_care_time.trim();
    }
    else{
        wound_care_time = "";
        }
    woundcaredetail.setWoundCareTime(wound_care_time);
    if(request.getParameter("chk_wound_estimate_before_flag")!=null){
        wound_estimate_before_flag = new String (request.getParameter("chk_wound_estimate_before_flag").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_before_flag = wound_estimate_before_flag.trim();
    }
    else{
        wound_estimate_before_flag = "";
        }
    woundcaredetail.setWoundEstimateBeforeFlag(wound_estimate_before_flag);
    if(request.getParameter("txt_wound_estimate_before_flag_discharge_description")!=null){
        wound_estimate_before_flag_discharge_description = new String (request.getParameter("txt_wound_estimate_before_flag_discharge_description").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_before_flag_discharge_description = wound_estimate_before_flag_discharge_description.trim();
    }
    else{
        wound_estimate_before_flag_discharge_description = "";
        }
    woundcaredetail.setWoundEstimateBeforeFlagDischargeDescription(wound_estimate_before_flag_discharge_description);
    if(request.getParameter("txt_wound_estimate_before_flag_discharge_quantity")!=null){
        wound_estimate_before_flag_discharge_quantity = new String (request.getParameter("txt_wound_estimate_before_flag_discharge_quantity").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_before_flag_discharge_quantity = wound_estimate_before_flag_discharge_quantity.trim();
    }
    else{
        wound_estimate_before_flag_discharge_quantity = "";
        }
    woundcaredetail.setWoundEstimateBeforeFlagDischargeQuantity(wound_estimate_before_flag_discharge_quantity);
    if(request.getParameter("txt_wound_estimate_before_flag_discharge_feature")!=null){
        wound_estimate_before_flag_discharge_feature = new String (request.getParameter("txt_wound_estimate_before_flag_discharge_feature").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_before_flag_discharge_feature = wound_estimate_before_flag_discharge_feature.trim();
    }
    else{
        wound_estimate_before_flag_discharge_feature = "";
        }
    woundcaredetail.setWoundEstimateBeforeFlagDischargeFeature(wound_estimate_before_flag_discharge_feature);
    if(request.getParameter("chk_wound_estimate_before_category")!=null){
        wound_estimate_before_category = new String (request.getParameter("chk_wound_estimate_before_category").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_before_category = wound_estimate_before_category.trim();
    }
    else{
        wound_estimate_before_category = "";
        }
    woundcaredetail.setWoundEstimateBeforeCategory(wound_estimate_before_category);
    if(request.getParameter("txt_wound_estimate_before_category_other_description")!=null){
        wound_estimate_before_category_other_description = new String (request.getParameter("txt_wound_estimate_before_category_other_description").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_before_category_other_description = wound_estimate_before_category_other_description.trim();
    }
    else{
        wound_estimate_before_category_other_description = "";
        }
    woundcaredetail.setWoundEstimateBeforeCategoryOtherDescription(wound_estimate_before_category_other_description);
    if(request.getParameter("txt_wound_estimate_before_category_dimension_description")!=null){
        wound_estimate_before_category_dimension_description = new String (request.getParameter("txt_wound_estimate_before_category_dimension_description").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_before_category_dimension_description = wound_estimate_before_category_dimension_description.trim();
    }
    else{
        wound_estimate_before_category_dimension_description = "";
        }
    woundcaredetail.setWoundEstimateBeforeCategoryDimensionDescription(wound_estimate_before_category_dimension_description);
    if(request.getParameter("chk_wound_estimate_after_flag")!=null){
        wound_estimate_after_flag = new String (request.getParameter("chk_wound_estimate_after_flag").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_after_flag = wound_estimate_after_flag.trim();
    }
    else{
        wound_estimate_after_flag = "";
        }
    woundcaredetail.setWoundEstimateAfterFlag(wound_estimate_after_flag);
    if(request.getParameter("txt_wound_estimate_after_flag_solve")!=null){
        wound_estimate_after_flag_solve = new String (request.getParameter("txt_wound_estimate_after_flag_solve").getBytes("ISO8859_1"),"TIS-620");
        wound_estimate_after_flag_solve = wound_estimate_after_flag_solve.trim();
    }
    else{
        wound_estimate_after_flag_solve = "";
        }
    woundcaredetail.setWoundEstimateAfterFlagSolve(wound_estimate_after_flag_solve);
    if(request.getParameter("txt_user_id")!=null){
        user_id_create = new String (request.getParameter("txt_user_id").getBytes("ISO8859_1"),"TIS-620");
        user_id_create = user_id_create.trim();
    }
    else{
        user_id_create = "";
        }
    woundcaredetail.setUserIdCreate(user_id_create);
    if(request.getParameter("txt_model")!=null){
        user_id_modify = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        user_id_modify = user_id_modify.trim();
    }
    else{
        user_id_modify = "";
        }
    woundcaredetail.setUserIdModify(user_id_modify);
    if(request.getParameter("txt_model")!=null){
        user_id_cancel = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        user_id_cancel = user_id_cancel.trim();
    }
    else{
        user_id_cancel = "";
        }
    woundcaredetail.setUserIdCancel(user_id_cancel);
    if(request.getParameter("txt_model")!=null){
        date_create = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        date_create = date_create.trim();
    }
    else{
        date_create = "";
        }
    woundcaredetail.setDateCreate(date_create);
    if(request.getParameter("txt_model")!=null){
        date_modify = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        date_modify = date_modify.trim();
    }
    else{
        date_modify = "";
        }
    woundcaredetail.setDateModify(date_modify);
    if(request.getParameter("txt_model")!=null){
        date_cancel = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        date_cancel = date_cancel.trim();
    }
    else{
        date_cancel = "";
        }
    woundcaredetail.setDateCancel(date_cancel);


    if(request.getParameter("txt_wound_care_detail_new")!=null){
        flagdetailnew = new String (request.getParameter("txt_wound_care_detail_new").getBytes("ISO8859_1"),"TIS-620");
        flagdetailnew = flagdetailnew.trim();
    }
    else{
        flagdetailnew = "";
        }
  
    //attend_date = config1.DateFormatShow2DB(attend_date, "ddMMyyyy");
    //ma_date = config1.DateFormatShow2DB(ma_date, "ddMMyyyy");

    //notitnotirepairdb.notitnotirepair.setPriceRepair(Double.parseDouble(price_repair));

//attend_date = new String (request.getParameter("txt_attend_date").getBytes("ISO8859_1"),"TIS_620");//ISO-8859-1
//attend_description = new String (request.getParameter("txt_attend_description").getBytes("ISO8859_1"),"TIS-620");
//attend_remark = new String (request.getParameter("txt_attend_remark").getBytes("ISO8859_1"),"TIS-620");
//attend_user_id= new String (request.getParameter("txt_attend_user_id").getBytes("ISO8859_1"),"TIS_620");//ISO-8859-1
//attend_description = new String (request.getParameter("txt_attend_description").getBytes("ISO8859_1"),"TIS-620");
//attend_remark = new String (request.getParameter("txt_attend_remark").getBytes("ISO8859_1"),"TIS-620");

    int chk =woundcaredb.SaveWoundCare(woundcare, "");
    //if(flagdetailnew.equals("detailnew")){
    if(!wound_care_date.equals("")){
        int chkdetail =woundcaredb.SaveWoundCareDetail(woundcaredetail, "");
        }
    if(chk>0){
        response.sendRedirect("nurse_wound_care_add.jsp?txt_hn_no="+patient_hn_no+"&flag=wound_care_show&cbo_wound_care_running_doc="+wound_care_id);
        }

    }
catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>        
        <%out.print(text); %>
    </body>
</html>
