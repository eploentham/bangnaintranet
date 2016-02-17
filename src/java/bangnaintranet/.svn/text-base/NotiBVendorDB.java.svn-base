/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;
import bangnaintranet.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pop
 */
public class NotiBVendorDB {
    Config1 config1 = new Config1();
    NotiBVendor vendor = new NotiBVendor();

    public String getMaxRowBVendor(Connection conn){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+vendor.getFVendorId()+") as cnt From "+vendor.getNotiBVendor();
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
                max = "107001";
            }
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public int setSaveBVendor(NotiBVendor item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        NotiBVendor vendor = new NotiBVendor();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            vendor = SelectVendorByPK(item.getFVendorId());
            item.setSaleFullNamet(item.getSaleFullNamet().replace("'", "''"));
            item.setVendorNamet(item.getVendorNamet().replace("'", "''"));
            item.setTelephone(item.getTelephone().replace("'", "''"));
            item.setSaleMobile(item.getSaleMobile().replace("'", "''"));
            item.setMobile(item.getMobile().replace("'", "''"));
            
            if(vendor.getVenderId().equals("")){
                max = getMaxRowBVendor(conn);
                sql="Insert Into "+vendor.getNotiBVendor()+"("
                        +vendor.getFVendorId()+", "+vendor.getFVendorNamet()+", "
                        +vendor.getFVendorActive()+","+ vendor.getFTelephone()+","
                        +vendor.getFTaxId()+","+ vendor.getFSaleMobile()+","
                        +vendor.getFSaleFullNamet()+","+ vendor.getFMobile()+") "
                        +"Values('"+max+"','"
                        +item.getVenderId()+"','"+item.getVendorNamet() + "','"
                        + item.getActive()+"','"+item.getTelephone() + "','"
                        + item.getTaxId()+"','"+item.getSaleMobile() + "','"
                        + item.getSaleFullNamet()+"','"+item.getMobile() + "')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+vendor.getNotiBVendor()+" set "
                +vendor.getFVendorNamet()+" = '"+item.getVendorNamet()+"', "
                +vendor.getFVendorActive()+" = '"+item.getActive()+"', "
                +vendor.getFTelephone()+" = '"+item.getTelephone()+"', "
                +vendor.getFTaxId()+" = '"+item.getTaxId()+"', "
                +vendor.getFSaleMobile()+" = '"+item.getSaleMobile()+"', "
                +vendor.getFSaleFullNamet()+" = '"+item.getSaleFullNamet()+"', "
                +vendor.getFMobile()+" = '"+item.getMobile()+"' "
                +"Where "+vendor.getFVendorId()+" = '"+item.getVenderId()+"'";
//                max = item.getBillLabId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
    public Vector SelectVendor(){
        String sql="";
        Vector v_b_vendor = new Vector();
        NotiBVendor notibvendor = new NotiBVendor();
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement st = conn.createStatement();
            sql = "Select * "
                    +" From "+notibvendor.getNotiBVendor()
                    +" Where "+notibvendor.getFVendorActive()+" = '1'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                notibvendor = new NotiBVendor();
                //department += "<option value='"+rs.getString("department_id")+"'>"+rs.getString("department_namet")+"</option>";
                notibvendor.setActive("1");
                notibvendor.setVenderId(rs.getString(notibvendor.getFVendorId()));
                notibvendor.setVendorNamet(rs.getString(notibvendor.getFVendorNamet()));
                notibvendor.setMobile(rs.getString(notibvendor.getFMobile()));
                notibvendor.setSaleFullNamet(rs.getString(notibvendor.getFSaleFullNamet()));
                notibvendor.setSaleMobile(rs.getString(notibvendor.getFSaleMobile()));
                notibvendor.setTaxId(rs.getString(notibvendor.getFTaxId()));
                notibvendor.setTelephone(rs.getString(notibvendor.getFTelephone()));
                
                v_b_vendor.add(notibvendor);
            }//<OPTION VALUE=\""+k+"\">"+gran.getName()+"</OPTION>\n
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_b_vendor;
    }
    public NotiBVendor SelectVendorByPK(String vendor_id){
        String sql="";
        NotiBVendor notibvendor = new NotiBVendor();
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement st = conn.createStatement();
            sql = "Select "+notibvendor.getFVendorId()+", "+notibvendor.getFVendorNamet()
                    +" From "+notibvendor.getNotiBVendor()
                    +" Where "+notibvendor.getFVendorId()+" = '"+vendor_id+"'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                notibvendor = new NotiBVendor();
                //department += "<option value='"+rs.getString("department_id")+"'>"+rs.getString("department_namet")+"</option>";
                notibvendor.setActive("1");
                notibvendor.setVenderId(rs.getString(notibvendor.getFVendorId()));
                notibvendor.setVendorNamet(rs.getString(notibvendor.getFVendorNamet()));
                notibvendor.setMobile(rs.getString(notibvendor.getFMobile()));
                notibvendor.setSaleFullNamet(rs.getString(notibvendor.getFSaleFullNamet()));
                notibvendor.setSaleMobile(rs.getString(notibvendor.getFSaleMobile()));
                notibvendor.setTaxId(rs.getString(notibvendor.getFTaxId()));
                notibvendor.setTelephone(rs.getString(notibvendor.getFTelephone()));
                
            }//<OPTION VALUE=\""+k+"\">"+gran.getName()+"</OPTION>\n
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return notibvendor;
    }
    public String CboVendor(String selected){
        String txt="",sql="";
        Vector v_b_vendor = new Vector();
        NotiBVendor type_device = new NotiBVendor();
        v_b_vendor = SelectVendor();
        for(int i=0;i<=v_b_vendor.size()-1;i++) {
            type_device = (NotiBVendor) v_b_vendor.get(i);
            if(type_device.getVenderId().equals(selected)){
                txt += "<option value='"+type_device.getVenderId()+"' selected>"+type_device.getVendorNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+type_device.getVenderId()+"' >"+type_device.getVendorNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }

}
