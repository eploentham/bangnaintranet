<%-- 
    Document   : admin_use_car_view
    Created on : 8 ก.ย. 2552, 0:54:26
    Author     : pop
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
AdminTUseCar use_car = new AdminTUseCar();
AdminTUseCarDB use_cardb = new AdminTUseCarDB();
BDepartmentDB b_departmentdb = new BDepartmentDB();

bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
ComboDB combodb = new ComboDB();
bangnaLibrary.BBranch branch = new bangnaLibrary.BBranch();
Vector v_use_car = new Vector();
String flagpage="",cbo_branch="",cbo_department="",date_start="",date_end="",text="",branch_id="",department_id="";
String date_current="",date_startdb="",date_enddb="",row_color="",width_date="60",txt_color="",txt_color1="",width_ward="80";
String width_period="250",width_user_order="",width_nutritition="",use_car_date="",width_time="25";
Integer row=0;
try {
    if(request.getParameter("flagpage")!=null) {
        flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("cbo_branch")!=null) {
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("cbo_departmnet")!=null) {
        department_id = new String (request.getParameter("cbo_departmnet").getBytes("ISO8859_1"),"TIS-620");
        }
    
    if(request.getParameter("txt_date_start")!=null) {
        date_start = new String (request.getParameter("txt_date_start").getBytes("ISO8859_1"),"TIS-620");
        }
    if(request.getParameter("txt_date_end")!=null) {
        date_end = new String (request.getParameter("txt_date_end").getBytes("ISO8859_1"),"TIS-620");
        }
    if(flagpage.equals("old_date")){
        date_startdb = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
        date_enddb = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
        }
    else{
        date_startdb = config1.getDate("yyyyMMdd");
        //date_start = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
        date_enddb = config1.getDate("yyyyMMdd");
        }
    cbo_branch = combodb.getComboBranch(branch_id);
    if(branch_id.equals("")){
        branch = config1.getBranchActive();
        branch_id = branch.getBranchId();
        }
    v_use_car = use_cardb.getAdminTUseCar(branch_id, "date",date_startdb,date_enddb);
    date_current = config1.getDate("yyyyMMdd");
    cbo_department = b_departmentdb.CboDepartment(branch_id,department_id);
    
    for(int i=0;i<=v_use_car.size()-1;i++) {
        row++;
        use_car = (AdminTUseCar)v_use_car.get(i);
        use_car_date = config1.DateFormatDB2Show(use_car.getUseCarDate(), "ddMMyyyy");

        row_color = "";
        text+="<tr class='style14r' "+row_color+"> <td align='center' width='15'>"+row.toString()+"</td>"
            +"<td width='"+width_date+"'><div align='left'> "+txt_color+use_car_date+txt_color1+"</div></td>"
            +"<td width='"+width_time+"'>"+txt_color+use_car.getUseCarTime()+txt_color1+"</td>"
            +"<td width='"+width_ward+"'>"+txt_color+use_car.getDepartmentNamet()+txt_color1+"</td>"
            +"<td width='"+width_period+"'><A HREF='admin_use_car_add.jsp?txt_use_car_id="+use_car.getUseCarId()
            +"&flagpage=viewdetail' name='admin_use_car_add' id='admin_use_car_add'>"
                +txt_color+use_car.getDestination()+" "+use_car.getDescription()+""+use_car.getRemark()+" ["+use_car.getUseCarId()+"]"
                +txt_color1+"</a></td>"
            +"<td width='"+width_user_order+"'>"+txt_color+use_car.getUseCategoryNamet()+txt_color1+"</td>"
            +"<td width='"+width_nutritition+"'>"+txt_color+use_car.getUserNametUseCar()+txt_color1+"</td>"
            +"</tr>";
        }
    }
