package bangnaintranet;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pop
 */
public class RptBangna {
    private String reportname="", reportnamet="";
    Config1 config1 = new Config1();
    public enum ReportName{
        rpt_Monthly_Doctor_Admit(1,"rpt_Monthly_Admit"),
        rpt_Monthly_Ext(2,"rpt_Monthly_Ext"),
        M_Doctor_Dx_GroupBy_TypePayment(3,"doctor_dx_groupby_typement"),
        rpt_Monthly_Doctor_Detail(4,"rpt_Monthly_Doctor_Detail");
        private ReportName(int p, String m){
            point = p;
        }
        public final int point;
    }
    public void getMonthlyBangnaCosts(String branch_id, String aDateStart, String aDateEnd){
        //step 1 à¹?à¸?à¸£à¸µà¸¢à¸¡à¸?à¹?à¸­à¸¡à¸¹à¸¥à¹?à¸? r_month_bangna_costs à¹?à¸?à¸¢ field name à¹?à¸?à¹?à¸?à¸?à¸·à¹?à¸­ à¸?à¸²à¸¡ row à¹?à¸¥à¹?à¸§à¹?à¸«à¹?à¸¡à¸µ groupy à¸?à¸²à¸¡ à¸?à¸£à¸°à¹?à¸ à¸?à¸ªà¸´à¸?à¸?à¸´à¸?à¸²à¸£à¸£à¸±à¸?à¸©à¸²
        //step 2 à¸?à¸¶à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸?à¸µà¹?à¸¥à¸° query à¹?à¸¥à¹?à¸§à¸¡à¸² update à¹?à¸?à¸?à¹?à¸­à¸?à¸?à¹?à¸²à¸?à¹? à¹?à¸?à¹?à¸? LAB à¸?à¸¹à¹?à¸?à¹?à¸§à¸¢à¸?à¸­à¸? à¸?à¹? 1 query, LAB à¸?à¸¹à¹?à¸?à¹?à¸§à¸¢à¹?à¸? à¸?à¹? 1 query
        //step 3 à¸?à¸µà¹?à¸?à¸³ table à¹?à¸?à¸´à¹?à¸¡à¹?à¸?à¸£à¸²à¸°à¹?à¸?à¸­à¸?à¸²à¸?à¸? à¸?à¹?à¸²à¸?à¹?à¸­à¸?à¸?à¸²à¸£à¹?à¸?à¹?à¸?à¹?à¸?à¹?à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥à¸¢à¹?à¸­à¸?à¸«à¸¥à¸±à¸?
        //step 4 à¹?à¸?à¸?à¸­à¸?à¸?à¸µà¹?à¸?à¸³à¹?à¸?à¸?à¸?à¹?à¸²à¸¢à¹?à¸?à¸?à¹?à¸­à¸? à¹?à¸¥à¹?à¸§à¸?à¹?à¸­à¸¢à¸¡à¸²à¸?à¸³ step 3 à¸?à¹?à¸­ à¹?à¸?à¸·à¹?à¸­à¹?à¸«à¹? run à¹?à¸?à¹?à¹?à¸?à¸?à¹?à¸­à¸?
        String sql="",labucopd="0",labucipd="0",labpksopd="0",labpksipd="0";
        String xrayucopd="0", xrayucipd="0", xraypksopd="0",xraypksipd="0",dfucopd="0",dfucipd="0",dfpksopd="0",dfpksipd="0";
        String drugucopd="0",drugucipd="0",drugpksopd="0",drugpksipd="0";
        Statement st, stmainhis, stexeu;
        Connection connmainhis, conn;
        ResultSet rs;
        Integer i=0;
        Double drugsumucopd=new Double(0.0);
        Double drugsumucipd=new Double(0.0);
        Double drugsumpksopd=new Double(0.0);
        Double drugsumpksipd=new Double(0.0);
        try {
//            JOptionPane.showMessageDialog(null,"createMonthlyExt create connection");
            connmainhis = config1.getConnectionMainHIS(branch_id);
//            JOptionPane.showMessageDialog(null,"createMonthlyExt Connect mainhis");
//            connmainhis = config.getConnectionBangna();
            conn = config1.getConnectionBangna();
            sql="Delete From r_month_bangna_costs";
            stexeu = conn.createStatement();
            stmainhis = connmainhis.createStatement();
            st = conn.createStatement();
            stexeu.executeUpdate(sql);
            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('LAB(à¸?à¸²à¸?)','5204','lab','1','uc',100000,2000)";
            stexeu.executeUpdate(sql);
            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('X-RAY(à¸?à¸´à¸¥à¸¡à¹?)','5204','xray','2','uc',300,40)";
            stexeu.executeUpdate(sql);
            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('à¸?à¹?à¸²à¸¢à¸²+à¹?à¸§à¸?à¸ à¸±à¸?à¸?à¹?(à¸?à¸²à¸?)','5204','drug','3','uc',500000,60000)";
            stexeu.executeUpdate(sql);
            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('à¹?à¸?à¸?à¸¢à¹?(à¸?à¸²à¸?)','5204','df','4','uc',700000,80000)";
            stexeu.executeUpdate(sql);

            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('LAB(à¸?à¸²à¸?)','5204','lab','5','pks',900000,100000)";
            stexeu.executeUpdate(sql);
            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('X-RAY(à¸?à¸´à¸¥à¸¡à¹?)','5204','xray','6','pks',1100,120)";
            stexeu.executeUpdate(sql);
            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('à¸?à¹?à¸²à¸¢à¸²+à¹?à¸§à¸?à¸ à¸±à¸?à¸?à¹?(à¸?à¸²à¸?)','5204','drug','7','pks',1300000,140000)";
            stexeu.executeUpdate(sql);
            sql = "Insert Into r_month_bangna_costs(name,month,code,sort1, fn_typ,opd,ipd) "
                    +"Values('à¹?à¸?à¸?à¸¢à¹?(à¸?à¸²à¸?)','5204','df','8','pks',1500000,160000)";
            stexeu.executeUpdate(sql);
            System.out.println(" Insert r_month_bangna_costs");
//            JOptionPane.showMessageDialog(null,"createMonthlyExt Connect Delete and Insert");
            //à¸?à¸¶à¸?LAB
            sql="SELECT sum(LAB_M02.MNC_LB_PRI02) as labucopd "
                +"FROM LAB_T01 INNER JOIN "
                +"LAB_T02 ON LAB_T01.MNC_REQ_YR = LAB_T02.MNC_REQ_YR AND LAB_T01.MNC_REQ_NO = LAB_T02.MNC_REQ_NO AND  "
                +"LAB_T01.MNC_REQ_DAT = LAB_T02.MNC_REQ_DAT INNER JOIN "
                +"LAB_M02 ON LAB_T02.MNC_LB_CD = LAB_M02.MNC_LB_CD "
                +"WHERE (LAB_T01.MNC_REQ_STS <> 'C') AND (LAB_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND  "
                +"(LAB_T01.MNC_FN_TYP_CD IN ('88', '66')) AND (LAB_T02.MNC_REQ_STS <> 'X') AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '') ";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("labucopd")!=null) {
                     labucopd=rs.getString("labucopd");
                 }
             }
             rs.close();
             System.out.println(" Select LAB "+labucopd);

