<%-- 
    Document   : noti_repair_add
    Created on : 25 มิ.ย. 2552, 17:28:51
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
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();
ComboDB combodb = new ComboDB();
Class.forName("org.postgresql.Driver");
NotiTNotiRepair noti_repair = new NotiTNotiRepair();
NotiTNotiRepairDB noti_repairdb = new NotiTNotiRepairDB();
NotiBBrand noti_b_brand = new NotiBBrand();
NotiBBrandDB noti_b_branddb = new NotiBBrandDB();
NotiBTypeDevice noti_b_type_device = new NotiBTypeDevice();
NotiBTypeDeviceDB noti_b_type_devicedb = new NotiBTypeDeviceDB();
BDepartmentDB b_departmentdb = new BDepartmentDB();
NotiBVendor noti_b_vendor = new NotiBVendor();
NotiBVendorDB noti_b_vendordb = new NotiBVendorDB();
bangnaLibrary.BBranch branch = new bangnaLibrary.BBranch();
Vector v_noti_b_brand = new Vector();
Vector v_noti_b_type_device = new Vector();
Vector v_b_department = new Vector();
Vector v_noti_b_vendor = new Vector();

String text="", noti_repair_id="", status="";
String department="", flagpage="", attend_department_cbo="", ma_department_cbo="", brand_cbo="", type_device_cbo="";
String attend_remark="", attend_user_id="",attend_user_namet="", attend_date="", attend_description="", attend_department_namet="", attend_department_id="";
String symptoms="", repair_status="", type_device_id="", type_device_namet="", model="", vendor_namet="", vendor_cbo="";
String service_tab="", serial_no="", brand_id="", brand_namet="", vendor_id="", vendor_remark="", status_warranty="";
String ma_remark="", ma_date="", ma_user_id="", ma_description="", ma_user_namet="", ma_department_id="", ma_department_namet="";
String price_repair="", txt="", flagunactive="0", txtquotation="", cbo_stringency="", branch_id="", status_it="", status_it_name="";
Integer department_cnt=0, brand_cnt=0, type_device_cnt=0, vendor_cnt=0;
boolean noti_repair_picture_repair_fileexists=false,noti_repair_picture_quotation_fileexists=false;
//java.util.Date date1 = new java.util.Date();
//Format formatter = new SimpleDateFormat("dd/MM/yyyy");
//String s = formatter.format(date1);
//attend_date = s;

try {
    attend_date = config1.getDate("dd/MM/yyyy");
    ma_date = config1.getDate("dd/MM/yyyy");
    //Connection connbangna = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bangna","postgres","postgres");
    //Statement stbangna = connbangna.createStatement();
    String sql="", noti_repair_picture_repair_filename="", noti_repair_picture_quotation_filename="";
    //sql = "Select department_id, department_namet From b_department Where department_active = '1'";
    //ResultSet rs ;
    String show_screen="1";
    //status_it =request.getParameter("statusit");
    //status_it =session.getAttribute("statusit").toString();
    status_it = (String)session.getAttribute("status_it");
    status_it="1";
    if(status_it.equals("1")){
        status_it_name = "คอมพิวเตอร์";
        }else{
        status_it = "2";
        status_it_name="ซ่อมทั่วไป";
        }
    flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    if(request.getParameter("flagunactive")!=null){
        flagunactive = new String (request.getParameter("flagunactive").getBytes("ISO8859_1"),"TIS-620");
    }
    if(branch_id.equals("")){
        branch = config1.getBranchActive();
        branch_id = branch.getBranchId();
        }
    noti_repair_id = new String (request.getParameter("noti_repair_id").getBytes("ISO8859_1"),"TIS-620");
    noti_repair.setNotiRepairId("");
    noti_repair.setAttendDescription("");
    noti_repair.setAttendRemark("");
    noti_repair.setAttendUserId("");
    if(!noti_repair_id.equals("")){
        Integer i=0;
        noti_repair = noti_repairdb.SelectNotiTNotiRepairByPK(noti_repair_id);
        attend_date = noti_repair.getAttendDateddMMyy("ddMMyyyy");
        ma_date = noti_repair.getMaDateddMMyy("ddMMyyyy");
        noti_repair_picture_repair_filename = noti_repair.getNotiRepairPictureRepairFileName();
        noti_repair_picture_repair_fileexists = noti_repair.getNotiRepairPictureRepairExists();
        noti_repair_picture_quotation_filename = noti_repair.getNotiRepairPictureQuotationFileName();
        noti_repair_picture_quotation_fileexists = noti_repair.getNotiRepairPictureQuotationExists();
        txt = "<A HREF='javascript:popUpRepair()'  >ดูรูปใบนำส่งซ่อมภายนอก</A>";
        txtquotation = "<A HREF='javascript:popUpQuotation()'  >ดูรูปใบเสนอราคาซ่อม</A>";
        price_repair = noti_repair.getPriceRepair().toString();
        show_screen = noti_repair.getShowScreen();
        status_it = noti_repair.getStatusIt();
        if(status_it.equals("1")){
            status_it_name = "คอมพิวเตอร์";
            }else{
            status_it = "2";
            status_it_name="ซ่อมทั่วไป";
            }
        }
    attend_department_cbo = b_departmentdb.CboDepartment(branch_id,noti_repair.getAttendDepartmentId());
    ma_department_cbo = b_departmentdb.CboDepartment(branch_id,noti_repair.getMaDepartmentId());
    if(noti_repair.getBrandId().equals("")){
        noti_repair.setBrandId(branch_id);
        }
    brand_cbo = noti_b_branddb.CboBrand(noti_repair.getBrandId());
    type_device_cbo = noti_b_type_devicedb.CboTypeDevice(noti_repair.getTypeDeviceId());
    vendor_cbo = noti_b_vendordb.CboVendor(noti_repair.getVendorId());
    session.setAttribute("noti_repair.noti_repair_id", noti_repair_id);
    cbo_stringency = combodb.getComboStringency();
    
    //connbangna.close();
    }
catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <link href="css/jquery-ui-1.7.2.custom.css" rel="stylesheet" type="text/css">
        
        <script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js" djConfig="parseOnLoad: true"></script>
        <script type="text/javascript" src="js/jquery-1.3.2.js"></script>
        <script type="text/javascript" src="js/ui.core.js"></script>
        <script type="text/javascript" src="js/ui.datepicker.js"></script>
        
        <title>JSP Page</title>

        <script type="text/javascript">
           // Load Dojo's code relating to the Button widget
           dojo.require("dijit.form.Button");
        </script>
        <script type="text/javascript">
          dojo.require("dijit.form.DateTextBox");
          dojo.require("dojo.parser");
        </script>
        <script type="text/javascript">
            $(document).ready(function(){
                $("#txt_attend_date").datepicker({ dateFormat: 'dd-mm-yy' });

            });
        </script>
    </head>
    <form name="noti_repair_add" action="noti_repair_save.jsp" method="POST"><body>
        <div align="center" id="main"></div>
        <%@include  file="noti_repair_header.jsp" %>
        <br>
        <!---->

            <table border="0" width="100%" align="center">
                <thead>
                    <tr>
                        <th colspan="2" ><div align="center">ป้อนรายการ<%out.print(status_it_name);%></div></th>
                        <!--<th width="65%"></th>-->
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <th scope="row"  width="180" >เลขที่แจ้งซ่อม</th>
                      <td><input type="text" name="txt_noti_repair_id" id="txt_noti_repair_id" value="<% out.print(noti_repair_id);%>" readonly="readonly" /></td>
                    </tr>
                    <tr>
                        <th scope="row" width="170" ><div align="left">วันที่แจ้ง</div></th>
                        <td><% if(flagpage.equals("viewdetail")) {%><input type="text" name="txt_attend_date" id="txt_attend_date" value="<% out.print(attend_date);%>" readonly="readonly" class="dateinput" /><% } else { out.print(attend_date); }%>
                        <!--<input dojoType="dijit.form.DateTextBox" type="text" name="datesaisie" id="datesaisie" value="" required="true" />--></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">แผนก</div></th>
                        <td><% if(flagpage.equals("viewdetail")) {%><select name="cbo_attend_department" id="cbo_attend_department">
                                <%out.print(attend_department_cbo); %>
                            </select>
                            <% } else if(flagpage.equals("adddetail")) { out.print(noti_repair.getAttendDepartmentNamet()); } %>                        </td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">อาการเสีย</div></th>
                        <td><% if(flagpage.equals("viewdetail")) {%><input type="text" name="txt_attend_description" value="<% out.print(noti_repair.getAttendDescription());%>" size="100" /><% } else { out.print(noti_repair.getAttendDescription()); }%></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">หมายเหตุ</div></th>
                        <td><% if(flagpage.equals("viewdetail")) {%><input type="text" name="txt_attend_remark" value="<% out.print(noti_repair.getAttendRemark());%>" size="100"  /><% } else { out.print(noti_repair.getAttendRemark()); }%></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">ผู้แจ้ง</div></th>
                        <td><% if(flagpage.equals("viewdetail")) {%><input type="text" name="txt_attend_user_id" value="<% out.print(noti_repair.getAttendUserId());%>" /><% } else { out.print(noti_repair.getAttendUserId()); }%>
                        <input type="hidden" name="txt_status" value="1" />
                        <input type="hidden" name="txt_flag_redirect" value="1" />
                        <input type="hidden" name="flagpage" value="<%out.print(flagpage);%>" /></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">ความรีบด่วน</div></th>
                        <td><% if(flagpage.equals("viewdetail")) {%><select name="cbo_stringency" id="cbo_stringency">
                                <%out.print(cbo_stringency); %>
                            </select>
                            <% } else if(flagpage.equals("adddetail")) { out.print(noti_repair.getStringencyNamet()); } %>                        </td>
                    </tr>

                    <tr><th scope="row" width="120" >&nbsp;</th><td>&nbsp;</td></tr>


                    <% if(flagpage.equals("adddetail")) {%>
                    <tr>
                        <th scope="row" width="120" ><div align="left">วันที่แก้ไข</div></th>
                        <td><input type="text" name="txt_ma_date" id="txt_ma_date" value="<% out.print(ma_date);%>" readonly="readonly" class="dateinput"/><A HREF="#"
   onClick="cal.select(document.forms['noti_repair_add'].txt_ma_date,'anchor1','dd/MM/yyyy'); return false;"
   NAME="anchor1" ID="anchor1">&nbsp; <img src="images/cal.gif" alt="" width="16" height="16" border="0"></A></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">แผนก</div></th>
                        <td><% if(flagpage.equals("adddetail")) {%>
                            <select name="cbo_ma_department" id="cbo_ma_department">
                                <%out.print(ma_department_cbo);%>
                            </select>
                            <% } else if (flagpage.equals("viewdetail")) { out.print(ma_department_cbo); } %></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">รายละเอียดการแก้ไข</div></th>
                        <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_ma_description" value="<% out.print(noti_repair.getMaDescription() );%>" size="100" /> <% } else if (flagpage.equals("viewdetail")) { out.print(ma_description); } %></tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">หมายเหตุ</div></th>
                        <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_ma_remark" value="<% out.print(noti_repair.getMaRemark());%>" size="100" /><% } else if (flagpage.equals("viewdetail")) { out.print(ma_remark); } %></tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">ผู้แก้ไข</div></th>
                        <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_ma_user_id" value="<% out.print(noti_repair.getMaUserId());%>" /><% } else if (flagpage.equals("viewdetail")) { out.print(ma_user_id); } %>

                    </tr>



                    <tr>
                      <th scope="row" width="120" >ประเภทการซ่อม</th>
                      <td><% if(flagpage.equals("adddetail")) {%>
                          <label>
                              <input type="radio" name="chk_repair_status" value="1" id="repair_status_1" <% if(noti_repair.getRepairStatus().equals("1")) { out.print("checked"); }%> >
                            ซ่อมเอง</label>
                          <label>
                            <input type="radio" name="chk_repair_status" value="2" id="repair_status_2" <% if(noti_repair.getRepairStatus().equals("2")) { out.print("checked"); }%> >
                            ส่งซ่อมภายนอก</label>
                        <% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getRepairStatus()); } %> </td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >Serial NO:</th>
                      <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_serial_no" id="txt_serial_no" value="<% out.print(noti_repair.getSerialNo());%>" size="100" /><% } else if (flagpage.equals("viewdetail")) { out.print(serial_no); } %></td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >Service Tab:</th>
                      <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_service_tab" id="txt_service_tab" value="<% out.print(noti_repair.getServiceTab());%>" size="100" /><% } else if (flagpage.equals("viewdetail")) { out.print(service_tab); } %></td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >Brand:</th>
                      <td><% if(flagpage.equals("adddetail")) {%><select name="cbo_brand_id" id="cbo_brand_id">
                        <%out.print(brand_cbo);%>
                      </select><% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getBrandNamet()); } %></td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >Model:</th>
                      <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_model" id="txt_model" value="<% out.print(noti_repair.getModel());%>" size="100" /><% } else if (flagpage.equals("viewdetail")) { out.print(model); } %></td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >ชนิดอุปกรณ์:</th>
                      <td><% if(flagpage.equals("adddetail")) {%><select name="cbo_type_device" id="cbo_type_device">
                        <%out.print(type_device_cbo);%>
                      </select><% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getTypeDeviceNamet()); } %></td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >อาการ:</th>
                      <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_symptoms" id="txt_symptoms" value="<% out.print(noti_repair.getSymptoms());%>" size="100" /><% } else if (flagpage.equals("viewdetail")) { out.print(symptoms); } %></td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >สถานะ</th>
                      <td><% if(flagpage.equals("adddetail")) {%>
                          <label>
                              <input type="radio" name="chk_status" value="1" id="status_1" <% if(noti_repair.getStatus().equals("1")) { out.print("checked"); }%> />
                            แจ้งซ่อม</label>
                          <label>
                              <input type="radio" name="chk_status" value="2" id="status_2" <% if(noti_repair.getStatus().equals("2")) { out.print("checked"); }%> />
                            เริ่มซ่อม</label>
                          <label>
                            <input type="radio" name="chk_status" value="3" id="status_3" <% if(noti_repair.getStatus().equals("3")) { out.print("checked"); }%> />
                            ยกเลิก</label>
                            <label>
                            <input type="radio" name="chk_status" value="4" id="status_4" <% if(noti_repair.getStatus().equals("4")) { out.print("checked"); }%> />
                            ใกล้เสร็จ</label>
                            <label>
                            <input type="radio" name="chk_status" value="5" id="status_5" <% if(noti_repair.getStatus().equals("5")) { out.print("checked"); }%> />
                            เรียบร้อย</label>
                            <%if(flagunactive.equals("1")) {%><label>
                            <input type="radio" name="chk_status" value="6" id="status_6" <% if(noti_repair.getStatus().equals("6")) { out.print("checked"); }%> />
                            Roll Out ออกจากหน้าจอ</label><% }%>
                        <% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getStatusNamet()); } %> </td>
                    </tr>
                    <tr><th scope="row" width="120" >&nbsp;</th><td>&nbsp;</td></tr>
                    <tr>
                      <th scope="row" width="120" >ส่งซ่อมภายนอก:</th>
                      <td><% if(flagpage.equals("adddetail")) {%><select name="cbo_vendor_id" id="cbo_vendor_id">
                        <%out.print(vendor_cbo);%>
                      </select><% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getVendorNamet()); } %></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">หมายเหตุจากบริษัทซ่อม</div></th>
                        <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_vendor_remark" value="<% out.print(noti_repair.getVendorRemark());%>" size="100" /><% } else { out.print(vendor_remark); }%></td>
                    </tr>
                    <tr>
                        <th scope="row" width="120" ><div align="left">ราคาซ่อม</div></th>
                        <td><% if(flagpage.equals("adddetail")) {%><input type="text" name="txt_price_repair" value="<% out.print(price_repair);%>"  /><% } else { out.print(price_repair); }%></td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >ประกันสินค้า</th>
                      <td><% if(flagpage.equals("adddetail")) {%>
                          <label>
                              <input type="radio" name="chk_status_warranty" value="1" id="status_1" <% if(noti_repair.getStatusWarranty().equals("1")) { out.print("checked"); }%> />
                            อยู่ในประกัน</label>
                          <label>
                            <input type="radio" name="chk_status_warranty" value="2" id="status_2" <% if(noti_repair.getStatusWarranty().equals("2")) { out.print("checked"); }%> />
                            หมดประกันแล้ว</label>
                        <% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getStatusWarranty()); } %> </td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >สถานะการซ่อม</th>
                      <td><% if(flagpage.equals("adddetail")) {%>
                          <label>
                              <input type="radio" name="chk_status_repair" value="1" id="status_1" <% if(noti_repair.getStatusRepair().equals("1")) { out.print("checked"); }%> />
                            ซ่อมได้</label>
                          <label>
                            <input type="radio" name="chk_status_repair" value="3" id="status_2" <% if(noti_repair.getStatusRepair().equals("3")) { out.print("checked"); }%> />
                            ไม่สามารถซ่อมได้แล้ว</label>
                        <% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getStatusRepair()); } %> </td>
                    </tr>
                     


                    <tr>
                      <th scope="row" width="120" >เก็บรูปใบนำส่งซ่อมภายนอก:</th>
                      <td><input type="button" name="btn_picture_repair" id="btn_picture_repair" value="..."  onclick='changesubmituploadfilerepair();' />
                      <% if(noti_repair_picture_repair_fileexists) { out.print(txt); }%>
                      </td>
                    </tr>
                    <tr>
                      <th scope="row" width="120" >เก็บรูปใบเสนอราคาซ่อม:</th>
                      <td><input type="button" name="btn_picture_quotation" id="btn_picture_quotation" value="..."  onclick='changesubmituploadfilequotation();' />
                      <% if(noti_repair_picture_quotation_fileexists) { out.print(txtquotation); }%>
                      </td>
                    </tr>
                    <% if(flagunactive.equals("1")) {%>
                    <tr>
                      <th scope="row" width="120" >ไม่ต้องแสดงที่หน้าจอ</th>
                      <td><% if(flagpage.equals("adddetail")) {%>
                          <label>
                              <input type="radio" name="chk_show_screen" value="1" id="status_1" <% if(noti_repair.getShowScreen().equals("1")) { out.print("checked"); }%> />
                            แสดงหน้าจอ</label>
                          <label>
                            <input type="radio" name="chk_show_screen" value="3" id="status_2" <% if(noti_repair.getShowScreen().equals("3")) { out.print("checked"); }%> />
                            ไม่แสดงหน้าจอ</label>
                        <% } else if (flagpage.equals("viewdetail")) { out.print(noti_repair.getStatusRepair()); } %> </td>
                    </tr>
                    <% }%>


                    <% }%>

                    <tr>
                        <th scope="row" width="120" ><div align="left"></div></th>
                        <td><button dojoType="dijit.form.Button" id="helloButton">Save
                                <script type="dojo/method" event="onClick">
                                //alert('OnClick event...');
                                document.forms[0].action = "noti_repair_save.jsp";
                                document.forms[0].submit();
                                //console.log("OnClick event...");
                              </script>
                            </button><!--<input type="submit" value="Save" name="btn_save" />-->
                            <input type="reset" value="Clear" ></td>
                    </tr>
                </tbody>
            </table>

