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
String year_id = request.getParameter("year");
//String date_end = request.getParameter("date_end");
String branch_id = request.getParameter("branch_id");
String sql="", text="",row_color="",foods_date="", date_start="", date_end="";
Config1 config1 = new Config1();
Integer row=0;
Vector v_foods_order = new Vector();
//date_startdb = config1.DateFormatShow2DB(date_start, "ddMMyyyy");
//date_enddb = config1.DateFormatShow2DB(date_end, "ddMMyyyy");
v_foods_order = foods_orderdb.getAdminTFoods(branch_id, year_id, "year");
for(int i=0;i<=v_foods_order.size()-1;i++){
    row++;
    foods_order = (AdminTFoods)v_foods_order.get(i);
    date_start = config1.DateFormatDB2Show(foods_order.getDateStart(), "ddMMyyyy");
    date_end = config1.DateFormatDB2Show(foods_order.getDateEnd(), "ddMMyyyy");
    text += "<tr class='style14' "+row_color+"><td width='10' align='center'>"+row.toString()+"</td>"+
    "<td align='center'><a HREF='admin_foods_order_add.jsp?admin_foods_id="+foods_order.getAdminFoodsId()+"&flagpage=viewdetail' name='admin_foods_add' id='admin_foods_add'> "+foods_order.getDescription()+"</a></td>"+
    "<td align='center'>"+foods_order.getAdminFoodsYear()+" "+config1.getMonthNamet(foods_order.getAdminFoodsMonth(),"id_name")+" "+" "+config1.getPeriodNamet(foods_order.getAdminFoodsPeriod(),"id_name")+"</td>"+
    "<td align='center'>"+date_start+" "+date_end+"</td>"+
    "<td align='center'>"+foods_order.getNettotalApprove()+"</td>"+
    "<td align='center'>"+foods_order.getRemark()+"</td></tr>";
    }
%>
<table border="0" width="100%" align="center">
    <thead>
        <tr align="center" class='style14r'><td width="5" align="center">ลำดับที่</td>
            <td width="180">รายละเอียด</td>
            <td width="120">ปี-เดือน-งวด</td>
            <td width="120">วันที่คิด-ถึงวันที่</td>
            <td width="20">มูลค่า</td>
            <td width="8">หมายเหตุ</td>
    </tr></thead>
    <tbody>
        <% out.print(text); %>
    </tbody></table>