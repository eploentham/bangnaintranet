<%--
    Document   : admin_bill_lab_detail_show
    Created on : 23 ก.ค. 2552, 0:03:40
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
AdminTFoods foods_order = new AdminTFoods();
AdminTFoodsDetail foods_order_detail = new AdminTFoodsDetail();
AdminTFoodsDB foods_orderdb = new AdminTFoodsDB();
NurseTFoodsOrderDB nurse_foods_orderdb = new NurseTFoodsOrderDB();
NurseTFoodsOrderDetail nurse_foods_order_detail = new NurseTFoodsOrderDetail();

Integer row=0,no=0;

Vector v_admin_foods_order_detail = new Vector();
String admin_foods_id = "", text="", foods_order_date="",date="",bill_lab_year="",foods_order_datedb="";
String bill_lab_month="",bill_lab_period="", bill_lab_desc="", flag="",row_color="",flagpage="", foods_order_id="";
try{
    if(request.getParameter("admin_foods_id")!=null){
        admin_foods_id = request.getParameter("admin_foods_id");
    }
    if(request.getParameter("foods_order_date")!=null){
        foods_order_date = request.getParameter("foods_order_date");
    }
    if(request.getParameter("flagpage")!=null){
        flagpage = new String (request.getParameter("flagpage").getBytes("ISO8859_1"),"TIS-620");
    }
    if(foods_order_date.length()>=8){
        foods_order_date = foods_order_date.substring(0, 4)+"-"+foods_order_date.substring(4, 6)+"-"+foods_order_date.substring(6, 8);
        }
    //bill_lab_id = bill_lab_id.substring(1, bill_lab_id.length());
    
    foods_order_datedb = foods_order_date;
    if(flagpage.equals("viewdetail")){
        v_admin_foods_order_detail = foods_orderdb.getAdminTFoodsDetail(admin_foods_id, "", foods_order_datedb, "date");
        for(int i=0;i<=v_admin_foods_order_detail.size()-1;i++){
            row++;
            foods_order_detail = (AdminTFoodsDetail)v_admin_foods_order_detail.get(i);
            foods_order_date = config1.DateFormatDB2Show(foods_order_detail.getFoodsOrderDate(), "ddMMyyyy");
            text += "<tr class='style14' "+row_color+"><td width='10' align='center'>"+row.toString()+"</td>"+
            "<td width='15' align='center'>"+foods_order_date+"</td>"+
            "<td align='left'>"+foods_order_detail.getPaidNamet()+"</td>"+
            "<td align='left'>"+foods_order_detail.getTypeFoodsNamet()+"</td>"+
            "<td align='center'>"+foods_order_detail.getCntFoodsId()+"</td>"+
            "<td align='center'>"+foods_order_detail.getAmountFoodsId()+"</td></tr>";
            }
       }
    else{
        v_admin_foods_order_detail = nurse_foods_orderdb.getNurserFoodsOrderDetail("", foods_order_datedb, "viewnursedetail");
        foods_order_date = config1.DateFormatDB2Show(foods_order_date, "ddMMyyyy");
        for(int i=0;i<=v_admin_foods_order_detail.size()-1;i++){
            row++;
            
            nurse_foods_order_detail = (NurseTFoodsOrderDetail)v_admin_foods_order_detail.get(i);
            if(!nurse_foods_order_detail.getFoodsOrderId().equals(foods_order_id)){
                foods_order_id = nurse_foods_order_detail.getFoodsOrderId();
                no=1;
            }
            else {
                no++;
                }
            //foods_order_date = config1.DateFormatDB2Show(nurse_foods_order_detail.getFoodsOrderDate(), "ddMMyyyy");
            text += "<tr class='style14' "+row_color+"><td width='10' align='center'>"+row.toString()+"</td>"+
            "<td width='15' align='center'>"+foods_order_date+"</td>"+
            "<td align='left'>"+nurse_foods_order_detail.getWardNamet()+"</td>"+
            "<td align='left'>"+nurse_foods_order_detail.getFoodsOrderId()+"</td>"+
            "<td align='left'>"+no+"</td>"+
            "<td align='center'>"+nurse_foods_order_detail.getRoomId()+"</td>"+
            "<td align='center'>"+nurse_foods_order_detail.getBedId()+"</td>"+
            "<td align='center'>"+nurse_foods_order_detail.getPatientHnNo()+"</td>"+
            "<td align='left'>"+nurse_foods_order_detail.getPatientFullnamet()+"</td>"+
            "<td align='left'>"+nurse_foods_order_detail.getPaidNamet()+"</td>"+
            "<td align='left'>"+nurse_foods_order_detail.getTypeFoodsNamet()+"</td>"+
            "<td align='center'>"+nurse_foods_order_detail.getFoodsPrice()+"</td>"+
            "<td align='left'>"+nurse_foods_order_detail.getRemark()+"</td></tr>";
            }
        }
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
        
         <style type="text/css">
          .progressBar {
            position: relative;
            width: 256px;
            height: 16px;
            border: 1px solid black;
          }
        </style>
    </head>
    <body><form>

            <table border="0" width="100%" align="center">
            <thead>
        <tr align="center" class='style14r'>
            <% if(flagpage.equals("viewdetail")) { %>
            <th width="3" align="center">ลำดับ</th>
            <th width="10">วันที่</th>
            <th width="100">สิทธิผู้มาใช้บริการ</th>
            <th width="180">ประเภทอาหาร</th>
            <th width="80">ราคา</th>
            <th width="7">จำนวน</th>
            <% } else { %>
            <th width="3" align="center">ลำดับ</th>
            <th width="10">วันที่</th>
            <th width="50">แผนก</th>
            <th width="25">เลขที่</th>
            <th width="25">ลำดับ</th>
            <th width="25">ห้อง</th>
            <th width="25">เตียง</th>
            <th width="50">HN</th>
            <th width="120">ชื่อผู้มาใช้บริการ</th>
            <th width="65">สิทธิการรักษา</th>
            <th width="120">ประเภทอาหาร</th>
            <th width="30">ราคา</th>
            <th width="100">หมายเหตุ</th>
            <% } %>
    </tr></thead>
    <tbody>
        <%out.print(text); %>
                </tbody>
            </table>
        
            </form>
    </body>
    <script type='text/javascript'>

var isHistoryShortcutDisabled=false;

Event.observe(  document,  'contextmenu',
function(event){
    Event.stop(event);
    return false;
  }
);
Event.observe(document,'keypress',  checkHistoryShortcutDisabled);
Event.observe(document,'keydown',  disableHistoryShortcuts);

// On Key Down event handler
function disableHistoryShortcuts(event)
{
    // the tag name of the event's target element
    var targetTag = Event.element(event).tagName;
    var isTextInput = ( (targetTag == 'TEXTAREA') || (targetTag == 'INPUT'));

    // the key code of the key being pressed
    var keyCode = event.which || event.keyCode;

    //key presses we want to block
    if (( keyCode == 116) ||                     // F5
        ((keyCode ==   8) && (!isTextInput))  || // backspace
        ((keyCode ==  36) && event.altKey)    || // home + alt
        ((keyCode ==  37) && event.altKey)    || // left arrow + alt
        ((keyCode ==  39) && event.altKey)    || // right arrow + alt
        ((keyCode ==  37) && event.ctrlKey)   || // left arrow + ctl
        ((keyCode ==  39) && event.ctrlKey)   || // right arrow + ctl
        ((keyCode ==  82) && event.ctrlKey)   || // r + control
        ((keyCode ==  72) && event.ctrlKey))     // h + control
    {
        // used in the on key press event handler to determine
        // if propagation should be stopped (for Mozilla/FireFox)
        isHistoryShortcutDisabled=true;
        Event.stop(event);
        return false;
    }
}

// On Key Press event handler
function checkHistoryShortcutDisabled(event){
    if(isHistoryShortcutDisabled){
        isHistoryShortcutDisabled=false;
        Event.stop(event);
        return false;
    }

}

</script>

</html>
