<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="context" value="${pageContext.request.contextPath}" />

<div class="sticky-header header-section ">
	<div class="header-left">
		<!--toggle button start-->
		<button id="showLeftPush">
			<i class="fa fa-bars"></i>
		</button>
		<!--toggle button end-->
		<div class="profile_details_left">
			<!--notifications of menu start -->
			<ul class="nofitications-dropdown">
				<li class="dropdown head-dpdn"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"><i class="fa fa-envelope"></i><span
						class="badge">4</span></a>
					<ul class="dropdown-menu">
						<li>
							<div class="notification_header">
								<h3>You have 3 new messages</h3>
							</div>
						</li>
						<li><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/1.jpg" />" alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li class="odd"><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/4.jpg" />" alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/3.jpg" />" alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/2.jpg" /> " alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li>
							<div class="notification_bottom">
								<a href="#">See all messages</a>
							</div>
						</li>
					</ul></li>
				<li class="dropdown head-dpdn"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false"><i class="fa fa-bell"></i><span
						class="badge blue">4</span></a>
					<ul class="dropdown-menu">
						<li>
							<div class="notification_header">
								<h3>You have 3 new notification</h3>
							</div>
						</li>
						<li><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/4.jpg" /> " alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li class="odd"><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/1.jpg" /> " alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/3.jpg" /> " alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li><a href="#">
								<div class="user_img">
									<img src="<c:url value="/assets/images/admin/2.jpg" /> " alt="">
								</div>
								<div class="notification_desc">
									<p>Lorem ipsum dolor amet</p>
									<p>
										<span>1 hour ago</span>
									</p>
								</div>
								<div class="clearfix"></div>
						</a></li>
						<li>
							<div class="notification_bottom">
								<a href="#">See all notifications</a>
							</div>
						</li>
					</ul></li>
			</ul>
			<div class="clearfix"></div>
		</div>
		<!--notification menu end -->
	</div>
	<div class="header-right">
		<div class="profile_details">
			<ul>
				<li class="dropdown profile_details_drop"><a href="#"
					class="dropdown-toggle" data-toggle="dropdown"
					aria-expanded="false">
						<div class="profile_img">
							<span class="prfil-img"><img
								src="<c:url value="/assets/images/admin/2.jpg" /> " alt="">
							</span>
							<div class="user-name">
								<p>Administrator</p>
							</div>
							<i class="fa fa-angle-down lnr"></i> <i
								class="fa fa-angle-up lnr"></i>
							<div class="clearfix"></div>
						</div>
				</a>
					<ul class="dropdown-menu drp-mnu">
						<li><a href="${context}/logout"><i class="fa fa-sign-out"></i> Logout</a></li>
					</ul></li>
			</ul>
		</div>
		<div class="clearfix"></div>
	</div>
	<div class="clearfix"></div>
</div>
