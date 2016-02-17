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
public class AdminTFoodsDB {
    private Config1 config1 = new Config1();
    private AdminTFoods admin_foods = new AdminTFoods();
    private AdminTFoodsDetail admin_foods_detail = new AdminTFoodsDetail();
    public String getMaxRowAdminTFoods(Connection conn){
        String sql="", max="";
        try {
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+admin_foods.getFAdminFoodsId()+") as cnt From "+admin_foods.getAdminTFoods();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                max = rs.getString("cnt");
            }
            rs.close();
            if(max!=null && !max.equals("")) {
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "13700001";
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String getMaxRowAdminTFoodsDetail(Connection conn){
        String sql="", max="";
        try {
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+admin_foods_detail.getFAdminFoodsDetailId()+") as cnt From "+admin_foods_detail.getAdminTFoodsDetail();
            rs = st.executeQuery(sql);
            while(rs.next()) {
                max = rs.getString("cnt");
            }
            rs.close();
            if(max!=null && !max.equals("")) {
                max =  String.valueOf(Integer.parseInt(max)+1);
            }
            else{
                max = "13800001";
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public AdminTFoods getAdminTFoodsByPK(String admin_foods_id) {
        Connection conn;
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            sql="Select * "
                +"From "+admin_foods.getAdminTFoods()+" "
                +"Where "+admin_foods.getFAdminFoodsId()+"='"+admin_foods_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admin_foods = new AdminTFoods();
                admin_foods.setAdminFoodsActive(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsActive())));
                admin_foods.setAdminFoodsDate(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsDate())));
                admin_foods.setAdminFoodsId(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsId())));
                admin_foods.setAmountReceive(Double.parseDouble(rs.getString(admin_foods.getFAmountReceive())));
                admin_foods.setDateEnd(config1.StringNull(rs.getString(admin_foods.getFDateEnd())));

                admin_foods.setDateStart(config1.StringNull(rs.getString(admin_foods.getFDateStart())));
                admin_foods.setDescription(config1.StringNull(rs.getString(admin_foods.getFDescription())));
                admin_foods.setNettotalReceive(Double.parseDouble(rs.getString(admin_foods.getFNettotalReceive())));
                admin_foods.setRemark(config1.StringNull(rs.getString(admin_foods.getFRemark())));
                admin_foods.setAmountApprove(Double.parseDouble(rs.getString(admin_foods.getFAmountApprove())));

