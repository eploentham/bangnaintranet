package bangnaintranet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pop
 */
import bangnaintranet.table.*;
import java.sql.*;
import java.text.*;
import javax.naming.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.DataSource;
import javax.swing.JOptionPane;
public class Config1 {
    private String host = "localhost";
    private String userDB = "postgres";
    private String passDB = "oleyoil1*";
    private String database = "bangna";
    private String driverName = "org.postgresql.Driver"; // Postgresql JDBC driver
    private Month month = new Month();
    private Vector v_month = new Vector();
    public Connection getConnectionBangna() throws Exception {
        String url = "";
        String jdbcname = "jdbc/unleashed";
//        String curDir = System.getProperty("user.dir");
        //System.out.print(curDir);
//        readIni ini = new readIni();
        //Context ctx = new InitialContext();
        //Context envCtx = (Context)ctx.lookup("java:comp/env");
        //DataSource ds= (DataSource)envCtx.lookup(jdbcname);
        
//        host = "localhost";
        host = "172.1.1.3";
        userDB = "postgres";
//        passDB = "oleyoil1*";
        passDB = "bng1front";
        database = "bangna1";
//        driverName = ini.doit("driverName");
        try {
            Class.forName(driverName);
            url = "jdbc:postgresql://" + host + "/" + database;
            Connection con = DriverManager.getConnection(url, userDB, passDB);
            //con = ds.getConnection();
            System.out.println(" Database connection established to " + url+ ".");

            return con;
        } catch (java.sql.SQLException e) {
            System.out.println(" Connection couldn't be established to "+ url);
            throw (e);
        }
    }
    public Connection getConnectionHospital(String branch_id) throws Exception {
        String url = "", host_address="", user_db="", pass_db="", datebase="", sql="";
        String jdbcname = "jdbc/unleashed";
        Connection conn;
        conn = getConnectionBangna();
        Statement st;
        ResultSet rs;
        st = conn.createStatement();
        sql = "Select * from b_branch_database Where branch_id = '"+branch_id+"' and host_name = 'hospital'";
        rs = st.executeQuery(sql);
        while (rs.next()){
            host_address=rs.getString("host_address");
            user_db=rs.getString("host_user_name");
            pass_db=rs.getString("host_password");
            datebase=rs.getString("host_database_name");
        }
        rs.close();
        conn.close();
        try {
            Class.forName(driverName);
            url = "jdbc:postgresql://" + host_address + "/" + datebase;
            Connection con = DriverManager.getConnection(url, user_db, pass_db);
            //con = ds.getConnection();
            System.out.println(" Database connection established to " + url+ ".");

            return con;
        } catch (java.sql.SQLException e) {
            System.out.println(" Connection couldn't be established to "+ url);
            throw (e);
        }
    }
    public Connection getConnectionBillLab(String mdbfilename) throws Exception {
        String url = "";
//        String curDir = System.getProperty("user.dir");
        //System.out.print(curDir);jdbc:sqlserver://172.1.1.1:1433;databaseName=bng1_dbms_front
//        readIni ini = new readIni();
        host = "172.1.1.3";
        userDB = "";
        passDB = "";
        database = "bng1_dbms_front";
        driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver").newInstance();
            //url = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb)};DBQ='"+mdbfilename+"';uid=;pwd=;";
            url = "jdbc:odbc:DRIVER={Microsoft Access Driver (*.mdb)};DBQ="+mdbfilename+";uid=;pwd=;";
            Connection con = DriverManager.getConnection(url);
            System.out.println(" Database connection established to " + url+ ".");

            return con;
        } catch (java.sql.SQLException e) {
            System.out.println(" Connection couldn't be established to "+ url);
            throw (e);
        }
    }
    public Connection getConnectionMainHIS() throws Exception {
        String url = "";
//        String curDir = System.getProperty("user.dir");
        //System.out.print(curDir);jdbc:sqlserver://172.1.1.1:1433;databaseName=bng1_dbms_front
//        readIni ini = new readIni();
        host = "172.1.1.1";
        userDB = "sa";
        passDB = "";
        database = "bng1_dbms_front";
        driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName(driverName).newInstance();
            url = "jdbc:sqlserver://" + host + ":1433;databaseName=" + database;
            Connection con = DriverManager.getConnection(url, userDB, passDB);
            System.out.println(" Database connection established to " + url+ ".");

            return con;
        } catch (java.sql.SQLException e) {
            System.out.println(" Connection couldn't be established to "+ url);
            throw (e);
        }
    }
    public Connection getConnectionMainHIS(String branch_id) throws Exception {
        String url = "", sql="", host_address="", user_db="", pass_db="", datebase="";
//        String curDir = System.getProperty("user.dir");
        //System.out.print(curDir);jdbc:sqlserver://172.1.1.1:1433;databaseName=bng1_dbms_front
//        readIni ini = new readIni();
        host = "172.1.1.1";
        userDB = "sa";
        passDB = "";
        database = "bng1_dbms_front";
        Connection conn;
        conn = getConnectionBangna();
        Statement st;
        ResultSet rs;
        st = conn.createStatement();
        sql = "Select * from b_branch_database Where branch_id = '"+branch_id+"' and host_name = 'mainhis'";
        rs = st.executeQuery(sql);
        while (rs.next()){
            host_address=rs.getString("host_address");
            user_db=rs.getString("host_user_name");
            pass_db=rs.getString("host_password");
            datebase=rs.getString("host_database_name");
        }
        rs.close();
        conn.close();
        
        driverName = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
        try {
            Class.forName(driverName).newInstance();
            url = "jdbc:sqlserver://" + host_address + ":1433;databaseName=" + datebase;
            Connection con = DriverManager.getConnection(url, user_db, pass_db);
            System.out.println(" Database connection established to " + url+ ".");

            return con;
        } catch (java.sql.SQLException e) {
            System.out.println(" Connection couldn't be established to "+ url);
            throw (e);
        }
    }
    public static String Stringfilter(String txt){
        StringBuffer temp = new StringBuffer(txt.length());
        char c;
        for(int i=0;i<txt.length();i++){
            c=txt.charAt(i);
            if(c=='<') temp.append("&lt;");
            else if(c=='>') temp.append("&gt;");
            else if(c=='\'') temp.append("&#039;");
            else if(c=='"') temp.append("&quot;");
            else if(c=='&') temp.append("&amp;");
            else if(c=='\\') temp.append("&#92;");
            else if(c=='\'') temp.append("&#039;");
            //else if(c=="'") temp.append("''");
            else temp.append(c);
        }
        return temp.toString();
    }
    
    public String StringNull(String txt){
        String aa="";
        if(txt==null){
                aa="";
        }
        else{
            aa = txt;
        }
        return aa;
    }
    public String DateFormatDB2Show(String txt, String format) throws Exception  {
        String aa="", year="", month="", day="", date="";
        if(txt.length()>=10){
            date = txt.substring(0, 10);
            year = date.substring(0, 4);
            month = date.substring(5, 7);
            day = date.substring(date.length()-2, date.length());
            if(format.equals("ddMMyyyy")){
                aa = day+"-"+month+"-"+year;
            }
            else if(format.equals("ddMMyy")){
                //year = String.valueOf(Integer.parseInt(year)+543).substring(2, 4);
                year = year.substring(2, 4);
                aa = day+"-"+month+"-"+year;
            }
        }
        else{
            aa=txt;
        }
        return aa;
    }
    public String DateFormatShow2DB(String txt, String format) throws Exception{
        String aa="", year="", month="", day="";
        if(txt.length()>=10){
            if(format.equals("ddMMyyyy")){
                day = txt.substring(0, 2);
                month = txt.substring(3, 5);
                year = txt.substring(txt.length()-4, txt.length());
            }
            aa = year+"-"+month+"-"+day;
        }
        else{
            aa=txt;
        }
        return aa;
    }
    public String CboTime(){
        String txt="";
        for(Integer i=0;i<=2359;i++){
            txt += "<option value='"+i.toString()+"' >"+i.toString()+"</option>";
        }
        return txt;
    }
    public String getComboStringency(){
        String txt="";
        txt += "<option value='1' >ปกติ ตามคิว</option>";
        txt += "<option value='2' >ด่วน</option>";
        txt += "<option value='3' >ด่วนมาก</option>";
        txt += "<option value='4' >ด่วนที่สุด</option>";
        txt += "<option value='5' >ทันที</option>";
        return txt;
    }
    public String getComboPeriod(String selected){
        String txt="", select="";
        if(selected.equals("1")){
            select="selected";
        }
        txt += "<option value='1' "+select+">งวดต้นเดือน</option>";
        select="";
        if(selected.equals("2")){
            select="selected";
        }
        txt += "<option value='2' "+select+">งวดกลางเดือน</option>";
        select="";
        return txt;
    }
    public String getComboMonth(String selected){
        String aa="", select="";
        if(selected.equals("01")){
            select="selected";
        }
        aa += "<option value='01' "+select+">มกราคม</option>";
        select="";
        if(selected.equals("02")){
            select="selected";
        }
        aa += "<option value='02' "+select+">กุมภาพันธ์</option>";
        select="";
        if(selected.equals("03")){
            select="selected";
        }
        aa += "<option value='03' "+select+">มีนาคม</option>";
        select="";
        if(selected.equals("04")){
            select="selected";
        }
        aa += "<option value='04' "+select+">เมษายน</option>";
        select="";
        if(selected.equals("05")){
            select="selected";
        }
        aa += "<option value='05' "+select+">พฤษภาคม</option>";
        select="";
        if(selected.equals("06")){
            select="selected";
        }
        aa += "<option value='06' "+select+">มิถุนายน</option>";
        select="";
        if(selected.equals("07")){
            select="selected";
        }
        aa += "<option value='07' "+select+">กรกฏาคม</option>";
        if(selected.equals("08")){
            select="selected";
        }
        aa += "<option value='08' "+select+">สิงหาคม</option>";
        select="";
        if(selected.equals("09")){
            select="selected";
        }
        aa += "<option value='09' "+select+">กันยายน</option>";
        select="";
        if(selected.equals("10")){
            select="selected";
        }
        aa += "<option value='10' "+select+">ตุลาคม</option>";
        select="";
        if(selected.equals("11")){
            select="selected";
        }
        aa += "<option value='11' "+select+">พฤศจิกายน</option>";
        select="";
        if(selected.equals("12")){
            select="selected";
        }
        aa += "<option value='12' "+select+">ธันวาคม</option>";
        return aa;
    }
    public String getComboYear(String selected){
        String aa="", select="";
        Integer year = Integer.parseInt(getDate("yyyy"));

        for(Integer i=year;i>=year-4;i--){
            select="";
            if(selected.equals(i.toString())){
                select="selected";
            }
            aa += "<option value='"+i.toString()+"' "+select+">"+i.toString()+"</option>";
        }
        return aa;
    }
    public String getComboBranch(String selected) throws Exception{        
        String sql="", txt="", select="";
        Vector v_branch = new Vector();
        v_branch = getBranch();
        BBranch branch = new BBranch();
        for(int i=0;i<=v_branch.size()-1;i++){
            branch = (BBranch)v_branch.get(i);
            if(branch.getBranchId().equals(selected)){
                txt += "<option value='"+branch.getBranchId()+"' selected>"+branch.getBranchNamet()+"</option>";
            }
            else{
                txt += "<option value='"+branch.getBranchId()+"' >"+branch.getBranchNamet()+"</option>";
            }
        }
//        Connection conn = getConnectionBangna();
//        Statement st;
//        ResultSet rs;
//        sql="Select branch_namet as col1, branch_id as id From b_branch ";
//        st = conn.createStatement();
//        rs = st.executeQuery(sql);
//        while (rs.next()) {
//            select="";
//            if(selected.equals(rs.getString("id"))){
//                select="selected";
//            }
//            //acombo.addItem(rs.getString("col1"));
//            txt += "<option value='"+rs.getString("id")+"' "+select+">"+rs.getString("col1")+"</option>";
//        }
//        rs.close();
//        conn.close();
        return txt;
    }
    public Vector getBranch() throws Exception{
        String sql="", txt="", select="";
        Connection conn = getConnectionBangna();
        Vector v_branch = new Vector();
        BBranch branch = new BBranch();
        Statement st;
        ResultSet rs;
        sql="Select "+branch.getFBranchNamet()+", "+branch.getFBranchId()+" From "+branch.getBBranch();
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            branch = new BBranch();
            branch.setBranchId(rs.getString(branch.getFBranchId()));
            branch.setBranchNamet(rs.getString(branch.getFBranchNamet()));
            v_branch.add(branch);
        }
        rs.close();
        conn.close();
        return v_branch;
    }
    public String getDate(String format){
        java.util.Date date1 = new java.util.Date();
        Format formatter = new SimpleDateFormat(format);
        String s = formatter.format(date1);
        String date_current="",year="";
        if(format.equals("yyyyMMdd")){
            year = s.substring(0, 4);
//            s = String.valueOf(Integer.parseInt(year)-543)+"-"+s.substring(4, 6)+"-"+s.substring(s.length()-2, s.length());
            s = String.valueOf(year)+"-"+s.substring(4, 6)+"-"+s.substring(s.length()-2, s.length());
        }
        else if(format.equals("ddMMyyyy")){
            year = s.substring(s.length()-4, s.length());
//            s = s.substring(0, 2)+"-"+s.substring(2, 4)+"-"+String.valueOf(Integer.parseInt(year)-543);
            s = s.substring(0, 2)+"-"+s.substring(2, 4)+"-"+String.valueOf(year);
        }
        return s;
    }
