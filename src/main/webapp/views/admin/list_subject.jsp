<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="tag" uri="/WEB-INF/taglibs/customTaglib.tld"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<link href="<c:url value ="/assets/css/admin/css/admin-subject.css" />"
	rel='stylesheet' type='text/css' />

<c:set var="context" value="${pageContext.request.contextPath}" />

<div class="student-page">
	<div class="row">
		<div>
			<h2>List Subjects</h2>
		</div>
	</div>
	<div class="row">
		<!--search-box-->
		<div class="search-box-custom">
			<form action="${context}/searchResults" method="POST">
				<div class="search-box">
					<input class="sb-search-input input__field--madoka" name="keyword"
						placeholder="Search..." type="search" id="input-31" /> 
					<label class="input__label" for="input-31"> 
						<svg class="graphic" width="100%" height="100%" 
							viewBox="0 0 404 77"
							preserveAspectRatio="none">
							<path d="m0,0l404,0l0,77l-404,0l0,-77z" />
						</svg>
					</label>
				</div>
				<div class="search-button">
					<button type="submit" class="btn btn-success btn-lg">Search</button>
				</div>
			</form>
		</div>
		<!--//end-search-box-->
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
		<tag:paginate offset="${offset}" total="${totalSubject}"
			uri="${context}/adminSubject" next="&raquo;" previous="&laquo;" />
	</div>
</div>
