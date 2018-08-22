<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld"%>

<link href="<c:url value ="/assets/css/admin/css/admin-subject.css" />"
	rel='stylesheet' type='text/css' />

<c:set var="context" value="${pageContext.request.contextPath}" />

<div class="student-page">
	<div class="row">
		<div class="title-search">
			<h1>List of search results subject</h1>
		</div>
	</div>
	<div class="row">
		<div class="show-keyword">
			<h2>Search results with keyword: <span>${keyword}</span></h2>
		</div>
	</div>
	<c:if test="${not empty searchResults}">
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
				<c:forEach items="${searchResults}" var="sub" varStatus="itr">
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
			<tag:paginate offset="${offset}" total="${totalSubject}"
				uri="${context}/adminSubject" next="&raquo;" previous="&laquo;" />
		</div>
	</c:if>
	<c:if test="${empty searchResults}">
		<div class="not-found">
			<h3>Not Found</h3>
		</div>
	</c:if>
</div>
