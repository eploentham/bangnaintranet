<%-- 
    Document   : admin_foods_order_add
    Created on : 16 ส.ค. 2552, 8:04:28
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
String cbo_branch="", cbo_year="", cbo_month="",cbo_period="",branch_id="",flagpage="",tr_foods_detail="",admin_foods_id="";
String foods_date="",text="",row_color="", date_start="", date_end="", admin_foods_date="",foods_date1="";
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
ComboDB combodb = new ComboDB();
Vector v_foods_order = new Vector();
Integer row=0;
AdminTFoods foods_order = new AdminTFoods();
AdminTFoodsDB foods_orderdb = new AdminTFoodsDB();
AdminTFoodsDetail foods_order_detail = new AdminTFoodsDetail();
if(request.getParameter("flagpage")!=null){
        flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("cbo_branch")!=null) {
    branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
    }
if(request.getParameter("admin_foods_id")!=null) {
    admin_foods_id = new String (request.getParameter("admin_foods_id").getBytes("ISO8859_1"),"TIS-620");
    }
if(flagpage.equals("viewdetail")) {
    foods_order = foods_orderdb.getAdminTFoodsByPK(admin_foods_id);
    date_start = config1.DateFormatDB2Show(foods_order.getDateStart(),"ddMMyyyy");
    date_end = config1.DateFormatDB2Show(foods_order.getDateEnd(),"ddMMyyyy");
    admin_foods_date = config1.DateFormatDB2Show(foods_order.getAdminFoodsDate(),"ddMMyyyy");
    v_foods_order = foods_orderdb.getAdminFoodsOrder(admin_foods_id,"date");
    for(int i=0;i<=v_foods_order.size()-1;i++){
        row++;
        foods_order_detail = (AdminTFoodsDetail)v_foods_order.get(i);
        foods_date = config1.DateFormatDB2Show(foods_order_detail.getFoodsOrderDate(), "ddMMyyyy");
        foods_date1 = foods_order_detail.getFoodsOrderDate().replace("-", "");
        text += "<tr class='style14' "+row_color+"><td width='10' align='center'>"+row.toString()+"</td>"+
        "<td width='15' align='center'>"+foods_date+"</td>"+
        "<td align='center'>"+foods_order_detail.getCntFoodsId()+"</td>"+
        "<td align='center'>"+foods_order_detail.getCntFoodsId()+"</td>"+
        "<td align='center'><a href='javascript:changedetailshow("+foods_date1+");'>ดูรายละเอียดสรุป</a></td>" +
        "<td align='center'><a href='javascript:changedetailnurseshow("+foods_date1+");'>ดูรายละเอียดพยาบาลป้อน</a></td></tr>" ;
        }
    }
cbo_branch = combodb.getComboBranch(branch_id);
cbo_month=combodb.getComboMonth(foods_order.getAdminFoodsMonth());
cbo_year=combodb.getComboYear(foods_order.getAdminFoodsYear());
cbo_period=combodb.getComboPeriod(foods_order.getAdminFoodsPeriod());
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
            $(document).ready(function(){
                $("#txt_date_start").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#txt_date_end").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#txt_foods_date").datepicker({ dateFormat: 'dd-mm-yy' });
                $("#btn_picture_repair").click(showNurseFoodsOrder);
                $("#anchor_save").click(saveNurseFoodsOrder);
                hideLoader();

            });
            function showNurseFoodsOrder() {
                $("#t_nurse_foods_order").val("");
                showLoader();
                $("#t_nurse_foods_order").load("admin_foods_f_nurse_foods_order.jsp",
                {date_start: $("#txt_date_start").val(),date_end: $("#txt_date_end").val(),branch_id: $("#cbo_branch").val()},
                function() {hideLoader();});                
            }
            function showLoader() {
                $("#loading").show();
            }
            function hideLoader() {
                $("#loading").hide();
            }
            function saveNurseFoodsOrder() {
                $("#t_nurse_foods_order").load("admin_foods_order_save.jsp", {foods_date: $("#txt_foods_date").val(), 
                    date_start: $("#txt_date_start").val(),date_end: $("#txt_date_end").val(),branch_id: $("#cbo_branch").val()
                    ,description: $("#txt_description").val(),remark: $("#txt_remark").val(), year:$("#cbo_admin_foods_year").val()
                    ,month:$("#cbo_admin_foods_month").val(), period:$("#cbo_admin_foods_period").val(), cnt_send:$("#txt_cnt_send").val()
                    ,cnt_receive:$("#txt_cnt_receive").val(), cnt_approve:$("#txt_cnt_approve").val(), nettotal_receive:$("#txt_nettotal_receive").val()
                    ,amount_approve:$("#txt_amount_approve").val(), nettotal_approve:$("#txt_nettotal_approve").val(), amount_receive:$("#txt_amount_receive").val() 
                    , flagpage:$("#txt_flagpage").val(), admin_foods_id:$("#txt_admin_foods_id").val()               });
            }
