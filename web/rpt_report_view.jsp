<%-- 
    Document   : rpt_report_view
    Created on : 1 ก.ค. 2552, 15:25:45
    Author     : pop
--%>
<%@ page import ="bangnaintranet.*" %>
<%@ page import ="bangnaLibrary.*" %>
<%@ page import ="java.sql.*" %>
<%@ page import ="java.util.*" %>
<%@ page import ="java.io.*" %>
<%@ page import ="net.sf.jasperreports.engine.*" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
    </head>
<%
    bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
    bangnaLibrary.BBranch branch = new bangnaLibrary.BBranch();
    String jdbc = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    String url = "jdbc:sqlserver://172.1.1.1:1433";
    Connection conn=null;
    Statement st;
    ResultSet rs;
    RptBangna rptbangna = new RptBangna();
    String sql="", name="", age="",an="", dept="", time_start="",time_end="", chk_status_daynight, home_no="", soi="",road="",tombom="", district="";
    String chk_status_opd_ipd="", changwat="", postcode="", telephone="",header1="";
    String branch_id="", branch_name="", month_namet_start="", month_namet_end="";
    //String noti_repair_id = config1.StringNull(request.getParameter("noti_repair_id"));
    String date_start="", datestart1="", dateend1="", datestart3="", dateend3="";
    String date_end = (String)request.getSession().getAttribute("txtdateend");
    String dShow = (String)request.getSession().getAttribute("dShow");
    String form = config1.StringNull(request.getParameter("txt_form"));
    String hn_no = config1.StringNull(request.getParameter("cbo_hn_no"));
    String reportname = config1.StringNull(request.getParameter("txt_report_name"));
    String type_datebase = config1.StringNull(request.getParameter("txt_type_datebase"));
    chk_status_daynight = config1.StringNull(request.getParameter("chk_status_daynight"));
    chk_status_opd_ipd = config1.StringNull(request.getParameter("chk_status_opd_ipd"));
    branch_id = config1.StringNull(request.getParameter("cbo_branch"));
    if(branch_id.equals("")){
        branch = config1.getBranchActive();
    }else{
        branch = config1.getBranch(branch_id);
    }
    if(branch_id.equals("103001")){
        branch_name = "สาขา บางนา 1";
    }else if(branch_id.equals("103002")){
        branch_name = "สาขา บางนา 2";
    }else if(branch_id.equals("103003")){
        branch_name = "สาขา บางนา 3";
    }
    //time_end = config1.StringNull(request.getParameter("time_end"));

    try {
        if(type_datebase.equals("mssql")){           
            //conn=config1.getConnectionMainHIS();
        }else if(type_datebase.equals("mainhis")){
            //conn=config1.getConnectionMainHIS();
        }else{
            //conn=config1.getConnectionBangna();
        }
    }catch (Exception ex) {
            System.out.println("Initial SQL Error " + ex.getMessage());
    }

    String month_start="", month_end="", year_start="", year_end="", day_start="01", day_end="30";
    //header1 = config1.getSiteNamet(branch.getBranchId());
    Map par = new HashMap();
    //par.put("date_start",date_start);
    //par.put("date_end",date_end);
    //par.put("date_start","2551-01-01");
    //par.put("date_end","2551-12-01");
    par.put("header1",header1);
    par.put("header1","โรงพยาบาล บางนา1 1302 ถนน บางนา-ตราด แขวงบางนา เขตบางนา กรุงเทพ 10260 ");
    par.put("header2","BANGNA GENERAL HOSPITAL 1302 Bangna-Trad Road, Bangna,Bangkok Thailand 10260 Email :BANGNA1@BANGNA.CO.TH");
    par.put("header3","ใบนำส่งซ่อม " );
    //par.put("eDate",eDate);
    if(form.equals("monthly")) {
        month_start = request.getParameter("cbo_month_start");
        month_end = request.getParameter("cbo_month_end");
        year_start = request.getParameter("cbo_year_start");
        year_end = request.getParameter("cbo_year_end");
        day_end = config1.getMonthEndDay(year_end, month_end);
        date_start = year_start+"-"+month_start+"-"+day_start;
        date_end = year_end+"-"+month_end+"-"+day_end;
        month_namet_start = config1.getMonthNamet(month_start, "id_name");
        month_namet_end = config1.getMonthNamet(month_start, "id_name");
        if(reportname.equals("doctor_dx_groupby_typepayment")) {
            //rptbangna.createMonthlyDoctorTime(date_start, date_end);
            
            par.put("date_start",date_start);
            par.put("date_end",date_end);
            par.put("branch",branch_name);
            if(chk_status_daynight.equals("time")) {
                par.put("header2","รายงานแพทย์ตรวจประจำเดือน ตามประเภทการรับชำระ ระบุช่วงเวลา" );
                par.put("header3","ประจำเดือน "+month_namet_start+" "+year_start+" ถึงเดือน "+month_namet_end + " " + year_start );
                par.put("time_start",time_start);
                par.put("time_end",time_end);
                }
            else if(chk_status_daynight.equals("all")) {
                par.put("header2","รายงานแพทย์ตรวจประจำเดือน ตามประเภทการรับชำระ ไม่ระบุช่วงเวลา" );
                par.put("header3","ประจำเดือน "+month_namet_start+" "+year_start+" ถึงเดือน "+month_namet_end + " " + year_start );
                par.put("time_start",time_start);
                par.put("time_end",time_end);
                }
            else if(chk_status_daynight.equals("day")) {
                par.put("header2","รายงานแพทย์ตรวจประจำเดือน ตามประเภทการรับชำระ กลางวัน" );
                par.put("header3","ประจำเดือน "+month_namet_start+" "+year_start+" ถึงเดือน "+month_namet_end + " " + year_start );
                par.put("time_start",time_start);
                par.put("time_end",time_end);
                }
            else if(chk_status_daynight.equals("night")) {
                par.put("header2","รายงานแพทย์ตรวจประจำเดือน ตามประเภทการรับชำระ กลางคืน" );
                par.put("header3","ประจำเดือน "+month_namet_start+" "+year_start+" ถึงเดือน "+month_namet_end + " " + year_start );
                par.put("time_start",time_start);
                par.put("time_end",time_end);
                }
            if(!chk_status_opd_ipd.equals("")){
                par.put("opd_ipd",chk_status_opd_ipd.toUpperCase());
                reportname="doctor_dx_groupby_typepayment_"+chk_status_daynight+"_"+chk_status_opd_ipd;
                }
            else {
                reportname="doctor_dx_groupby_typepayment_"+chk_status_daynight;
                }
            conn=config1.getConnectionMainHIS(branch_id);
            }
        
        else if(reportname.equals("monthly_bangna_costs")) {
            par.put("header2","รายงานค่าใช้จ่ายตาม " );
            par.put("header3","ประจำเดือน "+month_namet_start+" "+year_start+" ถึงเดือน "+month_namet_end + " " + year_start );
            reportname="monthly_bangna_costs";
            rptbangna.getMonthlyBangnaCosts(branch_id, date_start, date_end);
            String chk_status_graph = config1.StringNull(request.getParameter("chk_status_graph"));
            if(chk_status_graph.equals("graph")){
                reportname="monthly_bangna_costs_"+chk_status_graph;
                }
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("monthly_doctor_costs")) {
            par.put("header2","รายงานค่าใช้จ่ายแพทย์สั่งตรวจ " );
            par.put("header3","ประจำเดือน "+month_namet_start+" "+year_start+" ถึงเดือน "+month_namet_end + " " + year_start );
            reportname="monthly_doctor_costs";
            rptbangna.getMonthlyDoctorCosts(branch_id, date_start, date_end,"");
            conn=config1.getConnectionBangna();
        }
    }else if(form.equals("daily")) {
        if(reportname.equals("noti_repair_attend_daily")) {
            String  noti_repair_id = config1.StringNull(request.getParameter("noti_repair_id"));
            par.put("header2","ใบแจ้งความขัดข้องการใช้งานและการแก้ไข " );
            par.put("header3","" );
            par.put("noti_repair_id", noti_repair_id);
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("nurse_wound_care")){
            String  wound_care_id = config1.StringNull(request.getParameter("wound_care_id"));
            par.put("p_wound_care_id", wound_care_id);
            par.put("header2","ใบดูแลบาดแผลผู้ป่วย " );
            par.put("header3","" );
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("daily_patient_admit")){
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            String status = config1.StringNull(request.getParameter("chk_status"));
            String bed = config1.StringNull(request.getParameter("txt_bed"));
            par.put("header2","รายงานสถิติผู้ป่วย " );
            par.put("header3","ประจำวันที่ "+date_start+" ถึงวันที่ "+date_end );
            date_start = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
            date_end = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
            rptbangna.getDailyPatientAdmit(branch_id, date_start, date_end, status, bed);
            reportname+="_"+status;
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            conn=config1.getConnectionBangna();
        }
        else if(reportname.equals("daily_patient_admit_ward")){
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            String status = config1.StringNull(request.getParameter("chk_status"));
            String bed = config1.StringNull(request.getParameter("txt_bed"));
            par.put("header2","รายงานสถิติผู้ป่วยตาม Ward " );
            par.put("header3","ประจำวันที่ "+date_start+" ถึงวันที่ "+date_end );
            date_start = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
            date_end = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
            rptbangna.getDailyPatientAdmitWard(branch_id, date_start, date_end, status, bed);
            reportname+="_"+status;
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("daily_hoscharge_detail")){
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            String status = config1.StringNull(request.getParameter("chk_status"));
            par.put("header2","รายงานสถิติผู้ป่วยตาม Ward " );
            par.put("header3","ประจำวันที่ "+date_start+" ถึงวันที่ "+date_end );
            
            date_start = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
            date_end = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
            par.put("date_start",date_start);
            par.put("date_end",date_end);
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            conn=config1.getConnectionMainHIS(branch_id);
            }
        else if(reportname.equals("nurse_foods_order")){
            String  foods_order_id = config1.StringNull(request.getParameter("foods_order_id"));
            par.put("p_foods_order_id", foods_order_id);
            par.put("header2","ใบสั่งอาหาร " );
            par.put("header3","" );
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("asset_item")){
            String  asset_id = config1.StringNull(request.getParameter("asset_id"));
            //par.put("p_asset_id", foods_order_id);
            par.put("header2","รายงานคุรุภัณฑ์ทั้งหมด " );
            par.put("header3","" );
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("admin_bill_lab_voucher")){
            String  bill_lab_id = config1.StringNull(request.getParameter("bill_lab_id"));
            par.put("p_admin_bill_lab_id", bill_lab_id);
            par.put("header2","ใบสั่งจ่าย ");
            par.put("header3","" );
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("admin_bill_lab")){
            String  bill_lab_id = config1.StringNull(request.getParameter("bill_lab_id"));
            par.put("p_admin_bill_lab_id", bill_lab_id);
            par.put("header2","ใบบันทึกการจ่ายเงิน " );
            par.put("header3","" );
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("dental_daily_summary_detail")){
            String  dental_daily_id = config1.StringNull(request.getParameter("dental_daily_id"));
            par.put("p_dental_daily_id", dental_daily_id);
            par.put("header2","รายงานยอดผู้มาใช้บริการประจำวัน " );
            par.put("header3","" );
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("doctor_checkup_form")){
            String  checkup_id = config1.StringNull(request.getParameter("checkup_id"));
            String  checkup_form = config1.StringNull(request.getParameter("checkup_form"));
            String  checkup_form_page = config1.StringNull(request.getParameter("checkup_form_page"));

            //par.put("p_asset_id", foods_order_id);
            par.put("header3","HEALTH  CERTIFICATE" );
            par.put("header4","BASIC  DATA  " );
            par.put("p_checkup_id",checkup_id);
            //par.put("header3","ประจำวันที่ "+date_start+" ถึงวันที่ "+date_end );
            
            reportname += "_"+checkup_form+"_"+checkup_form_page;
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("admin_use_car")) {
            String  use_car_id = config1.StringNull(request.getParameter("use_car_id"));
            par.put("p_use_car_id", use_car_id);
            par.put("header2","ใบขออนุญาตใช้รถ " );
            par.put("header3","" );
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("admin_case_daily")) {
            String  date_startdb = config1.StringNull(request.getParameter("txt_date_start"));
            String  date_enddb = config1.StringNull(request.getParameter("txt_date_end"));
            date_start = config1.DateFormatDB2Show(date_startdb, "ddMMyyyy");
            date_end = config1.DateFormatDB2Show(date_enddb, "ddMMyyyy");

            par.put("p_date_start", date_startdb);
            par.put("p_date_end", date_enddb);
            par.put("header2","ใบสรุปค่า Case " );
            par.put("header3","ประจำวันที่"+ date_start+" ถึงวันที่ "+date_end);
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("admin_case_detail")) {
            String  case_id = config1.StringNull(request.getParameter("case_id"));
            String  date_startdb = config1.StringNull(request.getParameter("txt_date_start"));
            String  date_enddb = config1.StringNull(request.getParameter("txt_date_end"));
            date_start = config1.DateFormatDB2Show(date_startdb, "ddMMyyyy");
            //String  date_enddb = config1.StringNull(request.getParameter("txt_date_end"));
            par.put("p_case_id", case_id);
            //par.put("p_date_end", date_enddb);
            par.put("header2","ใบรายละเอียดค่า Case " );
            par.put("header3","ประจำวันที่ "+date_start);
            conn=config1.getConnectionBangna();
            }
        else if(reportname.equals("patient_visit_hb-typing")) {
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            String claim_id = config1.StringNull(request.getParameter("cbo_claim"));
            String lab_id = config1.StringNull(request.getParameter("cbo_lab"));
            String status_sex = config1.StringNull(request.getParameter("chk_status_sex"));
            String age_start = config1.StringNull(request.getParameter("txt_age_start"));
            String age_end = config1.StringNull(request.getParameter("txt_age_end"));
            String status_lab = config1.StringNull(request.getParameter("chk_status_lab"));
            String date_startdb="", date_enddb="";
            if(age_start.equals("")){
                age_start = "0";
                }
            if(age_end.equals("")){
                age_end = "200";
                }
            date_startdb = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
            date_enddb = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
            par.put("p_date_start",date_startdb);
            par.put("p_date_end",date_enddb);
            par.put("p_branch_namet",branch_name);
            par.put("p_claim_id",claim_id);
            par.put("p_lab_id",lab_id);
            par.put("p_claim_namet",claim_id);//กรณีชื่อยาว แล้วค่อยมาแก้ภายหลัง
            par.put("p_lab_namet",lab_id);
            par.put("p_age_start",age_start);
            par.put("p_age_end",age_end);

            par.put("header2","รายงานผู้มาใช้บริการตาม hb-typing");
            par.put("header3","ประจำวันที่ "+date_start+" ถึงวันที่ "+date_end );
            if(status_sex.equals("1")){
                par.put("p_sex_id","M");
                }
            else {
                par.put("p_sex_id","F");
                }
            if(lab_id.equals("")){
                reportname = reportname+"_no_lab_id";
                }
            if(status_lab.equals("show")){
                reportname = reportname+"_show_lab_result";
                }
            conn=config1.getConnectionMainHIS(branch_id);
            }
        else if(reportname.equals("daily_patient_use_pharmacy")){//daily_patient_use_pharmacy
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            String item_id = config1.StringNull(request.getParameter("cbo_pharmacy"));
            //String status = config1.StringNull(request.getParameter("chk_status"));
            par.put("header2","รายงานสถิติผู้ป่วยใช้ยา "+item_id );
            par.put("header3","ประจำวันที่ "+date_start+" ถึงวันที่ "+date_end );

            date_start = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
            date_end = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
            par.put("date_start",date_start);
            par.put("date_end",date_end);
            par.put("item_id",item_id);
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            conn=config1.getConnectionMainHIS(branch_id);
            }
        else if(reportname.equals("daily_patient_visit_or")){
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            date_end = config1.StringNull(request.getParameter("txt_date_end"));
            String status = config1.StringNull(request.getParameter("chk_status"));
            //String bed = config1.StringNull(request.getParameter("txt_bed"));
            par.put("header2","รายงานสถิติผู้ป่วย OR " );
            par.put("header3","ประจำวันที่ "+date_start+" ถึงวันที่ "+date_end);
            date_start = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
            date_end = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
            
            par.put("p_date_start",date_start);
            par.put("p_date_end",date_end);
            par.put("p_branch_namet",branch_name);
            //rptbangna.getDailyPatientAdmitWard(branch_id, date_start, date_end, status, bed);
            //reportname+="_"+status;
            //date_start = config1.StringNull(request.getParameter("txt_date_start"));
            //date_end = config1.StringNull(request.getParameter("txt_date_end"));
            conn=config1.getConnectionMainHIS(branch_id);
            }
    }
    else if(form.equals("yearly")){
        if(reportname.equals("yearly_doctor_admit")){
            //par.put("noti_repair_id",noti_repair_id);
            year_start = request.getParameter("cbo_year_start");
            year_end = request.getParameter("cbo_year_end");
            month_start = "01";
            month_end = "12";
            day_start = "01";
            day_end = config1.getMonthEndDay(year_end, month_end);
            date_start = year_start+"-"+month_start+"-"+day_start;
            date_end = year_end+"-"+month_end+"-"+day_end;
            par.put("header3","ประจำปี "+year_start+" ถึงปี "+ year_start );
            par.put("header2","รายงานสถิติแพทย์ ADMIT ผู้ป่วย " );
            rptbangna.getYearlyDoctorAdmit(branch_id, date_start, date_end);
            conn=config1.getConnectionBangna();
            }
        }
    else if(form.equals("rpt_critiria_nurse_form")) {
        if((reportname.equals("nurse_form_001")) || (reportname.equals("nurse_form_002"))
            ||(reportname.equals("nurse_form_003")) || (reportname.equals("nurse_form_004"))
            ||(reportname.equals("nurse_form_005")) || (reportname.equals("nurse_form_006"))
            ||(reportname.equals("nurse_form_007")) || (reportname.equals("nurse_form_patient_grant_hiv"))
            ||(reportname.equals("dental_form_patient_regis")) || (reportname.equals("nurse_form_patient_grant_hiv_suggest"))
            ||(reportname.equals("nurse_form_request_blood")) ) {
            date_start = config1.StringNull(request.getParameter("txt_date_start"));
            String bed="", room="", note="",date_startdb="", claim_namet="";
            date_startdb = config1.DateFormatShow2DB(date_start,"ddMMyyyy");
            conn=config1.getConnectionMainHIS();
            par.put("header2","ใบบันทึกการให้ยา");
            par.put("header3","( Medication  Record )" );
            if(reportname.equals("dental_form_patient_regis")) {
                sql = "Select pt01.mnc_hn_no as no, "
            +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
            +"pm32.mnc_md_dep_dsc as dept,datediff(year,pm01.mnc_bday,getdate()) as age, "
            +"pm01.mnc_cur_add, pm01.mnc_cur_tel, pm01.mnc_cur_poc, "
            +"pm08.MNC_AMP_DSC, pm07.MNC_TUM_DSC, pm09.MNC_CHW_DSC, pt01.mnc_shif_memo,pt01.MNC_FN_TYP_CD, fm02.MNC_FN_TYP_DSC  "
            +"From patient_t01  pt01 inner join patient_m01  pm01 on pt01.mnc_hn_no = pm01.mnc_hn_no "
            +"left join patient_m02  pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
            +"left join patient_m32  pm32 on pt01.mnc_dep_no = pm32.mnc_md_dep_no "
            +"left join patient_m08 pm08 on pm01.MNC_CUR_AMP = pm08.MNC_AMP_CD "
            +"left join patient_m07 pm07 on pm01.MNC_CUR_TUM = pm07.MNC_TUM_CD "
            +"left join patient_m09 pm09 on pm01.MNC_CUR_CHW = pm09.MNC_CHW_CD "
            +"left join finance_m02 fm02 on pt01.MNC_FN_TYP_CD = fm02.MNC_FN_TYP_CD "
            +"Where pt01.mnc_hn_no = '"+hn_no+"' and pt01.mnc_date = '"+date_startdb+"' and pt01.MNC_DEP_NO = '115'";
                }
            else {
                sql = "Select pt08.mnc_hn_no as no, mnc_ds_date, mnc_ds_lev, mnc_wd_no, "
            +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
            +"pm32.mnc_md_dep_dsc as dept,datediff(year,pm01.mnc_bday,getdate()) as age, "
            +"pt08.mnc_an_no as an, pt08.mnc_an_yr , pt08.mnc_rm_nam, pt08.mnc_bd_no, pm01.mnc_cur_add, pm01.mnc_cur_tel, pm01.mnc_cur_poc, "
            +"pm08.MNC_AMP_DSC, pm07.MNC_TUM_DSC, pm09.MNC_CHW_DSC "
            +"From patient_t08  pt08 inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
            +"left join patient_m02  pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
            +"left join patient_m32  pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
            +"left join patient_m08 pm08 on pm01.MNC_CUR_AMP = pm08.MNC_AMP_CD "
            +"left join patient_m07 pm07 on pm01.MNC_CUR_TUM = pm07.MNC_TUM_CD "
            +"left join patient_m09 pm09 on pm01.MNC_CUR_CHW = pm09.MNC_CHW_CD "
            +"Where mnc_ds_date  is null and pt08.mnc_hn_no = '"+hn_no+"'";
                }
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                if(reportname.equals("dental_form_patient_regis")) {
                    name = config1.StringNull(rs.getString("name"));
                dept = config1.StringNull(rs.getString("dept"));
                age = config1.StringNull(rs.getString("age"));
                claim_namet = config1.StringNull(rs.getString("MNC_FN_TYP_DSC"));
                //bed = config1.StringNull(rs.getString("mnc_bd_no"));
                //room = config1.StringNull(rs.getString("mnc_rm_nam"));
                note=config1.StringNull(rs.getString("mnc_shif_memo"));
                district=config1.StringNull(rs.getString("MNC_AMP_DSC"));
                changwat=config1.StringNull(rs.getString("MNC_CHW_DSC"));
                postcode=config1.StringNull(rs.getString("mnc_cur_poc"));
                home_no=config1.StringNull(rs.getString("mnc_cur_add"));
                telephone=config1.StringNull(rs.getString("mnc_cur_tel"));
                    }
                else{
                    name = config1.StringNull(rs.getString("name"));
                dept = config1.StringNull(rs.getString("dept"));
                age = config1.StringNull(rs.getString("age"));
                an = config1.StringNull(rs.getString("an")+"."+rs.getString("mnc_an_yr"));
                bed = config1.StringNull(rs.getString("mnc_bd_no"));
                room = config1.StringNull(rs.getString("mnc_rm_nam"));
                tombom=config1.StringNull(rs.getString("MNC_TUM_DSC"));
                district=config1.StringNull(rs.getString("MNC_AMP_DSC"));
                changwat=config1.StringNull(rs.getString("MNC_CHW_DSC"));
                postcode=config1.StringNull(rs.getString("mnc_cur_poc"));
                home_no=config1.StringNull(rs.getString("mnc_cur_add"));
                telephone=config1.StringNull(rs.getString("mnc_cur_tel"));
                    }
                
                }
            rs.close();
            par.put("p_name",name);
            par.put("p_dept",dept);
            par.put("p_an",an);
            par.put("p_age",age);
            par.put("p_hn",hn_no);
            par.put("p_room_bed",room+"-"+bed);
            if(reportname.equals("nurse_form_001")) {
                par.put("header2","ใบบันทึกการให้ยาฉีด");
                par.put("header3","( Medication  Record )" );
                par.put("rline1","ชนิด            ยาฉีด");
                par.put("rline2","ประเภท      คำสั่งตลอดไป");
                par.put("rline3","");
                par.put("rline4","อาการที่แพ้..................................................");
                }
            else if(reportname.equals("nurse_form_002")) {
                par.put("header2","ใบบันทึกการให้ยาฉีด-รับประทาน");
                par.put("header3","( Medication  Record )" );
                par.put("rline1","ชนิด            ยารับประทาน/ยาฉีด");
                par.put("rline2","ประเภท      คำสั่งเฉพาะครั้ง/PRN");
                //par.put("rline3","ประวัติแพ้ยา/อาการ     ไม่มี    มี คือ..................");
                par.put("rline4","อาการที่แพ้..................................................");
                }
            else if(reportname.equals("nurse_form_003")) {
                par.put("header2","ใบบันทึกการให้ยารับประทาน");
                par.put("header3","( Medication  Record )" );
                par.put("rline1","ชนิด            ยารับประทาน");
                par.put("rline2","ประเภท      คำสั่งตลอดไป");
                //par.put("rline3","ประวัติแพ้ยา/อาการ     ไม่มี    มี คือ..................");
                par.put("rline4","อาการที่แพ้..................................................");
                }
            else if(reportname.equals("nurse_form_004")) {
                par.put("header2","ใบสรุปการรักษาพยาบาล");
                par.put("header3"," " );
                //par.put("rline1","ชนิด            ยาฉีด");
                //par.put("rline2","ประเภท      คำสั่งตลอดไป");
                //par.put("rline3","ประวัติแพ้ยา/อาการ     ไม่มี    มี คือ..................");
                //par.put("rline4","อาการที่แพ้..................................................");
                }
            else if(reportname.equals("nurse_form_005")) {
                par.put("header2","ใบบันทึกการให้สารละลายทางหลอดเลือดดำ");
                par.put("header3","( Intravenous  Fluid  Record )" );
                //par.put("rline1","ชนิด            ยาฉีด");
                //par.put("rline2","ประเภท      คำสั่งตลอดไป");
                //par.put("rline3","ประวัติแพ้ยา/อาการ     ไม่มี    มี คือ..................");
                //par.put("rline4","อาการที่แพ้..................................................");
                }
            else if(reportname.equals("nurse_form_006")) {
                par.put("header2","ใบบันทึกการให้เลือด");
                par.put("header3","Blood Transtusion Record");
                par.put("rline1","ชนิด            ยาฉีด");
                par.put("rline2","ประเภท      คำสั่งตลอดไป");
                par.put("rline3","ประวัติแพ้ยา/อาการ     ไม่มี    มี คือ..................");
                par.put("rline4","อาการที่แพ้..................................................");
                }
            else if(reportname.equals("nurse_form_007")) {
                par.put("rline1","ชนิด            ยาฉีด");
                par.put("rline2","ประเภท      คำสั่งตลอดไป");
                par.put("rline3","ประวัติแพ้ยา/อาการ     ไม่มี    มี คือ..................");
                par.put("rline4","อาการที่แพ้..................................................");
                }
            else if(reportname.equals("nurse_form_patient_grant_hiv")) {
                par.put("header2","");
                //par.put("header3","หนังสือแสดงความยินยอมตรวจเชื้อเอดส์" );
                par.put("p_home_no",home_no);
                par.put("p_soi",soi);
                par.put("p_road",road);
                par.put("p_tombom",tombom);
                par.put("p_district",district);
                par.put("p_changwat",changwat);
                par.put("p_postcode",postcode);
                par.put("p_telephone",telephone);
                }
            else if(reportname.equals("dental_form_patient_regis")) {
                par.put("header2","Bangna General Hospital 1302 Bangna-trad Road ");
                par.put("header3","ข้อมูลผู้รับบริการทนตกรรม โรงพยาบาล บางนา");
                par.put("p_visit_date",date_start);
                par.put("p_visit_claim",claim_namet);
                par.put("p_note",note);
                par.put("p_name",name);
                par.put("p_age",age);
                par.put("p_postcode",postcode);
                par.put("p_telephone",telephone);
                }
            else if(reportname.equals("nurse_form_request_blood")) {
                par.put("header1","ชื่อ โรงพยาบาล บางนา 1                                                         หมายเลขสมาชิก 001143");
                par.put("header2","ที่ตั้ง 1302 ถนนบางนา-ตราดกม3 แขวงบางนา เขตบางนา กรุงเทพ 10260 หมายเลขโทรศัพท์02-398-4176");
                par.put("header3","ใบขอใช้โลหิต ศูนย์บริการโลหิตแห่งชาติ สภากาชาดไทย (ตรวจ NAT ทุกยูนิต)" );
                par.put("p_home_no",home_no);
                par.put("p_soi",soi);
                par.put("p_road",road);
                par.put("p_tombom",tombom);
                par.put("p_district",district);
                par.put("p_changwat",changwat);
                par.put("p_postcode",postcode);
                par.put("p_telephone",telephone);
                }
            conn.close();
            conn=config1.getConnectionBangna();
            }
        }

    File reportFile = new File(application.getRealPath("/report/"+reportname+".jasper"));
    String rptfile = application.getRealPath("/report/"+reportname+".jasper");
    //out.print(rptfile);

    if (!reportFile.exists())
            throw new JRRuntimeException("File not found. The report desing must be compiled first.");
            byte[] bytes = JasperRunManager.runReportToPdf(rptfile,par,conn);
            response.setContentType("application/pdf");
            response.setContentLength((bytes.length));
            ServletOutputStream outputStream = response.getOutputStream();
            outputStream.write(bytes,0,bytes.length);
            outputStream.flush();
            outputStream.close();
%>

    <body>
    <title><%out.print(rptfile);%></title>
    <%out.print(rptfile);%>
    </body>
</html>
