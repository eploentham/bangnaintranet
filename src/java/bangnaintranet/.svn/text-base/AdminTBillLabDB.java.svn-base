/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.lang.String;
import java.sql.*;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pop
 */
public class AdminTBillLabDB {
    Config1 config1 = new Config1();
    AdminTBillLab admintbilllab = new AdminTBillLab();
    AdminTBillLabDetail admintbilllabdetail = new AdminTBillLabDetail();
    public String getMaxRowAdminTBillLab(){
        String sql="", max="";
        try {
            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+admintbilllab.getFBillLabId()+") as cnt From "+admintbilllab.getAdminTBillLab();
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
            conn.close();
            if(max!=null){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "11100001";
            }
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String getMaxRowAdminTBillLabDetail(Connection conn1){
        String sql="", max="";
        try {
            Connection conn;
            if(conn1!=null){
                conn = config1.getConnectionBangna();
            }
            else{
                conn = conn1;
            }
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+admintbilllabdetail.getFBillLabDetailId()+") as cnt From "
                    +admintbilllabdetail.getAdminTBillLabDetail();
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
            if(max!=null && !max.equals("")){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "11200001";
            }
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public AdminTBillLab getBillLabByPK(String wound_care_id){
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            admintbilllab = new AdminTBillLab();
            String sql="";
            sql="Select * "
                +"From "+admintbilllab.getAdminTBillLab()+" as nr "
                +"Where "+admintbilllab.getFBillLabId()+" = '"+wound_care_id+"' ";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admintbilllab = new AdminTBillLab();
                admintbilllab.setBillLabId(config1.StringNull(rs.getString(admintbilllab.getFBillLabId())));
                admintbilllab.setBillLabDescription(config1.StringNull(rs.getString(admintbilllab.getFBillLabDescription())));
                admintbilllab.setBillLabDate(config1.StringNull(rs.getString(admintbilllab.getFBillLabDate())));
                admintbilllab.setBillLabMonth(config1.StringNull(rs.getString(admintbilllab.getFBillLabMonth())));
                admintbilllab.setBillLabYear(config1.StringNull(rs.getString(admintbilllab.getFBillLabYear())));

                admintbilllab.setBillLabPeriod(config1.StringNull(rs.getString(admintbilllab.getFBillLabPeriod())));
                admintbilllab.setBillLabActive(config1.StringNull(rs.getString(admintbilllab.getFBillLabActive())));
                admintbilllab.setBillLabRemark(config1.StringNull(rs.getString(admintbilllab.getFBillLabRemark())));
                admintbilllab.setBillLabStatus(config1.StringNull(rs.getString(admintbilllab.getFBillLabStatus())));
                admintbilllab.setDateBillMake(config1.StringNull(rs.getString(admintbilllab.getFDateBillMake())));

                admintbilllab.setDateBillReceive(config1.StringNull(rs.getString(admintbilllab.getFDateBillReceive())));
                admintbilllab.setUserIdModify(config1.StringNull(rs.getString(admintbilllab.getFUserIdModify())));
                admintbilllab.setDateCreate(config1.StringNull(rs.getString(admintbilllab.getFDateCreate())));
                admintbilllab.setDateModify(config1.StringNull(rs.getString(admintbilllab.getFDateModify())));
                admintbilllab.setDateCancel(config1.StringNull(rs.getString(admintbilllab.getFDateCancel())));

                admintbilllab.setTotalAmountApprove(Double.parseDouble(rs.getString(admintbilllab.getFTotalAmountApprove())));
                admintbilllab.setTotalAmountReceive(Double.parseDouble(rs.getString(admintbilllab.getFTotalAmountReceive())));
                admintbilllab.setTotalRecordApprove(Integer.parseInt(rs.getString(admintbilllab.getFTotalRecordApprove())));
                admintbilllab.setTotalRecordReceive(Integer.parseInt(rs.getString(admintbilllab.getFTotalRecordReveive())));
                admintbilllab.setUserIdCancel(config1.StringNull(rs.getString(admintbilllab.getFUserIdCancel())));

                admintbilllab.setUserIdCreate(config1.StringNull(rs.getString(admintbilllab.getFUserIdCreate())));
                admintbilllab.setTotalRecordUnApprove(Double.parseDouble(rs.getString(admintbilllab.getFTotalRecordUnApprove())));
                admintbilllab.setTotalAmountUnApprove(Double.parseDouble(rs.getString(admintbilllab.getFTotalAmountUnApprove())));
                admintbilllab.setBranchId(config1.StringNull(rs.getString(admintbilllab.getFBranchId())));
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admintbilllab;
    }
    public Vector getBillLab(String branch_id,String awhere, String field){
        Connection conn;
        Vector v_admintbilllab = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            admintbilllab = new AdminTBillLab();
            String sql="";
            if(field.equals("year")){
                sql="Select * "
                +"From "+admintbilllab.getAdminTBillLab()+" as nr "
                +"Where "+admintbilllab.getFBillLabYear()+" = '"
                + awhere + "' and " +admintbilllab.getFBillLabActive()+" = '1' and "+admintbilllab.getFBranchId() +" = '"+branch_id + "' "
                +"Order By "+admintbilllab.getFBillLabId()+" desc";
            }
            else{
                sql="Select * "
                +"From "+admintbilllab.getAdminTBillLab()+" as nr "
                +"Where "+admintbilllab.getFBillLabActive()+" = '1' and "+admintbilllab.getFBranchId() +" = '"+branch_id + "' "
                +"Order By "+admintbilllab.getBillLabId()+" desc";
            }
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admintbilllab = new AdminTBillLab();
                admintbilllab.setBillLabId(config1.StringNull(rs.getString(admintbilllab.getFBillLabId())));
                admintbilllab.setBillLabDescription(config1.StringNull(rs.getString(admintbilllab.getFBillLabDescription())));
                admintbilllab.setBillLabDate(config1.StringNull(rs.getString(admintbilllab.getFBillLabDate())));
                admintbilllab.setBillLabMonth(config1.StringNull(rs.getString(admintbilllab.getFBillLabMonth())));
                admintbilllab.setBillLabYear(config1.StringNull(rs.getString(admintbilllab.getFBillLabYear())));

                admintbilllab.setBillLabPeriod(config1.StringNull(rs.getString(admintbilllab.getFBillLabPeriod())));
                admintbilllab.setBillLabActive(config1.StringNull(rs.getString(admintbilllab.getFBillLabActive())));
                admintbilllab.setBillLabRemark(config1.StringNull(rs.getString(admintbilllab.getFBillLabRemark())));
                admintbilllab.setBillLabStatus(config1.StringNull(rs.getString(admintbilllab.getFBillLabStatus())));
                admintbilllab.setDateBillMake(config1.StringNull(rs.getString(admintbilllab.getFDateBillMake())));

                admintbilllab.setDateBillReceive(config1.StringNull(rs.getString(admintbilllab.getFDateBillReceive())));
                admintbilllab.setUserIdModify(config1.StringNull(rs.getString(admintbilllab.getFUserIdModify())));
                admintbilllab.setDateCreate(config1.StringNull(rs.getString(admintbilllab.getFDateCreate())));
                admintbilllab.setDateModify(config1.StringNull(rs.getString(admintbilllab.getFDateModify())));
                admintbilllab.setDateCancel(config1.StringNull(rs.getString(admintbilllab.getFDateCancel())));

                admintbilllab.setTotalAmountApprove(Double.parseDouble(rs.getString(admintbilllab.getFTotalAmountApprove())));
                admintbilllab.setTotalAmountReceive(Double.parseDouble(rs.getString(admintbilllab.getFTotalAmountReceive())));
                admintbilllab.setTotalRecordApprove(Integer.parseInt(rs.getString(admintbilllab.getFTotalRecordApprove())));
                admintbilllab.setTotalRecordReceive(Integer.parseInt(rs.getString(admintbilllab.getFTotalRecordReveive())));
                admintbilllab.setUserIdCancel(config1.StringNull(rs.getString(admintbilllab.getFUserIdCancel())));

                admintbilllab.setUserIdCreate(config1.StringNull(rs.getString(admintbilllab.getFUserIdCreate())));
                admintbilllab.setTotalRecordUnApprove(Double.parseDouble(rs.getString(admintbilllab.getFTotalRecordUnApprove())));
                admintbilllab.setTotalAmountUnApprove(Double.parseDouble(rs.getString(admintbilllab.getFTotalAmountUnApprove())));
                admintbilllab.setBranchId(config1.StringNull(rs.getString(admintbilllab.getFBranchId())));
                
                v_admintbilllab.add(admintbilllab);
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_admintbilllab;
    }
    public AdminTBillLabDetail getBillLabDetailByPK(String bill_lab_detail_id, Connection conn){
//        Connection conn;
        try {
//            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            admintbilllabdetail = new AdminTBillLabDetail();
            String sql="";
            sql="Select * "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail()+" as nr "
                +"Where "+admintbilllabdetail.getFBillLabDetailId()+" = '"+bill_lab_detail_id+"' ";
                //+"Order By "+admintbilllabdetail.getBillLabDetailId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admintbilllabdetail = new AdminTBillLabDetail();
                admintbilllabdetail.setBillLabId(config1.StringNull(rs.getString(admintbilllabdetail.getFBillLabId())));
                admintbilllabdetail.setBillLabDetailId(config1.StringNull(rs.getString(admintbilllabdetail.getFBillLabDetailId())));
                admintbilllabdetail.setDateOrder(config1.StringNull(rs.getString(admintbilllabdetail.getFDateOrder())));
                admintbilllabdetail.setLabDetailActive(config1.StringNull(rs.getString(admintbilllabdetail.getFLabDetailActive())));
                admintbilllabdetail.setLabId(config1.StringNull(rs.getString(admintbilllabdetail.getFLabId())));

                admintbilllabdetail.setLabNamet(config1.StringNull(rs.getString(admintbilllabdetail.getFLabNamet())));
                admintbilllabdetail.setLabStatus(config1.StringNull(rs.getString(admintbilllabdetail.getFLabStatus())));
                admintbilllabdetail.setNettotalApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalReceive())));
                admintbilllabdetail.setNettotalReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalApprove())));
                admintbilllabdetail.setPatientFullnamet(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientFullNamet())));

                admintbilllabdetail.setPatientHnNo(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientHNNO())));
                admintbilllabdetail.setPatientVn(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientnVN())));
                admintbilllabdetail.setPriceApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFPriceApprove())));
                admintbilllabdetail.setPriceDiscountReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFPriceDiscountReceive())));
                admintbilllabdetail.setPriceNormalReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFPriceNormalReceive())));

                admintbilllabdetail.setQtyApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFQtyApprove())));
                admintbilllabdetail.setQtyReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFQtyReceive())));
                admintbilllabdetail.setStatusApprove(config1.StringNull(rs.getString(admintbilllabdetail.getFStatusApprove())));
                //admintbilllabdetail.setTotalRecordReceive(Integer.parseInt(rs.getString(admintbilllabdetail.getFTotalRecordReveive())));
                //admintbilllabdetail.setUserIdCancel(config1.StringNull(rs.getString(admintbilllabdetail.getFUserIdCancel())));

                //admintbilllabdetail.setUserIdCreate(config1.StringNull(rs.getString(admintbilllabdetail.getFUserIdCreate())));
                //admintbilllab.setUserIdModify(config1.StringNull(rs.getString(admintbilllab.WoundCareStatus())));
                //admintbilllab.set(config1.StringNull(rs.getString(admintbilllab.WoundCareStatus())));
                }
            rs.close();
