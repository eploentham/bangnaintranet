<%--
    Document   : showAmphur
    Created on : Oct 7, 2009, 1:10:31 AM
    Author     : root
--%>

<%@page import ="java.sql.*" %>
<%@page import ="java.util.*" %>
<%@page import ="bangnaintranet.*" %>
<%@page import ="javax.swing.JOptionPane;" %>
<%@page contentType="text/html" pageEncoding="TIS-620"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<jsp:directive.page contentType="text/html"/>
<%
AdminTFoods foods_order = new AdminTFoods();
AdminTFoodsDetail foods_order_detail = new AdminTFoodsDetail();
AdminTFoodsDB foods_orderdb = new AdminTFoodsDB();

//String item_id = request.getParameter("itemId");
String date_start = request.getParameter("date_start");
String date_end = request.getParameter("date_end");
String branch_id = request.getParameter("branch_id");

String sql="", text="",row_color="",foods_date="", date_startdb="", date_enddb="",remark="", description = "", foods_datedb="";
String cnt_send="", cnt_receive="", cnt_approve="",nettotal_receive="",amount_approve="",nettotal_approve="", amount_receive="";
String admin_foods_id="", year="", month="", period="",flagpage="";
foods_date = request.getParameter("foods_date");
remark = new String (request.getParameter("remark").getBytes("ISO8859_1"),"TIS-620");
description = new String (request.getParameter("description").getBytes("ISO8859_1"),"TIS-620");
year = request.getParameter("year");
month = request.getParameter("month");
period = request.getParameter("period");
cnt_send = request.getParameter("cnt_send");
cnt_receive = request.getParameter("cnt_receive");
cnt_approve = request.getParameter("cnt_approve");
nettotal_receive = request.getParameter("nettotal_receive");
amount_approve = request.getParameter("amount_approve");
amount_receive = request.getParameter("amount_receive");
nettotal_approve = request.getParameter("nettotal_approve");
flagpage = request.getParameter("flagpage");
admin_foods_id = request.getParameter("admin_foods_id");
if(nettotal_approve.equals("")){
    nettotal_approve = "0.0";
    }
if(amount_approve.equals("")){
    amount_approve = "0.0";
    }
if(nettotal_receive.equals("")){
    nettotal_receive = "0.0";
    }
if(cnt_approve.equals("")){
    cnt_approve = "0.0";
    }
if(cnt_receive.equals("")){
    cnt_receive = "0.0";
    }
if(cnt_send.equals("")){
    cnt_send = "0.0";
    }

Config1 config1 = new Config1();
Integer row=0;
Vector v_foods_order = new Vector();
date_startdb = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
date_enddb = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
foods_datedb = config1.DateFormatShow2DB(foods_date, "ddMMyyyy");

foods_order.setAdminFoodsId(admin_foods_id);
foods_order.setRemark(remark);
foods_order.setDescription(description);
foods_order.setDateStart(date_startdb);
foods_order.setDateEnd(date_enddb);
foods_order.setAdminFoodsDate(foods_datedb);
foods_order.setBranchId(branch_id);
foods_order.setAdminFoodsYear(year);
foods_order.setAdminFoodsMonth(month);
foods_order.setAdminFoodsPeriod(period);
foods_order.setcntSend(Double.parseDouble(cnt_send));
foods_order.setcntReceive(Double.parseDouble(cnt_receive));
foods_order.setcntApprove(Double.parseDouble(cnt_approve));
foods_order.setNettotalReceive(Double.parseDouble(nettotal_receive));
foods_order.setAmountApprove(Double.parseDouble(amount_approve));
foods_order.setNettotalApprove(Double.parseDouble(nettotal_approve));
foods_order.setAmountReceive(Double.parseDouble(amount_receive));
admin_foods_id = foods_orderdb.setSaveNurseFoodsOrder(branch_id,foods_order,flagpage);
v_foods_order = foods_orderdb.getAdminFoodsOrder(admin_foods_id,"date");
for(int i=0;i<=v_foods_order.size()-1;i++){
    row++;
    foods_order_detail = (AdminTFoodsDetail)v_foods_order.get(i);
    foods_date = config1.DateFormatDB2Show(foods_order_detail.getFoodsOrderDate(), "ddMMyyyy");
    text += "<tr class='style14' "+row_color+"><td width='10' align='center'>"+row.toString()+"</td>"+
    "<td width='15' align='center'>"+foods_date+"</td>"+
    "<td align='center'>"+foods_order_detail.getCntFoodsId()+"</td>"+
    "<td align='center'>"+foods_order_detail.getAmountFoodsId()+"</td></tr>";
    }
%>
<table border="0" width="720" align="center">
    <thead>
        <tr align="center" class='style14r'><td width="5" align="center">ลำดับที่</td>
            <td width="8">วันที่</td>
            <td width="20">จำนวน</td>
            <td width="20">มูลค่า</td>
    </tr></thead>
    <tbody>
        <% out.print(text); %>
    </tbody></table>