/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package bangnaintranet;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author root
 */
@Entity
@Table(name = "bhac_t_student", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "BhacTStudent.findAll", query = "SELECT b FROM BhacTStudent b"), @NamedQuery(name = "BhacTStudent.findByStudentId", query = "SELECT b FROM BhacTStudent b WHERE b.studentId = :studentId"), @NamedQuery(name = "BhacTStudent.findByStudentFirstNamet", query = "SELECT b FROM BhacTStudent b WHERE b.studentFirstNamet = :studentFirstNamet"), @NamedQuery(name = "BhacTStudent.findByStudentLastNamet", query = "SELECT b FROM BhacTStudent b WHERE b.studentLastNamet = :studentLastNamet"), @NamedQuery(name = "BhacTStudent.findByStudentAge", query = "SELECT b FROM BhacTStudent b WHERE b.studentAge = :studentAge"), @NamedQuery(name = "BhacTStudent.findByStudentWidth", query = "SELECT b FROM BhacTStudent b WHERE b.studentWidth = :studentWidth"), @NamedQuery(name = "BhacTStudent.findByStudentHeight", query = "SELECT b FROM BhacTStudent b WHERE b.studentHeight = :studentHeight"), @NamedQuery(name = "BhacTStudent.findByStudentNationality", query = "SELECT b FROM BhacTStudent b WHERE b.studentNationality = :studentNationality"), @NamedQuery(name = "BhacTStudent.findByStudentSex", query = "SELECT b FROM BhacTStudent b WHERE b.studentSex = :studentSex"), @NamedQuery(name = "BhacTStudent.findByStudentReligion", query = "SELECT b FROM BhacTStudent b WHERE b.studentReligion = :studentReligion"), @NamedQuery(name = "BhacTStudent.findByStudentBirthday", query = "SELECT b FROM BhacTStudent b WHERE b.studentBirthday = :studentBirthday"), @NamedQuery(name = "BhacTStudent.findByStudentPid", query = "SELECT b FROM BhacTStudent b WHERE b.studentPid = :studentPid"), @NamedQuery(name = "BhacTStudent.findByStudentPidIssued", query = "SELECT b FROM BhacTStudent b WHERE b.studentPidIssued = :studentPidIssued"), @NamedQuery(name = "BhacTStudent.findByStudentPidExpire", query = "SELECT b FROM BhacTStudent b WHERE b.studentPidExpire = :studentPidExpire"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentHouse", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentHouse = :studentCurrentHouse"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentMoo", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentMoo = :studentCurrentMoo"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentApartment", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentApartment = :studentCurrentApartment"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentApartmentRoom", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentApartmentRoom = :studentCurrentApartmentRoom"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentRoad", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentRoad = :studentCurrentRoad"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentSoi", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentSoi = :studentCurrentSoi"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentTambon", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentTambon = :studentCurrentTambon"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentAmphur", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentAmphur = :studentCurrentAmphur"), @NamedQuery(name = "BhacTStudent.findByStudentCurrentChangwat", query = "SELECT b FROM BhacTStudent b WHERE b.studentCurrentChangwat = :studentCurrentChangwat"), @NamedQuery(name = "BhacTStudent.findByStudentTelephone", query = "SELECT b FROM BhacTStudent b WHERE b.studentTelephone = :studentTelephone"), @NamedQuery(name = "BhacTStudent.findByStudentEmail", query = "SELECT b FROM BhacTStudent b WHERE b.studentEmail = :studentEmail"), @NamedQuery(name = "BhacTStudent.findByStudentDate", query = "SELECT b FROM BhacTStudent b WHERE b.studentDate = :studentDate"), @NamedQuery(name = "BhacTStudent.findByStudentSecondarySchoolNamet", query = "SELECT b FROM BhacTStudent b WHERE b.studentSecondarySchoolNamet = :studentSecondarySchoolNamet"), @NamedQuery(name = "BhacTStudent.findByStudentSecondarySchoolFaculty", query = "SELECT b FROM BhacTStudent b WHERE b.studentSecondarySchoolFaculty = :studentSecondarySchoolFaculty"), @NamedQuery(name = "BhacTStudent.findByStudentSecondarySchoolYear", query = "SELECT b FROM BhacTStudent b WHERE b.studentSecondarySchoolYear = :studentSecondarySchoolYear"), @NamedQuery(name = "BhacTStudent.findByStudentSecondarySchoolPoint", query = "SELECT b FROM BhacTStudent b WHERE b.studentSecondarySchoolPoint = :studentSecondarySchoolPoint"), @NamedQuery(name = "BhacTStudent.findByStudentHighSchoolNamet", query = "SELECT b FROM BhacTStudent b WHERE b.studentHighSchoolNamet = :studentHighSchoolNamet"), @NamedQuery(name = "BhacTStudent.findByStudentHighSchoolFaculty", query = "SELECT b FROM BhacTStudent b WHERE b.studentHighSchoolFaculty = :studentHighSchoolFaculty"), @NamedQuery(name = "BhacTStudent.findByStudentHighSchoolYear", query = "SELECT b FROM BhacTStudent b WHERE b.studentHighSchoolYear = :studentHighSchoolYear"), @NamedQuery(name = "BhacTStudent.findByStudentHighSchoolPoint", query = "SELECT b FROM BhacTStudent b WHERE b.studentHighSchoolPoint = :studentHighSchoolPoint"), @NamedQuery(name = "BhacTStudent.findByStudentBachelorSchoolNamet", query = "SELECT b FROM BhacTStudent b WHERE b.studentBachelorSchoolNamet = :studentBachelorSchoolNamet"), @NamedQuery(name = "BhacTStudent.findByStudentBachelorSchoolFaculty", query = "SELECT b FROM BhacTStudent b WHERE b.studentBachelorSchoolFaculty = :studentBachelorSchoolFaculty"), @NamedQuery(name = "BhacTStudent.findByStudentBachelorSchoolYear", query = "SELECT b FROM BhacTStudent b WHERE b.studentBachelorSchoolYear = :studentBachelorSchoolYear"), @NamedQuery(name = "BhacTStudent.findByStudentBachelorSchoolPoint", query = "SELECT b FROM BhacTStudent b WHERE b.studentBachelorSchoolPoint = :studentBachelorSchoolPoint"), @NamedQuery(name = "BhacTStudent.findByStudentOther1School", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther1School = :studentOther1School"), @NamedQuery(name = "BhacTStudent.findByStudentOther1SchoolNamet", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther1SchoolNamet = :studentOther1SchoolNamet"), @NamedQuery(name = "BhacTStudent.findByStudentOther1SchoolFaculty", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther1SchoolFaculty = :studentOther1SchoolFaculty"), @NamedQuery(name = "BhacTStudent.findByStudentOther1SchoolYear", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther1SchoolYear = :studentOther1SchoolYear"), @NamedQuery(name = "BhacTStudent.findByStudentOther1SchoolPoint", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther1SchoolPoint = :studentOther1SchoolPoint"), @NamedQuery(name = "BhacTStudent.findByStudentOther2School", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther2School = :studentOther2School"), @NamedQuery(name = "BhacTStudent.findByStudentOther2SchoolNamet", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther2SchoolNamet = :studentOther2SchoolNamet"), @NamedQuery(name = "BhacTStudent.findByStudentOther2SchoolFaculty", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther2SchoolFaculty = :studentOther2SchoolFaculty"), @NamedQuery(name = "BhacTStudent.findByStudentOther2SchoolYear", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther2SchoolYear = :studentOther2SchoolYear"), @NamedQuery(name = "BhacTStudent.findByStudentOther2SchoolPoint", query = "SELECT b FROM BhacTStudent b WHERE b.studentOther2SchoolPoint = :studentOther2SchoolPoint"), @NamedQuery(name = "BhacTStudent.findByStudentDocumentStatusDegree", query = "SELECT b FROM BhacTStudent b WHERE b.studentDocumentStatusDegree = :studentDocumentStatusDegree"), @NamedQuery(name = "BhacTStudent.findByStudentDocumentStatusPid", query = "SELECT b FROM BhacTStudent b WHERE b.studentDocumentStatusPid = :studentDocumentStatusPid"), @NamedQuery(name = "BhacTStudent.findByStudentDocumentStatusUserHome", query = "SELECT b FROM BhacTStudent b WHERE b.studentDocumentStatusUserHome = :studentDocumentStatusUserHome"), @NamedQuery(name = "BhacTStudent.findByStudentDocumentStatusPicture", query = "SELECT b FROM BhacTStudent b WHERE b.studentDocumentStatusPicture = :studentDocumentStatusPicture"), @NamedQuery(name = "BhacTStudent.findByStudentDocumentStatusOther1", query = "SELECT b FROM BhacTStudent b WHERE b.studentDocumentStatusOther1 = :studentDocumentStatusOther1"), @NamedQuery(name = "BhacTStudent.findByStudentDocumentStatusOther2", query = "SELECT b FROM BhacTStudent b WHERE b.studentDocumentStatusOther2 = :studentDocumentStatusOther2"), @NamedQuery(name = "BhacTStudent.findByStudentDressHeight", query = "SELECT b FROM BhacTStudent b WHERE b.studentDressHeight = :studentDressHeight"), @NamedQuery(name = "BhacTStudent.findByStudentDressHip", query = "SELECT b FROM BhacTStudent b WHERE b.studentDressHip = :studentDressHip"), @NamedQuery(name = "BhacTStudent.findByStudentDressChest", query = "SELECT b FROM BhacTStudent b WHERE b.studentDressChest = :studentDressChest"), @NamedQuery(name = "BhacTStudent.findByStudentDressShoulder", query = "SELECT b FROM BhacTStudent b WHERE b.studentDressShoulder = :studentDressShoulder"), @NamedQuery(name = "BhacTStudent.findByStudentDressOther", query = "SELECT b FROM BhacTStudent b WHERE b.studentDressOther = :studentDressOther")})
public class BhacTStudent implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "student_id", nullable = false, length = 255)
    private String studentId="";
    @Column(name = "student_first_namet", length = 255)
    private String studentFirstNamet="";
    @Column(name = "student_last_namet", length = 255)
    private String studentLastNamet="";
    @Column(name = "student_age", length = 255)
    private String studentAge="";
    @Column(name = "student_width", length = 255)
    private String studentWidth="";
    @Column(name = "student_height", length = 255)
    private String studentHeight="";
    @Column(name = "student_nationality", length = 255)
    private String studentNationality="";
    @Column(name = "student_sex", length = 255)
    private String studentSex="";
    @Column(name = "student_religion", length = 255)
    private String studentReligion="";
    @Column(name = "student_birthday", length = 255)
    private String studentBirthday="";
    @Column(name = "student_pid", length = 255)
    private String studentPid="";
    @Column(name = "student_pid_issued", length = 255)
    private String studentPidIssued="";
    @Column(name = "student_pid_expire", length = 255)
    private String studentPidExpire="";
    @Column(name = "student_current_house", length = 255)
    private String studentCurrentHouse="";
    @Column(name = "student_current_moo", length = 255)
    private String studentCurrentMoo="";
    @Column(name = "student_current_apartment", length = 255)
    private String studentCurrentApartment="";
    @Column(name = "student_current_apartment_room", length = 255)
    private String studentCurrentApartmentRoom="";
    @Column(name = "student_current_road", length = 255)
    private String studentCurrentRoad="";
    @Column(name = "student_current_soi", length = 255)
    private String studentCurrentSoi="";
    @Column(name = "student_current_tambon", length = 255)
    private String studentCurrentTambon="";
    @Column(name = "student_current_amphur", length = 255)
    private String studentCurrentAmphur="";
    @Column(name = "student_current_changwat", length = 255)
    private String studentCurrentChangwat="";
    @Column(name = "student_telephone", length = 255)
    private String studentTelephone="";
    @Column(name = "student_email", length = 255)
    private String studentEmail="";
    @Column(name = "student_date", length = 255)
    private String studentDate="";
    @Column(name = "student_secondary_school_namet", length = 255)
    private String studentSecondarySchoolNamet="";
    @Column(name = "student_secondary_school_faculty", length = 255)
    private String studentSecondarySchoolFaculty="";
    @Column(name = "student_secondary_school_year", length = 255)
    private String studentSecondarySchoolYear="";
    @Column(name = "student_secondary_school_point", length = 255)
    private String studentSecondarySchoolPoint="";
    @Column(name = "student_high_school_namet", length = 255)
    private String studentHighSchoolNamet="";
    @Column(name = "student_high_school_faculty", length = 255)
    private String studentHighSchoolFaculty="";
    @Column(name = "student_high_school_year", length = 255)
    private String studentHighSchoolYear="";
    @Column(name = "student_high_school_point", length = 255)
    private String studentHighSchoolPoint="";
    @Column(name = "student_bachelor_school_namet", length = 255)
    private String studentBachelorSchoolNamet="";
    @Column(name = "student_bachelor_school_faculty", length = 255)
    private String studentBachelorSchoolFaculty="";
    @Column(name = "student_bachelor_school_year", length = 255)
    private String studentBachelorSchoolYear="";
    @Column(name = "student_bachelor_school_point", length = 255)
    private String studentBachelorSchoolPoint="";
    @Column(name = "student_other1_school", length = 255)
    private String studentOther1School="";
    @Column(name = "student_other1_school_namet", length = 255)
    private String studentOther1SchoolNamet="";
    @Column(name = "student_other1_school_faculty", length = 255)
    private String studentOther1SchoolFaculty="";
    @Column(name = "student_other1_school_year", length = 255)
    private String studentOther1SchoolYear="";
    @Column(name = "student_other1_school_point", length = 255)
    private String studentOther1SchoolPoint="";
    @Column(name = "student_other2_school", length = 255)
    private String studentOther2School="";
    @Column(name = "student_other2_school_namet", length = 255)
    private String studentOther2SchoolNamet="";
    @Column(name = "student_other2_school_faculty", length = 255)
    private String studentOther2SchoolFaculty="";
    @Column(name = "student_other2_school_year", length = 255)
    private String studentOther2SchoolYear="";
    @Column(name = "student_other2_school_point", length = 255)
    private String studentOther2SchoolPoint="";
    @Column(name = "student_document_status_degree", length = 255)
    private String studentDocumentStatusDegree="";
    @Column(name = "student_document_status_pid", length = 255)
    private String studentDocumentStatusPid="";
    @Column(name = "student_document_status_user_home", length = 255)
    private String studentDocumentStatusUserHome="";
    @Column(name = "student_document_status_picture", length = 255)
    private String studentDocumentStatusPicture="";
    @Column(name = "student_document_status_other1", length = 255)
    private String studentDocumentStatusOther1="";
    @Column(name = "student_document_status_other2", length = 255)
    private String studentDocumentStatusOther2="";
    @Column(name = "student_dress_height", length = 255)
    private String studentDressHeight="";
    @Column(name = "student_dress_hip", length = 255)
    private String studentDressHip="";
    @Column(name = "student_dress_chest", length = 255)
    private String studentDressChest="";
    @Column(name = "student_dress_shoulder", length = 255)
    private String studentDressShoulder="";
    @Column(name = "student_dress_other", length = 255)
    private String studentDressOther="";
    @Column(name = "student_active", length = 255)
    private String studentActive="";
    @Column(name = "student_date_apply", length = 255)
    private String studentDateApply="";
    @Column(name = "student_school_year", length = 255)
    private String studentSchoolYear="";
    @Column(name = "student_model_studies", length = 255)
    private String studentModelStudies="";
    @Column(name = "student_code", length = 255)
    private String studentCode="";

    public BhacTStudent() {
    }
    public String getBhacTStudent() {
        return "bhac_t_student";
    }
    public String getFStudentId() {
        return "student_id";
    }
    public String getFStudentFirstNamet() {
        return "student_first_namet";
    }
    public String getFStudentLastNamet() {
        return "student_last_namet";
    }
    public String getFStudentAge() {
        return "student_age";
    }
    public String getFStudentWidth() {
        return "student_width";
    }
    public String getFStudentHeight() {
        return "student_height";
    }
    public String getFStudentNationality() {
        return "student_nationality";
    }
    public String getFStudentSex() {
        return "student_sex";
    }
    public String getFStudentReligion() {
        return "student_religion";
    }
    public String getFStudentBirthday() {
        return "student_birthday";
    }
    public String getFStudentPid() {
        return "student_pid";
    }
    public String getFStudentPidIssued() {
        return "student_pid_issued";
    }
    public String getFStudentPidExpire() {
        return "student_pid_expire";
    }
    public String getFStudentCurrentHouse() {
        return "student_current_house";
    }
    public String getFStudentCurrentMoo() {
        return "student_current_moo";
    }
    public String getFStudentCurrentApartment() {
        return "student_current_apartment";
    }
    public String getFStudentCurrentApartmentRoom() {
        return "student_current_apartment_room";
    }
    public String getFStudentCurrentRoad() {
        return "student_current_road";
    }
    public String getFStudentCurrentSoi() {
        return "student_current_soi";
    }
    public String getFStudentCurrentTambon() {
        return "student_current_tambon";
    }
    public String getFStudentCurrentAmphur() {
        return "student_current_amphur";
    }
    public String getFStudentCurrentChangwat() {
        return "student_current_changwat";
    }
    public String getFStudentTelephone() {
        return "student_telephone";
    }
    public String getFStudentEmail() {
        return "student_email";
    }
    public String getFStudentDate() {
        return "student_date";
    }
    public String getFStudentSecondarySchoolNamet() {
        return "student_secondary_school_namet";
    }
    public String getFStudentSecondarySchoolFaculty() {
        return "student_secondary_school_faculty";
    }
    public String getFStudentSecondarySchoolYear() {
        return "student_secondary_school_year";
    }
    public String getFStudentSecondarySchoolPoint() {
        return "student_secondary_school_point";
    }
    public String getFStudentHighSchoolNamet() {
        return "student_high_school_namet";
    }
    public String getFStudentHighSchoolFaculty() {
        return "student_high_school_faculty";
    }
    public String getFStudentHighSchoolYear() {
        return "student_high_school_year";
    }
    public String getFStudentHighSchoolPoint() {
        return "student_high_school_point";
    }
    public String getFStudentBachelorSchoolNamet() {
        return "student_bachelor_school_namet";
    }
    public String getFStudentBachelorSchoolFaculty() {
        return "student_bachelor_school_faculty";
    }
    public String getFStudentBachelorSchoolYear() {
        return "student_bachelor_school_year";
    }
    public String getFStudentBachelorSchoolPoint() {
        return "student_bachelor_school_point";
    }
    public String getFStudentOther1School() {
        return "student_other1_school";
    }
    public String getFStudentOther1SchoolNamet() {
        return "student_other1_school_namet";
    }
    public String getFStudentOther1SchoolFaculty() {
        return "student_other1_school_faculty";
    }
    public String getFStudentOther1SchoolYear() {
        return "student_other1_school_year";
    }
    public String getFStudentOther1SchoolPoint() {
        return "student_other1_school_point";
    }
    public String getFStudentOther2School() {
        return "student_other2_school";
    }
    public String getFStudentOther2SchoolNamet() {
        return "student_other2_school_namet";
    }
    public String getFStudentOther2SchoolFaculty() {
        return "student_other2_school_faculty";
    }
    public String getFStudentOther2SchoolYear() {
        return "student_other2_school_year";
    }
    public String getFStudentOther2SchoolPoint() {
        return "student_other2_school_point";
    }
    public String getFStudentDocumentStatusDegree() {
        return "student_document_status_degree";
    }
    public String getFStudentDocumentStatusPid() {
        return "student_document_status_pid";
    }
    public String getFStudentDocumentStatusUserHome() {
        return "student_document_status_user_home";
    }
    public String getFStudentDocumentStatusPicture() {
        return "student_document_status_picture";
    }
    public String getFStudentDocumentStatusOther1() {
        return "student_document_status_other1";
    }
    public String getFStudentDocumentStatusOther2() {
        return "student_document_status_other2";
    }
    public String getFStudentDressHeight() {
        return "student_dress_height";
    }
    public String getFStudentDressHip() {
        return "student_dress_hip";
    }
    public String getFStudentDressChest() {
        return "student_dress_chest";
    }
    public String getFStudentDressShoulder() {
        return "student_dress_shoulder";
    }
    public String getFStudentDressOther() {
        return "student_dress_other";
    }
    public String getFStudentActive() {
        return "student_active";
    }
    public String getFStudentDateApply() {
        return "student_date_apply";
    }
    public String getFStudentSchoolYear() {
        return "student_school_year";
    }
    public String getFStudentModelStudies() {
        return "student_model_studies";
    }
    public String getFStudentCode() {
        return "student_code";
    }


    public BhacTStudent(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentFirstNamet() {
        return studentFirstNamet;
    }

    public void setStudentFirstNamet(String studentFirstNamet) {
        this.studentFirstNamet = studentFirstNamet;
    }

    public String getStudentLastNamet() {
        return studentLastNamet;
    }

    public void setStudentLastNamet(String studentLastNamet) {
        this.studentLastNamet = studentLastNamet;
    }

    public String getStudentAge() {
        return studentAge;
    }

    public void setStudentAge(String studentAge) {
        this.studentAge = studentAge;
    }

    public String getStudentWidth() {
        return studentWidth;
    }

    public void setStudentWidth(String studentWidth) {
        this.studentWidth = studentWidth;
    }

    public String getStudentHeight() {
        return studentHeight;
    }

    public void setStudentHeight(String studentHeight) {
        this.studentHeight = studentHeight;
    }

    public String getStudentNationality() {
        return studentNationality;
    }

    public void setStudentNationality(String studentNationality) {
        this.studentNationality = studentNationality;
    }

    public String getStudentSex() {
        return studentSex;
    }

    public void setStudentSex(String studentSex) {
        this.studentSex = studentSex;
    }

    public String getStudentReligion() {
        return studentReligion;
    }

    public void setStudentReligion(String studentReligion) {
        this.studentReligion = studentReligion;
    }

    public String getStudentBirthday() {
        return studentBirthday;
    }

    public void setStudentBirthday(String studentBirthday) {
        this.studentBirthday = studentBirthday;
    }

    public String getStudentPid() {
        return studentPid;
    }

    public void setStudentPid(String studentPid) {
        this.studentPid = studentPid;
    }

    public String getStudentPidIssued() {
        return studentPidIssued;
    }

    public void setStudentPidIssued(String studentPidIssued) {
        this.studentPidIssued = studentPidIssued;
    }

    public String getStudentPidExpire() {
        return studentPidExpire;
    }

    public void setStudentPidExpire(String studentPidExpire) {
        this.studentPidExpire = studentPidExpire;
    }

    public String getStudentCurrentHouse() {
        return studentCurrentHouse;
    }

    public void setStudentCurrentHouse(String studentCurrentHouse) {
        this.studentCurrentHouse = studentCurrentHouse;
    }

    public String getStudentCurrentMoo() {
        return studentCurrentMoo;
    }

    public void setStudentCurrentMoo(String studentCurrentMoo) {
        this.studentCurrentMoo = studentCurrentMoo;
    }

    public String getStudentCurrentApartment() {
        return studentCurrentApartment;
    }

    public void setStudentCurrentApartment(String studentCurrentApartment) {
        this.studentCurrentApartment = studentCurrentApartment;
    }

    public String getStudentCurrentApartmentRoom() {
        return studentCurrentApartmentRoom;
    }

    public void setStudentCurrentApartmentRoom(String studentCurrentApartmentRoom) {
        this.studentCurrentApartmentRoom = studentCurrentApartmentRoom;
    }

    public String getStudentCurrentRoad() {
        return studentCurrentRoad;
    }

    public void setStudentCurrentRoad(String studentCurrentRoad) {
        this.studentCurrentRoad = studentCurrentRoad;
    }

    public String getStudentCurrentSoi() {
        return studentCurrentSoi;
    }

    public void setStudentCurrentSoi(String studentCurrentSoi) {
        this.studentCurrentSoi = studentCurrentSoi;
    }

    public String getStudentCurrentTambon() {
        return studentCurrentTambon;
    }

    public void setStudentCurrentTambon(String studentCurrentTambon) {
        this.studentCurrentTambon = studentCurrentTambon;
    }

    public String getStudentCurrentAmphur() {
        return studentCurrentAmphur;
    }

    public void setStudentCurrentAmphur(String studentCurrentAmphur) {
        this.studentCurrentAmphur = studentCurrentAmphur;
    }

    public String getStudentCurrentChangwat() {
        return studentCurrentChangwat;
    }

    public void setStudentCurrentChangwat(String studentCurrentChangwat) {
        this.studentCurrentChangwat = studentCurrentChangwat;
    }

    public String getStudentTelephone() {
        return studentTelephone;
    }

    public void setStudentTelephone(String studentTelephone) {
        this.studentTelephone = studentTelephone;
    }

    public String getStudentEmail() {
        return studentEmail;
    }

    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }

    public String getStudentDate() {
        return studentDate;
    }

    public void setStudentDate(String studentDate) {
        this.studentDate = studentDate;
    }

    public String getStudentSecondarySchoolNamet() {
        return studentSecondarySchoolNamet;
    }

    public void setStudentSecondarySchoolNamet(String studentSecondarySchoolNamet) {
        this.studentSecondarySchoolNamet = studentSecondarySchoolNamet;
    }

    public String getStudentSecondarySchoolFaculty() {
        return studentSecondarySchoolFaculty;
    }

    public void setStudentSecondarySchoolFaculty(String studentSecondarySchoolFaculty) {
        this.studentSecondarySchoolFaculty = studentSecondarySchoolFaculty;
    }

    public String getStudentSecondarySchoolYear() {
        return studentSecondarySchoolYear;
    }

    public void setStudentSecondarySchoolYear(String studentSecondarySchoolYear) {
        this.studentSecondarySchoolYear = studentSecondarySchoolYear;
    }

    public String getStudentSecondarySchoolPoint() {
        return studentSecondarySchoolPoint;
    }

    public void setStudentSecondarySchoolPoint(String studentSecondarySchoolPoint) {
        this.studentSecondarySchoolPoint = studentSecondarySchoolPoint;
    }

    public String getStudentHighSchoolNamet() {
        return studentHighSchoolNamet;
    }

    public void setStudentHighSchoolNamet(String studentHighSchoolNamet) {
        this.studentHighSchoolNamet = studentHighSchoolNamet;
    }

    public String getStudentHighSchoolFaculty() {
        return studentHighSchoolFaculty;
    }

    public void setStudentHighSchoolFaculty(String studentHighSchoolFaculty) {
        this.studentHighSchoolFaculty = studentHighSchoolFaculty;
    }

    public String getStudentHighSchoolYear() {
        return studentHighSchoolYear;
    }

    public void setStudentHighSchoolYear(String studentHighSchoolYear) {
        this.studentHighSchoolYear = studentHighSchoolYear;
    }

    public String getStudentHighSchoolPoint() {
        return studentHighSchoolPoint;
    }

    public void setStudentHighSchoolPoint(String studentHighSchoolPoint) {
        this.studentHighSchoolPoint = studentHighSchoolPoint;
    }

    public String getStudentBachelorSchoolNamet() {
        return studentBachelorSchoolNamet;
    }

    public void setStudentBachelorSchoolNamet(String studentBachelorSchoolNamet) {
        this.studentBachelorSchoolNamet = studentBachelorSchoolNamet;
    }

    public String getStudentBachelorSchoolFaculty() {
        return studentBachelorSchoolFaculty;
    }

    public void setStudentBachelorSchoolFaculty(String studentBachelorSchoolFaculty) {
        this.studentBachelorSchoolFaculty = studentBachelorSchoolFaculty;
    }

    public String getStudentBachelorSchoolYear() {
        return studentBachelorSchoolYear;
    }

    public void setStudentBachelorSchoolYear(String studentBachelorSchoolYear) {
        this.studentBachelorSchoolYear = studentBachelorSchoolYear;
    }

    public String getStudentBachelorSchoolPoint() {
        return studentBachelorSchoolPoint;
    }

    public void setStudentBachelorSchoolPoint(String studentBachelorSchoolPoint) {
        this.studentBachelorSchoolPoint = studentBachelorSchoolPoint;
    }

    public String getStudentOther1School() {
        return studentOther1School;
    }

    public void setStudentOther1School(String studentOther1School) {
        this.studentOther1School = studentOther1School;
    }

    public String getStudentOther1SchoolNamet() {
        return studentOther1SchoolNamet;
    }

    public void setStudentOther1SchoolNamet(String studentOther1SchoolNamet) {
        this.studentOther1SchoolNamet = studentOther1SchoolNamet;
    }

    public String getStudentOther1SchoolFaculty() {
        return studentOther1SchoolFaculty;
    }

    public void setStudentOther1SchoolFaculty(String studentOther1SchoolFaculty) {
        this.studentOther1SchoolFaculty = studentOther1SchoolFaculty;
    }

    public String getStudentOther1SchoolYear() {
        return studentOther1SchoolYear;
    }

    public void setStudentOther1SchoolYear(String studentOther1SchoolYear) {
        this.studentOther1SchoolYear = studentOther1SchoolYear;
    }

    public String getStudentOther1SchoolPoint() {
        return studentOther1SchoolPoint;
    }

    public void setStudentOther1SchoolPoint(String studentOther1SchoolPoint) {
        this.studentOther1SchoolPoint = studentOther1SchoolPoint;
    }

    public String getStudentOther2School() {
        return studentOther2School;
    }

    public void setStudentOther2School(String studentOther2School) {
        this.studentOther2School = studentOther2School;
    }

    public String getStudentOther2SchoolNamet() {
        return studentOther2SchoolNamet;
    }

    public void setStudentOther2SchoolNamet(String studentOther2SchoolNamet) {
        this.studentOther2SchoolNamet = studentOther2SchoolNamet;
    }

    public String getStudentOther2SchoolFaculty() {
        return studentOther2SchoolFaculty;
    }

    public void setStudentOther2SchoolFaculty(String studentOther2SchoolFaculty) {
        this.studentOther2SchoolFaculty = studentOther2SchoolFaculty;
    }

    public String getStudentOther2SchoolYear() {
        return studentOther2SchoolYear;
    }

    public void setStudentOther2SchoolYear(String studentOther2SchoolYear) {
        this.studentOther2SchoolYear = studentOther2SchoolYear;
    }

    public String getStudentOther2SchoolPoint() {
        return studentOther2SchoolPoint;
    }

    public void setStudentOther2SchoolPoint(String studentOther2SchoolPoint) {
        this.studentOther2SchoolPoint = studentOther2SchoolPoint;
    }

    public String getStudentDocumentStatusDegree() {
        return studentDocumentStatusDegree;
    }

    public void setStudentDocumentStatusDegree(String studentDocumentStatusDegree) {
        this.studentDocumentStatusDegree = studentDocumentStatusDegree;
    }

    public String getStudentDocumentStatusPid() {
        return studentDocumentStatusPid;
    }

    public void setStudentDocumentStatusPid(String studentDocumentStatusPid) {
        this.studentDocumentStatusPid = studentDocumentStatusPid;
    }

    public String getStudentDocumentStatusUserHome() {
        return studentDocumentStatusUserHome;
    }

    public void setStudentDocumentStatusUserHome(String studentDocumentStatusUserHome) {
        this.studentDocumentStatusUserHome = studentDocumentStatusUserHome;
    }

    public String getStudentDocumentStatusPicture() {
        return studentDocumentStatusPicture;
    }

    public void setStudentDocumentStatusPicture(String studentDocumentStatusPicture) {
        this.studentDocumentStatusPicture = studentDocumentStatusPicture;
    }

    public String getStudentDocumentStatusOther1() {
        return studentDocumentStatusOther1;
    }

    public void setStudentDocumentStatusOther1(String studentDocumentStatusOther1) {
        this.studentDocumentStatusOther1 = studentDocumentStatusOther1;
    }

    public String getStudentDocumentStatusOther2() {
        return studentDocumentStatusOther2;
    }

    public void setStudentDocumentStatusOther2(String studentDocumentStatusOther2) {
        this.studentDocumentStatusOther2 = studentDocumentStatusOther2;
    }

    public String getStudentDressHeight() {
        return studentDressHeight;
    }

    public void setStudentDressHeight(String studentDressHeight) {
        this.studentDressHeight = studentDressHeight;
    }

    public String getStudentDressHip() {
        return studentDressHip;
    }

    public void setStudentDressHip(String studentDressHip) {
        this.studentDressHip = studentDressHip;
    }

    public String getStudentDressChest() {
        return studentDressChest;
    }

    public void setStudentDressChest(String studentDressChest) {
        this.studentDressChest = studentDressChest;
    }

    public String getStudentDressShoulder() {
        return studentDressShoulder;
    }
    public void setStudentDressShoulder(String studentDressShoulder) {
        this.studentDressShoulder = studentDressShoulder;
    }

    public String getStudentDressOther() {
        return studentDressOther;
    }
    public void setStudentDressOther(String studentDressOther) {
        this.studentDressOther = studentDressOther;
    }

    public String getStudentActive() {
        return studentActive;
    }
    public void setStudentActive(String studentActive) {
        this.studentActive = studentActive;
    }

    public String getStudentSchoolYear() {
        return studentSchoolYear;
    }
    public void setStudentSchoolYear(String studentSchoolYear) {
        this.studentSchoolYear = studentSchoolYear;
    }

    public String getStudentModelStudies() {
        return studentModelStudies;
    }
    public void setStudentModelStudies(String studentModelStudies) {
        this.studentModelStudies = studentModelStudies;
    }

    public String getStudentDateApply() {
        return studentDateApply;
    }
    public void setStudentDateApply(String studentDateApply) {
        this.studentDateApply = studentDateApply;
    }

    public String getStudentCode() {
        return studentCode;
    }
    public void setStudentCode(String studentCode) {
        this.studentCode = studentCode;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (studentId != null ? studentId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof BhacTStudent)) {
            return false;
        }
        BhacTStudent other = (BhacTStudent) object;
        if ((this.studentId == null && other.studentId != null) || (this.studentId != null && !this.studentId.equals(other.studentId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.BhacTStudent[studentId=" + studentId + "]";
    }

}
