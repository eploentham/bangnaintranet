/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

/**
 *
 * @author pop
 */
public class PatientVisit extends Patient {
    private String visit_date ="", visit_doctor_id="",visit_doctor_namet="";
    private String visit_paid_id="", visit_paid_namet=""; //สิทธิในการชำระเงิน
    private Double paid=0.0, amount=0.0, discount=0.0;//เงินที่จ่ายในการรักษา จ่ายจริง, ยอดเงินรวม, ส่วนลด
    private String visit_vn="", visit_time="";
    private String visit_clinic_id="", visit_clinic_namet="";//clinic ที่รักษา ไม่ใช่แผนกที่มาหาหมอ
    private String claim_id="", claim_namet=""; //สิทธิในการรักษา
    public String getVisitDate(){
        return visit_date;
    }
    public void setVisitDate(String visit_date){
        this.visit_date = visit_date;
    }

    public String getVisitDoctorId(){
        return visit_doctor_id;
    }
    public void setVisitDoctorId(String visit_doctor_id){
        this.visit_doctor_id = visit_doctor_id;
    }
    public String getVisitDoctorNamet(){
        return visit_doctor_namet;
    }
    public void setVisitDoctorNamet(String visit_doctor_namet){
        this.visit_doctor_namet = visit_doctor_namet;
    }
    public String getVisitPaidId(){
        return visit_paid_id;
    }
    public void setVisitPaidId(String paid_id){
        this.visit_paid_id = paid_id;
    }
    public String getVisitPaidNamet(){
        return visit_paid_namet;
    }
    public void setVisitPaidNamet(String paid_namet){
        this.visit_paid_namet = paid_namet;
    }
    public String getVisitTime(){
        return visit_time;
    }
    public void setVisitTime(String visitTime){
        this.visit_time = visitTime;
    }
    public String getVisitVn(){
        return visit_vn;
    }
    public void setVisitVn(String visit_vn){
        this.visit_vn = visit_vn;
    }
    public String getVisitClinicId(){
        return visit_clinic_id;
    }
    public void setVisitClinicId(String visit_clinic_id){
        this.visit_clinic_id = visit_clinic_id;
    }
    public String getVisitClinicNamet(){
        return visit_clinic_namet;
    }
    public void setVisitClinicNamet(String visit_clinic_namet){
        this.visit_clinic_namet = visit_clinic_namet;
    }

}
