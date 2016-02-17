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
public class BAssetDB {
    private Config1 config1 = new Config1();
    private BAsset basset = new BAsset();
    public String getMaxRowBAsset(Connection conn){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+basset.getFAssetId()+") as cnt From "+basset.getBAsset();
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
                max = "11400001";
            }
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public BAsset getBAssetByPK(String asset_id){
        Connection conn;
        BAsset basset1 = new BAsset();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            
            String sql="";
            sql="Select * "
                +"From "+basset1.getBAsset()+" as asset "
                +"Where "+basset1.getFAssetId()+" = '"+asset_id+"' ";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                basset1 = new BAsset();
                basset1.setAssetId(config1.StringNull(rs.getString(basset1.getFAssetId())));
                basset1.setAssetNamet(config1.StringNull(rs.getString(basset1.getFAssetNamet())));
                basset1.setAssetActive(config1.StringNull(rs.getString(basset1.getFAssetStatus())));
                basset1.setAssetStatus(config1.StringNull(rs.getString(basset1.getFAssetStatus())));
                basset1.setTypeDeviceId(config1.StringNull(rs.getString(basset1.getFTypeDeviceId())));

                basset1.setBrandId(config1.StringNull(rs.getString(basset1.getFBrandId())));
                basset1.setDepartmentId(config1.StringNull(rs.getString(basset1.getFDepartmentId())));
                basset1.setBranchId(config1.StringNull(rs.getString(basset1.getFBranchId())));
                basset1.setVendorId(config1.StringNull(rs.getString(basset1.getFVendorId())));
                basset1.setDateBuy(config1.StringNull(rs.getString(basset1.getFDateBuy())));

                basset1.setWarranty(config1.StringNull(rs.getString(basset1.getFWarranty())));
                basset1.setSerialNo(config1.StringNull(rs.getString(basset1.getFSerialNo())));
                basset1.setServiceTab(config1.StringNull(rs.getString(basset1.getFServiceTab())));
                basset1.setPrice(Double.parseDouble(rs.getString(basset1.getFPrice())));
                basset1.setModel(config1.StringNull(rs.getString(basset1.getFModel())));
                
                basset1.setRemark(config1.StringNull(rs.getString(basset1.getFRemark())));
                basset1.setWarrantyStatus(config1.StringNull(rs.getString(basset1.getFWarantyStatus())));
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return basset1;
    }
    public Vector getBAsset(String branch_id,String asset_status,String type_device_id,String asset_id, String field){
        Connection conn;
        NotiBTypeDevice noti_b_type_device = new NotiBTypeDevice();
        NotiBBrand noti_b_brand = new NotiBBrand();
        BDepartment b_department = new BDepartment();
        NotiBVendor noti_b_vendor = new NotiBVendor();
        BBranch branch = new BBranch();
        Vector v_basset = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            BAsset basset1 = new BAsset();
            String sql="";
            String where="";
            if(!branch_id.equals("")){
                where ="  asset."+branch.getFBranchId()+"='"+branch_id+"' and ";
            }
//            if(!type_device_id.equals("asset_status")){
//                where +=basset1.getFAssetStatus()+"='"+asset_status+"' ";
//            }
            if(!type_device_id.equals("")){
                where +=" asset."+noti_b_type_device.getFTypeDeviceId()+"='"+type_device_id+"' and ";
            }
            if(!asset_status.equals("")){
                where+=" asset.asset_status ='"+asset_status +"' ";
            }
            if(field.equals("asset_id")){
                sql="Select asset.* "
                +"From "+basset1.getBAsset()+" as asset "
                +"Where "+basset1.getFAssetId()+" = '"+asset_id+"' ";
            }
            else if(field.equals("all")){
                sql="Select asset.*, " + noti_b_type_device.getFTypeDeviceNamet() + ", "
                +branch.getFBranchNamet()+", "+b_department.getFDepartmentNamet() + ", "
                        +noti_b_brand.BrandNamet()+" "
                +"From "+basset1.getBAsset()+" as asset left join "
                +noti_b_type_device.NotiBTypeDevice() + " nttd on " 
                +"nttd."+noti_b_type_device.getFTypeDeviceId() + " = "
                +"asset."+ basset1.getFTypeDeviceId() + " left join "
                +branch.getBBranch() + " branch on "
                +"branch."+branch.getFBranchId()+" = "
                +"asset."+basset1.getFBranchId() + " left join "
                +b_department.getBDepartment()+" department on "
                +"department."+b_department.getFDepartmentId()+" = asset."+basset1.getFDepartmentId()+ " left join "
                +noti_b_brand.NotiBBrand()+" brand on "
                +"brand."+noti_b_brand.BrandId()+"=asset."+basset1.getFBrandId()+" "
                +"Where "+basset1.getFAssetActive()+" = '1' and "+where
                +"Order By branch."+branch.getFBranchNamet()
                +", department."+b_department.getFDepartmentNamet()
                +", nttd."+noti_b_type_device.getFTypeDeviceNamet();
            }
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                basset1 = new BAsset();
                basset1.setAssetId(config1.StringNull(rs.getString(basset1.getFAssetId())));
                basset1.setAssetNamet(config1.StringNull(rs.getString(basset1.getFAssetNamet())));
                basset1.setAssetActive(config1.StringNull(rs.getString(basset1.getFAssetActive())));
                basset1.setAssetStatus(config1.StringNull(rs.getString(basset1.getFAssetStatus())));
                basset1.setTypeDeviceId(config1.StringNull(rs.getString(basset1.getFTypeDeviceId())));

                basset1.setBrandId(config1.StringNull(rs.getString(basset1.getFBrandId())));
                basset1.setDepartmentId(config1.StringNull(rs.getString(basset1.getFDepartmentId())));
                basset1.setBranchId(config1.StringNull(rs.getString(basset1.getFBrandId())));
                basset1.setVendorId(config1.StringNull(rs.getString(basset1.getFVendorId())));
                basset1.setDateBuy(config1.StringNull(rs.getString(basset1.getFDateBuy())));

                basset1.setWarranty(config1.StringNull(rs.getString(basset1.getFWarranty())));
                basset1.setSerialNo(config1.StringNull(rs.getString(basset1.getFSerialNo())));
                basset1.setServiceTab(config1.StringNull(rs.getString(basset1.getFServiceTab())));
                basset1.setPrice(Double.parseDouble(rs.getString(basset1.getFPrice())));
                basset1.setModel(config1.StringNull(rs.getString(basset1.getFModel())));

                basset1.setRemark(config1.StringNull(rs.getString(basset1.getFRemark())));
                basset1.setWarrantyStatus(config1.StringNull(rs.getString(basset1.getFWarantyStatus())));
                basset1.setTypeDeviceNamet(config1.StringNull(rs.getString(noti_b_type_device.getFTypeDeviceNamet())));
                basset1.setBranchNamet(config1.StringNull(rs.getString(branch.getFBranchNamet())));
                basset1.setDepartmentNamet(config1.StringNull(rs.getString(b_department.getFDepartmentNamet())));
                
                basset1.setBrandNamet(config1.StringNull(rs.getString(noti_b_brand.BrandNamet())));
                v_basset.add(basset1);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_basset;
    }
    public int setSaveBAsset(BAsset item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        BAsset basset1 = new BAsset();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            basset1 = getBAssetByPK(item.getAssetId());
            item.setAssetNamet(item.getAssetNamet().replace("'", "''"));
            item.setModel(item.getModel().replace("'", "''"));
            item.setRemark(item.getRemark().replace("'", "''"));
            item.setSerialNo(item.getSerialNo().replace("'", "''"));
            item.setServiceTab(item.getServiceTab().replace("'", "''"));
            item.setWarranty(item.getWarranty().replace("'", "''"));
            if(basset1.getAssetId().equals("")){
                max = getMaxRowBAsset(conn);
                sql="Insert Into "+basset1.getBAsset()+"("
                        +basset1.getFAssetId()+", "+basset1.getFAssetNamet()+", "
                        +basset1.getFAssetActive()+","+ basset1.getFAssetStatus()+","
                        +basset1.getFBranchId()+","+ basset1.getFBrandId()+","
                        +basset1.getFDateBuy()+","+ basset1.getFDepartmentId()+","
                        +basset1.getFPrice()+","+ basset1.getFSerialNo()+","
                        +basset1.getFServiceTab()+","+ basset1.getFTypeDeviceId()+","
                        +basset1.getFModel()+","+ basset1.getFRemark()+","
                        +basset1.getFVendorId()+","+ basset1.getFWarranty()+","
                        +basset1.getFWarantyStatus()+") "
                        +"Values('"+max+"','"+item.getAssetNamet()+"','"
                        +item.getAssetActive() + "','"+ item.getAssetStatus()+"','"
                        +item.getBranchId() + "','"+ item.getBrandId()+"','"
                        +item.getDateBuy() + "','"+ item.getDepartmentId()+"','"
                        +item.getPrice() + "','"+ item.getSerialNo()+"','"
                        +item.getServiceTab() + "','"+ item.getTypeDeviceId()+"','"
                        +item.getModel() + "','"+ item.getRemark()+"','"
                        +item.getVendorId() + "','"+ item.getWarranty()+"','"
                        +item.getWarrantyStatus()+"')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+basset1.getBAsset()+" set "
                +basset1.getFAssetNamet()+" = '"+item.getAssetNamet()+"', "
                +basset1.getFAssetActive()+" = '"+item.getAssetActive()+"', "
                +basset1.getFAssetStatus()+" = '"+item.getAssetStatus()+"', "
                +basset1.getFBranchId()+" = '"+item.getBranchId()+"', "
                +basset1.getFBrandId()+" = '"+item.getBrandId()+"', "
                +basset1.getFDateBuy()+" = '"+item.getDateBuy()+"', "
                +basset1.getFDepartmentId()+" = '"+item.getDepartmentId()+"', "
                +basset1.getFPrice()+" = '"+item.getPrice()+"', "
                +basset1.getFSerialNo()+" = '"+item.getSerialNo()+"', "
                +basset1.getFServiceTab()+" = '"+item.getServiceTab()+"', "
                +basset1.getFTypeDeviceId()+" = '"+item.getTypeDeviceId()+"', "
                +basset1.getFVendorId()+" = '"+item.getVendorId()+"', "
                +basset1.getFWarranty()+" = '"+item.getWarranty()+"', "
                +basset1.getFModel()+" = '"+item.getModel()+"', "
                +basset1.getFRemark()+" = '"+item.getRemark()+"', "
                +basset1.getFWarantyStatus()+" = '"+item.getWarrantyStatus()+"' "
                +"Where "+basset1.getFAssetId()+" = '"+item.getAssetId()+"'";
//                max = item.getBillLabId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NotiTNotiRepairDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return chk;
    }
    public String getTRBAsset(String basset_id, String field) {
        String txt="",sql="", date_buy="",txt_uncorrect="'", row_color="", font_color1="";
        String txt_color="", txt_color1="", selected="";
        Vector v_basset = new Vector();
        BAsset basset1 = new BAsset();
        v_basset = getBAsset("","","",basset_id,field);
        boolean chk=false;
        for(int i=0;i<=v_basset.size()-1;i++) {
            basset1 = (BAsset) v_basset.get(i);
            date_buy = basset1.getDateBuy();
            date_buy = date_buy.replace("-", "");
            //bill_lab_id1 = bill_lab_detail.getBillLabId();
            if(field.equals("date")){
                try {
                    
                } catch (Exception ex) {
                    Logger.getLogger(BAsset.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            else if(field.equals("date_day")){
                
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
}