             sql="SELECT sum(LAB_M02.MNC_LB_PRI02) as labucipd "
                +"FROM LAB_T01 INNER JOIN "
                +"LAB_T02 ON LAB_T01.MNC_REQ_YR = LAB_T02.MNC_REQ_YR AND LAB_T01.MNC_REQ_NO = LAB_T02.MNC_REQ_NO AND "
                +"LAB_T01.MNC_REQ_DAT = LAB_T02.MNC_REQ_DAT INNER JOIN "
                +"LAB_M02 ON LAB_T02.MNC_LB_CD = LAB_M02.MNC_LB_CD "
                +"WHERE     (LAB_T01.MNC_REQ_STS <> 'C') AND (LAB_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
                +"(LAB_T01.MNC_FN_TYP_CD IN ('88', '66')) AND (LAB_T02.MNC_REQ_STS <> 'X') AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("labucipd")!=null) {
                     labucipd=rs.getString("labucipd");
                 }
             }
             rs.close();
             System.out.println(" Select LAB "+labucipd);

             sql="SELECT sum(LAB_M02.MNC_LB_PRI02) as labpksopd "
                +"FROM  LAB_T01 INNER JOIN "
                +"LAB_T02 ON dbo.LAB_T01.MNC_REQ_YR = LAB_T02.MNC_REQ_YR AND LAB_T01.MNC_REQ_NO = LAB_T02.MNC_REQ_NO AND "
                +"LAB_T01.MNC_REQ_DAT = LAB_T02.MNC_REQ_DAT INNER JOIN "
                +"LAB_M02 ON LAB_T02.MNC_LB_CD = LAB_M02.MNC_LB_CD "
                +"WHERE (.LAB_T01.MNC_REQ_STS <> 'C') AND (LAB_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
                +"(LAB_T01.MNC_FN_TYP_CD IN ('44', '45','47','48')) AND (dbo.LAB_T02.MNC_REQ_STS <> 'X') AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("labpksopd")!=null){
                     labpksopd=rs.getString("labpksopd");
                 }
             }
             rs.close();
             System.out.println(" Select LAB "+labpksopd);

             sql="SELECT sum(LAB_M02.MNC_LB_PRI02) as labpksipd "
                +"FROM  LAB_T01 INNER JOIN "
                +"LAB_T02 ON LAB_T01.MNC_REQ_YR = LAB_T02.MNC_REQ_YR AND LAB_T01.MNC_REQ_NO = LAB_T02.MNC_REQ_NO AND "
                +"LAB_T01.MNC_REQ_DAT = LAB_T02.MNC_REQ_DAT INNER JOIN "
                +"LAB_M02 ON LAB_T02.MNC_LB_CD = LAB_M02.MNC_LB_CD "
                +"WHERE (LAB_T01.MNC_REQ_STS <> 'C') AND (LAB_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
                +"(LAB_T01.MNC_FN_TYP_CD IN ('44', '45','47','48')) AND (LAB_T02.MNC_REQ_STS <> 'X') AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("labpksipd")!=null){
                     labpksipd=rs.getString("labpksipd");
                 }
             }
             rs.close();
             System.out.println(" Select LAB "+labpksipd);

             //à¸?à¸¶à¸? X-RAY
             sql="SELECT sum(XRAY_T05.MNC_XR_USE) as xrayucopd "//--, dbo.XRAY_T05.MNC_PH_CD, dbo.PHARMACY_M01.MNC_PH_TN
                +"FROM  XRAY_T01 INNER JOIN "
                +"XRAY_T02 ON dbo.XRAY_T01.MNC_REQ_YR = XRAY_T02.MNC_REQ_YR AND "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T02.MNC_REQ_NO AND XRAY_T01.MNC_REQ_DAT = XRAY_T02.MNC_REQ_DAT INNER JOIN "
                +"XRAY_T05 ON XRAY_T01.MNC_REQ_YR = XRAY_T05.MNC_REQ_YR AND "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T05.MNC_REQ_NO AND XRAY_T01.MNC_REQ_DAT = XRAY_T05.MNC_REQ_DAT AND "
                +"XRAY_T02.MNC_XR_CD = XRAY_T05.MNC_XR_CD INNER JOIN "
                +"PHARMACY_M01 ON XRAY_T05.MNC_PH_CD = PHARMACY_M01.MNC_PH_CD "
                +"WHERE (XRAY_T01.MNC_FN_TYP_CD IN ('66', '88')) AND (XRAY_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
                +"(XRAY_T01.MNC_REQ_STS <> 'C') AND (XRAY_T02.MNC_REQ_STS <> 'C')AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("xrayucopd")!=null){
                     xrayucopd=rs.getString("xrayucopd");
                 }
             }
             rs.close();
             System.out.println(" Select X-RAY "+xrayucopd);

             sql="SELECT sum(XRAY_T05.MNC_XR_USE) as xrayucipd "//--, dbo.XRAY_T05.MNC_PH_CD, dbo.PHARMACY_M01.MNC_PH_TN
                +"FROM XRAY_T01 INNER JOIN "
                +"XRAY_T02 ON dbo.XRAY_T01.MNC_REQ_YR = XRAY_T02.MNC_REQ_YR AND "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T02.MNC_REQ_NO AND XRAY_T01.MNC_REQ_DAT = XRAY_T02.MNC_REQ_DAT INNER JOIN "
                +"XRAY_T05 ON XRAY_T01.MNC_REQ_YR = XRAY_T05.MNC_REQ_YR AND "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T05.MNC_REQ_NO AND XRAY_T01.MNC_REQ_DAT = XRAY_T05.MNC_REQ_DAT AND "
                +"XRAY_T02.MNC_XR_CD = XRAY_T05.MNC_XR_CD INNER JOIN "
                +"PHARMACY_M01 ON XRAY_T05.MNC_PH_CD = PHARMACY_M01.MNC_PH_CD "
                +"WHERE (XRAY_T01.MNC_FN_TYP_CD IN ('66', '88')) AND (XRAY_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
                +"(XRAY_T01.MNC_REQ_STS <> 'C') AND (XRAY_T02.MNC_REQ_STS <> 'C')AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("xrayucipd")!=null){
                     xrayucipd=rs.getString("xrayucipd");
                 }
             }
             rs.close();
             System.out.println(" Select X-RAY "+xrayucipd);

             sql="SELECT sum(XRAY_T05.MNC_XR_USE) as xraypksopd "//, dbo.XRAY_T05.MNC_PH_CD, dbo.PHARMACY_M01.MNC_PH_TN "
                +"FROM XRAY_T01 INNER JOIN "
                +"XRAY_T02 ON XRAY_T01.MNC_REQ_YR = XRAY_T02.MNC_REQ_YR AND "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T02.MNC_REQ_NO AND XRAY_T01.MNC_REQ_DAT = XRAY_T02.MNC_REQ_DAT INNER JOIN "
                +"XRAY_T05 ON XRAY_T01.MNC_REQ_YR = XRAY_T05.MNC_REQ_YR AND "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T05.MNC_REQ_NO AND dbo.XRAY_T01.MNC_REQ_DAT = XRAY_T05.MNC_REQ_DAT AND "
                +"XRAY_T02.MNC_XR_CD = XRAY_T05.MNC_XR_CD INNER JOIN "
                +"PHARMACY_M01 ON XRAY_T05.MNC_PH_CD = PHARMACY_M01.MNC_PH_CD "
                +"WHERE (XRAY_T01.MNC_FN_TYP_CD IN ('44', '45','47','48')) AND (XRAY_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
                +"(XRAY_T01.MNC_REQ_STS <> 'C') AND (XRAY_T02.MNC_REQ_STS <> 'C')AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("xraypksopd")!=null){
                     xraypksopd=rs.getString("xraypksopd");
                 }
             }
             rs.close();
             System.out.println(" Select X-RAY "+xraypksopd);

             sql="SELECT sum(XRAY_T05.MNC_XR_USE) as xraypksipd "//--, dbo.XRAY_T05.MNC_PH_CD, dbo.PHARMACY_M01.MNC_PH_TN
                +"FROM  XRAY_T01 INNER JOIN "
                +"XRAY_T02 ON dbo.XRAY_T01.MNC_REQ_YR = XRAY_T02.MNC_REQ_YR AND  "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T02.MNC_REQ_NO AND XRAY_T01.MNC_REQ_DAT = XRAY_T02.MNC_REQ_DAT INNER JOIN "
                +"XRAY_T05 ON XRAY_T01.MNC_REQ_YR = XRAY_T05.MNC_REQ_YR AND  "
                +"XRAY_T01.MNC_REQ_NO = XRAY_T05.MNC_REQ_NO AND XRAY_T01.MNC_REQ_DAT = XRAY_T05.MNC_REQ_DAT AND  "
                +"XRAY_T02.MNC_XR_CD = XRAY_T05.MNC_XR_CD INNER JOIN "
                +"PHARMACY_M01 ON dbo.XRAY_T05.MNC_PH_CD = PHARMACY_M01.MNC_PH_CD "
                +"WHERE (XRAY_T01.MNC_FN_TYP_CD IN ('44', '45','47','48')) AND (XRAY_T01.MNC_REQ_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND  "
                +"(XRAY_T01.MNC_REQ_STS <> 'C') AND (XRAY_T02.MNC_REQ_STS <> 'C')AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("xraypksipd")!=null){
                     xraypksipd=rs.getString("xraypksipd");
                 }
             }
             rs.close();
             System.out.println(" Select X-RAY "+xraypksipd);

             //à¸?à¸¶à¸?à¸¢à¸²à¸?à¸¸à¸?
