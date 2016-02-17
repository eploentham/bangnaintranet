<%-- 
    Document   : noti_repair_view
    Created on : 25 มิ.ย. 2552, 17:26:15
    Author     : pop
--%>
<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="bangnaLibrary.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
bangnaLibrary.Config1 config1 = new bangnaLibrary.Config1();

String text="";
try{
    Connection connbangna = config1.getConnectionBangna();
    //Connection connmainhis = config1.getConnectionMainHIS();
    Statement stbangna = connbangna.createStatement();
    String sql="", attend_date="", attend_department_namet="", attend_remark="", attend_user_id="";
    String attend_time="";
    String ma_date="", ma_user_id="", ma_description="", attend_description="", status_it="";
    String noti_repair_id="", status="", row_color="",flagunactive="", txtflagunactive="", txt_color="";
    String txt_color1="</font>";
    Integer row=0;
    status_it = config1.StringNull(request.getParameter("statusit"));
    status_it="1";
    if(status_it.equals("")){
        status_it = (String)session.getAttribute("status_it");
        }
    session.setAttribute("status_it", status_it);
    //session.setAttribute("statusit", status_it);
    if(request.getParameter("flagunactive")!=null) {
        flagunactive = new String (request.getParameter("flagunactive").getBytes("ISO8859_1"),"TIS-620");
    }

    NotiTNotiRepairDB notirepairdb = new NotiTNotiRepairDB();
    NotiTNotiRepair notirepair = new NotiTNotiRepair();
    Vector v_notirepair = notirepairdb.SelectNotiTNotiRepair("1", status_it);
    for(Integer i=0;i<=v_notirepair.size()-1;i++){
        notirepair = (NotiTNotiRepair)v_notirepair.get(i);
        row++;
        if(notirepair.getStringency().equals("1")){
            txt_color="<font color='#0000FF'>";
            txt_color1="</font>";
            }
        else if(notirepair.getStringency().equals("2")){
            txt_color="<font color='#333366'>";
            txt_color1="</font>";
            }
        else if(notirepair.getStringency().equals("3")){
            txt_color="<font color='#CD7054'>";//#CD7054 #CC00FF
            txt_color1="</font>";
            }
        else if(notirepair.getStringency().equals("4")){
            txt_color="<font color='#FF7F00'>";//#CC3333
            txt_color1="</font>";
            }
        else if(notirepair.getStringency().equals("5")){
            txt_color="<font color='#FF0000'>";//#FF0000 #FF7F00
            txt_color1="</font>";
            }
        if(notirepair.getStatus().equals("1")){
            row_color = "bgcolor='#FCF1F6'";
            }
        else if(notirepair.getStatus().equals("2")){
            row_color = "bgcolor='#E6E6FA'";
            }
        else if(notirepair.getStatus().equals("3")){
            row_color = "bgcolor='#CCCCCC'";
            }
        else if(notirepair.getStatus().equals("4")){
            row_color = "bgcolor='#F0F8FF'";
            }
        else if(notirepair.getStatus().equals("5")){
            row_color = "bgcolor='#ffffff'";
            }
        text+="<tr class='style14r' "+row_color+"> <td style='text-align: center' class='style14'>"+row.toString()+"</td>"
            +"<td class='nobg' ><div align='center'> "+txt_color+notirepair.getAttendDateddMMyy("ddMMyy")+" "+notirepair.getAttendTime()+txt_color+"</font></div></td>"
            +"<td>"+txt_color+notirepair.getAttendDepartmentNamet()+" ["+notirepair.getAttendDepartmentTelephone()+"] "+txt_color1+"</td>"
            +"<td><A HREF='noti_repair_add.jsp?noti_repair_id="+notirepair.getNotiRepairId()
            +"&flagpage=viewdetail' name='noti_repair_add' id='noti_repair_add'>"
            +txt_color+notirepair.getAttendDescription()+txt_color1+"</a></td>"
            +"<td>"+txt_color+notirepair.getAttendRemark()+txt_color1+"</td>"
            +"<td>"+notirepair.getAttendUserId()+"</td>"
            +"<td><div align='center'>"+notirepair.getMaDateddMMyy("ddMMyy")+"</div></td>"
            +"<td>"+notirepair.getMaUserId()+"</td>"
            +"<td>"+notirepair.getStatusNamet()+"<A HREF='noti_repair_add.jsp?noti_repair_id="+notirepair.getNotiRepairId()
            +"&flagpage=adddetail' NAME='noti_repair_add' ID='noti_repair_add'> &nbsp;<img src='images/icon1.gif' alt='' width='16' height='16' border='0'></A>"
            +"<A HREF='rpt_report_view.jsp?txt_report_name=noti_repair_attend_daily"
            +"&flagpage=adddetail&noti_repair_id="+notirepair.getNotiRepairId()
            +"&txt_form=daily' NAME='noti_repair_add' ID='noti_repair_add'>&nbsp;"
            +"<img src='images/printer-a.png' alt='' width='16' height='16' border='0'></A>";
            if(flagunactive.equals("1")) {
                txtflagunactive="<A HREF='noti_repair_add.jsp?noti_repair_id="+notirepair.getNotiRepairId()
                +"&flagpage=adddetail&flagunactive="+flagunactive+"' NAME='noti_repair_add' ID='noti_repair_add'> &nbsp;<img src='images/imgfolder.gif' alt='' width='16' height='16' border='0'></A>"
                +"</td></tr>";
                text=text+txtflagunactive;
                    }
            //+"<td>"+noti_repair_id+"</td>";
    }
    if(text.equals("")){
        text="<td>ไม่พบข้อมูล</td><td></td><td></td><td></td><td></td><td></td><td></td><td></td><td></td>";
        }
    }
catch(Exception ex){
    //JOptionPane.showMessageDialog(null, ex.getMessage());
    text = ex.getMessage();
    }
%>
<html>
    <head>
        <link href="css/css.css" rel="stylesheet" type="text/css">
        <meta http-equiv="Content-Type" content="text/html; charset=TIS-620">
    <title>JSP Page</title>
</head>
    <body>
    <%@include  file="noti_repair_header.jsp" %>

<table width="100%" border="0" cellspacing="0" cellpadding="0">
                    <!-- <tr><td><a href="noti_repair_add.jsp?noti_repair_id=&flagpage=viewdetail" class="style14b">แจ้งซ่อมใหม่ 11</a></td></tr>-->
                  		<tr><td>

                        	<table border="0" width="100%">
                            <thead>
                                <tr bgcolor="#336699"  class="style14w">
                                    <th width="15" ><div align="center">ลำดับ</div></th>
                                  <th width="90" ><div align="center">วัน-เวลาแจ้ง</div></th>
                                  <th width="150" bgcolor="#336699" ><div align="center">แผนก</div></th>
                                  <th width="180"><div align="center">รายละเอียดการแจ้ง</div></th>
                                    <th width="150"><div align="center">หมายเหตุ</div></th>
                                    <th width="100"><div align="center">ผู้แจ้ง</div></th>
                                    <th width="55"><div align="center">วัน-แก้ไข</div></th>
                                    <th width="80"><div align="center">ผู้แก้ไข</div></th>
                                    <th width="125" ><div align="center">สถานะ</div></th>
                                </tr>
                            </thead>
                            <tbody>
                                    <%out.print(text); %>
                            </tbody>
                        </table>

                        </td></tr>
</table>
        
</body>
</html>