                admin_foods.setNettotalApprove(Double.parseDouble(rs.getString(admin_foods.getFNettotalApprove())));
                admin_foods.setAdminFoodsYear(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsYear())));
                admin_foods.setAdminFoodsMonth(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsMonth())));
                admin_foods.setAdminFoodsPeriod(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsPeriod())));
                admin_foods.setBranchId(config1.StringNull(rs.getString(admin_foods.getFBranchId())));

                admin_foods.setcntApprove(Double.parseDouble(rs.getString(admin_foods.getFCntApprove())));
                admin_foods.setcntReceive(Double.parseDouble(rs.getString(admin_foods.getFCntReceive())));
                admin_foods.setcntSend(Double.parseDouble(rs.getString(admin_foods.getFCntSend())));
                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admin_foods;
    }
    public Vector getAdminTFoods(String branch_id,String admin_foods_id, String flag) {
        Connection conn;
        String sql="";
        Vector v_admin_foods = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            if(flag.equals("year")){
                sql="Select * "
                +"From "+admin_foods.getAdminTFoods()+" "
                +"Where "+admin_foods.getFAdminFoodsYear()+"='"+admin_foods_id+"' and "+admin_foods.getFAdminFoodsActive()+"='1'"+
                "Order By "+admin_foods.getFAdminFoodsId();
            }
            else{
                sql="Select * "
                +"From "+admin_foods.getAdminTFoods()+" "
                +"Where "+admin_foods.getAdminFoodsId()+"='"+admin_foods_id+"'";
            }

                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admin_foods = new AdminTFoods();
                admin_foods.setAdminFoodsActive(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsActive())));
                admin_foods.setAdminFoodsDate(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsDate())));
                admin_foods.setAdminFoodsId(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsId())));
                admin_foods.setAmountReceive(Double.parseDouble(rs.getString(admin_foods.getFAmountReceive())));
                admin_foods.setDateEnd(config1.StringNull(rs.getString(admin_foods.getFDateEnd())));

                admin_foods.setDateStart(config1.StringNull(rs.getString(admin_foods.getFDateStart())));
                admin_foods.setDescription(config1.StringNull(rs.getString(admin_foods.getFDescription())));
                admin_foods.setNettotalReceive(Double.parseDouble(rs.getString(admin_foods.getFNettotalReceive())));
                admin_foods.setRemark(config1.StringNull(rs.getString(admin_foods.getFRemark())));
                admin_foods.setAmountApprove(Double.parseDouble(rs.getString(admin_foods.getFAmountApprove())));

                admin_foods.setNettotalApprove(Double.parseDouble(rs.getString(admin_foods.getFNettotalApprove())));
                admin_foods.setAdminFoodsYear(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsYear())));
                admin_foods.setAdminFoodsMonth(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsMonth())));
                admin_foods.setAdminFoodsPeriod(config1.StringNull(rs.getString(admin_foods.getFAdminFoodsPeriod())));
                admin_foods.setBranchId(config1.StringNull(rs.getString(admin_foods.getFBranchId())));

                admin_foods.setcntApprove(Double.parseDouble(rs.getString(admin_foods.getFCntApprove())));
                admin_foods.setcntReceive(Double.parseDouble(rs.getString(admin_foods.getFCntReceive())));
                admin_foods.setcntSend(Double.parseDouble(rs.getString(admin_foods.getFCntSend())));
                
                v_admin_foods.add(admin_foods);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_admin_foods;
    }
    public AdminTFoodsDetail getAdminTFoodsDetailByPK(String admin_foods_detail_id) {
        Connection conn;
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            sql="Select * "
                +"From "+admin_foods_detail.getAdminTFoodsDetail()+" "
                +"Where "+admin_foods_detail.getFAdminFoodsDetailId()+"='"+admin_foods_detail_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admin_foods_detail = new AdminTFoodsDetail();
                admin_foods_detail.setAdminFoodsDetailId(config1.StringNull(rs.getString(admin_foods_detail.getFAdminFoodsDetailId())));
                admin_foods_detail.setAdminFoodsId(config1.StringNull(rs.getString(admin_foods_detail.getFAdminFoodsId())));
                admin_foods_detail.setAmountFoodsId(Double.parseDouble(rs.getString(admin_foods_detail.getFAmountFoodsId())));
                admin_foods_detail.setCntFoodsId(Double.parseDouble(rs.getString(admin_foods_detail.getFCntFoodsId())));
                admin_foods_detail.setFoodsOrderDate(config1.StringNull(rs.getString(admin_foods_detail.getFFoodsOrderDate())));

                admin_foods_detail.setPaidId(config1.StringNull(rs.getString(admin_foods_detail.getFPaidId())));
                admin_foods_detail.setPaidNamet(config1.StringNull(rs.getString(admin_foods_detail.getFPaidNamet())));
                admin_foods_detail.setTypeFoodsId(config1.StringNull(rs.getString(admin_foods_detail.getFTypeFoodsId())));
                admin_foods_detail.setTypeFoodsNamet(config1.StringNull(rs.getString(admin_foods_detail.getFTypeFoodsNamet())));

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTCaseDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return admin_foods_detail;
    }
    public Vector getAdminTFoodsDetail(String admin_foods_id,String admin_foods_detail_id, String foods_order_date, String flag) {
        Connection conn;
        String sql="";
        Vector v_admin_foods_detail = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            if(flag.equals("date")){
                sql="Select * "
                +"From "+admin_foods_detail.getAdminTFoodsDetail()+" "
                +"Where "+admin_foods_detail.getFFoodsOrderDate()+"='"+foods_order_date+"' and "+admin_foods_detail.getFAdminFoodsId()+" ='"+admin_foods_id+"'"
                +"Order By "+admin_foods_detail.getFPaidId()+", "+admin_foods_detail.getFTypeFoodsId();
            }
            else{
                sql="Select * "
                +"From "+admin_foods_detail.getAdminTFoodsDetail()+" "
                +"Where "+admin_foods_detail.getFAdminFoodsDetailId()+"='"+admin_foods_detail_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            }
            
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                admin_foods_detail = new AdminTFoodsDetail();
                admin_foods_detail.setAdminFoodsDetailId(config1.StringNull(rs.getString(admin_foods_detail.getFAdminFoodsDetailId())));
                admin_foods_detail.setAdminFoodsId(config1.StringNull(rs.getString(admin_foods_detail.getFAdminFoodsId())));
                admin_foods_detail.setAmountFoodsId(Double.parseDouble(rs.getString(admin_foods_detail.getFAmountFoodsId())));
                admin_foods_detail.setCntFoodsId(Double.parseDouble(rs.getString(admin_foods_detail.getFCntFoodsId())));
                admin_foods_detail.setFoodsOrderDate(config1.StringNull(rs.getString(admin_foods_detail.getFFoodsOrderDate())));

                admin_foods_detail.setPaidId(config1.StringNull(rs.getString(admin_foods_detail.getFPaidId())));
                admin_foods_detail.setPaidNamet(config1.StringNull(rs.getString(admin_foods_detail.getFPaidNamet())));
                admin_foods_detail.setTypeFoodsId(config1.StringNull(rs.getString(admin_foods_detail.getFTypeFoodsId())));
                admin_foods_detail.setTypeFoodsNamet(config1.StringNull(rs.getString(admin_foods_detail.getFTypeFoodsNamet())));
                v_admin_foods_detail.add(admin_foods_detail);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTFoodsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_admin_foods_detail;
    }
    public String setSaveAdminFoods(AdminTFoods item) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            admin_foods = getAdminTFoodsByPK(item.getAdminFoodsId());
            item.setDescription(item.getDescription().replace("'", "''"));
            item.setRemark(item.getRemark().replace("'", "''"));
            if(admin_foods.getAdminFoodsId().equals("")){
                max = getMaxRowAdminTFoods(conn);
                sql="Insert Into "+admin_foods.getAdminTFoods()+"("
                        +admin_foods.getFAdminFoodsId()+", "+admin_foods.getFAdminFoodsActive()+", "
                        +admin_foods.getFAdminFoodsDate()+","+ admin_foods.getFAmountReceive()+","
                        +admin_foods.getFDateEnd()+","+ admin_foods.getFDateStart()+","
                        +admin_foods.getFDescription()+","+ admin_foods.getFNettotalReceive()+","
                        +admin_foods.getFRemark()+","+admin_foods.getFBranchId()+"," +
                        admin_foods.getFAdminFoodsYear()+","+admin_foods.getFAdminFoodsMonth()+"," +
                        admin_foods.getFAdminFoodsPeriod()+","+admin_foods.getFCntApprove()+","+
                        admin_foods.getFCntReceive()+","+admin_foods.getFCntSend()+") "
                        +"Values('"+max+"','"+item.getAdminFoodsActive()+"','"
                        +item.getAdminFoodsDate() + "','"+ item.getAmountReceive()+"','"
                        +item.getDateEnd() + "','"+ item.getDateStart()+"','"
                        +item.getDescription() + "','"+ item.getNettotalReceive()+"','"
                        +item.getRemark() + "','"+item.getBranchId()+"','" +
                        item.getAdminFoodsYear()+"','"+item.getAdminFoodsMonth()+"','" +
                        item.getAdminFoodsPeriod()+"',"+item.getCntApprove()+","+
                        item.getCntReceive()+","+item.getCntSend()+")";
            }
            else{
                sql = "Update "+admin_foods.getAdminTFoods()+" set "
                +admin_foods.getFAdminFoodsActive()+" = '"+item.getAdminFoodsActive()+"', "
                +admin_foods.getFAdminFoodsDate()+" = '"+item.getAdminFoodsDate()+"', "
                +admin_foods.getFAmountReceive()+" = '"+item.getAmountReceive()+"', "
                +admin_foods.getFDateEnd()+" = '"+item.getDateEnd()+"', "
                +admin_foods.getFDateStart()+" = '"+item.getDateStart()+"', "
                +admin_foods.getFDescription()+" = '"+item.getDescription()+"', "
                +admin_foods.getFNettotalReceive()+" = '"+item.getNettotalReceive()+"', "
                +admin_foods.getFRemark()+" = '"+item.getRemark()+"', "
                +admin_foods.getFBranchId()+" = '"+item.getBranchId()+"', " +
                admin_foods.getFAdminFoodsYear()+" = '"+item.getAdminFoodsYear()+"'," +
                admin_foods.getFAdminFoodsMonth()+" = '"+item.getAdminFoodsMonth()+"'," +
                admin_foods.getFAdminFoodsPeriod()+" = '"+item.getAdminFoodsPeriod()+"', "+
                admin_foods.getFCntApprove()+" = "+item.getCntApprove()+", "+
                admin_foods.getFCntReceive()+" = "+item.getCntReceive()+", "+
                admin_foods.getFCntSend()+" = "+item.getCntSend()+" "+
                "Where "+admin_foods.getFAdminFoodsId()+" = '"+item.getAdminFoodsId()+"'";
                max = item.getAdminFoodsId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTFoodsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String setSaveAdminFoodsDetail(AdminTFoodsDetail item) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            admin_foods_detail = getAdminTFoodsDetailByPK(item.getAdminFoodsDetailId());
            item.setTypeFoodsNamet(item.getTypeFoodsNamet().replace("'", "''"));
            item.setPaidNamet(item.getPaidNamet().replace("'", "''"));
            if(admin_foods.getAdminFoodsId().equals("")){
                max = getMaxRowAdminTFoodsDetail(conn);
                sql="Insert Into "+admin_foods_detail.getAdminTFoodsDetail()+"("
                        +admin_foods_detail.getFAdminFoodsDetailId()+", "+admin_foods_detail.getFAdminFoodsId()+", "
                        +admin_foods_detail.getFAmountFoodsId()+","+ admin_foods_detail.getFCntFoodsId()+","
                        +admin_foods_detail.getFFoodsOrderDate()+","+ admin_foods_detail.getFPaidId()+","
                        +admin_foods_detail.getFPaidNamet()+","+ admin_foods_detail.getFTypeFoodsId()+","
                        +admin_foods_detail.getFTypeFoodsNamet()+","+admin_foods_detail.getFFoodsPrice()+") "
                        +"Values('"+max+"','"+item.getAdminFoodsId()+"','"
                        +item.getAmountFoodsId() + "','"+ item.getCntFoodsId()+"','"
                        +item.getFoodsOrderDate() + "','"+ item.getPaidId()+"','"
                        +item.getPaidNamet() + "','"+ item.getTypeFoodsId()+"','"
                        +item.getTypeFoodsNamet() + "',"+item.getFoodsPrice()+")";
            }
            else{
                sql = "Update "+admin_foods_detail.getAdminTFoodsDetail()+" set "
                +admin_foods_detail.getFAdminFoodsId()+" = '"+item.getAdminFoodsId()+"', "
                +admin_foods_detail.getFAmountFoodsId()+" = '"+item.getAmountFoodsId()+"', "
                +admin_foods_detail.getFCntFoodsId()+" = '"+item.getCntFoodsId()+"', "
                +admin_foods_detail.getFFoodsOrderDate()+" = '"+item.getFoodsOrderDate()+"', "
                +admin_foods_detail.getFPaidId()+" = '"+item.getPaidId()+"', "
                +admin_foods_detail.getFPaidNamet()+" = '"+item.getPaidNamet()+"', "
                +admin_foods_detail.getFTypeFoodsId()+" = '"+item.getTypeFoodsId()+"', "
                +admin_foods_detail.getFTypeFoodsNamet()+" = '"+item.getTypeFoodsNamet()+"', "
                +admin_foods_detail.getFFoodsPrice()+" = '"+item.getFoodsPrice()+"' "
                +"Where "+admin_foods_detail.getFAdminFoodsDetailId()+" = '"+item.getAdminFoodsDetailId()+"'";
                max = item.getAdminFoodsDetailId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTFoodsDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public Vector getNurseFoodsOrder(String branch_id,String date_start, String date_end){
        Vector v_foods_order = new Vector();
//        AdminTFoodsDetail foods_detail = new AdminTFoodsDetail();
        Connection conn;
        Statement st;
        ResultSet rs;
        String sql="Select ntfo.date_foods_order, count(*) as cnt, ntfod.paid_id, ntfod.paid_namet, ntfod.type_foods_namet, " +
                "ntfod.foods_price, ntfod.type_foods_id, count(*)*ntfod.foods_price as amount  "+
            "From nurse_t_foods_order ntfo "+
            "left join nurse_t_foods_order_detail ntfod on ntfo.foods_order_id = ntfod.foods_order_id "+
            "Where ntfo.foods_order_active = '1' and ntfod.foods_order_detail_active = '1' and "+
            "ntfo.date_foods_order >= '"+date_start+"' and ntfo.date_foods_order <= '"+date_end+"' and ntfo.branch_id = '"+branch_id+"' "+
            "Group by ntfo.date_foods_order, ntfod.paid_id, ntfod.paid_namet, ntfod.type_foods_id, ntfod.type_foods_namet, ntfod.foods_price "+
            "Order by ntfo.date_foods_order, ntfod.paid_id, ntfod.paid_namet, ntfod.type_foods_id, ntfod.type_foods_namet ";
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                admin_foods_detail = new AdminTFoodsDetail();
                admin_foods_detail.setPaidId(rs.getString("paid_id"));
                admin_foods_detail.setPaidNamet(rs.getString("paid_namet"));
                admin_foods_detail.setFoodsOrderDate(rs.getString("date_foods_order"));
                admin_foods_detail.setTypeFoodsId(rs.getString("type_foods_id"));
                admin_foods_detail.setTypeFoodsNamet(rs.getString("type_foods_namet"));
                admin_foods_detail.setCntFoodsId(Double.parseDouble(rs.getString("cnt")));
                admin_foods_detail.setAmountFoodsId(Double.parseDouble(rs.getString("amount")));
                admin_foods_detail.setFoodsPrice(Double.parseDouble(rs.getString("foods_price")));
                v_foods_order.add(admin_foods_detail);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTFoodsDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_foods_order;
    }
    public Vector getAdminFoodsOrder(String admin_foods_id, String flag){
        Vector v_foods_order = new Vector();
//        AdminTFoodsDetail foods_detail = new AdminTFoodsDetail();
        Connection conn;
        Statement st;
        ResultSet rs;
        String sql="";
        if(flag.equals("date")){
            sql = "Select foods_order_date, count(*) as cnt, sum(cnt_foods_id*foods_price) as amount "+
                "From admin_t_foods_detail "+
                "Where admin_foods_id = '"+admin_foods_id+"' "+
                "Group by foods_order_date  "+
                "Order by foods_order_date ";
        }        
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
                admin_foods_detail = new AdminTFoodsDetail();
//                admin_foods_detail.setPaidId(rs.getString("paid_id"));
//                admin_foods_detail.setPaidNamet(rs.getString("paid_namet"));
                admin_foods_detail.setFoodsOrderDate(rs.getString("foods_order_date"));
//                admin_foods_detail.setTypeFoodsId(rs.getString("type_foods_id"));
//                admin_foods_detail.setTypeFoodsNamet(rs.getString("type_foods_namet"));
                admin_foods_detail.setCntFoodsId(Double.parseDouble(rs.getString("cnt")));
                admin_foods_detail.setAmountFoodsId(Double.parseDouble(rs.getString("amount")));
//                admin_foods_detail.setFoodsPrice(Double.parseDouble(rs.getString("foods_price")));
                v_foods_order.add(admin_foods_detail);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTFoodsDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return v_foods_order;
    }
    public String setSaveNurseFoodsOrder(String branch_id,AdminTFoods foods_order, String flagpage){
        String admin_foods_id="";
        Vector v_admin_foods_detail = new Vector();
        try {
            admin_foods =foods_order;
//            admin_foods.setAdminFoodsId(foods_o);
            admin_foods.setAdminFoodsActive("1");
            
            admin_foods_id = setSaveAdminFoods(admin_foods);
            if(!flagpage.equals("viewdetail")){
                v_admin_foods_detail = getNurseFoodsOrder(branch_id,admin_foods.getDateStart(), admin_foods.getDateEnd());
                for(int i=0;i<=v_admin_foods_detail.size()-1;i++) {
                    admin_foods_detail = (AdminTFoodsDetail)v_admin_foods_detail.get(i);
                    admin_foods_detail.setAdminFoodsId(admin_foods_id);
                    setSaveAdminFoodsDetail(admin_foods_detail);
                }
                setUpdateAdminFoodsOrder(admin_foods_id,"");
            }
            
        } catch (Exception ex) {
            Logger.getLogger(AdminTFoodsDB.class.getName()).log(Level.SEVERE, null, ex);
        }

        return admin_foods_id;
    }
    public void setUpdateAdminFoodsOrder(String admin_foods_id, String flag){
        Connection conn;
        Statement st;
        ResultSet rs;
        String sql="", cnt="", amount="";
//        if(flag.equals("date")){
            sql = "Select count(*) as cnt, sum(cnt_foods_id*foods_price) as amount "+
                "From admin_t_foods_detail "+
                "Where admin_foods_id = '"+admin_foods_id+"' ";
//        }
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            rs = st.executeQuery(sql);
            while (rs.next()){
               cnt = rs.getString("cnt");
               amount = rs.getString("amount");
            }
            rs.close();
            sql = "Update "+admin_foods.getAdminTFoods()+" Set "+admin_foods.getFCntReceive()+"="+cnt+", "+
                    admin_foods.getFNettotalReceive()+"="+amount+" "+
                    "Where "+admin_foods.getFAdminFoodsId()+"='"+admin_foods_id+"' ";
            st.executeUpdate(sql);

            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTFoodsDB.class.getName()).log(Level.SEVERE, null, ex);
        }


    }

}
