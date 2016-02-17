select NULLIF(ntwc.patient_full_namet,'') as patient_full_namet, NULLIF(ntwc.patient_age,'') as patient_age,
NULLIF(ntwc.patient_hn_no,'') as patient_hn_no, 
NULLIF(ntwc.patient_an,'') as patient_an, NULLIF(ntwc.patient_phone_number,'') as patient_phone_number, 
NULLIF(ntwc.patient_bed_room,'') as patient_bed_room, 
case when ntwc.wound_cause = '1' then 'หัตถการ'
when ntwc.wound_cause = '2' then 'อุบัติเหตุ'
else 'ไม่มีข้อมูล' end as wound_cause,
case when ntwc.wound_appearance = '1' then 'ผ่า'
	when ntwc.wound_appearance = '2' then 'Suture'  
	when ntwc.wound_appearance = '3' then 'Drainage'
	when ntwc.wound_appearance = '4' then 'Trauma'
	else 'ไม่มีข้อมูล' end as wound_appearance,
case when ntwc.wound_category = '1' then 'Clean'
when ntwc.wound_category = '2' then 'Clean contaminate'
when ntwc.wound_category = '3' then 'contaminate'
when ntwc.wound_category = '4' then 'Dirty'
else 'ไม่มีข้อมูล' end as wound_category, 
NULLIF(ntwc.wound_location,'') as wound_location, NULLIF(ntwc.wound_treatment_cured_estimate,'') as wound_treatment_cured_estimate, 
NULLIF(ntwc.wound_treatment_cured_real,'') as wound_treatment_cured_real, 
NULLIF(ntwc.nurse_remark,'') as nurse_remark, NULLIF(ntwc.wound_description,'') as wound_description, 
NULLIF(ntwc.wound_care_running_doc_no,'') as wound_care_running_doc_no, 
NULLIF(ntwc.wound_care_id,'') as wound_care_id, NULLIF(ntwc.wound_type,'') as wound_type,
NULLIF(ntwcd.wound_care_detail_id,'') as wound_care_detail_id, NULLIF(ntwcd.wound_care_date,'') as wound_care_date, 
NULLIF(ntwcd.doctor_dx,'') as doctor_dx, 
NULLIF(ntwcd.wound_care_time,'') as wound_care_time, 
case when ntwcd.wound_method_category = '1' then 'Wet Dressing'
when ntwcd.wound_method_category = '2' then 'Dry Dressing'
when ntwcd.wound_method_category = '3' then 'Irrigate'
else 'ไม่มีข้อมูล' end as wound_method_category, ntwcd.wound_method_category_description,
case when ntwcd.wound_method_care_category_special = '1' then 'Debridement'
when ntwcd.wound_method_care_category_special = '2' then 'Currettage'
when ntwcd.wound_method_care_category_special = '3' then 'Scrub Burn'
when ntwcd.wound_method_care_category_special = '4' then 'Short drain'
when ntwcd.wound_method_care_category_special = '5' then 'OFFdrain'
when ntwcd.wound_method_care_category_special = '6' then 'Stitch OFF'
when ntwcd.wound_method_care_category_special = '7' then 'อื่น ๆ'
else 'ไม่มีข้อมูล' end as wound_method_care_category_special, ntwcd.wound_method_care_category_special_description,
case when ntwcd.wound_estimate_before_flag = '1' then 'แผลดี/มีความชุ่มชื้น'
when ntwcd.wound_estimate_before_flag = '2' then 'Blood Supply ดี'
when ntwcd.wound_estimate_before_flag = '3' then 'มี Discharge เป็น'
else 'ไม่มีข้อมูล' end as wound_estimate_before_flag, ntwcd.wound_estimate_before_flag_discharge_description, 
'จำนวน' || ntwcd.wound_estimate_before_flag_discharge_quantity as wound_estimate_before_flag_discharge_quantity,
'ลักษณะ:(Ref.4)' || ntwcd.wound_estimate_before_flag_discharge_feature as wound_estimate_before_flag_discharge_feature,
case when ntwcd.wound_estimate_before_category = '1' then 'แผลอักเสบ'
when ntwcd.wound_estimate_before_category = '2' then 'มีเนื้อตาย'
when ntwcd.wound_estimate_before_category = '3' then 'มี  Bleeding'
when ntwcd.wound_estimate_before_category = '4' then 'อื่น ๆ'
else 'ไม่มีข้อมูล' end as wound_estimate_before_category , ntwcd.wound_estimate_before_category_other_description,
NULLIF(wound_estimate_before_category_dimension_description,'') as wound_estimate_before_category_dimension_description,
case when ntwcd.wound_estimate_before_category = '1' then 'ดีขึ้น'
when ntwcd.wound_estimate_before_category = '2' then 'ขอบแผลติดดี'
when ntwcd.wound_estimate_before_category = '3' then 'แผลแยก'
when ntwcd.wound_estimate_before_category = '4' then 'ไม่ดีขึ้น'
else 'ไม่มีข้อมูล' end as wound_estimate_before_category, 
NULLIF(ntwcd.wound_estimate_after_flag,'') as wound_estimate_after_flag, NULLIF(ntwcd.wound_estimate_after_flag_solve,'') as wound_estimate_after_flag_solve,
ntwc.nurse_wound_care_running_doc_no
from nurse_t_wound_care  ntwc left join nurse_t_wound_care_detail ntwcd on ntwc.wound_care_id = ntwcd.wound_care_id
