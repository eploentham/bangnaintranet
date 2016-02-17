<%-- 
    Document   : doctor_checkup_form_save
    Created on : 25 Ê.¤. 2552, 19:24:38
    Author     : pop
--%>

<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
DoctorTCheckup checkup = new DoctorTCheckup();
DoctorTCheckupDB checkupdb = new DoctorTCheckupDB();
String text="",flag_redirect="",flag="", branch_id="",checkup_date="",patient_age="",patient_pid="";
String checkup_id="",hn_no="",f_patient_prefix_id="",patient_firstnamet="",f_patient_nation_id="";
String passport_no="",patient_changwat="",f_patient_blood_group_id="",f_patient_marriage_status_id="";
String patient_firstnamee="",patient_lastnamee="",patient_birthday="",f_sex_id="",asthma="",edema="";
String hypertension="",yaws="",hemoptysis="",otorrhea="",heart_diseases="",hernia="",diabetes_mellitus="";
String hemorrhoid="",jaundice="",accident="",epilepsy="",fractures="",veneral_diseases="",surgical_operation="";
String acquired_immune_deficiency_syndrome="", malaria="", female_lmp="", medical_explain="", height="";
String width="", blood_pressure="", pulse="", eye_right="", eye_left="", glasses="", color_blindness="";
String general_appearance="", skin_scalp="", lymph_nodes="", abdomen="", liver="", spleens="";
String eyes="", ears="", otoscopic_exam="", extenal_genitalia="", rectal_exam="", nose="", pharynx_tonsils="";
String thyroid_gland="", vertebrae="", locomotor="", reflexes="", lungs="", heart="", mental_health_status="";
String other_description="", other="", additional_comments="", hemoglobin="", white_blood_cell="", hematocrit="";
String differential_pmn="", differential_lymp="", differential_mono="", differential_eos="", differential_baso="";
String differential_band="", differential_blast="", hiv="", hiv_gpa="", hiv_elisa="", hiv_western_blot="";
String hepatitis="", hepatitis_type="", hepatitis_vdrl="", hepatitis_rpr="", hepatitis_tpha="", blood_film="";
String blood_film_comment="", uri_color="", uri_sp="", uri_ph="", uri_sugar="", albumin="", blood="";
String ketone="", bile="", micro_wbc="", rbc="", casts="", epithelal_cell="", urine="", stool="", chest_x_ray="";
String anti_hcv="", conclusion="", doctor_id="", doctor_fullnamee="",checkup_active="",epithelal_other="",patient_lastnamet="";
Integer row=0;
try{

    if(request.getParameter("flag_redirect")!=null){
        flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
        }
    else{
        flag_redirect = "";
        }
    if(request.getParameter("flag")!=null){
        flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
        flag = flag.trim();
        }
    else{
        flag = "";
        }
    if(request.getParameter("txt_checkup_id")!=null){
        checkup_id = new String (request.getParameter("txt_checkup_id").getBytes("ISO8859_1"),"TIS-620");
        checkup_id = checkup_id.trim();
        }
    else{
        checkup_id = "";
        }
    checkup.setCheckupId(checkup_id);
    if(request.getParameter("txt_checkup_active")!=null){
        checkup_active = new String (request.getParameter("txt_checkup_active").getBytes("ISO8859_1"),"TIS-620");
        checkup_active = checkup_active.trim();
        }
    else{
        checkup_active = "";
        }
    if(checkup_active.equals("")){
        checkup_active="1";
        }
    checkup.setCheckupActive(checkup_active);
    if(request.getParameter("cbo_branch")!=null){
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
        branch_id = branch_id.trim();
        }
    else{
        branch_id = "";
        }
    checkup.setBranchId(branch_id);
    if(request.getParameter("txt_checkup_date")!=null){
        checkup_date = new String (request.getParameter("txt_checkup_date").getBytes("ISO8859_1"),"TIS-620");
        checkup_date = checkup_date.trim();
        }
    else{
        checkup_date = "";
        }
    checkup.setCheckupDate(checkup_date);
    if(request.getParameter("txt_hn_no")!=null){
        hn_no = new String (request.getParameter("txt_hn_no").getBytes("ISO8859_1"),"TIS-620");
        hn_no = hn_no.trim();
        }
    else{
        hn_no = "";
        }
    checkup.setPatientHn(hn_no);
    if(request.getParameter("cbo_f_patient_prefix_id")!=null) {
        f_patient_prefix_id = new String (request.getParameter("cbo_f_patient_prefix_id").getBytes("ISO8859_1"),"TIS-620");
        f_patient_prefix_id = f_patient_prefix_id.trim();
        }
    else{
        f_patient_prefix_id = "";
        }
    checkup.setFPatientPrefixId(f_patient_prefix_id);
    if(request.getParameter("txt_patient_firstnamet")!=null) {
        patient_firstnamet = new String (request.getParameter("txt_patient_firstnamet").getBytes("ISO8859_1"),"TIS-620");
        patient_firstnamet = patient_firstnamet.trim();
        }
    else{
        patient_firstnamet = "";
        }
    checkup.setPatientFirstnamet(patient_firstnamet);
    if(request.getParameter("txt_patient_lastnamet")!=null) {
        patient_lastnamet = new String (request.getParameter("txt_patient_lastnamet").getBytes("ISO8859_1"),"TIS-620");
        patient_lastnamet = patient_lastnamet.trim();
        }
    else{
        patient_lastnamet = "";
        }
    checkup.setPatientLastnamet(patient_lastnamet);
    if(request.getParameter("txt_patient_age")!=null){
        patient_age = new String (request.getParameter("txt_patient_age").getBytes("ISO8859_1"),"TIS-620");
        patient_age = patient_age.trim();
        }
    else{
        patient_age = "";
        }
    checkup.setPatientAge(patient_age);
    if(request.getParameter("cbo_f_patient_nation_id")!=null){
        f_patient_nation_id = new String (request.getParameter("cbo_f_patient_nation_id").getBytes("ISO8859_1"),"TIS-620");
        f_patient_nation_id = f_patient_nation_id.trim();
        }
    else{
        f_patient_nation_id = "";
        }
    checkup.setFPatientNationId(f_patient_nation_id);
    if(request.getParameter("txt_patient_pid")!=null){
        patient_pid = new String (request.getParameter("txt_patient_pid").getBytes("ISO8859_1"),"TIS-620");
        patient_pid = patient_pid.trim();
        }
    else{
        patient_pid = "";
        }
    checkup.setPatientPid(patient_pid);
    if(request.getParameter("txt_passport_no")!=null){
        passport_no = new String (request.getParameter("txt_passport_no").getBytes("ISO8859_1"),"TIS-620");
        passport_no = passport_no.trim();
        }
    else{
        passport_no = "";
        }
    checkup.setPassportNo(passport_no);
    if(request.getParameter("cbo_patient_changwat")!=null){
        patient_changwat = new String (request.getParameter("cbo_patient_changwat").getBytes("ISO8859_1"),"TIS-620");
        patient_changwat = patient_changwat.trim();
        }
    else{
        patient_changwat = "";
        }
    checkup.setPatientChangwat(patient_changwat);
    if(request.getParameter("cbo_f_patient_blood_group_id")!=null){
        f_patient_blood_group_id = new String (request.getParameter("cbo_f_patient_blood_group_id").getBytes("ISO8859_1"),"TIS-620");
        f_patient_blood_group_id = f_patient_blood_group_id.trim();
        }
    else{
        f_patient_blood_group_id = "";
        }
    checkup.setFPatientBloodGroupId(f_patient_blood_group_id);
    if(request.getParameter("cbo_f_patient_blood_group_id")!=null){
        f_patient_blood_group_id = new String (request.getParameter("cbo_f_patient_blood_group_id").getBytes("ISO8859_1"),"TIS-620");
        f_patient_blood_group_id = f_patient_blood_group_id.trim();
        }
    else{
        f_patient_blood_group_id = "";
        }
    checkup.setFPatientBloodGroupId(f_patient_blood_group_id);
    if(request.getParameter("cbo_f_patient_marriage_status_id")!=null){
        f_patient_marriage_status_id = new String (request.getParameter("cbo_f_patient_marriage_status_id").getBytes("ISO8859_1"),"TIS-620");
        f_patient_marriage_status_id = f_patient_marriage_status_id.trim();
        }
    else{
        f_patient_marriage_status_id = "";
        }
    checkup.setFPatientMarriageStatusId(f_patient_marriage_status_id);
    if(request.getParameter("txt_patient_firstnamee")!=null){
        patient_firstnamee = new String (request.getParameter("txt_patient_firstnamee").getBytes("ISO8859_1"),"TIS-620");
        patient_firstnamee = patient_firstnamee.trim();
        }
    else{
        patient_firstnamee = "";
        }
    checkup.setPatientFirstnamee(patient_firstnamee);
    if(request.getParameter("txt_patient_lastnamee")!=null){
        patient_lastnamee = new String (request.getParameter("txt_patient_lastnamee").getBytes("ISO8859_1"),"TIS-620");
        patient_lastnamee = patient_lastnamee.trim();
        }
    else{
        patient_lastnamee = "";
        }
    checkup.setPatientLastnamee(patient_lastnamee);
    if(request.getParameter("txt_patient_birthday")!=null){
        patient_birthday = new String (request.getParameter("txt_patient_birthday").getBytes("ISO8859_1"),"TIS-620");
        patient_birthday = patient_birthday.trim();
        }
    else{
        patient_birthday = "";
        }
    patient_birthday = config1.DateFormatShow2DB(patient_birthday, "ddMMyyyy");
    checkup.setPatientBirthday(patient_birthday);
    if(request.getParameter("cbo_f_sex_id")!=null){
        f_sex_id = new String (request.getParameter("cbo_f_sex_id").getBytes("ISO8859_1"),"TIS-620");
        f_sex_id = f_sex_id.trim();
        }
    else{
        f_sex_id = "";
        }
    checkup.setFSexId(f_sex_id);
    if(request.getParameter("chk_asthma")!=null){
        asthma = new String (request.getParameter("chk_asthma").getBytes("ISO8859_1"),"TIS-620");
        asthma = asthma.trim();
        }
    else{
        asthma = "";
        }
    checkup.setAsthma(asthma);
    if(request.getParameter("chk_edema")!=null){
        edema = new String (request.getParameter("chk_edema").getBytes("ISO8859_1"),"TIS-620");
        edema = edema.trim();
        }
    else{
        edema = "";
        }
    checkup.setEdema(edema);
    if(request.getParameter("chk_hypertension")!=null){
        hypertension = new String (request.getParameter("chk_hypertension").getBytes("ISO8859_1"),"TIS-620");
        hypertension = hypertension.trim();
        }
    else{
        hypertension = "";
        }
    checkup.setHypertension(hypertension);
    if(request.getParameter("chk_yaws")!=null){
        yaws = new String (request.getParameter("chk_yaws").getBytes("ISO8859_1"),"TIS-620");
        yaws = yaws.trim();
        }
    else{
        yaws = "";
        }
    checkup.setYaws(yaws);
    if(request.getParameter("chk_hemoptysis")!=null){
        hemoptysis = new String (request.getParameter("chk_hemoptysis").getBytes("ISO8859_1"),"TIS-620");
        hemoptysis = hemoptysis.trim();
        }
    else{
        hemoptysis = "";
        }
    checkup.setHemoptysis(hemoptysis);
    if(request.getParameter("chk_otorrhea")!=null){
        otorrhea = new String (request.getParameter("chk_otorrhea").getBytes("ISO8859_1"),"TIS-620");
        otorrhea = otorrhea.trim();
        }
    else{
        otorrhea = "";
        }
    checkup.setOtorrhea(otorrhea);
    if(request.getParameter("chk_heart_diseases")!=null){
        heart_diseases = new String (request.getParameter("chk_heart_diseases").getBytes("ISO8859_1"),"TIS-620");
        heart_diseases = heart_diseases.trim();
        }
    else{
        heart_diseases = "";
        }
    checkup.setHeartDiseases(heart_diseases);
    if(request.getParameter("chk_hernia")!=null){
        hernia = new String (request.getParameter("chk_hernia").getBytes("ISO8859_1"),"TIS-620");
        hernia = hernia.trim();
        }
    else{
        hernia = "";
        }
    checkup.setHernia(hernia);
    if(request.getParameter("chk_diabetes_mellitus")!=null){
        diabetes_mellitus = new String (request.getParameter("chk_diabetes_mellitus").getBytes("ISO8859_1"),"TIS-620");
        diabetes_mellitus = diabetes_mellitus.trim();
        }
    else{
        diabetes_mellitus = "";
        }
    checkup.setDiabetesMellitus(diabetes_mellitus);
    if(request.getParameter("chk_hemorrhoid")!=null){
        hemorrhoid = new String (request.getParameter("chk_hemorrhoid").getBytes("ISO8859_1"),"TIS-620");
        hemorrhoid = hemorrhoid.trim();
        }
    else{
        hemorrhoid = "";
        }
    checkup.setHemorrhoid(hemorrhoid);
    if(request.getParameter("chk_jaundice")!=null){
        jaundice = new String (request.getParameter("chk_jaundice").getBytes("ISO8859_1"),"TIS-620");
        jaundice = jaundice.trim();
        }
    else{
        jaundice = "";
        }
    checkup.setJaundice(jaundice);
    if(request.getParameter("chk_accident")!=null){
        accident = new String (request.getParameter("chk_accident").getBytes("ISO8859_1"),"TIS-620");
        accident = accident.trim();
        }
    else{
        accident = "";
        }
    checkup.setAccident(accident);
    if(request.getParameter("chk_epilepsy")!=null){
        epilepsy = new String (request.getParameter("chk_epilepsy").getBytes("ISO8859_1"),"TIS-620");
        epilepsy = epilepsy.trim();
        }
    else{
        epilepsy = "";
        }
    checkup.setEpilepsy(epilepsy);
    if(request.getParameter("chk_fractures")!=null){
        fractures = new String (request.getParameter("chk_fractures").getBytes("ISO8859_1"),"TIS-620");
        fractures = fractures.trim();
        }
    else{
        fractures = "";
        }
    checkup.setFractures(fractures);
    if(request.getParameter("chk_veneral_diseases")!=null){
        veneral_diseases = new String (request.getParameter("chk_veneral_diseases").getBytes("ISO8859_1"),"TIS-620");
        veneral_diseases = veneral_diseases.trim();
        }
    else{
        veneral_diseases = "";
        }
    checkup.setVeneralDiseases(veneral_diseases);
    if(request.getParameter("chk_surgical_operation")!=null){
        surgical_operation = new String (request.getParameter("chk_surgical_operation").getBytes("ISO8859_1"),"TIS-620");
        surgical_operation = surgical_operation.trim();
        }
    else{
        surgical_operation = "";
        }
    checkup.setSurgicalOperation(surgical_operation);
    if(request.getParameter("chk_acquired_immune_deficiency_syndrome")!=null){
        acquired_immune_deficiency_syndrome = new String (request.getParameter("chk_acquired_immune_deficiency_syndrome").getBytes("ISO8859_1"),"TIS-620");
        acquired_immune_deficiency_syndrome = acquired_immune_deficiency_syndrome.trim();
        }
    else{
        acquired_immune_deficiency_syndrome = "";
        }
    checkup.setAcquiredImmune(acquired_immune_deficiency_syndrome);
    if(request.getParameter("chk_malaria")!=null){
        malaria = new String (request.getParameter("chk_malaria").getBytes("ISO8859_1"),"TIS-620");
        malaria = malaria.trim();
        }
    else{
        malaria = "";
        }
    checkup.setMalaria(malaria);
    if(request.getParameter("txt_female_lmp")!=null){
        female_lmp = new String (request.getParameter("txt_female_lmp").getBytes("ISO8859_1"),"TIS-620");
        female_lmp = female_lmp.trim();
        }
    else{
        female_lmp = "";
        }
    checkup.setFemaleLMP(female_lmp);
    if(request.getParameter("txt_medical_explain")!=null){
        medical_explain = new String (request.getParameter("txt_medical_explain").getBytes("ISO8859_1"),"TIS-620");
        medical_explain = medical_explain.trim();
        }
    else{
        medical_explain = "";
        }
    checkup.setMedicalExplain(medical_explain);
    if(request.getParameter("txt_height")!=null){
        height = new String (request.getParameter("txt_height").getBytes("ISO8859_1"),"TIS-620");
        height = height.trim();
        }
    else{
        height = "";
        }
    checkup.setHeight(height);
    if(request.getParameter("txt_width")!=null){
        width = new String (request.getParameter("txt_width").getBytes("ISO8859_1"),"TIS-620");
        width = width.trim();
        }
    else{
        width = "";
        }
    checkup.setWidth(width);
    if(request.getParameter("txt_blood_pressure")!=null){
        blood_pressure = new String (request.getParameter("txt_blood_pressure").getBytes("ISO8859_1"),"TIS-620");
        blood_pressure = blood_pressure.trim();
        }
    else{
        blood_pressure = "";
        }
    checkup.setBloodPressure(blood_pressure);
    if(request.getParameter("txt_pulse")!=null){
        pulse = new String (request.getParameter("txt_pulse").getBytes("ISO8859_1"),"TIS-620");
        pulse = pulse.trim();
        }
    else{
        pulse = "";
        }
    checkup.setPulse(pulse);
    if(request.getParameter("txt_eye_right")!=null){
        eye_right = new String (request.getParameter("txt_eye_right").getBytes("ISO8859_1"),"TIS-620");
        eye_right = eye_right.trim();
        }
    else{
        eye_right = "";
        }
    checkup.setEyeRight(eye_right);
    if(request.getParameter("txt_eye_left")!=null){
        eye_left = new String (request.getParameter("txt_eye_left").getBytes("ISO8859_1"),"TIS-620");
        eye_left = eye_left.trim();
        }
    else{
        eye_left = "";
        }
    checkup.setEyeLeft(eye_left);
    if(request.getParameter("chk_glasses")!=null){
        glasses = new String (request.getParameter("chk_glasses").getBytes("ISO8859_1"),"TIS-620");
        glasses = glasses.trim();
        }
    else{
        glasses = "";
        }
    checkup.setGlasses(glasses);
    if(request.getParameter("chk_color_blindness")!=null){
        color_blindness = new String (request.getParameter("chk_color_blindness").getBytes("ISO8859_1"),"TIS-620");
        color_blindness = color_blindness.trim();
        }
    else{
        color_blindness = "";
        }
    checkup.setColorBlindness(color_blindness);
    if(request.getParameter("chk_general_appearance")!=null){
        general_appearance = new String (request.getParameter("chk_general_appearance").getBytes("ISO8859_1"),"TIS-620");
        general_appearance = general_appearance.trim();
        }
    else{
        general_appearance = "";
        }
    checkup.setGeneralAppearance(general_appearance);
    if(request.getParameter("chk_skin_scalp")!=null){
        skin_scalp = new String (request.getParameter("chk_skin_scalp").getBytes("ISO8859_1"),"TIS-620");
        skin_scalp = skin_scalp.trim();
        }
    else{
        skin_scalp = "";
        }
    checkup.setSkinScalp(skin_scalp);
    if(request.getParameter("chk_lymph_nodes")!=null){
        lymph_nodes = new String (request.getParameter("chk_lymph_nodes").getBytes("ISO8859_1"),"TIS-620");
        lymph_nodes = lymph_nodes.trim();
        }
    else{
        lymph_nodes = "";
        }
    checkup.setLymphNodes(lymph_nodes);
    if(request.getParameter("chk_abdomen")!=null){
        abdomen = new String (request.getParameter("chk_abdomen").getBytes("ISO8859_1"),"TIS-620");
        abdomen = abdomen.trim();
        }
    else{
        abdomen = "";
        }
    checkup.setAbdomen(abdomen);
    if(request.getParameter("chk_liver")!=null){
        liver = new String (request.getParameter("chk_liver").getBytes("ISO8859_1"),"TIS-620");
        liver = liver.trim();
        }
    else{
        liver = "";
        }
    checkup.setLiver(liver);
    if(request.getParameter("chk_spleens")!=null){
        spleens = new String (request.getParameter("chk_spleens").getBytes("ISO8859_1"),"TIS-620");
        spleens = spleens.trim();
        }
    else{
        spleens = "";
        }
    checkup.setSpleen(spleens);
    if(request.getParameter("chk_eyes")!=null){
        eyes = new String (request.getParameter("chk_eyes").getBytes("ISO8859_1"),"TIS-620");
        eyes = eyes.trim();
        }
    else{
        eyes = "";
        }
    checkup.setEyes(eyes);
    if(request.getParameter("chk_ears")!=null){
        ears = new String (request.getParameter("chk_ears").getBytes("ISO8859_1"),"TIS-620");
        ears = ears.trim();
        }
    else{
        ears = "";
        }
    checkup.setEars(ears);
    if(request.getParameter("chk_otoscopic_exam")!=null){
        otoscopic_exam = new String (request.getParameter("chk_otoscopic_exam").getBytes("ISO8859_1"),"TIS-620");
        otoscopic_exam = otoscopic_exam.trim();
        }
    else{
        otoscopic_exam = "";
        }
    checkup.setOtoscopicExam(otoscopic_exam);
    if(request.getParameter("chk_extenal_genitalia")!=null){
        extenal_genitalia = new String (request.getParameter("chk_extenal_genitalia").getBytes("ISO8859_1"),"TIS-620");
        extenal_genitalia = extenal_genitalia.trim();
        }
    else{
        extenal_genitalia = "";
        }
    checkup.setExtenalGenitalia(extenal_genitalia);
    if(request.getParameter("chk_rectal_exam")!=null){
        rectal_exam = new String (request.getParameter("chk_rectal_exam").getBytes("ISO8859_1"),"TIS-620");
        rectal_exam = rectal_exam.trim();
        }
    else{
        rectal_exam = "";
        }
    checkup.setRectalExam(rectal_exam);
    if(request.getParameter("chk_nose")!=null){
        nose = new String (request.getParameter("chk_nose").getBytes("ISO8859_1"),"TIS-620");
        nose = nose.trim();
        }
    else{
        nose = "";
        }
    checkup.setNose(nose);
    if(request.getParameter("chk_pharynx_tonsils")!=null){
        pharynx_tonsils = new String (request.getParameter("chk_pharynx_tonsils").getBytes("ISO8859_1"),"TIS-620");
        pharynx_tonsils = pharynx_tonsils.trim();
        }
    else{
        pharynx_tonsils = "";
        }
    checkup.setPharynxTonsils(pharynx_tonsils);
    if(request.getParameter("chk_thyroid_gland")!=null){
        thyroid_gland = new String (request.getParameter("chk_thyroid_gland").getBytes("ISO8859_1"),"TIS-620");
        thyroid_gland = thyroid_gland.trim();
        }
    else{
        thyroid_gland = "";
        }
    checkup.setThyroidGland(thyroid_gland);
    if(request.getParameter("chk_vertebrae")!=null){
        vertebrae = new String (request.getParameter("chk_vertebrae").getBytes("ISO8859_1"),"TIS-620");
        vertebrae = vertebrae.trim();
        }
    else{
        vertebrae = "";
        }
    checkup.setVertebrae(vertebrae);
    if(request.getParameter("chk_locomotor")!=null){
        locomotor = new String (request.getParameter("chk_locomotor").getBytes("ISO8859_1"),"TIS-620");
        locomotor = locomotor.trim();
        }
    else{
        locomotor = "";
        }
    checkup.setLocomotor(locomotor);
    if(request.getParameter("chk_reflexes")!=null){
        reflexes = new String (request.getParameter("chk_reflexes").getBytes("ISO8859_1"),"TIS-620");
        reflexes = reflexes.trim();
        }
    else{
        reflexes = "";
        }
    checkup.setReflexes(reflexes.trim());
    if(request.getParameter("chk_lungs")!=null){
        lungs = new String (request.getParameter("chk_lungs").getBytes("ISO8859_1"),"TIS-620");
        lungs = lungs.trim();
        }
    else{
        lungs = "";
        }
    checkup.setLungs(lungs);
    if(request.getParameter("chk_heart")!=null){
        heart = new String (request.getParameter("chk_heart").getBytes("ISO8859_1"),"TIS-620");
        heart = heart.trim();
        }
    else{
        heart = "";
        }
    checkup.setHeart(heart);
    if(request.getParameter("chk_mental_health_status")!=null){
        mental_health_status = new String (request.getParameter("chk_mental_health_status").getBytes("ISO8859_1"),"TIS-620");
        mental_health_status = mental_health_status.trim();
        }
    else{
        mental_health_status = "";
        }
    checkup.setMentalHealthStatus(mental_health_status);
    if(request.getParameter("txt_other_description")!=null){
        other_description = new String (request.getParameter("txt_other_description").getBytes("ISO8859_1"),"TIS-620");
        other_description = other_description.trim();
        }
    else{
        other_description = "";
        }
    checkup.setOtherDescription(other_description);
    if(request.getParameter("chk_other")!=null){
        other = new String (request.getParameter("chk_other").getBytes("ISO8859_1"),"TIS-620");
        other = other.trim();
        }
    else{
        other = "";
        }
    checkup.setOther(other);
    if(request.getParameter("txt_epithelal_other")!=null){
        epithelal_other = new String (request.getParameter("txt_epithelal_other").getBytes("ISO8859_1"),"TIS-620");
        epithelal_other = epithelal_other.trim();
        }
    else{
        epithelal_other = "";
        }
    checkup.setEpithelalOther(epithelal_other);
    if(request.getParameter("txt_additional_comments")!=null){
        additional_comments = new String (request.getParameter("txt_additional_comments").getBytes("ISO8859_1"),"TIS-620");
        additional_comments = additional_comments.trim();
        }
    else{
        additional_comments = "";
        }
    checkup.setAdditionComments(additional_comments);
    if(request.getParameter("txt_hemoglobin")!=null){
        hemoglobin = new String (request.getParameter("txt_hemoglobin").getBytes("ISO8859_1"),"TIS-620");
        hemoglobin = hemoglobin.trim();
        }
    else{
        hemoglobin = "";
        }
    checkup.setHemoglobin(hemoglobin);
    if(request.getParameter("txt_white_blood_cell")!=null){
        white_blood_cell = new String (request.getParameter("txt_white_blood_cell").getBytes("ISO8859_1"),"TIS-620");
        white_blood_cell = white_blood_cell.trim();
        }
    else{
        white_blood_cell = "";
        }
    checkup.setWhiteBloodCell(white_blood_cell);
    if(request.getParameter("txt_hematocrit")!=null){
        hematocrit = new String (request.getParameter("txt_hematocrit").getBytes("ISO8859_1"),"TIS-620");
        hematocrit = hematocrit.trim();
        }
    else{
        hematocrit = "";
        }
    checkup.setHematocrit(hematocrit);
    if(request.getParameter("txt_differential_pmn")!=null){
        differential_pmn = new String (request.getParameter("txt_differential_pmn").getBytes("ISO8859_1"),"TIS-620");
        differential_pmn = differential_pmn.trim();
        }
    else{
        differential_pmn = "";
        }
    checkup.setDifferentiaPmn(differential_pmn);
    if(request.getParameter("txt_differential_lymp")!=null){
        differential_lymp = new String (request.getParameter("txt_differential_lymp").getBytes("ISO8859_1"),"TIS-620");
        differential_lymp = differential_lymp.trim();
        }
    else{
        differential_lymp = "";
        }
    checkup.setDifferentialLymp(differential_lymp);
    if(request.getParameter("txt_differential_mono")!=null){
        differential_mono = new String (request.getParameter("txt_differential_mono").getBytes("ISO8859_1"),"TIS-620");
        differential_mono = differential_mono.trim();
        }
    else{
        differential_mono = "";
        }
    checkup.setDifferentialMono(differential_mono);
    if(request.getParameter("txt_differential_eos")!=null){
        differential_eos = new String (request.getParameter("txt_differential_eos").getBytes("ISO8859_1"),"TIS-620");
        differential_eos = differential_eos.trim();
        }
    else{
        differential_eos = "";
        }
    checkup.setDifferentialEos(differential_eos);
    if(request.getParameter("txt_differential_baso")!=null){
        differential_baso = new String (request.getParameter("txt_differential_baso").getBytes("ISO8859_1"),"TIS-620");
        differential_baso = differential_baso.trim();
        }
    else{
        differential_baso = "";
        }
    checkup.setDifferentiaBaso(differential_baso);
    if(request.getParameter("txt_differential_band")!=null){
        differential_band = new String (request.getParameter("txt_differential_band").getBytes("ISO8859_1"),"TIS-620");
        differential_band = differential_band.trim();
        }
    else{
        differential_band = "";
        }
    checkup.setDifferentialBand(differential_band);
    if(request.getParameter("txt_differential_blast")!=null){
        differential_blast = new String (request.getParameter("txt_differential_blast").getBytes("ISO8859_1"),"TIS-620");
        differential_blast = differential_blast.trim();
        }
    else{
        differential_blast = "";
        }
    checkup.setDifferentialBlast(differential_blast);
    if(request.getParameter("chk_hiv")!=null){
        hiv = new String (request.getParameter("chk_hiv").getBytes("ISO8859_1"),"TIS-620");
        hiv = hiv.trim();
        }
    else{
        hiv = "";
        }
    checkup.setHiv(hiv);
    if(request.getParameter("chk_hiv_gpa")!=null){
        hiv_gpa = new String (request.getParameter("chk_hiv_gpa").getBytes("ISO8859_1"),"TIS-620");
        hiv_gpa = hiv_gpa.trim();
        }
    else{
        hiv_gpa = "";
        }
    checkup.setHivGpa(hiv_gpa);
    if(request.getParameter("chk_hiv_elisa")!=null){
        hiv_elisa = new String (request.getParameter("chk_hiv_elisa").getBytes("ISO8859_1"),"TIS-620");
        hiv_elisa = hiv_elisa.trim();
        }
    else{
        hiv_elisa = "";
        }
    checkup.setHivElisa(hiv_elisa);
    if(request.getParameter("chk_hiv_western_blot")!=null){
        hiv_western_blot = new String (request.getParameter("chk_hiv_western_blot").getBytes("ISO8859_1"),"TIS-620");
        hiv_western_blot = hiv_western_blot.trim();
        }
    else{
        hiv_western_blot = "";
        }
    checkup.setHivWesternBlot(hiv_western_blot);
    if(request.getParameter("chk_hepatitis")!=null){
        hepatitis = new String (request.getParameter("chk_hepatitis").getBytes("ISO8859_1"),"TIS-620");
        hepatitis = hepatitis.trim();
        }
    else{
        hepatitis = "";
        }
    checkup.setHepatitis(hepatitis);
    if(request.getParameter("chk_hepatitis_type")!=null){
        hepatitis_type = new String (request.getParameter("chk_hepatitis_type").getBytes("ISO8859_1"),"TIS-620");
        hepatitis_type = hepatitis_type.trim();
        }
    else{
        hepatitis_type = "";
        }
    checkup.setHepatitisType(hepatitis_type);
    if(request.getParameter("chk_hepatitis_vdrl")!=null){
        hepatitis_vdrl = new String (request.getParameter("chk_hepatitis_vdrl").getBytes("ISO8859_1"),"TIS-620");
        hepatitis_vdrl = hepatitis_vdrl.trim();
        }
    else{
        hepatitis_vdrl = "";
        }
    checkup.setHepatitisVdrl(hepatitis_vdrl);
    if(request.getParameter("chk_hepatitis_rpr")!=null){
        hepatitis_rpr = new String (request.getParameter("chk_hepatitis_rpr").getBytes("ISO8859_1"),"TIS-620");
        hepatitis_rpr = hepatitis_rpr.trim();
        }
    else{
        hepatitis_rpr = "";
        }
    checkup.setHepatitisRpr(hepatitis_rpr);
    if(request.getParameter("chk_hepatitis_tpha")!=null){
        hepatitis_tpha = new String (request.getParameter("chk_hepatitis_tpha").getBytes("ISO8859_1"),"TIS-620");
        hepatitis_tpha = hepatitis_tpha.trim();
        }
    else{
        hepatitis_tpha = "";
        }
    checkup.setHepatitisTpha(hepatitis_tpha);
    if(request.getParameter("chk_blood_film")!=null){
        blood_film = new String (request.getParameter("chk_blood_film").getBytes("ISO8859_1"),"TIS-620");
        blood_film = blood_film.trim();
        }
    else{
        blood_film = "";
        }
    checkup.setBloodFilm(blood_film);
    if(request.getParameter("txt_blood_film_comment")!=null){
        blood_film_comment = new String (request.getParameter("txt_blood_film_comment").getBytes("ISO8859_1"),"TIS-620");
        blood_film_comment = blood_film_comment.trim();
        }
    else{
        blood_film_comment = "";
        }
    checkup.setBloodFilmComment(blood_film_comment);
    if(request.getParameter("txt_uri_color")!=null){
        uri_color = new String (request.getParameter("txt_uri_color").getBytes("ISO8859_1"),"TIS-620");
        uri_color = uri_color.trim();
        }
    else{
        uri_color = "";
        }
    checkup.setUriColor(uri_color);
    if(request.getParameter("txt_uri_sp")!=null){
        uri_sp = new String (request.getParameter("txt_uri_sp").getBytes("ISO8859_1"),"TIS-620");
        uri_sp = uri_sp.trim();
        }
    else{
        uri_sp = "";
        }
    checkup.setUriSp(uri_sp);
    if(request.getParameter("txt_uri_ph")!=null){
        uri_ph = new String (request.getParameter("txt_uri_ph").getBytes("ISO8859_1"),"TIS-620");
        uri_ph = uri_ph.trim();
        }
    else{
        uri_ph = "";
        }
    checkup.setUriPh(uri_ph);
    if(request.getParameter("txt_uri_sugar")!=null){
        uri_sugar = new String (request.getParameter("txt_uri_sugar").getBytes("ISO8859_1"),"TIS-620");
        uri_sugar = uri_sugar.trim();
        }
    else{
        uri_sugar = "";
        }
    checkup.setUriSugar(uri_sugar);
    if(request.getParameter("txt_albumin")!=null){
        albumin = new String (request.getParameter("txt_albumin").getBytes("ISO8859_1"),"TIS-620");
        albumin = albumin.trim();
        }
    else{
        albumin = "";
        }
    checkup.setAlbumin(albumin);
    if(request.getParameter("txt_blood")!=null){
        blood = new String (request.getParameter("txt_blood").getBytes("ISO8859_1"),"TIS-620");
        blood = blood.trim();
        }
    else{
        blood = "";
        }
    checkup.setBlood(blood);
    if(request.getParameter("txt_ketone")!=null){
        ketone = new String (request.getParameter("txt_ketone").getBytes("ISO8859_1"),"TIS-620");
        ketone = ketone.trim();
        }
    else{
        ketone = "";
        }
    checkup.setKetone(ketone);
    if(request.getParameter("txt_bile")!=null){
        bile = new String (request.getParameter("txt_bile").getBytes("ISO8859_1"),"TIS-620");
        bile = bile.trim();
        }
    else{
        bile = "";
        }
    checkup.setBile(bile);
    if(request.getParameter("txt_micro_wbc")!=null){
        micro_wbc = new String (request.getParameter("txt_micro_wbc").getBytes("ISO8859_1"),"TIS-620");
        micro_wbc = micro_wbc.trim();
        }
    else{
        micro_wbc = "";
        }
    checkup.setMicroWbc(micro_wbc);
    if(request.getParameter("txt_rbc")!=null){
        rbc = new String (request.getParameter("txt_rbc").getBytes("ISO8859_1"),"TIS-620");
        rbc = rbc.trim();
        }
    else{
        rbc = "";
        }
    checkup.setRbc(rbc);
    if(request.getParameter("txt_casts")!=null){
        casts = new String (request.getParameter("txt_casts").getBytes("ISO8859_1"),"TIS-620");
        casts = casts.trim();
        }
    else{
        casts = "";
        }
    checkup.setCasts(casts);
    if(request.getParameter("txt_epithelal_cell")!=null){
        epithelal_cell = new String (request.getParameter("txt_epithelal_cell").getBytes("ISO8859_1"),"TIS-620");
        epithelal_cell = epithelal_cell.trim();
        }
    else{
        epithelal_cell = "";
        }
    checkup.setEpithelalCell(epithelal_cell);
    if(request.getParameter("chk_urine")!=null){
        urine = new String (request.getParameter("chk_urine").getBytes("ISO8859_1"),"TIS-620");
        urine = urine.trim();
        }
    else{
        urine = "";
        }
    checkup.setUrine(urine);
    if(request.getParameter("chk_stool")!=null){
        stool = new String (request.getParameter("chk_stool").getBytes("ISO8859_1"),"TIS-620");
        stool = stool.trim();
        }
    else{
        stool = "";
        }
    checkup.setStool(stool);
    if(request.getParameter("chk_chest_x_ray")!=null){
        chest_x_ray = new String (request.getParameter("chk_chest_x_ray").getBytes("ISO8859_1"),"TIS-620");
        chest_x_ray = chest_x_ray.trim();
        }
    else{
        chest_x_ray = "";
        }
    checkup.setChestXRay(chest_x_ray);
    if(request.getParameter("chk_anti_hcv")!=null){
        anti_hcv = new String (request.getParameter("chk_anti_hcv").getBytes("ISO8859_1"),"TIS-620");
        anti_hcv = anti_hcv.trim();
        }
    else{
        anti_hcv = "";
        }
    checkup.setAntiHcv(anti_hcv);
    if(request.getParameter("txt_conclusion")!=null){
        conclusion = new String (request.getParameter("txt_conclusion").getBytes("ISO8859_1"),"TIS-620");
        conclusion = conclusion.trim();
        }
    else{
        conclusion = "";
        }
    checkup.setConclusion(conclusion);
    if(request.getParameter("txt_doctor_id")!=null){
        doctor_id = new String (request.getParameter("txt_doctor_id").getBytes("ISO8859_1"),"TIS-620");
        doctor_id = doctor_id.trim();
        }
    else{
        doctor_id = "";
        }
    checkup.setDoctorId(doctor_id);
    if(request.getParameter("txt_doctor_fullnamee")!=null){
        doctor_fullnamee = new String (request.getParameter("txt_doctor_fullnamee").getBytes("ISO8859_1"),"TIS-620");
        doctor_fullnamee = doctor_fullnamee.trim();
        }
    else{
        doctor_fullnamee = "";
        }
    checkup.setDoctorFullnameE(doctor_fullnamee);
    String chk = checkupdb.setSaveCheckUp(checkup, "");
    //Vector v_address = new Vector();
    //FAddress address = new FAddress();
    //v_address = config1.getFAddress("103004");
    //config1.setSaveFAddress(v_address, "");
    response.sendRedirect("doctor_checkup_form_add.jsp?txt_checkup_id="+chk);
    }
catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
