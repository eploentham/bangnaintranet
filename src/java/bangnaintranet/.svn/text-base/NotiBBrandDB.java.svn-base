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
public class NotiBBrandDB {    
    Config1 config1 = new Config1();

    public Vector SelectBrand(){
        String sql="";
        Vector v_b_brand = new Vector();
        NotiBBrand notibbrand = new NotiBBrand();
        Connection conn;
        try {
            conn = config1.getConnectionBangna();
            Statement st = conn.createStatement();
            sql = "Select "+notibbrand.BrandId()+", "+notibbrand.BrandNamet()
                    +" From "+notibbrand.NotiBBrand()
                    +" Where "+notibbrand.BrandActive()+" = '1'";
            ResultSet rs = st.executeQuery(sql);
            while(rs.next()){
                notibbrand = new NotiBBrand();
                //department += "<option value='"+rs.getString("department_id")+"'>"+rs.getString("department_namet")+"</option>";
                notibbrand.setActive("1");
                notibbrand.setBrandId(rs.getString(notibbrand.BrandId()));
                notibbrand.setBrandNamet(rs.getString(notibbrand.BrandNamet()));
                v_b_brand.add(notibbrand);
            }//<OPTION VALUE=\""+k+"\">"+gran.getName()+"</OPTION>\n
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_b_brand;
    }
    public String CboBrand(String selected){
        String txt="",sql="";
        Vector v_b_brand = new Vector();
        NotiBBrand brand = new NotiBBrand();
        v_b_brand = SelectBrand();
        for(int i=0;i<=v_b_brand.size()-1;i++) {
            brand = (NotiBBrand) v_b_brand.get(i);
            if(brand.getBrandId().equals(selected)){
                txt += "<option value='"+brand.getBrandId()+"' selected>"+brand.getBrandNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+brand.getBrandId()+"' >"+brand.getBrandNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }

}