//             sql=" SELECT pharmacy_t06.mnc_ph_cd,pharmacy_m01.mnc_ph_tn,sum(pharmacy_t06.mnc_ph_qty)as qty, "
//                +"pharmacy_t06.mnc_ph_unt_cd, "
//                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice, "
//                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostucopd "
//                +"FROM PHARMACY_T05 INNER JOIN "
//                +"PHARMACY_T06 ON PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND "
//                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND "
//                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
//                +"PHARMACY_M05 ON PHARMACY_T06.MNC_PH_CD = PHARMACY_M05.MNC_PH_CD "
//                +"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
//                +"WHERE (PHARMACY_T05.MNC_FN_TYP_CD in ('88','66')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND (dbo.PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '') "
//                +"group by pharmacy_t06.mnc_ph_cd, pharmacy_t06.mnc_ph_unt_cd,pharmacy_m01.mnc_ph_tn "
//                +"order by pharmacy_t06.mnc_ph_cd";
             sql=" SELECT sum(pharmacy_t06.mnc_ph_qty)as qty, "
                +"pharmacy_t06.mnc_ph_unt_cd, "
                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice, "
                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostucopd "
                +"FROM PHARMACY_T05 INNER JOIN "
                +"PHARMACY_T06 ON PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND "
                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND "
                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
                +"PHARMACY_M05 ON PHARMACY_T06.MNC_PH_CD = PHARMACY_M05.MNC_PH_CD "
                //+"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
                +"WHERE (PHARMACY_T05.MNC_FN_TYP_CD in ('88','66')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND (dbo.PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '') "
                +"group by pharmacy_t06.mnc_ph_cd, pharmacy_t06.mnc_ph_unt_cd "
                +"order by pharmacy_t06.mnc_ph_cd";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("totalcostucopd")!=null){
                    drugucopd=rs.getString("totalcostucopd");
                    drugsumucopd+= Double.parseDouble(drugucopd);
                 }
             }
             rs.close();
             System.out.println(" Select Drug "+drugsumucopd.toString());

//             sql="SELECT pharmacy_t06.mnc_ph_cd,pharmacy_m01.mnc_ph_tn,sum(pharmacy_t06.mnc_ph_qty)as qty, "
//                +"pharmacy_t06.mnc_ph_unt_cd, "
//                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice, "
//                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostucipd "
//                +"FROM PHARMACY_T05 INNER JOIN "
//                +"PHARMACY_T06 ON dbo.PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND "
//                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND "
//                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
//                +"PHARMACY_M05 ON PHARMACY_T06.MNC_PH_CD = dbo.PHARMACY_M05.MNC_PH_CD "
//                +"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
//                +"WHERE (PHARMACY_T05.MNC_FN_TYP_CD in ('88','66')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND(dbo.PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '') "
//                +"group by  pharmacy_t06.mnc_ph_cd,pharmacy_t06.mnc_ph_unt_cd,pharmacy_m01.mnc_ph_tn "
//                +"order by pharmacy_t06.mnc_ph_cd";
             sql="SELECT sum(pharmacy_t06.mnc_ph_qty)as qty, "
                +"pharmacy_t06.mnc_ph_unt_cd, "
                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice, "
                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostucipd "
                +"FROM PHARMACY_T05 INNER JOIN "
                +"PHARMACY_T06 ON dbo.PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND "
                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND "
                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
                +"PHARMACY_M05 ON PHARMACY_T06.MNC_PH_CD = dbo.PHARMACY_M05.MNC_PH_CD "
//                +"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
                +"WHERE (PHARMACY_T05.MNC_FN_TYP_CD in ('88','66')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND(dbo.PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '') "
                +"group by  pharmacy_t06.mnc_ph_cd,pharmacy_t06.mnc_ph_unt_cd "
                +"order by pharmacy_t06.mnc_ph_cd";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("totalcostucipd")!=null){
                    drugucipd=rs.getString("totalcostucipd");
                    drugsumucipd+= Double.parseDouble(drugucipd);
                 }
             }
             rs.close();
             System.out.println(" Select Drug "+drugsumucipd.toString());

//             sql="SELECT pharmacy_t06.mnc_ph_cd,pharmacy_m01.mnc_ph_tn,sum(pharmacy_t06.mnc_ph_qty)as qty, "
//                +"pharmacy_t06.mnc_ph_unt_cd, "
//                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice,  "
//                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostpksopd "
//                +"FROM PHARMACY_T05 INNER JOIN "
//                +"PHARMACY_T06 ON PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND  "
//                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND  "
//                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
//                +"PHARMACY_M05 ON dbo.PHARMACY_T06.MNC_PH_CD = PHARMACY_M05.MNC_PH_CD "
//                +"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
//                +"WHERE     (PHARMACY_T05.MNC_FN_TYP_CD in ('44','45','47','48')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND                       (dbo.PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '') "
//                +"group by  pharmacy_t06.mnc_ph_cd,pharmacy_t06.mnc_ph_unt_cd,dbo.pharmacy_m01.mnc_ph_tn "
//                +"order by pharmacy_t06.mnc_ph_cd ";
             sql="SELECT sum(pharmacy_t06.mnc_ph_qty)as qty, "
                +"pharmacy_t06.mnc_ph_unt_cd, "
                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice,  "
                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostpksopd "
                +"FROM PHARMACY_T05 INNER JOIN "
                +"PHARMACY_T06 ON PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND  "
                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND  "
                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
                +"PHARMACY_M05 ON dbo.PHARMACY_T06.MNC_PH_CD = PHARMACY_M05.MNC_PH_CD "
//                +"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
                +"WHERE     (PHARMACY_T05.MNC_FN_TYP_CD in ('44','45','47','48')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND                       (dbo.PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS NULL OR MNC_AN_NO = '') "
                +"group by  pharmacy_t06.mnc_ph_cd,pharmacy_t06.mnc_ph_unt_cd "
                +"order by pharmacy_t06.mnc_ph_cd ";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("totalcostpksopd")!=null) {
                    drugpksopd=rs.getString("totalcostpksopd");
                    drugsumpksopd+= Double.parseDouble(drugpksopd);
                 }
             }
             rs.close();
             System.out.println(" Select Drug "+drugsumpksopd.toString());

//             sql="SELECT pharmacy_t06.mnc_ph_cd,pharmacy_m01.mnc_ph_tn,sum(pharmacy_t06.mnc_ph_qty)as qty, "
//                +"pharmacy_t06.mnc_ph_unt_cd, "
//                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice, "
//                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostpksipd "
//                +"FROM PHARMACY_T05 INNER JOIN "
//                +"PHARMACY_T06 ON PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND "
//                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND "
//                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
//                +"PHARMACY_M05 ON PHARMACY_T06.MNC_PH_CD = PHARMACY_M05.MNC_PH_CD "
//                +"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
//                +"WHERE  (PHARMACY_T05.MNC_FN_TYP_CD in ('44','45','47','48')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
//                +"(PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '') "
//                +"group by pharmacy_t06.mnc_ph_cd,pharmacy_t06.mnc_ph_unt_cd,pharmacy_m01.mnc_ph_tn "
//                +"order by pharmacy_t06.mnc_ph_cd";
             sql="SELECT sum(pharmacy_t06.mnc_ph_qty)as qty, "
                +"pharmacy_t06.mnc_ph_unt_cd, "
                +"sum(PHARMACY_T06.MNC_PH_QTY * PHARMACY_M05.MNC_PH_PRI01) AS saleprice, "
                +"sum(PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS totalcostpksipd "
                +"FROM PHARMACY_T05 INNER JOIN "
                +"PHARMACY_T06 ON PHARMACY_T05.MNC_DOC_CD = PHARMACY_T06.MNC_DOC_CD AND "
                +"PHARMACY_T05.MNC_CFR_YR = PHARMACY_T06.MNC_CFR_YR AND "
                +"PHARMACY_T05.MNC_CFR_NO = PHARMACY_T06.MNC_CFR_NO INNER JOIN "
                +"PHARMACY_M05 ON PHARMACY_T06.MNC_PH_CD = PHARMACY_M05.MNC_PH_CD "
