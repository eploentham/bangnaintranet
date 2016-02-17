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
public class NotiTNotiRepairDB {
    bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
    public NotiTNotiRepair notitnotirepair = new NotiTNotiRepair();
    //public enum

    public String MaxRow(){
        String sql="", max="";
        try {
            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+notitnotirepair.NotoRepairId()+") as cnt From "+notitnotirepair.NotiTNotiRepair();
            rs = st.executeQuery(sql);
            while(rs.next()){
                max = rs.getString("cnt");
            }
            rs.close();
            if(max!=null){
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "10400001";
            }
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public Vector SelectNotiTNotiRepair(String flagShowScreen, String status_it){
        Connection conn;
        Vector v_noti_repair = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            
            String sql="";
            sql="Select nr.*, ma.maintain_namet, depart.department_namet as attend_department_namet, "
                    +"depart.telephone as attenddepartmenttelephone "
                +"From noti_t_noti_repair as nr "
                +"left join b_maintain as ma on nr.maintain_id = ma.maintain_id "
                +"left join b_department as depart on nr.attend_department_id = depart.department_id "
                +"Where nr.active = '1' and show_screen = '"+flagShowScreen+ "' and status_it = '"+status_it+"' "
                +"Order By attend_date desc, attend_time desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                notitnotirepair = new NotiTNotiRepair();
                notitnotirepair.setAttendDate(config1.StringNull(rs.getString(notitnotirepair.AttendDate())));
                notitnotirepair.setAttendTime(config1.StringNull(rs.getString(notitnotirepair.AttendTime())));
                notitnotirepair.setAttendDepartmentNamet(config1.StringNull(rs.getString("attend_department_namet")));
                notitnotirepair.setAttendDescription(config1.StringNull(rs.getString(notitnotirepair.AttendDescription())));
                notitnotirepair.setAttendRemark(config1.StringNull(rs.getString(notitnotirepair.AttendRemark())));
                notitnotirepair.setAttendUserId(config1.StringNull(rs.getString(notitnotirepair.AttendUserId())));
                notitnotirepair.setAttendUserId(config1.StringNull(rs.getString(notitnotirepair.AttendUserId())));
                notitnotirepair.setMaDate(config1.StringNull(rs.getString(notitnotirepair.MaDate())));
                notitnotirepair.setMaUserId(config1.StringNull(rs.getString(notitnotirepair.MaUserId())));
                notitnotirepair.setMaDescription(config1.StringNull(rs.getString(notitnotirepair.MaDescription())));
                notitnotirepair.setNotiRepairId(rs.getString("noti_repair_id"));
                notitnotirepair.setStatus(config1.StringNull(rs.getString(notitnotirepair.Status())));
                notitnotirepair.setStatusRepair(rs.getString(notitnotirepair.StatusRepair()));
                notitnotirepair.setShowScreen(rs.getString(notitnotirepair.ShowScreen()));
                notitnotirepair.setStringency(rs.getString(notitnotirepair.Stringency()));
                notitnotirepair.setAttendDepartmentTelephone(config1.StringNull(rs.getString("attenddepartmenttelephone")));
                notitnotirepair.setStatusIt(config1.StringNull(rs.getString(notitnotirepair.StatusIt())));

                //attend_date = config1.DateFormatDB2Show(attend_date, "ddMMyy");
                //ma_date = config1.DateFormatDB2Show(ma_date, "ddMMyy");
                v_noti_repair.add(notitnotirepair);
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return v_noti_repair;
    }
    public NotiTNotiRepair SelectNotiTNotiRepairByPK(String noti_repair_id){
        String sql="Select nr.*, ma.maintain_namet, depart.department_namet as attend_department_namet,  "
                +"brand.brand_namet,brand.brand_id,type_device.type_device_namet,type_device.type_device_id, "
                +"vendor.vendor_id, vendor_namet "
                +"From "+notitnotirepair.NotiTNotiRepair() +" as nr "
                +"left join b_maintain as ma on nr.maintain_id = ma.maintain_id "
                +"left join b_department as depart on nr.attend_department_id = depart.department_id "
                +"left join noti_b_brand as brand on nr.brand_id = brand.brand_id "
                +"left join noti_b_type_device as type_device on nr.type_device_id = type_device.type_device_id "
                +"left join noti_b_vendor as vendor on nr.vendor_id = vendor.vendor_id "
                + " Where "+notitnotirepair.NotoRepairId()+" = '"+noti_repair_id+"'";
        Connection conn;
        try {
            notitnotirepair = new NotiTNotiRepair();
            notitnotirepair.setNotiRepairId("");
            notitnotirepair.setAttendDescription("");
            notitnotirepair.setAttendRemark("");
            notitnotirepair.setAttendUserId("");
            conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st =  conn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                notitnotirepair.setNotiRepairId(rs.getString(notitnotirepair.NotoRepairId()));
                notitnotirepair.setAttendDescription(config1.StringNull(rs.getString(notitnotirepair.AttendDescription())));
                notitnotirepair.setAttendRemark(config1.StringNull(rs.getString(notitnotirepair.AttendRemark())));
                notitnotirepair.setAttendDate(config1.StringNull(rs.getString(notitnotirepair.AttendDate())));
                notitnotirepair.setAttendTime(config1.StringNull(rs.getString(notitnotirepair.AttendTime())));
                notitnotirepair.setAttendUserId(config1.StringNull(rs.getString(notitnotirepair.AttendUserId())));
                notitnotirepair.setAttendDepartmentId(config1.StringNull(rs.getString(notitnotirepair.AttendDepartmentId())));
                notitnotirepair.setAttendDepartmentNamet(config1.StringNull(rs.getString("attend_department_namet")));

                notitnotirepair.setMaDescription(config1.StringNull(rs.getString(notitnotirepair.MaDescription())));
                notitnotirepair.setMaRemark(config1.StringNull(rs.getString(notitnotirepair.MaRemark())));
                notitnotirepair.setMaDate(config1.StringNull(rs.getString(notitnotirepair.MaDate())));
                notitnotirepair.setMaTime(config1.StringNull(rs.getString(notitnotirepair.MaTime())));
                notitnotirepair.setMaUserId(config1.StringNull(rs.getString(notitnotirepair.MaTime())));
                notitnotirepair.setMaUserId(config1.StringNull(rs.getString(notitnotirepair.MaUserId())));
                notitnotirepair.setMaDepartmentId(config1.StringNull(rs.getString(notitnotirepair.MaDepartmentId())));
                
                notitnotirepair.setActive(config1.StringNull(rs.getString(notitnotirepair.Active())));
                notitnotirepair.setBranchId(config1.StringNull(rs.getString(notitnotirepair.BranchId())));
                notitnotirepair.setBrandId(config1.StringNull(rs.getString(notitnotirepair.BrandId())));
                notitnotirepair.setBrandNamet(config1.StringNull(rs.getString("brand_namet")));
                notitnotirepair.setDateCreate(rs.getString(notitnotirepair.DateCreate()));
                notitnotirepair.setDateModify(rs.getString(notitnotirepair.DateModify()));
                notitnotirepair.setDateCancel(rs.getString(notitnotirepair.DateCancel()));
                notitnotirepair.setMaintainId(config1.StringNull(rs.getString(notitnotirepair.MaintainId())));
                notitnotirepair.setMaintainNamet(config1.StringNull(rs.getString("maintain_namet")));
                notitnotirepair.setModel(config1.StringNull(rs.getString(notitnotirepair.Model())));
                notitnotirepair.setPriceRepair(rs.getDouble(notitnotirepair.PriceRepair()));
                notitnotirepair.setRemarkCancel(config1.StringNull(rs.getString(notitnotirepair.RemarkCancel())));
                notitnotirepair.setRepairStatus(config1.StringNull(rs.getString(notitnotirepair.RepairStatus())));
                notitnotirepair.setSerialNo(config1.StringNull(rs.getString(notitnotirepair.SerialNo())));
                notitnotirepair.setServiceTab(config1.StringNull(rs.getString(notitnotirepair.ServiceTab())));
                notitnotirepair.setStatus(config1.StringNull(rs.getString(notitnotirepair.Status())));
                notitnotirepair.setStatusWarranty(config1.StringNull(rs.getString(notitnotirepair.StatusWarranty())));
                notitnotirepair.setSymptoms(config1.StringNull(rs.getString(notitnotirepair.Symptoms())));
                notitnotirepair.setTypeDeviceId(config1.StringNull(rs.getString(notitnotirepair.TypeDeviceId())));
                notitnotirepair.setTypeDeviceNamet(config1.StringNull(rs.getString("type_device_namet")));
                notitnotirepair.setUserIdCancel(config1.StringNull(rs.getString(notitnotirepair.UserIdcancel())));
                notitnotirepair.setUserIdCreate(config1.StringNull(rs.getString(notitnotirepair.UserIdCreate())));
                notitnotirepair.setUserIdModify(config1.StringNull(rs.getString(notitnotirepair.UserIdModify())));
                notitnotirepair.setVendorId(config1.StringNull(rs.getString(notitnotirepair.VendorId())));
                notitnotirepair.setVendorNamet(config1.StringNull(rs.getString("vendor_namet")));
                notitnotirepair.setVendorRemark(config1.StringNull(rs.getString(notitnotirepair.VendorRemark())));
                notitnotirepair.setStatusRepair(config1.StringNull(rs.getString(notitnotirepair.StatusRepair())));
                notitnotirepair.setShowScreen(config1.StringNull(rs.getString(notitnotirepair.ShowScreen())));
                notitnotirepair.setStatusIt(config1.StringNull(rs.getString(notitnotirepair.StatusIt())));
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return notitnotirepair;
    }
    public int Save(NotiTNotiRepair item, String flagpage){
        int chk=0;
        String sql="", ma_date="", attend_date="";
        NotiTNotiRepair notirepair = new NotiTNotiRepair();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            notirepair = SelectNotiTNotiRepairByPK(item.getNotiRepairId());
            attend_date=config1.DateFormatShow2DB(item.getAttendDate(), "ddMMyyyy");
            item.setAttendDescription(item.getAttendDescription().replace("'", "''"));
            item.setAttendRemark(item.getAttendRemark().replace("'", "''"));
            item.setMaDescription(item.getMaDescription().replace("'", "''"));
            item.setMaRemark(item.getMaRemark().replace("'", "''"));
            item.setVendorRemark(item.getVendorRemark().replace("'", "''"));
            item.setSymptoms(item.getSymptoms().replace("'", "''"));
            if(item.getShowScreen().equals("")){
                item.setShowScreen("1");
            }
            if(notirepair.getNotiRepairId().equals("")) {
                String max = MaxRow();                
                sql="Insert Into "+notirepair.NotiTNotiRepair()+"("
                        +notirepair.NotoRepairId()+", "+notirepair.AttendDescription()+", "
                        +notirepair.AttendDate()+", "+notirepair.AttendRemark()+", "
                        +notirepair.AttendUserId()+", "+notirepair.Active()+", "
                        +notirepair.AttendDepartmentId()+", "+notirepair.Status()+", "
                        +notirepair.AttendTime()+","+notirepair.RemoteIpUserCreate()+", "
                        +notirepair.Stringency()+","+notirepair.ShowScreen()+"," +
                        notirepair.StatusIt()+") "
                        +"Values('"+max+"','"+item.getAttendDescription()+"','"
                        +attend_date +"','"+item.getAttendRemark() +"','"
                        +item.getAttendUserId()+"','"+item.getActive()+"','"
                        +item.getAttendDepartmentId()+"','"+item.getStatus()+"','"
                        +item.getAttendTime()+"','"+item.getRemoteIpUserCreate()+"','"
                        +item.getStringency()+"','"+item.getShowScreen()+"','" +
                        item.getStatusIt()+"')";
            }
            else{
                attend_date=config1.DateFormatShow2DB(item.getAttendDate(), "ddMMyyyy");
                ma_date=config1.DateFormatShow2DB(item.getMaDate(), "ddMMyyyy");
                if(flagpage.equals("viewdetail")) {
                    sql = "Update "+notirepair.NotiTNotiRepair()+" set "
                    +notirepair.AttendDescription()+" = '"+item.getAttendDescription()+"', "
                    +notirepair.AttendRemark()+" = '"+item.getAttendRemark()+"', "
                    +notirepair.AttendUserId()+"  = '"+item.getAttendUserId()+"', "
                    +notirepair.AttendDate()+" = '"+attend_date+"', "
                    +notirepair.ShowScreen()+" = '"+item.getShowScreen()+"', "
                    +notirepair.AttendDepartmentId()+" = '"+item.getAttendDepartmentId()+"' " +
                    "Where "+notirepair.NotoRepairId()+" = '"+item.getNotiRepairId()+"'";
                }
                if(flagpage.equals("adddetail")) {
                    sql = "Update "+notirepair.NotiTNotiRepair()+" set "
                    +notirepair.MaDescription()+" = '"+item.getMaDescription()+"', "
                    +notirepair.MaRemark()+" = '"+item.getMaRemark()+"', "
                    +notirepair.MaUserId()+" = '"+item.getMaUserId()+"', "
                    +notirepair.MaDate()+" = '"+ma_date+"', "
                    +notirepair.MaDepartmentId()+" = '"+item.getMaDepartmentId()+"', "
                    +notirepair.BrandId()+" = '"+item.getBrandId()+"', "
                    +notirepair.SerialNo()+" = '"+item.getSerialNo()+"', "
                    +notirepair.ServiceTab()+" = '"+item.getServiceTab()+"', "
                    +notirepair.TypeDeviceId()+" = '"+item.getTypeDeviceId()+"', "
                    +notirepair.Symptoms()+" = '"+item.getSymptoms()+"', "
                    +notirepair.RepairStatus()+" = '"+item.getRepairStatus()+"', "
                    +notirepair.Status()+" = '"+item.getStatus()+"', "
                    +notirepair.VendorId()+" = '"+item.getVendorId()+"', "
                    +notirepair.VendorRemark()+" = '"+item.getVendorRemark()+"', "
                    +notirepair.PriceRepair()+" = '"+item.getPriceRepair()+"', "
                    +notirepair.StatusWarranty()+" = '"+item.getStatusWarranty()+"', "
                    +notirepair.Model()+" = '"+item.getModel()+"', "
                    +notirepair.ShowScreen()+" = '"+item.getShowScreen()+"', "
                    +notirepair.StatusRepair()+ " = '"+item.getStatusRepair()+"' "                    
                    +"Where "+notirepair.NotoRepairId()+" = '"+item.getNotiRepairId()+"'";
                }
            }
            chk = st.executeUpdate(sql);
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return chk;
    }

}
