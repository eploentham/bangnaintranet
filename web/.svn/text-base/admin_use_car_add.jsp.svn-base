<%-- 
    Document   : admin_use_car_add
    Created on : 8 ก.ย. 2552, 0:53:57
    Author     : pop
--%>
<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
AdminTUseCar use_car = new AdminTUseCar();
AdminTUseCarDB use_cardb = new AdminTUseCarDB();
BDepartmentDB b_departmentdb = new BDepartmentDB();
AdminBCarDB b_cardb = new AdminBCarDB();
bangnaLibrary.BBranch branch = new bangnaLibrary.BBranch();
Vector v_use_car = new Vector();
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
String use_car_date="",cbo_department="",apply_date="", department_id="", branch_id="",cbo_car="", car_id="";
String use_car_id="", current_date="",flag="", user_namet_driver="", user_id_driver="", user_id_approve="", user_namet_approve="";
String user_id_use_car="", user_namet_use_car="", destination="",description="",remark="",use_category="", use_car_date1="";
String use_car_time="";
if(request.getParameter("txt_use_car_id")!=null) {
        use_car_id = new String (request.getParameter("txt_use_car_id").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("cbo_car")!=null) {
        car_id = new String (request.getParameter("cbo_car").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_branch_id")!=null) {
        branch_id = new String (request.getParameter("txt_branch_id").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("flag")!=null) {
        flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_use_car_date")!=null) {
        use_car_date1 = new String (request.getParameter("txt_use_car_date").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_use_car_time")!=null) {
        use_car_time = new String (request.getParameter("txt_use_car_time").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("cbo_department")!=null) {
        department_id = new String (request.getParameter("cbo_department").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("chk_use_category")!=null) {
        use_category = new String (request.getParameter("chk_use_category").getBytes("ISO8859_1"),"TIS-620");
        }

if(request.getParameter("txt_destination")!=null) {
        destination = new String (request.getParameter("txt_destination").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_description")!=null) {
        description = new String (request.getParameter("txt_description").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_remark")!=null) {
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_user_id_use_car")!=null) {
        user_id_use_car = new String (request.getParameter("txt_user_id_use_car").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_user_namet_use_car")!=null) {
        user_namet_use_car = new String (request.getParameter("txt_user_namet_use_car").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_user_id_approve")!=null) {
        user_id_approve = new String (request.getParameter("txt_user_id_approve").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_user_namet_approve")!=null) {
        user_namet_approve = new String (request.getParameter("txt_user_namet_approve").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_user_id_driver")!=null) {
        user_id_driver = new String (request.getParameter("txt_user_id_driver").getBytes("ISO8859_1"),"TIS-620");
        }
if(request.getParameter("txt_user_namet_driver")!=null) {
        user_namet_driver = new String (request.getParameter("txt_user_namet_driver").getBytes("ISO8859_1"),"TIS-620");
        }
if(branch_id.equals("")){
        branch = config1.getBranchActive();
        branch_id = branch.getBranchId();
        }

current_date = config1.getDate("ddMMyyyy");

use_car = use_cardb.getAdminTUseCarOrderByPK(use_car_id);
use_car_date = config1.DateFormatDB2Show(use_car.getUseCarDate(), "ddMMyyyy");
if(use_car_date.equals("")){
    use_car_date = use_car_date1;
    }
apply_date = config1.DateFormatDB2Show(use_car.getApplyDate(), "ddMMyyyy");
if(use_car.getBranchId().equals("")){
    use_car.setBranchId(branch_id);
    }
if(use_car.getApplyDate().equals("")){
    use_car.setApplyDate(current_date);
    apply_date=current_date;
    }
if(flag.equals("userusecarhnno")){
        user_namet_use_car = config1.getEmployeeFullNamet(branch_id, user_id_use_car);
        use_car.setUserIdUseCar(user_id_use_car);
        use_car.setUserNametUseCar(user_namet_use_car);
        }
else if(flag.equals("userapprovehnno")) {
        user_namet_approve = config1.getEmployeeFullNamet(branch_id, user_id_approve);
        use_car.setUserIdApprove(user_id_approve);
        use_car.setUserNametApprove(user_namet_approve);
        }
else if(flag.equals("userdriverhnno")) {
        user_namet_driver = config1.getEmployeeFullNamet(branch_id, user_id_driver);
        use_car.setUserIdDriver(user_id_driver);
        use_car.setUserNametDriver(user_namet_driver);
        }
if(use_car.getDepartmentId().equals("")){
    use_car.setDepartmentId(department_id);
    }
if(use_car.getUseCategory().equals("")){
    use_car.setUseCategory(use_category);
    }
if(use_car.getCarId().equals("")){
    use_car.setCarId(car_id);
    }
if(use_car.getUseCarTime().equals("")){
    use_car.setUseCarTime(use_car_time);
    }
if(use_car.getUserIdUseCar().equals("")){
    use_car.setUserIdUseCar(user_id_use_car);
    }
if(use_car.getUserNametUseCar().equals("")){
    use_car.setUserNametUseCar(user_namet_use_car);
    }
if(use_car.getUserIdApprove().equals("")){
    use_car.setUserIdApprove(user_id_approve);
    }
if(use_car.getUserNametApprove().equals("")){
    use_car.setUserNametApprove(user_namet_approve);
    }
if(use_car.getUserIdDriver().equals("")){
    use_car.setUserIdDriver(user_id_driver);
    }
if(use_car.getUserNametDriver().equals("")){
    use_car.setUserNametDriver(user_namet_driver);
    }
if(use_car.getDestination().equals("")){
    use_car.setDestination(destination);
    }
if(use_car.getDescription().equals("")){
    use_car.setDescription(description);
    }
if(use_car.getRemark().equals("")){
    use_car.setRemark(remark);
    }
cbo_department = b_departmentdb.CboDepartment(branch_id,use_car.getDepartmentId());
cbo_car = b_cardb.CboCar(branch_id,use_car.getCarId());
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>
        <script type="text/javascript">
           // Load Dojo's code relating to the Button widget
           dojo.require("dijit.form.Button");
        </script>
        <script type="text/javascript">
          dojo.require("dijit.form.DateTextBox");
          dojo.require("dojo.parser");
        </script>

         <style type="text/css">
          .progressBar {
            position: relative;
            width: 256px;
            height: 16px;
            border: 1px solid black;
          }
        </style>
        <style type="text/css">
          div.error {
            color: red;
          }
        </style>
        <script type="text/javascript">
      var framework = new ValidatorFramework();
      window.onload = function() {
        Event.observe('asset_view','submit',function(event) {
          if (!framework.validateForm(event.target))
            Event.stop(event);
        });
        Event.observe('asset_view','keyup',function(event) {
          framework.validateForm(event.target.form);
        });
      }
    </script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#txt_use_car_date").datepicker({ dateFormat: 'dd-mm-yy' });

            });

        </script>
        <style type="text/css">
            .blue { color: blue; }
        </style>

    </head>
    <body>
        <form name="admin_use_car_add" id="admin_use_car_add" action="admin_use_car_save.jsp" method="POST">
            <%@include  file="admin_use_car_header.jsp" %>
            
            <table border="0" width="100%" align="center">
                <thead>
                    <tr>
                        <th colspan="3"><div align="center" id="test">ใบขออนุญาตใช้รถ&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                            <label><A HREF="#" onClick="changesubmitusecarsave();" NAME="anchor" ID="anchor">
        บันทึกข้อมูล&nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle"
      height="16" border="0"></A></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <label>
            <A HREF="#" onClick="changesubmitusecarprint();" NAME="anchor" ID="anchor">
                พิมพ์ใบขอใช้รถ&nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle"
        height="16" border="0"></A></label></div></th>
                    </tr>
                </thead>
                <tbody>
                    <tr> <th width="120">เลขที่ใบขอรถ:</th>
                        <td class="style14">
        <input type="text" name="txt_use_car_id" id="txt_use_car_id" value="<% out.print(use_car.getUseCarId());%>" readonly="readonly" size="8" >
        <input type="hidden" name="txt_use_car_active" id="txt_use_car_active" value="<%out.print(use_car.getUseCarActive());%>">
        <input type="hidden" name="txt_branch_id" id="txt_branch_id" value="<%out.print(use_car.getBranchId());%>">
        &nbsp;&nbsp;&nbsp;<A HREF="#" onClick="changesubmitusecarcancel();" NAME="anchor" ID="anchor">
<img src="images/trash1.gif" alt="" width="20" height="16" border="0">ยกเลิก</A>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;วันที่ใช้รถ: &nbsp;
        <input type="text" name="txt_use_car_date" id="txt_use_car_date" value="<% out.print(use_car_date);%>" readonly="readonly" class="dateinput" size="9">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;เวลาขอรถ: &nbsp;
        <input type="text" name="txt_use_car_time" id="txt_use_car_time" value="<% out.print(use_car.getUseCarTime());%>" class="dateinput" size="9">
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;วันที่ขอรถ: &nbsp;
        <input type="text" name="txt_apply_date" id="txt_apply_date" value="<% out.print(apply_date);%>" readonly="readonly" class="dateinput" size="9">
        
                        </td>
                    </tr>
                    <tr>
                        <th>แผนกที่ขอ:</th>
                        <td class="style14"><select name="cbo_department" id="cbo_department" >
                                    <%out.print(cbo_department); %>
                        </select>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ประเภทรถ: &nbsp;
<label><input type="radio" name="chk_use_category" value="1" id="use_category_1"  <% if(use_car.getUseCategory().equals("1")) { out.print("checked"); }%> >&nbsp;รถทั่วไป</label>
<label><input type="radio" name="chk_use_category" value="2" id="use_category_2"  <% if(use_car.getUseCategory().equals("2")) { out.print("checked"); }%> >&nbsp;รถฉุกเฉิน</label>
                    
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;ทะเบียนรถ: &nbsp;
        <select name="cbo_car" id="cbo_car" >
                    <%out.print(cbo_car); %>
        </select>
                        </td>
                    </tr>
                    <tr>
                        <th>สถานที่ไป:</th>
                        <td class="style14">
    <input type="text" name="txt_destination" id="txt_destination" value="<% out.print(use_car.getDestination());%>" size="30">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;รายละเอียด: &nbsp;
    <input type="text" name="txt_description" id="txt_description" value="<% out.print(use_car.getDescription());%>" size="30">
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;หมายเหตุ: &nbsp;
    <input type="text" name="txt_remark" id="txt_remark" value="<% out.print(use_car.getRemark());%>" size="20">
                        </td>
                    </tr>
                    <tr>
                        <th>เจ้าหน้าที่ผู้ขอรถ:</th>
                        <td class="style14">
    <input type="text" name="txt_user_id_use_car" id="txt_user_id_use_car" value="<%out.print(use_car.getUserIdUseCar());%>" size="5" onblur="changesubmithnnousecar();">
      <input type="text" name="txt_user_namet_use_car" id="txt_user_namet_use_car" value="<%out.print(use_car.getUserNametUseCar());%>" size="18" >
          &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;เจ้าหน้าที่ผู้อนุมัติ: &nbsp;
          <input type="text" name="txt_user_id_approve" id="txt_user_id_approve" value="<%out.print(use_car.getUserIdApprove());%>" size="5" onblur="changesubmithnnoapprovecar();">
      <input type="text" name="txt_user_namet_approve" id="txt_user_namet_approve" value="<%out.print(use_car.getUserNametApprove());%>" size="18">
      &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;คนขับ: &nbsp;
          <input type="text" name="txt_user_id_driver" id="txt_user_id_driver" value="<%out.print(use_car.getUserIdDriver());%>" size="5" onblur="changesubmithnnodrivercar();">
      <input type="text" name="txt_user_namet_driver" id="txt_user_namet_driver" value="<%out.print(use_car.getUserNametDriver());%>" size="12">
                        </td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>   
    <script>
    function changesubmitusecarsave() {
          //var usernametfoodsorder = document.getElementById("cbo_user_foods_order").value;
          //var usernametfoodsreceive = document.getElementById("cbo_user_foods_receive").value;
          //var usernametnutritionist = document.getElementById("cbo_user_foods_nutritionist").value;
          //var usernametfoodsorder="",usernametfoodsreceive="",usernametnutritionist="";
        document.forms[0].action = "admin_use_car_save.jsp?flag=use_car_save";
        document.forms[0].submit();
        return false;
      }
      function changesubmitusecarcancel() {
        document.forms.admin_use_car_add.txt_use_car_active.value = '3';
        document.forms[0].action = "admin_use_car_save.jsp?flag=use_car_save&flag_redirect=cancel";
        document.forms[0].submit();
        return false;
      }
      function changesubmitusecarprint() {
        var use_car_id = document.getElementById("txt_use_car_id").value;
        document.forms[0].action = "rpt_report_view.jsp?txt_report_name=admin_use_car&txt_form=daily&use_car_id="+use_car_id;
        document.forms[0].submit();
        return false;
      }
      function changesubmithnnousecar() {
          document.forms[0].action = "admin_use_car_add.jsp?flag=userusecarhnno";
        document.forms[0].submit();
        return false;
      }
      function changesubmithnnoapprovecar() {
          document.forms[0].action = "admin_use_car_add.jsp?flag=userapprovehnno";
        document.forms[0].submit();
        return false;
      }
      function changesubmithnnodrivercar() {
          document.forms[0].action = "admin_use_car_add.jsp?flag=userdriverhnno";
        document.forms[0].submit();
        return false;
      }
    </script>
</html>
