<%-- 
    Document   : asset_add
    Created on : 29 ก.ค. 2552, 23:30:52
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
NotiBTypeDeviceDB noti_b_type_devicedb = new NotiBTypeDeviceDB();
NotiBBrandDB noti_b_branddb = new NotiBBrandDB();
BDepartmentDB b_departmentdb = new BDepartmentDB();
NotiBVendorDB noti_b_vendordb = new NotiBVendorDB();
BAsset asset = new BAsset();
BAssetDB bassetdb = new BAssetDB();
//Connection conn;

String text = "", asset_id="", asset_namet="", brand_id="";
String department_id="", vendor_id="", date_buy="", warranty="";

String row_color="", txt_color="",txt_color1="", cbo_branch="", cbo_type_device="",cbo_department="";
String asset_status="", type_device_id="", branch_id="103001",cbo_brand="", cbo_vendor="";
try{
    //conn = config1.getConnectionBangna();
    if(request.getParameter("asset_id")!=null){
        asset_id = new String (request.getParameter("asset_id").getBytes("ISO8859_1"),"TIS-620");
        }
    asset = bassetdb.getBAssetByPK(asset_id);
    date_buy = config1.DateFormatDB2Show(asset.getDateBuy(),"ddMMyyyy");
    cbo_type_device = noti_b_type_devicedb.CboTypeDevice(asset.getTypeDeviceId());
    cbo_branch = config1.getComboBranch(asset.getBranchId());
    cbo_department = b_departmentdb.CboDepartment(branch_id,asset.getDepartmentId());
    cbo_brand = noti_b_branddb.CboBrand(asset.getBrandId());
    cbo_vendor = noti_b_vendordb.CboVendor(asset.getVendorId());
    
    //conn.close();
    }
catch(Exception ex){
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
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
      var framework = new ValidatorFramework();
      window.onload = function() {
        Event.observe('testForm','submit',function(event) {
          if (!framework.validateForm(event.target))
            Event.stop(event);
        });
        Event.observe('testForm','keyup',function(event) {
          framework.validateForm(event.target.form);
        });
      }
      $(document).ready(function(){
                $("#txt_date_buy").datepicker({ dateFormat: 'dd-mm-yy' });
            });
    </script>
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
    </head>
    <body>
        
        <form name="asset_add" id="asset_add"><%@include  file="asset_header.jsp" %>
            <table border="0"  width="920" align="center">
        <thead>
        <tr>
            <th colspan="2" ><div align="center">ป้อนรายการ</div></th>
            
        </tr>
        </thead>
        <tbody>
            <tr class='style14r'>
            <th scope="row"  width="150" >เลขที่ทรัพย์สิน :</th>
            <td ><input type="text" name="txt_asset_id" id="txt_asset_id"
              size="15" value="<% out.print(asset.getAssetId());%>" readonly="readonly" >
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<label>
            <A HREF="#" onClick="changesubmitcancel();" NAME="anchor" ID="anchor">
                ยกเลิกรายการนี้&nbsp;<img src="images/trash1.gif" alt="" width="16" align="top"
      height="16" border="0"></A></label></td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >ชื่อทรัพย์สิน :</th>
            <td ><input type="text" name="txt_asset_namet" id="txt_asset_namet"
              size="50" value="<% out.print(asset.getAssetNamet());%>"  ></td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >สถานะทรัพย์สิน :</th>
            <td ><label><input type="radio" name="chk_asset_status" value="1" id="asset_status_1"
             <% if(asset.getAssetStatus().equals("1")) { out.print("checked"); }%> >&nbsp;คุรุภัณฑ์</label>
    <label><input type="radio" name="chk_asset_status" value="2" id="asset_status_2"
                  <% if(asset.getAssetStatus().equals("2")) { out.print("checked"); }%> >&nbsp;พัสดุ</label></td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >สาขา :</th>
            <td ><select name="cbo_branch" id="cbo_branch">
                    <%out.print(cbo_branch); %>
                </select></td>
            </tr>            
            <tr class='style14r'>
            <th scope="row"  width="50" >ชนิดอุปกรณ์ :</th>
            <td ><select name="cbo_type_device" id="cbo_type_device">
                    <%out.print(cbo_type_device); %>
                </select></td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >แผนกที่เก็บรักษา :</th>
            <td ><select name="cbo_department" id="cbo_department">
                    <%out.print(cbo_department); %>
                </select></td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >ผู้จัดจำหน่าย :</th>
            <td ><select name="cbo_vendor" id="cbo_vendor">
                <%out.print(cbo_vendor); %>
            </select></td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >ยี่ห้อ :</th>
            <td ><select name="cbo_brand" id="cbo_brand">
                    <%out.print(cbo_brand); %>
                </select>
            </td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >Model :</th>
            <td >
                <input type="text" name="txt_model" id="txt_model" value="<% out.print(asset.getModel());%>" size="20" />
            </td></tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >Serial No :</th>
            <td >
                <input type="text" name="txt_serial_no" id="txt_serial_no" value="<% out.print(asset.getSerialNo());%>" size="20" />
            </td></tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >Service Tab :</th>
            <td >
                <input type="text" name="txt_service_tab" id="txt_service_tab" value="<% out.print(asset.getServiceTab());%>" size="20" />
            </td></tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >วันที่ซื้อ :</th>
            <td ><input type="text" size="10" name="txt_date_buy" id="txt_date_buy" value="<% out.print(date_buy);%>" readonly="readonly" class="dateinput" />
    
            </td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >ราคาที่ซื้อ :</th>
            <td >
                <input type="text" name="txt_price" id="txt_price" value="<% out.print(asset.getPrice());%>" size="20" />
            </td></tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >การรับประกัน :</th>
            <td ><input type="text" name="txt_warranty" id="txt_warranty"
              size="50" value="<% out.print(asset.getWarranty());%>"  >&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <label><input type="radio" name="chk_warranty_status" value="1" id="warranty_status_1"
             <% if(asset.getWarrantyStatus().equals("1")) { out.print("checked"); }%> >&nbsp;ยังอยู่ในประกัน</label>
    <label><input type="radio" name="chk_warranty_status" value="2" id="warranty_status_2"
                  <% if(asset.getWarrantyStatus().equals("2")) { out.print("checked"); }%> >&nbsp;หมดประกันแล้ว</label></td>
            </tr>
            <tr class='style14r'>
            <th scope="row"  width="50" >หมายเหตุ :</th>
            <td ><input type="text" name="txt_remark" id="txt_remark"
              size="50" value="<% out.print(asset.getRemark());%>"  ></td>
            </tr>
            <tr>
                        <th scope="row" width="120" ><div align="left"></div></th>
                        <td><button dojoType="dijit.form.Button" id="helloButton">Save
                                <script type="dojo/method" event="onClick">
                                //alert('OnClick event...');
                                document.forms[0].action = "asset_save.jsp";
                                document.forms[0].submit();
                                //console.log("OnClick event...");
                              </script>
                            </button><!--<input type="submit" value="Save" name="btn_save" />-->
                            <input type="reset" value="Clear" ></td>
                    </tr>
        <input type="hidden" name="txt_asset_active" id="txt_asset_active" size="50" value="<% out.print(asset.getAssetActive());%>"  >
        </tbody>
            </table>
        </form>
    </body>
<script>

  function changesubmitcancel(){
      var asset_id = document.getElementById("txt_asset_id").value;
      document.forms.asset_add.txt_asset_active.value = '3';
        document.forms[0].action = "asset_save.jsp?asset_id="+asset_id;
        document.forms[0].submit();
        return false;
  }
    
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
