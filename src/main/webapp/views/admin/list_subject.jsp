<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<link href="<c:url value ="/assets/css/admin/css/admin-subject.css" />"
	rel='stylesheet' type='text/css' />

<div class="student-page">
	<div class="row">
		<div>
			<h2>List Subject</h2>
		</div>
	</div>
	<div class="row">
		<table class="table table-hover table-dark">
			<thead class="bg-primary">
				<tr>
					<th scope="col">#</th>
					<th scope="col">Code Subject</th>
					<th scope="col">Name</th>
				</tr>
			</thead>
				<c:forEach items="${subject}" var="sub" varStatus="count">
					<tr>
						<th scope="row">${count.index + 1}</th>
						<td>${sub.codeSubject}</td>
						<td>${sub.name}</td>
					</tr>
				</c:forEach>
			<tbody>
			</tbody>
		</table>
	</div>
</div>