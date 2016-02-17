/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

/**
 *
 * @author root
 */
import bangnaintranet.*;
import bangnaLibrary.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
public class AdminBCarDB {
    bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
    AdminBCar b_car = new AdminBCar();
    public Vector SelectCar(String branch_id){
        String sql="";
        Vector v_car = new Vector();
        AdminBCar b_car = new AdminBCar();
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement st = conn.createStatement();
            sql = "Select * "
                    +" From "+b_car.getAdminBCar()
                    +" Where "+b_car.getFCarActive()+" = '1' and "
                    +b_car.getFBranchId()+"='"+branch_id+"' "
                    +"Order By "+b_car.getFSort1();
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                b_car = new AdminBCar();
                //department += "<option value='"+rs.getString("department_id")+"'>"+rs.getString("department_namet")+"</option>";
                b_car.setCarActive(rs.getString(b_car.getFCarActive()));
                b_car.setCarId(rs.getString(b_car.getFCarId()));
                b_car.setCarNamet(rs.getString(b_car.getFCarNamet()));
                b_car.setCarPlate(rs.getString(b_car.getFCarPlate()));
                v_car.add(b_car);
            }//<OPTION VALUE=\""+k+"\">"+gran.getName()+"</OPTION>\n
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminBCar.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_car;
    }
    public String CboCar(String branch_id,String selected){
        String txt="",sql="";
        Vector v_car = new Vector();
        AdminBCar b_car = new AdminBCar();
        v_car = SelectCar(branch_id);
        txt="<option value='' ></option>";
        for(int i=0;i<=v_car.size()-1;i++) {
            b_car = (AdminBCar) v_car.get(i);
            if(b_car.getCarId().equals(selected)){
                txt += "<option value='"+b_car.getCarId()+"' selected>"+b_car.getCarNamet()+" "+b_car.getCarPlate()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+b_car.getCarId()+"' >"+b_car.getCarNamet()+" "+b_car.getCarPlate()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }

}