//                +"INNER JOIN pharmacy_m01  on pharmacy_t06.mnc_ph_cd = pharmacy_m01.mnc_ph_cd "
                +"WHERE  (PHARMACY_T05.MNC_FN_TYP_CD in ('44','45','47','48')) AND (PHARMACY_T05.MNC_CFG_DAT BETWEEN '"+aDateStart+"' AND '"+aDateEnd+"') AND "
                +"(PHARMACY_T05.MNC_CFR_STS <> 'C')AND (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '') "
                +"group by pharmacy_t06.mnc_ph_cd,pharmacy_t06.mnc_ph_unt_cd "
                +"order by pharmacy_t06.mnc_ph_cd";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("totalcostpksipd")!=null){
                    drugpksipd=rs.getString("totalcostpksipd");
                    drugsumpksipd+= Double.parseDouble(drugpksipd);
                 }
             }
             rs.close();
             System.out.println(" Select Drug "+drugsumpksipd.toString());

             //à¸?à¸¶à¸? DF à¸?à¸¸à¸?
             sql="SELECT sum(MNC_DF_AMT) as dfucopd "//--, MNC_FN_TYP_CD
                +"FROM  DOTDF_DETAIL "
                +"WHERE (MNC_FN_TYP_CD IN ('88','66')) AND (MNC_DF_DATE BETWEEN '"
                +aDateStart+"' AND '"+aDateEnd+"') and (MNC_AN_NO IS NULL OR MNC_AN_NO = '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("dfucopd")!=null){
                     dfucopd=rs.getString("dfucopd");
                 }
             }
             rs.close();
             System.out.println(" Select DF uc OPD "+dfucopd);

             sql="SELECT sum(MNC_DF_AMT) as dfucipd "//--, MNC_FN_TYP_CD
                +"FROM DOTDF_DETAIL "
                +"WHERE (MNC_FN_TYP_CD IN ('88','66')) AND (MNC_DF_DATE BETWEEN '"
                +aDateStart+"' AND '"+aDateEnd+"') and (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("dfucipd")!=null){
                     dfucipd=rs.getString("dfucipd");
                 }
             }
             rs.close();
             System.out.println(" Select DF uc IPD "+dfucipd);

             sql="SELECT sum( MNC_DF_AMT) as dfpksopd "//--, MNC_FN_TYP_CD
                +"FROM DOTDF_DETAIL "
                +"WHERE (MNC_FN_TYP_CD IN ('44','45','47','48')) AND (MNC_DF_DATE BETWEEN '"
                +aDateStart+"' AND '"+aDateEnd+"') and (MNC_AN_NO IS NULL OR MNC_AN_NO = '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("dfpksopd")!=null){
                     dfpksopd=rs.getString("dfpksopd");
                 }
             }
             rs.close();
             System.out.println(" Select Df pks OPD "+dfpksopd);

             sql="SELECT sum(MNC_DF_AMT) as dfpksipd "//--, MNC_FN_TYP_CD
                +"FROM DOTDF_DETAIL "
                +"Where (MNC_FN_TYP_CD IN ('44','45','47','48')) AND (MNC_DF_DATE BETWEEN '"
                +aDateStart+"' AND '"+aDateEnd+"') and (MNC_AN_NO IS not NULL OR MNC_AN_NO <> '')";
             rs = stmainhis.executeQuery(sql);
             while(rs.next()){
                 if(rs.getString("dfpksipd")!=null){
                     dfpksipd=rs.getString("dfpksipd");
                 }
             }
             rs.close();
             System.out.println(" Select Df pks IPD "+dfucipd);

             //Update r_month_bangna_costs
             sql="Update r_month_bangna_costs Set opd = "+labucopd+", ipd ="+labucipd +" Where code ='lab' and fn_typ = 'uc'";
             st.executeUpdate(sql);
             sql="Update r_month_bangna_costs Set opd = "+xrayucopd+", ipd ="+xrayucipd+" Where code ='xray'  and fn_typ = 'uc'";
             st.executeUpdate(sql);
             sql="Update r_month_bangna_costs Set opd = "+drugsumucopd+", ipd ="+drugsumucipd+" Where code ='drug'  and fn_typ = 'uc'";
             st.executeUpdate(sql);
             sql="Update r_month_bangna_costs Set opd = "+dfucopd+", ipd ="+dfucipd+" Where code ='df'  and fn_typ = 'uc'";
             st.executeUpdate(sql);

             sql="Update r_month_bangna_costs Set opd = "+labpksopd+", ipd ="+labpksipd+" Where code ='lab'  and fn_typ = 'pks'";
             st.executeUpdate(sql);
             sql="Update r_month_bangna_costs Set opd = "+xraypksopd+", ipd ="+xraypksipd+" Where code ='xray'  and fn_typ = 'pks'";
             st.executeUpdate(sql);
             sql="Update r_month_bangna_costs Set opd = "+drugsumpksopd+", ipd ="+drugsumpksipd+" Where code ='drug'  and fn_typ = 'pks'";
             st.executeUpdate(sql);
             sql="Update r_month_bangna_costs Set opd = "+dfpksopd+", ipd ="+dfpksipd+" Where code ='df'  and fn_typ = 'pks'";
             st.executeUpdate(sql);

             System.out.println(" Update r_month_bangna_costs ");


             conn.close();
             connmainhis.close();

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null,"createMonthlyExt "+ ex.toString());
            //Logger.getLogger(FrameCritiria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getYearlyDoctorAdmit(String branch_id,String aDateStart, String aDateEnd){
        String sql="", hn_no="", first_name="", last_name="", prefix_name="", date_admit="", doctorname="", dot_cd="", fn_typ_dsc="";
        String cnt="", datestart="", dateend="",period="", whereperiod="";
        Connection connmainhis, conn;
        Statement st, stmainhis, stdoc, stexe;
        Integer i=0;
        try {
            //à¸?à¸¶à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥
            connmainhis = config1.getConnectionMainHIS(branch_id);
            conn = config1.getConnectionBangna();
            sql="Delete From r_yearly_doctor_admit";
            st = conn.createStatement();
            sql="Delete From r_yearly_doctor_admit_period";
            st = conn.createStatement();
            stdoc = conn.createStatement();
            stexe = conn.createStatement();
            st.executeUpdate(sql);
//            if(jComboBoxPeriod.getSelectedItem().toString()=="00.00-18.00"){
//                whereperiod=" and t01.mnc_time <= 1800";
//            }
//            else if(jComboBoxPeriod.getSelectedItem().toString()=="18.00-24.00"){
//                whereperiod=" and t01.mnc_time >= 1800";
//            }

            sql = "Select t01.mnc_hn_no, m01.MNC_FNAME_T, m01.MNC_LNAME_T, m02.MNC_PFIX_DSC, "
                +"t01.mnc_date, pm26.mnc_dot_fname, pm26.mnc_dot_lname, "
                +"pm26.mnc_dot_fname +' '+ pm26.mnc_dot_lname as doctorname, pt08.mnc_dot_cd_s, fm02.mnc_fn_typ_dsc, t01.mnc_time "
                +"From patient_t01 t01 inner join patient_t08 pt08 "
                +"on t01.mnc_hn_no = pt08.mnc_hn_no and t01.mnc_date = pt08.mnc_date inner join "
                +"patient_m26 pm26 on pm26.mnc_dot_cd = pt08.mnc_dot_cd_s "
                +"and t01.mnc_pre_no = pt08.mnc_pre_no INNER JOIN "
                     +"PATIENT_M01 m01 ON t01.MNC_HN_NO = m01.MNC_HN_NO INNER JOIN "
                     +"PATIENT_M02 m02 ON m01.MNC_PFIX_CDT = m02.MNC_PFIX_CD  inner join finance_m02 fm02 "
                +"on pt08.mnc_fn_typ_cd = fm02.MNC_FN_TYP_CD "
//                +"Where t01.mnc_sts <> 'C' and t01.mnc_date between '"+aDateStart+"' and '"+aDateEnd+"' "
                +"Where t01.mnc_sts <> 'C' and t01.mnc_date between '"+aDateStart+"' and '"+aDateEnd+"' "
                +whereperiod+" and pt08.mnc_fn_typ_cd not in('44','45')"
                +"Order by t01.mnc_date, t01.mnc_time ";
            stmainhis = connmainhis.createStatement();
            ResultSet rsmainhis;
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
//                thePatient.hn = rsmainhis.getString("mnc_hn_no");
                hn_no = rsmainhis.getString("mnc_hn_no");
                first_name = rsmainhis.getString("mnc_fname_t");
                last_name = rsmainhis.getString("mnc_fname_t");
                prefix_name = rsmainhis.getString("mnc_pfix_dsc");
                date_admit = rsmainhis.getString("mnc_date").substring(0, 10);
                doctorname = rsmainhis.getString("doctorname");
                dot_cd = rsmainhis.getString("mnc_dot_cd_s");
                fn_typ_dsc = rsmainhis.getString("mnc_fn_typ_dsc");
                if(Integer.parseInt(rsmainhis.getString("mnc_time"))>=1800){
                    period="2";
                }
                else if(Integer.parseInt(rsmainhis.getString("mnc_time"))>=1800){
                    period="1";
                }

                sql = "Insert into r_yearly_doctor_admit (hn_no, first_name, last_name, "
                        +"prefix_name, date_admit, dot_name, "
                        +"dot_cd, fn_typ_dsc, period) "
                        +"Values('"+hn_no+"','"+first_name+"','"+last_name+"','"
                        +prefix_name+"','"+date_admit+"','"+doctorname+"','"
                        +dot_cd+"','"+fn_typ_dsc+"','"+period+"')";
                st.executeUpdate(sql);
                i++;
            }
            rsmainhis.close();
            connmainhis.close();
            System.out.println(" Insert r_yearly_doctor_admit success ");
