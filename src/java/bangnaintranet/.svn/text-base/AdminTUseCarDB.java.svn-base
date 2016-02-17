/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;
import bangnaLibrary.*;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pop
 */
public class AdminTUseCarDB {
    private bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
    private AdminTUseCar usercar = new AdminTUseCar();
    private AdminBCar car = new AdminBCar();
    public String getMaxRowAdminTUseCar(Connection conn){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+usercar.getFUseCarId()+") as cnt From "+usercar.getAdminTUseCar();
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
                max = "12400001";
            }
        } catch (Exception ex) {
            Logger.getLogger(AdminTUseCarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public AdminTUseCar getAdminTUseCarOrderByPK(String usecar_id) {
        Connection conn;
        AdminTUseCar use_car = new AdminTUseCar();
        BDepartment department = new BDepartment();
        //FoodsPeriod foodsperiod = new FoodsPeriod();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();
            
            sql="Select uc.*, department.department_namet "
                +"From "+use_car.getAdminTUseCar()+" as uc left join "
                +department.getBDepartment()+" as department on "
                +"uc."+use_car.getFDepartmentId()+" = department."+department.getFDepartmentId() + " "
                +"Where "+use_car.getFUseCarId()+"='"+usecar_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                use_car = new AdminTUseCar();
                use_car.setUseCarId(config1.StringNull(rs.getString(use_car.getFUseCarId())));
                use_car.setUseCarDate(config1.StringNull(rs.getString(use_car.getFUseCarDate())));
                use_car.setCarId(config1.StringNull(rs.getString(use_car.getFCarId())));
                use_car.setDepartmentId(config1.StringNull(rs.getString(use_car.getFDepartmentId())));
                use_car.setBranchId(config1.StringNull(rs.getString(use_car.getFBranchId())));

                use_car.setUseCategory(config1.StringNull(rs.getString(use_car.getFUseCategory())));
                use_car.setDescription(config1.StringNull(rs.getString(use_car.getFDescription())));
                use_car.setQty(config1.StringNull(rs.getString(use_car.getFQty())));
                use_car.setRemark(config1.StringNull(rs.getString(use_car.getFRemark())));
                use_car.setUserIdUseCar(config1.StringNull(rs.getString(use_car.getFUserIdUseCar())));

                use_car.setUserNametUseCar(config1.StringNull(rs.getString(use_car.getFUserNametUseCar())));
                use_car.setUserIdApprove(config1.StringNull(rs.getString(use_car.getFUserIdApprove())));
                use_car.setUserNametApprove(config1.StringNull(rs.getString(use_car.getFUserNametApprove())));
                use_car.setApproveDate(config1.StringNull(rs.getString(use_car.getFApproveDate())));
                use_car.setApproveTime(config1.StringNull(rs.getString(use_car.getFApproveTime())));

                use_car.setCarIdDepartDate(config1.StringNull(rs.getString(use_car.getFCarIdDepartDate())));
                use_car.setCarIdDepartTime(config1.StringNull(rs.getString(use_car.getFCarIdDepartTime())));
                use_car.setCarIdArriveDate(config1.StringNull(rs.getString(use_car.getFCarIdArriveDate())));
                use_car.setCarIdArriveTime(config1.StringNull(rs.getString(use_car.getFCarIdArriveTime())));
                use_car.setUserIdDriver(config1.StringNull(rs.getString(use_car.getFUserIdDriver())));

                use_car.setUserNametDriver(config1.StringNull(rs.getString(use_car.getFUserNametDriver())));
                use_car.setDestination(config1.StringNull(rs.getString(use_car.getFDestination())));
                use_car.setDateCreate(config1.StringNull(rs.getString(use_car.getFDateCreate())));
                use_car.setDateModify(config1.StringNull(rs.getString(use_car.getFDateModify())));
                use_car.setDateCancel(config1.StringNull(rs.getString(use_car.getFDateCancel())));

                use_car.setUserIdCreate(config1.StringNull(rs.getString(use_car.getFUserIdCreate())));
                use_car.setUserIdModify(config1.StringNull(rs.getString(use_car.getFUserIdModify())));
                use_car.setUserIdCancel(config1.StringNull(rs.getString(use_car.getFUserIdCancel())));
                use_car.setUseCarActive(config1.StringNull(rs.getString(use_car.getFUseCarActive())));
                use_car.setApplyDate(config1.StringNull(rs.getString(use_car.getFApplyDate())));

                use_car.setUseCarTime(config1.StringNull(rs.getString(use_car.getFUseCarTime())));
                use_car.setDepartmentNamet(config1.StringNull(rs.getString("department_namet")));

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTUseCarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return use_car;
    }
    public Vector getAdminTUseCar(String branch_id, String flag, String date_start, String date_end) {
        Connection conn;
        AdminTUseCar use_car = new AdminTUseCar();
        BDepartment department = new BDepartment();
        FoodsPeriod foodsperiod = new FoodsPeriod();
        Vector v_use_car = new Vector();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            
            if(flag.equals("date")){
                sql="Select uc.*, department.department_namet "
                +"From "+use_car.getAdminTUseCar()+" as uc left join "
                +department.getBDepartment()+" as department on "
                +"uc."+use_car.getFDepartmentId()+" = department."+department.getFDepartmentId() + " "
                +"Where "+"uc."+use_car.getFBranchId()+" = '"+branch_id+"' and "+use_car.getFUseCarActive()+"='1' and "
                        +use_car.getFUseCarDate() +" >='"+date_start+"' and "+use_car.getFUseCarDate()+"<='"+date_end+"' ";
            }
            else {
                sql="Select uc.*, department.department_namet "
                +"From "+use_car.getAdminTUseCar()+" as uc left join "
                +department.getBDepartment()+" as department on "
                +"uc."+use_car.getFDepartmentId()+" = department."+department.getFDepartmentId() + " "
                +"Where "+"uc."+use_car.getFBranchId()+" = '"+branch_id+"' and "+use_car.getFUseCarActive()+"='1'";
            }
            
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                use_car = new AdminTUseCar();
                use_car.setUseCarId(config1.StringNull(rs.getString(use_car.getFUseCarId())));
                use_car.setUseCarDate(config1.StringNull(rs.getString(use_car.getFUseCarDate())));
                use_car.setCarId(config1.StringNull(rs.getString(use_car.getFCarId())));
                use_car.setDepartmentId(config1.StringNull(rs.getString(use_car.getFDepartmentId())));
                use_car.setBranchId(config1.StringNull(rs.getString(use_car.getFBranchId())));

                use_car.setUseCategory(config1.StringNull(rs.getString(use_car.getFUseCategory())));
                use_car.setDescription(config1.StringNull(rs.getString(use_car.getFDescription())));
                use_car.setQty(config1.StringNull(rs.getString(use_car.getFQty())));
                use_car.setRemark(config1.StringNull(rs.getString(use_car.getFRemark())));
                use_car.setUserIdUseCar(config1.StringNull(rs.getString(use_car.getFUserIdUseCar())));

                use_car.setUserNametUseCar(config1.StringNull(rs.getString(use_car.getFUserNametUseCar())));
                use_car.setUserIdApprove(config1.StringNull(rs.getString(use_car.getFUserIdApprove())));
                use_car.setUserNametApprove(config1.StringNull(rs.getString(use_car.getFUserNametApprove())));
                use_car.setApproveDate(config1.StringNull(rs.getString(use_car.getFApproveDate())));
                use_car.setApproveTime(config1.StringNull(rs.getString(use_car.getFApproveTime())));

                use_car.setCarIdDepartDate(config1.StringNull(rs.getString(use_car.getFCarIdDepartDate())));
                use_car.setCarIdDepartTime(config1.StringNull(rs.getString(use_car.getFCarIdDepartTime())));
                use_car.setCarIdArriveDate(config1.StringNull(rs.getString(use_car.getFCarIdArriveDate())));
                use_car.setCarIdArriveTime(config1.StringNull(rs.getString(use_car.getFCarIdArriveTime())));
                use_car.setUserIdDriver(config1.StringNull(rs.getString(use_car.getFUserIdDriver())));

                use_car.setUserNametDriver(config1.StringNull(rs.getString(use_car.getFUserNametDriver())));
                use_car.setDestination(config1.StringNull(rs.getString(use_car.getFDestination())));
                use_car.setDateCreate(config1.StringNull(rs.getString(use_car.getFDateCreate())));
                use_car.setDateModify(config1.StringNull(rs.getString(use_car.getFDateModify())));
                use_car.setDateCancel(config1.StringNull(rs.getString(use_car.getFDateCancel())));

                use_car.setUserIdCreate(config1.StringNull(rs.getString(use_car.getFUserIdCreate())));
                use_car.setUserIdModify(config1.StringNull(rs.getString(use_car.getFUserIdModify())));
                use_car.setUserIdCancel(config1.StringNull(rs.getString(use_car.getFUserIdCancel())));
                use_car.setUseCarActive(config1.StringNull(rs.getString(use_car.getFUseCarActive())));
                use_car.setApplyDate(config1.StringNull(rs.getString(use_car.getFApplyDate())));

                use_car.setUseCarTime(config1.StringNull(rs.getString(use_car.getFUseCarTime())));
                use_car.setDepartmentNamet(config1.StringNull(rs.getString("department_namet")));

                v_use_car.add(use_car);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTUseCarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_use_car;
    }
    public String setSaveAdminTUseCar(AdminTUseCar item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        AdminTUseCar use_car = new AdminTUseCar();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            use_car = getAdminTUseCarOrderByPK(item.getUseCarId());
            item.setDescription(item.getDescription().replace("'", "''"));
            item.setDestination(item.getDestination().replace("'", "''"));
            item.setRemark(item.getRemark().replace("'", "''"));
//            item.setSerialNo(item.getSerialNo().replace("'", "''"));
//            item.setServiceTab(item.getServiceTab().replace("'", "''"));
//            item.setWarranty(item.getWarranty().replace("'", "''"));
            if(use_car.getUseCarId().equals("")){
                max = getMaxRowAdminTUseCar(conn);
                sql="Insert Into "+use_car.getAdminTUseCar()+"("
                        +use_car.getFUseCarId()+", "+use_car.getFCarId()+", "
                        +use_car.getFUseCarDate()+","+ use_car.getFDepartmentId()+","
                        +use_car.getFBranchId()+","+ use_car.getFUseCategory()+","
                        +use_car.getFDescription()+","+ use_car.getFQty()+","
                        +use_car.getFUserIdUseCar()+","+ use_car.getFUserNametUseCar()+","
                        +use_car.getFUserIdApprove()+","+ use_car.getFUserNametApprove()+","
                        +use_car.getFApproveDate()+","+ use_car.getFApproveTime()+","
                        +use_car.getFCarIdDepartDate()+","+ use_car.getFCarIdDepartTime()+","
                        +use_car.getFCarIdArriveDate()+","+ use_car.getFCarIdArriveTime()+","
                        +use_car.getFUserIdDriver()+","+ use_car.getFUserNametDriver()+","
                        +use_car.getFDestination()+","+ use_car.getFUserIdCreate()+","
                        +use_car.getFUserIdModify()+","+ use_car.getFUserIdCancel()+","
                        +use_car.getFDateCreate()+","+ use_car.getFDateModify()+","
                        +use_car.getFDateCancel()+","+use_car.getFApplyDate()+","
                        +use_car.getFUseCarTime()+","+use_car.getFRemark()+","
                        +use_car.getFUseCarActive()+") "
                        +"Values('"+max+"','"+item.getCarId()+"','"
                        +item.getUseCarDate() + "','"+ item.getDepartmentId()+"','"
                        +item.getBranchId() + "','"+ item.getUseCategory()+"','"
                        +item.getDescription() + "','"+ item.getQty()+"','"
                        +item.getUserIdUseCar() + "','"+ item.getUserNametUseCar()+"','"
                        +item.getUserIdApprove() + "','"+ item.getUserNametApprove()+"','"
                        +item.getApproveDate() + "','"+ item.getApproveTime()+"','"
                        +item.getCarIdDepartDate() + "','"+ item.getCarIdDepartTime()+"','"
                        +item.getCarIdArriveDate() + "','"+ item.getCarIdArriveTime()+"','"
                        +item.getUserIdDriver() + "','"+ item.getUserNametDriver()+"','"
                        +item.getDestination() + "','"+ item.getUserIdCreate()+"','"
                        +item.getUserIdModify() + "','"+ item.getUserIdCancel()+"','"
                        +item.getDateCreate() + "','"+ item.getDateModify()+"','"
                        +item.getDateCancel() + "','"+ item.getApplyDate()+"','"
                        +item.getUseCarTime()+"','"+item.getRemark()+"','"
                        +item.getUseCarActive()+"')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");                
                sql = "Update "+use_car.getAdminTUseCar()+" set "
                +use_car.getFCarId()+" = '"+item.getCarId()+"', "
                +use_car.getFUseCarDate()+" = '"+item.getUseCarDate()+"', "
                +use_car.getFDepartmentId()+" = '"+item.getDepartmentId()+"', "
                +use_car.getFBranchId()+" = '"+item.getBranchId()+"', "
                +use_car.getFUseCategory()+" = '"+item.getUseCategory()+"', "
                +use_car.getFDescription()+" = '"+item.getDescription()+"', "
                +use_car.getFQty()+" = '"+item.getQty()+"', "
                +use_car.getFUserIdUseCar()+" = '"+item.getUserIdUseCar()+"', "
                +use_car.getFUserNametUseCar()+" = '"+item.getUserNametUseCar()+"', "
                +use_car.getFUserIdApprove()+" = '"+item.getUserIdApprove()+"', "
                +use_car.getFUserNametApprove()+" = '"+item.getUserNametApprove()+"', "
                +use_car.getFApproveDate()+" = '"+item.getApproveDate()+"', "
                +use_car.getFApproveTime()+" = '"+item.getApproveTime()+"', "
                +use_car.getFCarIdDepartDate()+" = '"+item.getCarIdDepartDate()+"', "
                +use_car.getFCarIdDepartTime()+" = '"+item.getCarIdDepartTime()+"', "
                +use_car.getFCarIdArriveDate()+" = '"+item.getCarIdArriveDate()+"', "
                +use_car.getFCarIdArriveTime()+" = '"+item.getCarIdArriveTime()+"', "
                +use_car.getFUserIdDriver()+" = '"+item.getUserIdDriver()+"', "
                +use_car.getFUserNametDriver()+" = '"+item.getUserNametDriver()+"', "
                +use_car.getFDestination()+" = '"+item.getDestination()+"', "
                +use_car.getFUserIdCreate()+" = '"+item.getUserIdCreate()+"', "
                +use_car.getFUserIdModify()+" = '"+item.getUserIdModify()+"', "
                +use_car.getFUserIdCancel()+" = '"+item.getUserIdCancel()+"', "
                +use_car.getFDateCreate()+" = '"+item.getDateCreate()+"', "
                +use_car.getFDateModify()+" = '"+item.getDateModify()+"', "
                +use_car.getFDateCancel()+" = '"+item.getDateCancel()+"', "
                +use_car.getFApplyDate()+" = '"+item.getApplyDate()+"', "
                +use_car.getFUseCarTime()+" = '"+item.getUseCarTime()+"', "
                +use_car.getFRemark()+" = '"+item.getRemark()+"', "
                +use_car.getFUseCarActive()+" = '"+item.getUseCarActive()+"' "
                +"Where "+use_car.getFUseCarId()+" = '"+item.getUseCarId()+"'";
                max = item.getUseCarId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTUseCarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }

}
