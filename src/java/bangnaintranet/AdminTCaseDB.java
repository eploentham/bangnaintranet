package bangnaintranet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author root
 */
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AdminTCaseDB {
    private Config1 config1 = new Config1();
    private AdminTCase case1 = new AdminTCase();
    private AdminTCaseDetail casedetail = new AdminTCaseDetail();
    public String getMaxRowAdminTCase(Connection conn){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+case1.getFCaseId()+") as cnt From "+case1.getAdminTCase();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                max = rs.getString("cnt");
            }
            rs.close();
//            conn.close();
            if(max!=null && !max.equals("")) {
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "12600001";
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String getMaxRowAdminTCaseDetail(Connection conn, String flagpage){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+casedetail.getFCaseDetailId()+") as cnt From "+casedetail.getAdminTCaseDetail()+flagpage;
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
//            conn.close();
            if(max!=null && !max.equals("")){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "12500001";
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public AdminTCase getAdminTCaseByPK(String case_id) {
        Connection conn;
        AdminTCase case1 = new AdminTCase();
//        BDepartment department = new BDepartment();
        //FoodsPeriod foodsperiod = new FoodsPeriod();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            sql="Select * "
                +"From "+case1.getAdminTCase()+" "
                +"Where "+case1.getFCaseId()+"='"+case_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                case1 = new AdminTCase();
                case1.setCaseId(config1.StringNull(rs.getString(case1.getFCaseId())));
                case1.setCaseDate(config1.StringNull(rs.getString(case1.getFCaseDate())));
                case1.setCntCash(Double.parseDouble(rs.getString(case1.getFCntCash())));
                case1.setCntCheckup(Double.parseDouble(rs.getString(case1.getFCntCheckUp())));
                case1.setCntCompany(Double.parseDouble(rs.getString(case1.getFCntCompany())));

                case1.setCntDental(Double.parseDouble(rs.getString(case1.getFCntDental())));
                case1.setCntEr(Double.parseDouble(rs.getString(case1.getFCntEr())));
                case1.setCntFunds(Double.parseDouble(rs.getString(case1.getFCntFund())));
                case1.setCntOpd(Double.parseDouble(rs.getString(case1.getFCntOpd())));
                case1.setCntPcu(Double.parseDouble(rs.getString(case1.getFCntPcu())));

                case1.setDescription(config1.StringNull(rs.getString(case1.getFDescription())));
                case1.setRemark(config1.StringNull(rs.getString(case1.getFRemark())));
                case1.setBranchId(config1.StringNull(rs.getString(case1.getFBranchId())));
                case1.setCntW3M(Double.parseDouble(rs.getString(case1.getFCntW3M())));
                case1.setCntW3N(Double.parseDouble(rs.getString(case1.getFCntW3N())));

                case1.setCntW3W(Double.parseDouble(rs.getString(case1.getFCntW3W())));
                case1.setCntW4S(Double.parseDouble(rs.getString(case1.getFCntW4S())));
                case1.setCntW4UC(Double.parseDouble(rs.getString(case1.getFCntW4UC())));
                case1.setCntW6UC(Double.parseDouble(rs.getString(case1.getFCntW6UC())));
                case1.setCntWICU(Double.parseDouble(rs.getString(case1.getFCntWICU())));
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return case1;
    }
    public Vector getAdminTCase(String case_id, String date_start, String date_end, String branch_id, String flag) {
        Connection conn;
        AdminTCase case1 = new AdminTCase();
//        BDepartment department = new BDepartment();
        Vector v_case = new Vector();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            if(flag.equals("date")){
                sql="Select * "+
                "From "+case1.getAdminTCase()+" "+
                "Where "+case1.getFCaseDate()+">='"+date_start+"' and "+case1.getFCaseDate() + "<='"+date_end+"' and "+case1.getFCaseActive()+"='1' "+
                "Order By "+case1.getFCaseDate()+" desc";
            }
            else {
                sql="Select * "
                +"From "+case1.getAdminTCase()+" "
                +"Where "+case1.getFCaseId()+"='"+case_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            }
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                case1 = new AdminTCase();
                case1.setCaseId(config1.StringNull(rs.getString(case1.getFCaseId())));
                case1.setCaseDate(config1.StringNull(rs.getString(case1.getFCaseDate())));
                case1.setCntCash(Double.parseDouble(rs.getString(case1.getFCntCash())));
                case1.setCntCheckup(Double.parseDouble(rs.getString(case1.getFCntCheckUp())));
                case1.setCntCompany(Double.parseDouble(rs.getString(case1.getFCntCompany())));

                case1.setCntDental(Double.parseDouble(rs.getString(case1.getFCntDental())));
                case1.setCntEr(Double.parseDouble(rs.getString(case1.getFCntEr())));
                case1.setCntFunds(Double.parseDouble(rs.getString(case1.getFCntFund())));
                case1.setCntOpd(Double.parseDouble(rs.getString(case1.getFCntOpd())));
                case1.setCntPcu(Double.parseDouble(rs.getString(case1.getFCntPcu())));

                case1.setDescription(config1.StringNull(rs.getString(case1.getFDescription())));
                case1.setRemark(config1.StringNull(rs.getString(case1.getFRemark())));
                case1.setBranchId(config1.StringNull(rs.getString(case1.getFBranchId())));
                case1.setCntW3M(Double.parseDouble(rs.getString(case1.getFCntW3M())));
                case1.setCntW3N(Double.parseDouble(rs.getString(case1.getFCntW3N())));

                case1.setCntW3W(Double.parseDouble(rs.getString(case1.getFCntW3W())));
                case1.setCntW4S(Double.parseDouble(rs.getString(case1.getFCntW4S())));
                case1.setCntW4UC(Double.parseDouble(rs.getString(case1.getFCntW4UC())));
                case1.setCntW6UC(Double.parseDouble(rs.getString(case1.getFCntW6UC())));
                case1.setCntWICU(Double.parseDouble(rs.getString(case1.getFCntWICU())));
                v_case.add(case1);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_case;
    }
    public AdminTCaseDetail getAdminTCaseDetailByPK(String case_detail_id,String flagpage) {
        Connection conn;
        AdminTCaseDetail case_detail = new AdminTCaseDetail();
//        BDepartment department = new BDepartment();
        //FoodsPeriod foodsperiod = new FoodsPeriod();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();


            sql="Select uc.*, department.department_namet "
                +"From "+case_detail.getAdminTCaseDetail()+flagpage+" "
                +"Where "+case_detail.getFCaseDetailId()+"='"+case_detail_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                case_detail = new AdminTCaseDetail();
                case_detail.setCaseId(config1.StringNull(rs.getString(case_detail.getFCaseId())));
                case_detail.setBranchId(config1.StringNull(rs.getString(case_detail.getFBranchId())));
                case_detail.setCaseDetailActive(config1.StringNull(rs.getString(case_detail.getFCaseDetailActive())));
                case_detail.setCaseDetailId(config1.StringNull(rs.getString(case_detail.getFCaseDetailId())));
                case_detail.setDateCancel(config1.StringNull(rs.getString(case_detail.getFDateCancel())));

                case_detail.setDateCreate(config1.StringNull(rs.getString(case_detail.getFDateCreate())));
                case_detail.setDateModify(config1.StringNull(rs.getString(case_detail.getFDateModify())));
                case_detail.setPatientFullnamet(config1.StringNull(rs.getString(case_detail.getFPatientFullNamet())));
                case_detail.setPatientHn(config1.StringNull(rs.getString(case_detail.getFPatientHn())));
                case_detail.setUserCancel(config1.StringNull(rs.getString(case_detail.getFUserCancel())));

                case_detail.setUserCreate(config1.StringNull(rs.getString(case_detail.getUserCreate())));
                case_detail.setUserModify(config1.StringNull(rs.getString(case_detail.getFUserModify())));
                case_detail.setVisitClinicId(config1.StringNull(rs.getString(case_detail.getFVisitClinicId())));
                case_detail.setVisitClinicNamet(config1.StringNull(rs.getString(case_detail.getFVisitClinicNamet())));
                case_detail.setVisitDate(config1.StringNull(rs.getString(case_detail.getFVisitDate())));

                case_detail.setVisitPaidId(config1.StringNull(rs.getString(case_detail.getFVisitPaidId())));
                case_detail.setVisitPaidNamet(config1.StringNull(rs.getString(case_detail.getFVisitPaidNamet())));
                case_detail.setVisitTime(config1.StringNull(rs.getString(case_detail.getFVisitTime())));
                case_detail.setDepartmentId(config1.StringNull(rs.getString(case_detail.getFVisitTime())));
                case_detail.setDepartmentNamet(config1.StringNull(rs.getString(case_detail.getFVisitTime())));

                case_detail.setPatientVn(config1.StringNull(rs.getString(case_detail.getFPatientVn())));
                case_detail.setVisitStatus(config1.StringNull(rs.getString(case_detail.getFVisitStatus())));

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return case_detail;
    }
    public Vector getAdminTCaseDetail(String case_id, String flagpage) {
        Connection conn;
        AdminTCaseDetail case_detail = new AdminTCaseDetail();
        Vector v_case_detail = new Vector();
//        BDepartment department = new BDepartment();
        //FoodsPeriod foodsperiod = new FoodsPeriod();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            sql="Select * "
                +"From "+case_detail.getAdminTCaseDetail()+flagpage+" "
                +"Where "+case_detail.getFCaseId()+"='"+case_id+"'"
                +"Order By "+case_detail.getFVisitDate()+", "+case_detail.getFVisitTime();
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                case_detail = new AdminTCaseDetail();
                case_detail.setCaseId(config1.StringNull(rs.getString(case_detail.getFCaseId())));
                case_detail.setBranchId(config1.StringNull(rs.getString(case_detail.getFBranchId())));
                case_detail.setCaseDetailActive(config1.StringNull(rs.getString(case_detail.getFCaseDetailActive())));
                case_detail.setCaseDetailId(config1.StringNull(rs.getString(case_detail.getFCaseDetailId())));
                case_detail.setDateCancel(config1.StringNull(rs.getString(case_detail.getFDateCancel())));

                case_detail.setDateCreate(config1.StringNull(rs.getString(case_detail.getFDateCreate())));
                case_detail.setDateModify(config1.StringNull(rs.getString(case_detail.getFDateModify())));
                case_detail.setPatientFullnamet(config1.StringNull(rs.getString(case_detail.getFPatientFullNamet())));
                case_detail.setPatientHn(config1.StringNull(rs.getString(case_detail.getFPatientHn())));
                case_detail.setUserCancel(config1.StringNull(rs.getString(case_detail.getFUserCancel())));

                case_detail.setUserCreate(config1.StringNull(rs.getString(case_detail.getFUserCreate())));
                case_detail.setUserModify(config1.StringNull(rs.getString(case_detail.getFUserModify())));
                case_detail.setVisitClinicId(config1.StringNull(rs.getString(case_detail.getFVisitClinicId())));
                case_detail.setVisitClinicNamet(config1.StringNull(rs.getString(case_detail.getFVisitClinicNamet())));
                case_detail.setVisitDate(config1.StringNull(rs.getString(case_detail.getFVisitDate())));

                case_detail.setVisitPaidId(config1.StringNull(rs.getString(case_detail.getFVisitPaidId())));
                case_detail.setVisitPaidNamet(config1.StringNull(rs.getString(case_detail.getFVisitPaidNamet())));
                case_detail.setVisitTime(config1.StringNull(rs.getString(case_detail.getFVisitTime())));
                case_detail.setDepartmentId(config1.StringNull(rs.getString(case_detail.getFDepartmentId())));
                case_detail.setDepartmentNamet(config1.StringNull(rs.getString(case_detail.getFDepartmentNamet())));

                case_detail.setPatientVn(config1.StringNull(rs.getString(case_detail.getFPatientVn())));
                case_detail.setVisitStatus(config1.StringNull(rs.getString(case_detail.getFVisitStatus())));
                v_case_detail.add(case_detail);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_case_detail;
    }
    public String setSaveAdminTCase(AdminTCase item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        AdminTCase case1 = new AdminTCase();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            case1 = getAdminTCaseByPK(item.getCaseId());
            item.setDescription(item.getDescription().replace("'", "''"));
            //item.setDestination(item.getDestination().replace("'", "''"));
            item.setRemark(item.getRemark().replace("'", "''"));
//            item.setSerialNo(item.getSerialNo().replace("'", "''"));
//            item.setServiceTab(item.getServiceTab().replace("'", "''"));
//            item.setWarranty(item.getWarranty().replace("'", "''"));
            if(case1.getCaseId().equals("")){
                max = getMaxRowAdminTCase(conn);
                sql="Insert Into "+case1.getAdminTCase()+"("
                        +case1.getFCaseId()+", "+case1.getFCaseDate()+", "
                        +case1.getFDescription()+","+ case1.getFCntCash()+","
                        +case1.getFCntCheckUp()+","+ case1.getFCntCompany()+","
                        +case1.getFCntDental()+","+ case1.getFCntEr()+","
                        +case1.getFCntFund()+","+ case1.getFCntOpd()+","
                        +case1.getFCntPcu()+","+ case1.getFRemark()+","
                        +case1.getFCaseActive()+","+case1.getFBranchId()+", "
                        +case1.getFCntW3M()+","+case1.getFCntW3N()+", "
                        +case1.getFCntW3W()+","+case1.getFCntW4S()+", "
                        +case1.getFCntW4UC()+","+case1.getFCntW6UC()+", "
                        +case1.getFCntWICU()+") "
                        +"Values('"+max+"','"+item.getCaseDate()+"','"
                        +item.getDescription() + "','"+ item.getCntCash()+"','"
                        +item.getCntCheckup() + "','"+ item.getCntCompany()+"','"
                        +item.getCntDental() + "','"+ item.getCntEr()+"','"
                        +item.getCntFunds() + "','"+ item.getCntOpd()+"','"
                        +item.getCntPcu() + "','"+ item.getRemark()+"','"
                        +item.getCaseActive()+"','"+item.getBranchId()+"','"
                        +item.getCntW3M()+"','"+item.getCntW3N()+"','"
                        +item.getCntW3W()+"','"+item.getCntW4S()+"','"
                        +item.getCntW4UC()+"','"+item.getCntWICU()+"','"
                        +item.getCntWICU()+"')";

            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+case1.getAdminTCase()+" set "
                +case1.getFCaseDate()+" = '"+item.getCaseDate()+"', "
                +case1.getFCntCash()+" = '"+item.getCntCash()+"', "
                +case1.getFCntCheckUp()+" = '"+item.getCntCheckup()+"', "
                +case1.getFCntCompany()+" = '"+item.getCntCompany()+"', "
                +case1.getFCntDental()+" = '"+item.getCntDental()+"', "
                +case1.getFCntEr()+" = '"+item.getCntEr()+"', "
                +case1.getFCntFund()+" = '"+item.getCntFunds()+"', "
                +case1.getFCntOpd()+" = '"+item.getCntOpd()+"', "
                +case1.getFCntPcu()+" = '"+item.getCntPcu()+"', "
                +case1.getFDescription()+" = '"+item.getDescription()+"', "
                +case1.getFRemark()+" = '"+item.getRemark()+"', "
                +case1.getFCaseActive()+" = '"+item.getCaseActive()+"', "
                +case1.getFCntW3M()+" = '"+item.getCntW3M()+"', "
                +case1.getFCntW3N()+" = '"+item.getCntW3N()+"', "
                +case1.getFCntW3W()+" = '"+item.getCntW3W()+"', "
                +case1.getFCntW4S()+" = '"+item.getCntW4S()+"', "
                +case1.getFCntW4UC()+" = '"+item.getCntW4UC()+"', "
                +case1.getFCntW6UC()+" = '"+item.getCntW6UC()+"', "
                +case1.getFCntWICU()+" = '"+item.getCntWICU()+"' "
                +"Where "+case1.getFCaseId()+" = '"+item.getCaseId()+"'";
                max = item.getCaseId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String setSaveAdminTCaseDetail(AdminTCaseDetail item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        AdminTCaseDetail case1 = new AdminTCaseDetail();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            case1 = getAdminTCaseDetailByPK(item.getCaseId(),"");
            item.setPatientFullnamet(item.getPatientFullnamet().replace("'", "''"));
            //item.setDestination(item.getDestination().replace("'", "''"));
//            item.setRemark(item.getRemark().replace("'", "''"));
//            item.setSerialNo(item.getSerialNo().replace("'", "''"));
//            item.setServiceTab(item.getServiceTab().replace("'", "''"));
//            item.setWarranty(item.getWarranty().replace("'", "''"));
            if(case1.getCaseId().equals("")){
                max = getMaxRowAdminTCaseDetail(conn, flagpage);
                sql="Insert Into "+case1.getAdminTCaseDetail()+flagpage+"("
                        +case1.getFCaseDetailId()+", "+case1.getFBranchId()+", "
                        +case1.getFCaseDetailActive()+","+ case1.getFCaseId()+","
                        +case1.getFDateCancel()+","+ case1.getFDateCreate()+","
                        +case1.getFDateModify()+","+ case1.getFPatientFullNamet()+","
                        +case1.getFPatientHn()+","+ case1.getFUserCancel()+","
                        +case1.getFUserModify()+","+ case1.getFUserCreate()+","
                        +case1.getFVisitClinicId()+","+ case1.getFVisitClinicNamet()+","
                        +case1.getFVisitDate()+","+ case1.getFVisitPaidId()+","
                        +case1.getFVisitTime()+","+ case1.getFVisitPaidNamet()+","
                        +case1.getFDepartmentId()+","+case1.getFDepartmentNamet()+","
                        +case1.getFPatientVn()+","+case1.getFVisitStatus()+") "
                        +"Values('"+max+"','"+item.getBranchId()+"','"
                        +item.getCaseDetailActive() + "','"+ item.getCaseId()+"','"
                        +item.getDateCancel() + "','"+ item.getDateCreate()+"','"
                        +item.getDateModify() + "','"+ item.getPatientFullnamet()+"','"
                        +item.getPatientHn() + "','"+ item.getUserCancel()+"','"
                        +item.getUserModify() + "','"+ item.getUserCreate()+"','"
                        +item.getVisitClinicId() + "','"+ item.getVisitClinicNamet()+"','"
                        +item.getVisitDate() + "','"+ item.getVisitPaidId()+"','"
                        +item.getVisitTime() + "','"+ item.getVisitPaidNamet()+"','"
                        +item.getDepartmentId()+"','"+item.getDepartmentNamet()+"','"
                        +item.getPatientVn()+"','"+item.getVisitStatus()+"')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+case1.getAdminTCaseDetail()+" set "
                +case1.getFCaseDetailId()+" = '"+item.getFCaseDetailId()+"', "
                +case1.getBranchId()+" = '"+item.getBranchId()+"', "
                +case1.getFCaseDetailActive()+" = '"+item.getCaseDetailActive()+"', "
                +case1.getFCaseId()+" = '"+item.getCaseId()+"', "
                +case1.getFDateCancel()+" = '"+item.getDateCancel()+"', "
                +case1.getFDateCreate()+" = '"+item.getDateCreate()+"', "
                +case1.getFDateModify()+" = '"+item.getDateModify()+"', "
                +case1.getFPatientFullNamet()+" = '"+item.getPatientFullnamet()+"', "
                +case1.getFPatientHn()+" = '"+item.getPatientHn()+"', "
                +case1.getFUserCancel()+" = '"+item.getUserCancel()+"', "
                +case1.getFUserModify()+" = '"+item.getUserModify()+"', "
                +case1.getFUserCreate()+" = '"+item.getUserCreate()+"', "
                +case1.getFVisitClinicId()+" = '"+item.getVisitClinicId()+"', "
                +case1.getFVisitClinicNamet()+" = '"+item.getVisitClinicNamet()+"', "
                +case1.getFVisitDate()+" = '"+item.getVisitDate()+"', "
                +case1.getFVisitPaidId()+" = '"+item.getVisitPaidId()+"', "
                +case1.getFVisitTime()+" = '"+item.getVisitTime()+"', "
                +case1.getFVisitPaidNamet()+" = '"+item.getVisitPaidNamet()+"', "
                +case1.getFDepartmentId()+" = '"+item.getDepartmentId()+"', "
                +case1.getFDepartmentNamet()+" = '"+item.getDepartmentNamet()+"', "
                +case1.getFPatientVn()+" = '"+item.getPatientVn()+"', "
                +case1.getFVisitStatus()+" = '"+item.getVisitStatus()+"' "
                +"Where "+case1.getFCaseId()+" = '"+item.getCaseId()+"'";
                max = item.getCaseId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public Vector setCaseImport(String branch_id, String visit_date, String flag){
        Vector v_visit = new Vector();
        Vector v_case_detail = new Vector();
        try{
            //String date_cur = config1.getDate("yyyyMMdd");
            Integer diff_date = config1.getDateDiff(visit_date, branch_id);
            AdminTCaseDetail case_detail = new AdminTCaseDetail();
            v_visit = config1.getPatientVisit(branch_id, visit_date,"115");//´Ö§ Dental
            PatientVisit patient_visit = new PatientVisit();
            for( int i=0;i<=v_visit.size()-1;i++){
                patient_visit = (PatientVisit)v_visit.get(i);
                if(patient_visit.getVisitPaidId().equals("02") || patient_visit.getVisitPaidId().equals("05")
                        || patient_visit.getVisitPaidId().equals("13") || patient_visit.getVisitPaidId().equals("15")
                        || patient_visit.getVisitPaidId().equals("18")){
                    case_detail.setBranchId(branch_id);
                    case_detail.setCaseDetailActive("1");
                    case_detail.setCaseDetailId("");
                    case_detail.setCaseId("");
                    case_detail.setPatientFullnamet(patient_visit.getPatientNamet());
                    case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setVisitClinicId(patient_visit.getVisitClinicId());
                    case_detail.setVisitClinicNamet(patient_visit.getVisitClinicNamet());
                    case_detail.setVisitDate(patient_visit.getVisitDate());
                    case_detail.setVisitTime(patient_visit.getVisitTime());
                    case_detail.setVisitPaidId(patient_visit.getVisitPaidId());
                    case_detail.setVisitPaidNamet(patient_visit.getVisitPaidNamet());
    //                case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setPatientVn(patient_visit.getVisitVn());
                    case_detail.setDepartmentId("115");
                    case_detail.setDepartmentNamet("·Ñ¹µ¡ÃÃÁ");
                    case_detail.setVisitStatus("opd");
                    setSaveAdminTCaseDetail(case_detail,"_temp");
                }
//                v_case_detail.add(case_detail);
            }
            v_visit = config1.getPatientVisit(branch_id, visit_date,"111");//´Ö§ Checkup
            for( int i=0;i<=v_visit.size()-1;i++){
                patient_visit = (PatientVisit)v_visit.get(i);
                if(patient_visit.getVisitPaidId().equals("02") || patient_visit.getVisitPaidId().equals("05")
                        || patient_visit.getVisitPaidId().equals("13") || patient_visit.getVisitPaidId().equals("15")
                        || patient_visit.getVisitPaidId().equals("18")){
                    case_detail.setBranchId(branch_id);
                    case_detail.setCaseDetailActive("1");
                    case_detail.setCaseDetailId("");
                    case_detail.setCaseId("");
                    case_detail.setPatientFullnamet(patient_visit.getPatientNamet());
                    case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setVisitClinicId(patient_visit.getVisitClinicId());
                    case_detail.setVisitClinicNamet(patient_visit.getVisitClinicNamet());
                    case_detail.setVisitDate(patient_visit.getVisitDate());
                    case_detail.setVisitTime(patient_visit.getVisitTime());
                    case_detail.setVisitPaidId(patient_visit.getVisitPaidId());
                    case_detail.setVisitPaidNamet(patient_visit.getVisitPaidNamet());
    //                case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setPatientVn(patient_visit.getVisitVn());
                    case_detail.setDepartmentId("111");
                    case_detail.setDepartmentNamet("Checkup");
                    case_detail.setVisitStatus("opd");
                    setSaveAdminTCaseDetail(case_detail,"_temp");
                }
//                v_case_detail.add(case_detail);
            }
            v_visit = config1.getPatientVisit(branch_id, visit_date,"101");//´Ö§ OPD
            for( int i=0;i<=v_visit.size()-1;i++){
                patient_visit = (PatientVisit)v_visit.get(i);
                if(patient_visit.getVisitPaidId().equals("02") || patient_visit.getVisitPaidId().equals("05")
                        || patient_visit.getVisitPaidId().equals("13") || patient_visit.getVisitPaidId().equals("15")
                        || patient_visit.getVisitPaidId().equals("18")){
                    case_detail.setBranchId(branch_id);
                    case_detail.setCaseDetailActive("1");
                    case_detail.setCaseDetailId("");
                    case_detail.setCaseId("");
                    case_detail.setPatientFullnamet(patient_visit.getPatientNamet());
                    case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setVisitClinicId(patient_visit.getVisitClinicId());
                    case_detail.setVisitClinicNamet(patient_visit.getVisitClinicNamet());
                    case_detail.setVisitDate(patient_visit.getVisitDate());
                    case_detail.setVisitTime(patient_visit.getVisitTime());
                    case_detail.setVisitPaidId(patient_visit.getVisitPaidId());
                    case_detail.setVisitPaidNamet(patient_visit.getVisitPaidNamet());
    //                case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setPatientVn(patient_visit.getVisitVn());
                    case_detail.setDepartmentId("101");
                    case_detail.setDepartmentNamet("OPD");
                    case_detail.setVisitStatus("opd");
                    setSaveAdminTCaseDetail(case_detail,"_temp");
                }
//                v_case_detail.add(case_detail);
            }
            v_visit = config1.getPatientVisit(branch_id, visit_date,"103");//´Ö§ ER
            for( int i=0;i<=v_visit.size()-1;i++){
                patient_visit = (PatientVisit)v_visit.get(i);
                if(patient_visit.getVisitPaidId().equals("02") || patient_visit.getVisitPaidId().equals("05")
                        || patient_visit.getVisitPaidId().equals("13") || patient_visit.getVisitPaidId().equals("15")
                        || patient_visit.getVisitPaidId().equals("18")){
                    case_detail.setBranchId(branch_id);
                    case_detail.setCaseDetailActive("1");
                    case_detail.setCaseDetailId("");
                    case_detail.setCaseId("");
                    case_detail.setPatientFullnamet(patient_visit.getPatientNamet());
                    case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setVisitClinicId(patient_visit.getVisitClinicId());
                    case_detail.setVisitClinicNamet(patient_visit.getVisitClinicNamet());
                    case_detail.setVisitDate(patient_visit.getVisitDate());
                    case_detail.setVisitTime(patient_visit.getVisitTime());
                    case_detail.setVisitPaidId(patient_visit.getVisitPaidId());
                    case_detail.setVisitPaidNamet(patient_visit.getVisitPaidNamet());
    //                case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setPatientVn(patient_visit.getVisitVn());
                    case_detail.setDepartmentId("103");
                    case_detail.setDepartmentNamet("ER");
                    case_detail.setVisitStatus("opd");
                    setSaveAdminTCaseDetail(case_detail,"_temp");
                }
            }
            v_visit = config1.getPatientVisit(branch_id, visit_date,"110");//´Ö§ PCU
            for( int i=0;i<=v_visit.size()-1;i++){
                patient_visit = (PatientVisit)v_visit.get(i);
                if(patient_visit.getVisitPaidId().equals("02") || patient_visit.getVisitPaidId().equals("05")
                        || patient_visit.getVisitPaidId().equals("13") || patient_visit.getVisitPaidId().equals("15")
                        || patient_visit.getVisitPaidId().equals("18")){
                    case_detail.setBranchId(branch_id);
                    case_detail.setCaseDetailActive("1");
                    case_detail.setCaseDetailId("");
                    case_detail.setCaseId("");
                    case_detail.setPatientFullnamet(patient_visit.getPatientNamet());
                    case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setVisitClinicId(patient_visit.getVisitClinicId());
                    case_detail.setVisitClinicNamet(patient_visit.getVisitClinicNamet());
                    case_detail.setVisitDate(patient_visit.getVisitDate());
                    case_detail.setVisitTime(patient_visit.getVisitTime());
                    case_detail.setVisitPaidId(patient_visit.getVisitPaidId());
                    case_detail.setVisitPaidNamet(patient_visit.getVisitPaidNamet());
    //                case_detail.setPatientHn(patient_visit.getPatientHn());
                    case_detail.setPatientVn(patient_visit.getVisitVn());
                    case_detail.setDepartmentId("110");
                    case_detail.setDepartmentNamet("PCU");
                    case_detail.setVisitStatus("opd");
                    setSaveAdminTCaseDetail(case_detail,"_temp");
                }
            }
            if(diff_date>0){
                v_visit = config1.SearchPaitentinWard(branch_id, visit_date,visit_date,"case_old",visit_date,"","");//´Ö§ IPD
            }
            else {
                v_visit = config1.SearchPaitentinWard(branch_id, visit_date,"","case_in_ward","","","");//´Ö§ IPD
            }
            
            for( int i=0;i<=v_visit.size()-1;i++){
                patient_visit = (PatientVisit)v_visit.get(i);
                if(patient_visit.getVisitPaidId().equals("02") || patient_visit.getVisitPaidId().equals("05")
                        || patient_visit.getVisitPaidId().equals("13") || patient_visit.getVisitPaidId().equals("15")
                        || patient_visit.getVisitPaidId().equals("18")){
                    case_detail.setBranchId(branch_id);
                    case_detail.setCaseDetailActive("1");
                    case_detail.setCaseDetailId("");
                    case_detail.setCaseId("");
                    case_detail.setPatientFullnamet(patient_visit.getPatientNamet());
                    case_detail.setPatientHn(patient_visit.getPatientHn());
//                    case_detail.setVisitClinicId(patient_visit.getVisitClinicId());
//                    case_detail.setVisitClinicNamet(patient_visit.getVisitClinicNamet());
//                    case_detail.setVisitDate(patient_visit.getVisitDate());
//                    case_detail.setVisitTime(patient_visit.getVisitTime());
                    case_detail.setVisitPaidId(patient_visit.getVisitPaidId());
                    case_detail.setVisitPaidNamet(patient_visit.getVisitPaidNamet());
    //                case_detail.setPatientHn(patient_visit.getPatientHn());
//                    case_detail.setPatientVn(patient_visit.getVisitVn());
                    case_detail.setDepartmentId(patient_visit.getVisitClinicId());
                    case_detail.setDepartmentNamet(patient_visit.getVisitClinicNamet());
                    case_detail.setVisitStatus("ipd");
                    setSaveAdminTCaseDetail(case_detail,"_temp");
                }
            }
//            for(int i=0;i<=v_case_detail.size()-1;i++){
//                case_detail = (AdminTCaseDetail)v_case_detail.get(i);
//                setSaveAdminTCaseDetail(case_detail,"_temp");
//            }
            v_case_detail = new Vector();
            v_case_detail = getAdminTCaseDetail("","_temp");

        } catch(Exception ex){
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_case_detail;
    }
    public void setDeleteCaseDetail(String flagpage) {
        Connection conn;
        Statement st;
        String sql="";
        AdminTCaseDetail case_detail = new AdminTCaseDetail();
        try {
            sql="Delete From "+case_detail.getAdminTCaseDetail()+flagpage;
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            st.executeUpdate(sql);
            conn.close();
        }
        catch(Exception ex){
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String setSaveCase(String branch_id, String case_id, String remark, String description, String case_active){
        //String case_id="";
        Vector v_case_detail = new Vector();
        AdminTCase case1 = new AdminTCase();
        AdminTCaseDetail case_detail = new AdminTCaseDetail();
        try {
            case1 = getCaseCount(branch_id,case_id, "");
            case1.setDescription(description);
            case1.setRemark(remark);
            case1.setCaseId(case_id);
            case1.setBranchId(branch_id);
            if(case_active.equals("")){
                case1.setCaseActive("1");
            }
            else{
                case1.setCaseActive(case_active);
            }
            case_id= setSaveAdminTCase(case1, "");
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return case_id;
    }
    public String setSaveCaseImport(String branch_id, String visit_date, String remark, String description, String case_active){
        String case_id="";
        Vector v_case_detail = new Vector();
        AdminTCase case1 = new AdminTCase();
        AdminTCaseDetail case_detail = new AdminTCaseDetail();
        try {
            case1 = getCaseCount(branch_id,"", "_temp");
            case1.setDescription(description);
            case1.setRemark(remark);
            case1.setBranchId(branch_id);
            case1.setCaseDate(visit_date);
            if(case_active.equals("")){
                case1.setCaseActive("1");
            }
            else{
                case1.setCaseActive(case_active);
            }
            case_id= setSaveAdminTCase(case1, "");
            v_case_detail = getAdminTCaseDetail("","_temp");
            for(int i=0;i<=v_case_detail.size()-1;i++) {
                case_detail = (AdminTCaseDetail)v_case_detail.get(i);
                case_detail.setCaseId(case_id);
                setSaveAdminTCaseDetail(case_detail,"");
            }
            setDeleteCaseDetail("_temp");
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return case_id;
    }
    public AdminTCase getCaseCount(String branch_id,String case_id, String flagpage){
        Connection conn;
        Statement st;
        String sql="";
        Double cnt = 0.0;
//        PatientViewByFN patientviewbyfn = new PatientViewByFN();
        try {
            sql="select count("+casedetail.getFDepartmentId()+") as cnt_dept, "+casedetail.getFDepartmentId()+" "
                +"From "+casedetail.getAdminTCaseDetail() +flagpage+" "
                +"Where "+casedetail.getFCaseId()+" = '"+case_id+"' and "+casedetail.getFBranchId()+"='"+branch_id+"' "
                +"and "+casedetail.getFVisitStatus()+" = 'opd' "
                +"Group By "+casedetail.getFDepartmentId();
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()) {
                if(rs.getString(casedetail.getFDepartmentId()).equals("115")){
                    case1.setCntDental(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("103")){
                    case1.setCntEr(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("101")){
                    case1.setCntOpd(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("110")){
                    case1.setCntPcu(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("111")){
                    case1.setCntCheckup(Double.parseDouble(rs.getString("cnt_dept")));
                }
            }
            rs.close();
            sql="select count("+casedetail.getFVisitPaidId()+") as cnt_paid, "+casedetail.getFVisitPaidId()+" "
                +"From "+casedetail.getAdminTCaseDetail() +flagpage+" "
                +"Where "+casedetail.getFCaseId()+" = '"+case_id+"' "
                +"and "+casedetail.getFVisitStatus()+" = 'opd' "
                +"Group By "+casedetail.getFVisitPaidId();
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                if(rs.getString(casedetail.getFVisitPaidId()).equals("02")||rs.getString(casedetail.getFVisitPaidId()).equals("18")){
                    case1.setCntCash(case1.getCntCash()+Double.parseDouble(rs.getString("cnt_paid")));
                }
                else if(rs.getString(casedetail.getFVisitPaidId()).equals("13")){
                    case1.setCntFunds(Double.parseDouble(rs.getString("cnt_paid")));
                }
                else if(rs.getString(casedetail.getFVisitPaidId()).equals("05")||rs.getString(casedetail.getFVisitPaidId()).equals("15")){
                    case1.setCntCompany(case1.getCntCompany()+Double.parseDouble(rs.getString("cnt_paid")));
                }
            }
            rs.close();
            sql="select count("+casedetail.getFDepartmentId()+") as cnt_dept, "+casedetail.getFDepartmentId()+" "
                +"From "+casedetail.getAdminTCaseDetail() +flagpage+" "
                +"Where "+casedetail.getFCaseId()+" = '"+case_id+"' and "+casedetail.getFBranchId()+"='"+branch_id+"' "
                +"and "+casedetail.getFVisitStatus()+" = 'ipd' "
                +"Group By "+casedetail.getFDepartmentId();
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                if(rs.getString(casedetail.getFDepartmentId()).equals("107")){ //bangna1.ward3b
                    case1.setCntW3M(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("114")){//bangna1.wardns
                    case1.setCntW3N(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("108")){//bangna1.ward3c
                    case1.setCntW3W(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("109")){//bangna1.ward4b
                    case1.setCntW4S(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("104")){//bangna1.ward4a
                    case1.setCntW4UC(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("106")){//bangna1.ward6a
                    case1.setCntW6UC(Double.parseDouble(rs.getString("cnt_dept")));
                }
                else if(rs.getString(casedetail.getFDepartmentId()).equals("113")){//bangna1.wardicu
                    case1.setCntWICU(Double.parseDouble(rs.getString("cnt_dept")));
                }
                
            }
            rs.close();
            conn.close();
        }
        catch(Exception ex){
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return case1;
    }

}