//            conn.close();

            //à¹?à¸?à¸£à¸µà¸¢à¸¡à¸?à¹?à¸­à¸¡à¸¹à¸¥ à¸£à¸²à¸¢à¸?à¸·à¹?à¸­à¹?à¸?à¸?à¸¢à¹? à¹?à¸?à¸·à¹?à¸­à¹?à¸«à¹?à¹?à¸?à¹?à¸? row à¹?à¸¥à¹?à¸§à¸?à¸¶à¸?à¹?à¸«à¸¡à¹?

//            conn = config.getConnectionExtend();
//            sql="Select count(hn_no) cnt, dot_cd, dot_nWIDTHame, date_admit "
//                    +"From r_month_admit "
//                    +"Where date_admit >= '2009-01-01' and date_admit <= '2009-01-31' "
//                    +"Group By date_admit, dot_cd, dot_name ";
            sql = "Select dot_cd From r_yearly_doctor_admit Group By dot_cd";
            ResultSet rs, rsselect;
            rs = st.executeQuery(sql);
            while(rs.next()){
//                dot_cd = rs.getString("dot_cd");
//                doctorname = rs.getString("dot_name");
                dot_cd = rs.getString("dot_cd");
//                cnt = rs.getString("cnt");
                sql = "Insert Into r_yearly_doctor_admit_period(code) "
                        +"Values('"+dot_cd+"')";
                stdoc.executeUpdate(sql);
            }
            rs.close();
            System.out.println(" Insert r_yearly_doctor_admit_period success ");

            //à¸?à¸¶à¸?à¸?à¹?à¸­à¸¡à¸¹à¸¥ doctor à¹?à¸¥à¹?à¸§à¸?à¸³à¸¡à¸² group à¹?à¸«à¸¡à¹?à¹?à¸?à¸·à¹?à¸­ insert à¹?à¸?à¹?à¸?à¸²à¸¡à¸?à¹?à¸­à¸?à¸?à¸²à¸£à¸?à¸µà¹?à¹?à¸?à¹?à¸?à¹?à¸?à¸·à¸­à¸?à¸?à¸²à¸¡ column
            sql="Select code From r_yearly_doctor_admit_period Order By name";
            rs = st.executeQuery(sql);
            while(rs.next()){
                dot_cd = rs.getString("code");
                for(int ii=1;ii<=6;ii++){
                    if(ii==1){
                        datestart = "2009-01-01";
                        dateend = "2009-01-31";
                    }
                    else if(ii==2){
                        datestart = "2009-02-01";
                        dateend = "2009-02-28";
                    }
                    else if(ii==3){
                        datestart = "2009-03-01";
                        dateend = "2009-03-31";
                    }else if(ii==4){
                        datestart = "2009-04-01";
                        dateend = "2009-04-30";
                    }
                    else if(ii==5){
                        datestart = "2009-05-01";
                        dateend = "2009-05-31";
                    }
                    else if(ii==6){
                        datestart = "2009-06-01";
                        dateend = "2009-06-30";
                    }
                    else if(ii==7){
                        datestart = "2009-06-01";
                        dateend = "2009-06-30";
                    }
                    else if(ii==8){
                        datestart = "2009-08-01";
                        dateend = "2009-08-31";
                    }
                    else if(ii==9){
                        datestart = "2009-09-01";
                        dateend = "2009-09-30";
                    }
                    else if(ii==10){
                        datestart = "2009-10-01";
                        dateend = "2009-10-31";
                    }
                    else if(ii==11){
                        datestart = "2009-11-01";
                        dateend = "2009-11-30";
                    }
                    else if(ii==12){
                        datestart = "2009-12-01";
                        dateend = "2009-12-31";
                    }
                    sql = "Select count(hn_no) as cnt, dot_cd, dot_name From r_yearly_doctor_admit Where dot_cd = '"+dot_cd+"' and "
                        +"date_admit >='"+datestart+"' and date_admit <= '"+dateend+"' Group By dot_cd, dot_name";
                    rsselect = stdoc.executeQuery(sql);
                    while(rsselect.next()){
                        cnt=rsselect.getString("cnt");
                        doctorname = rsselect.getString("dot_name");
                        sql = "Update r_yearly_doctor_admit_period Set m"+datestart.substring(5, 7)+"="+cnt+", name = '"+doctorname+"' Where code = '"+dot_cd+"'";
                        stexe.executeUpdate(sql);
                    }
                    rsselect.close();
                }
            }
            rs.close();
            System.out.println(" Update r_yearly_doctor_admit_period success ");

            conn.close();


        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.toString());
            //Logger.getLogger(FrameCritiria.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getDailyPatientAdmit(String branch_id, String date_start, String date_end, String flag, String bed){
        String sql="", date_admit="", cnt_date="", diff_date="";
        Double avg_date=0.0, cnt_date1=0.0, diff_date1=0.0, cal_date=0.0;
        Connection connmainhis, connbangna;
        Statement stmainhis, stbangna;
        ResultSet rsmainhis, rsbangna;
        boolean chk=false;
        try {
            connmainhis = config1.getConnectionMainHIS(branch_id);
            connbangna = config1.getConnectionBangna();
            stmainhis = connmainhis.createStatement();
            stbangna = connbangna.createStatement();
            sql="Delete From r_daily_patient_admit";
            stbangna.executeUpdate(sql);
            sql="select datediff(d,'"+date_start+"','"+date_end+"') cnt_date from PATIENT_M10";
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                diff_date = rsmainhis.getString("cnt_date");
                cal_date = Double.parseDouble(diff_date);
            }
            rsmainhis.close();
            //à¸?à¸¶à¸?à¸­à¸²à¸¢à¸¸à¸£à¸?à¸£à¸£à¸¡
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('111','112','113','114','115','116') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "                    
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('111','112','113','114','115','116') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            rsmainhis = stmainhis.executeQuery(sql);
            chk=false;
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            if(diff_date1!=0.0){
                avg_date = cnt_date1/cal_date;
            }
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¸­à¸²à¸¢à¸¸à¸£à¸?à¸£à¸£à¸¡',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
                stbangna.executeUpdate(sql);
                
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¸­à¸²à¸¢à¸¸à¸£à¸?à¸£à¸£à¸¡',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }
            //à¸?à¸¶à¸?à¸¨à¸±à¸¥à¸¢à¸?à¸£à¸£à¸¡
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('122','123','124','121','132') "
                    +"and pt01.mnc_date >= '"+date_start+"' and pt01.mnc_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' "
                    +"group by pt01.mnc_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('122','123','124','121','132') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            chk=false;
            rsmainhis = stmainhis.executeQuery(sql);
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            if(diff_date1!=0.0){
                avg_date = cnt_date1/cal_date;
            }
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¸¨à¸±à¸¥à¸¢à¸?à¸£à¸£à¸¡',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
            stbangna.executeUpdate(sql);
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¸¨à¸±à¸¥à¸¢à¸?à¸£à¸£à¸¡',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }
            //à¸?à¸¶à¸?à¸ªà¸¹à¸?à¸´à¸?à¸£à¸£à¸¡-à¸?à¸£à¸µà¹?à¸§à¸?
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('131') "
                    +"and pt01.mnc_date >= '"+date_start+"' and pt01.mnc_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' "
                    +"group by pt01.mnc_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('131') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            chk=false;
            rsmainhis = stmainhis.executeQuery(sql);
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            if(diff_date1!=0.0){
                avg_date = cnt_date1/cal_date;
            }
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¸ªà¸¹à¸?à¸´à¸?à¸£à¸£à¸¡-à¸?à¸£à¸µà¹?à¸§à¸?',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
            stbangna.executeUpdate(sql);
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¸ªà¸¹à¸?à¸´à¸?à¸£à¸£à¸¡-à¸?à¸£à¸µà¹?à¸§à¸?',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }
            //à¸?à¸¶à¸?à¸¨à¸±à¸¥à¸¢à¸?à¸£à¸£à¸¡à¸­à¸­à¸?à¹?à¹?à¸?à¸?à¸´à¸?à¸´à¸?à¸ªà¹?
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('181') "
                    +"and pt01.mnc_date >= '"+date_start+"' and pt01.mnc_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' "
                    +"group by pt01.mnc_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('181') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            chk=false;
            rsmainhis = stmainhis.executeQuery(sql);
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            if(diff_date1!=0.0){
                avg_date = cnt_date1/cal_date;
            }
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¸¨à¸±à¸¥à¸¢à¸?à¸£à¸£à¸¡à¸­à¸­à¸?à¹?à¹?à¸?à¸?à¸´à¸?à¸´à¸?à¸ªà¹?',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
            stbangna.executeUpdate(sql);
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¸¨à¸±à¸¥à¸¢à¸?à¸£à¸£à¸¡à¸­à¸­à¸?à¹?à¹?à¸?à¸?à¸´à¸?à¸´à¸?à¸ªà¹?',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }
            //à¸?à¸¶à¸?à¸?à¸¸à¸¡à¸²à¸£à¹?à¸§à¸?à¸?à¸£à¸£à¸¡
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('151') "
                    +"and pt01.mnc_date >= '"+date_start+"' and pt01.mnc_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' "
                    +"group by pt01.mnc_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('151') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            chk=false;
            rsmainhis = stmainhis.executeQuery(sql);
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            if(diff_date1!=0.0){
                avg_date = cnt_date1/cal_date;
            }
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¸?à¸¸à¸¡à¸²à¸£à¹?à¸§à¸?à¸?à¸£à¸£à¸¡',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
            stbangna.executeUpdate(sql);
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¸?à¸¸à¸¡à¸²à¸£à¹?à¸§à¸?à¸?à¸£à¸£à¸¡',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }
            //à¸?à¸¶à¸?à¸?à¸±à¸?à¸©à¸¸à¸§à¸´à¸?à¸¢à¸²
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('171') "
                    +"and pt01.mnc_date >= '"+date_start+"' and pt01.mnc_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' "
                    +"group by pt01.mnc_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('171') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            chk=false;
            rsmainhis = stmainhis.executeQuery(sql);
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            if(diff_date1!=0.0){
                avg_date = cnt_date1/cal_date;
            }
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¸?à¸±à¸?à¸©à¸¸à¸§à¸´à¸?à¸¢à¸²',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
            stbangna.executeUpdate(sql);
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¸?à¸±à¸?à¸©à¸¸à¸§à¸´à¸?à¸¢à¸²',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }
            //à¸?à¸¶à¸?à¹?à¸ªà¸?à¸¨à¸­à¸?à¸²à¸ªà¸´à¸?
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('161') "
                    +"and pt01.mnc_date >= '"+date_start+"' and pt01.mnc_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' "
                    +"group by pt01.mnc_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('161') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            chk=false;
            rsmainhis = stmainhis.executeQuery(sql);
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            avg_date = cnt_date1/cal_date;
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¹?à¸ªà¸?à¸¨à¸­à¸?à¸²à¸ªà¸´à¸?',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
            stbangna.executeUpdate(sql);
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¹?à¸ªà¸?à¸¨à¸­à¸?à¸²à¸ªà¸´à¸?',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }
            //à¸?à¸¶à¸?à¸­à¸·à¹?à¸?à¹?
            if(flag.equals("detail")){
                sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('161') "
                    +"and pt01.mnc_date >= '"+date_start+"' and pt01.mnc_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' "
                    +"group by pt01.mnc_date ";
            }
            else{
                sql="Select count(pt01.mnc_hn_no) as cnt_date, pt08.mnc_ds_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                    +"From patient_t01 pt01 "
                    +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                    +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                    +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                    +"where pt01.mnc_sec_no in ('161') "
                    +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                    +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                    +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
            }
            chk=false;
            rsmainhis = stmainhis.executeQuery(sql);
            cnt_date1=0.0;
            diff_date1=0.0;
            while(rsmainhis.next()){
                chk=true;
                if(flag.equals("detail")){
                    date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                }
                if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                    cnt_date = rsmainhis.getString("cnt_date");
                    cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                }
                if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                    diff_date = rsmainhis.getString("diff_date");
                    diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                }
            }
            rsmainhis.close();
            avg_date = cnt_date1/cal_date;
            sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('"+date_admit+"','à¸­à¸·à¹?à¸?à¹?',"+bed+","
                    +cnt_date1+","+avg_date+","+diff_date1+") ";
            stbangna.executeUpdate(sql);
            if(chk==false){
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                    +"admit_total, admit_avg, admit_day_total) "
                    +"Values('','à¸­à¸·à¹?à¸?à¹?',"+bed+","
                    +"0,0,0) ";
                stbangna.executeUpdate(sql);
            }

            connmainhis.close();
            connbangna.close();
        } catch (Exception ex) {
            Logger.getLogger(RptBangna.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    public void getDailyPatientAdmitWard(String branch_id, String date_start, String date_end,
            String flag, String bed){
        String sql="", date_admit="", cnt_date="", diff_date="";
        Double avg_date=0.0, cnt_date1=0.0, diff_date1=0.0, cal_date=0.0;
        Connection connmainhis, connbangna;
        Statement stmainhis, stbangna;
        ResultSet rsmainhis, rsbangna;
        Vector ward = new Vector();
        boolean chk=false;
        try {
            connmainhis = config1.getConnectionMainHIS(branch_id);
            connbangna = config1.getConnectionBangna();
            stmainhis = connmainhis.createStatement();
            stbangna = connbangna.createStatement();
            sql="Delete From r_daily_patient_admit";
            stbangna.executeUpdate(sql);
            sql="select datediff(d,'"+date_start+"','"+date_end+"') cnt_date from PATIENT_M10";
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                diff_date = rsmainhis.getString("cnt_date");
                cal_date = Double.parseDouble(diff_date);
            }
            rsmainhis.close();
            //à¸?à¸¶à¸?à¸­à¸²à¸¢à¸¸à¸£à¸?à¸£à¸£à¸¡
            sql="Select mnc_md_dep_dsc From patient_m32 Where mnc_typ_pt = 'I'";
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                ward.add(rsmainhis.getString("mnc_md_dep_dsc"));
            }
            rsmainhis.close();
            for(int i=0;i<=ward.size()-1;i++){
                if(flag.equals("detail")){
                    sql="Select pt08.mnc_ad_date, count(pt01.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                        +"From patient_t01 pt01 "
                        +"inner join patient_m32 pm32 on pt01.mnc_sec_no = pm32.mnc_sec_no "
                        +"inner join patient_t08 pt08 on pt01.mnc_date = pt08.mnc_date and "
                        +"pt01.mnc_hn_no = pt08.mnc_hn_no and pt01.mnc_pre_no = pt08.mnc_pre_no "
                        +"where pt01.mnc_sec_no in ('111','112','113','114','115','116') "
                        +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                        +"and pt01.mnc_adm_flg = 'A' and (pt08.mnc_ds_date is not null) "
                        +"group by pt08.mnc_ad_date ";
                }
                else{
                    sql="Select pt08.mnc_hn_no, count(pt08.mnc_hn_no) as cnt_date, datediff(d,mnc_ad_date,mnc_ds_date) as diff_date "
                        +"From patient_t08 pt08 "
                        +"inner join patient_m32 pm32 on pt08.mnc_wd_no = pm32.mnc_md_dep_no "
                        +"where pm32.mnc_md_dep_dsc = '"+ward.get(i).toString()+"' "
                        +"and pt08.mnc_ad_date >= '"+date_start+"' and pt08.mnc_ad_date <= '"+date_end+"' "
                        +"and (pt08.mnc_ds_date is not null) "
                        +"group by pt08.mnc_ad_date,pt08.mnc_ds_date,pt08.mnc_hn_no ";
                }
                rsmainhis = stmainhis.executeQuery(sql);
                if(ward.get(i).equals("WARD4B")){
                    sql="";
                }
                chk=false;
                cnt_date1=0.0;
                diff_date1=0.0;
                while(rsmainhis.next()){
                    chk=true;
                    if(flag.equals("detail")){
                        date_admit = rsmainhis.getString("mnc_ad_date").substring(0, 10);
                    }
                    if((rsmainhis.getString("cnt_date")!=null) && (!rsmainhis.getString("cnt_date").equals(""))){
                        cnt_date = rsmainhis.getString("cnt_date");
                        cnt_date1 = cnt_date1+Double.parseDouble(cnt_date);
                    }
                    if((rsmainhis.getString("diff_date")!=null) && (!rsmainhis.getString("diff_date").equals(""))){
                        diff_date = rsmainhis.getString("diff_date");
                        diff_date1 = diff_date1+Double.parseDouble(diff_date)+1;
                    }
                    if(diff_date1!=0.0){
                        avg_date = cnt_date1/cal_date;
                    }
                    
                }
                rsmainhis.close();
                sql="Insert Into r_daily_patient_admit(date_admit, sec_dsc, bed, "
                        +"admit_total, admit_avg, admit_day_total) "
                        +"Values('"+date_admit+"','"+ward.get(i).toString()+"',"+bed+","
                        +cnt_date1+","+avg_date+","+diff_date1+") ";
                    stbangna.executeUpdate(sql);
            }
        
            connmainhis.close();
            connbangna.close();
        } catch (Exception ex) {
            Logger.getLogger(RptBangna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public void getMonthlyDoctorCosts(String branch_id, String date_start, String date_end,
        String dot_cd_start){
        String sql="", doctor_namet="", doctor_id="", cnt_p="", cnt_s="";
        String sum_p_pharmacy="", sum_s_pharmacy="";
        String sum_p_lab="", sum_s_lab="";
        Double avg_p_pharmacy=0.0,avg_s_pharmacy=0.0,avg_p_lab=0.0,avg_s_lab=0.0;
        Connection connmainhis, connbangna, connbangna1;
        Statement stmainhis, stbangna, stbangna1;
        ResultSet rsmainhis, rsbangna;
        Vector ward = new Vector();
        boolean chk=false;
        try {
            connmainhis = config1.getConnectionMainHIS(branch_id);
            connbangna = config1.getConnectionBangna();
            connbangna1 = config1.getConnectionBangna();
            stmainhis = connmainhis.createStatement();
            stbangna = connbangna.createStatement();
            stbangna1 = connbangna.createStatement();
            sql="Delete From r_month_doctor_costs";
            stbangna.executeUpdate(sql);
            sql="Select pt01.mnc_dot_cd, pm02.mnc_pfix_dsc + ' ' + pm26.mnc_dot_fname + ' ' + pm26.mnc_dot_lname as fullnamet "
                +"From patient_t01 pt01 inner join patient_m26 pm26 on "
                +"pt01.mnc_dot_cd = pm26.mnc_dot_cd inner join patient_m02 pm02 on "
                +"pm26.mnc_dot_pfix = pm02.mnc_pfix_cd "
                +"Where pt01.mnc_date >= '"+ date_start+"' and pt01.mnc_date<='"+date_end+"' and "
                +"pt01.mnc_sts <> 'C' "
                +"group by pt01.mnc_dot_cd, pm02.mnc_pfix_dsc, pm26.mnc_dot_fname , pm26.mnc_dot_lname "
                +"Order By pm26.mnc_dot_fname ";
            rsmainhis = stmainhis.executeQuery(sql);
            while(rsmainhis.next()){
                doctor_namet = rsmainhis.getString("fullnamet");
                doctor_id = rsmainhis.getString("mnc_dot_cd");
                doctor_namet = doctor_namet.replace("'", "''");
                sql="Insert Into r_month_doctor_costs(dot_cd, dot_namet) "
                    +"Values('"+doctor_id+"','"+doctor_namet+"')";
                stbangna.executeUpdate(sql);
            }
            rsmainhis.close();
            sql="Select * From r_month_doctor_costs ";
            rsbangna = stbangna.executeQuery(sql);
            while(rsbangna.next()){
                doctor_id = rsbangna.getString("dot_cd");
                cnt_p="0";
                cnt_s="0";
                sum_p_pharmacy="0";
                sum_s_pharmacy="0";
                sum_p_lab="0";
                sum_s_lab="0";
                //sum count patient
                sql="SELECT FINANCE_M02.MNC_FN_STS, SUM(1) AS total "
                    +"FROM PHARMACY_M16_1 INNER JOIN "
                    +"PATIENT_M26_2 ON PHARMACY_M16_1.MNC_SPC_NO = PATIENT_M26_2.MNC_SPC_NO INNER JOIN "
                    +"PATIENT_T01 INNER JOIN "
                    +"PATIENT_M26 ON PATIENT_T01.MNC_DOT_CD = PATIENT_M26.MNC_DOT_CD INNER JOIN "
                    +"FINANCE_M02 ON PATIENT_T01.MNC_FN_TYP_CD = FINANCE_M02.MNC_FN_TYP_CD ON "
                    +"PATIENT_M26_2.MNC_DOT_CD = PATIENT_M26.MNC_DOT_CD "
                    +"WHERE (PATIENT_T01.MNC_DATE BETWEEN '"+date_start+"' AND  '"+date_end+"') and "
                    +"FINANCE_M02.MNC_FN_STS in ('P','S') and "
                    +"PATIENT_T01.mnc_dot_cd = '"+doctor_id+"' "
                    +"GROUP BY FINANCE_M02.MNC_FN_STS";
                rsmainhis = stmainhis.executeQuery(sql);
                while(rsmainhis.next()){                    
                    if(rsmainhis.getString("mnc_fn_sts").equals("P")){
                        cnt_p=rsmainhis.getString("total");
                    }
                    else{
                        cnt_s=rsmainhis.getString("total");
                    }
                    if(cnt_s.equals("")){
                        cnt_s="0";
                    }
                    if(cnt_p.equals("")){
                        cnt_p="0";
                    }
                }
                rsmainhis.close();
                sql="Update r_month_doctor_costs Set uc_cnt = "+cnt_p+", pks_cnt = "+cnt_s+" "
                            +"Where dot_cd = '"+doctor_id +"' ";
                stbangna1.executeUpdate(sql);

                //sum pharmacy patient
                sql="SELECT  FINANCE_M02.MNC_FN_STS, SUM(dbo.PHARMACY_M05.MNC_PH_RFN * PHARMACY_T06.MNC_PH_QTY) AS total "
                    +"FROM PHARMACY_T06 INNER JOIN "
                    +"PHARMACY_T05 ON PHARMACY_T06.MNC_DOC_CD = PHARMACY_T05.MNC_DOC_CD AND "
                    +"PHARMACY_T06.MNC_CFR_YR = PHARMACY_T05.MNC_CFR_YR AND  "
                    +"PHARMACY_T06.MNC_CFR_NO = PHARMACY_T05.MNC_CFR_NO AND "
                    +"PHARMACY_T06.MNC_CFR_DAT = PHARMACY_T05.MNC_CFG_DAT INNER JOIN "
                    +"PHARMACY_M16_1 INNER JOIN "
                    +"PATIENT_M26_2 ON PHARMACY_M16_1.MNC_SPC_NO = PATIENT_M26_2.MNC_SPC_NO INNER JOIN "
                    +"PATIENT_T01 INNER JOIN "
                    +"PATIENT_M26 ON PATIENT_T01.MNC_DOT_CD = PATIENT_M26.MNC_DOT_CD INNER JOIN "
                    +"FINANCE_M02 ON .PATIENT_T01.MNC_FN_TYP_CD = FINANCE_M02.MNC_FN_TYP_CD ON "
                    +"PATIENT_M26_2.MNC_DOT_CD = PATIENT_M26.MNC_DOT_CD ON PHARMACY_T05.MNC_HN_YR = PATIENT_T01.MNC_HN_YR AND "
                    +"PHARMACY_T05.MNC_HN_NO = PATIENT_T01.MNC_HN_NO AND PHARMACY_T05.MNC_PRE_NO = PATIENT_T01.MNC_PRE_NO AND "
                    +"PHARMACY_T05.MNC_DATE = PATIENT_T01.MNC_DATE INNER JOIN "
                    +"PHARMACY_M05 ON PHARMACY_T06.MNC_PH_CD = PHARMACY_M05.MNC_PH_CD "
                    +"WHERE (PATIENT_T01.MNC_DATE BETWEEN '"+date_start+"' AND '"+date_end+"') AND "
                    +"finance_m02.MNC_FN_typ_cd IN ('66','88','44','45','47','48') and "
                    +"FINANCE_M02.MNC_FN_STS in ('P','S') and "
                    +"PATIENT_T01.mnc_dot_cd = '"+doctor_id+"' and "
                    +"(PHARMACY_T05.MNC_CFR_STS <> 'C') "
                    +"GROUP BY FINANCE_M02.MNC_FN_STS ";
                rsmainhis = stmainhis.executeQuery(sql);
                while(rsmainhis.next()){
                    if(rsmainhis.getString("mnc_fn_sts").equals("P")){
                        sum_p_pharmacy=rsmainhis.getString("total");
                    }
                    else{
                        sum_s_pharmacy=rsmainhis.getString("total");
                    }
                    if(sum_s_pharmacy.equals("")){
                        sum_s_pharmacy="0";
                    }
                    if(sum_p_pharmacy.equals("")){
                        sum_p_pharmacy="0";
                    }
                }
                rsmainhis.close();
                if(!cnt_p.equals("0")){
                    avg_p_pharmacy=Double.parseDouble(sum_p_pharmacy)/Double.parseDouble(cnt_p);
                }
                if(!cnt_s.equals("0")){
                    avg_s_pharmacy=Double.parseDouble(sum_s_pharmacy)/Double.parseDouble(cnt_s);
                }
                sql="Update r_month_doctor_costs Set uc_pharmacy_price = "+sum_p_pharmacy
                        +", pks_pharmacy_price = "+sum_s_pharmacy+", "
                        +"uc_pharmacy_avg = "+avg_p_pharmacy+", "
                        +"pks_pharmacy_avg = "+ avg_s_pharmacy+" "
                            +"Where dot_cd = '"+doctor_id +"' ";
                stbangna1.executeUpdate(sql);



                //sum lab patient
                sql="SELECT FINANCE_M02.MNC_FN_STS, SUM(LAB_T02.MNC_LB_PRI) AS total "
                    +"FROM  LAB_T02 INNER JOIN "
                    +"LAB_T01 ON LAB_T02.MNC_REQ_YR = LAB_T01.MNC_REQ_YR AND LAB_T02.MNC_REQ_NO = LAB_T01.MNC_REQ_NO AND "
                    +"LAB_T02.MNC_REQ_DAT = LAB_T01.MNC_REQ_DAT INNER JOIN "
                    +"PHARMACY_M16_1 INNER JOIN "
                    +"PATIENT_M26_2 ON PHARMACY_M16_1.MNC_SPC_NO = PATIENT_M26_2.MNC_SPC_NO INNER JOIN "
                    +"PATIENT_T01 INNER JOIN "
                    +"PATIENT_M26 ON PATIENT_T01.MNC_DOT_CD = PATIENT_M26.MNC_DOT_CD INNER JOIN "
                    +"FINANCE_M02 ON PATIENT_T01.MNC_FN_TYP_CD = FINANCE_M02.MNC_FN_TYP_CD ON "
                    +"PATIENT_M26_2.MNC_DOT_CD = PATIENT_M26.MNC_DOT_CD ON LAB_T01.MNC_HN_NO = PATIENT_T01.MNC_HN_NO AND "
                    +"LAB_T01.MNC_PRE_NO = PATIENT_T01.MNC_PRE_NO AND LAB_T01.MNC_DATE = PATIENT_T01.MNC_DATE "
                    +"WHERE     (PATIENT_T01.MNC_DATE BETWEEN '06/01/2009' AND '06/30/2009') "
                    +"AND finance_m02.MNC_FN_typ_cd IN ('66','88','44','45','47','48') and "
                    +"FINANCE_M02.MNC_FN_STS in ('P','S') and "
                    +"PATIENT_T01.mnc_dot_cd = '"+doctor_id+"' "
                    +"GROUP BY FINANCE_M02.MNC_FN_STS ";
                rsmainhis = stmainhis.executeQuery(sql);
                while(rsmainhis.next()){
                    if(rsmainhis.getString("mnc_fn_sts").equals("P")){
                        sum_p_lab=rsmainhis.getString("total");
                    }
                    else{
                        sum_s_lab=rsmainhis.getString("total");
                    }
                    if(sum_p_lab.equals("")){
                        sum_p_lab="0";
                    }
                    if(sum_s_lab.equals("")){
                        sum_s_lab="0";
                    }
                }
                rsmainhis.close();
                if(!cnt_p.equals("0")){
                    avg_p_lab=Double.parseDouble(sum_p_lab)/Double.parseDouble(cnt_p);
                }
                if(!cnt_s.equals("0")){
                    avg_s_lab=Double.parseDouble(sum_s_lab)/Double.parseDouble(cnt_s);
                }
                sql="Update r_month_doctor_costs Set uc_lab_price = "+sum_p_lab
                        +", pks_lab_price = "+sum_s_lab+", "
                        +"uc_lab_avg="+avg_p_lab+", "
                        +"pks_lab_avg="+avg_s_lab+" "
                        +"Where dot_cd = '"+doctor_id +"' ";
                stbangna1.executeUpdate(sql);
            }
            rsbangna.close();

            
            
            connmainhis.close();
            connbangna.close();
        }
        catch(Exception ex){
            Logger.getLogger(RptBangna.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
