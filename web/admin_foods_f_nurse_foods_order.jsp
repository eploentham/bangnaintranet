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
String sql="", text="",row_color="",foods_date="", date_startdb="", date_enddb="";
Config1 config1 = new Config1();
Integer row=0;
Vector v_foods_order = new Vector();
date_startdb = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
date_enddb = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
v_foods_order = foods_orderdb.getNurseFoodsOrder(branch_id, date_startdb, date_enddb);
for(int i=0;i<=v_foods_order.size()-1;i++){
    row++;
    foods_order_detail = (AdminTFoodsDetail)v_foods_order.get(i);
    foods_date = config1.DateFormatDB2Show(foods_order_detail.getFoodsOrderDate(), "ddMMyyyy");
    text += "<tr class='style14' "+row_color+"><td width='10' align='center'>"+row.toString()+"</td>"+
    "<td width='15' align='center'>"+foods_date+"</td>"+
    "<td align='left'>"+foods_order_detail.getPaidNamet()+"</td>"+
    "<td align='left'>"+foods_order_detail.getTypeFoodsNamet()+"</td>"+
    "<td align='center'>"+foods_order_detail.getFoodsPrice()+"</td>"+
    "<td align='center'>"+foods_order_detail.getCntFoodsId()+"</td>"+
    "<td align='center'>"+foods_order_detail.getAmountFoodsId()+"</td></tr>";
    }
%>
<table border="0" width="720" align="center">
    <thead>
        <tr align="center" class='style14r'><td width="5" align="center">ลำดับที่</td>
            <td width="8">วันที่</td>
            <td width="10">ประเภทการรับชำระ</td>
            <td width="10">ประเภทอาหาร</td>
            <td width="10">ราคาอาหาร</td>
            <td width="20">จำนวน</td>
            <td width="20">มูลค่า</td>
    </tr></thead>
    <tbody>
        <% out.print(text); %>
    </tbody></table>