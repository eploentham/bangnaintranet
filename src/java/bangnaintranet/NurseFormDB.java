package bangnaintranet;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pop
 */
public class NurseFormDB {
Config1 config1 = new Config1();
Ward ward = new Ward();
//Ward ward = new Ward();
    public Vector SearchForm(String date_start, String ward1, String flag, String ward_no){
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        Ward ward = new Ward();
        try {
            conn = config1.getConnectionMainHIS();
            //conn = config1.getConnectionBangna();
            st = conn.createStatement();
            if(flag.equals("ward")){
                sql = "Select mnc_wd_no as no, pm32.mnc_md_dep_dsc as name "
                        +"From patient_t08 pt08  inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02  pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32  pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"Where mnc_ds_date is null "
                        +"Group by mnc_wd_no, pm32.mnc_md_dep_dsc ";
            }
            else if(flag.equals("ward_name")){
                sql = "Select mnc_wd_no as no, pm32.mnc_md_dep_dsc as name "
                        +"From patient_t08 pt08  inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02  pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32  pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"Where mnc_ds_date is null "
                        +"Group by mnc_wd_no, pm32.mnc_md_dep_dsc ";
            }
            else if (flag.equals("hnno")){
                if(ward_no.equals("")){
                    sql = "Select pt08.mnc_hn_no as no, mnc_ds_date, mnc_ds_lev, mnc_wd_no, "
                        +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
                        +"pm32.mnc_md_dep_dsc "
                        +"From patient_t08  pt08 inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02  pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32  pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"Where mnc_ds_date  is null ";
                }
                else {
                    sql = "Select pt08.mnc_hn_no as no, mnc_ds_date, mnc_ds_lev, mnc_wd_no, "
                        +"pm02.mnc_pfix_dsc + ' ' + pm01.mnc_fname_t + ' '+ pm01.mnc_lname_t as name, "
                        +"pm32.mnc_md_dep_dsc "
                        +"From patient_t08 pt08 inner join patient_m01  pm01 on pt08.mnc_hn_no = pm01.mnc_hn_no "
                        +"left join patient_m02 pm02 on pm01.mnc_pfix_cdt = pm02.mnc_pfix_cd "
                        +"left join patient_m32 pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"Where mnc_ds_date is null and mnc_wd_no = '"+ward_no+"'";
                }
            }
            rs = st.executeQuery(sql);
            while(rs.next()){
                ward = new Ward();
                ward.setWardId(rs.getString("no"));
                ward.setWardNamet(rs.getString("name"));
                v_result.add(ward);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(NurseFormDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboWard(String date_start, String flag, String selected, String ward_no){
        String txt="",sql="";
        Vector v_ward = new Vector();
        //Ward ward = new Ward();
        v_ward = SearchForm(date_start,"",flag, ward_no);
        for(int i=0;i<=v_ward.size()-1;i++) {
            ward = (Ward) v_ward.get(i);
            if(ward.getWardId().equals(selected)){
                txt += "<option value='"+ward.getWardId()+"' selected>"+ward.getWardNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
            }
            else{
                txt += "<option value='"+ward.getWardId()+"' >"+ward.getWardNamet()+"</option>";
                //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
}
