<%-- 
    Document   : header
    Created on : 9 ก.ค. 2552, 14:28:08
    Author     : pop
--%>

<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%
String status_it1="";
//status_it1 = session.getAttribute("statusit").toString();
status_it1 = (String)session.getAttribute("status_it");
//status_it1 = request.getParameter("statusit");
%>
<div id="tabs">
                                <ul>
                                        <!-- CSS Tabs -->
<li id="current"><a href="noti_repair_view.jsp?statusid="<%out.print(status_it1);%><span>ข้อมูลการแจ้งซ่อม</span></a></li>
<li><a href="noti_repair_add.jsp?noti_repair_id=&flagpage=viewdetail&statusit="<% out.print(status_it1);%>><span>แจ้งซ่อมใหม่</span></a></li>
<li><a href="Services.jsp"><span>ข้อมูลการแจ้งซ่อมเก่าๆ</span></a></li>
<li><a href="Support.html"><span>รายงานการแจ้งซ่อม</span></a></li>
<li><a href="noti_repair_view.jsp?noti_repair_id=&flagpage=viewdetail&flagunactive=1"><span>UnActive ข้อมูล</span></a></li>
<li><a href="noti_repair_audit.jsp"><span>ตรวจสอบใบนำส่งซ่อม</span></a></li>
<!--<li><a href="About.html"><span>About</span></a></li>-->

                                </ul>
                        </div>
<br>