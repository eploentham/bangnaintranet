<%-- 
    Document   : admin_use_car_save
    Created on : 8 ¡.Â. 2552, 0:55:09
    Author     : pop
--%>

<%@page import ="java.net.InetAddress;" %>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.Vector" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
Config1 config1 = new Config1();
AdminTUseCar use_car = new AdminTUseCar();
AdminTUseCarDB use_cardb = new AdminTUseCarDB();
String flag_redirect="", use_car_id="", text="", use_car_date="",use_car_active="",use_car_time="",apply_date="";
String department_id="",use_category="",destination="",description="",remark="",user_id_use_car="",user_namet_use_car="";
String user_id_approve="",user_namet_approve="",user_id_driver="",user_namet_driver="",branch_id="",car_id="";
try{

    if(request.getParameter("flag_redirect")!=null){
        flag_redirect = new String (request.getParameter("flag_redirect").getBytes("ISO8859_1"),"TIS-620");
        flag_redirect = flag_redirect.trim();
        }
    else{
        flag_redirect = "";
        }
    if(request.getParameter("txt_use_car_id")!=null){
        use_car_id = new String (request.getParameter("txt_use_car_id").getBytes("ISO8859_1"),"TIS-620");
        use_car_id = use_car_id.trim();
        }
    else{
        use_car_id = "";
        }
    use_car.setUseCarId(use_car_id);
    if(request.getParameter("txt_use_car_active")!=null){
        use_car_active = new String (request.getParameter("txt_use_car_active").getBytes("ISO8859_1"),"TIS-620");
        use_car_active = use_car_active.trim();
        }
    else{
        use_car_active = "";
        }
    if(use_car_active.equals("")){
        use_car_active = "1";
        }
    use_car.setUseCarActive(use_car_active);
    if(request.getParameter("txt_branch_id")!=null){
        branch_id = new String (request.getParameter("txt_branch_id").getBytes("ISO8859_1"),"TIS-620");
        branch_id = branch_id.trim();
        }
    else{
        branch_id = "";
        }
    use_car.setBranchId(branch_id);
    if(request.getParameter("txt_use_car_date")!=null){
        use_car_date = new String (request.getParameter("txt_use_car_date").getBytes("ISO8859_1"),"TIS-620");
        use_car_date = use_car_date.trim();
        }
    else{
        use_car_date = "";
        }
    use_car_date = config1.DateFormatShow2DB(use_car_date, "ddMMyyyy");
    use_car.setUseCarDate(use_car_date);
    if(request.getParameter("txt_use_car_time")!=null){
        use_car_time = new String (request.getParameter("txt_use_car_time").getBytes("ISO8859_1"),"TIS-620");
        use_car_time = use_car_time.trim();
        }
    else{
        use_car_time = "";
        }
    use_car.setUseCarTime(use_car_time);
    if(request.getParameter("txt_apply_date")!=null){
        apply_date = new String (request.getParameter("txt_apply_date").getBytes("ISO8859_1"),"TIS-620");
        apply_date = apply_date.trim();
        }
    else{
        apply_date = "";
        }
    apply_date = config1.DateFormatShow2DB(apply_date, "ddMMyyyy");
    use_car.setApplyDate(apply_date);
    if(request.getParameter("cbo_department")!=null){
        department_id = new String (request.getParameter("cbo_department").getBytes("ISO8859_1"),"TIS-620");
        department_id = department_id.trim();
        }
    else{
        department_id = "";
        }
    use_car.setDepartmentId(department_id);
    if(request.getParameter("cbo_car")!=null){
        car_id = new String (request.getParameter("cbo_car").getBytes("ISO8859_1"),"TIS-620");
        car_id = car_id.trim();
        }
    else{
        car_id = "";
        }
    use_car.setCarId(car_id);
    if(request.getParameter("chk_use_category")!=null){
        use_category = new String (request.getParameter("chk_use_category").getBytes("ISO8859_1"),"TIS-620");
        use_category = use_category.trim();
        }
    else{
        use_category = "";
        }
    use_car.setUseCategory(use_category);
    if(request.getParameter("txt_destination")!=null){
        destination = new String (request.getParameter("txt_destination").getBytes("ISO8859_1"),"TIS-620");
        destination = destination.trim();
        }
    else{
        destination = "";
        }
    use_car.setDestination(destination);
    if(request.getParameter("txt_description")!=null){
        description = new String (request.getParameter("txt_description").getBytes("ISO8859_1"),"TIS-620");
        description = description.trim();
        }
    else{
        description = "";
        }
    use_car.setDescription(description);
    if(request.getParameter("txt_remark")!=null){
        remark = new String (request.getParameter("txt_remark").getBytes("ISO8859_1"),"TIS-620");
        remark = remark.trim();
        }
    else{
        remark = "";
        }
    use_car.setRemark(remark);
    if(request.getParameter("txt_user_id_use_car")!=null){
        user_id_use_car = new String (request.getParameter("txt_user_id_use_car").getBytes("ISO8859_1"),"TIS-620");
        user_id_use_car = user_id_use_car.trim();
        }
    else{
        user_id_use_car = "";
        }
    use_car.setUserIdUseCar(user_id_use_car);
    if(request.getParameter("txt_user_namet_use_car")!=null){
        user_namet_use_car = new String (request.getParameter("txt_user_namet_use_car").getBytes("ISO8859_1"),"TIS-620");
        user_namet_use_car = user_namet_use_car.trim();
        }
    else{
        user_namet_use_car = "";
        }
    use_car.setUserNametUseCar(user_namet_use_car);
    if(request.getParameter("txt_user_id_approve")!=null){
        user_id_approve = new String (request.getParameter("txt_user_id_approve").getBytes("ISO8859_1"),"TIS-620");
        user_id_approve = user_id_approve.trim();
        }
    else{
        user_id_approve = "";
        }
    use_car.setUserIdApprove(user_id_approve);
    if(request.getParameter("txt_user_namet_approve")!=null){
        user_namet_approve = new String (request.getParameter("txt_user_namet_approve").getBytes("ISO8859_1"),"TIS-620");
        user_namet_approve = user_namet_approve.trim();
        }
    else{
        user_namet_approve = "";
        }
    use_car.setUserNametApprove(user_namet_approve);
    if(request.getParameter("txt_user_id_driver")!=null){
        user_id_driver = new String (request.getParameter("txt_user_id_driver").getBytes("ISO8859_1"),"TIS-620");
        user_id_driver = user_id_driver.trim();
        }
    else{
        user_id_driver = "";
        }
    use_car.setUserIdDriver(user_id_driver);
    if(request.getParameter("txt_user_namet_driver")!=null){
        user_namet_driver = new String (request.getParameter("txt_user_namet_driver").getBytes("ISO8859_1"),"TIS-620");
        user_namet_driver = user_namet_driver.trim();
        }
    else{
        user_namet_driver = "";
        }
    use_car.setUserNametDriver(user_namet_driver);
    String chk = use_cardb.setSaveAdminTUseCar(use_car, "");
    if(!chk.equals("")){
        if(flag_redirect.equals("")){
            response.sendRedirect("admin_use_car_add.jsp?txt_use_car_id="+chk);
            }
        else if(flag_redirect.equals("cancel")){
            response.sendRedirect("admin_use_car_add.jsp?txt_use_car_id="+chk);
            }
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
