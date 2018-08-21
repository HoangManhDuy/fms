<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld" %>

<link href="<c:url value ="/assets/css/admin/css/admin-subject.css" />"
	rel='stylesheet' type='text/css' />

<div class="student-page">
	<div class="row">
		<div>
			<h2>List Subjects</h2>
		</div>
	</div>
	<div class="row">
		<table class="table table-hover table-dark">
			<thead class="bg-primary">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Code Subject</th>
					<th scope="col">Name</th>
					<th scope="col">Teacher</th>
				</tr>
			</thead>
				<c:forEach items="${subjects}" var="sub" varStatus="itr">
					<tr>
						<th scope="row">${offset + itr.index +1}</th>
						<td>${sub.codeSubject}</td>
						<td>${sub.name}</td>
						<td>${sub.teacher}</td>
					</tr>
				</c:forEach>
			<tbody>
			</tbody>
		</table>
	</div>
	<div class="row">
		<tag:paginate offset="${offset}" total="${totalSubject}" uri="/springmvc/adminSubject" next="&raquo;" previous="&laquo;"/>
	</div>
</div>
