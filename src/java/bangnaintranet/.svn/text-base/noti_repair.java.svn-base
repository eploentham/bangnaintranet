package bangnaintranet;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pop
 */

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class noti_repair {
    Config1 config = new Config1();
    private noti_repairDB noti_repairdb = new noti_repairDB();

    private void SetNoti_Repair(noti_repairDB noti_repair, ResultSet rs) throws SQLException {
        noti_repair.setNoti_Repair_ID(rs.getString(noti_repairdb.noti_Repair_ID));
        noti_repair.setAttend_Description(rs.getString(noti_repairdb.Attend_Description));
        noti_repair.setAttend_Remark(rs.getString(noti_repairdb.Attend_Remark));
        noti_repair.setAttend_Date(rs.getString(noti_repairdb.Attend_Date));
        noti_repair.setAttend_Time(rs.getString(noti_repairdb.Attend_Time));
        noti_repair.setAttend_User_ID(rs.getString(noti_repairdb.Attend_User_ID));
        noti_repair.setMA_Description(rs.getString(noti_repairdb.MA_Description));
        noti_repair.setMA_Remark(rs.getString(noti_repairdb.MA_Remark));
        noti_repair.setMA_Date(rs.getString(noti_repairdb.MA_Date));
        noti_repair.setMA_Time(rs.getString(noti_repairdb.MA_Time));
        noti_repair.setMA_User_ID(rs.getString(noti_repairdb.MA_User_ID));
        noti_repair.setMaintain_ID(rs.getString(noti_repairdb.Maintain_ID));
        noti_repair.setDepartment_ID(rs.getString(noti_repairdb.Department_ID));
        noti_repair.setActive(rs.getString(noti_repairdb.Active));
    }
    private String SytaxSelect(String  Flag, String noti_repair_id) {
        String sql="";
        if(Flag.equals("PrimaryKey")){
            sql = "Select * From " + noti_repairdb.noti_Repair + " "
                + "Where " + noti_repairdb.noti_Repair_ID + " = '" + noti_repair_id + "'";
        }
        else if(Flag.equals("All")){
            sql = "Select * From " + noti_repairdb.noti_Repair + " "
                + "Where " + noti_repairdb.Active + " = '1'";
        }
        return sql;
    }
    public String SytaxInsert(noti_repairDB noti_repair){
        String sql="";
        Integer i=0;
        sql="Insert into "+noti_repairdb.noti_Repair+"("+noti_repairdb.noti_Repair_ID+","
                +noti_repairdb.Attend_Description+","+noti_repairdb.Attend_Remark+","
                +noti_repairdb.Attend_Date+","+noti_repairdb.Attend_Time+","
                +noti_repairdb.Attend_User_ID+","
                +noti_repairdb.MA_Description+","+noti_repairdb.MA_Remark+","
                +noti_repairdb.MA_Date+","+noti_repairdb.MA_Time+","
                +noti_repairdb.MA_User_ID+","
                +noti_repairdb.Maintain_ID+","+noti_repairdb.Department_ID+","
                +noti_repairdb.Active+") "
                +"Values('"+noti_repair.getNoti_Repair_ID()+"','"
                +noti_repair.getAttend_Descritpion()+"','"+noti_repair.getAttend_Remark()+"','"
                +noti_repair.getAttend_Date()+"','"+noti_repair.getAttend_Time()+"','"
                +noti_repair.getAttend_User_ID()+"','"
                +noti_repair.getMA_Description()+"','"+noti_repair.getMA_Remark()+"','"
                +noti_repair.getMA_Date()+"','"+noti_repair.getMA_Time()+"','"
                +noti_repair.getMA_User_ID()+"','"
                +noti_repair.getMaintain_ID()+"','"+noti_repair.getDepartment_ID()+"','"
                +noti_repair.getActive()+"')";
        return sql;
    }
    public String SytaxUpdate(noti_repairDB noti_repair){
        String sql="";
        sql="Update "+noti_repairdb.noti_Repair+" Set "
                +noti_repairdb.Attend_Description+"='"+noti_repair.getAttend_Descritpion()+"', "
                +noti_repairdb.Attend_Remark+"='"+noti_repair.getAttend_Remark()+"', "
                +noti_repairdb.Attend_Date+"='"+noti_repair.getAttend_Date()+"', "
                +noti_repairdb.Attend_Time+"='"+noti_repair.getAttend_Time()+"', "
                +noti_repairdb.Attend_User_ID+"='"+noti_repair.getAttend_User_ID()+"', "
                +noti_repairdb.MA_Description+"='"+noti_repair.getMA_Description()+"', "
                +noti_repairdb.MA_Remark+"='"+noti_repair.getMA_Remark()+"', "
                +noti_repairdb.MA_Date+"='"+noti_repair.getMA_Date()+"', "
                +noti_repairdb.MA_Time+"='"+noti_repair.getMA_Time()+"', "
                +noti_repairdb.MA_User_ID+"='"+noti_repair.getMA_User_ID()+"', "
                +noti_repairdb.Maintain_ID+"='"+noti_repair.getMaintain_ID()+"', "
                +noti_repairdb.Department_ID+"='"+noti_repair.getDepartment_ID()+"', "
                +noti_repairdb.Active+"='"+noti_repair.getActive()+"' ";
        return sql;
    }
//    public noti_repairDB InitNoti_Repair(){
//        noti_repair.noti_repair_id="";
//        noti_repair.attend_description="";
//        noti_repair.attend_remark="";
//        noti_repair.attend_date="";
//        noti_repair.attend_time="";
//        noti_repair.attend_user_id="";
//        noti_repair.ma_description="";
//        noti_repair.ma_remark="";
//        noti_repair.ma_date="";
//        noti_repair.ma_time="";
//        noti_repair.ma_user_id="";
//        noti_repair.maintain_id="";
//        noti_repair.department_id="";
//        noti_repair.active="";
//        return noti_repair;
//    }
    public noti_repairDB SelectNoti_RepairByPK(String noti_repair_id){
        String sql="";
        noti_repairDB noti_repair = new noti_repairDB();
        sql = SytaxSelect("PrimaryKey",noti_repair_id);
        try {
            Connection conn = config.getConnectionBangna();
            Statement st;
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()) {
                SetNoti_Repair(noti_repair, rs);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(noti_repair.class.getName()).log(Level.SEVERE, null, ex);
        }
        return noti_repair;
    }
    public Vector SelectNoti_RepairByAll(){
        String sql="";
        Vector noti = new Vector();
        noti_repairDB noti_repair = new noti_repairDB();
        sql = SytaxSelect("All","");
        try {
            Connection conn = config.getConnectionBangna();
            Statement st;
            st = conn.createStatement();
            ResultSet rs;
            rs = st.executeQuery(sql);
            while(rs.next()) {
                SetNoti_Repair(noti_repair, rs);
                noti.add(noti_repair);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(noti_repair.class.getName()).log(Level.SEVERE, null, ex);
        }
        return noti;
    }
    public Integer SaveNoti_Repair(noti_repairDB noti_repair){
        Integer chk=0;
        String sql="";
        noti_repairDB noti;
        noti = SelectNoti_RepairByPK(noti_repair.getNoti_Repair_ID());
        if(noti.getNoti_Repair_ID().equals("")){
            sql=SytaxInsert(noti_repair);
        }
        else{
            sql=SytaxUpdate(noti_repair);
        }
        Connection conn;
        try {
            conn = config.getConnectionBangna();
            Statement st;
            st = conn.createStatement();
            chk = st.executeUpdate(sql);
        } catch (Exception ex) {
            Logger.getLogger(noti_repair.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
}