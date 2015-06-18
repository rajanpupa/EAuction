<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<div id="dropDowns">
	<form name="searchform" id="searchform" method="post" action="/search">
		<form:select id="category" name="categories" path="categories">
			<form:option value="All">All</form:option>
			<c:forEach items="${categories }" var="category">
				<option value="${category.id }">${category.name }</option>
			</c:forEach>
		</form:select>
		<input type="text" placeholder="Search Item" /> <input type="submit"
			value="Search" />
	</form>
</div>
<security:authorize access="isAnonymous()">
	<p>
		<a href="/spring_security_login"> Login </a>
	</p>
</security:authorize>
<security:authorize access="isAuthenticated()">
	<div id="navigation"><jsp:include
			page="/WEB-INF/pages/common/settings1.jsp"></jsp:include>
		<a href="<c:url value="j_spring_security_logout" />"> Logout</a>
	</div>
</security:authorize>
<hr />
<!-- end of headingoptions -->