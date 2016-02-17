<%-- 
    Document   : asset_save
    Created on : 29 ¡.¤. 2552, 23:31:41
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
BAssetDB bassetdb = new BAssetDB();
Config1 config1 = new Config1();
BAsset basset = new BAsset();
String asset_id="", asset_namet="", branch_id="", type_device_id="", department_id="";
String vendor_id="", brand_id="", model="",serial_no="",service_tab="",date_buy="",price="",warranty="";
String asset_status="", remark="",warranty_status="";
String flag_redirect="", text="", flag="", asset_active="";
try{
    if(request.getParameter("flag")!=null){
        flag = new String (request.getParameter("flag").getBytes("ISO8859_1"),"TIS-620");
        }
    else{
        flag = "";
        }
    if(request.getParameter("txt_asset_active")!=null){
        asset_active = new String (request.getParameter("txt_asset_active").getBytes("ISO8859_1"),"TIS-620");
        }
    else{
        asset_active = "";
        }
    if(asset_active.equals("")){
        asset_active = "1";
        }
    basset.setAssetActive(asset_active);
    if(request.getParameter("flag_redirect")!=null){
        flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
    }
    else{
        flag_redirect = "";
    }

    if(request.getParameter("txt_asset_id")!=null){
        asset_id = new String (request.getParameter("txt_asset_id").getBytes("ISO8859_1"),"TIS-620");
        asset_id = asset_id.trim();
    }
    else{
        asset_id = "";
    }
    basset.setAssetId(asset_id);
    
    if(request.getParameter("txt_asset_namet")!=null){
        asset_namet = new String (request.getParameter("txt_asset_namet").getBytes("ISO8859_1"),"TIS-620");
        asset_namet = asset_namet.trim();
    }
    else{
        asset_namet = "";
    }
    basset.setAssetNamet(asset_namet);
    if(request.getParameter("chk_asset_status")!=null){
        asset_status = new String (request.getParameter("chk_asset_status").getBytes("ISO8859_1"),"TIS-620");
        asset_status = asset_status.trim();
    }
    else{
        asset_status = "";
    }
    basset.setAssetStatus(asset_status);
    if(request.getParameter("cbo_branch")!=null){
        branch_id = new String (request.getParameter("cbo_branch").getBytes("ISO8859_1"),"TIS-620");
        branch_id = branch_id.trim();
    }
    else{
        branch_id = "";
    }
    basset.setBranchId(branch_id);
    if(request.getParameter("cbo_type_device")!=null){
        type_device_id = new String (request.getParameter("cbo_type_device").getBytes("ISO8859_1"),"TIS-620");
        type_device_id = type_device_id.trim();
    }
    else{
        type_device_id = "";
    }
    basset.setTypeDeviceId(type_device_id);
    if(request.getParameter("cbo_department")!=null){
        department_id = new String (request.getParameter("cbo_department").getBytes("ISO8859_1"),"TIS-620");
        department_id = department_id.trim();
    }
    else{
        department_id = "";
    }
    basset.setDepartmentId(department_id);
    if(request.getParameter("cbo_vendor")!=null){
        vendor_id = new String (request.getParameter("cbo_vendor").getBytes("ISO8859_1"),"TIS-620");
        vendor_id = vendor_id.trim();
    }
    else{
        vendor_id = "";
    }
    basset.setVendorId(vendor_id);
    if(request.getParameter("cbo_brand")!=null){
        brand_id = new String (request.getParameter("cbo_brand").getBytes("ISO8859_1"),"TIS-620");
        brand_id = brand_id.trim();
    }
    else{
        brand_id = "";
    }
    basset.setBrandId(brand_id);
    if(request.getParameter("txt_model")!=null){
        model = new String (request.getParameter("txt_model").getBytes("ISO8859_1"),"TIS-620");
        model = model.trim();
    }
    else{
        model = "";
    }
    basset.setModel(model);
    if(request.getParameter("txt_serial_no")!=null){
        serial_no = new String (request.getParameter("txt_serial_no").getBytes("ISO8859_1"),"TIS-620");
        serial_no = serial_no.trim();
    }
    else{
        serial_no = "";
        }
    basset.setSerialNo(serial_no);


    if(request.getParameter("txt_service_tab")!=null){
        service_tab = new String (request.getParameter("txt_service_tab").getBytes("ISO8859_1"),"TIS-620");
        service_tab = service_tab.trim();
    }
    else{
        service_tab = "";
        }
    basset.setServiceTab(service_tab);
    if(request.getParameter("txt_date_buy")!=null){
        date_buy = new String (request.getParameter("txt_date_buy").getBytes("ISO8859_1"),"TIS-620");
        date_buy = date_buy.trim();
    }
    else{
        date_buy = "";
        }
    date_buy = config1.DateFormatShow2DB(date_buy, "ddMMyyyy");
    basset.setDateBuy(date_buy);


    if(request.getParameter("txt_price")!=null){
        price = new String (request.getParameter("txt_price").getBytes("ISO8859_1"),"TIS-620");
        price = price.trim();
    }
    else{
        price = "0.0";
        }
    basset.setPrice(Double.parseDouble(price));
    if(request.getParameter("txt_warranty")!=null){
        warranty = new String (request.getParameter("txt_warranty").getBytes("ISO8859_1"),"TIS-620");
        warranty = warranty.trim();
    }
    else{
        warranty = "";
        }
    basset.setWarranty(warranty);
    if(request.getParameter("txt_remark")!=null){
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        remark = remark.trim();
    }
    else{
        remark = "";
        }
    basset.setRemark(remark);
    if(request.getParameter("chk_warranty_status")!=null){
        warranty_status = new String (request.getParameter("chk_warranty_status").getBytes("ISO8859_1"),"TIS-620");
        warranty_status = warranty_status.trim();
    }
    else{
        warranty_status = "";
    }
    basset.setWarrantyStatus(warranty_status);

    //basset.setAssetActive("1");
    
    //attend_date = config1.DateFormatShow2DB(attend_date, "ddMMyyyy");
    //ma_date = config1.DateFormatShow2DB(ma_date, "ddMMyyyy");

    //notitnotirepairdb.notitnotirepair.setPriceRepair(Double.parseDouble(price_repair));

//attend_date = new String (request.getParameter("txt_attend_date").getBytes("ISO8859_1"),"TIS_620");//ISO-8859-1
//attend_description = new String (request.getParameter("txt_attend_description").getBytes("ISO8859_1"),"TIS-620");
//attend_remark = new String (request.getParameter("txt_attend_remark").getBytes("ISO8859_1"),"TIS-620");
//attend_user_id= new String (request.getParameter("txt_attend_user_id").getBytes("ISO8859_1"),"TIS_620");//ISO-8859-1
//attend_description = new String (request.getParameter("txt_attend_description").getBytes("ISO8859_1"),"TIS-620");
//attend_remark = new String (request.getParameter("txt_attend_remark").getBytes("ISO8859_1"),"TIS-620");

    int chk =bassetdb.setSaveBAsset(basset, "");

    if(chk>0 && flag_redirect.equals("1")){
        response.sendRedirect("asset_view.jsp");
        }
    else{
        response.sendRedirect("asset_view.jsp");
        }
    }
catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
        <title>JSP Page</title>
    </head>
    <body>
        
    </body>
</html>
