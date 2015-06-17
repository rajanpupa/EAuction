<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>

<!DOCTYPE HTML>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Welcome page</title>
<link rel="stylesheet" type="text/css" href="/public/style/main.css" />
</head>
<body>
	<div id="container">
		<security:authorize access="isAuthenticated()">
			<div id="navigation"><jsp:include
					page="/WEB-INF/pages/common/settings1.jsp"></jsp:include>
			
		</security:authorize>
		<hr />

		<div id="body">
			<security:authorize access="isAuthenticated()">
			<p>Welcome : <security:authentication property="principal.username" />	<a href="<c:url value="j_spring_security_logout" />"> Logout</a></p>
					</security:authorize>


			<security:authorize access="isAuthenticated()">
				<div id="dropDowns">

					<form name="searchform" id="searchform" method="post"
						action="/search">
						<form:select id="category" name="categories" path="categories">
							<form:option value="All">All</form:option>
							<c:forEach items="${categories }" var="category">
								<option value="${category.id }">${category.name }</option>
							</c:forEach>
						</form:select>
						<input type="text" placeholder="Search Item" /> <input
							type="submit" value="Search" />

						<!--  <select id = "category" name = "category">
	                <option value="My Dashboard">My Dashboard</option>
	                <option value="FAQ">FAQ</option>
				</select> -->
					</form>




					<p>This is the dropdown. You should be authorized to see this.</p>
				</div>

			</security:authorize>

			<%-- 	<p><c:url value="/spring_security_login" var="logoutUrl" /> </p>
			 --%>

			<security:authorize access="isAnonymous()">
				<p>
					<a href="/spring_security_login"> Login </a>
				</p>
			</security:authorize>

			<p>This page is supposed to have all the auctions created. User
				need not be logged in to view this page.</p>

			<div>
				<div id="auctions">
					<c:forEach var="auction" items="${auctions }">
						<spring:url value="auctionDetail/{auctionid}" var="detailUrl">
							<spring:param name="auctionid" value="${auction.id }" />
						</spring:url>
						<div class="auction">
							<a href="${detailUrl }"><p>${auction.title }</p></a>
							<p>${auction.description }</p>
							<span class="price">${auction.maxBidAmount }</span>
						</div>
					</c:forEach>

				</div>

				<br />
			</div>
			<br />
			<hr />

		</div>

		<aside>Side bar</aside>

		<div id="footer">Footer Area</div>
	</div>
</body>
</html>
