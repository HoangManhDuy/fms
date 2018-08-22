<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<c:set var="context" value="${pageContext.request.contextPath}" />

<div class="cbp-spmenu cbp-spmenu-vertical cbp-spmenu-left"
	id="cbp-spmenu-s1">
	<!--left-fixed -navigation-->
	<aside class="sidebar-left">
		<nav class="navbar navbar-inverse">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle collapsed"
					data-toggle="collapse" data-target=".collapse"
					aria-expanded="false">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<h1>
					<a class="navbar-brand" href="${context}/adminHome"><span
						class="fa fa-area-chart"></span> HD-SIS<span
						class="dashboard_text">Manager</span></a>
				</h1>
			</div>
			<div class="collapse navbar-collapse"
				id="bs-example-navbar-collapse-1">
				<ul class="sidebar-menu">
					<li class="header">MAIN NAVIGATION</li>
					<li class="treeview"><a href="${context}/adminHome"> <i
							class="fa fa-home"></i> <span>Home Page Manager</span>
					</a></li>
					<li class="treeview"><a href="#"> <i
							class="fa fa-group (alidas)"></i> <span>Students</span> <i
							class="fa fa-angle-left pull-right"></i>
					</a></li>

					<li class="treeview"><a href="${context}/adminSubject/0"> <i
							class="fa fa-suitcase"></i> <span>Subjects</span> <i
							class="fa fa-angle-left pull-right"></i>
					</a></li>
					<li class="treeview"><a href="#"> <i
							class="fa fa-calendar"></i> <span>Rooms</span> <i
							class="fa fa-angle-left pull-right"></i>
					</a></li>
				</ul>
			</div>
			<!-- /.navbar-collapse -->
		</nav>
	</aside>
</div>
