<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>
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
			
			
			<security:authorize access="isAuthenticated()">
			<div id = "dropDowns">
			
		 <form name="searchform" id="searchform" method="get" action="/search"  >
			 <select id = "category" name = "category">
                <option value="volvo">Volvo</option>
                <option value="saab">Saab</option>
  				<option value="mercedes">Mercedes</option>
 			    <option value="audi">Audi</option>
			</select>
			  <input type = "text" placeholder = "Search Item"/>
			   <input type="submit"  value="Search" />
			   
			    <select id = "category" name = "category">
                <option value="volvo">Volvo</option>
                <option value="saab">Saab</option>
  				<option value="mercedes">Mercedes</option>
 			    <option value="audi">Audi</option>
			</select>
		  </form>
			

			
			 <p>This is the dropdown. You should be authorized to see this.</p>
			</div>
			<p> <a href="<c:url value="j_spring_security_logout" />" > Logout</a> </p>
			</security:authorize>
			
		<%-- 	<p><c:url value="/spring_security_login" var="logoutUrl" /> </p>
			 --%>
			 
			 <security:authorize access="isAnonymous()">
			<p><a href="/spring_security_login"> Login </a> </p>
			</security:authorize>

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
