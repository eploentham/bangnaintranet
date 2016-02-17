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
 * @author root
 */
public class BTelephoneDB {
    BTelephone telephone = new BTelephone();
    bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
    public String getMaxRowBTelephone(Connection conn){
        String sql="", max="";
        try {
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+telephone.getTelephoneId()+") as cnt From "+telephone.getBranchId();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                max = rs.getString("cnt");
            }
            rs.close();
            if(max!=null && !max.equals("")) {
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "17800001";
            }
        } catch (Exception ex) {
            Logger.getLogger(BTelephoneDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public BTelephone getBTelephoneByPK(String branch_id, Connection conn, String telephone_id) {
//        Connection conn;
        String sql="";
        try {
//                conn = config1.getConnectionBangna();
                Statement stbangna = conn.createStatement();

            sql="Select * "
                +"From "+telephone.getBTelephone()+" "
                +"Where "+telephone.getFTelephoneId()+"='"+telephone_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()) {
                telephone = new BTelephone();
                telephone.setBranchId(config1.StringNull(rs.getString(telephone.getFBranchId())));
                telephone.setDescription(config1.StringNull(rs.getString(telephone.getFDescription())));
                telephone.setRemark(config1.StringNull(rs.getString(telephone.getFRemark())));
                telephone.setTelephoneActive(config1.StringNull(rs.getString(telephone.getFTelephoneActive())));
                telephone.setTelephoneId(config1.StringNull(rs.getString(telephone.getFTelephoneId())));

                telephone.setTelephoneNamet(config1.StringNull(rs.getString(telephone.getFTelephoneNamet())));
                telephone.setTelephoneStatus(config1.StringNull(rs.getString(telephone.getFTelephoneStatus())));

                }
            rs.close();
//            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(BTelephoneDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return telephone;
    }
    public Vector getBTelephone(String branch_id, String telephone_status, String flag) {
        Connection conn;
        String sql="";
        Vector v_telephone = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            sql="Select * "
                +"From "+telephone.getBTelephone()+" "
                +"Where "+telephone.getFTelephoneActive()+"='1' and "+telephone.getFTelephoneStatus()+"='"+telephone_status+"' "
                +"Order By "+telephone.getFTelephoneNamet()+" asc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()) {
                telephone = new BTelephone();
                telephone.setBranchId(config1.StringNull(rs.getString(telephone.getFBranchId())));
                telephone.setDescription(config1.StringNull(rs.getString(telephone.getFDescription())));
                telephone.setRemark(config1.StringNull(rs.getString(telephone.getFRemark())));
                telephone.setTelephoneActive(config1.StringNull(rs.getString(telephone.getFTelephoneActive())));
                telephone.setTelephoneId(config1.StringNull(rs.getString(telephone.getFTelephoneId())));

                telephone.setTelephoneNamet(config1.StringNull(rs.getString(telephone.getFTelephoneNamet())));
                telephone.setTelephoneStatus(config1.StringNull(rs.getString(telephone.getFTelephoneStatus())));
                v_telephone.add(telephone);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(BTelephoneDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_telephone;
    }
    public String setSaveBTelephone(String branch_id, BTelephone item) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            telephone = getBTelephoneByPK(branch_id, conn,item.getTelephoneId());
            item.setTelephoneNamet(item.getTelephoneNamet().replace("'", "''"));
            item.setDescription(item.getDescription().replace("'", "''"));
            if(telephone.getTelephoneId().equals("")) {
                max = getMaxRowBTelephone(conn);
                sql="Insert Into "+telephone.getBTelephone()+"("+
                        telephone.getFTelephoneId()+", "+telephone.getFDescription()+", "+
                        telephone.getFRemark()+","+ telephone.getFTelephoneActive()+","+
                        telephone.getFBranchId()+","+ telephone.getFTelephoneNamet()+"," +
                        telephone.getFTelephoneStatus()+") "+
                        "Values('"+max+"','"+item.getDescription()+"','"+
                        item.getRemark() + "','"+ item.getTelephoneActive()+"','"+
                        item.getBranchId() + "','"+ item.getTelephoneNamet()+"','" +
                        item.getTelephoneStatus()+"')";
            }
            else{
                sql = "Update "+telephone.getBTelephone()+" set "+
                telephone.getFBranchId()+" = '"+item.getBranchId()+"', "+
                telephone.getFDescription()+" = '"+item.getDescription()+"', "+
                telephone.getFRemark()+" = '"+item.getRemark()+"', "+
                telephone.getFTelephoneActive()+" = '"+item.getTelephoneActive()+"', "+
                telephone.getFTelephoneNamet()+" = '"+item.getTelephoneNamet()+"', "+
                telephone.getFTelephoneStatus()+" = '"+item.getTelephoneStatus()+"' "+
                "Where "+telephone.getFTelephoneId()+"='"+item.getTelephoneId()+"'";
                max = item.getTelephoneId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(BTelephoneDB.class.getName()).log(Level.SEVERE, null, ex);
            max = ex.getMessage();
        }
        return max;
    }

}
