<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>	

<!DOCTYPE HTML>
<html>
<head>
	<title>My DashBoard</title>
	<style type="text/css">@import url(css/main.css);</style>
</head>
<body>

<div id = "profile">

<c:set var= "username" >
<security:authentication property="principal.username" />
</c:set>

<p>${fn:toUpperCase(username)}'s DashBoard	<a href="<c:url value="j_spring_security_logout" />"> Logout</a></p>
 
</div>

 <div>
 
 <p><a href= "/user/createAuction"> Create an auction </a> </p>
 <p><a href= "wishlist"> ${fn:toUpperCase(username)}'s WishList </a> </p>
 <p><a href= "Bids"> ${fn:toUpperCase(username)}'s Bids </a> </p>
  <p><a href= "Auctions"> ${fn:toUpperCase(username)}'s Auctions </a> </p>

 </div>

</body>
</html>
