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
public class DoctorTCheckupDB {
    private Config1 config1 = new Config1();
    private DoctorTCheckup checkup = new DoctorTCheckup();
    public String getMaxRowDoctorCheckUp(Connection conn){
        String sql="", max="";
        try {
//            Connection conn = config1.getConnectionBangna();
            Statement st;
            ResultSet rs;
            st = conn.createStatement();

            sql="Select max("+checkup.getFCheckUpId()+") as cnt From "+checkup.getDoctorTCheckup();
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
                max = "12000001";
            }
        } catch (Exception ex) {
            Logger.getLogger(DoctorTCheckupDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public DoctorTCheckup getDoctorCheckUpByPK(String checkup_id) {
        Connection conn;
        DoctorTCheckup checkup = new DoctorTCheckup();
//        BDepartment department = new BDepartment();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            String sql="";
            sql="Select dd.* "
                +"From "+checkup.getDoctorTCheckup()+" as dd "
                +"Where "+checkup.getFCheckUpId()+" = '"+checkup_id+"' ";
                //+"Order By "+admintbilllab.getFBillLabId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                checkup = new DoctorTCheckup();
                checkup.setCheckupId(config1.StringNull(rs.getString(checkup.getFCheckUpId())));
                checkup.setCheckupDate(config1.StringNull(rs.getString(checkup.getFCheckUpDate())));
                checkup.setFPatientPrefixId(config1.StringNull(rs.getString(checkup.getFFPatientPrefixId())));
                checkup.setPatientFirstnamet(config1.StringNull(rs.getString(checkup.getFPatientFirstnameT())));
                checkup.setPatientLastnamet(config1.StringNull(rs.getString(checkup.getFPatientLastnameT())));

                checkup.setPatientHn(config1.StringNull(rs.getString(checkup.getFPatientHn())));
                checkup.setFSexId(config1.StringNull(rs.getString(checkup.getFFSexId())));
                checkup.setFPatientPrefixNamee(config1.StringNull(rs.getString(checkup.getFFPateintPrefixNameE())));
                checkup.setPatientFirstnamee(config1.StringNull(rs.getString(checkup.getFPateintFirstnameE())));
                checkup.setPatientLastnamee(config1.StringNull(rs.getString(checkup.getFPateintLastnameE())));

                checkup.setCheckupActive(config1.StringNull(rs.getString(checkup.getFCheckUpActive())));
                checkup.setPatientAge(config1.StringNull(rs.getString(checkup.getFPatientAge())));
                checkup.setFPatientBloodGroupId(config1.StringNull(rs.getString(checkup.getFFPatientBlodGroupId())));
                checkup.setPatientPid(config1.StringNull(rs.getString(checkup.getFPatientPId())));
                checkup.setPassportNo(config1.StringNull(rs.getString(checkup.getFPassportNo())));

                checkup.setFPatientMarriageStatusId(config1.StringNull(rs.getString(checkup.getFFPatientMarriageStatusId())));
                checkup.setPatientChangwat(config1.StringNull(rs.getString(checkup.getFFPatientChangwat())));
                checkup.setFPatientNationId(config1.StringNull(rs.getString(checkup.getFFPatientNationId())));
                checkup.setAsthma(config1.StringNull(rs.getString(checkup.getFAsthma())));
                checkup.setHypertension(config1.StringNull(rs.getString(checkup.getFHypertension())));

                checkup.setHeartDiseases(config1.StringNull(rs.getString(checkup.getFHeartDiseases())));
                checkup.setDiabetesMellitus(config1.StringNull(rs.getString(checkup.getFDiabetesMellitus())));
                checkup.setJaundice(config1.StringNull(rs.getString(checkup.getFJaundice())));
                checkup.setEpilepsy(config1.StringNull(rs.getString(checkup.getFEpilepsy())));
                checkup.setVeneralDiseases(config1.StringNull(rs.getString(checkup.getFVeneralDiseases())));

                checkup.setAcquiredImmune(config1.StringNull(rs.getString(checkup.getFAcquiredImmune())));
                checkup.setEdema(config1.StringNull(rs.getString(checkup.getFEdema())));
                checkup.setYaws(config1.StringNull(rs.getString(checkup.getFYaws())));
                checkup.setOtorrhea(config1.StringNull(rs.getString(checkup.getFOtorrhea())));
                checkup.setHernia(config1.StringNull(rs.getString(checkup.getFHernia())));

                checkup.setHemorrhoid(config1.StringNull(rs.getString(checkup.getFHemorrhoid())));
                checkup.setAccident(config1.StringNull(rs.getString(checkup.getFAccident())));
                checkup.setFractures(config1.StringNull(rs.getString(checkup.getFFractures())));
                checkup.setSurgicalOperation(config1.StringNull(rs.getString(checkup.getFSurgicalOperation())));
                checkup.setMalaria(config1.StringNull(rs.getString(checkup.getFMalaria())));

                checkup.setHeight(config1.StringNull(rs.getString(checkup.getFHeight())));
                checkup.setWidth(config1.StringNull(rs.getString(checkup.getFWidth())));
                checkup.setBloodPressure(config1.StringNull(rs.getString(checkup.getFBloodPressure())));
                checkup.setPulse(config1.StringNull(rs.getString(checkup.getFPulse())));
                checkup.setEyeLeft(config1.StringNull(rs.getString(checkup.getFEyeLeft())));

                checkup.setEyeRight(config1.StringNull(rs.getString(checkup.getFEyeRight())));
                checkup.setGlasses(config1.StringNull(rs.getString(checkup.getFGlasses())));
                checkup.setColorBlindness(config1.StringNull(rs.getString(checkup.getFColorBlindness())));
                checkup.setGeneralAppearance(config1.StringNull(rs.getString(checkup.getFGeneralAppearance())));
                checkup.setSkinScalp(config1.StringNull(rs.getString(checkup.getFSkinScalp())));

                checkup.setLymphNodes(config1.StringNull(rs.getString(checkup.getFLymphNodes())));
                checkup.setEars(config1.StringNull(rs.getString(checkup.getFEars())));
                checkup.setEyes(config1.StringNull(rs.getString(checkup.getFEyes())));
                checkup.setNose(config1.StringNull(rs.getString(checkup.getFNose())));
                checkup.setPharynxTonsils(config1.StringNull(rs.getString(checkup.getFPharynxTonsils())));

                checkup.setThyroidGland(config1.StringNull(rs.getString(checkup.getFThyroidGland())));
                checkup.setLungs(config1.StringNull(rs.getString(checkup.getFLungs())));
                checkup.setHeart(config1.StringNull(rs.getString(checkup.getFHeart())));
                checkup.setAdditionComments(config1.StringNull(rs.getString(checkup.getFAdditionComments())));
                checkup.setAbdomen(config1.StringNull(rs.getString(checkup.getFAbdomen())));

                checkup.setLiver(config1.StringNull(rs.getString(checkup.getFLiver())));
                checkup.setSpleen(config1.StringNull(rs.getString(checkup.getFSpleen())));
                checkup.setExtenalGenitalia(config1.StringNull(rs.getString(checkup.getFExtenalGenitalia())));
                checkup.setRectalExam(config1.StringNull(rs.getString(checkup.getFRectalExam())));
                checkup.setVertebrae(config1.StringNull(rs.getString(checkup.getFVertebrae())));

                checkup.setLocomotor(config1.StringNull(rs.getString(checkup.getFLocomotor())));
                checkup.setReflexes(config1.StringNull(rs.getString(checkup.getFReflexes())));
                checkup.setMentalHealthStatus(config1.StringNull(rs.getString(checkup.getFMentalHealthStatus())));
                checkup.setOther(config1.StringNull(rs.getString(checkup.getFOther())));
                checkup.setHemoglobin(config1.StringNull(rs.getString(checkup.getFHemoglobin())));

                checkup.setDifferentiaPmn(config1.StringNull(rs.getString(checkup.getFDifferentiaPmn())));
                checkup.setDifferentiaBaso(config1.StringNull(rs.getString(checkup.getFDifferentiaBaso())));
                checkup.setWhiteBloodCell(config1.StringNull(rs.getString(checkup.getFWhiteBloodCell())));
                checkup.setDifferentialLymp(config1.StringNull(rs.getString(checkup.getFDifferentialLymp())));
                checkup.setDifferentialBlast(config1.StringNull(rs.getString(checkup.getFDifferentialBlast())));

                checkup.setDifferentialBand(config1.StringNull(rs.getString(checkup.getFDifferentialBand())));
                checkup.setDifferentialMono(config1.StringNull(rs.getString(checkup.getFDifferentialMono())));
                checkup.setDifferentialEos(config1.StringNull(rs.getString(checkup.getFDifferentialEos())));
                checkup.setHivGpa(config1.StringNull(rs.getString(checkup.getFHivGpa())));
                checkup.setHivElisa(config1.StringNull(rs.getString(checkup.getFHivElisa())));

                checkup.setHivWesternBlot(config1.StringNull(rs.getString(checkup.getFHivWesternBlot())));
                checkup.setHepatitis(config1.StringNull(rs.getString(checkup.getFHepatitis())));
                checkup.setHepatitisVdrl(config1.StringNull(rs.getString(checkup.getFHepatitisVdrl())));
                checkup.setHepatitisRpr(config1.StringNull(rs.getString(checkup.getFHepatitisRpr())));
                checkup.setHepatitisTpha(config1.StringNull(rs.getString(checkup.getFHepatitisTpha())));

                checkup.setBloodFilm(config1.StringNull(rs.getString(checkup.getFBloodFilm())));
                checkup.setBloodFilmComment(config1.StringNull(rs.getString(checkup.getFBloodFilmComment())));
                checkup.setUriColor(config1.StringNull(rs.getString(checkup.getFUriColor())));
                checkup.setUriPh(config1.StringNull(rs.getString(checkup.getFUriPh())));
                checkup.setUriSp(config1.StringNull(rs.getString(checkup.getFUriSp())));

                checkup.setUriSugar(config1.StringNull(rs.getString(checkup.getFUriSugar())));
                checkup.setUrine(config1.StringNull(rs.getString(checkup.getFUrine())));
                checkup.setAlbumin(config1.StringNull(rs.getString(checkup.getFAlbumin())));
                checkup.setBlood(config1.StringNull(rs.getString(checkup.getFBlood())));
                checkup.setKetone(config1.StringNull(rs.getString(checkup.getFKetone())));

                checkup.setBile(config1.StringNull(rs.getString(checkup.getFBile())));
                checkup.setMicroWbc(config1.StringNull(rs.getString(checkup.getFMicroWbc())));
                checkup.setRbc(config1.StringNull(rs.getString(checkup.getFRbc())));
                checkup.setCasts(config1.StringNull(rs.getString(checkup.getFCasts())));
                checkup.setEpithelalCell(config1.StringNull(rs.getString(checkup.getFEpithelalCell())));

                checkup.setEpithelalOther(config1.StringNull(rs.getString(checkup.getFEpithelalOther())));
                checkup.setStool(config1.StringNull(rs.getString(checkup.getFStool())));
                checkup.setChestXRay(config1.StringNull(rs.getString(checkup.getFChestXRay())));
                checkup.setOtherExaminations(config1.StringNull(rs.getString(checkup.getFOtherExaminations())));
                checkup.setAntiHcv(config1.StringNull(rs.getString(checkup.getFAntiHcv())));

                checkup.setConclusion(config1.StringNull(rs.getString(checkup.getFConclusion())));
                checkup.setDoctorId(config1.StringNull(rs.getString(checkup.getFDoctorId())));
                checkup.setDoctorFullnameE(config1.StringNull(rs.getString(checkup.getFDoctorFullnameE())));
                checkup.setDoctorFullnameT(config1.StringNull(rs.getString(checkup.getFDoctorFullnameT())));
                checkup.setBranchId(config1.StringNull(rs.getString(checkup.getFBranchId())));

                checkup.setFemaleLMP(config1.StringNull(rs.getString(checkup.getFFemaleLMP())));
                checkup.setMedicalExplain(config1.StringNull(rs.getString(checkup.getFMedicalExplain())));
                checkup.setOtoscopicExam(config1.StringNull(rs.getString(checkup.getFOtoscopicExam())));
                checkup.setOtherDescription(config1.StringNull(rs.getString(checkup.getFOtherDescrption())));
                checkup.setHiv(config1.StringNull(rs.getString(checkup.getFHiv())));

                checkup.setHepatitisType(config1.StringNull(rs.getString(checkup.getFHepatitisType())));
                checkup.setCheckupTime(config1.StringNull(rs.getString(checkup.getFCheckupTime())));
                checkup.setPatientBirthday(config1.StringNull(rs.getString(checkup.getFPateintBirthday())));
                checkup.setHemoptysis(config1.StringNull(rs.getString(checkup.getFHemoptysis())));
                checkup.setHematocrit(config1.StringNull(rs.getString(checkup.getFHematocrit())));

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return checkup;
    }
    public Vector getDoctorCheckUp(String branch_id, String flag) {
        Connection conn;
        DoctorTCheckup checkup = new DoctorTCheckup();
      Vector v_checkup = new Vector();
        try {
            conn = config1.getConnectionBangna();
            Statement stbangna = conn.createStatement();

            String sql="";
            sql="Select dd.* "
                +"From "+checkup.getDoctorTCheckup()+" as dd "
                +"Where "+checkup.getFCheckUpActive()+" = '1' "
                +"Order By "+checkup.getFCheckUpId()+" desc";
            ResultSet rs = stbangna.executeQuery(sql);
            while(rs.next()){
                checkup = new DoctorTCheckup();
                checkup.setCheckupId(config1.StringNull(rs.getString(checkup.getFCheckUpId())));
                checkup.setCheckupDate(config1.StringNull(rs.getString(checkup.getFCheckUpDate())));
                checkup.setFPatientPrefixId(config1.StringNull(rs.getString(checkup.getFFPatientPrefixId())));
                checkup.setPatientFirstnamet(config1.StringNull(rs.getString(checkup.getFPatientFirstnameT())));
                checkup.setPatientLastnamet(config1.StringNull(rs.getString(checkup.getFPatientLastnameT())));

                checkup.setPatientHn(config1.StringNull(rs.getString(checkup.getFPatientHn())));
                checkup.setFSexId(config1.StringNull(rs.getString(checkup.getFFSexId())));
                checkup.setFPatientPrefixNamee(config1.StringNull(rs.getString(checkup.getFFPateintPrefixNameE())));
                checkup.setPatientFirstnamee(config1.StringNull(rs.getString(checkup.getFPateintFirstnameE())));
                checkup.setPatientLastnamee(config1.StringNull(rs.getString(checkup.getFPateintLastnameE())));

                checkup.setCheckupActive(config1.StringNull(rs.getString(checkup.getFCheckUpActive())));
                checkup.setPatientAge(config1.StringNull(rs.getString(checkup.getFPatientAge())));
                checkup.setFPatientBloodGroupId(config1.StringNull(rs.getString(checkup.getFFPatientBlodGroupId())));
                checkup.setPatientPid(config1.StringNull(rs.getString(checkup.getFPatientPId())));
                checkup.setPassportNo(config1.StringNull(rs.getString(checkup.getFPassportNo())));

                checkup.setFPatientMarriageStatusId(config1.StringNull(rs.getString(checkup.getFFPatientMarriageStatusId())));
                checkup.setPatientChangwat(config1.StringNull(rs.getString(checkup.getFFPatientChangwat())));
                checkup.setFPatientNationId(config1.StringNull(rs.getString(checkup.getFFPatientNationId())));
                checkup.setAsthma(config1.StringNull(rs.getString(checkup.getFAsthma())));
                checkup.setHypertension(config1.StringNull(rs.getString(checkup.getFHypertension())));

                checkup.setHeartDiseases(config1.StringNull(rs.getString(checkup.getFHeartDiseases())));
                checkup.setDiabetesMellitus(config1.StringNull(rs.getString(checkup.getFDiabetesMellitus())));
                checkup.setJaundice(config1.StringNull(rs.getString(checkup.getFJaundice())));
                checkup.setEpilepsy(config1.StringNull(rs.getString(checkup.getFEpilepsy())));
                checkup.setVeneralDiseases(config1.StringNull(rs.getString(checkup.getFVeneralDiseases())));

                checkup.setAcquiredImmune(config1.StringNull(rs.getString(checkup.getFAcquiredImmune())));
                checkup.setEdema(config1.StringNull(rs.getString(checkup.getFEdema())));
                checkup.setYaws(config1.StringNull(rs.getString(checkup.getFYaws())));
                checkup.setOtorrhea(config1.StringNull(rs.getString(checkup.getFOtorrhea())));
                checkup.setHernia(config1.StringNull(rs.getString(checkup.getFHernia())));

                checkup.setHemorrhoid(config1.StringNull(rs.getString(checkup.getFHemorrhoid())));
                checkup.setAccident(config1.StringNull(rs.getString(checkup.getFAccident())));
                checkup.setFractures(config1.StringNull(rs.getString(checkup.getFFractures())));
                checkup.setSurgicalOperation(config1.StringNull(rs.getString(checkup.getFSurgicalOperation())));
                checkup.setMalaria(config1.StringNull(rs.getString(checkup.getFMalaria())));

                checkup.setHeight(config1.StringNull(rs.getString(checkup.getFHeight())));
                checkup.setWidth(config1.StringNull(rs.getString(checkup.getFWidth())));
                checkup.setBloodPressure(config1.StringNull(rs.getString(checkup.getFBloodPressure())));
                checkup.setPulse(config1.StringNull(rs.getString(checkup.getFPulse())));
                checkup.setEyeLeft(config1.StringNull(rs.getString(checkup.getFEyeLeft())));

                checkup.setEyeRight(config1.StringNull(rs.getString(checkup.getFEyeRight())));
                checkup.setGlasses(config1.StringNull(rs.getString(checkup.getFGlasses())));
                checkup.setColorBlindness(config1.StringNull(rs.getString(checkup.getFColorBlindness())));
                checkup.setGeneralAppearance(config1.StringNull(rs.getString(checkup.getFGeneralAppearance())));
                checkup.setSkinScalp(config1.StringNull(rs.getString(checkup.getFSkinScalp())));

                checkup.setLymphNodes(config1.StringNull(rs.getString(checkup.getFLymphNodes())));
                checkup.setEars(config1.StringNull(rs.getString(checkup.getFEars())));
                checkup.setEyes(config1.StringNull(rs.getString(checkup.getFEyes())));
                checkup.setNose(config1.StringNull(rs.getString(checkup.getFNose())));
                checkup.setPharynxTonsils(config1.StringNull(rs.getString(checkup.getFPharynxTonsils())));

                checkup.setThyroidGland(config1.StringNull(rs.getString(checkup.getFThyroidGland())));
                checkup.setLungs(config1.StringNull(rs.getString(checkup.getFLungs())));
                checkup.setHeart(config1.StringNull(rs.getString(checkup.getFHeart())));
                checkup.setAdditionComments(config1.StringNull(rs.getString(checkup.getFAdditionComments())));
                checkup.setAbdomen(config1.StringNull(rs.getString(checkup.getFAbdomen())));

                checkup.setLiver(config1.StringNull(rs.getString(checkup.getFLiver())));
                checkup.setSpleen(config1.StringNull(rs.getString(checkup.getFSpleen())));
                checkup.setExtenalGenitalia(config1.StringNull(rs.getString(checkup.getFExtenalGenitalia())));
                checkup.setRectalExam(config1.StringNull(rs.getString(checkup.getFRectalExam())));
                checkup.setVertebrae(config1.StringNull(rs.getString(checkup.getFVertebrae())));

                checkup.setLocomotor(config1.StringNull(rs.getString(checkup.getFLocomotor())));
                checkup.setReflexes(config1.StringNull(rs.getString(checkup.getFReflexes())));
                checkup.setMentalHealthStatus(config1.StringNull(rs.getString(checkup.getFMentalHealthStatus())));
                checkup.setOther(config1.StringNull(rs.getString(checkup.getFOther())));
                checkup.setHemoglobin(config1.StringNull(rs.getString(checkup.getFHemoglobin())));

                checkup.setDifferentiaPmn(config1.StringNull(rs.getString(checkup.getFDifferentiaPmn())));
                checkup.setDifferentiaBaso(config1.StringNull(rs.getString(checkup.getFDifferentiaBaso())));
                checkup.setWhiteBloodCell(config1.StringNull(rs.getString(checkup.getFWhiteBloodCell())));
                checkup.setDifferentialLymp(config1.StringNull(rs.getString(checkup.getFDifferentialLymp())));
                checkup.setDifferentialBlast(config1.StringNull(rs.getString(checkup.getFDifferentialBlast())));

                checkup.setDifferentialBand(config1.StringNull(rs.getString(checkup.getFDifferentialBand())));
                checkup.setDifferentialMono(config1.StringNull(rs.getString(checkup.getFDifferentialMono())));
                checkup.setDifferentialEos(config1.StringNull(rs.getString(checkup.getFDifferentialEos())));
                checkup.setHivGpa(config1.StringNull(rs.getString(checkup.getFHivGpa())));
                checkup.setHivElisa(config1.StringNull(rs.getString(checkup.getFHivElisa())));

                checkup.setHivWesternBlot(config1.StringNull(rs.getString(checkup.getFHivWesternBlot())));
                checkup.setHepatitis(config1.StringNull(rs.getString(checkup.getFHepatitis())));
                checkup.setHepatitisVdrl(config1.StringNull(rs.getString(checkup.getFHepatitisVdrl())));
                checkup.setHepatitisRpr(config1.StringNull(rs.getString(checkup.getFHepatitisRpr())));
                checkup.setHepatitisTpha(config1.StringNull(rs.getString(checkup.getFHepatitisTpha())));

                checkup.setBloodFilm(config1.StringNull(rs.getString(checkup.getFBloodFilm())));
                checkup.setBloodFilmComment(config1.StringNull(rs.getString(checkup.getFBloodFilmComment())));
                checkup.setUriColor(config1.StringNull(rs.getString(checkup.getFUriColor())));
                checkup.setUriPh(config1.StringNull(rs.getString(checkup.getFUriPh())));
                checkup.setUriSp(config1.StringNull(rs.getString(checkup.getFUriSp())));

                checkup.setUriSugar(config1.StringNull(rs.getString(checkup.getFUriSugar())));
                checkup.setUrine(config1.StringNull(rs.getString(checkup.getFUrine())));
                checkup.setAlbumin(config1.StringNull(rs.getString(checkup.getFAlbumin())));
                checkup.setBlood(config1.StringNull(rs.getString(checkup.getFBlood())));
                checkup.setKetone(config1.StringNull(rs.getString(checkup.getFKetone())));

                checkup.setBile(config1.StringNull(rs.getString(checkup.getFBile())));
                checkup.setMicroWbc(config1.StringNull(rs.getString(checkup.getFMicroWbc())));
                checkup.setRbc(config1.StringNull(rs.getString(checkup.getFRbc())));
                checkup.setCasts(config1.StringNull(rs.getString(checkup.getFCasts())));
                checkup.setEpithelalCell(config1.StringNull(rs.getString(checkup.getFEpithelalCell())));

                checkup.setEpithelalOther(config1.StringNull(rs.getString(checkup.getFEpithelalOther())));
                checkup.setStool(config1.StringNull(rs.getString(checkup.getFStool())));
                checkup.setChestXRay(config1.StringNull(rs.getString(checkup.getFChestXRay())));
                checkup.setOtherExaminations(config1.StringNull(rs.getString(checkup.getFOtherExaminations())));
                checkup.setAntiHcv(config1.StringNull(rs.getString(checkup.getFAntiHcv())));

                checkup.setConclusion(config1.StringNull(rs.getString(checkup.getFConclusion())));
                checkup.setDoctorId(config1.StringNull(rs.getString(checkup.getFDoctorId())));
                checkup.setDoctorFullnameE(config1.StringNull(rs.getString(checkup.getFDoctorFullnameE())));
                checkup.setDoctorFullnameT(config1.StringNull(rs.getString(checkup.getFDoctorFullnameT())));
                checkup.setBranchId(config1.StringNull(rs.getString(checkup.getFBranchId())));

                checkup.setFemaleLMP(config1.StringNull(rs.getString(checkup.getFFemaleLMP())));
                checkup.setMedicalExplain(config1.StringNull(rs.getString(checkup.getFMedicalExplain())));
                checkup.setOtoscopicExam(config1.StringNull(rs.getString(checkup.getFOtoscopicExam())));
                checkup.setOtherDescription(config1.StringNull(rs.getString(checkup.getFOtherDescrption())));
                checkup.setHiv(config1.StringNull(rs.getString(checkup.getFHiv())));

                checkup.setHepatitisType(config1.StringNull(rs.getString(checkup.getFHepatitisType())));
                checkup.setCheckupTime(config1.StringNull(rs.getString(checkup.getFCheckupTime())));
                checkup.setPatientBirthday(config1.StringNull(rs.getString(checkup.getFPateintBirthday())));
                checkup.setHemoptysis(config1.StringNull(rs.getString(checkup.getFHemoptysis())));
                checkup.setHematocrit(config1.StringNull(rs.getString(checkup.getFHematocrit())));

                v_checkup.add(checkup);

                }
            rs.close();
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return v_checkup;
    }
    public String setSaveCheckUp(DoctorTCheckup item, String flagpage) throws Exception {
        int chk=0;
        String sql="", max="", checkup_date="", patient_birthday="";
        DoctorTCheckup checkup = new DoctorTCheckup();
        Connection conn;
        Statement st;
        try {
            conn = config1.getConnectionBangna();
            st = conn.createStatement();
            checkup = getDoctorCheckUpByPK(item.getCheckupId());
            item.setConclusion(item.getConclusion().replace("'", "''"));
            item.setAdditionComments(item.getAdditionComments().replace("'", "''"));
            checkup_date=config1.DateFormatShow2DB(item.getCheckupDate(), "ddMMyyyy");
            patient_birthday=config1.DateFormatShow2DB(item.getPatientBirthday(), "ddMMyyyy");

            if(checkup.getCheckupId().equals("")){
                max = getMaxRowDoctorCheckUp(conn);
                sql="Insert Into "+checkup.getDoctorTCheckup()+"("
                        +checkup.getFCheckUpId()+", "+checkup.getFCheckUpDate()+", "
                        +checkup.getFFPatientPrefixId()+","+ checkup.getFPatientFirstnameT()+","
                        +checkup.getFPatientLastnameT()+","+ checkup.getFPatientHn()+","
                        +checkup.getFFSexId()+","+ checkup.getFPateintBirthday()+","
                        +checkup.getFFPateintPrefixNameE()+","+ checkup.getFPateintFirstnameE()+","
                        +checkup.getFPateintLastnameE()+","+ checkup.getFCheckUpActive()+","
                        +checkup.getFPatientAge()+","+ checkup.getFFPatientBlodGroupId()+","
                        +checkup.getFPassportNo()+","+checkup.getFPatientPId()+", "
                        +checkup.getFFPatientMarriageStatusId()+","+checkup.getFFPatientChangwat()+", "
                        +checkup.getFFPatientNationId()+","+checkup.getFAsthma()+", "
                        +checkup.getFHypertension()+","+checkup.getFHemoptysis()+", "
                        +checkup.getFHeartDiseases()+","+checkup.getFDiabetesMellitus()+", "
                        +checkup.getFJaundice()+","+checkup.getFEpilepsy()+", "
                        +checkup.getFVeneralDiseases()+","+checkup.getFAcquiredImmune()+", "
                        +checkup.getFEdema()+","+checkup.getFYaws()+", "
                        +checkup.getFOtorrhea()+","+checkup.getFHernia()+", "
                        +checkup.getFHemorrhoid()+","+checkup.getFAccident()+", "
                        +checkup.getFFractures()+","+checkup.getFSurgicalOperation()+", "
                        +checkup.getFMalaria()+","+checkup.getFHeight()+", "
                        +checkup.getFWidth()+","+checkup.getFBloodPressure()+", "
                        +checkup.getFPulse()+","+checkup.getFEyeLeft()+", "
                        +checkup.getFEyeRight()+","+checkup.getFGlasses()+", "
                        +checkup.getFColorBlindness()+","+checkup.getFGeneralAppearance()+", "
                        +checkup.getFSkinScalp()+","+checkup.getFLymphNodes()+", "
                        +checkup.getFEyes()+","+checkup.getFEars()+", "
                        +checkup.getFNose()+","+checkup.getFPharynxTonsils()+", "
                        +checkup.getFThyroidGland()+","+checkup.getFLungs()+", "
                        +checkup.getFHeart()+","+checkup.getFAdditionComments()+", "
                        +checkup.getFAbdomen()+","+checkup.getFLiver()+", "
                        +checkup.getFSpleen()+","+checkup.getFExtenalGenitalia()+", "
                        +checkup.getFRectalExam()+","+checkup.getFVertebrae()+", "
                        +checkup.getFLocomotor()+","+checkup.getFReflexes()+", "
                        +checkup.getFMentalHealthStatus()+","+checkup.getFOther()+", "
                        +checkup.getFHemoglobin()+","+checkup.getFDifferentiaPmn()+", "
                        +checkup.getFDifferentiaBaso()+","+checkup.getFWhiteBloodCell()+", "
                        +checkup.getFHematocrit()+","+checkup.getFDifferentialLymp()+", "
                        +checkup.getFDifferentialBand()+","+checkup.getFDifferentialBlast()+", "
                        +checkup.getFDifferentialMono()+","+checkup.getFDifferentialEos()+", "
                        +checkup.getFHivGpa()+","+checkup.getFHivElisa()+", "
                        +checkup.getFHivWesternBlot()+","+checkup.getFHepatitis()+", "
                        +checkup.getFHepatitisVdrl()+","+checkup.getFHepatitisRpr()+", "
                        +checkup.getFHepatitisTpha()+","+checkup.getFBloodFilm()+", "
                        +checkup.getFBloodFilmComment()+","+checkup.getFUriColor()+", "
                        +checkup.getFUriPh()+","+checkup.getFUriSp()+", "
                        +checkup.getFUriSugar()+","+checkup.getFAlbumin()+", "
                        +checkup.getFBlood()+","+checkup.getFKetone()+", "
                        +checkup.getFBile()+","+checkup.getFMicroWbc()+", "
                        +checkup.getFRbc()+","+checkup.getFCasts()+", "
                        +checkup.getFEpithelalCell()+","+checkup.getFEpithelalOther()+", "
                        +checkup.getFUrine()+","+checkup.getFStool()+", "
                        +checkup.getFChestXRay()+","+checkup.getFOtherExaminations()+", "
                        +checkup.getFAntiHcv()+","+checkup.getFConclusion()+", "
                        +checkup.getFDoctorId()+","+checkup.getFDoctorFullnameE()+", "
                        +checkup.getFDoctorFullnameT()+","+checkup.getFBranchId()+","
                        +checkup.getFFemaleLMP()+","+checkup.getFMedicalExplain()+", "
                        +checkup.getFOtoscopicExam()+","+checkup.getFOtherDescrption()+", "
                        +checkup.getFHiv()+","+checkup.getFHepatitisType()+","
                        +checkup.getFCheckupTime()+") "
                        +"Values('"+max+"','"+checkup_date + "','"
                        +item.getFPatientPrefixId()+"','"+item.getPatientFirstnamet() + "','"
                        +item.getPatientLastnamet()+"','"+item.getPatientHn() + "','"
                        +item.getFSexId()+"','"+patient_birthday + "','"
                        +item.getFPatientPrefixNamee()+"','"+item.getPatientFirstnamee() + "','"
                        +item.getPatientLastnamee()+"','"+item.getCheckupActive() + "','"
                        +item.getPatientAge()+"','"+item.getFPatientBloodGroupId() + "','"
                        +item.getPassportNo()+"','"+item.getPatientPid()+"','"
                        +item.getFPatientMarriageStatusId()+"','"+item.getPatientChangwat()+"','"
                        +item.getFPatientNationId()+"','"+item.getAsthma()+"','"
                        +item.getHypertension()+"','"+item.getHemoptysis()+"','"
                        +item.getHeartDiseases()+"','"+item.getDiabetesMellitus()+"','"
                        +item.getJaundice()+"','"+item.getEpilepsy()+"','"
                        +item.getVeneralDiseases()+"','"+item.getAcquiredImmune()+"','"
                        +item.getEdema()+"','"+item.getYaws()+"','"
                        +item.getOtorrhea()+"','"+item.getHernia()+"','"
                        +item.getHemorrhoid()+"','"+item.getAccident()+"','"
                        +item.getFractures()+"','"+item.getSurgicalOperation()+"','"
                        +item.getMalaria()+"','"+item.getHeight()+"','"
                        +item.getWidth()+"','"+item.getBloodPressure()+"','"
                        +item.getPulse()+"','"+item.getEyeLeft()+"','"
                        +item.getEyeRight()+"','"+item.getGlasses()+"','"
                        +item.getColorBlindness()+"','"+item.getGeneralAppearance()+"','"
                        +item.getSkinScalp()+"','"+item.getLymphNodes()+"','"
                        +item.getEyes()+"','"+item.getEars()+"','"
                        +item.getNose()+"','"+item.getPharynxTonsils()+"','"
                        +item.getThyroidGland()+"','"+item.getLungs()+"','"
                        +item.getHeart()+"','"+item.getAdditionComments()+"','"
                        +item.getAbdomen()+"','"+item.getLiver()+"','"
                        +item.getSpleen()+"','"+item.getExtenalGenitalia()+"','"
                        +item.getRectalExam()+"','"+item.getVertebrae()+"','"
                        +item.getLocomotor()+"','"+item.getReflexes()+"','"
                        +item.getMentalHealthStatus()+"','"+item.getOther()+"','"
                        +item.getHemoglobin()+"','"+item.getDifferentiaPmn()+"','"
                        +item.getDifferentiaBaso()+"','"+item.getWhiteBloodCell()+"','"
                        +item.getHematocrit()+"','"+item.getDifferentialLymp()+"','"
                        +item.getDifferentialBand()+"','"+item.getDifferentialBlast()+"','"
                        +item.getDifferentialMono()+"','"+item.getDifferentialEos()+"','"
                        +item.getHivGpa()+"','"+item.getHivElisa()+"','"
                        +item.getHivWesternBlot()+"','"+item.getHepatitis()+"','"
                        +item.getHepatitisVdrl()+"','"+item.getHepatitisRpr()+"','"
                        +item.getHepatitisTpha()+"','"+item.getBloodFilm()+"','"
                        +item.getBloodFilmComment()+"','"+item.getUriColor()+"','"
                        +item.getUriPh()+"','"+item.getUriSp()+"','"
                        +item.getUriSugar()+"','"+item.getAlbumin()+"','"
                        +item.getBlood()+"','"+item.getKetone()+"','"
                        +item.getBile()+"','"+item.getMicroWbc()+"','"
                        +item.getRbc()+"','"+item.getCasts()+"','"
                        +item.getEpithelalCell()+"','"+item.getEpithelalOther()+"','"
                        +item.getUrine()+"','"+item.getStool()+"','"
                        +item.getChestXRay()+"','"+item.getOtherExaminations()+"','"
                        +item.getAntiHcv()+"','"+item.getConclusion()+"','"
                        +item.getDoctorId()+"','"+item.getDoctorFullnameE()+"','"
                        +item.getDoctorFullnameT()+"','"+item.getBranchId()+"','"
                        +item.getFemaleLMP()+"','"+item.getMedicalExplain()+"','"
                        +item.getOtoscopicExam()+"','"+item.getOtherDescription()+"','"
                        +item.getHiv()+"','"+item.getHepatitisType()+"',current_time)";
            }
            else{
                max = item.getCheckupId();
//                wound_care_date=config1.DateFormatShow2DB(itemdetail.getMaDate(), "ddMMyyyy");
                sql = "Update "+checkup.getDoctorTCheckup()+" set "
                +checkup.getFCheckUpDate()+" = '"+checkup_date+"', "
                +checkup.getFFPatientPrefixId()+" = '"+item.getFPatientPrefixId()+"', "
                +checkup.getFPatientFirstnameT()+" = '"+item.getPatientFirstnamet()+"', "
                +checkup.getFPatientLastnameT()+" = '"+item.getPatientLastnamet()+"', "
                +checkup.getFPatientHn()+" = '"+item.getPatientHn()+"', "
                +checkup.getFFSexId()+" = '"+item.getFSexId()+"', "
                +checkup.getFPateintBirthday()+" = '"+patient_birthday+"', "
                +checkup.getFFPateintPrefixNameE()+" = '"+item.getFPatientPrefixNamee()+"', "
                +checkup.getFPateintFirstnameE()+" = '"+item.getPatientFirstnamee()+"', "
                +checkup.getFPateintLastnameE()+" = '"+item.getPatientLastnamee()+"', "
                +checkup.getFCheckUpActive()+" = '"+item.getCheckupActive()+"', "
                +checkup.getFPatientAge()+" = '"+item.getPatientAge()+"', "
                +checkup.getFFPatientBlodGroupId()+" = '"+item.getFPatientBloodGroupId()+"', "
                +checkup.getFPatientPId()+" = '"+item.getPatientPid()+"', "
                +checkup.getFPassportNo()+" = '"+item.getPassportNo()+"', "
                +checkup.getFFPatientMarriageStatusId()+" = '"+item.getFPatientMarriageStatusId()+"', "
                +checkup.getFFPatientChangwat()+" = '"+item.getPatientChangwat()+"', "
                +checkup.getFFPatientNationId()+" = '"+item.getFPatientNationId()+"', "
                +checkup.getFAsthma()+" = '"+item.getAsthma()+"', "
                +checkup.getFHypertension()+" = '"+item.getHypertension()+"', "
                +checkup.getFHemoptysis()+" = '"+item.getHemoptysis()+"', "
                +checkup.getFHeartDiseases()+" = '"+item.getHeartDiseases()+"', "
                +checkup.getFDiabetesMellitus()+" = '"+item.getDiabetesMellitus()+"', "
                +checkup.getFJaundice()+" = '"+item.getJaundice()+"', "
                +checkup.getFEpilepsy()+" = '"+item.getEpilepsy()+"', "
                +checkup.getFVeneralDiseases()+" = '"+item.getVeneralDiseases()+"', "
                +checkup.getFAcquiredImmune()+" = '"+item.getAcquiredImmune()+"', "
                +checkup.getFEdema()+" = '"+item.getEdema()+"', "
                +checkup.getFYaws()+" = '"+item.getYaws()+"', "
                +checkup.getFOtorrhea()+" = '"+item.getOtorrhea()+"', "
                +checkup.getFHernia()+" = '"+item.getHernia()+"', "
                +checkup.getFHemorrhoid()+" = '"+item.getHemorrhoid()+"', "
                +checkup.getFAccident()+" = '"+item.getAccident()+"', "
                +checkup.getFFractures()+" = '"+item.getFractures()+"', "
                +checkup.getFSurgicalOperation()+" = '"+item.getSurgicalOperation()+"', "
                +checkup.getFMalaria()+" = '"+item.getMalaria()+"', "
                +checkup.getFHeight()+" = '"+item.getHeight()+"', "
                +checkup.getFWidth()+" = '"+item.getWidth()+"', "
                +checkup.getFBloodPressure()+" = '"+item.getBloodPressure()+"', "
                +checkup.getFPulse()+" = '"+item.getPulse()+"', "
                +checkup.getFEyeRight()+" = '"+item.getEyeRight()+"', "
                +checkup.getFEyeLeft()+" = '"+item.getEyeLeft()+"', "
                +checkup.getFGlasses()+" = '"+item.getGlasses()+"', "
                +checkup.getFColorBlindness()+" = '"+item.getColorBlindness()+"', "
                +checkup.getFGeneralAppearance()+" = '"+item.getGeneralAppearance()+"', "
                +checkup.getFSkinScalp()+" = '"+item.getSkinScalp()+"', "
                +checkup.getFLymphNodes()+" = '"+item.getLymphNodes()+"', "
                +checkup.getFEyes()+" = '"+item.getEyes()+"', "
                +checkup.getFEars()+" = '"+item.getEars()+"', "
                +checkup.getFNose()+" = '"+item.getNose()+"', "
                +checkup.getFPharynxTonsils()+" = '"+item.getPharynxTonsils()+"', "
                +checkup.getFThyroidGland()+" = '"+item.getThyroidGland()+"', "
                +checkup.getFLungs()+" = '"+item.getLungs()+"', "
                +checkup.getFHeart()+" = '"+item.getHeart()+"', "
                +checkup.getFAdditionComments()+" = '"+item.getAdditionComments()+"', "
                +checkup.getFAbdomen()+" = '"+item.getAbdomen()+"', "
                +checkup.getFLiver()+" = '"+item.getLiver()+"', "
                +checkup.getFSpleen()+" = '"+item.getSpleen()+"', "
                +checkup.getFExtenalGenitalia()+" = '"+item.getExtenalGenitalia()+"', "
                +checkup.getFRectalExam()+" = '"+item.getRectalExam()+"', "
                +checkup.getFLocomotor()+" = '"+item.getLocomotor()+"', "
                +checkup.getFReflexes()+" = '"+item.getReflexes()+"', "
                +checkup.getFMentalHealthStatus()+" = '"+item.getMentalHealthStatus()+"', "
                +checkup.getFOther()+" = '"+item.getOther()+"', "
                +checkup.getFHemoglobin()+" = '"+item.getHemoglobin()+"', "
                +checkup.getFDifferentiaPmn()+" = '"+item.getDifferentiaPmn()+"', "
                +checkup.getFDifferentiaBaso()+" = '"+item.getDifferentiaBaso()+"', "
                +checkup.getFWhiteBloodCell()+" = '"+item.getWhiteBloodCell()+"', "
                +checkup.getFHematocrit()+" = '"+item.getHematocrit()+"', "
                +checkup.getFDifferentialLymp()+" = '"+item.getDifferentialLymp()+"', "
                +checkup.getFDifferentialBand()+" = '"+item.getDifferentialBand()+"', "
                +checkup.getFDifferentialBlast()+" = '"+item.getDifferentialBlast()+"', "
                +checkup.getFDifferentialMono()+" = '"+item.getDifferentialMono()+"', "
                +checkup.getFDifferentialEos()+" = '"+item.getDifferentialEos()+"', "
                +checkup.getFHivGpa()+" = '"+item.getHivGpa()+"', "
                +checkup.getFHivElisa()+" = '"+item.getHivElisa()+"', "
                +checkup.getFHivWesternBlot()+" = '"+item.getHivWesternBlot()+"', "
                +checkup.getFHepatitis()+" = '"+item.getHepatitis()+"', "
                +checkup.getFHepatitisVdrl()+" = '"+item.getHepatitisVdrl()+"', "
                +checkup.getFHepatitisRpr()+" = '"+item.getHepatitisRpr()+"', "
                +checkup.getFHepatitisTpha()+" = '"+item.getHepatitisTpha()+"', "
                +checkup.getFBloodFilm()+" = '"+item.getBloodFilm()+"', "
                +checkup.getFVertebrae()+" = '"+item.getVertebrae()+"', "
                +checkup.getFUriColor()+" = '"+item.getUriColor()+"', "
                +checkup.getFUriSp()+" = '"+item.getUriSp()+"', "
                +checkup.getFUriPh()+" = '"+item.getUriPh()+"', "
                +checkup.getFUriSugar()+" = '"+item.getUriSugar()+"', "
                +checkup.getFAlbumin()+" = '"+item.getAlbumin()+"',"
                +checkup.getFBlood()+" = '"+item.getBlood()+"',"
                +checkup.getFKetone()+" = '"+item.getKetone()+"',"
                +checkup.getFBile()+" = '"+item.getBile()+"',"
                +checkup.getFMicroWbc()+" = '"+item.getMicroWbc()+"',"
                +checkup.getFRbc()+" = '"+item.getRbc()+"', "
                +checkup.getFCasts()+" = '"+item.getCasts()+"', "
                +checkup.getFEpithelalCell()+" = '"+item.getEpithelalCell()+"', "
                +checkup.getFEpithelalOther()+" = '"+item.getEpithelalOther()+"', "
                +checkup.getFUrine()+" = '"+item.getUrine()+"', "
                +checkup.getFStool()+" = '"+item.getStool()+"', "
                +checkup.getFChestXRay()+" = '"+item.getChestXRay()+"',"
                +checkup.getFOtherExaminations()+" = '"+item.getOtherExaminations()+"',"
                +checkup.getFAntiHcv()+" = '"+item.getAntiHcv()+"',"
                +checkup.getFConclusion()+" = '"+item.getConclusion()+"',"
                +checkup.getFDoctorId()+" = '"+item.getDoctorId()+"',"
                +checkup.getFDoctorFullnameT()+" = '"+item.getDoctorFullnameT()+"',"
                +checkup.getFDoctorFullnameE()+" = '"+item.getDoctorFullnameE()+"',"
                +checkup.getFBranchId()+" = '"+item.getBranchId()+"',"
                +checkup.getFFemaleLMP()+" = '"+item.getFemaleLMP()+"',"
                +checkup.getFMedicalExplain()+" = '"+item.getMedicalExplain()+"',"
                +checkup.getFOtoscopicExam()+" = '"+item.getOtoscopicExam()+"', "
                +checkup.getFOtherDescrption()+" = '"+item.getOtherDescription()+"',"
                +checkup.getFHiv()+" = '"+item.getHiv()+"',"
                +checkup.getFHepatitisType()+" = '"+item.getHepatitisType()+"',"
                +checkup.getFBloodFilmComment()+" = '"+item.getBloodFilmComment()+"', "
                +checkup.getFCheckupTime()+" = '"+item.getCheckupTime()+"' "
                +"Where "+checkup.getFCheckUpId()+" = '"+item.getCheckupId()+"'";
//                max = item.getBillLabId();
            }
            chk = st.executeUpdate(sql);
            conn.close();
        } catch (Exception ex) {
            Logger.getLogger(DentalTDailySummaryDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return max;
    }
    public Vector getCheckUpForm(String branch_id) throws Exception{
        String sql="", txt="", select="";
        Connection conn = config1.getConnectionBangna();
        Vector v_form = new Vector();
        DoctorBCheckupForm checkup_form = new DoctorBCheckupForm();
        Statement st;
        ResultSet rs;
        sql="Select "+checkup_form.getFChcekupFormId()+", "+checkup_form.getFChcekupFormNamet()
                +" From "+checkup_form.getBDoctorCheckupForm()+" "
                +"Where "+checkup_form.getFChcekupFormActive()+"='1'";
        st = conn.createStatement();
        rs = st.executeQuery(sql);
        while (rs.next()) {
            checkup_form = new DoctorBCheckupForm();
            checkup_form.setCheckupFormId(rs.getString(checkup_form.getFChcekupFormId()));
            checkup_form.setCheckupFormNamet(rs.getString(checkup_form.getFChcekupFormNamet()));
            v_form.add(checkup_form);
        }
        rs.close();
        conn.close();
        return v_form;
    }
    public String CboCheckUpForm(String branch_id, String selected) {
        String txt="",sql="";
        Vector v_checkup = new Vector();
        DoctorBCheckupForm checkup = new DoctorBCheckupForm();
        try {
            v_checkup = getCheckUpForm(branch_id);
            txt="<option value='' selected></option>";
            for(int i=0;i<=v_checkup.size()-1;i++) {
                checkup = (DoctorBCheckupForm) v_checkup.get(i);
                if(checkup.getCheckupFormId().equals(selected)){
                    txt += "<option value='"+checkup.getCheckupFormId()+"' selected>"+checkup.getCheckupFormNamet()+"</option>";
                    //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"' selected>"+b_department.getDepartmentNamet()+"</option>";
                }
                else{
                    txt += "<option value='"+checkup.getCheckupFormId()+"' >"+checkup.getCheckupFormNamet()+"</option>";
                    //ma_department_cbo += "<option value='"+b_department.getDepartmentId()+"'>"+b_department.getDepartmentNamet()+"</option>";
                }
                if(i==4){
                    sql="";
                }
            }
        }
        catch(Exception ex) {
            txt = ex.getMessage();
        }
        return txt;
    }
    public String getComboFormPage(String selected){
        String aa="", select="";
        for(Integer i=1;i<=3;i++){
            select="";
            if(selected.equals(i.toString())){
                select="selected";
            }
            aa += "<option value='"+i.toString()+"' "+select+">page "+i.toString()+"</option>";
        }
        return aa;
    }
    public DoctorTCheckup getPatientResultLAB(String branch_id, String patient_hn, String visit_date){
        checkup = new DoctorTCheckup();
        String sql="";
        Patient patient = new Patient();
        try {
            patient = config1.getPatientFullNamet(branch_id, patient_hn,"");
            checkup.setPatientHn(patient_hn);
            checkup.setPatientFirstnamet(patient.getPatientNamet());
            checkup.setPatientLastnamet(patient.getPatientLastNamet());
            checkup.setPatientBirthday(patient.getPatientBirthday());
            checkup.setFSexId(patient.getPatientSex());
            checkup.setPatientAge(patient.getPatientAge());
            checkup.setPatientChangwat(patient.getPatientChangwat());
            checkup.setFPatientNationId(patient.getPatientNationId());
            checkup.setCheckupDate(config1.DateFormatDB2Show(visit_date,"ddMMyyyy"));
            checkup.setFPatientPrefixId(patient.getPatientPrefix());
            checkup.setPatientPid(patient.getPatientId());
            Connection connmainhis = config1.getConnectionMainHIS(branch_id);
            Statement stmainhis;
            ResultSet rsmainhis;
            sql = "Select labt05.mnc_req_dat, labt05.mnc_lb_cd, labt05.mnc_lb_res_cd, labt05.mnc_res_value "
                    +"From lab_t01 labt01 left join lab_t05 labt05 "
                    +"ON labt01.MNC_REQ_YR = labt05.MNC_REQ_YR "
                    +"AND labt01.MNC_REQ_NO = labt05.MNC_REQ_NO AND labt01.MNC_REQ_DAT = labt05.MNC_REQ_DAT "
                    +"Where mnc_hn_no = '"+patient_hn+"' and labt05.mnc_req_dat = '"+visit_date + "'";
            stmainhis = connmainhis.createStatement();
            rsmainhis = stmainhis.executeQuery(sql);
            while (rsmainhis.next()){
//                checkup.setPatientHn(patient_hn);
                if(rsmainhis.getString("mnc_lb_cd").equals("HE007")) {
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Blood Group
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().equals("O")){
                            checkup.setFPatientBloodGroupId("5");
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().equals("B")){
                            checkup.setFPatientBloodGroupId("3");
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().equals("A")){
                            checkup.setFPatientBloodGroupId("2");
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().equals("AB")){
                            checkup.setFPatientBloodGroupId("4");
                        }
                        else if(rsmainhis.getString("mnc_res_value").indexOf("O")>=0){
                            checkup.setFPatientBloodGroupId("5");
                        }
                        else{
                            checkup.setFPatientBloodGroupId("1");
                        }
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("HE001")){//Hemoglobin
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("03")){//Hemoglobin  g/dl
                        checkup.setHemoglobin(rsmainhis.getString("mnc_res_value"));
                    }
                    else if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Hemoglobin  white blood cell
                        checkup.setWhiteBloodCell(rsmainhis.getString("mnc_res_value"));
                    }
                    else if(rsmainhis.getString("mnc_lb_res_cd").equals("05")){//Hemoglobin  hematocrit
                        checkup.setHematocrit(rsmainhis.getString("mnc_res_value"));
                    }
                    else if(rsmainhis.getString("mnc_lb_res_cd").equals("11")){//Hemoglobin  differential pmn
                        checkup.setDifferentiaPmn(rsmainhis.getString("mnc_res_value"));
                    }
                    else if(rsmainhis.getString("mnc_lb_res_cd").equals("12")){//Hemoglobin  differential lymp
                        checkup.setDifferentialLymp(rsmainhis.getString("mnc_res_value"));
                    }
                    else if(rsmainhis.getString("mnc_lb_res_cd").equals("13")){//Hemoglobin  differential mono
                        checkup.setDifferentialMono(rsmainhis.getString("mnc_res_value"));
                    }
                    else if(rsmainhis.getString("mnc_lb_res_cd").equals("14")){//Hemoglobin  differential eos
                        checkup.setDifferentialEos(rsmainhis.getString("mnc_res_value"));
                    }
                    else if(rsmainhis.getString("mnc_lb_res_cd").equals("15")){//Hemoglobin  differential baso
                        checkup.setDifferentiaBaso(rsmainhis.getString("mnc_res_value"));
                    }

                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("SE005")){//Serological for Anti-HIV
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Serological for Anti-HIV Indirect solid-phase enzyme
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("POS")>=0){
                            checkup.setHivGpa("1");
                            checkup.setHivElisa("1");
                            checkup.setHivWesternBlot("1");
                            checkup.setHiv("1");
                            
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("NEGATIVE")>=0){
                            checkup.setHivGpa("2");
                            checkup.setHiv("1");
                        }
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("SE038")){//Hepatitis B
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Hepatitis B
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("POS")>=0){
                            checkup.setHepatitis("1");
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("NEGATIVE")>=0){
                            checkup.setHepatitis("2");
                        }
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("SE001")){//Hepatitis B
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Hepatitis B VDRL Test
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("NON")>=0){// Negative
                            checkup.setHepatitisVdrl("2");
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("REACTIVE")>=0){//Positive
                            checkup.setHepatitisVdrl("1");
                        }
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("HE010")){//Blood film for Malaria
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Hepatitis B VDRL Test
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("NOT")>=0){// Negative
                            checkup.setBloodFilm("2");
                            checkup.setBloodFilmComment(rsmainhis.getString("mnc_res_value"));
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("POSITIVE")>=0){//Positive
                            checkup.setBloodFilm("1");
                            checkup.setBloodFilmComment(rsmainhis.getString("mnc_res_value"));
                        }
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("MS001")){//Urine Analysis
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Color
                        checkup.setUriColor(rsmainhis.getString("mnc_res_value"));
                    }
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("04")){//Sp.gr
                        checkup.setUriSp(rsmainhis.getString("mnc_res_value"));
                    }
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("05")){//pH
                        checkup.setUriPh(rsmainhis.getString("mnc_res_value"));
                    }
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("03")){//Sugar
                        checkup.setUriSugar(rsmainhis.getString("mnc_res_value"));
                    }
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("06")){//Albumin
                        checkup.setAlbumin(rsmainhis.getString("mnc_res_value"));
                    }
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("07")){//Micro WBC
                        checkup.setMicroWbc(rsmainhis.getString("mnc_res_value"));
                    }
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("08")){//RBC
                        checkup.setRbc(rsmainhis.getString("mnc_res_value"));
                    }
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("09")){//Epithelial Cell
                        checkup.setEpithelalCell(rsmainhis.getString("mnc_res_value"));
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("MS022")){//Urine Prenancy test female
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Urine Prenancy test female
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("POS")>=0){// Positive
                            checkup.setUrine("1");
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("NEGATIVE")>=0){// Negative
                            checkup.setUrine("2");
                        }
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("MS043")){//Stool Exam
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("05")){//Stool Exam
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("NOT")>=0){// Negative
                            checkup.setStool("2");
                        }
                        else {// Negative
                            checkup.setStool("1");
                        }
                    }
                }
                else if(rsmainhis.getString("mnc_lb_cd").equals("SE047")){//Anti-HCV
                    if(rsmainhis.getString("mnc_lb_res_cd").equals("01")){//Anti-HCV
                        if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("POS")>=0){// Positive
                            checkup.setAntiHcv("1");
                        }
                        else if(rsmainhis.getString("mnc_res_value").trim().toUpperCase().indexOf("NEGATIVE")>=0){// Negative
                            checkup.setAntiHcv("2");
                        }
                    }
                }
                
            }
            rsmainhis.close();
            connmainhis.close();
        } catch (Exception ex) {
            Logger.getLogger(DoctorTCheckupDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return checkup;
    }
}
