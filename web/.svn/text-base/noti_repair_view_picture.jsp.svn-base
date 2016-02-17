<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01//EN"
	"http://www.w3.org/TR/html4/strict.dtd">

<%
String noti_repair_id="", filename="";
//NotiTNotiRepair noti_repair = new NotiTNotiRepair();
noti_repair_id = new String (request.getParameter("noti_repair_id").getBytes("ISO8859_1"),"TIS-620");
//noti_repair.setNotiRepairId(noti_repair_id);
filename = "http://172.1.1.3/intranet/picture/"+noti_repair_id+ ".jpg";
%>
<html>
    <head>
    	<title>Dojo Toolkit Test Page</title>

	<!-- load the dojo toolkit base -->
	<script type="text/javascript" src="js/dojo1.3.1/dojo/dojo.js"
	    djConfig="parseOnLoad:true, isDebug:false"></script>

	<script type="text/javascript">
	/* our JavaScript will go here */
	</script>
        <script type="text/javascript">
          dojo.require("dijit.form.DateTextBox");
          dojo.require("dojo.parser");
        </script>

	<style type="text/css">
	/* our CSS can go here */
	</style>
    </head>
    <body><!-- this is a Typical WebPage starting point ... -->
    <img src="<%out.print(noti_repair_id);%>" alt=""  border="0">
    </body>
</html>