catch(Exception ex){
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <SCRIPT LANGUAGE="JavaScript" SRC="js/CalendarPopup.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/AnchorPosition.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/PopupWindow.js"></SCRIPT>
        <SCRIPT LANGUAGE="JavaScript" SRC="js/date.js"></SCRIPT>
        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <SCRIPT LANGUAGE="JavaScript">
	var cal = new CalendarPopup("testdiv1");
	</SCRIPT>
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
    </head>
    <body>
        <form name="admin_use_car_view" id="admin_use_car_view" action="admin_use_car_view.jsp" method="POST">
            <%@include  file="admin_use_car_header.jsp" %>
            <%if(flagpage.equals("old_date")){ %>
            <table><tr><td colspan="6">
                        <fieldset class="style14r">
                            <legend>เงื่อนไข:</legend>
                            <label>&nbsp;&nbsp;สาขา :&nbsp;<select name="cbo_branch" id="cbo_branch">
                                <%out.print(cbo_branch); %>
                </select></label>
                <label>&nbsp;&nbsp;Ward :&nbsp;<select name="cbo_department" id="cbo_department">
                                <%out.print(cbo_department); %>
                    </select></label>
                <label>&nbsp;&nbsp;วันที่ :&nbsp;<input type="text" name="txt_date_start" id="txt_date_start" value="<% out.print(date_start);%>" readonly="readonly" class="dateinput" ><A HREF="#"
   onClick="cal.select(document.forms['admin_use_car_view'].txt_date_start,'anchor1','dd/MM/yyyy'); return false;"
   NAME="anchor1" ID="anchor1">&nbsp; <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></label>
<label>&nbsp;&nbsp;ถึงวันที่ :&nbsp;<input type="text" name="txt_date_end" id="txt_date_end" value="<% out.print(date_end);%>" readonly="readonly" class="dateinput" ><A HREF="#"
   onClick="cal.select(document.forms['admin_use_car_view'].txt_date_end,'anchor2','dd/MM/yyyy'); return false;"
   NAME="anchor2" ID="anchor2">&nbsp; <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></label>
<button dojoType="dijit.form.Button" id="helloButton">ค้นหา
                                <script type="dojo/method" event="onClick">
                                //alert('OnClick event...');
        //var asset_status = document.getElementById("chk_asset_status").value;
        //var branch_id = document.getElementById("cbo_branch").value;;
        //var type_device_id = document.getElementById("cbo_type_device").value;;
                                    document.forms[0].action = "admin_use_car_view.jsp?flagpage=old_date";
                                    document.forms[0].submit();
                                //console.log("OnClick event...");
                              </script>
                            </button>


                        </fieldset>
                </td></tr></table>
            <% } %>
            <table width="100%" border="0" cellspacing="0" cellpadding="0">
            <!-- <tr><td><a href="noti_repair_add.jsp?noti_repair_id=&flagpage=viewdetail" class="style14b">แจ้งซ่อมใหม่ 11</a></td></tr>-->

            <thead>
                <tr bgcolor="#336699"  class="style14w">
                    <th width="15" ><div align="center">ลำดับ</div></th>
                  <th width="50" ><div align="center">วันที่ขอรถ</div></th>
                  <th width="25" ><div align="center">เวลา</div></th>
                  <th width="80" bgcolor="#336699" ><div align="center">Department</div></th>
                  <th width="250" bgcolor="#336699" ><div align="center">สถานที่ไป รายละเอียด</div></th>
                  <th width="200" bgcolor="#336699" ><div align="center">ประเภทรถ</div></th>
                  <th width="100" bgcolor="#336699" ><div align="center">เจ้าหน้าที่ผู้ขอรถ</div></th>
                </tr>
            </thead>
            <% out.print(text);%>
            </table>
        </form>
    </body>
    <DIV ID="testdiv1" STYLE="position:absolute;visibility:hidden;background-color:white;layer-background-color:white;"></DIV>
    <script>
  function performSearch() {
        $('resultsContainer').innerHTML = '';
        new Ajax.Request(
          '/aip.chap10/command/SearchForRecipes',
          {
            onSuccess: showResults,
            onFailure: showResults,
            parameters:
              $H({
                terms: $F('searchTermsField')
              }).toQueryString()
          }
        );
        if (!window.progressBar) {
          window.progressBar = new ProgressBar(
            'progressBarContainer',
            {
              className: 'progressBar',
              color: 'blue',
              interval: 1000
            }
          );
        }
        progressBar.start();
      }

      function showResults(request) {
        progressBar.stop();
        $('resultsContainer').innerHTML = request.responseText;
      }
    </script>
</html>
