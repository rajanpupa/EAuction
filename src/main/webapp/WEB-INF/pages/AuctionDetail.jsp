<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE HTML>
<html>
<head>
	<title>Add Product Form</title>
	<script type="text/javascript" src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
	<script type="text/javascript" src="/public/script/auctiondetail.js" ></script>
	<link rel="stylesheet" type="text/css" href="/public/style/main.css" />
</head>
<body>
	<div id="container">
		<div id="navigation">This is the Page Header.</div>
		<hr />

		<div id="body">
			<strong>Auction Detail Page</strong>

			<p>This page contains the details of only one auction.</p>

			<div id='AuctionDetail'>
				<div class="detail-image">
					<img alt="${auction.title }" src="/public/image/medium/${auction.id }.PNG">
				</div>
				<h3>${auction.title }</h3>
				<p>${auction.description }</p>
				
				<form id="biddingform" method="post" action="/makebid"  >
					<input type="hidden" name="auctionId" value="${auction.id }" />
					<p>
					Bid Amount: ${auction.maxBidAmount }
					<input name="bidAmount" />
					<input id="bidbutton" type="submit"  value="Make a Bid" />
					</p>
				</form>
			</div>

		</div>

		<aside>Side bar</aside>

		<div id="footer">Footer Area</div>
	</div>
</body>
</html>
