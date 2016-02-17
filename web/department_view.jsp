<%-- 
    Document   : department_view
    Created on : Feb 4, 2010, 12:10:59 PM
    Author     : root
--%>
<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
String cbo_branch="", branch_id="", text="", date_current="";
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
ComboDB combodb = new ComboDB();
bangnaLibrary.BBranch branch = new bangnaLibrary.BBranch();
BDepartmentDB b_departmentdb = new BDepartmentDB();
BDepartment b_department = new BDepartment();
Vector v_department = new Vector();
try {
    if(request.getParameter("cbo_branch")!=null) {
            branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
        }
    if(branch_id.equals("")) {
        branch = config1.getBranchActive();
        branch_id = branch.getBranchId();
        }
    cbo_branch = combodb.getComboBranch(branch_id);
    date_current = config1.getDate("ddMMyyyy");
    v_department = b_departmentdb.SelectDepartment(branch_id);
    text+="<tr><td width='200'>Department</td><td width='300'>Telephone</td></tr>";
    for(int i=0;i<=v_department.size()-1;i++){
        b_department = (BDepartment)v_department.get(i);
        text+="<tr><td>"+b_department.getDepartmentNamet()+"</td><td>"+b_department.getTelephone()+"</td></tr>";
        }
    //v_medical_cert_company = medical_cert_companydb.getOpdTMedicalCertCompany(branch_id, "", "", "");
    //for(int i=0;i<=v_medical_cert_company.size()-1;i++){
    //
    //    }
    text="<table align='center'>"+text+"</table>";

} catch (Exception ex) {
    text = ex.getMessage();
}
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <!-- <link href="css/tab.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">
        <link href="css/style.css" rel="stylesheet" type="text/css">-->
        <style type="text/css" title="currentStyle">
                @import "css/css.css";
                @import "css/demo_table.css";
                @import "css/jquery-ui-1.7.2.custom.css";
                @import "css/jquery.treeTable.css";
        </style>

        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>
        <script type="text/javascript" src="js/ui.dialog.js"></script>
        <script type="text/javascript" src="js/jquery.dataTables.js"></script>
        <script type="text/javascript" src="js/jquery.treeTable.js"></script>
        <script type="text/javascript" src="js/jquery.numeric.js"></script>

        <script type="text/javascript">
            $(document).ready(function() {
                hideLoader();
                
                $("input.numeric").numeric();
                $("#example").treeTable();
                showSearch();
                //$("#tabs").tabs();
            });
            function showSearch() {
            $("#tr_view").load("medical_cert_company_f_view.jsp",
                {date_current: $("#txt_date_current").val(), branch_id: $("#cbo_branch").val(), flagpage: 'view_old'},
                function() {hideLoader();})
            }
            function showLoader() {
                $("#loading").show();
            }
            function hideLoader() {
                $("#loading").hide();
            }
        </script>
    </head>
    <body>
        <form name="department_view" id="department_view" method="post">
            
            <table align="center" width="600"><tr><td>
                        <fieldset class="style14r">
                            <legend>เงื่อนไข:</legend>
                            <label>&nbsp;&nbsp;สาขา :&nbsp;<select name="cbo_branch" id="cbo_branch">
                                <%out.print(cbo_branch); %>
                </select></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="button" name="btn_seacrh" id="btn_search" value=" ค้นหา...      " />

<label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <A HREF="#" onClick="changesubmitprint();" NAME="anchor" ID="anchor"> พิมพ์ข้อมูล&nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle"
      height="16" border="0"></A></label>
                        </fieldset>
                </td></tr></table>
                <div id="loading"><img src="images/ajax-loader1.gif" name="loader" id="loader"></div>
                <div id="tr_view"></div>
                <table>
                    <% out.print(text);%>
                </table>
        </form>
    </body>
</html>
