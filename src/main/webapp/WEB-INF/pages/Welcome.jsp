<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<div id="body">
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