//            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admintbilllabdetail;
    }
    public Vector getBillLabDetail(String awhere, String day, String field){
        Connection conn;
        String sql="";
        Vector v_billlab_detail = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            admintbilllabdetail = new AdminTBillLabDetail();
            if(field.equals("bill_lab")){
                sql="Select * "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail()+" as nr "
                +"Where "+admintbilllabdetail.getFBillLabId()+" = '"+awhere+"' "
                +"Order By "+admintbilllabdetail.getBillLabDetailId()+" desc";
            }
            else if(field.equals("date")){
                sql="Select "+admintbilllabdetail.getFDateOrder() + ", "
                        +admintbilllabdetail.getFBillLabId() + ", "
                        +admintbilllabdetail.getFStatusAudit() + ", "
                +"count("+admintbilllabdetail.getFPatientHNNO()+") as patient_hn_no, "
                +"count("+admintbilllabdetail.getFLabId()+") as lab_id, "
                +"sum("+admintbilllabdetail.getFNetTotalApprove()+") as nettotal_approve, "
                +"sum("+admintbilllabdetail.getFNetTotalReceive()+") as nettotal_receive "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail()+" as adbl "
                +"Where "+admintbilllabdetail.getFBillLabId()+" = '"+awhere+"' "
                +"Group By "+admintbilllabdetail.getFDateOrder() + ", "
                +admintbilllabdetail.getFBillLabId() + ", "
                +admintbilllabdetail.getFStatusAudit() + " "
                +"Order By "+admintbilllabdetail.getFDateOrder()+" desc";
            }
            else if(field.equals("date_audit_uncorrect")){
                sql="Select "+admintbilllabdetail.getFStatusAudit()+", "
                +"count("+admintbilllabdetail.getFLabId()+") as lab_id "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail()+" as adbl "
                +"Where "+admintbilllabdetail.getFBillLabId()+" = '"+awhere+"' and "
                +admintbilllabdetail.getFDateOrder() + " = '"+day+"' "
                +"Group By "+admintbilllabdetail.getFDateOrder() + ", "
                +admintbilllabdetail.getFStatusAudit() + " "
                +"Order By "+admintbilllabdetail.getFStatusAudit();
            }
            else if(field.equals("date_day")){
                    sql="Select * "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail()+" as nr "
                +"Where "+admintbilllabdetail.getFBillLabId()+" = '"+awhere+"' and "
                +admintbilllabdetail.getFDateOrder()+ " = '"+day + "' "
                +"Order By "+admintbilllabdetail.getFBillLabDetailId()+" desc";
                }
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admintbilllabdetail = new AdminTBillLabDetail();
                if(field.equals("bill_lab") || field.equals("date_day")){
                    admintbilllabdetail.setBillLabId(config1.StringNull(rs.getString(admintbilllabdetail.getFBillLabId())));
                    admintbilllabdetail.setBillLabDetailId(config1.StringNull(rs.getString(admintbilllabdetail.getFBillLabDetailId())));
                    admintbilllabdetail.setDateOrder(config1.StringNull(rs.getString(admintbilllabdetail.getFDateOrder())));
                    admintbilllabdetail.setLabDetailActive(config1.StringNull(rs.getString(admintbilllabdetail.getFLabDetailActive())));
                    admintbilllabdetail.setLabId(config1.StringNull(rs.getString(admintbilllabdetail.getFLabId())));

                    admintbilllabdetail.setLabNamet(config1.StringNull(rs.getString(admintbilllabdetail.getFLabNamet())));
                    admintbilllabdetail.setLabStatus(config1.StringNull(rs.getString(admintbilllabdetail.getFLabStatus())));
                    admintbilllabdetail.setNettotalApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalReceive())));
                    admintbilllabdetail.setNettotalReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalApprove())));
                    admintbilllabdetail.setPatientFullnamet(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientFullNamet())));

                    admintbilllabdetail.setPatientHnNo(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientHNNO())));
                    admintbilllabdetail.setPatientVn(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientnVN())));
                    admintbilllabdetail.setPriceApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFPriceApprove())));
                    admintbilllabdetail.setPriceDiscountReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFPriceDiscountReceive())));
                    admintbilllabdetail.setPriceNormalReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFPriceNormalReceive())));

                    admintbilllabdetail.setQtyApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFQtyApprove())));
                    admintbilllabdetail.setQtyReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFQtyReceive())));
                    admintbilllabdetail.setStatusApprove(config1.StringNull(rs.getString(admintbilllabdetail.getFStatusApprove())));
                }
                else if(field.equals("date")){
                    admintbilllabdetail.setBillLabId(config1.StringNull(rs.getString(admintbilllabdetail.getFBillLabId())));
                    admintbilllabdetail.setDateOrder(config1.StringNull(rs.getString(admintbilllabdetail.getFDateOrder())));
                    admintbilllabdetail.setPatientHnNo(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientHNNO())));
                    admintbilllabdetail.setLabId(config1.StringNull(rs.getString(admintbilllabdetail.getFLabId())));
                    admintbilllabdetail.setStatusAudit(config1.StringNull(rs.getString(admintbilllabdetail.getFStatusAudit())));
                    admintbilllabdetail.setNettotalReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalReceive())));
                    admintbilllabdetail.setNettotalApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalApprove())));
                }
                else if(field.equals("date_audit_uncorrect")){
                    admintbilllabdetail.setStatusAudit(config1.StringNull(rs.getString(admintbilllabdetail.getFStatusAudit())));
                    admintbilllabdetail.setLabId(config1.StringNull(rs.getString(admintbilllabdetail.getFLabId())));
//                    admintbilllabdetail.setPatientHnNo(config1.StringNull(rs.getString(admintbilllabdetail.getFPatientHNNO())));
//                    admintbilllabdetail.setNettotalApprove(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalReceive())));
//                    admintbilllabdetail.setNettotalReceive(Double.parseDouble(rs.getString(admintbilllabdetail.getFNetTotalApprove())));
                }
                
                //admintbilllabdetail.setTotalRecordReceive(Integer.parseInt(rs.getString(admintbilllabdetail.getFTotalRecordReveive())));
                //admintbilllabdetail.setUserIdCancel(config1.StringNull(rs.getString(admintbilllabdetail.getFUserIdCancel())));

                //admintbilllabdetail.setUserIdCreate(config1.StringNull(rs.getString(admintbilllabdetail.getFUserIdCreate())));
                //admintbilllab.setUserIdModify(config1.StringNull(rs.getString(admintbilllab.WoundCareStatus())));
                //admintbilllab.set(config1.StringNull(rs.getString(admintbilllab.WoundCareStatus())));
                v_billlab_detail.add(admintbilllabdetail);
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_billlab_detail;
    }
    public String SaveBillLab(AdminTBillLab item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        AdminTBillLab billlab = new AdminTBillLab();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            billlab = getBillLabByPK(item.getBillLabId());
//            attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
            item.setBillLabDescription(item.getBillLabDescription().replace("'", "''"));
//            itemdetail.setAttendRemark(itemdetail.getAttendRemark().replace("'", "''"));
//            itemdetail.setMaDescription(itemdetail.getMaDescription().replace("'", "''"));
//            itemdetail.setMaRemark(itemdetail.getMaRemark().replace("'", "''"));
//            itemdetail.setVendorRemark(itemdetail.getVendorRemark().replace("'", "''"));
//            itemdetail.setSymptoms(itemdetail.getSymptoms().replace("'", "''"));

            if(billlab.getBillLabId().equals("")){
                max = getMaxRowAdminTBillLab();
                sql="Insert Into "+billlab.getAdminTBillLab()+"("
                        +billlab.getFBillLabId()+", "+billlab.getFBillLabDescription()+", "
                        +billlab.getFBillLabDate()+","+ billlab.getFBillLabActive()+","
                        +billlab.getFBillLabMonth()+","+ billlab.getFBillLabPeriod()+","
                        +billlab.getFBillLabYear()+","+ billlab.getFBillLabRemark()+","
                        +billlab.getFBillLabStatus()+","+ billlab.getFDateBillMake()+","
                        +billlab.getFDateBillReceive()+","+ billlab.getFDateCancel()+","
                        +billlab.getFDateCreate()+","+ billlab.getFDateModify()+","
                        +billlab.getFTotalAmountApprove()+","+ billlab.getFTotalAmountReceive()+","
                        +billlab.getFUserIdCancel()+","+ billlab.getFUserIdCreate()+","
                        +billlab.getFUserIdModify()+","+billlab.getFBranchId()+") "
                        +"Values('"+max+"','"+item.getBillLabDescription()+"','"
                        +item.getBillLabDate() + "','"+ item.getBillLabActive()+"','"
                        +item.getBillLabMonth() + "','"+ item.getBillLabPeriod()+"','"
                        +item.getBillLabYear() + "','"+ item.getBillLabRemark()+"','"
                        +item.getBillLabStatus() + "','"+ item.getDateBillMake()+"','"
                        +item.getDateBillReceive() + "','"+ item.getDateCancel()+"','"
                        +item.getDateCreate() + "','"+ item.getDateModify()+"','"
                        +item.getTotalAmountApprove() + "','"+ item.getTotalAmountReceive()+"','"
                        +item.getUserIdCancel() + "','"+ item.getUserIdCreate()+"','"
                        +item.getUserIdModify()+"','"+item.getBranchId()+"')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+billlab.getAdminTBillLab()+" set "
                //+woundcaredetail.PatientHnNo()+" = '"+itemdetail.getPatientHnNo()+"', "
                +billlab.getFBillLabDescription()+" = '"+item.getBillLabDescription()+"', "
                +billlab.getFBillLabDate()+" = '"+item.getBillLabDate()+"', "
                +billlab.getFBillLabActive()+" = '"+item.getBillLabActive()+"', "
                +billlab.getFBillLabMonth()+" = '"+item.getBillLabMonth()+"', "
                +billlab.getFBillLabPeriod()+" = '"+item.getBillLabPeriod()+"', "
                +billlab.getFBillLabYear()+" = '"+item.getBillLabYear()+"', "
                +billlab.getFBillLabRemark()+" = '"+item.getBillLabRemark()+"', "
                +billlab.getFBillLabStatus()+" = '"+item.getBillLabStatus()+"', "
                +billlab.getFDateBillMake()+" = '"+item.getDateBillMake()+"', "
                +billlab.getFDateBillReceive()+" = '"+item.getDateBillReceive()+"', "
                +billlab.getFDateCancel()+" = '"+item.getDateCancel()+"', "
                +billlab.getFDateCreate()+" = '"+item.getDateCreate()+"', "
                +billlab.getFDateModify()+" = '"+item.getDateModify()+"', "
                +billlab.getFTotalAmountApprove()+" = '"+item.getTotalAmountApprove()+"', "
                +billlab.getFTotalAmountReceive()+" = '"+item.getTotalAmountReceive()+"', "
                +billlab.getFUserIdCancel()+" = '"+item.getUserIdCancel()+"', "
                +billlab.getFUserIdCreate()+" = '"+item.getUserIdCreate()+"', "
                +billlab.getFUserIdModify()+" = '"+item.getUserIdModify()+"', "
                +billlab.getFBranchId()+" = '"+item.getBranchId()+"' "
                +"Where "+billlab.getFBillLabId()+" = '"+item.getBillLabId()+"'";
                max = item.getBillLabId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public int setUpdateBillLabDetailStatusAudit(String bill_lab_detail_id, String data){
        int chk=0;
        String sql="";
        Connection conn;
        Statement st;
        AdminTBillLabDetail billlabdetail = new AdminTBillLabDetail();
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql = "Update "+billlabdetail.getAdminTBillLabDetail()+" set "
                +billlabdetail.getFStatusAudit() +" = '"+data+"', "
                +billlabdetail.getFNetTotalAudit() + "="+billlabdetail.getFNetTotalReceive() + ", "
                +billlabdetail.getFPriceAudit() + "="+billlabdetail.getFPriceNormalReceive() + " "
                +"Where "+billlabdetail.getFBillLabDetailId() +" = '"+bill_lab_detail_id+"'";
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
    public int setUpdateBillLabDetailStatusApprove(String bill_lab_detail_id, String data, String priceapprove){
        int chk=0;
        String sql="";
        Connection conn;
        Statement st;
        AdminTBillLabDetail billlabdetail = new AdminTBillLabDetail();
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql = "Update "+billlabdetail.getAdminTBillLabDetail()+" set "
                +billlabdetail.getFStatusApprove() +" = '"+data+"' "
                +billlabdetail.getFPriceApprove() + "="+priceapprove+ " "
                +"Where "+billlabdetail.getFBillLabDetailId() +" = '"+bill_lab_detail_id+"'";
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
    public int SaveBillLabDetail(Connection conn,Statement st, AdminTBillLabDetail item) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="";
        AdminTBillLabDetail billlabdetail = new AdminTBillLabDetail();
//        Connection conn;
//        Statement st;
//        try {
//            conn = config1.getConnectionBangna();
//            st = conn.createStatement();
            billlabdetail = getBillLabDetailByPK(item.getBillLabDetailId(), conn);
//            attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
            item.setLabNamet(item.getLabNamet().replace("'", "''"));
//            itemdetail.setAttendRemark(itemdetail.getAttendRemark().replace("'", "''"));
//            itemdetail.setMaDescription(itemdetail.getMaDescription().replace("'", "''"));
//            itemdetail.setMaRemark(itemdetail.getMaRemark().replace("'", "''"));
//            itemdetail.setVendorRemark(itemdetail.getVendorRemark().replace("'", "''"));
//            itemdetail.setSymptoms(itemdetail.getSymptoms().replace("'", "''"));

            if(billlabdetail.getBillLabDetailId().equals("")){
                String max = getMaxRowAdminTBillLabDetail(conn);
                sql="Insert Into "+billlabdetail.getAdminTBillLabDetail()+"("
                        +billlabdetail.getFBillLabDetailId()+", "+billlabdetail.getFBillLabId()+", "
                        +billlabdetail.getFDateOrder()+","+ billlabdetail.getFLabDetailActive()+","
                        +billlabdetail.getFLabId()+","+ billlabdetail.getFLabNamet()+","
                        +billlabdetail.getFLabStatus()+","+ billlabdetail.getFNetTotalApprove()+","
                        +billlabdetail.getFNetTotalReceive()+","+ billlabdetail.getFPatientFullNamet()+","
                        +billlabdetail.getFPatientHNNO()+","+ billlabdetail.getFPatientnVN()+","
                        +billlabdetail.getFPriceApprove()+","+ billlabdetail.getFPriceDiscountReceive()+","
                        +billlabdetail.getFPriceNormalReceive()+","+ billlabdetail.getFQtyApprove()+","
                        +billlabdetail.getFQtyReceive()+","+ billlabdetail.getFStatusApprove()+", "
                        +billlabdetail.getFStatusAudit()+ ") "
                        +"Values('"+max+"','"+item.getBillLabId()+"','"
                        +item.getDateOrder() + "','"+ item.getLabDetailActive()+"','"
                        +item.getLabId() + "','"+ item.getLabNamet()+"','"
                        +item.getLabStatus() + "',"+ item.getNettotalApprove()+","
                        +item.getNettotalReceive() + ",'"+ item.getPatientFullnamet()+"','"
                        +item.getPatientHnNo() + "','"+ item.getPatientVn()+"','"
                        +item.getPriceApprove() + "','"+ item.getPriceDiscountReceive()+"',"
                        +item.getPriceNormalReceive() + ","+ item.getQtyApprove()+","
                        +item.getQtyReceive() + ",'"+ item.getStatusApprove()+"','"
                        +item.getStatusAudit()+ "')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+billlabdetail.getAdminTBillLabDetail()+" set "
                //+woundcaredetail.PatientHnNo()+" = '"+itemdetail.getPatientHnNo()+"', "
                +billlabdetail.getFBillLabId()+" = '"+item.getBillLabId()+"', "
                +billlabdetail.getFDateOrder()+" = '"+item.getDateOrder()+"', "
                +billlabdetail.getFLabDetailActive()+" = '"+item.getLabDetailActive()+"', "
                +billlabdetail.getFLabId()+" = '"+item.getLabId()+"', "
                +billlabdetail.getFLabNamet()+" = '"+item.getLabNamet()+"', "
                +billlabdetail.getFLabStatus()+" = '"+item.getLabStatus()+"', "
//                +billlabdetail.getFNetTotalApprove()+" = '"+item.getNettotalApprove()+"', "
                +billlabdetail.getFNetTotalReceive()+" = '"+item.getNettotalReceive()+"', "
                +billlabdetail.getFPatientFullNamet()+" = '"+item.getPatientFullnamet()+"', "
                +billlabdetail.getFPatientHNNO()+" = '"+item.getPatientHnNo()+"', "
                +billlabdetail.getFPatientnVN()+" = '"+item.getFPatientnVN()+"', "
//                +billlabdetail.getFPriceApprove()+" = '"+item.getPriceApprove()+"', "
                +billlabdetail.getFPriceDiscountReceive()+" = '"+item.getPriceDiscountReceive()+"', "
                +billlabdetail.getFPriceNormalReceive()+" = '"+item.getPriceNormalReceive()+"', "
//                +billlabdetail.getFQtyApprove()+" = '"+item.getQtyApprove()+"', "
                +billlabdetail.getFQtyReceive()+" = '"+item.getQtyReceive()+"', "
//                +billlabdetail.getFStatusApprove()+" = '"+item.getStatusApprove()+"', "
                +billlabdetail.getFStatusAudit()+" = '"+item.getStatusAudit()+"' "
                +"Where "+billlabdetail.getFBillLabDetailId()+" = '"+item.getBillLabDetailId()+"'";
            }
            chk = st.executeUpdate(sql);
//            conn.close();
//        } catch (Exception ex) {
//            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
//        }
        return chk;
    }
    public Integer setSaveBillLabDetailFromMDB(String bill_lab_id, String filename) throws Exception{
        Integer chk=0;
        Connection connbilllab;
        String sql="";
        try {
            //AdminTBillLabDB admintbilllabdb = new AdminTBillLabDB();
            connbilllab = config1.getConnectionBillLab(filename);
            Statement stbilllab;
            ResultSet rsbilllab;
            stbilllab = connbilllab.createStatement();
            sql = "Select * From billlab";
            rsbilllab = stbilllab.executeQuery(sql);
            while(rsbilllab.next()){
                admintbilllabdetail = new AdminTBillLabDetail();
                admintbilllabdetail.setBillLabDetailId("");
                admintbilllabdetail.setBillLabId(bill_lab_id);
                admintbilllabdetail.setDateOrder(config1.DateFormatShow2DB(rsbilllab.getString("dateorder"),"ddMMyyyy"));
                admintbilllabdetail.setLabDetailActive("1");
                admintbilllabdetail.setLabId(rsbilllab.getString("labid"));
                admintbilllabdetail.setLabNamet(rsbilllab.getString("labnamet"));
                admintbilllabdetail.setLabStatus("1");
                admintbilllabdetail.setNettotalApprove(0.0);
                admintbilllabdetail.setNettotalReceive(Double.parseDouble(rsbilllab.getString("netprice")));
                admintbilllabdetail.setPatientFullnamet(rsbilllab.getString("fullnamet"));
                admintbilllabdetail.setPatientHnNo(rsbilllab.getString("hn_no"));
                admintbilllabdetail.setPatientVn("");
                admintbilllabdetail.setPriceApprove(0.0);
                admintbilllabdetail.setPriceDiscountReceive(Double.parseDouble(rsbilllab.getString("discountcash")));
                admintbilllabdetail.setPriceNormalReceive(Double.parseDouble(rsbilllab.getString("price1")));
                admintbilllabdetail.setQtyApprove(0.0);
                admintbilllabdetail.setQtyReceive(0.0);
                admintbilllabdetail.setStatusApprove("0");
                SaveBillLabDetail(connbilllab, stbilllab, admintbilllabdetail);
            }
            rsbilllab.close();
            connbilllab.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
            throw (ex);
        }
        return chk;
    }
    public Integer setSaveBillLabDetailFromText(String bill_lab_id, String filename) throws FileNotFoundException{
        Integer chk=0,ii=0;
        String UTF8Str="", nettotal="", recordtotal="";
        BufferedReader input;
        BufferedReader in = null;
        Connection conn;
        Statement st;
            try {
                conn = config1.getConnectionBangna();
                st = conn.createStatement();
                input = new BufferedReader(new FileReader(filename));
                String line = "";
//                StringBuilder line1 = new StringBuilder();
                
                String a = "", num="", date="", year="";
                //in = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "iso-8859-1"));
                //String[] aa ;
//                try {
//                    line1.append(input.readLine());
                    while ((line = input.readLine()) != null) {
//                    while (!line1.equals(null)) {
                        chk++;
                        try{
                            //UTF8Str = new String(line.getBytes(), "UTF-8");
                            admintbilllabdetail = new AdminTBillLabDetail();
                            admintbilllabdetail.setBillLabId(bill_lab_id);
                            StringTokenizer stz = new StringTokenizer(line, "|");
                            while (stz.hasMoreTokens()) {
                                a = stz.nextToken();
                                if(chk>=7163){
                                    //nettotal="";
                                    ii = stz.countTokens();
                                }
                                if(a.equals("Nettotal")){
                                    //nettotal = st.nextToken();
                                    nettotal = stz.nextToken();
                                    recordtotal = stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                }
                                else if(a.equals("code")){
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                    stz.nextToken();
                                }
                                else{
                                    admintbilllabdetail.setPatientVn(a);
                                    date = config1.DateFormatShow2DB(stz.nextToken(),"ddMMyyyy");
                                    if(date.length()>=10){
                                        year = date.substring(0, 4);
                                        year = String.valueOf(Integer.parseInt(year) -543);
                                        date = year+date.substring(4, date.length());
                                        admintbilllabdetail.setDateOrder(date);
                                        admintbilllabdetail.setPatientHnNo(stz.nextToken());
                                        admintbilllabdetail.setPatientFullnamet(stz.nextToken());
                                        stz.nextToken();
                                        admintbilllabdetail.setLabId(stz.nextToken());
                                        admintbilllabdetail.setLabNamet(stz.nextToken());

                                        num = stz.nextToken();
                                        if(num.equals("")){
                                            num="0.0";
                                        }
                                        admintbilllabdetail.setPriceDiscountReceive(Double.parseDouble(num));

                                        stz.nextToken();
                                        stz.nextToken();
                                        stz.nextToken();
                                        num = stz.nextToken();
                                        if(num.equals("")) {
                                            num="0.0";
                                        }
                                        admintbilllabdetail.setPriceNormalReceive(Double.parseDouble(num));
                                        stz.nextToken();
                                        num = stz.nextToken();
                                        if(num.equals("")){
                                            num="0.0";
                                        }
                                        admintbilllabdetail.setNettotalReceive(Double.parseDouble(num));
                                        stz.nextToken();
                                        stz.nextToken();
                                        admintbilllabdetail.setPatientFullnamet("");
                                        admintbilllabdetail.setLabNamet("");
                                        admintbilllabdetail.setStatusApprove("0");
                                        admintbilllabdetail.setStatusAudit("0");
                                        SaveBillLabDetail(conn,st,admintbilllabdetail);
                                    }
                                    else{
                                        stz.nextToken();
                                        stz.nextToken();
                                        stz.nextToken();
                                        stz.nextToken();
                                        
                                        stz.nextToken();
                                        if(stz.hasMoreTokens()){
                                            stz.nextToken();
                                            stz.nextToken();
                                            stz.nextToken();
                                            stz.nextToken();
                                            stz.nextToken();
                                            stz.nextToken();
                                            stz.nextToken();
                                            stz.nextToken();
                                        }
                                    }
                                }
                            }
                        } catch(Exception ex){
                            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
                        } finally {

                        }
                    }
                    input.close();
//                } catch (Exception ex) {
//                    Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
//                } finally {
//
//                }
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        } finally {

        }
        if(!nettotal.equals("")){
            recordtotal = String.valueOf(Integer.parseInt(recordtotal)-1);
            setUpdateBillLabReveive(bill_lab_id, nettotal, recordtotal);
        }
        return chk;
    }
    public String getTRBillLabDetail(String bill_lab_id, String date_order, String field){
        String txt="",sql="", date_order1="",txt_uncorrect="'", row_color="", font_color1="";
        String txt_color="", txt_color1="", selected="";
        Vector v_bill_lab_detail = new Vector();
        AdminTBillLabDetail bill_lab_detail = new AdminTBillLabDetail();
        v_bill_lab_detail = getBillLabDetail(bill_lab_id,date_order, field);
        boolean chk=false;
        for(int i=0;i<=v_bill_lab_detail.size()-1;i++) {
            bill_lab_detail = (AdminTBillLabDetail) v_bill_lab_detail.get(i);
            date_order1 = bill_lab_detail.getDateOrder();
            date_order1 = date_order1.replace("-", "");
            //bill_lab_id1 = bill_lab_detail.getBillLabId();
            if(field.equals("date")){
                try {
                    AdminTBillLabDetail bill_lab_detail_uncorrect = new AdminTBillLabDetail();
                    Vector v_bill_lab_detail_uncorrect = new Vector();
                    txt_uncorrect="";
                    if(bill_lab_detail.getDateOrder().equals("2009-07-06")){
                        sql="2009-07-06";
                    }
                    if (bill_lab_detail.getStatusAudit().equals("1")){
                        v_bill_lab_detail_uncorrect = getBillLabDetail(bill_lab_id,bill_lab_detail.getDateOrder(), "date_audit_uncorrect");
                        for(int j=0;j<=v_bill_lab_detail_uncorrect.size()-1;j++){
                            bill_lab_detail_uncorrect = (AdminTBillLabDetail) v_bill_lab_detail_uncorrect.get(j);
                            txt_uncorrect+="<td align='center' width='20'>" +txt_color+ bill_lab_detail_uncorrect.getLabId()+txt_color1 + "</td>";
                            if(v_bill_lab_detail_uncorrect.size()==1){
                                txt_uncorrect+="<td align='center' width='20'>0</td>";
                                chk=false;
                                row_color="";
                                txt_color="";
                                txt_color1="";
                            }
                            else{
                                chk=true;
                                row_color = "bgcolor='#FCF1F6'";
                                txt_color="<font color='#FF7F00'>";//#CC3333
                                txt_color1="</font>";
                            }
                        }
                    }
                    
                    if(txt_uncorrect.equals("")){
                        txt_uncorrect="<td align='center' width='20'>0</td><td align='center' width='20'>0</td>";
                    }
                    txt += "<tr  class='style14r' "+row_color+"><td align='center'>" + String.valueOf(i + 1) + "</td>"
+ "<td align='center' width='8'><A HREF='javascript:changedetailshow("
+ date_order1 + "," + bill_lab_detail.getBillLabId() + ")'  >"
    +txt_color+ config1.DateFormatDB2Show(bill_lab_detail.getDateOrder(), "ddMMyyyy") +txt_color1+ "</A></td>"    
    + "<td align='center' width='10'>"+txt_color + bill_lab_detail.getPatientHnNo() +txt_color1+ "</td>"
    + "<td align='center' width='10'>"+txt_color + bill_lab_detail.getLabId() +txt_color1+ "</td>"
    +"<td align='center' width='10'>"+txt_color + bill_lab_detail.getNettotalReceive() +txt_color1+ "</td>"    ;
    
    txt = txt+txt_uncorrect
+ "<td align='center' width='10'>"+txt_color + bill_lab_detail.getNettotalApprove() +txt_color1+ "</td></tr>";
//                txt += "<tr  class='style14r'><td align='center'>"+String.valueOf(i+1)+"</td>"
//                +"<td align='center' width='10'><A HREF='javascript:window.open(admin_bill_lab_detail_show.jsp?date_order="
//                +bill_lab_detail.getDateOrder()+"&bill_lab_id="+bill_lab_detail.getBillLabId()+",_blank,width=500, height=150, left=300,top=100,channelmode=no,status=no,fullscreen=no,menubar=no,resizable=no,scrollbars=no,location=no,directories=no,true);'>"
//                +bill_lab_detail.getDateOrder()+"</A></td>"
//                +"<td align='center' width='10'>"+bill_lab_detail.getPatientHnNo()+"</td><td></td>"
//                +"<td align='center' width='10'>"+bill_lab_detail.getNettotalReceive()+"</td>"
//                +"<td align='center' width='10'>"+bill_lab_detail.getNettotalApprove()+"</td></tr>";
                } catch (Exception ex) {
                    Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
                }
//                txt += "<tr  class='style14r'><td align='center'>"+String.valueOf(i+1)+"</td>"
//                +"<td align='center' width='10'><A HREF='javascript:window.open(admin_bill_lab_detail_show.jsp?date_order="
//                +bill_lab_detail.getDateOrder()+"&bill_lab_id="+bill_lab_detail.getBillLabId()+",_blank,width=500, height=150, left=300,top=100,channelmode=no,status=no,fullscreen=no,menubar=no,resizable=no,scrollbars=no,location=no,directories=no,true);'>"
//                +bill_lab_detail.getDateOrder()+"</A></td>"
//                +"<td align='center' width='10'>"+bill_lab_detail.getPatientHnNo()+"</td><td></td>"
//                +"<td align='center' width='10'>"+bill_lab_detail.getNettotalReceive()+"</td>"
//                +"<td align='center' width='10'>"+bill_lab_detail.getNettotalApprove()+"</td></tr>";
            }
            else if(field.equals("date_day")){
                if(bill_lab_detail.getStatusApprove().equals("3")){
                    row_color = "bgcolor='#FCF1F6'";
                    txt_color="<font color='#FF7F00'>";//#CC3333
                    txt_color1="</font>";
                }
                else{
                    row_color="";
                    txt_color="";
                    txt_color1="";
                }
                if(bill_lab_detail.getStatusApprove().equals("1")){
                    selected="checked='checked'";
                }
                else{
                    selected="";
                }
                txt += "<tr  class='style14r' "+row_color+"><td align='center'>"+String.valueOf(i+1)+"</td>"
                +"<td align='center' width='50'><label>"
        +"<input type='checkbox' name='chk_repair_status' value='on' id='chk_status_approve_"
    +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' name='chk_status_approve_"
    +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' "+selected+">"
        +"อนุมัติ</label></td>"
                +"<td align='center' width='10'><A HREF='javascript:changedetailshow("
                +date_order1+","+bill_lab_detail.getPatientHnNo()+");'>"
                +txt_color+bill_lab_detail.getPatientHnNo()+txt_color1+"</A></td>"
                +"<td align='left' width='200'>"+txt_color+bill_lab_detail.getPatientFullnamet()+txt_color1+"</td>"
                +"<td align='center' width='25'>"+txt_color+bill_lab_detail.getLabId()+txt_color1+"</td>"
                +"<td align='left' width='200'>"+txt_color+bill_lab_detail.getLabNamet()+txt_color1+"</td>"
                +"<td align='center' width='10'>"+txt_color+bill_lab_detail.getQtyReceive()+txt_color1+"</td>"
                +"<td align='center' width='10'>"
    +"<input type='input' value='"+bill_lab_detail.getQtyApprove()+"' id='txt_qty_approve_"
    +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' name='txt_qty_approve_"
    +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' align='right' size='1' ></td>"
                +"<td align='center' width='50'>"+txt_color+bill_lab_detail.getPriceNormalReceive()+txt_color1+"</td>"
                +"<td align='center' width='50'>"+txt_color+bill_lab_detail.getPriceDiscountReceive()+txt_color1+"</td>"
                +"<td align='center' width='50'  bgcolor='#FCF1F6'>"+txt_color+bill_lab_detail.getNettotalReceive()+txt_color1+"</td>"
                +"<td align='center' width='50'>"
        +"<input type='input' value='"+bill_lab_detail.getPriceApprove()+"' id='txt_price_approve_"
        +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' name='txt_price_approve_"
        +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' align='right' size='5'></td>"
                +"<td align='center' width='50' bgcolor='#FCF1F6'>"
        +"<input type='input' value='"+bill_lab_detail.getNettotalApprove()+"' id='txt_nettotal_approve_"
        +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' name='txt_nettotal_approve_"
        +bill_lab_detail.getPatientHnNo()+"_"+bill_lab_detail.getLabId()+"' align='right' size='5'> </td></tr>";
            }
            if(i==4){
                sql="";
            }
        }
        if(txt.equals("")){
            txt="<td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>";
        }
        return txt;
    }
    public void setPatientFullNameT(String branch_id,String bill_lab_id){
        String sql="", patient_fullnamet="", patient_hn_no="";
        //Integer i=0;
        Connection connmainhis, connbangna;
        Statement stmainhis, stbangna;
        ResultSet rsmainhis, rsbangna;
        Vector v_patient = new Vector();
        AdminTBillLabDetail bill_lab_detail = new AdminTBillLabDetail();
        //Vector v_full_namet = new Vector();
        try {
            connmainhis = config1.getConnectionMainHIS(branch_id);
            connbangna = config1.getConnectionBangna();
            stbangna = connbangna.createStatement();
            stmainhis = connmainhis.createStatement();
            sql="Select "+admintbilllabdetail.getFPatientHNNO()+" "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail()+" "
                +"Where "+admintbilllabdetail.getFBillLabId()+"='"+bill_lab_id+"' "
                +"Group By "+admintbilllabdetail.getFPatientHNNO();
            rsbangna = stbangna.executeQuery(sql);
            while(rsbangna.next()){
                bill_lab_detail = new AdminTBillLabDetail();
                patient_hn_no = rsbangna.getString("patient_hn_no");
                bill_lab_detail.setPatientHnNo(patient_hn_no);
                v_patient.add(bill_lab_detail);
                sql="Update ";
            }
            rsbangna.close();
            connbangna.close();


            for(int i=0;i<=v_patient.size()-1;i++){
                bill_lab_detail = (AdminTBillLabDetail)v_patient.get(i);
                sql="Select pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' ' + pm01.mnc_lname_t as patient_fullnamet "
                    +"From patient_m01 as pm01 inner join "
                    +"patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                    +"Where pm01.mnc_hn_no ='"+bill_lab_detail.getPatientHnNo()+"'";
                rsmainhis = stmainhis.executeQuery(sql);
                while(rsmainhis.next()){
                    patient_fullnamet = rsmainhis.getString("patient_fullnamet");
                    bill_lab_detail.setPatientFullnamet(patient_fullnamet);
                    v_patient.set(i, bill_lab_detail);
                }
                rsmainhis.close();
            }
            connmainhis.close();

            connbangna = config1.getConnectionBangna();
            stbangna = connbangna.createStatement();
            for(int i=0;i<=v_patient.size()-1;i++){
                bill_lab_detail = (AdminTBillLabDetail)v_patient.get(i);
                sql="Update "+admintbilllabdetail.getAdminTBillLabDetail()
                    +" Set "+admintbilllabdetail.getFPatientFullNamet()+"='"+bill_lab_detail.getPatientFullnamet()+"' "
                    +"Where "+admintbilllabdetail.getFPatientHNNO()+"='"+bill_lab_detail.getPatientHnNo()+"'";
                stbangna.executeUpdate(sql);
            }
            connbangna.close();
            
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setLabNameT(String branch_id,String bill_lab_id){
        String sql="", lab_namet="", lab_id="";
        //Integer i=0;
        Connection connmainhis, connbangna;
        Statement stmainhis, stbangna;
        ResultSet rsmainhis, rsbangna;
        Vector v_lab = new Vector();
        AdminTBillLabDetail bill_lab_detail = new AdminTBillLabDetail();
        //Vector v_full_namet = new Vector();
        try {
            connmainhis = config1.getConnectionMainHIS(branch_id);
            connbangna = config1.getConnectionBangna();
            stbangna = connbangna.createStatement();
            stmainhis = connmainhis.createStatement();
            sql="Select "+admintbilllabdetail.getFLabId()+" "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail()+" "
                +"Where "+admintbilllabdetail.getFBillLabId()+"='"+bill_lab_id+"' "
                +"Group By "+admintbilllabdetail.getFLabId();
            rsbangna = stbangna.executeQuery(sql);
            while(rsbangna.next()){
                bill_lab_detail = new AdminTBillLabDetail();
                lab_id = rsbangna.getString("lab_id");
                bill_lab_detail.setLabId(lab_id);
                v_lab.add(bill_lab_detail);
                sql="Update ";
            }
            rsbangna.close();
            connbangna.close();

            for(int i=0;i<=v_lab.size()-1;i++){
                bill_lab_detail = (AdminTBillLabDetail)v_lab.get(i);
                sql="Select mnc_lb_dsc "
                    +"From lab_m01 "
                    +"Where mnc_lb_cd ='"+bill_lab_detail.getLabId()+"'";
                rsmainhis = stmainhis.executeQuery(sql);
                while(rsmainhis.next()){
                    lab_namet = rsmainhis.getString("mnc_lb_dsc");
                    bill_lab_detail.setLabNamet(lab_namet);
                    v_lab.set(i, bill_lab_detail);
                }
                rsmainhis.close();
            }
            connmainhis.close();

            connbangna = config1.getConnectionBangna();
            stbangna = connbangna.createStatement();
            for(int i=0;i<=v_lab.size()-1;i++){
                bill_lab_detail = (AdminTBillLabDetail)v_lab.get(i);
                lab_namet =bill_lab_detail.getLabNamet();
                lab_namet = lab_namet.replace("'", "''");
                sql="Update "+admintbilllabdetail.getAdminTBillLabDetail()
                    +" Set "+admintbilllabdetail.getFLabNamet()+"='"+lab_namet+"' "
                    +"Where "+admintbilllabdetail.getFLabId()+"='"+bill_lab_detail.getLabId()+"'";
                stbangna.executeUpdate(sql);
            }
            connbangna.close();

        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public String getBillLabMainHIS(String branch_id, String date_order, String hn_no, String lab_id){
        String sql="", txt="";
        Integer i=0;
        boolean chk=false;
        Connection connmainhis;
        Statement st;
        ResultSet rs;
        try {
            connmainhis = config1.getConnectionMainHIS(branch_id);
            if(lab_id.equals("")){
                sql = "SELECT (pm02.mnc_pfix_dsc + ' ' + pm26.MNC_DOT_FNAME + ' ' + pm26.MNC_DOT_LNAME) as doctor_name, "
                    +"fm02.MNC_FN_STS, labm02.MNC_LB_PRI, labm01.mnc_lb_dsc , labt01.MNC_ORD_DOT, labt01.mnc_patname, labt02.mnc_lb_cd "
                    +"FROM LAB_T01 as labt01 "
                    +"left JOIN LAB_T02 as labt02 ON labt01.MNC_REQ_YR = labt02.MNC_REQ_YR "
                    +"AND labt01.MNC_REQ_NO = labt02.MNC_REQ_NO AND labt01.MNC_REQ_DAT = labt02.MNC_REQ_DAT "
                    +"left JOIN LAB_M02 as labm02 ON labt02.MNC_LB_CD = labm02.MNC_LB_CD "
                    +"left JOIN finance_m02 as fm02 ON labt01.MNC_FN_TYP_CD = fm02.MNC_FN_TYP_CD "
                    +"left JOIN patient_m26 as pm26 ON labt01.MNC_DOT_CD = pm26.MNC_DOT_CD "
                    +"left join lab_m01 as labm01 on labm01.mnc_lb_cd = labm02.mnc_lb_cd "
                    +"left join patient_m02 as pm02 on pm26.mnc_dot_pfix = pm02.mnc_pfix_cd "
                    +"WHERE (labt01.MNC_REQ_STS <> 'C') AND (labt01.MNC_REQ_DAT between '"+date_order+"' and '"+date_order+"') "
                    +"and labt01.mnc_hn_no = '"+hn_no+"' "
                    +"Order by pm26.MNC_DOT_FNAME, pm26.MNC_DOT_LNAME, fm02.MNC_FN_STS, labm01.mnc_lb_dsc ";
            }
            else{
                sql = "SELECT (pm02.mnc_pfix_dsc + ' ' + pm26.MNC_DOT_FNAME + ' ' + pm26.MNC_DOT_LNAME) as doctor_name, "
                    +"fm02.MNC_FN_STS, labm02.MNC_LB_PRI, labm01.mnc_lb_dsc , labt01.MNC_ORD_DOT, labt01.mnc_patname, labt02.mnc_lb_cd "
                    +"FROM LAB_T01 as labt01 "
                    +"left JOIN LAB_T02 as labt02 ON labt01.MNC_REQ_YR = labt02.MNC_REQ_YR "
                    +"AND labt01.MNC_REQ_NO = labt02.MNC_REQ_NO AND labt01.MNC_REQ_DAT = labt02.MNC_REQ_DAT "
                    +"left JOIN LAB_M02 as labm02 ON labt02.MNC_LB_CD = labm02.MNC_LB_CD "
                    +"left JOIN finance_m02 as fm02 ON labt01.MNC_FN_TYP_CD = fm02.MNC_FN_TYP_CD "
                    +"left JOIN patient_m26 as pm26 ON labt01.MNC_DOT_CD = pm26.MNC_DOT_CD "
                    +"left join lab_m01 as labm01 on labm01.mnc_lb_cd = labm02.mnc_lb_cd "
                    +"left join patient_m02 as pm02 on pm26.mnc_dot_pfix = pm02.mnc_pfix_cd "
                    +"WHERE (labt01.MNC_REQ_STS <> 'C') AND (labt01.MNC_REQ_DAT between '"+date_order+"' and '"+date_order+"') "
                    +"and labt01.mnc_hn_no = '"+hn_no+"' and labt02.mnc_lb_cd = '"+lab_id+"' "
                    +"Order by pm26.MNC_DOT_FNAME, pm26.MNC_DOT_LNAME, fm02.MNC_FN_STS, labm01.mnc_lb_dsc ";
            }
            st = connmainhis.createStatement();
            rs = st.executeQuery(sql);
            chk=false;
            while(rs.next()){
                i++;
                txt += "<tr  class='style14r'><td align='center'>" + i.toString() + "</td>"
                + "<td align='left' width='200'>"
                    + rs.getString("doctor_name") + "</td>"
                    + "<td align='center' width='7'>" + rs.getString("MNC_FN_STS") + "</td>"
                    + "<td align='left' width='100'>" + rs.getString("mnc_patname") + "</td>"
                    + "<td align='center' width='10'>" + rs.getString("mnc_lb_cd") + "</td>"
                    + "<td align='left' width='80'>" + rs.getString("mnc_lb_dsc") + "</td>"
                    + "<td align='center' width='50'>" + rs.getString("MNC_ORD_DOT") + "</td>"
                    + "<td align='center' width='50'>" + rs.getString("MNC_LB_PRI") + "</td></tr>";
                chk=true;
            }
            rs.close();
            connmainhis.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
       return txt;
    }
    public void setBillLabAudit(String branch_id, String bill_lab_id, String date_order, String field) {
        //asdfjalksdfjal;sdkfjla;skdfjla;sdkf
        String sql="", date_order1="", txt="";
        boolean chk=false;
        Vector v_bill_lab_detail = new Vector();
        AdminTBillLabDetail bill_lab_detail = new AdminTBillLabDetail();
        v_bill_lab_detail = getBillLabDetail(bill_lab_id,date_order, field);
        for(int i=0;i<=v_bill_lab_detail.size()-1;i++) {
            bill_lab_detail = (AdminTBillLabDetail) v_bill_lab_detail.get(i);
            date_order1 = bill_lab_detail.getDateOrder();
            date_order1 = date_order1.replace("-", "");
            chk=false;
            //bill_lab_id1 = bill_lab_detail.getBillLabId();
            if(field.equals("date_day")){
                txt=getBillLabMainHIS(branch_id,date_order,bill_lab_detail.getPatientHnNo(),bill_lab_detail.getLabId());
                if(!txt.equals("")){
                    setUpdateBillLabDetailStatusAudit(bill_lab_detail.getBillLabDetailId(),"1");
                }
                else{
                    setUpdateBillLabDetailStatusAudit(bill_lab_detail.getBillLabDetailId(),"3");
                }
            }
            else if(field.equals("date")){
                
            }
        }
//        setUpdateBillLabAudit(bill_lab_id);
    }
    public void setBillLabAuditAllBillId(String branch_id, String bill_lab_id){
        String sql="", date_order="", txt="";
        boolean chk=false;
        Vector v_bill_lab_detail = new Vector();
        AdminTBillLabDetail bill_lab_detail = new AdminTBillLabDetail();
        //AdminTBillLabDetail bill_lab_detail1 = new AdminTBillLabDetail();
        v_bill_lab_detail = getBillLabDetail(bill_lab_id,"", "date");
        for(int i=0;i<=v_bill_lab_detail.size()-1;i++){
            bill_lab_detail = (AdminTBillLabDetail)v_bill_lab_detail.get(i);
            date_order = bill_lab_detail.getDateOrder();
            setBillLabAudit(branch_id, bill_lab_id, date_order,"date_day");
        }
    }
    public void setBillLabApproveAllBillId(String bill_lab_id){
        String sql="", date_order="", txt="";
        boolean chk=false;
        Connection conn;
        Statement st;
        Vector v_bill_lab_detail = new Vector();
        AdminTBillLabDetail bill_lab_detail = new AdminTBillLabDetail();
        //AdminTBillLabDetail bill_lab_detail1 = new AdminTBillLabDetail();
        sql="Update "+bill_lab_detail.getAdminTBillLabDetail()
            +" Set "+bill_lab_detail.getFStatusApprove()+" = '1', "
            +bill_lab_detail.getFPriceApprove()+" = "+bill_lab_detail.getFPriceAudit() + ", "
            +bill_lab_detail.getFNetTotalApprove()+" = "+bill_lab_detail.getFNetTotalAudit()+" "
            +"Where "+bill_lab_detail.getFBillLabId() + "='"+bill_lab_id+"' and "
            +bill_lab_detail.getFStatusApprove()+"='0' and "+bill_lab_detail.getFStatusAudit()+"='1'";
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            st.executeUpdate(sql);
            sql="Update "+bill_lab_detail.getAdminTBillLabDetail()
                +" Set "+bill_lab_detail.getFStatusApprove()+" = '3' "
                +"Where "+bill_lab_detail.getFBillLabId() + "='"+bill_lab_id+"' and "
                +bill_lab_detail.getFStatusApprove()+"='0' and "+bill_lab_detail.getFStatusAudit()+"='3'";
            st.executeUpdate(sql);
            setUpdateBillLabApprove(bill_lab_id,conn);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setUpdateBillLabApprove(String bill_lab_id,Connection conn){
        String sql="", cnt_receive="", cnt_approve="", cnt_unapprove="";
        String sum_approve="", sum_unapprove="",sum_receive="";
//        Connection conn;
        Statement st;
        ResultSet rs;
        try {
//            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql = "Select count("+admintbilllabdetail.getFBillLabId()+") as cnt_approve, "
                    +admintbilllabdetail.getFStatusApprove() + ", "
                    +"sum("+admintbilllabdetail.getFNetTotalApprove() + ") as sum_approve "
                +"From "+admintbilllabdetail.getAdminTBillLabDetail() +" "
                +"Where "+admintbilllabdetail.getFBillLabId()+" ='"+bill_lab_id+"' "
                +"Group By "+admintbilllabdetail.getFStatusApprove();
            rs = st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString(admintbilllabdetail.getFStatusApprove()).equals("1")){
                    cnt_approve=rs.getString("cnt_approve");
                    sum_approve=rs.getString("sum_approve");
                }
                else if(rs.getString(admintbilllabdetail.getFStatusApprove()).equals("3")){
                    cnt_unapprove=rs.getString("cnt_approve");
                    sum_unapprove=rs.getString("sum_approve");
                }
            }
            rs.close();
            if(cnt_approve == null ||cnt_approve.equals("")){
                cnt_approve="0";
            }
            if(cnt_unapprove == null ||cnt_unapprove.equals("")){
                cnt_unapprove="0";
            }
            if(sum_unapprove == null ||sum_unapprove.equals("")){
                sum_unapprove="0";
            }
            if(sum_approve == null ||sum_approve.equals("")){
                sum_approve="0";
            }
            sql="Select count("+admintbilllabdetail.getFBillLabId()+") as cnt_receive, "
                    +"sum("+admintbilllabdetail.getFNetTotalApprove()+") as sum_receive "
                    +"From "+admintbilllabdetail.getAdminTBillLabDetail() +" "
                    +"Where "+admintbilllabdetail.getFBillLabId()+" ='"+bill_lab_id+"'";
            rs = st.executeQuery(sql);
            while(rs.next()){
//                if(rs.getString(admintbilllabdetail.getFStatusApprove()).equals("1")){
                    cnt_receive=rs.getString("cnt_receive");
                    sum_receive=rs.getString("sum_receive");
//                }
            }
            rs.close();
            if(cnt_receive== null ||cnt_receive.equals("")){
                cnt_receive="0";
            }
            
            sql="Update "+admintbilllab.getAdminTBillLab() +" Set "
//                    +admintbilllab.getFTotalRecordReveive()+" = "+cnt_receive+", "                    
//                    +admintbilllab.getFTotalAmountReceive()+" = "+sum_receive+", "
                    +admintbilllab.getFTotalRecordApprove()+" = "+cnt_approve+", "
                    +admintbilllab.getFTotalAmountApprove()+" = "+sum_approve+", "
                    +admintbilllab.getFTotalRecordUnApprove()+" = "+cnt_unapprove+", "
                    +admintbilllab.getFTotalAmountUnApprove()+" = "+sum_unapprove+" "
                    +"Where "+admintbilllab.getFBillLabId()+" = '"+bill_lab_id+"'";
            st.executeUpdate(sql);
//            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setUpdateBillLabReveive(String bill_lab_id,String netotal, String recordtotal){
        Connection conn;
        Statement st;
        String sql="";
        try {
            netotal = netotal.replace(",", "");
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql="Update "+admintbilllab.getAdminTBillLab() +" Set "
                    +admintbilllab.getFTotalRecordReveive()+" = "+recordtotal+", "
                    +admintbilllab.getFTotalAmountReceive()+" = "+netotal+" "
                    +"Where "+admintbilllab.getFBillLabId()+" = '"+bill_lab_id+"'";
            st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void setDeleteBillLabDetailByBillLabId(String bill_lab_id){
        Connection conn;
        Statement st;
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql="Delete From "+admintbilllabdetail.getAdminTBillLabDetail()
                + " Where "+admintbilllabdetail.getFBillLabId() + " ='"+bill_lab_id +"'";
            st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTBillLabDB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
