<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<div id="navigation">This is the Page Header.</div>
<hr />

<div id="body">

	<div id='AuctionDetail'>
		<div class="detail-image">
			<img alt="${auction.title }"
				src="/public/image/medium/${auction.id }.PNG">
		</div>
		<h3>${auction.title }</h3>
		<p>${auction.description }</p>

		<form:form modelAttribute="bid" id="biddingform" method="post"
			action="/makebid">
			<form:input type="hidden" path="auctionId"></form:input>
					Bid Amount: <span id="maxBid">$ ${auction.maxBidAmount }</span>
			<form:input type="text" path="bidAmount"></form:input>
			<security:authorize access="isAuthenticated()">
				<input type="submit" value="Make a Bid" />
			</security:authorize>
			<security:authorize access="isAnonymous()">
				<a href="/spring_security_login"> Login to make a bid </a>
			</security:authorize>
		</form:form>
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

<aside>Side bar</aside>

<div id="footer">Footer Area</div>
