<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link
	href="<c:url value ="/assets/css/admin/css/admin-home-custom.css" />"
	rel='stylesheet' type='text/css' />

<div class="main-page">
	<div class="body-custom">
		<div class="row">
			<div class="col_3">
				<div class="col-md-3 widget widget1">
					<div class="r3_counter_box">
						<a href="adminSubject"> 
							<i class="pull-left fa fa-suitcase user2 icon-rounded"></i>
							<div class="stats">
								<h5>
									<strong> <c:if test="${empty subject}">
										0
									</c:if> <c:if test="${not empty subject}">
										${subject.size()}
									</c:if>
									</strong>
								</h5>
								<span>Total Subjects</span>
							</div>
						</a>
					</div>
				</div>
				<div class="col-md-3 widget widget1">
					<div class="r3_counter_box">
						<i class="pull-left fa fa-calendar dollar1 icon-rounded"></i>
						<div class="stats">
							<h5>
								<strong> <c:if test="${empty room}">
										0
									</c:if> <c:if test="${not empty room}">
										${room.size()}
									</c:if>
								</strong>
							</h5>
							<span>Total Rooms</span>
						</div>
					</div>
				</div>
				<div class="col-md-3 widget">
					<div class="r3_counter_box">
						<i class="pull-left fa fa-users dollar2 icon-rounded"></i>
						<div class="stats">
							<h5>
								<strong> <c:if test="${empty student}">
										0
									</c:if> <c:if test="${not empty student}">
										${student.size()}
									</c:if>
								</strong>
							</h5>
							<span>Total Students</span>
						</div>
					</div>
				</div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
</div>