<input type="hidden" name="txt_status_it" value="<% out.print(status_it);%>"  />
        <!---->
        
        
    </body></form><!---->
         <script>
          function changesubmituploadfilerepair(arg) {
              //var aaa = document.getElementsById("txt_noti_repair_id").value;
              var noti_repair_id = document.getElementById("txt_noti_repair_id").value;
              //alert(aaa);
              var bbb = document.getElementById("txt_noti_repair_id");
              bbb.setAttribute("value", "0");
              //document.forms[0].submit();
                window.open("noti_repair_upload_file_repair.jsp?noti_repair_id="+noti_repair_id+"&flag=repair",'_self',true);
                return false;
          }
          function changesubmituploadfilequotation(arg) {
              //var aaa = document.getElementsById("txt_noti_repair_id").value;
              var noti_repair_id = document.getElementById("txt_noti_repair_id").value;
              //alert(aaa);
              var bbb = document.getElementById("txt_noti_repair_id");
              bbb.setAttribute("value", "0");
              //document.forms[0].submit();
                window.open("noti_repair_upload_file_quotation.jsp?noti_repair_id="+noti_repair_id+"&flag=quotation",'_self',true);
                return false;
          }
          function popUpRepair(URL) {
              var noti_repair_id = document.getElementById("txt_noti_repair_id").value;
            window.open("http://172.1.1.3/intranet/noti_repair_view_picture.php?noti_repair_id="+noti_repair_id+"&flag=repair",'_blank',true,'channelmode=no,status=no,fullscreen=no,menubar=no,resizable=no,scrollbars=no');
            }
            function popUpQuotation(URL) {
              var noti_repair_id = document.getElementById("txt_noti_repair_id").value;
            window.open("http://172.1.1.3/intranet/noti_repair_view_picture.php?noti_repair_id="+noti_repair_id+"&flag=quotation",'_blank',true,'channelmode=no,status=no,fullscreen=no,menubar=no,resizable=no,scrollbars=no');
            }

        </script>
</html>
