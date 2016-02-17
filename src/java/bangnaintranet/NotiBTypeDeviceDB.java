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
public class NotiBTypeDeviceDB {
    NotiBTypeDevice notibtypedevice = new NotiBTypeDevice();
    Config1 config1 = new Config1();

    public Vector SelectTypeDevice(){
        String sql="";
        Vector v_b_type_device = new Vector();
        NotiBTypeDevice notibtypedevice = new NotiBTypeDevice();
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement st = conn.createStatement();
            sql = "Select "+notibtypedevice.getFTypeDeviceId()+", "+notibtypedevice.getFTypeDeviceNamet()
                    +" From "+notibtypedevice.NotiBTypeDevice()
                    +" Where "+notibtypedevice.getFTypeDeviceActive()+" = '1'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                notibtypedevice = new NotiBTypeDevice();
                //department += "<option value='"+rs.getString("department_id")+"'>"+rs.getString("department_namet")+"</option>";
                notibtypedevice.setActive("1");
                notibtypedevice.setTypeDeviceId(rs.getString(notibtypedevice.getFTypeDeviceId()));
                notibtypedevice.setTypeDeviceNamet(rs.getString(notibtypedevice.getFTypeDeviceNamet()));
                v_b_type_device.add(notibtypedevice);
            }//<OPTION VALUE=\""+k+"\">"+gran.getName()+"</OPTION>\n
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_b_type_device;
    }
    public String CboTypeDevice(String selected){
        String txt="",sql="";
        Vector v_b_type_device = new Vector();
        NotiBTypeDevice type_device = new NotiBTypeDevice();
        v_b_type_device = SelectTypeDevice();
        for(int i=0;i<=v_b_type_device.size()-1;i++) {
            type_device = (NotiBTypeDevice) v_b_type_device.get(i);
            if(type_device.getTypeDeviceId().equals(selected)){
                txt += "<option value='"+type_device.getTypeDeviceId()+"' selected>"+type_device.getTypeDeviceNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+type_device.getTypeDeviceId()+"' >"+type_device.getTypeDeviceNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }

}