//    public java.util.Date getDateCurrent(){
//        java.util.Date date1 = new java.util.Date();
//        Format formatter = new SimpleDateFormat(format);
//        String s = formatter.format(date1);
//        return s;
//    }
    public String getMonthEndDay(String year, String month){
        String daymonth="";
        if(month.equals("01")){
            daymonth="31";
        }
        else if(month.equals("02")){
            daymonth="28";
        }
        else if(month.equals("03")){
            daymonth="31";
        }
        else if(month.equals("04")){
            daymonth="30";
        }
        else if(month.equals("05")){
            daymonth="31";
        }
        else if(month.equals("06")){
            daymonth="30";
        }
        else if(month.equals("07")){
            daymonth="31";
        }
        else if(month.equals("08")){
            daymonth="31";
        }
        else if(month.equals("09")){
            daymonth="30";
        }
        else if(month.equals("10")){
            daymonth="31";
        }
        else if(month.equals("11")){
            daymonth="30";
        }
        else if(month.equals("12")){
            daymonth="31";
        }
        return  daymonth;
    }
    public String getPeriodNamet(String period, String flag){
        String txt="";
        if(flag.equals("name_id")){
            if(period.equals("งวดต้นเดือน")){
                txt = "1";
            }
            else{
                txt = "2";
            }
        }
        else{
            if(period.equals("1")){
                txt = "งวดต้นเดือน";
            }
            else{
                txt = "งวดกลางเดือน";
            }
        }
        return txt;
    }
    public String getMonthNamet(String monthName, String aFlag){
        String month="";
        if(aFlag.equals("name_id")){
            if(monthName.equals("มกราคม")){
                month="01";
            }
            else if(monthName.equals("กุมภาพันธ์")){
                month="02";
            }
            else if(monthName.equals("มีนาคม")){
                month="03";
            }
            else if(monthName.equals("เมษายน")){
                month="04";
            }
            else if(monthName.equals("พฤษภาคม")){
                month="05";
            }
            else if(monthName.equals("มิถุนายน")){
                month="06";
            }
            else if(monthName.equals("กรกฏาคม")){
                month="07";
            }
            else if(monthName.equals("สิงหาคม")){
                month="08";
            }
            else if(monthName.equals("กันยายน")){
                month="09";
            }
            else if(monthName.equals("ตุลาคม")){
                month="10";
            }
            else if(monthName.equals("พฤศจิกายน")){
                month="11";
            }
            else if(monthName.equals("ธันวาคม")){
                month="12";
            }
            else{
                month="01";
            }
        }
        else {
            if(monthName.equals("01")){
                month="มกราคม";
            }
            else if(monthName.equals("02")){
                month="กุมภาพันธ์";
            }
            else if(monthName.equals("03")){
                month="มีนาคม";
            }
            else if(monthName.equals("04")){
                month="เมษายน";
            }
            else if(monthName.equals("05")){
                month="พฤษภาคม";
            }
            else if(monthName.equals("06")){
                month="มิถุนายน";
            }
            else if(monthName.equals("07")){
                month="กรกฏาคม";
            }
            else if(monthName.equals("08")){
                month="สิงหาคม";
            }
            else if(monthName.equals("09")){
                month="กันยายน";
            }
            else if(monthName.equals("10")){
                month="ตุลาคม";
            }
            else if(monthName.equals("11")){
                month="พฤศจิกายน";
            }
            else if(monthName.equals("12")){
                month="ธันวาคม";
            }
            else{
                month="01";
            }
        }

        return month;
    }
    public Patient getPatientFullNamet(String branch_id, String patient_hn_no, String flag){
        String sql="", patient_full_namet="";
        Connection conn;
        Patient patient = new Patient();
        try {
            //conn = getConnectionBangna();
            conn = getConnectionMainHIS(branch_id);
            Statement st;
            ResultSet rs;
            //sql="Select branch_namet as col1, branch_id as id From b_branch ";
            sql="Select pm02.mnc_pfix_dsc, pm01.mnc_fname_t,pm01.mnc_lname_t, "
                +"pm01.mnc_id_no, pm01.mnc_sex, pm01.mnc_bday,datediff(year,pm01.mnc_bday,getdate()) as age, "
                +"isnull(pm01.mnc_nat_cd,'') as mnc_nat_cd, isnull(pm01.mnc_blo_grp,'') as mnc_blo_grp, "
                +"isnull(pm01.mnc_blo_grp,'') as mnc_blo_grp, isnull(pm01.mnc_dom_chw,'') as mnc_dom_chw, "
                +"pm01.mnc_cur_add, pm01.mnc_cur_tel, pm01.mnc_cur_poc, "
                +"pm08.MNC_AMP_DSC, pm07.MNC_TUM_DSC, pm09.MNC_CHW_DSC "
                +"From patient_m01 pm01 inner join patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                +"left join patient_m08 pm08 on pm01.MNC_CUR_AMP = pm08.MNC_AMP_CD "
                +"left join patient_m07 pm07 on pm01.MNC_CUR_TUM = pm07.MNC_TUM_CD "
                +"left join patient_m09 pm09 on pm01.MNC_CUR_CHW = pm09.MNC_CHW_CD "
                +"Where pm01.mnc_hn_no = '"+patient_hn_no+"'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                //acombo.addItem(rs.getString("col1"));
                patient.setPatientNamet(rs.getString("mnc_fname_t"));
                patient.setPatientLastNamet(rs.getString("mnc_lname_t"));
                if(rs.getString("mnc_pfix_dsc").equals("นาย")){
                    patient.setPatientPrefix("003");
                }
                else if(rs.getString("mnc_pfix_dsc").equals("นาง")){
                    patient.setPatientPrefix("005");
                }
                else if(rs.getString("mnc_pfix_dsc").equals("นางสาว")){
                    patient.setPatientPrefix("004");
                }
                else{
                    patient.setPatientPrefix("000");
                }
                
                patient.setPatientId(rs.getString("mnc_id_no"));
                if(rs.getString("mnc_sex").equals("M")){
                    patient.setPatientSex("1");
                }
                else{
                    patient.setPatientSex("2");
                }
                patient.setPatientBirthday(DateFormatDB2Show(rs.getString("mnc_bday"),"ddMMyyyy"));
                patient.setPatientAge(rs.getString("age"));
                if(rs.getString("mnc_nat_cd").equals("10")){
                    patient.setPatientNationId("99");
                }
                else{
                    patient.setPatientNationId("99");
                }
                patient.setPatientChangwat(rs.getString("mnc_dom_chw"));


            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patient;
    }
    public String getPatientFullNamet(String branch_id, String patient_hn_no){
        String sql="", patient_full_namet="";
        Connection conn;
        try {
            //conn = getConnectionBangna();
            conn = getConnectionMainHIS(branch_id);
            Statement st;
            ResultSet rs;
            //sql="Select branch_namet as col1, branch_id as id From b_branch ";
            sql="Select pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' ' + pm01.mnc_lname_t as fullnamet "
                +"From patient_m01 pm01 inner join patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                +"Where pm01.mnc_hn_no = '"+patient_hn_no+"'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                //acombo.addItem(rs.getString("col1"));
                patient_full_namet = rs.getString("fullnamet");
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return patient_full_namet;
    }
    public String getEmployeeFullNamet(String branch_id, String employee_hn_no){
        String sql="", employee_full_namet="";
        Connection conn;
        try {
            //conn = getConnectionBangna();
            conn = getConnectionMainHIS(branch_id);
            Statement st;
            ResultSet rs;
            //sql="Select branch_namet as col1, branch_id as id From b_branch ";
            sql="Select mnc_hr_no, mnc_hr_fname_t + ' ' + mnc_hr_lname_t as fullname "
                +"From human_m01 "
                +"Where mnc_hr_no = '"+employee_hn_no+"' "
                +"Order by mnc_hr_fname_t, mnc_hr_lname_t";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                //acombo.addItem(rs.getString("col1"));
                employee_full_namet = rs.getString("fullname");
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return employee_full_namet;
    }
    public Doctor getDoctorFullNamet(String branch_id,String doctor_id) {
        String sql="", patient_full_namet="";
        Connection conn;
        Vector v_doctor = new Vector();
        Doctor doctor = new Doctor();
        try {
            //conn = getConnectionBangna();
            conn = getConnectionMainHIS(branch_id);
            Statement st;
            ResultSet rs;
            //sql="Select branch_namet as col1, branch_id as id From b_branch ";
            sql="Select mnc_dot_cd,pm02.mnc_pfix_dsc, pm26.mnc_dot_fname, pm26.mnc_dot_lname,  "
                +"pm26.mnc_dot_fname_e,pm26.mnc_dot_lname_e"
                +"From patient_m26 pm26 inner join patient_m02 pm02 on pm26.mnc_dot_pfix = pm02.mnc_pfix_cd "
                +"Where pm26.mnc_dot_cd = '"+doctor_id+"'";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                doctor = new Doctor();
                doctor.setDoctorId(rs.getString("mnc_dot_cd"));
                doctor.setDoctorNamet(rs.getString("mnc_dot_fname"));
                doctor.setDoctorLastNamet(rs.getString("mnc_dot_lname"));
                doctor.setDoctorNamee(rs.getString("mnc_dot_fname_e"));
                doctor.setDoctorLastNamee(rs.getString("mnc_dot_lname_e"));
                doctor.setDoctorPrefix(rs.getString("mnc_pfix_dsc"));
//                v_doctor.add(doctor);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return doctor;
    }
    public Vector getDoctorFullNamet(String branch_id){
        String sql="", patient_full_namet="";
        Connection conn;
        Vector v_doctor = new Vector();
        Doctor doctor = new Doctor();
        try {
            //conn = getConnectionBangna();
            conn = getConnectionMainHIS(branch_id);
            Statement st;
            ResultSet rs;
            //sql="Select branch_namet as col1, branch_id as id From b_branch ";
            sql="Select mnc_dot_cd,pm02.mnc_pfix_dsc + ' ' + pm26.mnc_dot_fname + ' ' + pm26.mnc_dot_lname as fullnamet "
                +"From patient_m26 pm26 inner join patient_m02 pm02 on pm26.mnc_dot_pfix = pm02.mnc_pfix_cd";
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()) {
                doctor = new Doctor();
                doctor.setDoctorId(rs.getString("mnc_dot_cd"));
                doctor.setDoctorNamet(rs.getString("fullnamet"));
                v_doctor.add(doctor);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_doctor;
    }
    public String getTRDoctorFullNamet(String branch_id, String selected){
        String sql="", txt="", select="";
        Vector v_doctor;
        Doctor doctor = new Doctor();
        v_doctor = getDoctorFullNamet(branch_id);
        txt += "<option value='' ></option>";
        for(int i=0;i<=v_doctor.size()-1;i++){
            doctor = new Doctor();
            doctor = (Doctor)v_doctor.get(i);
            select="";
            if(select.equals(doctor.getDoctorId())){
                select="selected";
            }
            //acombo.addItem(rs.getString("col1"));
            txt += "<option value='"+doctor.getDoctorId()+"' "+select+">"+doctor.getDoctorNamet()+"</option>";
        }

        return txt;
    }
    public String CboWard(String branch_id, String selected){
        String txt="",sql="";
        Vector v_ward = new Vector();
        Ward ward = new Ward();
        v_ward = getWard(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_ward.size()-1;i++) {
            ward = (Ward) v_ward.get(i);
            if(ward.getWardId().equals(selected)){
                txt += "<option value='"+ward.getWardId()+"' selected>"+ward.getWardNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+ward.getWardId()+"' >"+ward.getWardNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getWard(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        Ward ward = new Ward();
        try {
            conn = getConnectionMainHIS(branch_id);
//            conn = getConnectionBangna();
            st = conn.createStatement();
//            sql = "Select department_id as no, department_namet as name "
//                    +"From b_department ";
            sql = "Select pm32.mnc_md_dep_no, pm32.mnc_md_dep_dsc "
                    +"From patient_m32  pm32 "
                    +"Where mnc_typ_pt = 'I' ";
            rs = st.executeQuery(sql);
            while(rs.next()){
                ward = new Ward();
                ward.setWardId(rs.getString("mnc_md_dep_no"));
                ward.setWardNamet(rs.getString("mnc_md_dep_dsc"));
                v_result.add(ward);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public Vector getEmployee(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        Employee employee = new Employee();
        try {
            conn = getConnectionMainHIS(branch_id);
//            conn = getConnectionBangna();
            st = conn.createStatement();
//            sql = "Select department_id as no, department_namet as name "
//                    +"From b_department ";
            sql = "Select mnc_hr_no, mnc_hr_fname_t + ' ' + mnc_hr_lname_t as fullname "
                    +"From human_m01 "                    
                    +"Order by mnc_hr_fname_t, mnc_hr_lname_t ";
            rs = st.executeQuery(sql);
            while(rs.next()){
                employee = new Employee();
                employee.setEmployeeId(rs.getString("mnc_hr_no"));
                employee.setEmployeeNamet(rs.getString("fullname"));
                v_result.add(employee);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboEmployee(String branch_id, String selected){
        String txt="",sql="";
        Vector v_employee = new Vector();
        Employee employee = new Employee();
        v_employee = getEmployee(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_employee.size()-1;i++) {
            employee = (Employee) v_employee.get(i);
            if(employee.getEmployeeId().equals(selected)){
                txt += "<option value='"+employee.getEmployeeId()+"' selected>"+employee.getEmployeeNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+employee.getEmployeeId()+"' >"+employee.getEmployeeNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getPharmacy(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        Item item = new Item();
        try {
            conn = getConnectionMainHIS(branch_id);
//            conn = getConnectionBangna();
            st = conn.createStatement();
//            sql = "Select department_id as no, department_namet as name "
//                    +"From b_department ";
            sql = "Select mnc_ph_cd, mnc_ph_tn "
                    +"From pharmacy_m01 "
                    +"Where mnc_ph_sts = 'Y' "
                    +"Order by mnc_ph_tn ";
            rs = st.executeQuery(sql);
            while(rs.next()){
                item = new Item();
                item.setItemId(rs.getString("mnc_ph_cd"));
                item.setCommonName(rs.getString("mnc_ph_tn"));
                v_result.add(item);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboPharmacy(String branch_id, String selected){
        String txt="",sql="";
        Vector v_item = new Vector();
        Item item = new Item();
        v_item = getPharmacy(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_item.size()-1;i++) {
            item = (Item) v_item.get(i);
            if(item.getItemId().equals(selected)){
                txt += "<option value='"+item.getItemId()+"' selected>"+item.getCommonName()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+item.getItemId()+"' >"+item.getCommonName()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getTypeFoods(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        TypeFoods typefoods = new TypeFoods();
        BItem b_item = new BItem();
        try {
//            conn = getConnectionMainHIS(branch_id);
            conn = getConnectionBangna();
            st = conn.createStatement();
//            sql = "Select department_id as no, department_namet as name "
//                    +"From b_department ";
//            sql = "Select mnc_sr_cd, mnc_sr_dsc, mnc_sr_pri "
//                    +"From patient_m30 "
//                    +"Where mnc_sr_dsc like '%อาหาร%' ";
            sql = "Select * From "+b_item.getBItem()+
                    " Where "+b_item.getFItemActive()+"='1' "+
                    "Order By "+b_item.getFItemNamet();
            rs = st.executeQuery(sql);
            while(rs.next()){
                typefoods = new TypeFoods();
                typefoods.setTypeFoodsId(rs.getString(b_item.getFBItemId()));
                typefoods.setTypeFoodsNamet(rs.getString(b_item.getFItemNamet()));
                typefoods.setFoodsPrice(rs.getString(b_item.getFItemPriceCost()));
                v_result.add(typefoods);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboFPatientPrefix(String branch_id, String selected){
        String txt="",sql="";
        Vector v_prefix = new Vector();
        FPatientPrefix prefix = new FPatientPrefix();
        v_prefix = getFPatientPrefix(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_prefix.size()-1;i++) {
            prefix = (FPatientPrefix) v_prefix.get(i);
            if(prefix.getFPatientPrefixId().equals(selected)){
                txt += "<option value='"+prefix.getFPatientPrefixId()+"' selected>"+prefix.getPatientPrefixDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+prefix.getFPatientPrefixId()+"' >"+prefix.getPatientPrefixDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getFPatientPrefix(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        FPatientPrefix prefix = new FPatientPrefix();
        try {
            conn = getConnectionBangna();
            st = conn.createStatement();
            sql = "Select "+prefix.getFFPatientPrefixId()+", "+prefix.getFPatientPrefixDescription()+", "+prefix.getFPatientPrefixDescriptione()+" "
                    +"From "+prefix.getFPatientPrefix()+" "
                    +"Where "+prefix.getFActive()+" = '1' and "+prefix.getFFTlockId()+" = '1'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                prefix = new FPatientPrefix();
                prefix.setFPatientPrefixId(rs.getString(prefix.getFFPatientPrefixId()));
                prefix.setPatientPrefixDescription(rs.getString(prefix.getFPatientPrefixDescription()));
                prefix.setPatientPrefixDescriptione(rs.getString(prefix.getFPatientPrefixDescriptione()));
                v_result.add(prefix);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public Vector getFoodsPeriod(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        FoodsPeriod foodsperiod = new FoodsPeriod();
        try {
            conn = getConnectionBangna();
//            conn = getConnectionBangna();
            st = conn.createStatement();
//            sql = "Select department_id as no, department_namet as name "
//                    +"From b_department ";
            sql = "Select foods_period_id, foods_period_namet "
                    +"From b_foods_period "
                    +"Where foods_period_active = '1'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                foodsperiod = new FoodsPeriod();
                foodsperiod.setFoodsPeriodId(rs.getString("foods_period_id"));
                foodsperiod.setFoodsPeriodNamet(rs.getString("foods_period_namet"));
                v_result.add(foodsperiod);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboTypeFoods(String branch_id, String selected){
        String txt="",sql="";
        Vector v_typefoods = new Vector();
        TypeFoods typefoods = new TypeFoods();
        v_typefoods = getTypeFoods(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_typefoods.size()-1;i++) {
            typefoods = (TypeFoods) v_typefoods.get(i);
            if(typefoods.getTypeFoodsId().equals(selected)) {
                txt += "<option value='"+typefoods.getTypeFoodsId()+"' selected>"+typefoods.getTypeFoodsNamet()+"["+typefoods.getFoodsPrice()+"]"+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else {
                txt += "<option value='"+typefoods.getTypeFoodsId()+"' >"+typefoods.getTypeFoodsNamet()+"["+typefoods.getFoodsPrice()+"]"+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4) {
                sql="";
            }
        }
        return txt;
    }
    public String CboFoodsPeriod(String branch_id, String selected){
        String txt="",sql="";
        Vector v_foodsperiod = new Vector();
        FoodsPeriod foodsperiod = new FoodsPeriod();
        v_foodsperiod = getFoodsPeriod(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_foodsperiod.size()-1;i++) {
            foodsperiod = (FoodsPeriod) v_foodsperiod.get(i);
            if(foodsperiod.getFoodsPeriodId().equals(selected)){
                txt += "<option value='"+foodsperiod.getFoodsPeriodId()+"' selected>"+foodsperiod.getFoodsPeriodNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+foodsperiod.getFoodsPeriodId()+"' >"+foodsperiod.getFoodsPeriodNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getPatientVisit(String branch_id, String visti_date, String dep_id){
        Vector v_patient_visit = new Vector();
        String time="", visit_date="";
        String sql="Select pt01.*, pm02.mnc_pfix_dsc+' '+pm01.mnc_fname_t +' '+ pm01.mnc_lname_t as patient_fullnamet, "
            +"pmm02.mnc_pfix_dsc+' ' +pm26.mnc_dot_fname +' '+pm26.mnc_dot_lname as doctor_fullnamet, "
            +"fm02.mnc_fn_typ_dsc "
            +"From patient_t01 pt01 inner join patient_m01 pm01 on pt01.mnc_hn_no = pm01.mnc_hn_no and "
            +"pt01.mnc_hn_yr = pm01.mnc_hn_yr inner join patient_m02 pm02 on "
            +"pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd inner join patient_m26 pm26 on "
            +"pt01.mnc_dot_cd = pm26.mnc_dot_cd inner join patient_m02 pmm02 on "
            +"pm26.mnc_dot_pfix = pmm02.mnc_pfix_cd inner join "
            +"finance_m02 fm02 on pt01.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
            +"Where pt01.mnc_date = '"+visti_date+"' and pt01.MNC_DEP_NO = '"
            +dep_id+"' and pt01.mnc_sts <> 'C' "
            +"Order By pt01.mnc_date, pt01.mnc_time ";
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        PatientVisit patient_visit = new PatientVisit();
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()) {
                time = "0000"+rsmainhis.getString("mnc_time");
                time = time.substring(time.length()-4, time.length());
                if(rsmainhis.getString("mnc_date").length()>=10){
                    visit_date = rsmainhis.getString("mnc_date").substring(0, 10);
                }
                else{
                    visit_date = rsmainhis.getString("mnc_date");
                }
                patient_visit = new PatientVisit();
                patient_visit.setPatientId(rsmainhis.getString("mnc_hn_no"));
                patient_visit.setPatientNamet(rsmainhis.getString("patient_fullnamet"));
                patient_visit.setVisitDate(visit_date);
                patient_visit.setVisitTime(time);
                patient_visit.setVisitVn(rsmainhis.getString("mnc_vn_no")+"."+rsmainhis.getString("mnc_vn_seq"));
                patient_visit.setVisitDoctorId(rsmainhis.getString("mnc_dot_cd"));
                patient_visit.setVisitDoctorNamet(rsmainhis.getString("doctor_fullnamet"));
                patient_visit.setVisitPaidId(rsmainhis.getString("mnc_fn_typ_cd"));
                patient_visit.setVisitPaidNamet(rsmainhis.getString("mnc_fn_typ_dsc"));
                patient_visit.setPatientHn(rsmainhis.getString("mnc_hn_no"));
                v_patient_visit.add(patient_visit);
            }
            rsmainhis.close();

            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_patient_visit;
    }
    public String CboPatientVisit(String branch_id, String visti_date, String dep_id, String patient_hn, String selected){
        String txt="",sql="";
        Vector v_vn = new Vector();
        PatientVisit patient_visit = new PatientVisit();
        v_vn = getPatientVisit(branch_id, visti_date, dep_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_vn.size()-1;i++) {
            patient_visit = (PatientVisit) v_vn.get(i);
            if(patient_visit.getPatientHn().equals(selected)){
                txt += "<option value='"+patient_visit.getPatientHn()+"' selected>"+patient_visit.getPatientNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+patient_visit.getPatientHn()+"' >"+patient_visit.getPatientNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public String CboPatientVisitShowVN(String branch_id, String visti_date, String dep_id, String patient_hn, String selected){
        String txt="",sql="";
        Vector v_vn = new Vector();
        PatientVisit patient_visit = new PatientVisit();
        v_vn = getPatientVisit(branch_id, visti_date, dep_id, patient_hn);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_vn.size()-1;i++) {
            patient_visit = (PatientVisit) v_vn.get(i);
            if(patient_visit.getVisitVn().equals(selected)){
                txt += "<option value='"+patient_visit.getVisitVn()+"' selected>"+patient_visit.getVisitVn()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+patient_visit.getVisitVn()+"' >"+patient_visit.getVisitVn()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public String CboChangwat(String selected){
        String txt="",sql="";
        Vector v_address = new Vector();
        FAddress address = new FAddress();
        v_address = getChangwat();
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_address.size()-1;i++) {
            address = (FAddress) v_address.get(i);
            if(address.getAddressChangwatId().equals(selected)){
                txt += "<option value='"+address.getAddressChangwatId()+"' selected>"+address.getAddressDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+address.getAddressChangwatId()+"' >"+address.getAddressDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getChangwat(){
        Vector v_address = new Vector();
        FAddress address = new FAddress();
        String time="";
        String sql="Select * "
            +"From "+address.getFAddress()+" Where "+address.getFAddressTambonType()+"='1'";
        Connection connbangna;
        Statement stmainhis;
        ResultSet rsmainhis;
        
        try {
            connbangna = getConnectionBangna();
            stmainhis = connbangna.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                address = new FAddress();
                address.setAddressChangwatId(rsmainhis.getString(address.getFAddressChangwatId()));
                address.setAddressDescription(rsmainhis.getString(address.getFAddressDescription()));
                v_address.add(address);
            }
            rsmainhis.close();

            connbangna.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_address;
    }
    public String CboReligionNamet(String selected){
        String txt="",sql="";
        Vector v_religion = new Vector();
        BReligion religion = new BReligion();
        v_religion = getReligionNamet();
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_religion.size()-1;i++) {
            religion = (BReligion) v_religion.get(i);
            if(religion.getReligionId().equals(selected)){
                txt += "<option value='"+religion.getReligionId()+"' selected>"+religion.getReligionNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+religion.getReligionId()+"' >"+religion.getReligionNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getReligionNamet(){
        Vector v_religion = new Vector();
        String time="";
        String sql="Select * "
            +"From b_religion ";
        Connection connbangna;
        Statement stmainhis;
        ResultSet rsmainhis;
        BReligion religion = new BReligion();
        try {
            connbangna = getConnectionBangna();
            stmainhis = connbangna.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                religion = new BReligion();
                religion.setReligionId(rsmainhis.getString(religion.getFReligionId()));
                religion.setReligionNamet(rsmainhis.getString(religion.getFReligionNamet()));
                v_religion.add(religion);
            }
            rsmainhis.close();

            connbangna.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_religion;
    }
    public String CboLab(String branch_id, String selected){
        String txt="",sql="";
        Vector v_lab = new Vector();
        Lab lab = new Lab();
        v_lab = getLab(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_lab.size()-1;i++) {
            lab = (Lab) v_lab.get(i);
            if(lab.getLabId().equals(selected)) {
                txt += "<option value='"+lab.getLabId()+"' selected>"+lab.getLabNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else {
                txt += "<option value='"+lab.getLabId()+"' >"+lab.getLabNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4) {
                sql="";
            }
        }
        return txt;
    }
    public Vector getLab(String branch_id){
        Vector v_claim = new Vector();
        String time="";
        String sql="Select * "
            +"From lab_m01 lb02 "
            +"Order By mnc_lb_dsc ";
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        Lab lab = new Lab();
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                lab = new Lab();
                lab.setLabId(rsmainhis.getString("mnc_lb_cd"));
                lab.setLabNamet(rsmainhis.getString("mnc_lb_dsc"));
                v_claim.add(lab);
            }
            rsmainhis.close();

            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_claim;
    }
    public String CboClaimNamet(String branch_id, String selected){
        String txt="",sql="";
        Vector v_claim = new Vector();
        Claim claim = new Claim();
        v_claim = getClaimNamet(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_claim.size()-1;i++) {
            claim = (Claim) v_claim.get(i);
            if(claim.getClaimId().equals(selected)){
                txt += "<option value='"+claim.getClaimId()+"' selected>"+claim.getClaimNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+claim.getClaimId()+"' >"+claim.getClaimNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Integer getDateDiff(String date_cal, String branch_id){
        //Vector v_claim = new Vector();
        Integer cur=0;
        String sql="Select datediff(day,'"+date_cal+"',getdate()) as cur From default_m01 Where mnc_ip_dsc = 'INFO11' ";
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                cur = Integer.parseInt(rsmainhis.getString("cur"));
            }
            rsmainhis.close();
            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cur;
    }
    public Vector getClaimNamet(String branch_id){
        Vector v_claim = new Vector();
        String time="";
        String sql="Select * "
            +"From finance_m02 fm02 ";
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        Claim claim = new Claim();
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                claim = new Claim();
                claim.setClaimId(rsmainhis.getString("mnc_fn_typ_cd"));
                claim.setClaimNamet(rsmainhis.getString("mnc_fn_typ_dsc"));
                v_claim.add(claim);
            }
            rsmainhis.close();

            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_claim;
    }
    public Vector getPatientVisit(String branch_id, String visti_date, String dep_id, String patient_hn){
        Vector v_patient_visit = new Vector();
        String time="";
        String sql="Select pt01.*, pm02.mnc_pfix_dsc,pm01.mnc_fname_t,pm01.mnc_lname_t, "
            +"pmm02.mnc_pfix_dsc,pm26.mnc_dot_fname,pm26.mnc_dot_lname, "
            +"fm02.mnc_fn_typ_dsc "
            +"From patient_t01 pt01 inner join patient_m01 pm01 on pt01.mnc_hn_no = pm01.mnc_hn_no and "
            +"pt01.mnc_hn_yr = pm01.mnc_hn_yr inner join patient_m02 pm02 on "
            +"pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd inner join patient_m26 pm26 on "
            +"pt01.mnc_dot_cd = pm26.mnc_dot_cd inner join patient_m02 pmm02 on "
            +"pm26.mnc_dot_pfix = pmm02.mnc_pfix_cd inner join "
            +"finance_m02 fm02 on pt01.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
            +"Where pt01.mnc_date = '"+visti_date+"' and pt01.mnc_hn_no = '"
            +patient_hn+"' and pt01.mnc_sts <> 'C' "
            +"Order By pt01.mnc_date, pt01.mnc_time ";
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        PatientVisit patient_visit = new PatientVisit();
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                
                patient_visit = new PatientVisit();
                patient_visit.setPatientId(rsmainhis.getString("mnc_hn_no"));
                patient_visit.setPatientNamet(rsmainhis.getString("mnc_fname_t"));
                patient_visit.setPatientLastNamet(rsmainhis.getString("mnc_lname_t"));
                patient_visit.setVisitDate(rsmainhis.getString("mnc_date"));
                patient_visit.setVisitTime(time);
                patient_visit.setVisitVn(rsmainhis.getString("mnc_vn_no")+"."+rsmainhis.getString("mnc_vn_seq"));
                patient_visit.setVisitDoctorId(rsmainhis.getString("mnc_dot_cd"));
                patient_visit.setVisitDoctorNamet(rsmainhis.getString("mnc_dot_fname"));
                patient_visit.setVisitPaidId(rsmainhis.getString("mnc_fn_typ_cd"));
                patient_visit.setVisitPaidNamet(rsmainhis.getString("mnc_fn_typ_dsc"));
                v_patient_visit.add(patient_visit);
            }
            rsmainhis.close();

            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_patient_visit;
    }
    public Vector getDoctorOrderLabByPatientHnNo(String branch_id, String visti_date, String doctor_id, String patient_hn_no){
        Vector v_doctor_order_lab = new Vector();
        String sql="SELECT lt02.mnc_lb_cd, lm01.mnc_lb_dsc, lt01.MNC_ORD_DOT, fm02.MNC_FN_STS, LAB_M02.MNC_LB_PRI, lt01.mnc_hn_no, lt02.mnc_lb_cos "
            +"FROM LAB_T01 lt01 INNER JOIN "
            +  "LAB_T02 lt02 ON lt01.MNC_REQ_YR = lt02.MNC_REQ_YR AND lt01.MNC_REQ_NO = lt02.MNC_REQ_NO AND "
            +  "lt01.MNC_REQ_DAT = lt02.MNC_REQ_DAT INNER JOIN "
            +  "LAB_M02 ON lt02.MNC_LB_CD = LAB_M02.MNC_LB_CD INNER JOIN "
            +  "FINANCE_M02 fm02 ON lt01.MNC_FN_TYP_CD = fm02.MNC_FN_TYP_CD inner join lab_m01 lm01 on "
            +  "lm01.mnc_lb_cd = lt02.mnc_lb_cd "
            + "WHERE (lt01.MNC_REQ_STS <> 'C') AND (lt01.MNC_REQ_DAT BETWEEN '"+visti_date+"' AND '"+visti_date+"') and "
            +"lt01.mnc_hn_no = '"+patient_hn_no+"' and lt01.mnc_dot_cd = '"+doctor_id+"' ";
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        DoctorOrderLab doctororderlab = new DoctorOrderLab();
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                doctororderlab = new DoctorOrderLab();
                doctororderlab.setDoctorId(rsmainhis.getString("mnc_dot_cd"));
                doctororderlab.setLabId(rsmainhis.getString("mnc_lb_cd"));
                doctororderlab.setLabNamet(rsmainhis.getString("mnc_lb_dsc"));
                doctororderlab.setPatientId(rsmainhis.getString("mnc_hn_no"));
                doctororderlab.setPriceCost(Double.parseDouble(rsmainhis.getString("mnc_lb_cos")));
                doctororderlab.setPriceSale(Double.parseDouble(rsmainhis.getString("MNC_LB_PRI")));
                doctororderlab.setOrderDate(visti_date);
                v_doctor_order_lab.add(doctororderlab);
            }
            rsmainhis.close();

            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_doctor_order_lab;
    }
    public Vector getPatientVisitPaid(String branch_id, String visit_date, String patient_hn_no, String vn_id){
        Vector v_patient_paid = new Vector();
        String vn_no="", vn_seq="", sql="";
        Integer i = vn_id.indexOf(".", 0);
        if(i>0){
            vn_no = vn_id.substring(0, i);
            vn_seq = vn_id.substring(i+1, vn_id.length());
            sql="Select pt01.mnc_hn_no,ft03.mnc_fn_typ_cd, sum(mnc_fn_pad) as paid, "
                +"fm02.mnc_fn_typ_dsc, sum(ft03.mnc_fn_amt) as mnc_fn_amt "
                +"From finance_t03 ft03 left join patient_t01 pt01 on ft03.mnc_hn_no = pt01.mnc_hn_no "
                +"and ft03.mnc_hn_yr = pt01.mnc_hn_yr and ft03.mnc_pre_no = pt01.mnc_pre_no "
                +"left join finance_m02 fm02 on ft03.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
                +"Where ft03.mnc_hn_no = '"+patient_hn_no+"' and ft03.mnc_date = '"+visit_date+"' and "
                +"pt01.mnc_vn_no = '"+vn_no+"' and pt01.mnc_vn_seq='"+vn_seq+"' "
                +"Group by pt01.mnc_hn_no,ft03.mnc_fn_typ_cd, fm02.mnc_fn_typ_dsc ";
        }
        else{
            sql="Select pt01.mnc_hn_no,ft03.mnc_fn_typ_cd, sum(mnc_fn_pad) as paid, "
                +"fm02.mnc_fn_typ_dsc, sum(ft03.mnc_fn_amt) as mnc_fn_amt "
                +"From finance_t03 ft03 left join patient_t01 pt01 on ft03.mnc_hn_no = pt01.mnc_hn_no "
                +"and ft03.mnc_hn_yr = pt01.mnc_hn_yr and ft03.mnc_pre_no = pt01.mnc_pre_no "
                +"left join finance_m02 fm02 on ft03.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
                +"Where ft03.mnc_hn_no = '"+patient_hn_no+"' and ft03.mnc_date = '"+visit_date+"' "
                +"Group by pt01.mnc_hn_no,ft03.mnc_fn_typ_cd, fm02.mnc_fn_typ_dsc ";
        }
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        PatientVisitPaid patientvisitpaid = new PatientVisitPaid();
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                patientvisitpaid = new PatientVisitPaid();
                patientvisitpaid.setPatientId(rsmainhis.getString("MNC_HN_NO"));
                patientvisitpaid.setPaidId(rsmainhis.getString("mnc_fn_typ_cd"));
                patientvisitpaid.setPaidNamet(rsmainhis.getString("mnc_fn_typ_dsc"));
//                patientvisitpaid.setPatientId(rsmainhis.getString("mnc_hn_no"));
                patientvisitpaid.setAmount(Double.parseDouble(rsmainhis.getString("mnc_fn_amt")));
                patientvisitpaid.setPaid(Double.parseDouble(rsmainhis.getString("paid")));                
                patientvisitpaid.setPaidDate(visit_date);
                v_patient_paid.add(patientvisitpaid);
            }
            rsmainhis.close();

            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_patient_paid;
    }
    
    public Vector getPatientVisitPaidByItem(String branch_id, String visit_date, String patient_hn_no, String vn_id){
        Vector v_patient_paid = new Vector();
        String vn_no="", vn_seq="";
        Integer i = vn_id.indexOf(".", 0);
        if(i>0){
            vn_no = vn_id.substring(0, i);
            vn_seq = vn_id.substring(i+1, vn_id.length());
        }
        String sql="Select pt01.mnc_hn_no,ft03.mnc_fn_cd, mnc_fn_pad as paid, "
                +"fm01.mnc_fn_dsct, ft03.mnc_fn_amt "
                +"From finance_t03 ft03 left join patient_t01 pt01 on ft03.mnc_hn_no = pt01.mnc_hn_no "
                +"and ft03.mnc_hn_yr = pt01.mnc_hn_yr and ft03.mnc_pre_no = pt01.mnc_pre_no "
                +"left join finance_m01 fm01 on ft03.mnc_fn_cd = fm01.mnc_fn_cd "
                +"Where ft03.mnc_hn_no = '"+patient_hn_no+"' and ft03.mnc_date = '"+visit_date+"' and "
                +"pt01.mnc_vn_no = '"+vn_no+"' and pt01.mnc_vn_seq='"+vn_seq+"' ";
        Connection connmainhis;
        Statement stmainhis;
        ResultSet rsmainhis;
        PatientVisitPaid patientvisitpaid = new PatientVisitPaid();
        try {
            connmainhis = getConnectionMainHIS(branch_id);
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                patientvisitpaid = new PatientVisitPaid();
                patientvisitpaid.setPatientId(rsmainhis.getString("MNC_HN_NO"));
                patientvisitpaid.setItemId(rsmainhis.getString("mnc_fn_cd"));
                patientvisitpaid.setItemNamet(rsmainhis.getString("mnc_fn_dsct"));
//                patientvisitpaid.setPatientId(rsmainhis.getString("mnc_hn_no"));
                patientvisitpaid.setAmount(Double.parseDouble(rsmainhis.getString("mnc_fn_amt")));
                patientvisitpaid.setPaid(Double.parseDouble(rsmainhis.getString("paid")));                
                patientvisitpaid.setPaidDate(visit_date);
                v_patient_paid.add(patientvisitpaid);
            }
            rsmainhis.close();

            connmainhis.close();
        }
        catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_patient_paid;
    }
    public Vector SearchPaitentinWard(String branch_id,String date_start, String ward1, String flag, String ward_no, String room_id, String bed_id){
        String sql="", txt="";
        String where="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
//        Ward ward = new Ward();
        PatientVisit patientvisit = new PatientVisit();
        try {
            conn = getConnectionMainHIS(branch_id);
            //conn = config1.getConnectionBangna();
            st = conn.createStatement();
            if(flag.equals("ward")){
                sql = "Select mnc_wd_no as no, pm32.mnc_md_dep_dsc as name "
                        +"From patient_t08 pt08  inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02  pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32  pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"Where mnc_ds_date is null "
                        +"Group by mnc_wd_no, pm32.mnc_md_dep_dsc ";
            }
            else if(flag.equals("ward_name")){
                sql = "Select mnc_wd_no as no, pm32.mnc_md_dep_dsc as name "
                        +"From patient_t08 pt08  inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02  pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32  pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"Where mnc_ds_date is null "
                        +"Group by mnc_wd_no, pm32.mnc_md_dep_dsc ";
            }
            else if (flag.equals("hnno")){
                if(ward_no.equals("")){
                    sql = "Select pt08.mnc_hn_no as no, mnc_ds_date, mnc_ds_lev, mnc_wd_no, "
                        +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
                        +"pm32.mnc_md_dep_dsc, pt08.mnc_fn_typ_cd, fm02.mnc_fn_typ_dsc "
                        +"From patient_t08  pt08 inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32 pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"left join finance_m02 fm02 on pt08.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
                        +"Where mnc_ds_date  is null ";
                }
                else {
                    
                    if(!room_id.equals("")){
                        where = " and mnc_rm_nam = '"+room_id+"' ";
                    }
                    if(!bed_id.equals("")){
                        where += " and mnc_bd_no = '"+bed_id+"' ";
                    }
                    if(!ward1.equals("")){
                        where += " and pt08.mnc_hn_no = '"+ward1+"' ";
                    }
                    sql = "Select pt08.mnc_hn_no as no, mnc_ds_date, mnc_ds_lev, mnc_wd_no, "
                        +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
                        +"pm32.mnc_md_dep_dsc, pt08.mnc_fn_typ_cd, fm02.mnc_fn_typ_dsc "
                        +"From patient_t08 pt08 inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32 pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"left join finance_m02 fm02 on pt08.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
                        +"Where mnc_ds_date is null and mnc_wd_no = '"+ward_no+"' "+where;
                }
            }
            else if(flag.equals("case_in_ward")){
                sql = "Select pt08.mnc_hn_no as no, mnc_ds_date, mnc_ds_lev, mnc_wd_no, "
                        +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
                        +"pm32.mnc_md_dep_dsc, pt08.mnc_fn_typ_cd, fm02.mnc_fn_typ_dsc "
                        +"From patient_t08  pt08 inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32 pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"left join finance_m02 fm02 on pt08.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
                        +"Where pt08.mnc_ds_date is null ";
            }
            else if(flag.equals("case_old")){
                sql = "Select pt08.mnc_hn_no as no, mnc_ds_date, mnc_ds_lev, mnc_wd_no, "
                        +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
                        +"pm32.mnc_md_dep_dsc, pt08.mnc_fn_typ_cd, fm02.mnc_fn_typ_dsc "
                        +"From patient_t08  pt08 inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32 pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"left join finance_m02 fm02 on pt08.mnc_fn_typ_cd = fm02.mnc_fn_typ_cd "
                        +"Where pt08.mnc_ad_date >= '"+date_start+"' and '"+date_start+"' <= pt08.mnc_ds_date or pt08.mnc_ds_date is null ";
            }
            rs = st.executeQuery(sql);
            while(rs.next()){
                patientvisit = new PatientVisit();
                patientvisit.setPatientId(rs.getString("no"));
                patientvisit.setPatientHn(rs.getString("no"));
                patientvisit.setPatientNamet(rs.getString("name"));
                patientvisit.setVisitPaidId(rs.getString("mnc_fn_typ_cd"));
                patientvisit.setVisitPaidNamet(rs.getString("mnc_fn_typ_dsc"));
                patientvisit.setVisitClinicId(rs.getString("mnc_wd_no"));
                patientvisit.setVisitClinicNamet(rs.getString("mnc_md_dep_dsc"));
                v_result.add(patientvisit);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboPatientinWard(String branch_id, String date_start, String flag, String selected, String ward_no, String room_id, String bed_id){
        String txt="",sql="";
        Vector v_paitent = new Vector();
        PatientVisit patientvisit = new PatientVisit();
        //Ward ward = new Ward();
        v_paitent = SearchPaitentinWard(branch_id,date_start,"",flag, ward_no, room_id, bed_id);
        for(int i=0;i<=v_paitent.size()-1;i++) {
            patientvisit = (PatientVisit) v_paitent.get(i);
            if(patientvisit.getPatientId().equals(selected)){
                txt += "<option value='"+patientvisit.getPatientId()+"' selected>"+patientvisit.getPatientNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+patientvisit.getPatientId()+"' >"+patientvisit.getPatientNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public String CboFSex(String branch_id, String selected){
        String txt="",sql="";
        Vector v_sex = new Vector();
        FSex sex = new FSex();
        v_sex = getFSex(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_sex.size()-1;i++) {
            sex = (FSex) v_sex.get(i);
            if(sex.getFSexId().equals(selected)){
                txt += "<option value='"+sex.getFSexId()+"' selected>"+sex.getSexDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+sex.getFSexId()+"' >"+sex.getSexDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getFSex(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        FSex sex = new FSex();
        try {
            conn = getConnectionBangna();
            st = conn.createStatement();
            sql = "Select "+sex.getFFSexId()+", "+sex.getFSexDescription()+" "
                    +"From "+sex.getFSex();
            rs = st.executeQuery(sql);
            while(rs.next()){
                sex = new FSex();
                sex.setFSexId(rs.getString(sex.getFFSexId()));
                sex.setSexDescription(rs.getString(sex.getFSexDescription()));
                v_result.add(sex);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboFPatientNation(String branch_id, String selected){
        String txt="",sql="";
        Vector v_nation = new Vector();
        FPatientNation nation = new FPatientNation();
        v_nation = getFPatientNation(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_nation.size()-1;i++) {
            nation = (FPatientNation) v_nation.get(i);
            if(nation.getFPatientNationId().equals(selected)){
                txt += "<option value='"+nation.getFPatientNationId()+"' selected>"+nation.getPatientNationDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+nation.getFPatientNationId()+"' >"+nation.getPatientNationDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getFPatientNation(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        FPatientNation nation = new FPatientNation();
        try {
            conn = getConnectionBangna();
            st = conn.createStatement();
            sql = "Select "+nation.getFFPatientNationId()+", "+nation.getFPatientNationDescription()+" "
                    +"From "+nation.getFPatientNation();
            rs = st.executeQuery(sql);
            while(rs.next()){
                nation = new FPatientNation();
                nation.setFPatientNationId(rs.getString(nation.getFFPatientNationId()));
                nation.setPatientNationDescription(rs.getString(nation.getFPatientNationDescription()));
                v_result.add(nation);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboFPatientMarriageStatus(String branch_id, String selected){
        String txt="",sql="";
        Vector v_marriage = new Vector();
        FPatientMarriageStatus marriage = new FPatientMarriageStatus();
        v_marriage = getFPatientMarriageStatus(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_marriage.size()-1;i++) {
            marriage = (FPatientMarriageStatus) v_marriage.get(i);
            if(marriage.getFPatientMarriageStatusId().equals(selected)){
                txt += "<option value='"+marriage.getFPatientMarriageStatusId()+"' selected>"+marriage.getPatientMarriageStatusDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+marriage.getFPatientMarriageStatusId()+"' >"+marriage.getPatientMarriageStatusDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getFPatientMarriageStatus(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        FPatientMarriageStatus marriage = new FPatientMarriageStatus();
        try {
            conn = getConnectionBangna();
            st = conn.createStatement();
            sql = "Select "+marriage.getFFPatientMarriageStatusId()+", "+marriage.getFPatientMarriageStatusDescription()+" "
                    +"From "+marriage.getFPatientMarriageStatus();
            rs = st.executeQuery(sql);
            while(rs.next()){
                marriage = new FPatientMarriageStatus();
                marriage.setFPatientMarriageStatusId(rs.getString(marriage.getFFPatientMarriageStatusId()));
                marriage.setPatientMarriageStatusDescription(rs.getString(marriage.getFPatientMarriageStatusDescription()));
                v_result.add(marriage);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboFPatienBloodGroup(String branch_id, String selected) {
        String txt="",sql="";
        Vector v_bloodgroup = new Vector();
        FPatientBloodGroup bloodgroup = new FPatientBloodGroup();
        v_bloodgroup = getFPatienBloodGroup(branch_id);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_bloodgroup.size()-1;i++) {
            bloodgroup = (FPatientBloodGroup) v_bloodgroup.get(i);
            if(bloodgroup.getFPatientBloodGroupId().equals(selected)){
                txt += "<option value='"+bloodgroup.getFPatientBloodGroupId()+"' selected>"+bloodgroup.getPatientBloodGroupDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+bloodgroup.getFPatientBloodGroupId()+"' >"+bloodgroup.getPatientBloodGroupDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getFPatienBloodGroup(String branch_id){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        FPatientBloodGroup bloodgroup = new FPatientBloodGroup();
        try {
            conn = getConnectionHospital(branch_id);
            st = conn.createStatement();
            sql = "Select "+bloodgroup.getFFPatientBloodGroupId()+", "+bloodgroup.getFPatientBloodGroupDescription()+" "
                    +"From "+bloodgroup.getFPatientBloodGroup();
            rs = st.executeQuery(sql);
            while(rs.next()){
                bloodgroup = new FPatientBloodGroup();
                bloodgroup.setFPatientBloodGroupId(rs.getString(bloodgroup.getFFPatientBloodGroupId()));
                bloodgroup.setPatientBloodGroupDescription(rs.getString(bloodgroup.getFPatientBloodGroupDescription()));
                v_result.add(bloodgroup);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String StringFormat(String text,String formater) {
        String format="";
        try{
            format = text;
            if(formater.equals("number")) {
                NumberFormat formatter = new DecimalFormat("#,###,###.##");
                format = formatter.format(text);
            }
            else if(formater.equals("integer")) {
                NumberFormat formatter = new DecimalFormat("#,###,###");
                format = formatter.format(text);
            }
        }
        catch(Exception ex){
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return format;
    }
    public String CboFAddress(String branch_id, String flag, String selected){
        String txt="",sql="";
        Vector v_address = new Vector();
        FAddress address = new FAddress();
        v_address = getFAddress(branch_id,flag);
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_address.size()-1;i++) {
            address = (FAddress) v_address.get(i);
            if(address.getFAddressId().equals(selected)){
                txt += "<option value='"+address.getFAddressId()+"' selected>"+address.getAddressDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+address.getFAddressId()+"' >"+address.getAddressDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getFAddress(String branch_id, String flag){
        String sql="", txt="";
        Vector v_address = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        FAddress address = new FAddress();
        try {
//            conn = getConnectionHospital("103004");
            conn = getConnectionBangna();
            st = conn.createStatement();
            sql = "Select * "
                    +"From "+address.getFAddress()+" "
                    +"Where "+address.getFAddressTambonType()+"='"+flag+"'";
            rs = st.executeQuery(sql);
            while(rs.next()){
                address = new FAddress();
                address.setFAddressId(rs.getString(address.getFFAddressId()));
                address.setAddressAmphurId(rs.getString(address.getFAddressAmphurId()));
                address.setAddressChangwatId(rs.getString(address.getFAddressChangwatId()));
                address.setAddressDescription(rs.getString(address.getFAddressDescription()));
                address.setAddressDescriptione(rs.getString(address.getFAddressDescriptione()));

                address.setAddressRegion(rs.getString(address.getFAddressRegion()));
                address.setAddressTambonType(rs.getString(address.getFAddressTambonType()));
                v_address.add(address);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_address;
    }
    public String setSaveFAddress(Vector item, String flagpage) throws Exception {
        int chk=0;
        String sql="", max="", dental_date="";
        FAddress address = new FAddress();
        Connection conn;
        Statement st;
        try {
            conn = getConnectionBangna();
            st = conn.createStatement();
//            address = getDentalDailyByPK(item.getDentalDailyId());
            for(int i=0;i<=item.size()-1;i++){
                address = (FAddress)item.get(i);
                address.setAddressDescription(address.getAddressDescription().replace("'", "''"));
                address.setAddressDescriptione(address.getAddressDescriptione().replace("'", "''"));
    //            dental_date=config1.DateFormatShow2DB(item.getDentalDate(), "ddMMyyyy");

                if(!address.getFAddressId().equals("")){
    //                max = getMaxRowDentalDaily(conn);
                    sql="Insert Into "+address.getFAddress()+"("
                            +address.getFAddressAmphurId()+", "+address.getFAddressChangwatId()+", "
                            +address.getFAddressDescription()+","+ address.getFAddressDescriptione()+","
                            +address.getFFAddressId()+","+ address.getFAddressRegion()+","
                            +address.getFAddressTambonType()+") "
                            +"Values('"+address.getAddressAmphurId()+"','"+address.getAddressChangwatId() + "','"
                            +address.getAddressDescription()+"','"+address.getAddressDescriptione() + "','"
                            +address.getFAddressId()+"','"+address.getAddressRegion() + "','"
                            +address.getAddressTambonType()+"') ";
                }
                chk = st.executeUpdate(sql);

            }
            
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
}
