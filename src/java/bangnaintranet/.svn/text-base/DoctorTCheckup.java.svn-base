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
 * @author pop
 */
@Entity
@Table(name = "doctor_t_checkup", catalog = "bangna", schema = "public")
@NamedQueries({@NamedQuery(name = "DoctorTCheckup.findAll", query = "SELECT d FROM DoctorTCheckup d"), @NamedQuery(name = "DoctorTCheckup.findByCheckupId", query = "SELECT d FROM DoctorTCheckup d WHERE d.checkupId = :checkupId"), @NamedQuery(name = "DoctorTCheckup.findByCheckupDate", query = "SELECT d FROM DoctorTCheckup d WHERE d.checkupDate = :checkupDate"), @NamedQuery(name = "DoctorTCheckup.findByFPatientPrefixId", query = "SELECT d FROM DoctorTCheckup d WHERE d.fPatientPrefixId = :fPatientPrefixId"), @NamedQuery(name = "DoctorTCheckup.findByPatientFirstnamet", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientFirstnamet = :patientFirstnamet"), @NamedQuery(name = "DoctorTCheckup.findByPatientLastnamet", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientLastnamet = :patientLastnamet"), @NamedQuery(name = "DoctorTCheckup.findByPatientHn", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientHn = :patientHn"), @NamedQuery(name = "DoctorTCheckup.findByFSexId", query = "SELECT d FROM DoctorTCheckup d WHERE d.fSexId = :fSexId"), @NamedQuery(name = "DoctorTCheckup.findByPatientBirthday", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientBirthday = :patientBirthday"), @NamedQuery(name = "DoctorTCheckup.findByFPatientPrefixNamee", query = "SELECT d FROM DoctorTCheckup d WHERE d.fPatientPrefixNamee = :fPatientPrefixNamee"), @NamedQuery(name = "DoctorTCheckup.findByPatientFirstnamee", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientFirstnamee = :patientFirstnamee"), @NamedQuery(name = "DoctorTCheckup.findByPatientLastnamee", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientLastnamee = :patientLastnamee"), @NamedQuery(name = "DoctorTCheckup.findByCheckupActive", query = "SELECT d FROM DoctorTCheckup d WHERE d.checkupActive = :checkupActive"), @NamedQuery(name = "DoctorTCheckup.findByPatientAge", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientAge = :patientAge"), @NamedQuery(name = "DoctorTCheckup.findByFPatientBloodGroupId", query = "SELECT d FROM DoctorTCheckup d WHERE d.fPatientBloodGroupId = :fPatientBloodGroupId"), @NamedQuery(name = "DoctorTCheckup.findByPatientPid", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientPid = :patientPid"), @NamedQuery(name = "DoctorTCheckup.findByPassportNo", query = "SELECT d FROM DoctorTCheckup d WHERE d.passportNo = :passportNo"), @NamedQuery(name = "DoctorTCheckup.findByFPatientMarriageStatusId", query = "SELECT d FROM DoctorTCheckup d WHERE d.fPatientMarriageStatusId = :fPatientMarriageStatusId"), @NamedQuery(name = "DoctorTCheckup.findByPatientChangwat", query = "SELECT d FROM DoctorTCheckup d WHERE d.patientChangwat = :patientChangwat"), @NamedQuery(name = "DoctorTCheckup.findByFPatientNationId", query = "SELECT d FROM DoctorTCheckup d WHERE d.fPatientNationId = :fPatientNationId"), @NamedQuery(name = "DoctorTCheckup.findByAsthma", query = "SELECT d FROM DoctorTCheckup d WHERE d.asthma = :asthma"), @NamedQuery(name = "DoctorTCheckup.findByHypertension", query = "SELECT d FROM DoctorTCheckup d WHERE d.hypertension = :hypertension"), @NamedQuery(name = "DoctorTCheckup.findByHemoptysis", query = "SELECT d FROM DoctorTCheckup d WHERE d.hemoptysis = :hemoptysis"), @NamedQuery(name = "DoctorTCheckup.findByHeartDiseases", query = "SELECT d FROM DoctorTCheckup d WHERE d.heartDiseases = :heartDiseases"), @NamedQuery(name = "DoctorTCheckup.findByDiabetesMellitus", query = "SELECT d FROM DoctorTCheckup d WHERE d.diabetesMellitus = :diabetesMellitus"), @NamedQuery(name = "DoctorTCheckup.findByJaundice", query = "SELECT d FROM DoctorTCheckup d WHERE d.jaundice = :jaundice"), @NamedQuery(name = "DoctorTCheckup.findByEpilepsy", query = "SELECT d FROM DoctorTCheckup d WHERE d.epilepsy = :epilepsy"), @NamedQuery(name = "DoctorTCheckup.findByVeneralDiseases", query = "SELECT d FROM DoctorTCheckup d WHERE d.veneralDiseases = :veneralDiseases"), @NamedQuery(name = "DoctorTCheckup.findByAcquiredImmune", query = "SELECT d FROM DoctorTCheckup d WHERE d.acquiredImmune = :acquiredImmune"), @NamedQuery(name = "DoctorTCheckup.findByEdema", query = "SELECT d FROM DoctorTCheckup d WHERE d.edema = :edema"), @NamedQuery(name = "DoctorTCheckup.findByYaws", query = "SELECT d FROM DoctorTCheckup d WHERE d.yaws = :yaws"), @NamedQuery(name = "DoctorTCheckup.findByOtorrhea", query = "SELECT d FROM DoctorTCheckup d WHERE d.otorrhea = :otorrhea"), @NamedQuery(name = "DoctorTCheckup.findByHernia", query = "SELECT d FROM DoctorTCheckup d WHERE d.hernia = :hernia"), @NamedQuery(name = "DoctorTCheckup.findByHemorrhoid", query = "SELECT d FROM DoctorTCheckup d WHERE d.hemorrhoid = :hemorrhoid"), @NamedQuery(name = "DoctorTCheckup.findByAccident", query = "SELECT d FROM DoctorTCheckup d WHERE d.accident = :accident"), @NamedQuery(name = "DoctorTCheckup.findByFractures", query = "SELECT d FROM DoctorTCheckup d WHERE d.fractures = :fractures"), @NamedQuery(name = "DoctorTCheckup.findBySurgicalOperation", query = "SELECT d FROM DoctorTCheckup d WHERE d.surgicalOperation = :surgicalOperation"), @NamedQuery(name = "DoctorTCheckup.findByMalaria", query = "SELECT d FROM DoctorTCheckup d WHERE d.malaria = :malaria"), @NamedQuery(name = "DoctorTCheckup.findByHeight", query = "SELECT d FROM DoctorTCheckup d WHERE d.height = :height"), @NamedQuery(name = "DoctorTCheckup.findByWeight", query = "SELECT d FROM DoctorTCheckup d WHERE d.weight = :weight"), @NamedQuery(name = "DoctorTCheckup.findByBloodPressure", query = "SELECT d FROM DoctorTCheckup d WHERE d.bloodPressure = :bloodPressure"), @NamedQuery(name = "DoctorTCheckup.findByPulse", query = "SELECT d FROM DoctorTCheckup d WHERE d.pulse = :pulse"), @NamedQuery(name = "DoctorTCheckup.findByEyeRight", query = "SELECT d FROM DoctorTCheckup d WHERE d.eyeRight = :eyeRight"), @NamedQuery(name = "DoctorTCheckup.findByEyeLeft", query = "SELECT d FROM DoctorTCheckup d WHERE d.eyeLeft = :eyeLeft"), @NamedQuery(name = "DoctorTCheckup.findByGlasses", query = "SELECT d FROM DoctorTCheckup d WHERE d.glasses = :glasses"), @NamedQuery(name = "DoctorTCheckup.findByColorBlindness", query = "SELECT d FROM DoctorTCheckup d WHERE d.colorBlindness = :colorBlindness"), @NamedQuery(name = "DoctorTCheckup.findByGeneralAppearance", query = "SELECT d FROM DoctorTCheckup d WHERE d.generalAppearance = :generalAppearance"), @NamedQuery(name = "DoctorTCheckup.findBySkinScalp", query = "SELECT d FROM DoctorTCheckup d WHERE d.skinScalp = :skinScalp"), @NamedQuery(name = "DoctorTCheckup.findByLymphNodes", query = "SELECT d FROM DoctorTCheckup d WHERE d.lymphNodes = :lymphNodes"), @NamedQuery(name = "DoctorTCheckup.findByEyes", query = "SELECT d FROM DoctorTCheckup d WHERE d.eyes = :eyes"), @NamedQuery(name = "DoctorTCheckup.findByEars", query = "SELECT d FROM DoctorTCheckup d WHERE d.ears = :ears"), @NamedQuery(name = "DoctorTCheckup.findByNose", query = "SELECT d FROM DoctorTCheckup d WHERE d.nose = :nose"), @NamedQuery(name = "DoctorTCheckup.findByPharynxTonsils", query = "SELECT d FROM DoctorTCheckup d WHERE d.pharynxTonsils = :pharynxTonsils"), @NamedQuery(name = "DoctorTCheckup.findByThyroidGland", query = "SELECT d FROM DoctorTCheckup d WHERE d.thyroidGland = :thyroidGland"), @NamedQuery(name = "DoctorTCheckup.findByLungs", query = "SELECT d FROM DoctorTCheckup d WHERE d.lungs = :lungs"), @NamedQuery(name = "DoctorTCheckup.findByHeart", query = "SELECT d FROM DoctorTCheckup d WHERE d.heart = :heart"), @NamedQuery(name = "DoctorTCheckup.findByAdditionComments", query = "SELECT d FROM DoctorTCheckup d WHERE d.additionComments = :additionComments"), @NamedQuery(name = "DoctorTCheckup.findByAbdomen", query = "SELECT d FROM DoctorTCheckup d WHERE d.abdomen = :abdomen"), @NamedQuery(name = "DoctorTCheckup.findByLiver", query = "SELECT d FROM DoctorTCheckup d WHERE d.liver = :liver"), @NamedQuery(name = "DoctorTCheckup.findBySpleen", query = "SELECT d FROM DoctorTCheckup d WHERE d.spleen = :spleen"), @NamedQuery(name = "DoctorTCheckup.findByExtenalGenitalia", query = "SELECT d FROM DoctorTCheckup d WHERE d.extenalGenitalia = :extenalGenitalia"), @NamedQuery(name = "DoctorTCheckup.findByRectalExam", query = "SELECT d FROM DoctorTCheckup d WHERE d.rectalExam = :rectalExam"), @NamedQuery(name = "DoctorTCheckup.findByVertebrae", query = "SELECT d FROM DoctorTCheckup d WHERE d.vertebrae = :vertebrae"), @NamedQuery(name = "DoctorTCheckup.findByLocomotor", query = "SELECT d FROM DoctorTCheckup d WHERE d.locomotor = :locomotor"), @NamedQuery(name = "DoctorTCheckup.findByReflexes", query = "SELECT d FROM DoctorTCheckup d WHERE d.reflexes = :reflexes"), @NamedQuery(name = "DoctorTCheckup.findByMentalHealthStatus", query = "SELECT d FROM DoctorTCheckup d WHERE d.mentalHealthStatus = :mentalHealthStatus"), @NamedQuery(name = "DoctorTCheckup.findByOther", query = "SELECT d FROM DoctorTCheckup d WHERE d.other = :other"), @NamedQuery(name = "DoctorTCheckup.findByHemoglobin", query = "SELECT d FROM DoctorTCheckup d WHERE d.hemoglobin = :hemoglobin"), @NamedQuery(name = "DoctorTCheckup.findByDifferentiaPmn", query = "SELECT d FROM DoctorTCheckup d WHERE d.differentiaPmn = :differentiaPmn"), @NamedQuery(name = "DoctorTCheckup.findByDifferentiaBaso", query = "SELECT d FROM DoctorTCheckup d WHERE d.differentiaBaso = :differentiaBaso"), @NamedQuery(name = "DoctorTCheckup.findBywhiteBloodCell", query = "SELECT d FROM DoctorTCheckup d WHERE d.whiteBloodCell = :whiteBloodCell"), @NamedQuery(name = "DoctorTCheckup.findByHematocrit", query = "SELECT d FROM DoctorTCheckup d WHERE d.hematocrit = :hematocrit"), @NamedQuery(name = "DoctorTCheckup.findByDifferentialLymp", query = "SELECT d FROM DoctorTCheckup d WHERE d.differentialLymp = :differentialLymp"), @NamedQuery(name = "DoctorTCheckup.findByDifferentialBand", query = "SELECT d FROM DoctorTCheckup d WHERE d.differentialBand = :differentialBand"), @NamedQuery(name = "DoctorTCheckup.findByDifferentialBlast", query = "SELECT d FROM DoctorTCheckup d WHERE d.differentialBlast = :differentialBlast"), @NamedQuery(name = "DoctorTCheckup.findByDifferentialMono", query = "SELECT d FROM DoctorTCheckup d WHERE d.differentialMono = :differentialMono"), @NamedQuery(name = "DoctorTCheckup.findByDifferentialEos", query = "SELECT d FROM DoctorTCheckup d WHERE d.differentialEos = :differentialEos"), @NamedQuery(name = "DoctorTCheckup.findByHivGpa", query = "SELECT d FROM DoctorTCheckup d WHERE d.hivGpa = :hivGpa"), @NamedQuery(name = "DoctorTCheckup.findByHivElisa", query = "SELECT d FROM DoctorTCheckup d WHERE d.hivElisa = :hivElisa"), @NamedQuery(name = "DoctorTCheckup.findByHivWesternBlot", query = "SELECT d FROM DoctorTCheckup d WHERE d.hivWesternBlot = :hivWesternBlot"), @NamedQuery(name = "DoctorTCheckup.findByHepatitis", query = "SELECT d FROM DoctorTCheckup d WHERE d.hepatitis = :hepatitis"), @NamedQuery(name = "DoctorTCheckup.findByHepatitisVdrl", query = "SELECT d FROM DoctorTCheckup d WHERE d.hepatitisVdrl = :hepatitisVdrl"), @NamedQuery(name = "DoctorTCheckup.findByHepatitisRpr", query = "SELECT d FROM DoctorTCheckup d WHERE d.hepatitisRpr = :hepatitisRpr"), @NamedQuery(name = "DoctorTCheckup.findByHepatitisTpha", query = "SELECT d FROM DoctorTCheckup d WHERE d.hepatitisTpha = :hepatitisTpha"), @NamedQuery(name = "DoctorTCheckup.findByBloodFilm", query = "SELECT d FROM DoctorTCheckup d WHERE d.bloodFilm = :bloodFilm"), @NamedQuery(name = "DoctorTCheckup.findByBllodFilmComment", query = "SELECT d FROM DoctorTCheckup d WHERE d.bllodFilmComment = :bllodFilmComment"), @NamedQuery(name = "DoctorTCheckup.findByUriColor", query = "SELECT d FROM DoctorTCheckup d WHERE d.uriColor = :uriColor"), @NamedQuery(name = "DoctorTCheckup.findByUriSp", query = "SELECT d FROM DoctorTCheckup d WHERE d.uriSp = :uriSp"), @NamedQuery(name = "DoctorTCheckup.findByUriPh", query = "SELECT d FROM DoctorTCheckup d WHERE d.uriPh = :uriPh"), @NamedQuery(name = "DoctorTCheckup.findByUriSugar", query = "SELECT d FROM DoctorTCheckup d WHERE d.uriSugar = :uriSugar"), @NamedQuery(name = "DoctorTCheckup.findByAlbumin", query = "SELECT d FROM DoctorTCheckup d WHERE d.albumin = :albumin"), @NamedQuery(name = "DoctorTCheckup.findByBlood", query = "SELECT d FROM DoctorTCheckup d WHERE d.blood = :blood"), @NamedQuery(name = "DoctorTCheckup.findByKetone", query = "SELECT d FROM DoctorTCheckup d WHERE d.ketone = :ketone"), @NamedQuery(name = "DoctorTCheckup.findByBile", query = "SELECT d FROM DoctorTCheckup d WHERE d.bile = :bile"), @NamedQuery(name = "DoctorTCheckup.findByMicroWbc", query = "SELECT d FROM DoctorTCheckup d WHERE d.microWbc = :microWbc"), @NamedQuery(name = "DoctorTCheckup.findByRbc", query = "SELECT d FROM DoctorTCheckup d WHERE d.rbc = :rbc"), @NamedQuery(name = "DoctorTCheckup.findByCasts", query = "SELECT d FROM DoctorTCheckup d WHERE d.casts = :casts"), @NamedQuery(name = "DoctorTCheckup.findByEpithelalCell", query = "SELECT d FROM DoctorTCheckup d WHERE d.epithelalCell = :epithelalCell"), @NamedQuery(name = "DoctorTCheckup.findByEpithelalOther", query = "SELECT d FROM DoctorTCheckup d WHERE d.epithelalOther = :epithelalOther"), @NamedQuery(name = "DoctorTCheckup.findByUrine", query = "SELECT d FROM DoctorTCheckup d WHERE d.urine = :urine"), @NamedQuery(name = "DoctorTCheckup.findByStool", query = "SELECT d FROM DoctorTCheckup d WHERE d.stool = :stool"), @NamedQuery(name = "DoctorTCheckup.findByChestXRay", query = "SELECT d FROM DoctorTCheckup d WHERE d.chestXRay = :chestXRay"), @NamedQuery(name = "DoctorTCheckup.findByOtherExaminations", query = "SELECT d FROM DoctorTCheckup d WHERE d.otherExaminations = :otherExaminations"), @NamedQuery(name = "DoctorTCheckup.findByAntiHcv", query = "SELECT d FROM DoctorTCheckup d WHERE d.antiHcv = :antiHcv"), @NamedQuery(name = "DoctorTCheckup.findByConclusion", query = "SELECT d FROM DoctorTCheckup d WHERE d.conclusion = :conclusion"), @NamedQuery(name = "DoctorTCheckup.findByDoctorId", query = "SELECT d FROM DoctorTCheckup d WHERE d.doctorId = :doctorId"), @NamedQuery(name = "DoctorTCheckup.findByDoctorFullnamet", query = "SELECT d FROM DoctorTCheckup d WHERE d.doctorFullnamet = :doctorFullnamet"), @NamedQuery(name = "DoctorTCheckup.findByDoctorFullnamee", query = "SELECT d FROM DoctorTCheckup d WHERE d.doctorFullnamee = :doctorFullnamee")})
public class DoctorTCheckup implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "checkup_id", nullable = false, length = 255)
    private String checkupId="";
    @Column(name = "checkup_date", length = 255)
    private String checkupDate="";
    @Column(name = "f_patient_prefix_id", length = 255)
    private String fPatientPrefixId="";
    @Column(name = "patient_firstnamet", length = 255)
    private String patientFirstnamet="";
    @Column(name = "patient_lastnamet", length = 2147483647)
    private String patientLastnamet="";
    @Column(name = "patient_hn", length = 255)
    private String patientHn="";
    @Column(name = "f_sex_id", length = 255)
    private String fSexId="";
    @Column(name = "patient_birthday", length = 255)
    private String patientBirthday="";
    @Column(name = "f_patient_prefix_namee", length = 255)
    private String fPatientPrefixNamee="";
    @Column(name = "patient_firstnamee", length = 255)
    private String patientFirstnamee="";
    @Column(name = "patient_lastnamee", length = 255)
    private String patientLastnamee="";
    @Column(name = "checkup_active", length = 255)
    private String checkupActive="";
    @Column(name = "patient_age", length = 255)
    private String patientAge="";
    @Column(name = "f_patient_blood_group_id", length = 255)
    private String fPatientBloodGroupId="";
    @Column(name = "patient_pid", length = 255)
    private String patientPid="";
    @Column(name = "passport_no", length = 255)
    private String passportNo="";
    @Column(name = "f_patient_marriage_status_id", length = 255)
    private String fPatientMarriageStatusId="";
    @Column(name = "patient_changwat", length = 255)
    private String patientChangwat="";
    @Column(name = "f_patient_nation_id", length = 255)
    private String fPatientNationId="";
    @Column(name = "asthma", length = 255)
    private String asthma="";
    @Column(name = "hypertension", length = 255)
    private String hypertension="";
    @Column(name = "hemoptysis", length = 255)
    private String hemoptysis="";
    @Column(name = "heart_diseases", length = 255)
    private String heartDiseases="";
    @Column(name = "diabetes_mellitus", length = 255)
    private String diabetesMellitus="";
    @Column(name = "jaundice", length = 255)
    private String jaundice="";
    @Column(name = "epilepsy", length = 255)
    private String epilepsy="";
    @Column(name = "veneral_diseases", length = 255)
    private String veneralDiseases="";
    @Column(name = "acquired_immune", length = 255)
    private String acquiredImmune="";
    @Column(name = "edema", length = 255)
    private String edema="";
    @Column(name = "yaws", length = 255)
    private String yaws="";
    @Column(name = "otorrhea", length = 255)
    private String otorrhea="";
    @Column(name = "hernia", length = 255)
    private String hernia="";
    @Column(name = "hemorrhoid", length = 255)
    private String hemorrhoid="";
    @Column(name = "accident", length = 255)
    private String accident="";
    @Column(name = "fractures", length = 255)
    private String fractures="";
    @Column(name = "surgical_operation", length = 255)
    private String surgicalOperation="";
    @Column(name = "malaria", length = 255)
    private String malaria="";
    @Column(name = "height", length = 255)
    private String height="";
    @Column(name = "width", length = 255)
    private String width="";
    @Column(name = "blood_pressure", length = 255)
    private String bloodPressure="";
    @Column(name = "pulse", length = 255)
    private String pulse="";
    @Column(name = "eye_right", length = 255)
    private String eyeRight="";
    @Column(name = "eye_left", length = 255)
    private String eyeLeft="";
    @Column(name = "glasses", length = 255)
    private String glasses="";
    @Column(name = "color_blindness", length = 255)
    private String colorBlindness="";
    @Column(name = "general_appearance", length = 255)
    private String generalAppearance="";
    @Column(name = "skin_scalp", length = 255)
    private String skinScalp="";
    @Column(name = "lymph_nodes", length = 255)
    private String lymphNodes="";
    @Column(name = "eyes", length = 255)
    private String eyes="";
    @Column(name = "ears", length = 255)
    private String ears="";
    @Column(name = "nose", length = 255)
    private String nose="";
    @Column(name = "pharynx_tonsils", length = 255)
    private String pharynxTonsils="";
    @Column(name = "thyroid_gland", length = 255)
    private String thyroidGland="";
    @Column(name = "lungs", length = 255)
    private String lungs="";
    @Column(name = "heart", length = 255)
    private String heart="";
    @Column(name = "addition_comments", length = 255)
    private String additionComments="";
    @Column(name = "abdomen", length = 255)
    private String abdomen="";
    @Column(name = "liver", length = 255)
    private String liver="";
    @Column(name = "spleen", length = 255)
    private String spleen="";
    @Column(name = "extenal_genitalia", length = 255)
    private String extenalGenitalia="";
    @Column(name = "rectal_exam", length = 255)
    private String rectalExam="";
    @Column(name = "vertebrae", length = 255)
    private String vertebrae="";
    @Column(name = "locomotor", length = 255)
    private String locomotor="";
    @Column(name = "reflexes", length = 255)
    private String reflexes="";
    @Column(name = "mental_health_status", length = 255)
    private String mentalHealthStatus="";
    @Column(name = "other", length = 255)
    private String other="";
    @Column(name = "hemoglobin", length = 255)
    private String hemoglobin="";
    @Column(name = "differentia_pmn", length = 255)
    private String differentiaPmn="";
    @Column(name = "differentia_baso", length = 255)
    private String differentiaBaso="";
    @Column(name = "white_blood_cell", length = 255)
    private String whiteBloodCell="";
    @Column(name = "hematocrit", length = 255)
    private String hematocrit="";
    @Column(name = "differential_lymp", length = 255)
    private String differentialLymp="";
    @Column(name = "differential_band", length = 255)
    private String differentialBand="";
    @Column(name = "differential_blast", length = 255)
    private String differentialBlast="";
    @Column(name = "differential_mono", length = 255)
    private String differentialMono="";
    @Column(name = "differential_eos", length = 255)
    private String differentialEos="";
    @Column(name = "hiv_gpa", length = 255)
    private String hivGpa="";
    @Column(name = "hiv_elisa", length = 255)
    private String hivElisa="";
    @Column(name = "hiv_western_blot", length = 255)
    private String hivWesternBlot="";
    @Column(name = "hepatitis", length = 255)
    private String hepatitis="";
    @Column(name = "hepatitis_vdrl", length = 255)
    private String hepatitisVdrl="";
    @Column(name = "hepatitis_rpr", length = 255)
    private String hepatitisRpr="";
    @Column(name = "hepatitis_tpha", length = 255)
    private String hepatitisTpha="";
    @Column(name = "blood_film", length = 255)
    private String bloodFilm="";
    @Column(name = "blood_film_comment", length = 255)
    private String bloodFilmComment="";
    @Column(name = "uri_color", length = 255)
    private String uriColor="";
    @Column(name = "uri_sp", length = 255)
    private String uriSp="";
    @Column(name = "uri_ph", length = 255)
    private String uriPh="";
    @Column(name = "uri_sugar", length = 255)
    private String uriSugar="";
    @Column(name = "albumin", length = 255)
    private String albumin="";
    @Column(name = "blood", length = 255)
    private String blood="";
    @Column(name = "ketone", length = 255)
    private String ketone="";
    @Column(name = "bile", length = 255)
    private String bile="";
    @Column(name = "micro_wbc", length = 255)
    private String microWbc="";
    @Column(name = "rbc", length = 255)
    private String rbc="";
    @Column(name = "casts", length = 255)
    private String casts="";
    @Column(name = "epithelal_cell", length = 255)
    private String epithelalCell="";
    @Column(name = "epithelal_other", length = 255)
    private String epithelalOther="";
    @Column(name = "urine", length = 255)
    private String urine="";
    @Column(name = "stool", length = 255)
    private String stool="";
    @Column(name = "chest_x_ray", length = 255)
    private String chestXRay="";
    @Column(name = "other_examinations", length = 255)
    private String otherExaminations="";
    @Column(name = "anti_hcv", length = 255)
    private String antiHcv="";
    @Column(name = "conclusion", length = 255)
    private String conclusion="";
    @Column(name = "doctor_id", length = 255)
    private String doctorId="";
    @Column(name = "doctor_fullnamet", length = 255)
    private String doctorFullnamet="";
    @Column(name = "doctor_fullnamee", length = 255)
    private String doctorFullnamee="";
    @Column(name = "branch_id", length = 255)
    private String branchId="";
    @Column(name = "female_lmp", length = 255)
    private String femaleLmp="";
    @Column(name = "medical_explain", length = 255)
    private String medicalExplain="";
    @Column(name = "otoscopic_exam", length = 255)
    private String otoscopicExam="";
    @Column(name = "other_description", length = 255)
    private String otherDescription="";
    @Column(name = "hiv", length = 255)
    private String hiv="";
    @Column(name = "hepatitis_type", length = 255)
    private String hepatitisType="";
    @Column(name = "checkup_time", length = 255)
    private String checkupTime="";

    public DoctorTCheckup() {
    }

    public String getDoctorTCheckup() {
        return "doctor_t_checkup";
    }

    public String getFCheckUpId() {
        return "checkup_id";
    }
    public String getFCheckUpDate() {
        return "checkup_date";
    }
    public String getFFPatientPrefixId() {
        return "f_patient_prefix_id";
    }
    public String getFPatientFirstnameT() {
        return "patient_firstnamet";
    }
    public String getFPatientLastnameT() {
        return "patient_lastnamet";
    }
    public String getFPatientHn() {
        return "patient_hn";
    }
    public String getFFSexId() {
        return "f_sex_id";
    }
    public String getFPateintBirthday() {
        return "patient_birthday";
    }
    public String getFFPateintPrefixNameE() {
        return "f_patient_prefix_namee";
    }
    public String getFPateintFirstnameE() {
        return "patient_firstnamee";
    }
    public String getFPateintLastnameE() {
        return "patient_lastnamee";
    }
    public String getFCheckUpActive() {
        return "checkup_active";
    }
    public String getFPatientAge() {
        return "patient_age";
    }
    public String getFFPatientBlodGroupId() {
        return "f_patient_blood_group_id";
    }
    public String getFPatientPId() {
        return "patient_pid";
    }
    public String getFPassportNo() {
        return "passport_no";
    }
    public String getFFPatientMarriageStatusId() {
        return "f_patient_marriage_status_id";
    }
    public String getFFPatientChangwat() {
        return "patient_changwat";
    }
    public String getFFPatientNationId() {
        return "f_patient_nation_id";
    }
    public String getFAsthma() {
        return "asthma";
    }
    public String getFHypertension() {
        return "hypertension";
    }
    public String getFHemoptysis() {
        return "hemoptysis";
    }
    public String getFHeartDiseases() {
        return "heart_diseases";
    }
    public String getFDiabetesMellitus() {
        return "diabetes_mellitus";
    }
    public String getFJaundice() {
        return "jaundice";
    }
    public String getFEpilepsy() {
        return "epilepsy";
    }
    public String getFVeneralDiseases() {
        return "veneral_diseases";
    }
    public String getFAcquiredImmune() {
        return "acquired_immune";
    }
    public String getFEdema() {
        return "edema";
    }
    public String getFYaws() {
        return "yaws";
    }
    public String getFOtorrhea() {
        return "otorrhea";
    }
    public String getFHernia() {
        return "hernia";
    }
    public String getFHemorrhoid() {
        return "hemorrhoid";
    }
    public String getFAccident() {
        return "accident";
    }
    public String getFFractures() {
        return "fractures";
    }
    public String getFSurgicalOperation() {
        return "surgical_operation";
    }
    public String getFMalaria() {
        return "malaria";
    }
    public String getFHeight() {
        return "height";
    }
    public String getFWidth() {
        return "width";
    }
    public String getFBloodPressure() {
        return "blood_pressure";
    }
    public String getFPulse() {
        return "pulse";
    }
    public String getFEyeRight() {
        return "eye_right";
    }
    public String getFEyeLeft() {
        return "eye_left";
    }
    public String getFGlasses() {
        return "glasses";
    }
    public String getFColorBlindness() {
        return "color_blindness";
    }
    public String getFGeneralAppearance() {
        return "general_appearance";
    }
    public String getFSkinScalp() {
        return "skin_scalp";
    }
    public String getFLymphNodes() {
        return "lymph_nodes";
    }
    public String getFEyes() {
        return "eyes";
    }
    public String getFEars() {
        return "ears";
    }
    public String getFNose() {
        return "nose";
    }
    public String getFPharynxTonsils() {
        return "pharynx_tonsils";
    }
    public String getFThyroidGland() {
        return "thyroid_gland";
    }
    public String getFLungs() {
        return "lungs";
    }
    public String getFHeart() {
        return "heart";
    }
    public String getFAdditionComments() {
        return "addition_comments";
    }
    public String getFAbdomen() {
        return "abdomen";
    }
    public String getFLiver() {
        return "liver";
    }
    public String getFSpleen() {
        return "spleen";
    }
    public String getFExtenalGenitalia() {
        return "extenal_genitalia";
    }
    public String getFRectalExam() {
        return "rectal_exam";
    }
    public String getFVertebrae() {
        return "vertebrae";
    }
    public String getFLocomotor() {
        return "locomotor";
    }
    public String getFReflexes() {
        return "reflexes";
    }
    public String getFMentalHealthStatus() {
        return "mental_health_status";
    }
    public String getFOther() {
        return "other";
    }
    public String getFHemoglobin() {
        return "hemoglobin";
    }
    public String getFDifferentiaPmn() {
        return "differentia_pmn";
    }
    public String getFDifferentiaBaso() {
        return "differentia_baso";
    }
    public String getFWhiteBloodCell() {
        return "white_blood_cell";
    }
    public String getFHematocrit() {
        return "hematocrit";
    }
    public String getFDifferentialLymp() {
        return "differential_lymp";
    }
    public String getFDifferentialBand() {
        return "differential_band";
    }
    public String getFDifferentialBlast() {
        return "differential_blast";
    }
    public String getFDifferentialMono() {
        return "differential_mono";
    }
    public String getFDifferentialEos() {
        return "differential_eos";
    }
    public String getFHivGpa() {
        return "hiv_gpa";
    }
    public String getFHivElisa() {
        return "hiv_elisa";
    }
    public String getFHivWesternBlot() {
        return "hiv_western_blot";
    }
    public String getFHepatitis() {
        return "hepatitis";
    }
    public String getFHepatitisVdrl() {
        return "hepatitis_vdrl";
    }
    public String getFHepatitisRpr() {
        return "hepatitis_rpr";
    }
    public String getFHepatitisTpha() {
        return "hepatitis_tpha";
    }
    public String getFBloodFilm() {
        return "blood_film";
    }
    public String getFBloodFilmComment() {
        return "blood_film_comment";
    }
    public String getFUriColor() {
        return "uri_color";
    }
    public String getFUriSp() {
        return "uri_sp";
    }
    public String getFUriPh() {
        return "uri_ph";
    }
    public String getFUriSugar() {
        return "uri_sugar";
    }
    public String getFAlbumin() {
        return "albumin";
    }
    public String getFBlood() {
        return "blood";
    }
    public String getFKetone() {
        return "ketone";
    }
    public String getFBile() {
        return "bile";
    }
    public String getFMicroWbc() {
        return "micro_wbc";
    }
    public String getFRbc() {
        return "rbc";
    }
    public String getFCasts() {
        return "casts";
    }
    public String getFEpithelalCell() {
        return "epithelal_cell";
    }
    public String getFEpithelalOther() {
        return "epithelal_other";
    }
    public String getFUrine() {
        return "urine";
    }
    public String getFStool() {
        return "stool";
    }
    public String getFChestXRay() {
        return "chest_x_ray";
    }
    public String getFOtherExaminations() {
        return "other_examinations";
    }
    public String getFAntiHcv() {
        return "anti_hcv";
    }
    public String getFConclusion() {
        return "conclusion";
    }
    public String getFDoctorId() {
        return "doctor_id";
    }
    public String getFDoctorFullnameT() {
        return "doctor_fullnamet";
    }
    public String getFDoctorFullnameE() {
        return "doctor_fullnamee";
    }
    public String getFBranchId() {
        return "branch_id";
    }
    public String getFFemaleLMP() {
        return "female_lmp";
    }
    public String getFMedicalExplain() {
        return "medical_explain";
    }
    public String getFOtoscopicExam() {
        return "otoscopic_exam";
    }
    public String getFOtherDescrption() {
        return "other_description";
    }
    public String getFHiv() {
        return "hiv";
    }
    public String getFHepatitisType() {
        return "hepatitis_type";
    }
    public String getFCheckupTime() {
        return "checkup_time";
    }

    public DoctorTCheckup(String checkupId) {
        this.checkupId = checkupId;
    }

    public String getCheckupId() {
        return checkupId;
    }

    public void setCheckupId(String checkupId) {
        this.checkupId = checkupId;
    }

    public String getCheckupDate() {
        return checkupDate;
    }

    public void setCheckupDate(String checkupDate) {
        this.checkupDate = checkupDate;
    }

    public String getFPatientPrefixId() {
        return fPatientPrefixId;
    }

    public void setFPatientPrefixId(String fPatientPrefixId) {
        this.fPatientPrefixId = fPatientPrefixId;
    }

    public String getPatientFirstnamet() {
        return patientFirstnamet;
    }

    public void setPatientFirstnamet(String patientFirstnamet) {
        this.patientFirstnamet = patientFirstnamet;
    }

    public String getPatientLastnamet() {
        return patientLastnamet;
    }

    public void setPatientLastnamet(String patientLastnamet) {
        this.patientLastnamet = patientLastnamet;
    }

    public String getPatientHn() {
        return patientHn;
    }

    public void setPatientHn(String patientHn) {
        this.patientHn = patientHn;
    }

    public String getFSexId() {
        return fSexId;
    }

    public void setFSexId(String fSexId) {
        this.fSexId = fSexId;
    }

    public String getPatientBirthday() {
        return patientBirthday;
    }

    public void setPatientBirthday(String patientBirthday) {
        this.patientBirthday = patientBirthday;
    }

    public String getFPatientPrefixNamee() {
        return fPatientPrefixNamee;
    }

    public void setFPatientPrefixNamee(String fPatientPrefixNamee) {
        this.fPatientPrefixNamee = fPatientPrefixNamee;
    }

    public String getPatientFirstnamee() {
        return patientFirstnamee;
    }

    public void setPatientFirstnamee(String patientFirstnamee) {
        this.patientFirstnamee = patientFirstnamee;
    }

    public String getPatientLastnamee() {
        return patientLastnamee;
    }

    public void setPatientLastnamee(String patientLastnamee) {
        this.patientLastnamee = patientLastnamee;
    }

    public String getCheckupActive() {
        return checkupActive;
    }

    public void setCheckupActive(String checkupActive) {
        this.checkupActive = checkupActive;
    }

    public String getPatientAge() {
        return patientAge;
    }

    public void setPatientAge(String patientAge) {
        this.patientAge = patientAge;
    }

    public String getFPatientBloodGroupId() {
        return fPatientBloodGroupId;
    }

    public void setFPatientBloodGroupId(String fPatientBloodGroupId) {
        this.fPatientBloodGroupId = fPatientBloodGroupId;
    }

    public String getPatientPid() {
        return patientPid;
    }

    public void setPatientPid(String patientPid) {
        this.patientPid = patientPid;
    }

    public String getPassportNo() {
        return passportNo;
    }
    public void setPassportNo(String passportNo) {
        this.passportNo = passportNo;
    }

    public String getFPatientMarriageStatusId() {
        return fPatientMarriageStatusId;
    }
    public void setFPatientMarriageStatusId(String fPatientMarriageStatusId) {
        this.fPatientMarriageStatusId = fPatientMarriageStatusId;
    }

    public String getPatientChangwat() {
        return patientChangwat;
    }
    public void setPatientChangwat(String patientChangwat) {
        this.patientChangwat = patientChangwat;
    }

    public String getFPatientNationId() {
        return fPatientNationId;
    }
    public void setFPatientNationId(String fPatientNationId) {
        this.fPatientNationId = fPatientNationId;
    }

    public String getAsthma() {
        return asthma;
    }
    public void setAsthma(String asthma) {
        this.asthma = asthma;
    }

    public String getHypertension() {
        return hypertension;
    }
    public void setHypertension(String hypertension) {
        this.hypertension = hypertension;
    }

    public String getHemoptysis() {
        return hemoptysis;
    }
    public void setHemoptysis(String hemoptysis) {
        this.hemoptysis = hemoptysis;
    }

    public String getHeartDiseases() {
        return heartDiseases;
    }
    public void setHeartDiseases(String heartDiseases) {
        this.heartDiseases = heartDiseases;
    }

    public String getDiabetesMellitus() {
        return diabetesMellitus;
    }

    public void setDiabetesMellitus(String diabetesMellitus) {
        this.diabetesMellitus = diabetesMellitus;
    }

    public String getJaundice() {
        return jaundice;
    }

    public void setJaundice(String jaundice) {
        this.jaundice = jaundice;
    }

    public String getEpilepsy() {
        return epilepsy;
    }

    public void setEpilepsy(String epilepsy) {
        this.epilepsy = epilepsy;
    }

    public String getVeneralDiseases() {
        return veneralDiseases;
    }

    public void setVeneralDiseases(String veneralDiseases) {
        this.veneralDiseases = veneralDiseases;
    }

    public String getAcquiredImmune() {
        return acquiredImmune;
    }

    public void setAcquiredImmune(String acquiredImmune) {
        this.acquiredImmune = acquiredImmune;
    }

    public String getEdema() {
        return edema;
    }

    public void setEdema(String edema) {
        this.edema = edema;
    }

    public String getYaws() {
        return yaws;
    }

    public void setYaws(String yaws) {
        this.yaws = yaws;
    }

    public String getOtorrhea() {
        return otorrhea;
    }

    public void setOtorrhea(String otorrhea) {
        this.otorrhea = otorrhea;
    }

    public String getHernia() {
        return hernia;
    }

    public void setHernia(String hernia) {
        this.hernia = hernia;
    }

    public String getHemorrhoid() {
        return hemorrhoid;
    }

    public void setHemorrhoid(String hemorrhoid) {
        this.hemorrhoid = hemorrhoid;
    }

    public String getAccident() {
        return accident;
    }

    public void setAccident(String accident) {
        this.accident = accident;
    }

    public String getFractures() {
        return fractures;
    }

    public void setFractures(String fractures) {
        this.fractures = fractures;
    }

    public String getSurgicalOperation() {
        return surgicalOperation;
    }

    public void setSurgicalOperation(String surgicalOperation) {
        this.surgicalOperation = surgicalOperation;
    }

    public String getMalaria() {
        return malaria;
    }

    public void setMalaria(String malaria) {
        this.malaria = malaria;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getBloodPressure() {
        return bloodPressure;
    }

    public void setBloodPressure(String bloodPressure) {
        this.bloodPressure = bloodPressure;
    }

    public String getPulse() {
        return pulse;
    }

    public void setPulse(String pulse) {
        this.pulse = pulse;
    }

    public String getEyeRight() {
        return eyeRight;
    }

    public void setEyeRight(String eyeRight) {
        this.eyeRight = eyeRight;
    }

    public String getEyeLeft() {
        return eyeLeft;
    }

    public void setEyeLeft(String eyeLeft) {
        this.eyeLeft = eyeLeft;
    }

    public String getGlasses() {
        return glasses;
    }

    public void setGlasses(String glasses) {
        this.glasses = glasses;
    }

    public String getColorBlindness() {
        return colorBlindness;
    }

    public void setColorBlindness(String colorBlindness) {
        this.colorBlindness = colorBlindness;
    }

    public String getGeneralAppearance() {
        return generalAppearance;
    }

    public void setGeneralAppearance(String generalAppearance) {
        this.generalAppearance = generalAppearance;
    }

    public String getSkinScalp() {
        return skinScalp;
    }

    public void setSkinScalp(String skinScalp) {
        this.skinScalp = skinScalp;
    }

    public String getLymphNodes() {
        return lymphNodes;
    }

    public void setLymphNodes(String lymphNodes) {
        this.lymphNodes = lymphNodes;
    }

    public String getEyes() {
        return eyes;
    }

    public void setEyes(String eyes) {
        this.eyes = eyes;
    }

    public String getEars() {
        return ears;
    }

    public void setEars(String ears) {
        this.ears = ears;
    }

    public String getNose() {
        return nose;
    }

    public void setNose(String nose) {
        this.nose = nose;
    }

    public String getPharynxTonsils() {
        return pharynxTonsils;
    }

    public void setPharynxTonsils(String pharynxTonsils) {
        this.pharynxTonsils = pharynxTonsils;
    }

    public String getThyroidGland() {
        return thyroidGland;
    }

    public void setThyroidGland(String thyroidGland) {
        this.thyroidGland = thyroidGland;
    }

    public String getLungs() {
        return lungs;
    }

    public void setLungs(String lungs) {
        this.lungs = lungs;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getAdditionComments() {
        return additionComments;
    }

    public void setAdditionComments(String additionComments) {
        this.additionComments = additionComments;
    }

    public String getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(String abdomen) {
        this.abdomen = abdomen;
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver;
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen;
    }

    public String getExtenalGenitalia() {
        return extenalGenitalia;
    }

    public void setExtenalGenitalia(String extenalGenitalia) {
        this.extenalGenitalia = extenalGenitalia;
    }

    public String getRectalExam() {
        return rectalExam;
    }
    public void setRectalExam(String rectalExam) {
        this.rectalExam = rectalExam;
    }

    public String getVertebrae() {
        return vertebrae;
    }
    public void setVertebrae(String vertebrae) {
        this.vertebrae = vertebrae;
    }

    public String getLocomotor() {
        return locomotor;
    }
    public void setLocomotor(String locomotor) {
        this.locomotor = locomotor;
    }

    public String getReflexes() {
        return reflexes;
    }
    public void setReflexes(String reflexes) {
        this.reflexes = reflexes;
    }

    public String getMentalHealthStatus() {
        return mentalHealthStatus;
    }
    public void setMentalHealthStatus(String mentalHealthStatus) {
        this.mentalHealthStatus = mentalHealthStatus;
    }

    public String getOther() {
        return other;
    }
    public void setOther(String other) {
        this.other = other;
    }

    public String getHemoglobin() {
        return hemoglobin;
    }
    public void setHemoglobin(String hemoglobin) {
        this.hemoglobin = hemoglobin;
    }

    public String getDifferentiaPmn() {
        return differentiaPmn;
    }
    public void setDifferentiaPmn(String differentiaPmn) {
        this.differentiaPmn = differentiaPmn;
    }

    public String getDifferentiaBaso() {
        return differentiaBaso;
    }
    public void setDifferentiaBaso(String differentiaBaso) {
        this.differentiaBaso = differentiaBaso;
    }

    public String getWhiteBloodCell() {
        return whiteBloodCell;
    }
    public void setWhiteBloodCell(String whiteBloodCell) {
        this.whiteBloodCell = whiteBloodCell;
    }

    public String getHematocrit() {
        return hematocrit;
    }
    public void setHematocrit(String hematocrit) {
        this.hematocrit = hematocrit;
    }

    public String getDifferentialLymp() {
        return differentialLymp;
    }
    public void setDifferentialLymp(String differentialLymp) {
        this.differentialLymp = differentialLymp;
    }

    public String getDifferentialBand() {
        return differentialBand;
    }
    public void setDifferentialBand(String differentialBand) {
        this.differentialBand = differentialBand;
    }

    public String getDifferentialBlast() {
        return differentialBlast;
    }
    public void setDifferentialBlast(String differentialBlast) {
        this.differentialBlast = differentialBlast;
    }

    public String getDifferentialMono() {
        return differentialMono;
    }
    public void setDifferentialMono(String differentialMono) {
        this.differentialMono = differentialMono;
    }

    public String getDifferentialEos() {
        return differentialEos;
    }
    public void setDifferentialEos(String differentialEos) {
        this.differentialEos = differentialEos;
    }

    public String getHivGpa() {
        return hivGpa;
    }
    public void setHivGpa(String hivGpa) {
        this.hivGpa = hivGpa;
    }

    public String getHivElisa() {
        return hivElisa;
    }
    public void setHivElisa(String hivElisa) {
        this.hivElisa = hivElisa;
    }

    public String getHivWesternBlot() {
        return hivWesternBlot;
    }
    public void setHivWesternBlot(String hivWesternBlot) {
        this.hivWesternBlot = hivWesternBlot;
    }

    public String getHepatitis() {
        return hepatitis;
    }
    public void setHepatitis(String hepatitis) {
        this.hepatitis = hepatitis;
    }

    public String getHepatitisVdrl() {
        return hepatitisVdrl;
    }
    public void setHepatitisVdrl(String hepatitisVdrl) {
        this.hepatitisVdrl = hepatitisVdrl;
    }

    public String getHepatitisRpr() {
        return hepatitisRpr;
    }
    public void setHepatitisRpr(String hepatitisRpr) {
        this.hepatitisRpr = hepatitisRpr;
    }

    public String getHepatitisTpha() {
        return hepatitisTpha;
    }
    public void setHepatitisTpha(String hepatitisTpha) {
        this.hepatitisTpha = hepatitisTpha;
    }

    public String getBloodFilm() {
        return bloodFilm;
    }
    public void setBloodFilm(String bloodFilm) {
        this.bloodFilm = bloodFilm;
    }

    public String getBloodFilmComment() {
        return bloodFilmComment;
    }
    public void setBloodFilmComment(String bloodFilmComment) {
        this.bloodFilmComment = bloodFilmComment;
    }

    public String getUriColor() {
        return uriColor;
    }
    public void setUriColor(String uriColor) {
        this.uriColor = uriColor;
    }

    public String getUriSp() {
        return uriSp;
    }
    public void setUriSp(String uriSp) {
        this.uriSp = uriSp;
    }

    public String getUriPh() {
        return uriPh;
    }
    public void setUriPh(String uriPh) {
        this.uriPh = uriPh;
    }

    public String getUriSugar() {
        return uriSugar;
    }

    public void setUriSugar(String uriSugar) {
        this.uriSugar = uriSugar;
    }

    public String getAlbumin() {
        return albumin;
    }

    public void setAlbumin(String albumin) {
        this.albumin = albumin;
    }

    public String getBlood() {
        return blood;
    }

    public void setBlood(String blood) {
        this.blood = blood;
    }

    public String getKetone() {
        return ketone;
    }
    public void setKetone(String ketone) {
        this.ketone = ketone;
    }

    public String getBile() {
        return bile;
    }
    public void setBile(String bile) {
        this.bile = bile;
    }

    public String getMicroWbc() {
        return microWbc;
    }
    public void setMicroWbc(String microWbc) {
        this.microWbc = microWbc;
    }

    public String getRbc() {
        return rbc;
    }
    public void setRbc(String rbc) {
        this.rbc = rbc;
    }

    public String getCasts() {
        return casts;
    }
    public void setCasts(String casts) {
        this.casts = casts;
    }

    public String getEpithelalCell() {
        return epithelalCell;
    }
    public void setEpithelalCell(String epithelalCell) {
        this.epithelalCell = epithelalCell;
    }

    public String getEpithelalOther() {
        return epithelalOther;
    }
    public void setEpithelalOther(String epithelalOther) {
        this.epithelalOther = epithelalOther;
    }

    public String getUrine() {
        return urine;
    }
    public void setUrine(String urine) {
        this.urine = urine;
    }

    public String getStool() {
        return stool;
    }
    public void setStool(String stool) {
        this.stool = stool;
    }

    public String getChestXRay() {
        return chestXRay;
    }
    public void setChestXRay(String chestXRay) {
        this.chestXRay = chestXRay;
    }

    public String getOtherExaminations() {
        return otherExaminations;
    }
    public void setOtherExaminations(String otherExaminations) {
        this.otherExaminations = otherExaminations;
    }

    public String getAntiHcv() {
        return antiHcv;
    }
    public void setAntiHcv(String antiHcv) {
        this.antiHcv = antiHcv;
    }

    public String getConclusion() {
        return conclusion;
    }
    public void setConclusion(String conclusion) {
        this.conclusion = conclusion;
    }

    public String getDoctorId() {
        return doctorId;
    }
    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorFullnameT() {
        return doctorFullnamet;
    }
    public void setDoctorFullnameT(String doctorFullnamet) {
        this.doctorFullnamet = doctorFullnamet;
    }

    public String getDoctorFullnameE() {
        return doctorFullnamee;
    }
    public void setDoctorFullnameE(String doctorFullnamee) {
        this.doctorFullnamee = doctorFullnamee;
    }

    public String getBranchId() {
        return branchId;
    }
    public void setBranchId(String branchId) {
        this.branchId = branchId;
    }

    public String getFemaleLMP() {
        return femaleLmp;
    }
    public void setFemaleLMP(String femaleLmp) {
        this.femaleLmp = femaleLmp;
    }

    public String getMedicalExplain() {
        return medicalExplain;
    }
    public void setMedicalExplain(String medicalExplain) {
        this.medicalExplain = medicalExplain;
    }

    public String getOtoscopicExam() {
        return otoscopicExam;
    }
    public void setOtoscopicExam(String otoscopicExam) {
        this.otoscopicExam = otoscopicExam;
    }

    public String getOtherDescription() {
        return otherDescription;
    }
    public void setOtherDescription(String otherDescription) {
        this.otherDescription = otherDescription;
    }

    public String getHiv() {
        return hiv;
    }
    public void setHiv(String hiv) {
        this.hiv = hiv;
    }

    public String getHepatitisType() {
        return hepatitisType;
    }
    public void setHepatitisType(String hepatitisType) {
        this.hepatitisType = hepatitisType;
    }

    public String getCheckupTime() {
        return checkupTime;
    }
    public void setCheckupTime(String checkupTime) {
        this.checkupTime = checkupTime;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (checkupId != null ? checkupId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DoctorTCheckup)) {
            return false;
        }
        DoctorTCheckup other = (DoctorTCheckup) object;
        if ((this.checkupId == null && other.checkupId != null) || (this.checkupId != null && !this.checkupId.equals(other.checkupId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "bangnaintranet.DoctorTCheckup[checkupId=" + checkupId + "]";
    }

}
