/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pop
 */
public class NurseTWoundCareDB {
    Config1 config1 = new Config1();
    NurseTWoundCare nursewoundcare = new NurseTWoundCare();
    NurseTWoundCareDetail nursewoundcaredetail = new NurseTWoundCareDetail();
    public String getMaxRowWoundCare(){
        String sql="", max="";
        try {
            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+nursewoundcare.WoundCareId()+") as cnt From "+nursewoundcare.NurseTWoundCare();
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
            if(max!=null){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "10900001";
            }
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String getMaxRowWoundCareDetail(){
        String sql="", max="";
        try {
            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+nursewoundcaredetail.WoundCareDetailId()+") as cnt From "
                    +nursewoundcaredetail.NurseTWoundCareDetail();
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
            if(max!=null){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "11000001";
            }
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String getMaxRunningDocNo(){
        String running="",sql="", year="", month="", max="", month_doc="";
        sql = "";
        try {
            java.util.Date date = new java.util.Date();
            month = config1.getDate("MM");
            year = config1.getDate("yyyy");
            year = year.substring(year.length()-2, year.length());
            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+nursewoundcare.WoundCareRunningDocNo()+") as cnt From "
                    +nursewoundcare.NurseTWoundCare();
            rs = st.executeQuery(sql);
            while(rs.next()){
                running = rs.getString("cnt");
            }
            rs.close();
            if(running!=null){
                max = "0000"+(Integer.parseInt(running.substring(running.length()-4, running.length()))+1);
                max = max.substring(max.length()-4,max.length());
                month_doc = running.substring(2, 4);
                if(month_doc.equals(month)){
                    running =  year+month+ max;
                }
                else{
                    running =  year+month+"0001";
                }
            }
            else{
                sql = config1.getDate("ddMMyy");
                if(sql.length()>=6){
                    year = sql.substring(sql.length()-2, sql.length());
                    month = sql.substring(2, 4);
                }
                running = year+month+"0001";
            }
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return running;
    }
    public Vector getNurseTWoundCare(String awhere, String field){
        Connection conn;
        Vector v_nurse_t_wound_care = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            nursewoundcare = new NurseTWoundCare();
            String sql="";
            if(field.equals("hn_no")){
                sql="Select wc.* "
                    +"From "+nursewoundcare.NurseTWoundCare()+" as wc left join "
                    +nursewoundcaredetail.NurseTWoundCareDetail()+" as wcd on "
                    +"wc."+nursewoundcare.WoundCareId() + " = wcd." + nursewoundcaredetail.WoundCareId() + " "
                    +"Where wc."+nursewoundcare.PatientHnNo()+" = '"+awhere+"' "
                    +"Order By wc."+nursewoundcare.WoundCareRunningDocNo()+" desc";
            }
            else if(field.equals("wound_care_id")){
                sql="Select wc.*,  "
                    +"From "+nursewoundcare.NurseTWoundCare()+" as nr left join "
                    +nursewoundcaredetail.NurseTWoundCareDetail()+" as wcd on "
                    +"wc."+nursewoundcare.WoundCareId() + " = wcd." + nursewoundcaredetail.WoundCareId() + " "
                    +"Where wc."+nursewoundcare.WoundCareId()+" = '"+awhere+"' "
                    +"Order By wc."+nursewoundcare.WoundCareRunningDocNo()+" desc";
            }
            else if(field.equals("hn_no_groupby_hn_no")){
                sql="Select wc.* "
                    +"From "+nursewoundcare.NurseTWoundCare()+" as wc "
                    +"Where wc."+nursewoundcare.PatientHnNo()+" = '"+awhere+"' "
                    +"Order By wc."+nursewoundcare.WoundCareRunningDocNo()+" desc";
            }
            
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                nursewoundcare = new NurseTWoundCare();
                nursewoundcare.setPatientHnNo(config1.StringNull(rs.getString(nursewoundcare.PatientHnNo())));
                nursewoundcare.setWoundCareId(config1.StringNull(rs.getString(nursewoundcare.WoundCareId())));
                nursewoundcare.setPatientAge(config1.StringNull(rs.getString(nursewoundcare.PatientAge())));
                nursewoundcare.setPatientFullNamet(config1.StringNull(rs.getString(nursewoundcare.PatientFullNameT())));
                nursewoundcare.setPatientAn(config1.StringNull(rs.getString(nursewoundcare.PatientAN())));

                nursewoundcare.setPatientPhoneNumber(config1.StringNull(rs.getString(nursewoundcare.PatientHnNo())));
                nursewoundcare.setPatientBedRoom(config1.StringNull(rs.getString(nursewoundcare.PatientBedRoom())));
                nursewoundcare.setWoundCareRunningDocNo(config1.StringNull(rs.getString(nursewoundcare.WoundCareRunningDocNo())));
                nursewoundcare.setWoundCause(config1.StringNull(rs.getString(nursewoundcare.WoundCause())));
                nursewoundcare.setWoundType(config1.StringNull(rs.getString(nursewoundcare.WoundType())));

                nursewoundcare.setWoundAppearance(config1.StringNull(rs.getString(nursewoundcare.WoundAppearance())));
                nursewoundcare.setWoundCategory(config1.StringNull(rs.getString(nursewoundcare.WoundCategory())));
                nursewoundcare.setWoundLocation(config1.StringNull(rs.getString(nursewoundcare.WoundLocation())));
                nursewoundcare.setWoundTreatmentCuredEstimate(config1.StringNull(rs.getString(nursewoundcare.WoundTreatmentCuredEstimate())));
                nursewoundcare.setWoundTreatmentCuredReal(config1.StringNull(rs.getString(nursewoundcare.WoundTreatmentCuredReal())));

                nursewoundcare.setNurseRemark(config1.StringNull(rs.getString(nursewoundcare.NurseRemark())));
                nursewoundcare.setWoundDescription(config1.StringNull(rs.getString(nursewoundcare.WoundDescription())));
                nursewoundcare.setWoundCareDateStart(config1.StringNull(rs.getString(nursewoundcare.WoundCareDateStart())));
                nursewoundcare.setWoundCareDateEnd(config1.StringNull(rs.getString(nursewoundcare.WoundCareDateEnd())));
                nursewoundcare.setWoundCareActive(config1.StringNull(rs.getString(nursewoundcare.WoundCareActive())));

                nursewoundcare.setWoundCareStatus(config1.StringNull(rs.getString(nursewoundcare.WoundCareStatus())));
                v_nurse_t_wound_care.add(nursewoundcare);
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_nurse_t_wound_care;
    }
    public Vector getNurseTWoundCareDetail(String awhere, String field){
        Connection conn;
        Vector v_nurse_t_wound_care_detail = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            nursewoundcaredetail = new NurseTWoundCareDetail();
            String sql="";
            if(field.equals("wound_care_detail_id")){
                sql="Select wc.*  "
                    +"From "+nursewoundcaredetail.NurseTWoundCareDetail()+" as wc "
                    +"Where wc."+nursewoundcaredetail.WoundCareDetailId()+" = '"+awhere+"' "
                    +"Order By wc."+nursewoundcaredetail.WoundCareDate()+" desc";
            }
            else if(field.equals("wound_care_id")){
                sql="Select wc.*  "
                    +"From "+nursewoundcaredetail.NurseTWoundCareDetail()+" as wc "
                    +"Where wc."+nursewoundcaredetail.WoundCareId()+" = '"+awhere+"' "
                    +"Order By wc."+nursewoundcaredetail.WoundCareDate()+" desc";
            }
            else if(field.equals("hn_no_groupby_hn_no")){
//                sql="Select wc.* "
//                    +"From "+nursewoundcaredetail.NurseTWoundCareDetail()+" as wc "
//                    +"Where wc."+nursewoundcaredetail.PatientHnNo()+" = '"+awhere+"' "
//                    +"Order By wc."+nursewoundcaredetail.WoundCareRunningDocNo()+" desc";
            }

            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                nursewoundcaredetail = new NurseTWoundCareDetail();
                nursewoundcaredetail.setWoundCareId(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareId())));
                nursewoundcaredetail.setWoundCareDetailId(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareDetailId())));
                nursewoundcaredetail.setDoctorDx(config1.StringNull(rs.getString(nursewoundcaredetail.DoctorDx())));
                nursewoundcaredetail.setWoundCareDate(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareDate())));
                nursewoundcaredetail.setWoundMethodCategory(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCategory())));

                nursewoundcaredetail.setWoundMethodCategoryDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCategoryDescription())));
                nursewoundcaredetail.setWoundMethodCareCategorySpecial(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCareCategorySpecial())));
                nursewoundcaredetail.setWoundMethodCareCategorySpecialDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCareCategorySpecialDescription())));
                nursewoundcaredetail.setWoundCareTime(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareTime())));
                nursewoundcaredetail.setWoundEstimateBeforeFlag(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlag())));

                nursewoundcaredetail.setWoundEstimateBeforeFlagDischargeDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlagDischargeDescription())));
                nursewoundcaredetail.setWoundEstimateBeforeFlagDischargeQuantity(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlagDischargeQuantity())));
                nursewoundcaredetail.setWoundEstimateBeforeFlagDischargeFeature(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlagDischargeFeature())));
                nursewoundcaredetail.setWoundEstimateBeforeCategory(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeCategory())));
                nursewoundcaredetail.setWoundEstimateBeforeCategoryOtherDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeCategoryOtherDescription())));

                nursewoundcaredetail.setWoundEstimateBeforeCategoryDimensionDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeCategoryDimensionDescription())));
                nursewoundcaredetail.setWoundEstimateAfterFlag(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateAfterFlag())));
                nursewoundcaredetail.setWoundEstimateAfterFlagSolve(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateAfterFlagSolve())));
                nursewoundcaredetail.setUserIdCreate(config1.StringNull(rs.getString(nursewoundcaredetail.UserIdCreate())));
                nursewoundcaredetail.setUserIdModify(config1.StringNull(rs.getString(nursewoundcaredetail.UserIdModify())));
                nursewoundcaredetail.setUserIdCancel(config1.StringNull(rs.getString(nursewoundcaredetail.UserIdCancel())));
                nursewoundcaredetail.setDateCreate(config1.StringNull(rs.getString(nursewoundcaredetail.DateCreate())));
                nursewoundcaredetail.setDateModify(config1.StringNull(rs.getString(nursewoundcaredetail.DateModify())));
                nursewoundcaredetail.setDateCancel(config1.StringNull(rs.getString(nursewoundcaredetail.DateCancel())));
                nursewoundcaredetail.setUserRemark(config1.StringNull(rs.getString(nursewoundcaredetail.UserRemark())));

                //nursewoundcaredetail.setUserRemark(config1.StringNull(rs.getString(nursewoundcaredetail.UserRemark())));
                v_nurse_t_wound_care_detail.add(nursewoundcaredetail);
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_nurse_t_wound_care_detail;
    }
    public NurseTWoundCare getNurseTWoundCareByPK(String wound_care_id){
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            nursewoundcare = new NurseTWoundCare();
            String sql="";
            sql="Select * "
                +"From "+nursewoundcare.NurseTWoundCare()+" as nr "
                +"Where "+nursewoundcare.WoundCareId()+" = '"+wound_care_id+"' "
                +"Order By "+nursewoundcare.WoundCareRunningDocNo()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                nursewoundcare = new NurseTWoundCare();
                nursewoundcare.setPatientHnNo(config1.StringNull(rs.getString(nursewoundcare.PatientHnNo())));
                nursewoundcare.setWoundCareId(config1.StringNull(rs.getString(nursewoundcare.WoundCareId())));
                nursewoundcare.setPatientAge(config1.StringNull(rs.getString(nursewoundcare.PatientAge())));
                nursewoundcare.setPatientFullNamet(config1.StringNull(rs.getString(nursewoundcare.PatientFullNameT())));
                nursewoundcare.setPatientAn(config1.StringNull(rs.getString(nursewoundcare.PatientAN())));

                nursewoundcare.setPatientPhoneNumber(config1.StringNull(rs.getString(nursewoundcare.PatientHnNo())));
                nursewoundcare.setPatientBedRoom(config1.StringNull(rs.getString(nursewoundcare.PatientBedRoom())));
                nursewoundcare.setWoundCareRunningDocNo(config1.StringNull(rs.getString(nursewoundcare.WoundCareRunningDocNo())));
                nursewoundcare.setWoundCause(config1.StringNull(rs.getString(nursewoundcare.WoundCause())));
                nursewoundcare.setWoundType(config1.StringNull(rs.getString(nursewoundcare.WoundType())));

                nursewoundcare.setWoundAppearance(config1.StringNull(rs.getString(nursewoundcare.WoundAppearance())));
                nursewoundcare.setWoundCategory(config1.StringNull(rs.getString(nursewoundcare.WoundCategory())));
                nursewoundcare.setWoundLocation(config1.StringNull(rs.getString(nursewoundcare.WoundLocation())));
                nursewoundcare.setWoundTreatmentCuredEstimate(config1.StringNull(rs.getString(nursewoundcare.WoundTreatmentCuredEstimate())));
                nursewoundcare.setWoundTreatmentCuredReal(config1.StringNull(rs.getString(nursewoundcare.WoundTreatmentCuredReal())));

                nursewoundcare.setNurseRemark(config1.StringNull(rs.getString(nursewoundcare.NurseRemark())));
                nursewoundcare.setWoundDescription(config1.StringNull(rs.getString(nursewoundcare.WoundDescription())));
                nursewoundcare.setWoundCareDateStart(config1.StringNull(rs.getString(nursewoundcare.WoundCareDateStart())));
                nursewoundcare.setWoundCareDateEnd(config1.StringNull(rs.getString(nursewoundcare.WoundCareDateEnd())));
                nursewoundcare.setWoundCareActive(config1.StringNull(rs.getString(nursewoundcare.WoundCareActive())));

                nursewoundcare.setWoundCareStatus(config1.StringNull(rs.getString(nursewoundcare.WoundCareStatus())));
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nursewoundcare;
    }
    public NurseTWoundCareDetail getNurseTWoundCareDetailByPK(String wound_care_detail_id){
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            nursewoundcaredetail = new NurseTWoundCareDetail();
            String sql="";
            sql="Select * "
                +"From "+nursewoundcaredetail.NurseTWoundCareDetail()+" as nr "
                +"Where "+nursewoundcaredetail.WoundCareDetailId()+" = '"+wound_care_detail_id+"' "
                +"Order By "+nursewoundcaredetail.WoundCareDate()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                nursewoundcaredetail = new NurseTWoundCareDetail();
                nursewoundcaredetail.setWoundCareDetailId(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareDetailId())));
                nursewoundcaredetail.setWoundCareId(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareId())));
                nursewoundcaredetail.setWoundCareDate(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareDate())));
                nursewoundcaredetail.setDoctorDx(config1.StringNull(rs.getString(nursewoundcaredetail.DoctorDx())));
                nursewoundcaredetail.setWoundMethodCategory(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCategory())));

                nursewoundcaredetail.setWoundMethodCategoryDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCategoryDescription())));
                nursewoundcaredetail.setWoundMethodCareCategorySpecial(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCareCategorySpecial())));
                nursewoundcaredetail.setWoundMethodCareCategorySpecialDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundMethodCareCategorySpecialDescription())));
                nursewoundcaredetail.setWoundCareTime(config1.StringNull(rs.getString(nursewoundcaredetail.WoundCareTime())));
                nursewoundcaredetail.setWoundEstimateBeforeFlag(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlag())));

                nursewoundcaredetail.setWoundEstimateBeforeFlagDischargeDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlagDischargeDescription())));
                nursewoundcaredetail.setWoundEstimateBeforeFlagDischargeFeature(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlagDischargeFeature())));
                nursewoundcaredetail.setWoundEstimateBeforeFlagDischargeQuantity(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeFlagDischargeQuantity())));
                nursewoundcaredetail.setWoundEstimateBeforeCategory(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeCategory())));
                nursewoundcaredetail.setWoundEstimateBeforeCategoryDimensionDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeCategoryDimensionDescription())));

                nursewoundcaredetail.setWoundEstimateBeforeCategoryOtherDescription(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateBeforeCategoryOtherDescription())));
                nursewoundcaredetail.setWoundEstimateAfterFlag(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateAfterFlag())));
                nursewoundcaredetail.setWoundEstimateAfterFlagSolve(config1.StringNull(rs.getString(nursewoundcaredetail.WoundEstimateAfterFlagSolve())));
                nursewoundcaredetail.setUserIdCreate(config1.StringNull(rs.getString(nursewoundcaredetail.UserIdCreate())));
                nursewoundcaredetail.setUserIdModify(config1.StringNull(rs.getString(nursewoundcaredetail.UserIdModify())));

                nursewoundcaredetail.setUserIdCancel(config1.StringNull(rs.getString(nursewoundcaredetail.UserIdCancel())));
                nursewoundcaredetail.setDateCreate(config1.StringNull(rs.getString(nursewoundcaredetail.DateCreate())));
                nursewoundcaredetail.setDateModify(config1.StringNull(rs.getString(nursewoundcaredetail.DateModify())));
                nursewoundcaredetail.setDateCancel(config1.StringNull(rs.getString(nursewoundcaredetail.DateCancel())));

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nursewoundcaredetail;
    }
    public int SaveWoundCare(NurseTWoundCare item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="";
        NurseTWoundCare woundcare = new NurseTWoundCare();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            woundcare = getNurseTWoundCareByPK(item.getWoundCareId());
//            attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
            item.setPatientFullNamet(item.getPatientFullNamet().replace("'", "''"));
//            itemdetail.setAttendRemark(itemdetail.getAttendRemark().replace("'", "''"));
//            itemdetail.setMaDescription(itemdetail.getMaDescription().replace("'", "''"));
//            itemdetail.setMaRemark(itemdetail.getMaRemark().replace("'", "''"));
//            itemdetail.setVendorRemark(itemdetail.getVendorRemark().replace("'", "''"));
//            itemdetail.setSymptoms(itemdetail.getSymptoms().replace("'", "''"));
            
            if(woundcare.getWoundCareId().equals("")){
                String max = getMaxRowWoundCare();
                sql="Insert Into "+woundcare.NurseTWoundCare()+"("
                        +woundcare.WoundCareId()+", "+woundcare.PatientHnNo()+", "
                        +woundcare.PatientFullNameT()+","+ woundcare.WoundCareRunningDocNo()+","
                        +woundcare.WoundCareStatus()+") "
                        +"Values('"+max+"','"+item.getPatientHnNo()+"','"
                        +item.getPatientFullNamet() + "','"+ item.getWoundCareRunningDocNo()+"','"
                        +item.getWoundCareStatus()+"')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+woundcare.NurseTWoundCare()+" set "
                //+woundcaredetail.PatientHnNo()+" = '"+itemdetail.getPatientHnNo()+"', "
                +woundcare.PatientFullNameT()+" = '"+item.getPatientFullNamet()+"', "
                +woundcare.PatientAN()+" = '"+item.getPatientAn()+"', "
                +woundcare.PatientAge()+" = '"+item.getPatientAge()+"', "
                +woundcare.PatientBedRoom()+" = '"+item.getPatientBedRoom()+"', "
                +woundcare.PatientPhoneNumber()+" = '"+item.getPatientPhoneNumber()+"', "
//                +woundcaredetail.WoundCareRunningDocNo()+" = '"+itemdetail.getWoundCareRunningDocNo()+"', "
                +woundcare.WoundCause()+" = '"+item.getWoundCause()+"', "
                +woundcare.WoundType()+" = '"+item.getWoundType()+"', "
                +woundcare.WoundAppearance()+" = '"+item.getWoundAppearance()+"', "
                +woundcare.WoundCategory()+" = '"+item.getWoundCategory()+"', "
                +woundcare.WoundLocation()+" = '"+item.getWoundLocation()+"', "
                +woundcare.WoundTreatmentCuredEstimate()+" = '"+item.getWoundTreatmentCuredEstimate()+"', "
                +woundcare.WoundTreatmentCuredReal()+" = '"+item.getWoundTreatmentCuredReal()+"', "
                +woundcare.NurseRemark()+" = '"+item.getNurseRemark()+"', "
                +woundcare.WoundDescription()+" = '"+item.getWoundDescription()+"', "
                +woundcare.WoundCareActive()+" = '"+item.getWoundCareActive()+"' "                
                +"Where "+woundcare.WoundCareId()+" = '"+item.getWoundCareId()+"'";
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
    public int SaveWoundCareDetail(NurseTWoundCareDetail itemdetail, String flagpage) throws Exception {
        int chk=0;
        String sql="", wound_care_date="", attend_date="";
        NurseTWoundCareDetail woundcaredetail = new NurseTWoundCareDetail();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            woundcaredetail = getNurseTWoundCareDetailByPK(itemdetail.getWoundCareDetailId());
//            attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
            itemdetail.setWoundEstimateBeforeCategoryDimensionDescription(itemdetail.getWoundEstimateBeforeCategoryDimensionDescription().replace("'", "''"));
//            itemdetail.setAttendRemark(itemdetail.getAttendRemark().replace("'", "''"));
//            itemdetail.setMaDescription(itemdetail.getMaDescription().replace("'", "''"));
//            itemdetail.setMaRemark(itemdetail.getMaRemark().replace("'", "''"));
//            itemdetail.setVendorRemark(itemdetail.getVendorRemark().replace("'", "''"));
//            itemdetail.setSymptoms(itemdetail.getSymptoms().replace("'", "''"));
            wound_care_date=config1.DateFormatShow2DB(itemdetail.getWoundCareDate(), "ddMMyyyy");
            if(woundcaredetail.getWoundCareId().equals("")){
                String max = getMaxRowWoundCareDetail();
                sql="Insert Into "+woundcaredetail.NurseTWoundCareDetail()+"("
                        +woundcaredetail.WoundCareDetailId()+", "+woundcaredetail.WoundCareId()+", "
                        +woundcaredetail.WoundCareDate()+","+ woundcaredetail.DoctorDx()+","
                        +woundcaredetail.WoundMethodCategory()+","+ woundcaredetail.WoundMethodCategoryDescription()+","
                        +woundcaredetail.WoundMethodCareCategorySpecial()+","+ woundcaredetail.WoundMethodCareCategorySpecialDescription()+","
                        +woundcaredetail.WoundCareTime()+","+ woundcaredetail.WoundEstimateBeforeFlag()+","
                        +woundcaredetail.WoundEstimateBeforeFlagDischargeDescription()+","+ woundcaredetail.WoundEstimateBeforeFlagDischargeQuantity()+","
                        +woundcaredetail.WoundEstimateBeforeFlagDischargeFeature()+","+ woundcaredetail.WoundEstimateBeforeCategory()+","
                        +woundcaredetail.WoundEstimateBeforeCategoryOtherDescription()+","+ woundcaredetail.WoundEstimateBeforeCategoryDimensionDescription()+","
                        +woundcaredetail.WoundEstimateAfterFlag()+","+ woundcaredetail.WoundEstimateAfterFlagSolve()+","
                        +woundcaredetail.UserIdCreate()+","+ woundcaredetail.UserIdModify()+","
                        +woundcaredetail.DateCreate()+","+ woundcaredetail.DateModify()+","
                        +woundcaredetail.DateCancel()+","+woundcaredetail.UserIdCancel()+") "
                        +"Values('"+max+"','"+itemdetail.getWoundCareId()+"','"
                        +wound_care_date + "','"+ itemdetail.getDoctorDx()+"','"
                        +itemdetail.getWoundMethodCategory() + "','"+ itemdetail.getWoundMethodCategoryDescription()+"','"
                        +itemdetail.getWoundMethodCareCategorySpecial() + "','"+ itemdetail.getWoundMethodCareCategorySpecialDescription()+"','"
                        +itemdetail.getWoundCareTime() + "','"+ itemdetail.getWoundEstimateBeforeFlag()+"','"
                        +itemdetail.getWoundEstimateBeforeFlagDischargeDescription() + "','"+ itemdetail.getWoundEstimateBeforeFlagDischargeQuantity()+"','"                        
                        +itemdetail.getWoundEstimateBeforeFlagDischargeFeature() + "','"+ itemdetail.getWoundEstimateBeforeCategory()+"','"
                        +itemdetail.getWoundEstimateBeforeCategoryOtherDescription() + "','"+ itemdetail.getWoundEstimateBeforeCategoryDimensionDescription()+"','"
                        +itemdetail.getWoundEstimateAfterFlag() + "','"+ itemdetail.getWoundEstimateAfterFlagSolve()+"','"
                        +itemdetail.getUserIdCreate() + "','"+ itemdetail.getUserIdModify()+"','"
                        +itemdetail.getDateCreate() + "','"+ itemdetail.getDateModify()+"','"
                        +itemdetail.getDateCancel()+"','"+itemdetail.getUserIdCancel()+"')";
            }
            else{
                
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+woundcaredetail.NurseTWoundCareDetail()+" set "
//                +woundcaredetail.WoundCareId()+" = '"+itemdetail.WoundCareId()+"', "
                +woundcaredetail.WoundCareDate()+" = '"+wound_care_date+"', "
                +woundcaredetail.DoctorDx()+" = '"+itemdetail.getDoctorDx()+"', "
                +woundcaredetail.WoundMethodCategory()+" = '"+itemdetail.getWoundMethodCategory()+"', "
                +woundcaredetail.WoundMethodCategoryDescription()+" = '"+itemdetail.getWoundMethodCategoryDescription()+"', "
                +woundcaredetail.WoundMethodCareCategorySpecial()+" = '"+itemdetail.getWoundMethodCareCategorySpecial()+"', "
                +woundcaredetail.WoundMethodCareCategorySpecialDescription()+" = '"+itemdetail.getWoundMethodCareCategorySpecialDescription()+"', "
                +woundcaredetail.WoundCareTime()+" = '"+itemdetail.getWoundCareTime()+"', "
                +woundcaredetail.WoundEstimateBeforeFlag()+" = '"+itemdetail.getWoundEstimateBeforeFlag()+"', "
                +woundcaredetail.WoundEstimateBeforeFlagDischargeFeature()+" = '"+itemdetail.getWoundEstimateBeforeFlagDischargeFeature()+"', "
                +woundcaredetail.WoundEstimateBeforeCategory()+" = '"+itemdetail.getWoundEstimateBeforeCategory()+"', "
                +woundcaredetail.WoundEstimateBeforeCategoryOtherDescription()+" = '"+itemdetail.getWoundEstimateBeforeCategoryOtherDescription()+"', "
                +woundcaredetail.WoundEstimateBeforeCategoryDimensionDescription()+" = '"+itemdetail.getWoundEstimateBeforeCategoryDimensionDescription()+"', "
                +woundcaredetail.WoundEstimateAfterFlag()+" = '"+itemdetail.getWoundEstimateAfterFlag()+"', "
                +woundcaredetail.WoundEstimateAfterFlagSolve()+" = '"+itemdetail.getWoundEstimateAfterFlagSolve()+"', "
                +woundcaredetail.UserIdCreate()+" = '"+itemdetail.getUserIdCreate()+"', "
                +woundcaredetail.UserIdModify()+" = '"+itemdetail.getUserIdModify()+"', "
                +woundcaredetail.DateCreate()+" = '"+itemdetail.getDateCreate()+"', "
                +woundcaredetail.DateModify()+" = '"+itemdetail.getDateModify()+"', "
                +woundcaredetail.DateCancel()+" = '"+itemdetail.getDateCancel()+"', "
                +woundcaredetail.UserIdCancel()+" = '"+itemdetail.getUserIdCancel()+"' "
                +"Where "+woundcaredetail.WoundCareDetailId()+" = '"+itemdetail.getWoundCareDetailId()+"'";
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
    public String CboWoundCare(String patient_hn_no, String selected){
        String txt="",sql="";
        Vector v_wound_care = new Vector();
        NurseTWoundCare wound_care = new NurseTWoundCare();
        v_wound_care = getNurseTWoundCare(patient_hn_no, "hn_no");
        for(int i=0;i<=v_wound_care.size()-1;i++) {
            wound_care = (NurseTWoundCare) v_wound_care.get(i);
            if(wound_care.getWoundCareRunningDocNo().equals(selected)){
                txt += "<option value='"+wound_care.getWoundCareId()+"' selected>"
                        +wound_care.getWoundCareRunningDocNo() + " " + wound_care.getWoundDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+wound_care.getWoundCareId()+"' >"
                        +wound_care.getWoundCareRunningDocNo() + " " + wound_care.getWoundDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public String CboWoundCare(Vector v_patient_hn_no, String selected){
        String txt="",sql="";
        //Vector v_wound_care = new Vector();
        NurseTWoundCare wound_care = new NurseTWoundCare();
        //v_wound_care = getNurseTWoundCare(patient_hn_no, "hn_no");
        for(int i=0;i<=v_patient_hn_no.size()-1;i++) {
            wound_care = (NurseTWoundCare) v_patient_hn_no.get(i);
            if(wound_care.getWoundCareId().equals(selected)){
                txt += "<option value='"+wound_care.getWoundCareId()+"' selected>"
                        +wound_care.getWoundCareRunningDocNo() + " " + wound_care.getWoundDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+wound_care.getWoundCareId()+"' >"
                        +wound_care.getWoundCareRunningDocNo() + " " + wound_care.getWoundDescription()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public String CboWoundCareDetail(String patient_hn_no, String selected){
        String txt="",sql="";
        Vector v_wound_care_detail = new Vector();
        NurseTWoundCareDetail wound_care_detail = new NurseTWoundCareDetail();
        v_wound_care_detail = getNurseTWoundCareDetail(patient_hn_no, "wound_care_id");
        for(int i=0;i<=v_wound_care_detail.size()-1;i++) {
            wound_care_detail = (NurseTWoundCareDetail) v_wound_care_detail.get(i);
            if(wound_care_detail.getWoundCareDetailId().equals(selected)){
                txt += "<tr><td><A HREF='javascript:changesubmitwoundcaredetailshow("
                +wound_care_detail.getWoundCareId()+","+wound_care_detail.getWoundCareDetailId()+")'  >"
                        +wound_care_detail.getWoundCareDateddMMyy("ddMMyy")+"</A></td></tr>";
            }
            else{
                txt += "<tr><td><A HREF='javascript:changesubmitwoundcaredetailshow("
                +wound_care_detail.getWoundCareId()+","+wound_care_detail.getWoundCareDetailId()+")'  >"
                        +wound_care_detail.getWoundCareDateddMMyy("ddMMyy")+"</A></td></tr>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }

}
