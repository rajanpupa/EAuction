<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>


<div id="body">

	<div id='AuctionDetail'>
		<div class="detail-image">
			<img alt="${auction.title }"
				src="/public/image/medium/${auction.id }.PNG">
		</div>
		<h3>${auction.title }</h3>
		<p>${auction.description }</p>

		<form:form modelAttribute="bid" id="biddingform" method="POST" action="/user/makebid">
			<form:input type="hidden" path="username"></form:input>
			<form:input type="hidden" path="auctionId"></form:input>
					Bid Amount: 
					<span id="maxBid">
					<c:if test="${maxBid eq null }">There are no bids yet.</c:if>
					<c:if test="${maxBid ne null }">$${maxBid.bidAmount }</c:if>
					</span>
			<form:input type="text" path="bidAmount"></form:input>
			<security:authorize access="isAuthenticated()">
				<input id="makeBid" type="submit" value="Make a Bid" />
			</security:authorize>
			<security:authorize access="isAnonymous()">
				<a href="/spring_security_login"> Login to make a bid </a>
			</security:authorize>
		</form:form>
		<script src="/public/script/auctiondetail.js"></script>
		<div id="startDate">
			<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss"
				value="${auction.createdDate}" />
		</div>
		<div id="endDate">
			<fmt:formatDate pattern="yyyy-MM-dd HH:mm:ss"
				value="${auction.endDate}" />
		</div>
	</div>
</div>
