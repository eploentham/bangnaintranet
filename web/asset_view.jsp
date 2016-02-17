<%-- 
    Document   : asset_view
    Created on : 29 ก.ค. 2552, 10:14:25
    Author     : pop
--%>

<%@page import ="java.sql.*" %>
<%@page import ="java.text.*" %>
<%@page import ="java.util.* " %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
String text="";
BAssetDB bassetdb = new BAssetDB();
BAsset basset = new BAsset();
NotiBTypeDeviceDB noti_b_type_devicedb = new NotiBTypeDeviceDB();

Vector v_basset = new Vector();
Integer row=0;
String row_color="", txt_color="",txt_color1="", cbo_branch="", cbo_type_device="";
String asset_status="", type_device_id="", branch_id="";
try{
    if(request.getParameter("cbo_type_device")!=null) {
        type_device_id = new String (request.getParameter("cbo_type_device").getBytes("ISO8859_1"),"TIS-620");
    }
    if(request.getParameter("cbo_branch")!=null) {
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
    }
    if(request.getParameter("chk_asset_status")!=null) {
        asset_status = new String (request.getParameter("chk_asset_status").getBytes("ISO8859_1"),"TIS-620");
    }
    if(asset_status.equals("")){
        asset_status = "3";
        }
    v_basset = bassetdb.getBAsset(branch_id, asset_status, type_device_id,"", "all");
    for(int i=0;i<=v_basset.size()-1;i++) {
        row++;
        basset = (BAsset)v_basset.get(i);
        text+="<tr class='style14r' "+row_color+"> <td align='center' width='30'>"+row.toString()+"</td>"
            +"<td width='150'><div align='left'><A HREF='asset_add.jsp?asset_id="+basset.getAssetId()
            +"&flagpage=viewdetail' name='asset_add' id='asset_add'> "+txt_color+basset.getAssetNamet()+txt_color1+"</a></div></td>"
            +"<td width='90'>"+txt_color+basset.getBranchNamet()+txt_color1+"</td>"
            +"<td width='150'>"+txt_color+basset.getDepartmentNamet()+txt_color1+"</td>"
            +"<td width='250'>"+txt_color+basset.getTypeDeviceNamet()+txt_color1+"</td>"
            +"<td width='110'>"+txt_color+basset.getBrandNameT()+txt_color1+"</td>"
            +"<td width='50'>"+txt_color+basset.getDateBuy()+txt_color1+"</td>"
            +"<td width='50'>"+txt_color+basset.getWarranty()+txt_color1+"</td>"
            +"<td width='50'>"+txt_color+basset.getSerialNo()+txt_color1+"</td>"
            +"<td width='50'>"+txt_color+basset.getRemark()+txt_color1+"</td>"
            +"</tr>";
        }
    cbo_type_device = noti_b_type_devicedb.CboTypeDevice(type_device_id);
    cbo_branch = config1.getComboBranch(branch_id);
    if(text.equals("")){
            text="<tr class='style14r' "+row_color+"> <td align='center'>1</td><td>ไม่พบข้อมูล</td><td></td><td></td><td></td><td></td></tr>";
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
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">
        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/prototype-1.6.0.3.js"></script>
        <script type="text/javascript" src="js/ProgressBar.js"></script>
        <script type="text/javascript" src="js/listing.6.2.js"></script>
        
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
    <form name="asset_view" id="asset_view" action="asset_add.jsp" method="POST">
       <body>
        <%@include  file="asset_header.jsp" %>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
            <!-- <tr><td><a href="noti_repair_add.jsp?noti_repair_id=&flagpage=viewdetail" class="style14b">แจ้งซ่อมใหม่ 11</a></td></tr>-->
                        <tr><td>
                                <fieldset class="style14r">
                                    <legend>เงื่อนไข:</legend>
<label>&nbsp;&nbsp;สาขา&nbsp;<select name="cbo_branch" id="cbo_branch">
                                <%out.print(cbo_branch); %>
                </select></label>&nbsp;&nbsp;&nbsp;&nbsp;
    <label>สถานะทรัพย์สิน<input type="radio" name="chk_asset_status" value="1" id="asset_status_1" class="style14r"
             <% if(asset_status.equals("1")) { out.print("checked"); }%> >&nbsp;คุรุภัณฑ์</label>
    <label><input type="radio" name="chk_asset_status" value="2" id="asset_status_2"
                  <% if(asset_status.equals("2")) { out.print("checked"); }%> >&nbsp;พัสดุ</label>
                  <label>&nbsp;&nbsp;&nbsp;&nbsp;ชนิดพัสดุ คุรุภัภัณฑ์&nbsp;<select name="cbo_type_device" id="cbo_type_device">
                                <%out.print(cbo_type_device); %>
                      </select></label>&nbsp;&nbsp;
                      <button dojoType="dijit.form.Button" id="helloButton">ค้นหา...
                                <script type="dojo/method" event="onClick">
                                    document.forms[0].action = "asset_view.jsp";
                                    document.forms[0].submit();
                                //console.log("OnClick event...");
                              </script>
                            </button>
                                </fieldset>
                            </td></tr> <tr><td>
                                <table border="0" width="100%">
                    <thead>
                        <tr bgcolor="#336699"  class="style14w">
                            <th width="15" ><div align="center">ลำดับ</div></th>
                          <th width="150" ><div align="center">ชื่อพัสดุ-คุรุภัณฑ์</div></th>
                          <th width="90" bgcolor="#336699" ><div align="center">สาขา</div></th>
                          <th width="150" bgcolor="#336699" ><div align="center">แผนกที่เก็บรักษา</div></th>
                          <th width="250" bgcolor="#336699" ><div align="center">ชนิด</div></th>
                          <th width="110" bgcolor="#336699" ><div align="center">ยี่ห้อ</div></th>
                          <th width="50" bgcolor="#336699" ><div align="center">วันที่ซื้อ</div></th>
                          <th width="50" bgcolor="#336699" ><div align="center">ประกัน</div></th>
                          <th width="50" bgcolor="#336699" ><div align="center">serial</div></th>
                          <th width="50" bgcolor="#336699" ><div align="center">remark</div></th>
                        </tr>
                    </thead>
                    <tbody>
                            <%out.print(text); %>
                    </tbody>
                </table>

                            </td></tr>
</table>

    </body>


    </form>
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
