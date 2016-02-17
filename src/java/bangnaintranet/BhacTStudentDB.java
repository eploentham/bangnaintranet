/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

/**
 *
 * @author root
 */
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
public class BhacTStudentDB {
    private Config1 config1 = new Config1();
    private BhacTStudent student = new BhacTStudent();
    public String getMaxRowBhacTStudent(Connection conn){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();
            sql="Select max("+student.getFStudentId()+") as cnt From "+student.getBhacTStudent();
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
                max = "12900001";
            }
        } catch (Exception ex) {
            Logger.getLogger(BhacTStudentDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public BhacTStudent getBhacTStudentByPK(String student_id) {
        Connection conn;
        BhacTStudent student = new BhacTStudent();
        BDepartment department = new BDepartment();
        //FoodsPeriod foodsperiod = new FoodsPeriod();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();


            sql="Select * "
                +"From "+student.getBhacTStudent()+"  "
                +"Where "+student.getFStudentId()+"='"+student_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                student = new BhacTStudent();
                student.setStudentId(config1.StringNull(rs.getString(student.getFStudentId())));
                student.setStudentAge(config1.StringNull(rs.getString(student.getFStudentAge())));
                student.setStudentBachelorSchoolFaculty(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolFaculty())));
                student.setStudentBachelorSchoolNamet(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolNamet())));
                student.setStudentBachelorSchoolPoint(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolPoint())));

                student.setStudentBachelorSchoolYear(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolYear())));
                student.setStudentBirthday(config1.StringNull(rs.getString(student.getFStudentBirthday())));
                student.setStudentCurrentAmphur(config1.StringNull(rs.getString(student.getFStudentCurrentAmphur())));
                student.setStudentCurrentApartment(config1.StringNull(rs.getString(student.getFStudentCurrentApartment())));
                student.setStudentCurrentApartmentRoom(config1.StringNull(rs.getString(student.getFStudentCurrentApartmentRoom())));

                student.setStudentCurrentChangwat(config1.StringNull(rs.getString(student.getFStudentCurrentChangwat())));
                student.setStudentCurrentHouse(config1.StringNull(rs.getString(student.getFStudentCurrentHouse())));
                student.setStudentCurrentMoo(config1.StringNull(rs.getString(student.getFStudentCurrentMoo())));
                student.setStudentCurrentRoad(config1.StringNull(rs.getString(student.getFStudentCurrentRoad())));
                student.setStudentCurrentSoi(config1.StringNull(rs.getString(student.getFStudentCurrentSoi())));

                student.setStudentCurrentTambon(config1.StringNull(rs.getString(student.getFStudentCurrentTambon())));
                student.setStudentDate(config1.StringNull(rs.getString(student.getFStudentDate())));
                student.setStudentDocumentStatusDegree(config1.StringNull(rs.getString(student.getFStudentDocumentStatusDegree())));
                student.setStudentDocumentStatusOther1(config1.StringNull(rs.getString(student.getFStudentDocumentStatusOther1())));
                student.setStudentDocumentStatusOther2(config1.StringNull(rs.getString(student.getFStudentDocumentStatusOther2())));

                student.setStudentDocumentStatusPicture(config1.StringNull(rs.getString(student.getFStudentDocumentStatusPicture())));
                student.setStudentDocumentStatusPid(config1.StringNull(rs.getString(student.getFStudentDocumentStatusPid())));
                student.setStudentDocumentStatusUserHome(config1.StringNull(rs.getString(student.getFStudentDocumentStatusUserHome())));
                student.setStudentDressChest(config1.StringNull(rs.getString(student.getFStudentDressChest())));
                student.setStudentDressHeight(config1.StringNull(rs.getString(student.getFStudentDressHeight())));

                student.setStudentDressHip(config1.StringNull(rs.getString(student.getFStudentDressHip())));
                student.setStudentDressOther(config1.StringNull(rs.getString(student.getFStudentDressOther())));
                student.setStudentDressShoulder(config1.StringNull(rs.getString(student.getFStudentDressShoulder())));
                student.setStudentEmail(config1.StringNull(rs.getString(student.getFStudentEmail())));
                student.setStudentFirstNamet(config1.StringNull(rs.getString(student.getFStudentFirstNamet())));

                student.setStudentHeight(config1.StringNull(rs.getString(student.getFStudentHeight())));
                student.setStudentHighSchoolFaculty(config1.StringNull(rs.getString(student.getFStudentHighSchoolFaculty())));
                student.setStudentHighSchoolNamet(config1.StringNull(rs.getString(student.getFStudentHighSchoolNamet())));
                student.setStudentHighSchoolPoint(config1.StringNull(rs.getString(student.getFStudentHighSchoolPoint())));
                student.setStudentHighSchoolYear(config1.StringNull(rs.getString(student.getFStudentHighSchoolYear())));

                student.setStudentLastNamet(config1.StringNull(rs.getString(student.getFStudentLastNamet())));
                student.setStudentNationality(config1.StringNull(rs.getString(student.getFStudentNationality())));
                student.setStudentOther1School(config1.StringNull(rs.getString(student.getFStudentOther1School())));
                student.setStudentOther1SchoolFaculty(config1.StringNull(rs.getString(student.getFStudentOther1SchoolFaculty())));
                student.setStudentOther1SchoolNamet(config1.StringNull(rs.getString(student.getFStudentOther1SchoolNamet())));

                student.setStudentOther1SchoolPoint(config1.StringNull(rs.getString(student.getFStudentOther1SchoolPoint())));
                student.setStudentOther1SchoolYear(config1.StringNull(rs.getString(student.getFStudentOther1SchoolYear())));
                student.setStudentOther2School(config1.StringNull(rs.getString(student.getFStudentOther2School())));
                student.setStudentOther2SchoolFaculty(config1.StringNull(rs.getString(student.getFStudentOther2SchoolFaculty())));
                student.setStudentOther2SchoolNamet(config1.StringNull(rs.getString(student.getFStudentOther2SchoolNamet())));

                student.setStudentOther2SchoolPoint(config1.StringNull(rs.getString(student.getFStudentOther2SchoolPoint())));
                student.setStudentOther2SchoolYear(config1.StringNull(rs.getString(student.getFStudentOther2SchoolYear())));
                student.setStudentPid(config1.StringNull(rs.getString(student.getFStudentPid())));
                student.setStudentPidExpire(config1.StringNull(rs.getString(student.getFStudentPidExpire())));
                student.setStudentPidIssued(config1.StringNull(rs.getString(student.getFStudentPidIssued())));

                student.setStudentReligion(config1.StringNull(rs.getString(student.getFStudentReligion())));
                student.setStudentSecondarySchoolFaculty(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolFaculty())));
                student.setStudentSecondarySchoolNamet(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolNamet())));
                student.setStudentSecondarySchoolPoint(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolPoint())));
                student.setStudentSecondarySchoolYear(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolYear())));
                student.setStudentSex(config1.StringNull(rs.getString(student.getFStudentSex())));

                student.setStudentTelephone(config1.StringNull(rs.getString(student.getFStudentTelephone())));
                student.setStudentWidth(config1.StringNull(rs.getString(student.getFStudentWidth())));
                student.setStudentActive(config1.StringNull(rs.getString(student.getFStudentActive())));
                student.setStudentDateApply(config1.StringNull(rs.getString(student.getFStudentDateApply())));
                student.setStudentSchoolYear(config1.StringNull(rs.getString(student.getFStudentSchoolYear())));

                student.setStudentModelStudies(config1.StringNull(rs.getString(student.getFStudentModelStudies())));
                student.setStudentCode(config1.StringNull(rs.getString(student.getFStudentCode())));

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTUseCarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return student;
    }
    public Vector getBhacTStudent(String student_id) {
        Connection conn;
        BhacTStudent student = new BhacTStudent();
        Vector v_student = new Vector();
        String sql="";
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            sql="Select * "
                +"From "+student.getBhacTStudent()+"  "
                +"Where "+student.getFStudentId()+"='"+student_id+"'";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                student = new BhacTStudent();
                student.setStudentId(config1.StringNull(rs.getString(student.getFStudentId())));
                student.setStudentAge(config1.StringNull(rs.getString(student.getFStudentAge())));
                student.setStudentBachelorSchoolFaculty(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolFaculty())));
                student.setStudentBachelorSchoolNamet(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolNamet())));
                student.setStudentBachelorSchoolPoint(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolPoint())));

                student.setStudentBachelorSchoolYear(config1.StringNull(rs.getString(student.getFStudentBachelorSchoolYear())));
                student.setStudentBirthday(config1.StringNull(rs.getString(student.getFStudentBirthday())));
                student.setStudentCurrentAmphur(config1.StringNull(rs.getString(student.getFStudentCurrentAmphur())));
                student.setStudentCurrentApartment(config1.StringNull(rs.getString(student.getFStudentCurrentApartment())));
                student.setStudentCurrentApartmentRoom(config1.StringNull(rs.getString(student.getFStudentCurrentApartmentRoom())));

                student.setStudentCurrentChangwat(config1.StringNull(rs.getString(student.getFStudentCurrentChangwat())));
                student.setStudentCurrentHouse(config1.StringNull(rs.getString(student.getFStudentCurrentHouse())));
                student.setStudentCurrentMoo(config1.StringNull(rs.getString(student.getFStudentCurrentMoo())));
                student.setStudentCurrentRoad(config1.StringNull(rs.getString(student.getFStudentCurrentRoad())));
                student.setStudentCurrentSoi(config1.StringNull(rs.getString(student.getFStudentCurrentSoi())));

                student.setStudentCurrentTambon(config1.StringNull(rs.getString(student.getFStudentCurrentTambon())));
                student.setStudentDate(config1.StringNull(rs.getString(student.getFStudentDate())));
                student.setStudentDocumentStatusDegree(config1.StringNull(rs.getString(student.getFStudentDocumentStatusDegree())));
                student.setStudentDocumentStatusOther1(config1.StringNull(rs.getString(student.getFStudentDocumentStatusOther1())));
                student.setStudentDocumentStatusOther2(config1.StringNull(rs.getString(student.getFStudentDocumentStatusOther2())));

                student.setStudentDocumentStatusPicture(config1.StringNull(rs.getString(student.getFStudentDocumentStatusPicture())));
                student.setStudentDocumentStatusPid(config1.StringNull(rs.getString(student.getFStudentDocumentStatusPid())));
                student.setStudentDocumentStatusUserHome(config1.StringNull(rs.getString(student.getFStudentDocumentStatusUserHome())));
                student.setStudentDressChest(config1.StringNull(rs.getString(student.getFStudentDressChest())));
                student.setStudentDressHeight(config1.StringNull(rs.getString(student.getFStudentDressHeight())));

                student.setStudentDressHip(config1.StringNull(rs.getString(student.getFStudentDressHip())));
                student.setStudentDressOther(config1.StringNull(rs.getString(student.getFStudentDressOther())));
                student.setStudentDressShoulder(config1.StringNull(rs.getString(student.getFStudentDressShoulder())));
                student.setStudentEmail(config1.StringNull(rs.getString(student.getFStudentEmail())));
                student.setStudentFirstNamet(config1.StringNull(rs.getString(student.getFStudentFirstNamet())));

                student.setStudentHeight(config1.StringNull(rs.getString(student.getFStudentHeight())));
                student.setStudentHighSchoolFaculty(config1.StringNull(rs.getString(student.getFStudentHighSchoolFaculty())));
                student.setStudentHighSchoolNamet(config1.StringNull(rs.getString(student.getFStudentHighSchoolNamet())));
                student.setStudentHighSchoolPoint(config1.StringNull(rs.getString(student.getFStudentHighSchoolPoint())));
                student.setStudentHighSchoolYear(config1.StringNull(rs.getString(student.getFStudentHighSchoolYear())));

                student.setStudentLastNamet(config1.StringNull(rs.getString(student.getFStudentLastNamet())));
                student.setStudentNationality(config1.StringNull(rs.getString(student.getFStudentNationality())));
                student.setStudentOther1School(config1.StringNull(rs.getString(student.getFStudentOther1School())));
                student.setStudentOther1SchoolFaculty(config1.StringNull(rs.getString(student.getFStudentOther1SchoolFaculty())));
                student.setStudentOther1SchoolNamet(config1.StringNull(rs.getString(student.getFStudentOther1SchoolNamet())));

                student.setStudentOther1SchoolPoint(config1.StringNull(rs.getString(student.getFStudentOther1SchoolPoint())));
                student.setStudentOther1SchoolYear(config1.StringNull(rs.getString(student.getFStudentOther1SchoolYear())));
                student.setStudentOther2School(config1.StringNull(rs.getString(student.getFStudentOther2School())));
                student.setStudentOther2SchoolFaculty(config1.StringNull(rs.getString(student.getFStudentOther2SchoolFaculty())));
                student.setStudentOther2SchoolNamet(config1.StringNull(rs.getString(student.getFStudentOther2SchoolNamet())));

                student.setStudentOther2SchoolPoint(config1.StringNull(rs.getString(student.getFStudentOther2SchoolPoint())));
                student.setStudentOther2SchoolYear(config1.StringNull(rs.getString(student.getFStudentOther2SchoolYear())));
                student.setStudentPid(config1.StringNull(rs.getString(student.getFStudentPid())));
                student.setStudentPidExpire(config1.StringNull(rs.getString(student.getFStudentPidExpire())));
                student.setStudentPidIssued(config1.StringNull(rs.getString(student.getFStudentPidIssued())));

                student.setStudentReligion(config1.StringNull(rs.getString(student.getFStudentReligion())));
                student.setStudentSecondarySchoolFaculty(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolFaculty())));
                student.setStudentSecondarySchoolNamet(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolNamet())));
                student.setStudentSecondarySchoolPoint(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolPoint())));
                student.setStudentSecondarySchoolYear(config1.StringNull(rs.getString(student.getFStudentSecondarySchoolYear())));
                student.setStudentSex(config1.StringNull(rs.getString(student.getFStudentSex())));

                student.setStudentTelephone(config1.StringNull(rs.getString(student.getFStudentTelephone())));
                student.setStudentWidth(config1.StringNull(rs.getString(student.getFStudentWidth())));
                student.setStudentActive(config1.StringNull(rs.getString(student.getFStudentActive())));
                student.setStudentDateApply(config1.StringNull(rs.getString(student.getFStudentDateApply())));
                student.setStudentSchoolYear(config1.StringNull(rs.getString(student.getFStudentSchoolYear())));

                student.setStudentModelStudies(config1.StringNull(rs.getString(student.getFStudentModelStudies())));
                student.setStudentCode(config1.StringNull(rs.getString(student.getFStudentCode())));
                v_student.add(student);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTUseCarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_student;
    }
    public String setSaveBhacTStudent(BhacTStudent item, String flagpage) throws Exception {
        int chk=0;
        String sql="", ma_date="", attend_date="", max="";
        BhacTStudent student = new BhacTStudent();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            student = getBhacTStudentByPK(item.getStudentId());
            item.setStudentFirstNamet(item.getStudentFirstNamet().replace("'", "''"));
            item.setStudentLastNamet(item.getStudentLastNamet().replace("'", "''"));
            item.setStudentBachelorSchoolFaculty(item.getStudentBachelorSchoolFaculty().replace("'", "''"));
            item.setStudentBachelorSchoolPoint(item.getStudentBachelorSchoolPoint().replace("'", "''"));
            item.setStudentBachelorSchoolNamet(item.getStudentBachelorSchoolNamet().replace("'", "''"));
            item.setStudentHighSchoolFaculty(item.getStudentHighSchoolFaculty().replace("'", "''"));
            item.setStudentHighSchoolNamet(item.getStudentHighSchoolNamet().replace("'", "''"));
            item.setStudentHighSchoolPoint(item.getStudentHighSchoolPoint().replace("'", "''"));
            item.setStudentCurrentHouse(item.getStudentCurrentHouse().replace("'", "''"));
            item.setStudentCurrentMoo(item.getStudentCurrentMoo().replace("'", "''"));
            item.setStudentCurrentRoad(item.getStudentCurrentRoad().replace("'", "''"));
            item.setStudentCurrentSoi(item.getStudentCurrentSoi().replace("'", "''"));
//            item.setSerialNo(item.getSerialNo().replace("'", "''"));
//            item.setServiceTab(item.getServiceTab().replace("'", "''"));
//            item.setWarranty(item.getWarranty().replace("'", "''"));
            if(student.getStudentId().equals("")){
                max = getMaxRowBhacTStudent(conn);
                sql="Insert Into "+student.getBhacTStudent()+"("
                        +student.getFStudentId()+", "+student.getFStudentAge()+", "
                        +student.getFStudentBachelorSchoolFaculty()+","+ student.getFStudentBachelorSchoolNamet()+","
                        +student.getFStudentBachelorSchoolPoint()+","+ student.getFStudentBachelorSchoolYear()+","
                        +student.getFStudentBirthday()+","+ student.getFStudentCode()+","
                        +student.getFStudentCurrentAmphur()+","+ student.getFStudentCurrentApartment()+","
                        +student.getFStudentCurrentApartmentRoom()+","+ student.getFStudentCurrentChangwat()+","
                        +student.getFStudentCurrentHouse()+","+ student.getFStudentCurrentMoo()+","
                        +student.getFStudentCurrentRoad()+","+ student.getFStudentCurrentSoi()+","
                        +student.getFStudentCurrentTambon()+","+ student.getFStudentDate()+","
                        +student.getFStudentDateApply()+","+ student.getFStudentDocumentStatusPicture()+","
                        +student.getFStudentDocumentStatusDegree()+","+ student.getFStudentDocumentStatusOther1()+","
                        +student.getFStudentDocumentStatusOther2()+","+ student.getFStudentDocumentStatusPid()+","
                        +student.getFStudentDocumentStatusUserHome()+","+ student.getFStudentDressChest()+","
                        +student.getFStudentDressHeight()+","+student.getFStudentDressHip()+","
                        +student.getFStudentDressOther()+","+student.getFStudentDressShoulder()+","
                        +student.getFStudentEmail()+","+student.getFStudentFirstNamet()+","
                        +student.getFStudentHeight()+","+student.getFStudentHighSchoolFaculty()+","
                        +student.getFStudentHighSchoolNamet()+","+student.getFStudentHighSchoolPoint()+","
                        +student.getFStudentHighSchoolYear()+","+student.getFStudentActive()+","
                        +student.getFStudentLastNamet()+","+student.getFStudentModelStudies()+","
                        +student.getFStudentNationality()+","+student.getFStudentOther1School()+","
                        +student.getFStudentOther1SchoolFaculty()+","+student.getFStudentOther1SchoolNamet()+","
                        +student.getFStudentOther1SchoolPoint()+","+student.getFStudentOther1SchoolYear()+","
                        +student.getFStudentOther2School()+","+student.getFStudentOther2SchoolFaculty()+","
                        +student.getFStudentOther2SchoolNamet()+","+student.getFStudentOther2SchoolPoint()+","
                        +student.getFStudentOther2SchoolYear()+","+student.getFStudentPid()+","
                        +student.getFStudentPidExpire()+","+student.getFStudentPidIssued()+","
                        +student.getFStudentReligion()+","+student.getFStudentSchoolYear()+","
                        +student.getFStudentSecondarySchoolFaculty()+","+student.getFStudentSecondarySchoolNamet()+","
                        +student.getFStudentSecondarySchoolPoint()+","+student.getFStudentSecondarySchoolYear()+","
                        +student.getFStudentSex()+","+student.getFStudentTelephone()+","
                        +student.getFStudentWidth()+") "
                        +"Values('"+max+"','"+item.getStudentAge()+"','"
                        +item.getStudentBachelorSchoolFaculty() + "','"+ item.getStudentBachelorSchoolNamet()+"','"
                        +item.getStudentBachelorSchoolPoint() + "','"+ item.getStudentBachelorSchoolYear()+"','"
                        +item.getStudentBirthday() + "','"+ item.getStudentCode()+"','"
                        +item.getStudentCurrentAmphur() + "','"+ item.getStudentCurrentApartment()+"','"
                        +item.getStudentCurrentApartmentRoom() + "','"+ item.getStudentCurrentChangwat()+"','"
                        +item.getStudentCurrentHouse() + "','"+ item.getStudentCurrentMoo()+"','"
                        +item.getStudentCurrentRoad() + "','"+ item.getStudentCurrentSoi()+"','"
                        +item.getStudentCurrentTambon() + "','"+ item.getStudentDate()+"','"
                        +item.getStudentDateApply() + "','"+ item.getStudentDocumentStatusPicture()+"','"
                        +item.getStudentDocumentStatusDegree() + "','"+ item.getStudentDocumentStatusOther1()+"','"
                        +item.getStudentDocumentStatusOther2() + "','"+ item.getStudentDocumentStatusPid()+"','"
                        +item.getStudentDocumentStatusUserHome() + "','"+ item.getStudentDressChest()+"','"
                        +item.getStudentDressHeight() + "','"+ item.getStudentDressHip()+"','"
                        +item.getStudentDressOther()+"','"+item.getStudentDressShoulder()+"','"
                        +item.getStudentEmail()+"','"+item.getStudentFirstNamet()+"','"
                        +item.getStudentHeight()+"','"+item.getStudentHighSchoolFaculty()+"','"
                        +item.getStudentHighSchoolNamet()+"','"+item.getStudentHighSchoolPoint()+"','"
                        +item.getStudentHighSchoolYear()+"','"+item.getStudentActive()+"','"
                        +item.getStudentLastNamet()+"','"+item.getStudentModelStudies()+"','"
                        +item.getStudentNationality()+"','"+item.getStudentOther1School()+"','"
                        +item.getStudentOther1SchoolFaculty()+"','"+item.getStudentOther1SchoolNamet()+"','"
                        +item.getStudentOther1SchoolPoint()+"','"+item.getStudentOther1SchoolYear()+"','"
                        +item.getStudentOther2School()+"','"+item.getStudentOther2SchoolFaculty()+"','"
                        +item.getStudentOther2SchoolNamet()+"','"+item.getStudentOther2SchoolPoint()+"','"
                        +item.getStudentOther2SchoolYear()+"','"+item.getStudentPid()+"','"
                        +item.getStudentPidExpire()+"','"+item.getStudentPidIssued()+"','"
                        +item.getStudentReligion()+"','"+item.getStudentSchoolYear()+"','"
                        +item.getStudentSecondarySchoolFaculty()+"','"+item.getStudentSecondarySchoolNamet()+"','"
                        +item.getStudentSecondarySchoolPoint()+"','"+item.getStudentSecondarySchoolYear()+"','"
                        +item.getStudentSex()+"','"+item.getStudentTelephone()+"','"
                        +item.getStudentWidth()+"')";
            }
            else{
//                attend_date=config1.DateFormatShow2DB(itemdetail.getAttendDate(), "ddMMyyyy");
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+student.getBhacTStudent()+" set "
                +student.getFStudentAge()+" = '"+item.getFStudentAge()+"', "
                +student.getFStudentBachelorSchoolFaculty()+" = '"+item.getStudentBachelorSchoolFaculty()+"', "
                +student.getFStudentBachelorSchoolNamet()+" = '"+item.getStudentBachelorSchoolNamet()+"', "
                +student.getFStudentBachelorSchoolPoint()+" = '"+item.getStudentBachelorSchoolPoint()+"', "
                +student.getFStudentBachelorSchoolYear()+" = '"+item.getStudentBachelorSchoolYear()+"', "
                +student.getFStudentBirthday()+" = '"+item.getStudentBirthday()+"', "
                +student.getFStudentCode()+" = '"+item.getStudentCode()+"', "
                +student.getFStudentCurrentAmphur()+" = '"+item.getStudentCurrentAmphur()+"', "
                +student.getFStudentCurrentApartment()+" = '"+item.getStudentCurrentApartment()+"', "
                +student.getFStudentCurrentApartmentRoom()+" = '"+item.getStudentCurrentApartmentRoom()+"', "
                +student.getFStudentCurrentChangwat()+" = '"+item.getStudentCurrentChangwat()+"', "
                +student.getFStudentCurrentHouse()+" = '"+item.getStudentCurrentHouse()+"', "
                +student.getFStudentCurrentMoo()+" = '"+item.getStudentCurrentMoo()+"', "
                +student.getFStudentCurrentRoad()+" = '"+item.getStudentCurrentRoad()+"', "
                +student.getFStudentCurrentSoi()+" = '"+item.getStudentCurrentSoi()+"', "
                +student.getFStudentCurrentTambon()+" = '"+item.getStudentCurrentTambon()+"', "
                +student.getFStudentDate()+" = '"+item.getStudentDate()+"', "
                +student.getFStudentDateApply()+" = '"+item.getStudentDateApply()+"', "
                +student.getFStudentDocumentStatusPicture()+" = '"+item.getStudentDocumentStatusPicture()+"', "
                +student.getFStudentDocumentStatusDegree()+" = '"+item.getStudentDocumentStatusDegree()+"', "
                +student.getFStudentDocumentStatusOther1()+" = '"+item.getStudentDocumentStatusOther1()+"', "
                +student.getFStudentDocumentStatusOther2()+" = '"+item.getStudentDocumentStatusOther2()+"', "
                +student.getFStudentDocumentStatusPid()+" = '"+item.getStudentDocumentStatusPid()+"', "
                +student.getFStudentDocumentStatusUserHome()+" = '"+item.getStudentDocumentStatusUserHome()+"', "
                +student.getFStudentDressChest()+" = '"+item.getStudentDressChest()+"', "
                +student.getFStudentDressHeight()+" = '"+item.getStudentDressHeight()+"', "
                +student.getFStudentDressHip()+" = '"+item.getStudentDressHip()+"', "
                +student.getFStudentDressOther()+" = '"+item.getStudentDressOther()+"', "
                +student.getFStudentDressShoulder()+" = '"+item.getStudentDressShoulder()+"', "
                +student.getFStudentEmail()+" = '"+item.getStudentEmail()+"', "
                +student.getFStudentFirstNamet()+" = '"+item.getStudentFirstNamet()+"', "
                +student.getFStudentHeight()+" = '"+item.getStudentHeight()+"', "
                +student.getFStudentHighSchoolFaculty()+" = '"+item.getStudentHighSchoolFaculty()+"', "
                +student.getFStudentHighSchoolNamet()+" = '"+item.getStudentHighSchoolNamet()+"', "
                +student.getFStudentHighSchoolPoint()+" = '"+item.getStudentHighSchoolPoint()+"', "
                +student.getFStudentHighSchoolYear()+" = '"+item.getStudentHighSchoolYear()+"', "
                +student.getFStudentActive()+" = '"+item.getStudentActive()+"', "
                +student.getFStudentLastNamet()+" = '"+item.getStudentLastNamet()+"', "
                +student.getFStudentModelStudies()+" = '"+item.getStudentModelStudies()+"', "
                +student.getFStudentNationality()+" = '"+item.getStudentNationality()+"', "
                +student.getFStudentOther1School()+" = '"+item.getStudentOther1School()+"', "
                +student.getFStudentOther1SchoolFaculty()+" = '"+item.getStudentOther1SchoolFaculty()+"', "
                +student.getFStudentOther1SchoolNamet()+" = '"+item.getStudentOther1SchoolNamet()+"', "
                +student.getFStudentOther1SchoolPoint()+" = '"+item.getStudentOther1SchoolPoint()+"', "
                +student.getFStudentOther1SchoolYear()+" = '"+item.getStudentOther1SchoolYear()+"', "
                +student.getFStudentOther2School()+" = '"+item.getStudentOther2School()+"', "
                +student.getFStudentOther2SchoolFaculty()+" = '"+item.getStudentOther2SchoolFaculty()+"', "
                +student.getFStudentOther2SchoolNamet()+" = '"+item.getStudentOther2SchoolNamet()+"', "
                +student.getFStudentOther2SchoolPoint()+" = '"+item.getStudentOther2SchoolPoint()+"', "
                +student.getFStudentOther2SchoolYear()+" = '"+item.getStudentOther2SchoolYear()+"', "
                +student.getFStudentPid()+" = '"+item.getStudentPid()+"', "
                +student.getFStudentPidExpire()+" = '"+item.getStudentPidExpire()+"', "
                +student.getFStudentPidIssued()+" = '"+item.getStudentPidIssued()+"', "
                +student.getFStudentReligion()+" = '"+item.getStudentReligion()+"', "
                +student.getFStudentSchoolYear()+" = '"+item.getStudentSchoolYear()+"', "
                +student.getFStudentSecondarySchoolFaculty()+" = '"+item.getStudentSecondarySchoolFaculty()+"', "
                +student.getFStudentSecondarySchoolNamet()+" = '"+item.getStudentSecondarySchoolNamet()+"', "
                +student.getFStudentSecondarySchoolPoint()+" = '"+item.getStudentSecondarySchoolPoint()+"', "
                +student.getFStudentSecondarySchoolYear()+" = '"+item.getStudentSecondarySchoolYear()+"', "
                +student.getFStudentSex()+" = '"+item.getStudentSex()+"', "
                +student.getFStudentTelephone()+" = '"+item.getStudentTelephone()+"', "
                +student.getFStudentWidth()+" = '"+item.getStudentWidth()+"' "
                +"Where "+student.getFStudentId()+" = '"+item.getStudentId()+"'";
                max = item.getStudentId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(AdminTUseCarDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public String CboSchoolYear(String selected) {
        String txt="",sql="";
        Vector v_schoolyear = new Vector();
        BhacBSchoolYear schoolyear = new BhacBSchoolYear();
        v_schoolyear = getSchoolYear();
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_schoolyear.size()-1;i++) {
            schoolyear = (BhacBSchoolYear) v_schoolyear.get(i);
            if(schoolyear.getFSchoolYearId().equals(selected)){
                txt += "<option value='"+schoolyear.getFSchoolYearId()+"' selected>"+schoolyear.getSchoolYearNamet()+"</option>";
            }
            else {
                txt += "<option value='"+schoolyear.getFSchoolYearId()+"' >"+schoolyear.getSchoolYearNamet()+"</option>";
            }
            if(i==4){
                sql="";
            }
        }
        return txt;
    }
    public Vector getSchoolYear() {
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        BhacBSchoolYear schoolyear = new BhacBSchoolYear();
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql = "Select * "
                    +"From bhac_b_school_year   "
                    +"Where school_year_active = 'I' ";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                schoolyear = new BhacBSchoolYear();
                schoolyear.setSchoolYearId(rs.getString("school_year_id"));
                schoolyear.setSchoolYearNamet(rs.getString("school_year_namet"));
                v_result.add(schoolyear);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }
    public String CboModelStudies(String selected) {
        String txt="",sql="";
        Vector v_modelstudies = new Vector();
        BhacBModelStudies modelstudies = new BhacBModelStudies();
        v_modelstudies = getModelStudies();
        txt="<option value='' selected></option>";
        for(int i=0;i<=v_modelstudies.size()-1;i++) {
            modelstudies = (BhacBModelStudies) v_modelstudies.get(i);
            if(modelstudies.getModelStudiesId().equals(selected)) {
                txt += "<option value='"+modelstudies.getModelStudiesId()+"' selected>"+modelstudies.getModelStudiesNamet()+"</option>";
            }
            else {
                txt += "<option value='"+modelstudies.getModelStudiesId()+"' >"+modelstudies.getModelStudiesNamet()+"</option>";
            }
            if(i==4) {
                sql="";
            }
        }
        return txt;
    }
    public Vector getModelStudies() {
        String sql="", txt="";
        Vector v_result = new Vector();
        Connection conn;
        Statement st;
        ResultSet rs;
        BhacBModelStudies modelstudies = new BhacBModelStudies();
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            sql = "Select * "
                    +"From bhac_b_school_year   "
                    +"Where school_year_active = 'I' ";
            rs = st.executeQuery(sql);
            while(rs.next()) {
                modelstudies = new BhacBModelStudies();
                modelstudies.setModelStudiesId(rs.getString("school_year_id"));
                modelstudies.setModelStudiesNamet(rs.getString("school_year_namet"));
                v_result.add(modelstudies);
            }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(Config1.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_result;
    }

}
