<%-- 
    Document   : noti_repair_save
    Created on : 25 .. 2552, 17:30:55
    Author     : pop
--%>
<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
NotiTNotiRepairDB notitnotirepairdb = new NotiTNotiRepairDB();
Config1 config1 = new Config1();
bangnaLibrary.BBranch branch = new bangnaLibrary.BBranch();
Class.forName("org.postgresql.Driver");
String attend_date="", attend_description="", attend_remark="",attend_user_id="",noti_repair_id="";
String attend_time="", flag_redirect="";
String text="", sql="", max="", department_namet="", status="'", flagpage="", symptoms="", repair_status="", type_device="";
String service_tab="", serial_no="", brand_id="", brand_namet="",attend_department_id="", model="";
String ma_remark="", ma_date="", ma_user_id="", ma_description="", ma_user_namet="", ma_department_id="";
String status_warranty="", vendor_id="", vendor_namet="", vendor_remark="", status_repair="";
String price_repair="", stringency="", show_screen="", status_it="";
try{
    //String remoteip = request.getRemoteAddr();
    InetAddress in  = InetAddress.getLocalHost();
    notitnotirepairdb.notitnotirepair.setRemoteIpUserCreate(in.getHostName()+"-"+ in.getHostAddress()+"-"+request.getRemoteAddr());
    attend_time = config1.getDate("HH:mm");
    notitnotirepairdb.notitnotirepair.setAttendTime(attend_time);
    if(request.getParameter("chk_show_screen")!=null){
        show_screen = new String (request.getParameter("chk_show_screen").getBytes("ISO8859_1"),"TIS-620");
        show_screen = show_screen.trim();
    }
    else{
        show_screen = "";
    }
    notitnotirepairdb.notitnotirepair.setShowScreen(show_screen);
    if(request.getParameter("cbo_stringency")!=null){
        stringency = new String (request.getParameter("cbo_stringency").getBytes("ISO8859_1"),"TIS-620");
        stringency = stringency.trim();
    }
    else{
        stringency = "";
    }
    notitnotirepairdb.notitnotirepair.setStringency(stringency);
    if(request.getParameter("txt_flag_redirect")!=null){
        flag_redirect = new String (request.getParameter("txt_flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
    }
    else{
        flag_redirect = "";
    }
    if(request.getParameter("txt_noti_repair_id")!=null){
        noti_repair_id = new String (request.getParameter("txt_noti_repair_id").getBytes("ISO8859_1"),"TIS-620");
        noti_repair_id = noti_repair_id.trim();
    }
    else{
        noti_repair_id = "";
    }
    notitnotirepairdb.notitnotirepair.setNotiRepairId(noti_repair_id);
    if(request.getParameter("cbo_attend_department")!=null){
        attend_department_id = new String (request.getParameter("cbo_attend_department").getBytes("ISO8859_1"),"TIS-620");
        attend_department_id = attend_department_id.trim();
    }
    else{
        attend_department_id = "";
    }
    notitnotirepairdb.notitnotirepair.setAttendDepartmentId(attend_department_id);
    if(request.getParameter("txt_attend_date")!=null){
        attend_date = new String (request.getParameter("txt_attend_date").getBytes("ISO8859_1"),"TIS-620");
        attend_date = attend_date.trim();
    }
    else{
        attend_date = "";
    }
    notitnotirepairdb.notitnotirepair.setAttendDate(attend_date);
    if(request.getParameter("txt_attend_description")!=null){
        attend_description = new String (request.getParameter("txt_attend_description").getBytes("ISO8859_1"),"TIS-620");
        attend_description = attend_description.trim();
    }
    else{
        attend_description = "";
    }
    notitnotirepairdb.notitnotirepair.setAttendDescription(attend_description);
    if(request.getParameter("txt_attend_remark")!=null){
        attend_remark = new String (request.getParameter("txt_attend_remark").getBytes("ISO8859_1"),"TIS-620");
        attend_remark = attend_remark.trim();
    }
    else{
        attend_remark = "";
    }
    notitnotirepairdb.notitnotirepair.setAttendRemark(attend_remark);
    if(request.getParameter("txt_attend_user_id")!=null){
        attend_user_id = new String (request.getParameter("txt_attend_user_id").getBytes("ISO8859_1"),"TIS-620");
        attend_user_id = attend_user_id.trim();
    }
    else{
        attend_user_id = "";
        }
    notitnotirepairdb.notitnotirepair.setAttendUserId(attend_user_id);

    
    if(request.getParameter("chk_status")!=null){
        status = new String (request.getParameter("chk_status").getBytes("ISO8859_1"),"TIS-620");
        status = status.trim();
    }
    else{
        status = "";
        }
    notitnotirepairdb.notitnotirepair.setStatus(status);
    if(request.getParameter("flagpage")!=null){
        flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
        flagpage = flagpage.trim();
    }
    else{
        flagpage = "";
        }
    if(request.getParameter("txt_status_it")!=null){
        status_it = new String (request.getParameter("txt_status_it").getBytes("ISO8859_1"),"TIS-620");
        status_it = status_it.trim();
    }
    else{
        status_it = "";
        }
    notitnotirepairdb.notitnotirepair.setStatusIt(status_it);
    
    

    
    if(request.getParameter("txt_ma_user_id")!=null){
        ma_user_id = new String (request.getParameter("txt_ma_user_id").getBytes("ISO8859_1"),"TIS-620");
        ma_user_id = ma_user_id.trim();
    }
    else{
        ma_user_id = "";
        }
    notitnotirepairdb.notitnotirepair.setMaUserId(ma_user_id);
    if(request.getParameter("txt_ma_description")!=null){
        ma_description = new String (request.getParameter("txt_ma_description").getBytes("ISO8859_1"),"TIS-620");
        ma_description = ma_description.trim();
    }
    else{
        ma_description = "";
        }
    notitnotirepairdb.notitnotirepair.setMaDescription(ma_description);
    if(request.getParameter("txt_ma_date")!=null){
        ma_date = new String (request.getParameter("txt_ma_date").getBytes("ISO8859_1"),"TIS-620");
        ma_date = ma_date.trim();
    }
    else{
        ma_date = "";
        }
    notitnotirepairdb.notitnotirepair.setMaDate(ma_date);
    if(request.getParameter("txt_ma_remark")!=null){
        ma_remark = new String (request.getParameter("txt_ma_remark").getBytes("ISO8859_1"),"TIS-620");
        ma_remark = ma_remark.trim();
    }
    else{
        ma_remark = "";
        }
    notitnotirepairdb.notitnotirepair.setMaRemark(ma_remark);


    if(request.getParameter("txt_symptoms")!=null){
        symptoms = new String (request.getParameter("txt_symptoms").getBytes("ISO8859_1"),"TIS-620");
        symptoms = symptoms.trim();
    }
    else{
        symptoms = "";
        }
    notitnotirepairdb.notitnotirepair.setSymptoms(symptoms);
    if(request.getParameter("chk_repair_status")!=null){
        repair_status = new String (request.getParameter("chk_repair_status").getBytes("ISO8859_1"),"TIS-620");
        repair_status = repair_status.trim();
    }
    else{
        repair_status = "";
        }
    notitnotirepairdb.notitnotirepair.setRepairStatus(repair_status);
    if(request.getParameter("cbo_type_device")!=null){
        type_device = new String (request.getParameter("cbo_type_device").getBytes("ISO8859_1"),"TIS-620");
        type_device = type_device.trim();
    }
    else{
        type_device = "";
        }
    notitnotirepairdb.notitnotirepair.setTypeDeviceId(type_device);
    if(request.getParameter("txt_service_tab")!=null){
        service_tab = new String (request.getParameter("txt_service_tab").getBytes("ISO8859_1"),"TIS-620");
        service_tab = service_tab.trim();
    }
    else{
        service_tab = "";
        }
    notitnotirepairdb.notitnotirepair.setServiceTab(service_tab);
    if(request.getParameter("txt_serial_no")!=null){
        serial_no = new String (request.getParameter("txt_serial_no").getBytes("ISO8859_1"),"TIS-620");
        serial_no = serial_no.trim();
    }
    else{
        serial_no = "";
        }
    notitnotirepairdb.notitnotirepair.setSerialNo(serial_no);
    if(request.getParameter("cbo_brand_id")!=null){
        brand_id = new String (request.getParameter("cbo_brand_id").getBytes("ISO8859_1"),"TIS-620");
        brand_id = brand_id.trim();
    }
    else{
        brand_id = "";
        }
    notitnotirepairdb.notitnotirepair.setBrandId(brand_id);
    if(request.getParameter("txt_model")!=null){
        model = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        model = model.trim();
    }
    else{
        model = "";
        }
    notitnotirepairdb.notitnotirepair.setModel(model);


    if(request.getParameter("txt_vendor_remark")!=null){
        vendor_remark = new String (request.getParameter("txt_vendor_remark").getBytes("ISO8859_1"),"TIS-620");
        vendor_remark = vendor_remark.trim();
    }
    else{
        vendor_remark = "";
    }
    notitnotirepairdb.notitnotirepair.setVendorRemark(vendor_remark);
    if(request.getParameter("cbo_vendor_id")!=null){
        vendor_id = new String (request.getParameter("cbo_vendor_id").getBytes("ISO8859_1"),"TIS-620");
        vendor_id = vendor_id.trim();
    }
    else{
        vendor_id = "";
        }
    notitnotirepairdb.notitnotirepair.setVendorId(vendor_id);
    if(request.getParameter("chk_status_warranty")!=null){
        status_warranty = new String (request.getParameter("chk_status_warranty").getBytes("ISO8859_1"),"TIS-620");
        status_warranty = status_warranty.trim();
    }
    else{
        status_warranty = "";
        }
    notitnotirepairdb.notitnotirepair.setStatusWarranty(status_warranty);
    if(request.getParameter("txt_price_repair")!=null && !request.getParameter("txt_price_repair").equals("")){
        price_repair = new String (request.getParameter("txt_price_repair").getBytes("ISO8859_1"),"TIS-620");
        price_repair = price_repair.trim();
        if(price_repair.equals("")){
            price_repair = "0";
            }
    }
    else{
        price_repair = "0";
        }
    if(request.getParameter("chk_status_repair")!=null){
        status_repair = new String (request.getParameter("chk_status_repair").getBytes("ISO8859_1"),"TIS-620");
        status_repair = status_repair.trim();
    }
    else{
        status_repair = "";
        }
    notitnotirepairdb.notitnotirepair.setStatusRepair(status_repair);
    notitnotirepairdb.notitnotirepair.setPriceRepair(Double.parseDouble(price_repair));
    notitnotirepairdb.notitnotirepair.setActive("1");

    attend_date = config1.DateFormatShow2DB(attend_date, "ddMMyyyy");
    ma_date = config1.DateFormatShow2DB(ma_date, "ddMMyyyy");

    //notitnotirepairdb.notitnotirepair.setPriceRepair(Double.parseDouble(price_repair));
    
//attend_date = new String (request.getParameter("txt_attend_date").getBytes("ISO8859_1"),"TIS_620");//ISO-8859-1
//attend_description = new String (request.getParameter("txt_attend_description").getBytes("ISO8859_1"),"TIS-620");
//attend_remark = new String (request.getParameter("txt_attend_remark").getBytes("ISO8859_1"),"TIS-620");
//attend_user_id= new String (request.getParameter("txt_attend_user_id").getBytes("ISO8859_1"),"TIS_620");//ISO-8859-1
//attend_description = new String (request.getParameter("txt_attend_description").getBytes("ISO8859_1"),"TIS-620");
//attend_remark = new String (request.getParameter("txt_attend_remark").getBytes("ISO8859_1"),"TIS-620");

    int chk =notitnotirepairdb.Save(notitnotirepairdb.notitnotirepair, flagpage);

    if(chk>0 && flag_redirect.equals("1")){
        response.sendRedirect("noti_repair_view.jsp");
        }
    }
catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <table border="1">
            <thead>
                <tr>
                    <th></th>
                    <th></th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <td>attend_date</td>
                    <td><%out.print(attend_date); %></td>
                </tr>
                <tr>
                    <td>attend_description</td>
                    <td><%out.print(attend_description); %></td>
                </tr>
                <tr>
                    <td>attend_remark</td>
                    <td><%out.print(attend_remark); %></td>
                </tr>
                <tr>
                    <td></td>
                    <td><%out.print(text); %></td>
                </tr>
            </tbody>
        </table>
    </body>
</html>