function changedetailshow(foods_order_date){
    var admin_foods_id = document.getElementById("txt_admin_foods_id").value;
    window.open("admin_foods_order_detail_view.jsp?admin_foods_id="+admin_foods_id+"&foods_order_date="+foods_order_date+"&flagpage=viewdetail",'_blank','width=1000, height=800, left=0,top=0,channelmode=no,status=no,fullscreen=no,menubar=no,resizable=no,scrollbars=yes,location=no,directories=no',true);
                //return false;
}
function changedetailnurseshow(foods_order_date){
    var admin_foods_id = document.getElementById("txt_admin_foods_id").value;
    window.open("admin_foods_order_detail_view.jsp?admin_foods_id="+admin_foods_id+"&foods_order_date="+foods_order_date+"&flagpage=viewnursedetail",'_blank','width=1000, height=800, left=0,top=0,channelmode=no,status=no,fullscreen=no,menubar=no,resizable=no,scrollbars=yes,location=no,directories=no',true);
                //return false;
}
        </script>
        <style type="text/css">
            .blue { color: blue; }
        </style>
    </head>
    <body>
        <form name="admin_foods_order_add" id="admin_foods_order_add" action="admin_foods_order_add.jsp" method="POST">
            <%@include  file="admin_foods_order_header.jsp" %>
            <table border="0" width="100%" align="center">
                <thead>
                    <tr>
                        <th></th>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th>สาขา</th>
                        <td><select name="cbo_branch" id="cbo_branch" >
                                    <%out.print(cbo_branch); %>
                        </select>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         &nbsp;<label>&nbsp;งวด&nbsp;
                        <select name="cbo_admin_foods_period" id="cbo_admin_foods_period">
                            <%out.print(cbo_period); %>
                        </select></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        &nbsp;<label>&nbsp;เดือน&nbsp;<select name="cbo_admin_foods_month" id="cbo_admin_foods_month">
                                <%out.print(cbo_month); %>
                            </select></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;<label>&nbsp;ปี&nbsp;<select name="cbo_admin_foods_year" id="cbo_admin_foods_year">
                                <%out.print(cbo_year); %>
                </select></label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <label>&nbsp;&nbsp;วันทำข้อมูล
    <input type="text" size="10" name="txt_foods_date" id="txt_foods_date" value="<% out.print(admin_foods_date);%>" readonly="readonly" class="dateinput" /></label>
    <div id="loading">  <img src="images/ajax-loader1.gif" name="loader" id="loader"></div></td>
                    </tr>
                    <tr>
                        <th>วันที่เริ่มต้น</th>
                        <td>                            
    <input type="text" size="10" name="txt_date_start" id="txt_date_start" value="<% out.print(date_start);%>" readonly="readonly" class="dateinput" />
    <label>&nbsp;&nbsp;วันที่สิ้นสุด
    <input type="text" size="10" name="txt_date_end" id="txt_date_end" value="<% out.print(date_end);%>" readonly="readonly" class="dateinput" /></label>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <label>1. ดึงข้อมูล&nbsp;<input type="button" name="btn_picture_repair" id="btn_picture_repair" value=" ... " />
