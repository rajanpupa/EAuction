<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>Add Product Form</title>
	<link rel="stylesheet" type="text/css" href="/public/style/main.css" />
</head>
<body>
	<div id="container">
		<div id="navigation">This is the Page Header.</div>
		<hr />

		<div id="body">
			<p>Welcome to Welcome page.</p>

			<p>This page is supposed to have all the auctions created. User
				need not be logged in to view this page.</p>

			<div>
				<div id="auctions" >
					<c:forEach var="auction" items="${auctions }">
						<spring:url value="auctionDetail/{auctionid}" var="detailUrl">
							<spring:param name="auctionid" value="${auction.id }"/>
						</spring:url>
						<div class="auction" >
							<a href="${detailUrl }"><p>${auction.title }</p></a>
							<p>${auction.description }</p>
							<span class="price">${auction.maxBidAmount }</span>
						</div>
					</c:forEach>
					
				</div>
				
				<br/>
			</div>
			<br/>
			<hr/>

		</div>

		<aside>Side bar</aside>

		<div id="footer">Footer Area</div>
	</div>
</body>
</html>
