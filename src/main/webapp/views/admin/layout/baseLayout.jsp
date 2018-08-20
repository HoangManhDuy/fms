<%@ page language="java" contentType="text/html; charset=utf-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras"
	prefix="tilesx"%>
<!DOCTYPE html>
<html>
<head>
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Glance Design Dashboard Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
	SmartPhone Compatible web template, free WebDesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	
	 addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } 

</script>
<!-- Bootstrap Core CSS -->
<link href="<c:url value ="/assets/css/admin/css/bootstrap.css" />"
	rel='stylesheet' type='text/css' />
<!-- Custom CSS -->
<link href="<c:url value ="/assets/css/admin/css/style.css" />"
	rel='stylesheet' type='text/css' />
<!-- font-awesome icons CSS -->
<link
	href="<c:url value ="/assets/fonts/font-awesome-4.7.0/css/font-awesome.css" />"
	rel="stylesheet">
<!-- //font-awesome icons CSS-->
<!-- side nav css file -->
<link href="<c:url value="/assets/css/admin/css/SidebarNav.min.css" />"
	media='all' rel='stylesheet' type='text/css' />
<!-- //side nav css file -->
<!--webfonts-->
<link
	href="//fonts.googleapis.com/css?family=PT+Sans:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext"
	rel="stylesheet">
<!--//webfonts-->
<!-- Metis Menu -->
<link href="<c:url value="/assets/css/admin/css/custom.css" />"
	rel="stylesheet">
<!--//Metis Menu -->

</head>
<body class="cbp-spmenu-push">
	<div class="main-content">
		<tiles:insertAttribute name="sidebar" />
		<!--left-fixed -navigation-->
		<!-- header-starts -->
		<tiles:insertAttribute name="header" />
		<!-- //header-ends -->
		<!-- main content start-->
		<div id="page-wrapper">
			<tiles:insertAttribute name="body" />
		</div>
		<!--footer-->
		<tiles:insertAttribute name="footer" />
		<!--//footer-->
	</div>
	<!-------------------------------------------------------------------------->
	<script
		src="<c:url value="/assets/js/admin/js/jquery-1.11.1.min.js" />"></script>
	<!-- Bootstrap Core JavaScript -->
	<script src="<c:url value="/assets/js/admin/js/bootstrap.js" />"></script>
	<!-- //Bootstrap Core JavaScript -->
	<script src="<c:url value="/assets/js/admin/js/metisMenu.min.js" />"></script>
	<script src="<c:url value="/assets/js/admin/js/custom.js" />"></script>
	<!--Classie -->
	<!-- for toggle left push menu script -->
	<script src="<c:url value="/assets/js/admin/js/classie.js" />"></script>
	<script>
		var menuLeft = document.getElementById('cbp-spmenu-s1'), showLeftPush = document
				.getElementById('showLeftPush'), body = document.body;
		showLeftPush.onclick = function() {
			classie.toggle(this, 'active');
			classie.toggle(body, 'cbp-spmenu-push-toright');
			classie.toggle(menuLeft, 'cbp-spmenu-open');
			disableOther('showLeftPush');
		};

		function disableOther(button) {
			if (button !== 'showLeftPush') {
				classie.toggle(showLeftPush, 'disabled');
			}
		}
	</script>
	<!-- //Classie -->
	<!-- //for toggle left push menu script -->


</body>
</html>