</label>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <label><A HREF="#" onClick="changesubmitsave();" NAME="anchor_save" ID="anchor_save">
        2. บันทึกข้อมูล &nbsp;<img src="images/savedrafticon.gif" alt="" width="16" align="middle" height="16" border="0"></A></label>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                         <label><A HREF="#" onClick="changesubmitsave();" NAME="anchor_save" ID="anchor_save">
        3. พิมพ์ใบสำคัญจ่าย &nbsp;<img src="images/printer-a.png" alt="" width="16" align="middle" height="16" border="0"></A></label>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>
            <A HREF="#" onClick="changesubmitcancel();" NAME="anchor" ID="anchor">
                ยกเลิกรายการนี้&nbsp;<img src="images/trash1.gif" alt="" width="16" align="top"
      height="16" border="0"></A></label></td>
                    </tr>
                    <tr>
                        <th>รายละเอียดบิล</th>
                        <td><input type="text" name="txt_description" id="txt_description" title="afdasfsadf" value="<% out.print(foods_order.getDescription());%>" size="45" />
    &nbsp;&nbsp;<label>หมายเหตุ&nbsp;<input type="text" name="txt_remark" id="txt_remark" value="<% out.print(foods_order.getRemark());%>" size="40" /></label></td>
                    </tr>
                    <tr>
                        <th>จำนวนเงินวางบิล</th>
                        <td><input type="text" name="txt_amount_receive" id="txt_amount_receive" value="<% out.print(foods_order.getAmountReceive());%>" size="4" />
    &nbsp;&nbsp;&nbsp;&nbsp;<label>เงินดึงข้อมูล&nbsp;<input type="text" name="txt_nettotal_receive" id="txt_nettotal_receive" value="<% out.print(foods_order.getNettotalReceive());%>" size="4" /></label>
    &nbsp;&nbsp;&nbsp;&nbsp;<label>เงินทำเบิก&nbsp;<input type="text" name="txt_amount_approve" id="txt_amount_approve" value="<% out.print(foods_order.getAmountApprove());%>" size="4" /></label>
    &nbsp;&nbsp;&nbsp;&nbsp;<label>เงินอนุมัติ&nbsp;<input type="text" name="txt_nettotal_approve" id="txt_nettotal_approve" value="<% out.print(foods_order.getNettotalApprove());%>" size="4" /></label>
    &nbsp;&nbsp;&nbsp;&nbsp;<label>จำนวนจานวางบิล&nbsp;<input type="text" name="txt_cnt_send" id="txt_cnt_send" value="<% out.print(foods_order.getCntSend());%>" size="2" /></label>
    &nbsp;&nbsp;&nbsp;&nbsp;<label>จำนวนจานดึงข้อมูล&nbsp;<input type="text" name="txt_cnt_receive" id="txt_cnt_receive" value="<% out.print(foods_order.getCntReceive());%>" size="2" /></label>
    &nbsp;&nbsp;&nbsp;&nbsp;<label>จำนวนจานอนุมัติ&nbsp;<input type="text" name="txt_cnt_approve" id="txt_cnt_approve" value="<% out.print(foods_order.getCntApprove());%>" size="2" /></label></td>
                    </tr>
                </tbody>
            </table>
<input type="hidden" name="txt_admin_foods_id" id="txt_admin_foods_id" value="<% out.print(admin_foods_id);%>" size="40" />
<input type="hidden" name="txt_flagpage" id="txt_flagpage" value="<% out.print(flagpage);%>" size="2" />
        <div id="t_nurse_foods_order"></div>
        
<% if(flagpage.equals("viewdetail")) { %>
        <table border="0" width="100%" align="center">
    <thead>
        <tr align="center" class='style14r'><td width="5" align="center">ลำดับที่</td>
            <td width="8">วันที่</td>
            <td width="20">จำนวน</td>
            <td width="20">มูลค่า</td>
            <td width="20"></td>
            <td width="20"></td>
    </tr></thead>
    <tbody>
        <% out.print(text); %>
    </tbody></table>
<% }%>

        </form>
    </body>
</html>
